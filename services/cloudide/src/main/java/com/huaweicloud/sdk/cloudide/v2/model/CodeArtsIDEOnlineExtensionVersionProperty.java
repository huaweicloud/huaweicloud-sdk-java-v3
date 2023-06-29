package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * CodeArtsIDEOnlineExtensionVersionProperty
 */
public class CodeArtsIDEOnlineExtensionVersionProperty {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_name")

    private String propertyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_value")

    private String propertyValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_version_id")

    private String extensionVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public CodeArtsIDEOnlineExtensionVersionProperty withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * minimum: 0
     * maximum: 10000
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CodeArtsIDEOnlineExtensionVersionProperty withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * 参数名
     * @return propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public CodeArtsIDEOnlineExtensionVersionProperty withPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
        return this;
    }

    /**
     * 参数值
     * @return propertyValue
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public CodeArtsIDEOnlineExtensionVersionProperty withExtensionVersionId(String extensionVersionId) {
        this.extensionVersionId = extensionVersionId;
        return this;
    }

    /**
     * 插件版本id
     * @return extensionVersionId
     */
    public String getExtensionVersionId() {
        return extensionVersionId;
    }

    public void setExtensionVersionId(String extensionVersionId) {
        this.extensionVersionId = extensionVersionId;
    }

    public CodeArtsIDEOnlineExtensionVersionProperty withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CodeArtsIDEOnlineExtensionVersionProperty withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CodeArtsIDEOnlineExtensionVersionProperty that = (CodeArtsIDEOnlineExtensionVersionProperty) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.propertyName, that.propertyName)
            && Objects.equals(this.propertyValue, that.propertyValue)
            && Objects.equals(this.extensionVersionId, that.extensionVersionId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, propertyName, propertyValue, extensionVersionId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeArtsIDEOnlineExtensionVersionProperty {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
        sb.append("    extensionVersionId: ").append(toIndentedString(extensionVersionId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
