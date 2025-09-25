package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模板配体文件，仅引擎为SIMILAR_DOCKING时提供。
 */
public class ReferenceLigandFile {

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

    public ReferenceLigandFile withSource(DrugFileSource source) {
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

    public ReferenceLigandFile withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**： 文件URL。 **约束限制**： 当数据源source为外部网络数据时为https地址，为用户私有数据中心时为空间路径，为公共数据场景时为obs地址。 **取值范围**： 文件URL仅支持以.pdb、.sdf、.mol2、.smi、.csv结尾，长度为[1-2000]个字符。 **默认取值**： 不涉及 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ReferenceLigandFile withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * **参数解释**： 文件格式。 **约束限制**： 仅数据源source为RAW时提供。 **取值范围**： - PDB - SDF - MOL2 - SMI - CSV **默认取值**： 不涉及 
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ReferenceLigandFile withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * **参数解释**： 文件原始数据。 **约束限制**： 仅数据源source为RAW时提供。 **取值范围**： 长度为[0-10000000]个字符。 **默认取值**： 不涉及 
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
        ReferenceLigandFile that = (ReferenceLigandFile) obj;
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
        sb.append("class ReferenceLigandFile {\n");
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
