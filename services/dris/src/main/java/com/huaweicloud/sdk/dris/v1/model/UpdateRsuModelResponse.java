package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateRsuModelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsu_model_id")

    private String rsuModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer_name")

    private String manufacturerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private OffsetDateTime lastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    public UpdateRsuModelResponse withRsuModelId(String rsuModelId) {
        this.rsuModelId = rsuModelId;
        return this;
    }

    /**
     * **参数说明**：RSU型号ID，用于唯一标识一个RSU型号，在平台创建RSU型号后由平台分配获得。  **取值范围**：长度不小于1不超过36，只允许字母、数字、连接符（-）的组合。
     * @return rsuModelId
     */
    public String getRsuModelId() {
        return rsuModelId;
    }

    public void setRsuModelId(String rsuModelId) {
        this.rsuModelId = rsuModelId;
    }

    public UpdateRsuModelResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**: RSU型号名称。  **取值范围**：长度不低于1不超过64，只允许中文、字母、数字、下划线（_）、问号（?）、反引号（'）、井号（#）、左小括号（(）、右小括号（)）、点（.）、逗号（,）、与（&）、百分号（%）、At（@）、感叹号（!）、连接符（-）的组合。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRsuModelResponse withManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
        return this;
    }

    /**
     * **参数说明**: RSU的厂商名称。  **取值范围**：长度不低于1不超过32，只允许中文、字母、数字、下划线（_）、问号（?）、反引号（'）、井号（#）、左小括号（(）、右小括号（)）、点（.）、逗号（,）、与（&）、百分号（%）、At（@）、感叹号（!）、连接符（-）的组合。
     * @return manufacturerName
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public UpdateRsuModelResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**: RSU型号的描述信息。  **取值范围**：长度不低于1不超过128，只允许中文、字母、数字、下划线（_）、问号（?）、反引号（'）、井号（#）、左小括号（(）、右小括号（)）、点（.）、逗号（,）、与（&）、百分号（%）、At（@）、感叹号（!）、连接符（-）的组合。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRsuModelResponse withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * **参数说明**: RSU型号更新的时间。  格式：yyyy-MM-dd'T'HH:mm:ss'Z'  例如：2020-12-07T01:32:17Z
     * @return lastModifiedTime
     */
    public OffsetDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public UpdateRsuModelResponse withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数说明**: 在平台创建RSU型号的时间。  格式：yyyy-MM-dd'T'HH:mm:ss'Z'  例如：2020-12-07T01:32:17Z
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRsuModelResponse updateRsuModelResponse = (UpdateRsuModelResponse) o;
        return Objects.equals(this.rsuModelId, updateRsuModelResponse.rsuModelId)
            && Objects.equals(this.name, updateRsuModelResponse.name)
            && Objects.equals(this.manufacturerName, updateRsuModelResponse.manufacturerName)
            && Objects.equals(this.description, updateRsuModelResponse.description)
            && Objects.equals(this.lastModifiedTime, updateRsuModelResponse.lastModifiedTime)
            && Objects.equals(this.createdTime, updateRsuModelResponse.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rsuModelId, name, manufacturerName, description, lastModifiedTime, createdTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRsuModelResponse {\n");
        sb.append("    rsuModelId: ").append(toIndentedString(rsuModelId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    manufacturerName: ").append(toIndentedString(manufacturerName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
