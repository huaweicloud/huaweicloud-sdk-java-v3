package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 受体文件
 */
public class ReceptorDrugFileReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private DrugFileSource source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_hydrogen")

    private Boolean addHydrogen;

    public ReceptorDrugFileReq withSource(DrugFileSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    public DrugFileSource getSource() {
        return source;
    }

    public void setSource(DrugFileSource source) {
        this.source = source;
    }

    public ReceptorDrugFileReq withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 文件URL，当数据源为外部网络数据时为https地址；用户私有数据中心为项目路径、公共数据场景为obs地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ReceptorDrugFileReq withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 文件格式，仅支持PDB，仅数据源为RAW时提供
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ReceptorDrugFileReq withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 文件原始数据，仅数据源为RAW时提供
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ReceptorDrugFileReq withAddHydrogen(Boolean addHydrogen) {
        this.addHydrogen = addHydrogen;
        return this;
    }

    /**
     * 增加氢原子
     * @return addHydrogen
     */
    public Boolean getAddHydrogen() {
        return addHydrogen;
    }

    public void setAddHydrogen(Boolean addHydrogen) {
        this.addHydrogen = addHydrogen;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReceptorDrugFileReq that = (ReceptorDrugFileReq) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.url, that.url)
            && Objects.equals(this.format, that.format) && Objects.equals(this.data, that.data)
            && Objects.equals(this.addHydrogen, that.addHydrogen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, url, format, data, addHydrogen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReceptorDrugFileReq {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    addHydrogen: ").append(toIndentedString(addHydrogen)).append("\n");
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
