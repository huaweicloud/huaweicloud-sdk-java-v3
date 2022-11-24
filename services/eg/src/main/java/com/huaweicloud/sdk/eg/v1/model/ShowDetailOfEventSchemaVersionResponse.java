package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDetailOfEventSchemaVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_id")

    private String schemaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sample")

    private String dataSample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private String definition;

    public ShowDetailOfEventSchemaVersionResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件模型版本ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDetailOfEventSchemaVersionResponse withSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }

    /**
     * 事件模型ID
     * @return schemaId
     */
    public String getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public ShowDetailOfEventSchemaVersionResponse withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 事件模型版本号
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ShowDetailOfEventSchemaVersionResponse withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 事件模型格式
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ShowDetailOfEventSchemaVersionResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ShowDetailOfEventSchemaVersionResponse withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ShowDetailOfEventSchemaVersionResponse withDataSample(String dataSample) {
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

    public ShowDetailOfEventSchemaVersionResponse withDefinition(String definition) {
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
        ShowDetailOfEventSchemaVersionResponse showDetailOfEventSchemaVersionResponse =
            (ShowDetailOfEventSchemaVersionResponse) o;
        return Objects.equals(this.id, showDetailOfEventSchemaVersionResponse.id)
            && Objects.equals(this.schemaId, showDetailOfEventSchemaVersionResponse.schemaId)
            && Objects.equals(this.version, showDetailOfEventSchemaVersionResponse.version)
            && Objects.equals(this.format, showDetailOfEventSchemaVersionResponse.format)
            && Objects.equals(this.createdTime, showDetailOfEventSchemaVersionResponse.createdTime)
            && Objects.equals(this.updatedTime, showDetailOfEventSchemaVersionResponse.updatedTime)
            && Objects.equals(this.dataSample, showDetailOfEventSchemaVersionResponse.dataSample)
            && Objects.equals(this.definition, showDetailOfEventSchemaVersionResponse.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, schemaId, version, format, createdTime, updatedTime, dataSample, definition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailOfEventSchemaVersionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
