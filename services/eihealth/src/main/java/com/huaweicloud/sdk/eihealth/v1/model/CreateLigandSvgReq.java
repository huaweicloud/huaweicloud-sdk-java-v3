package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 生成svg请求体
 */
public class CreateLigandSvgReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alerts")

    private String alerts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ncols")

    private Integer ncols;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgopacity")

    private Float bgopacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgcolor")

    private String bgcolor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fgcolor")

    private String fgcolor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccolor")

    private String ccolor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ncolor")

    private String ncolor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocolor")

    private String ocolor;

    public CreateLigandSvgReq withSmiles(String smiles) {
        this.smiles = smiles;
        return this;
    }

    /**
     * 分子SMILES表达式
     * @return smiles
     */
    public String getSmiles() {
        return smiles;
    }

    public void setSmiles(String smiles) {
        this.smiles = smiles;
    }

    public CreateLigandSvgReq withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 尺寸
     * minimum: 0
     * maximum: 5000
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public CreateLigandSvgReq withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * svg高度
     * minimum: 0
     * maximum: 5000
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public CreateLigandSvgReq withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * svg宽度
     * minimum: 0
     * maximum: 5000
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public CreateLigandSvgReq withAlerts(String alerts) {
        this.alerts = alerts;
        return this;
    }

    /**
     * alerts
     * @return alerts
     */
    public String getAlerts() {
        return alerts;
    }

    public void setAlerts(String alerts) {
        this.alerts = alerts;
    }

    public CreateLigandSvgReq withNcols(Integer ncols) {
        this.ncols = ncols;
        return this;
    }

    /**
     * ncols
     * minimum: 0
     * maximum: 100000
     * @return ncols
     */
    public Integer getNcols() {
        return ncols;
    }

    public void setNcols(Integer ncols) {
        this.ncols = ncols;
    }

    public CreateLigandSvgReq withBgopacity(Float bgopacity) {
        this.bgopacity = bgopacity;
        return this;
    }

    /**
     * bgopacity
     * minimum: 0
     * maximum: 1
     * @return bgopacity
     */
    public Float getBgopacity() {
        return bgopacity;
    }

    public void setBgopacity(Float bgopacity) {
        this.bgopacity = bgopacity;
    }

    public CreateLigandSvgReq withBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
        return this;
    }

    /**
     * bgcolor
     * @return bgcolor
     */
    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    public CreateLigandSvgReq withFgcolor(String fgcolor) {
        this.fgcolor = fgcolor;
        return this;
    }

    /**
     * fgcolor
     * @return fgcolor
     */
    public String getFgcolor() {
        return fgcolor;
    }

    public void setFgcolor(String fgcolor) {
        this.fgcolor = fgcolor;
    }

    public CreateLigandSvgReq withCcolor(String ccolor) {
        this.ccolor = ccolor;
        return this;
    }

    /**
     * ccolor
     * @return ccolor
     */
    public String getCcolor() {
        return ccolor;
    }

    public void setCcolor(String ccolor) {
        this.ccolor = ccolor;
    }

    public CreateLigandSvgReq withNcolor(String ncolor) {
        this.ncolor = ncolor;
        return this;
    }

    /**
     * ncolor
     * @return ncolor
     */
    public String getNcolor() {
        return ncolor;
    }

    public void setNcolor(String ncolor) {
        this.ncolor = ncolor;
    }

    public CreateLigandSvgReq withOcolor(String ocolor) {
        this.ocolor = ocolor;
        return this;
    }

    /**
     * ocolor
     * @return ocolor
     */
    public String getOcolor() {
        return ocolor;
    }

    public void setOcolor(String ocolor) {
        this.ocolor = ocolor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLigandSvgReq that = (CreateLigandSvgReq) obj;
        return Objects.equals(this.smiles, that.smiles) && Objects.equals(this.size, that.size)
            && Objects.equals(this.height, that.height) && Objects.equals(this.width, that.width)
            && Objects.equals(this.alerts, that.alerts) && Objects.equals(this.ncols, that.ncols)
            && Objects.equals(this.bgopacity, that.bgopacity) && Objects.equals(this.bgcolor, that.bgcolor)
            && Objects.equals(this.fgcolor, that.fgcolor) && Objects.equals(this.ccolor, that.ccolor)
            && Objects.equals(this.ncolor, that.ncolor) && Objects.equals(this.ocolor, that.ocolor);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(smiles, size, height, width, alerts, ncols, bgopacity, bgcolor, fgcolor, ccolor, ncolor, ocolor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLigandSvgReq {\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
        sb.append("    ncols: ").append(toIndentedString(ncols)).append("\n");
        sb.append("    bgopacity: ").append(toIndentedString(bgopacity)).append("\n");
        sb.append("    bgcolor: ").append(toIndentedString(bgcolor)).append("\n");
        sb.append("    fgcolor: ").append(toIndentedString(fgcolor)).append("\n");
        sb.append("    ccolor: ").append(toIndentedString(ccolor)).append("\n");
        sb.append("    ncolor: ").append(toIndentedString(ncolor)).append("\n");
        sb.append("    ocolor: ").append(toIndentedString(ocolor)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
