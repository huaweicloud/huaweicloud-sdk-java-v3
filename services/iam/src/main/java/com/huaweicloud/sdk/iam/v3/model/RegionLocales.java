package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class RegionLocales {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh-cn")

    @JacksonXmlProperty(localName = "zh-cn")

    private String zhCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en-us")

    @JacksonXmlProperty(localName = "en-us")

    private String enUs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pt-br")

    @JacksonXmlProperty(localName = "pt-br")

    private String ptBr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "es-us")

    @JacksonXmlProperty(localName = "es-us")

    private String esUs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "es-es")

    @JacksonXmlProperty(localName = "es-es")

    private String esEs;

    public RegionLocales withZhCn(String zhCn) {
        this.zhCn = zhCn;
        return this;
    }

    /**
     * 区域的中文名称。
     * @return zhCn
     */
    public String getZhCn() {
        return zhCn;
    }

    public void setZhCn(String zhCn) {
        this.zhCn = zhCn;
    }

    public RegionLocales withEnUs(String enUs) {
        this.enUs = enUs;
        return this;
    }

    /**
     * 区域的英文名称。
     * @return enUs
     */
    public String getEnUs() {
        return enUs;
    }

    public void setEnUs(String enUs) {
        this.enUs = enUs;
    }

    public RegionLocales withPtBr(String ptBr) {
        this.ptBr = ptBr;
        return this;
    }

    /**
     * 区域的葡萄牙语名称。
     * @return ptBr
     */
    public String getPtBr() {
        return ptBr;
    }

    public void setPtBr(String ptBr) {
        this.ptBr = ptBr;
    }

    public RegionLocales withEsUs(String esUs) {
        this.esUs = esUs;
        return this;
    }

    /**
     * 区域的美国西班牙语名称。
     * @return esUs
     */
    public String getEsUs() {
        return esUs;
    }

    public void setEsUs(String esUs) {
        this.esUs = esUs;
    }

    public RegionLocales withEsEs(String esEs) {
        this.esEs = esEs;
        return this;
    }

    /**
     * 区域的西班牙语名称。
     * @return esEs
     */
    public String getEsEs() {
        return esEs;
    }

    public void setEsEs(String esEs) {
        this.esEs = esEs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegionLocales regionLocales = (RegionLocales) o;
        return Objects.equals(this.zhCn, regionLocales.zhCn) && Objects.equals(this.enUs, regionLocales.enUs)
            && Objects.equals(this.ptBr, regionLocales.ptBr) && Objects.equals(this.esUs, regionLocales.esUs)
            && Objects.equals(this.esEs, regionLocales.esEs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zhCn, enUs, ptBr, esUs, esEs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionLocales {\n");
        sb.append("    zhCn: ").append(toIndentedString(zhCn)).append("\n");
        sb.append("    enUs: ").append(toIndentedString(enUs)).append("\n");
        sb.append("    ptBr: ").append(toIndentedString(ptBr)).append("\n");
        sb.append("    esUs: ").append(toIndentedString(esUs)).append("\n");
        sb.append("    esEs: ").append(toIndentedString(esEs)).append("\n");
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
