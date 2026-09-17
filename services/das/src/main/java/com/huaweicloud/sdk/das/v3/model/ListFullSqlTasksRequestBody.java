package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Fullsql Tasks请求体
 */
public class ListFullSqlTasksRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_left")

    private Long rangeLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_right")

    private Long rangeRight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at_left")

    private Long createAtLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at_right")

    private Long createAtRight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    private String threadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_id")

    private String trxId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_id")

    private String sqlTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asc")

    private Boolean asc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private Integer curPage;

    public ListFullSqlTasksRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListFullSqlTasksRequestBody withNodeId(String nodeId) {
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

    public ListFullSqlTasksRequestBody withRangeLeft(Long rangeLeft) {
        this.rangeLeft = rangeLeft;
        return this;
    }

    /**
     * 起止时间的查询左区间
     * @return rangeLeft
     */
    public Long getRangeLeft() {
        return rangeLeft;
    }

    public void setRangeLeft(Long rangeLeft) {
        this.rangeLeft = rangeLeft;
    }

    public ListFullSqlTasksRequestBody withRangeRight(Long rangeRight) {
        this.rangeRight = rangeRight;
        return this;
    }

    /**
     * 起止时间的查询右区间
     * @return rangeRight
     */
    public Long getRangeRight() {
        return rangeRight;
    }

    public void setRangeRight(Long rangeRight) {
        this.rangeRight = rangeRight;
    }

    public ListFullSqlTasksRequestBody withCreateAtLeft(Long createAtLeft) {
        this.createAtLeft = createAtLeft;
        return this;
    }

    /**
     * 创建时间的查询左区间
     * @return createAtLeft
     */
    public Long getCreateAtLeft() {
        return createAtLeft;
    }

    public void setCreateAtLeft(Long createAtLeft) {
        this.createAtLeft = createAtLeft;
    }

    public ListFullSqlTasksRequestBody withCreateAtRight(Long createAtRight) {
        this.createAtRight = createAtRight;
        return this;
    }

    /**
     * 创建时间的查询右区间
     * @return createAtRight
     */
    public Long getCreateAtRight() {
        return createAtRight;
    }

    public void setCreateAtRight(Long createAtRight) {
        this.createAtRight = createAtRight;
    }

    public ListFullSqlTasksRequestBody withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户名
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ListFullSqlTasksRequestBody withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListFullSqlTasksRequestBody withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ListFullSqlTasksRequestBody withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ListFullSqlTasksRequestBody withThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * 线程ID
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public ListFullSqlTasksRequestBody withTrxId(String trxId) {
        this.trxId = trxId;
        return this;
    }

    /**
     * 事务ID
     * @return trxId
     */
    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public ListFullSqlTasksRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 执行状态（0：成功，1：失败）
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListFullSqlTasksRequestBody withSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
        return this;
    }

    /**
     * SQL模板ID
     * @return sqlTemplateId
     */
    public String getSqlTemplateId() {
        return sqlTemplateId;
    }

    public void setSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
    }

    public ListFullSqlTasksRequestBody withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段（create_at, range_start_at, range_end_at）
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public ListFullSqlTasksRequestBody withAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }

    /**
     * 排序规则（true：升序，false：降序）
     * @return asc
     */
    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    public ListFullSqlTasksRequestBody withPageSize(Integer pageSize) {
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

    public ListFullSqlTasksRequestBody withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * 当前页码
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFullSqlTasksRequestBody that = (ListFullSqlTasksRequestBody) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.rangeLeft, that.rangeLeft) && Objects.equals(this.rangeRight, that.rangeRight)
            && Objects.equals(this.createAtLeft, that.createAtLeft)
            && Objects.equals(this.createAtRight, that.createAtRight) && Objects.equals(this.user, that.user)
            && Objects.equals(this.keyword, that.keyword) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.threadId, that.threadId)
            && Objects.equals(this.trxId, that.trxId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.sqlTemplateId, that.sqlTemplateId) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.asc, that.asc) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.curPage, that.curPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            nodeId,
            rangeLeft,
            rangeRight,
            createAtLeft,
            createAtRight,
            user,
            keyword,
            dbName,
            operation,
            threadId,
            trxId,
            status,
            sqlTemplateId,
            sortField,
            asc,
            pageSize,
            curPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFullSqlTasksRequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    rangeLeft: ").append(toIndentedString(rangeLeft)).append("\n");
        sb.append("    rangeRight: ").append(toIndentedString(rangeRight)).append("\n");
        sb.append("    createAtLeft: ").append(toIndentedString(createAtLeft)).append("\n");
        sb.append("    createAtRight: ").append(toIndentedString(createAtRight)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    trxId: ").append(toIndentedString(trxId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sqlTemplateId: ").append(toIndentedString(sqlTemplateId)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
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
