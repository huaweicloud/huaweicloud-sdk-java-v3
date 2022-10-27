package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ModelConfiguration
 */
public class ModelConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operated_at")

    private OffsetDateTime operatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_activated")

    private Boolean isActivated;

    public ModelConfiguration withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 数据。
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ModelConfiguration withOperatedAt(OffsetDateTime operatedAt) {
        this.operatedAt = operatedAt;
        return this;
    }

    /**
     * 操作时间。
     * @return operatedAt
     */
    public OffsetDateTime getOperatedAt() {
        return operatedAt;
    }

    public void setOperatedAt(OffsetDateTime operatedAt) {
        this.operatedAt = operatedAt;
    }

    public ModelConfiguration withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * 操作id。
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public ModelConfiguration withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 配置类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ModelConfiguration withIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
        return this;
    }

    /**
     * 配置是否生效。
     * @return isActivated
     */
    public Boolean getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelConfiguration _configuration = (ModelConfiguration) o;
        return Objects.equals(this.data, _configuration.data)
            && Objects.equals(this.operatedAt, _configuration.operatedAt)
            && Objects.equals(this.operationId, _configuration.operationId)
            && Objects.equals(this.type, _configuration.type)
            && Objects.equals(this.isActivated, _configuration.isActivated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, operatedAt, operationId, type, isActivated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelConfiguration {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    operatedAt: ").append(toIndentedString(operatedAt)).append("\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isActivated: ").append(toIndentedString(isActivated)).append("\n");
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
