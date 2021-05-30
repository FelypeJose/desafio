package br.com.desafio.dto;

import io.swagger.annotations.ApiModelProperty;

public class DesafioRequestDTO {

    @ApiModelProperty(example = "44332211", required = true, dataType = "integer", position = 1)
    private Integer logic;

    @ApiModelProperty(example = "123", required = true, dataType = "string", position = 2)
    private String serial;

    @ApiModelProperty(example = "PWWIN", required = true, dataType = "string", position = 3)
    private String model;

    @ApiModelProperty(example = "0", dataType = "integer", position = 4)
    private Integer sam;

    @ApiModelProperty(example = "F04A2E4088B", dataType = "string", position = 5)
    private String ptid;

    @ApiModelProperty(example = "4", dataType = "integer", position = 6)
    private Integer plat;

    @ApiModelProperty(example = "8.00b3", dataType = "string", required = true, position = 7)
    private String version;

    @ApiModelProperty(example = "0", dataType = "integer", position = 8)
    private Integer mxr;

    @ApiModelProperty(example = "16777216", dataType = "integer", position = 9)
    private Integer mxf;

    @ApiModelProperty(example = "PWWIN", dataType = "string", position = 10)
    private String verfm;

    public Integer getLogic() {
        return logic;
    }

    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSam() {
        return sam;
    }

    public void setSam(Integer sam) {
        this.sam = sam;
    }

    public String getPtid() {
        return ptid;
    }

    public void setPtid(String ptid) {
        this.ptid = ptid;
    }

    public Integer getPlat() {
        return plat;
    }

    public void setPlat(Integer plat) {
        this.plat = plat;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getMxr() {
        return mxr;
    }

    public void setMxr(Integer mxr) {
        this.mxr = mxr;
    }

    public Integer getMxf() {
        return mxf;
    }

    public void setMxf(Integer mxf) {
        this.mxf = mxf;
    }

    public String getVerfm() {
        return verfm;
    }

    public void setVerfm(String verfm) {
        this.verfm = verfm;
    }
}
