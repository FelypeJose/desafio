package br.com.desafio.api;

import br.com.desafio.dto.DesafioRequestDTO;
import br.com.desafio.model.DesafioEntity;
import br.com.desafio.service.DesafioService;
import com.google.gson.Gson;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/api/desafio")
@RestController
public class DesafioApiController {

    @Autowired
    private DesafioService service;

    @PostMapping(value = "",
            consumes = MediaType.TEXT_HTML_VALUE + ";charset=UTF-8",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Endpoint que insere o registro informado no desafio")
    public DesafioEntity gravarDesafio(@RequestBody @Validated String request) {
        String[] requisicao = request.split(";");
        DesafioRequestDTO dto = this.montarDadosRequisicao(requisicao);
        return this.service.gravarDesafio(dto);
    }

    @GetMapping(value = "")
    @ApiOperation(value = "Endpoint que recupera todos os registros inseridos")
    public List<DesafioEntity> recuperarTodosDados() {
        return this.service.recuperarTodosDados();
    }

    @GetMapping(value = "/version/{version}/model/{model}/logic/{logic}")
    @ApiOperation(value = "Endpoint que recupera o registro através dos parâmetros informados no path da requisição")
    public DesafioEntity recuperarDadosPorParametros(@PathVariable("version") String version,
                                                     @PathVariable("model") String model,
                                                     @PathVariable("logic") Integer logic) {
        return this.service.recuperarDadosPorParametros(version, model, logic);
    }

    @PutMapping(value = "/version/{version}/model/{model}/logic/{logic}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Endpoint que altera o registro através dos parâmetros informados no path da requisição")
    public DesafioEntity alterarDados(@PathVariable("version") String version,
                                      @PathVariable("model") String model,
                                      @PathVariable("logic") Integer logic,
                                      @RequestBody @Validated DesafioRequestDTO dto) {
        return this.service.alterarDados(version, model, logic, dto);
    }

    private DesafioRequestDTO montarDadosRequisicao(String[] requisicao) {
        DesafioRequestDTO dto = new DesafioRequestDTO();
        dto.setLogic(Integer.valueOf(requisicao[0]));
        dto.setSerial(requisicao[1]);
        dto.setModel(requisicao[2]);
        dto.setSam(Integer.valueOf(requisicao[3]));
        dto.setPtid(requisicao[4]);
        dto.setPlat(Integer.valueOf(requisicao[5]));
        dto.setVersion(requisicao[6]);
        dto.setMxr(Integer.valueOf(requisicao[7]));
        dto.setMxf(Integer.valueOf(requisicao[8]));
        dto.setVerfm(requisicao[9]);
        return dto;
    }
}
