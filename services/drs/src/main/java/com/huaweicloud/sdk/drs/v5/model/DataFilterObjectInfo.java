package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据过滤对象信息
 */
public class DataFilterObjectInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_name")

    private String objectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_alias_name")

    private String objectAliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    public DataFilterObjectInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据过滤对象的唯一标识。用于标识待过滤的数据库对象，填写格式为层级路径形式。 约束：填写格式为以下三种之一：库名-*-*-表名、schema名-*-*-表名、库名-*-*-schema名-*-*-表名。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DataFilterObjectInfo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 数据过滤对象的父级对象标识。用于标识当前过滤对象所属的上级数据库对象（库或Schema）。 约束：填写格式为以下三种之一：库名、schema名、库名-*-*-schema名。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public DataFilterObjectInfo withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * 数据过滤对象的名称。即当前需要进行过滤操作的具体数据库表名。
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public DataFilterObjectInfo withObjectAliasName(String objectAliasName) {
        this.objectAliasName = objectAliasName;
        return this;
    }

    /**
     * 数据过滤对象映射名称
     * @return objectAliasName
     */
    public String getObjectAliasName() {
        return objectAliasName;
    }

    public void setObjectAliasName(String objectAliasName) {
        this.objectAliasName = objectAliasName;
    }

    public DataFilterObjectInfo withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 数据过滤对象的类型。标识当前过滤对象的数据库对象类型，如表、视图、存储过程等。
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataFilterObjectInfo that = (DataFilterObjectInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.objectName, that.objectName)
            && Objects.equals(this.objectAliasName, that.objectAliasName)
            && Objects.equals(this.objectType, that.objectType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, objectName, objectAliasName, objectType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataFilterObjectInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    objectAliasName: ").append(toIndentedString(objectAliasName)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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
