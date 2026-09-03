package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDbObjNewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obj_name")

    private String objName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obj_id")

    private String objId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_sub_type")

    private String objectSubType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obj_type")

    private String objType;

    public DeleteDbObjNewRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public DeleteDbObjNewRequest withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DeleteDbObjNewRequest withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Schema名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public DeleteDbObjNewRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DeleteDbObjNewRequest withObjName(String objName) {
        this.objName = objName;
        return this;
    }

    /**
     * 对象名称
     * @return objName
     */
    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public DeleteDbObjNewRequest withObjId(String objId) {
        this.objId = objId;
        return this;
    }

    /**
     * 对象ID
     * @return objId
     */
    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public DeleteDbObjNewRequest withObjectSubType(String objectSubType) {
        this.objectSubType = objectSubType;
        return this;
    }

    /**
     * 对象子类型
     * @return objectSubType
     */
    public String getObjectSubType() {
        return objectSubType;
    }

    public void setObjectSubType(String objectSubType) {
        this.objectSubType = objectSubType;
    }

    public DeleteDbObjNewRequest withObjType(String objType) {
        this.objType = objType;
        return this;
    }

    /**
     * 对象类型
     * @return objType
     */
    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDbObjNewRequest that = (DeleteDbObjNewRequest) obj;
        return Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.objName, that.objName) && Objects.equals(this.objId, that.objId)
            && Objects.equals(this.objectSubType, that.objectSubType) && Objects.equals(this.objType, that.objType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId, dbName, schemaName, tableName, objName, objId, objectSubType, objType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDbObjNewRequest {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    objName: ").append(toIndentedString(objName)).append("\n");
        sb.append("    objId: ").append(toIndentedString(objId)).append("\n");
        sb.append("    objectSubType: ").append(toIndentedString(objectSubType)).append("\n");
        sb.append("    objType: ").append(toIndentedString(objType)).append("\n");
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
