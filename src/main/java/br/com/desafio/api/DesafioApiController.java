package br.com.desafio.api;

import br.com.desafio.dto.DesafioRequestDTO;
import br.com.desafio.service.DesafioService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("/api/desafio")
public class DesafioApiController {

    @Autowired
    private DesafioService service;

    @PostMapping(path = "",
            consumes = MediaType.TEXT_HTML_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiOperation(value = "Endpoint que insere o registro informado no desafio")
    public void gravarDesafio(@Valid @RequestBody DesafioRequestDTO desafioRequestDTO) {
        service.gravarDesafio(desafioRequestDTO);
    }
}
