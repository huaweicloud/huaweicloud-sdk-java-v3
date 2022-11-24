package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomizeSchemaVersionCreateReq
 */
public class CustomizeSchemaVersionCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sample")

    private String dataSample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private String definition;

    public CustomizeSchemaVersionCreateReq withDataSample(String dataSample) {
        this.dataSample = dataSample;
        return this;
    }

    /**
     * 事件示例
     * @return dataSample
     */
    public String getDataSample() {
        return dataSample;
    }

    public void setDataSample(String dataSample) {
        this.dataSample = dataSample;
    }

    public CustomizeSchemaVersionCreateReq withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * 事件模型内容定义
     * @return definition
     */
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomizeSchemaVersionCreateReq customizeSchemaVersionCreateReq = (CustomizeSchemaVersionCreateReq) o;
        return Objects.equals(this.dataSample, customizeSchemaVersionCreateReq.dataSample)
            && Objects.equals(this.definition, customizeSchemaVersionCreateReq.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSample, definition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizeSchemaVersionCreateReq {\n");
        sb.append("    dataSample: ").append(toIndentedString(dataSample)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
