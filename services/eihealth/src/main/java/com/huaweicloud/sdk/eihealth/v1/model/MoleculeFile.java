package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MoleculeFile
 */
public class MoleculeFile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    public MoleculeFile withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 文件来源，支持用户私有数据中心、公共数据和源数据
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public MoleculeFile withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 文件URL，用户私有数据中心为项目路径、公共数据场景为obs地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MoleculeFile withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 文件格式，支持PDB、SDF、MOL2、SMI，仅数据源为RAW时提供
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public MoleculeFile withData(String data) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MoleculeFile that = (MoleculeFile) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.url, that.url)
            && Objects.equals(this.format, that.format) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, url, format, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoleculeFile {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
