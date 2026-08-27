package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务应用对象名称信息
 */
public class TaskApplyObjectDetailInfo {

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
    @JsonProperty(value = "object_extra_id")

    private String objectExtraId;

    public TaskApplyObjectDetailInfo withObjectId(String objectId) {
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

    public TaskApplyObjectDetailInfo withObjectType(String objectType) {
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

    public TaskApplyObjectDetailInfo withObjectName(String objectName) {
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

    public TaskApplyObjectDetailInfo withObjectExtraId(String objectExtraId) {
        this.objectExtraId = objectExtraId;
        return this;
    }

    /**
     * 对象desktopId
     * @return objectExtraId
     */
    public String getObjectExtraId() {
        return objectExtraId;
    }

    public void setObjectExtraId(String objectExtraId) {
        this.objectExtraId = objectExtraId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskApplyObjectDetailInfo that = (TaskApplyObjectDetailInfo) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.objectType, that.objectType)
            && Objects.equals(this.objectName, that.objectName)
            && Objects.equals(this.objectExtraId, that.objectExtraId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, objectType, objectName, objectExtraId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskApplyObjectDetailInfo {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    objectExtraId: ").append(toIndentedString(objectExtraId)).append("\n");
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
