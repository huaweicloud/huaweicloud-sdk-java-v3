package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CPI受体
 */
public class CpiReceptor {

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
    @JsonProperty(value = "fasta_count")

    private Integer fastaCount;

    public CpiReceptor withSource(DrugFileSource source) {
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

    public CpiReceptor withUrl(String url) {
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

    public CpiReceptor withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 文件格式，仅支持FASTA，仅数据源为RAW时提供
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public CpiReceptor withData(String data) {
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

    public CpiReceptor withFastaCount(Integer fastaCount) {
        this.fastaCount = fastaCount;
        return this;
    }

    /**
     * fasta文件中氨基酸数量
     * minimum: 1
     * maximum: 100
     * @return fastaCount
     */
    public Integer getFastaCount() {
        return fastaCount;
    }

    public void setFastaCount(Integer fastaCount) {
        this.fastaCount = fastaCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CpiReceptor that = (CpiReceptor) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.url, that.url)
            && Objects.equals(this.format, that.format) && Objects.equals(this.data, that.data)
            && Objects.equals(this.fastaCount, that.fastaCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, url, format, data, fastaCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CpiReceptor {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    fastaCount: ").append(toIndentedString(fastaCount)).append("\n");
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
