package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 应用对象名称信息
 */
public class ApplyObjectDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_domain")

    private String objectDomain;

    public ApplyObjectDetailInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApplyObjectDetailInfo withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 对象id
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public ApplyObjectDetailInfo withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public ApplyObjectDetailInfo withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 对象名称
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public ApplyObjectDetailInfo withObjectDomain(String objectDomain) {
        this.objectDomain = objectDomain;
        return this;
    }

    /**
     * 域名称（用户）
     * @return objectDomain
     */
    public String getObjectDomain() {
        return objectDomain;
    }

    public void setObjectDomain(String objectDomain) {
        this.objectDomain = objectDomain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyObjectDetailInfo that = (ApplyObjectDetailInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.objectType, that.objectType) && Objects.equals(this.objectName, that.objectName)
            && Objects.equals(this.objectDomain, that.objectDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, objectId, objectType, objectName, objectDomain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyObjectDetailInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    objectDomain: ").append(toIndentedString(objectDomain)).append("\n");
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
