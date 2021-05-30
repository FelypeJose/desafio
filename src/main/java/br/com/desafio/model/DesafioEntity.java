package br.com.desafio.model;

import javax.persistence.*;

@Entity
@Table(name = "desafio")
public class DesafioEntity {

    @Id
    @Column(name = "logic", nullable = false)
    private Integer logic;

    @Column(name = "serial", nullable = false)
    private String serial;

    @Column(name = "sam")
    private Integer sam;

    @Column(name = "ptid")
    private String ptid;

    @Column(name = "plat")
    private Integer plat;

    @Column(name = "version", nullable = false)
    private String version;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "mxr")
    private Integer mxr;

    @Column(name = "mxf")
    private Integer mxf;

    @Column(name = "verfm")
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
