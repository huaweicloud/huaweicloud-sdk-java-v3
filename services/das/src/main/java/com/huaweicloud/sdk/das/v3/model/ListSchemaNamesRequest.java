package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSchemaNamesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obj_type")

    private String objType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_with_all_user")

    private String isWithAllUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    public ListSchemaNamesRequest withConnectionId(String connectionId) {
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

    public ListSchemaNamesRequest withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ListSchemaNamesRequest withObjType(String objType) {
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

    public ListSchemaNamesRequest withIsWithAllUser(String isWithAllUser) {
        this.isWithAllUser = isWithAllUser;
        return this;
    }

    /**
     * 是否包含所有用户
     * @return isWithAllUser
     */
    public String getIsWithAllUser() {
        return isWithAllUser;
    }

    public void setIsWithAllUser(String isWithAllUser) {
        this.isWithAllUser = isWithAllUser;
    }

    public ListSchemaNamesRequest withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public ListSchemaNamesRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSchemaNamesRequest that = (ListSchemaNamesRequest) obj;
        return Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.objType, that.objType) && Objects.equals(this.isWithAllUser, that.isWithAllUser)
            && Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.nodeId, that.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId, dbName, objType, isWithAllUser, nodeType, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSchemaNamesRequest {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    objType: ").append(toIndentedString(objType)).append("\n");
        sb.append("    isWithAllUser: ").append(toIndentedString(isWithAllUser)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
