package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 按SQL模板ID查询全量SQL任务请求体
 */
public class ListTasksBySqlTemplateIdRequestBody {

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
    @JsonProperty(value = "sql_template_id")

    private String sqlTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private Integer curPage;

    public ListTasksBySqlTemplateIdRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，实例的唯一标识
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListTasksBySqlTemplateIdRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，实例节点的唯一标识
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListTasksBySqlTemplateIdRequestBody withRangeLeft(Long rangeLeft) {
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

    public ListTasksBySqlTemplateIdRequestBody withRangeRight(Long rangeRight) {
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

    public ListTasksBySqlTemplateIdRequestBody withSqlTemplateId(String sqlTemplateId) {
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

    public ListTasksBySqlTemplateIdRequestBody withPageSize(Integer pageSize) {
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

    public ListTasksBySqlTemplateIdRequestBody withCurPage(Integer curPage) {
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
        ListTasksBySqlTemplateIdRequestBody that = (ListTasksBySqlTemplateIdRequestBody) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.rangeLeft, that.rangeLeft) && Objects.equals(this.rangeRight, that.rangeRight)
            && Objects.equals(this.sqlTemplateId, that.sqlTemplateId) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.curPage, that.curPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, nodeId, rangeLeft, rangeRight, sqlTemplateId, pageSize, curPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksBySqlTemplateIdRequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    rangeLeft: ").append(toIndentedString(rangeLeft)).append("\n");
        sb.append("    rangeRight: ").append(toIndentedString(rangeRight)).append("\n");
        sb.append("    sqlTemplateId: ").append(toIndentedString(sqlTemplateId)).append("\n");
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
