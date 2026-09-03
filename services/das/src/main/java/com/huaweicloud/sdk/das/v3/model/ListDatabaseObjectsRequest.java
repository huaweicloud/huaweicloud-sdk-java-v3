package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDatabaseObjectsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private String dbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_order_by")

    private String extraOrderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_order")

    private String extraOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obj_type")

    private String objType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_type")

    private String retType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sys")

    private String isSys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obj_sub_type")

    private String objSubType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obj_name")

    private String objName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords")

    private String keywords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private String curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private String perPage;

    public ListDatabaseObjectsRequest withConnectionId(String connectionId) {
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

    public ListDatabaseObjectsRequest withDbName(String dbName) {
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

    public ListDatabaseObjectsRequest withDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * 数据库ID
     * @return dbId
     */
    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public ListDatabaseObjectsRequest withSchemaName(String schemaName) {
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

    public ListDatabaseObjectsRequest withTableName(String tableName) {
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

    public ListDatabaseObjectsRequest withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 表ID
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public ListDatabaseObjectsRequest withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 开始时间(Unix timestamp),单位:毫秒
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public ListDatabaseObjectsRequest withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 结束时间(Unix timestamp),单位:毫秒
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public ListDatabaseObjectsRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 页码
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ListDatabaseObjectsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页记录数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListDatabaseObjectsRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序字段
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListDatabaseObjectsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 排序方式（asc/desc）
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListDatabaseObjectsRequest withExtraOrderBy(String extraOrderBy) {
        this.extraOrderBy = extraOrderBy;
        return this;
    }

    /**
     * 额外排序字段
     * @return extraOrderBy
     */
    public String getExtraOrderBy() {
        return extraOrderBy;
    }

    public void setExtraOrderBy(String extraOrderBy) {
        this.extraOrderBy = extraOrderBy;
    }

    public ListDatabaseObjectsRequest withExtraOrder(String extraOrder) {
        this.extraOrder = extraOrder;
        return this;
    }

    /**
     * 额外排序方式
     * @return extraOrder
     */
    public String getExtraOrder() {
        return extraOrder;
    }

    public void setExtraOrder(String extraOrder) {
        this.extraOrder = extraOrder;
    }

    public ListDatabaseObjectsRequest withObjType(String objType) {
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

    public ListDatabaseObjectsRequest withRetType(String retType) {
        this.retType = retType;
        return this;
    }

    /**
     * 返回类型
     * @return retType
     */
    public String getRetType() {
        return retType;
    }

    public void setRetType(String retType) {
        this.retType = retType;
    }

    public ListDatabaseObjectsRequest withIsSys(String isSys) {
        this.isSys = isSys;
        return this;
    }

    /**
     * 是否系统对象
     * @return isSys
     */
    public String getIsSys() {
        return isSys;
    }

    public void setIsSys(String isSys) {
        this.isSys = isSys;
    }

    public ListDatabaseObjectsRequest withObjSubType(String objSubType) {
        this.objSubType = objSubType;
        return this;
    }

    /**
     * 对象子类型
     * @return objSubType
     */
    public String getObjSubType() {
        return objSubType;
    }

    public void setObjSubType(String objSubType) {
        this.objSubType = objSubType;
    }

    public ListDatabaseObjectsRequest withNodeType(String nodeType) {
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

    public ListDatabaseObjectsRequest withNodeId(String nodeId) {
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

    public ListDatabaseObjectsRequest withObjName(String objName) {
        this.objName = objName;
        return this;
    }

    /**
     * Get objName
     * @return objName
     */
    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public ListDatabaseObjectsRequest withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * Get keywords
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public ListDatabaseObjectsRequest withCurPage(String curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * Get curPage
     * @return curPage
     */
    public String getCurPage() {
        return curPage;
    }

    public void setCurPage(String curPage) {
        this.curPage = curPage;
    }

    public ListDatabaseObjectsRequest withPerPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * Get perPage
     * @return perPage
     */
    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDatabaseObjectsRequest that = (ListDatabaseObjectsRequest) obj;
        return Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.dbId, that.dbId) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.tableId, that.tableId)
            && Objects.equals(this.startAt, that.startAt) && Objects.equals(this.endAt, that.endAt)
            && Objects.equals(this.pageNum, that.pageNum) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.order, that.order)
            && Objects.equals(this.extraOrderBy, that.extraOrderBy) && Objects.equals(this.extraOrder, that.extraOrder)
            && Objects.equals(this.objType, that.objType) && Objects.equals(this.retType, that.retType)
            && Objects.equals(this.isSys, that.isSys) && Objects.equals(this.objSubType, that.objSubType)
            && Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.objName, that.objName) && Objects.equals(this.keywords, that.keywords)
            && Objects.equals(this.curPage, that.curPage) && Objects.equals(this.perPage, that.perPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId,
            dbName,
            dbId,
            schemaName,
            tableName,
            tableId,
            startAt,
            endAt,
            pageNum,
            pageSize,
            orderBy,
            order,
            extraOrderBy,
            extraOrder,
            objType,
            retType,
            isSys,
            objSubType,
            nodeType,
            nodeId,
            objName,
            keywords,
            curPage,
            perPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseObjectsRequest {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    extraOrderBy: ").append(toIndentedString(extraOrderBy)).append("\n");
        sb.append("    extraOrder: ").append(toIndentedString(extraOrder)).append("\n");
        sb.append("    objType: ").append(toIndentedString(objType)).append("\n");
        sb.append("    retType: ").append(toIndentedString(retType)).append("\n");
        sb.append("    isSys: ").append(toIndentedString(isSys)).append("\n");
        sb.append("    objSubType: ").append(toIndentedString(objSubType)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    objName: ").append(toIndentedString(objName)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
