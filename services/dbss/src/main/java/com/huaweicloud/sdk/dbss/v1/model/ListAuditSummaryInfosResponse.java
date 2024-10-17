package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAuditSummaryInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_duration")

    private Long auditDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_sql")

    private Long totalSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_risk")

    private Long totalRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "today_sql")

    private Long todaySql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "today_risk")

    private Long todayRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "today_session")

    private Long todaySession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<AuditSummaryResponseDataList> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListAuditSummaryInfosResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListAuditSummaryInfosResponse withAuditDuration(Long auditDuration) {
        this.auditDuration = auditDuration;
        return this;
    }

    /**
     * 审计总时长
     * @return auditDuration
     */
    public Long getAuditDuration() {
        return auditDuration;
    }

    public void setAuditDuration(Long auditDuration) {
        this.auditDuration = auditDuration;
    }

    public ListAuditSummaryInfosResponse withTotalSql(Long totalSql) {
        this.totalSql = totalSql;
        return this;
    }

    /**
     * 语句总量
     * @return totalSql
     */
    public Long getTotalSql() {
        return totalSql;
    }

    public void setTotalSql(Long totalSql) {
        this.totalSql = totalSql;
    }

    public ListAuditSummaryInfosResponse withTotalRisk(Long totalRisk) {
        this.totalRisk = totalRisk;
        return this;
    }

    /**
     * 风险总量
     * @return totalRisk
     */
    public Long getTotalRisk() {
        return totalRisk;
    }

    public void setTotalRisk(Long totalRisk) {
        this.totalRisk = totalRisk;
    }

    public ListAuditSummaryInfosResponse withTodaySql(Long todaySql) {
        this.todaySql = todaySql;
        return this;
    }

    /**
     * 今日语句
     * @return todaySql
     */
    public Long getTodaySql() {
        return todaySql;
    }

    public void setTodaySql(Long todaySql) {
        this.todaySql = todaySql;
    }

    public ListAuditSummaryInfosResponse withTodayRisk(Long todayRisk) {
        this.todayRisk = todayRisk;
        return this;
    }

    /**
     * 今日风险
     * @return todayRisk
     */
    public Long getTodayRisk() {
        return todayRisk;
    }

    public void setTodayRisk(Long todayRisk) {
        this.todayRisk = todayRisk;
    }

    public ListAuditSummaryInfosResponse withTodaySession(Long todaySession) {
        this.todaySession = todaySession;
        return this;
    }

    /**
     * 今日会话
     * @return todaySession
     */
    public Long getTodaySession() {
        return todaySession;
    }

    public void setTodaySession(Long todaySession) {
        this.todaySession = todaySession;
    }

    public ListAuditSummaryInfosResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ListAuditSummaryInfosResponse withDataList(List<AuditSummaryResponseDataList> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListAuditSummaryInfosResponse addDataListItem(AuditSummaryResponseDataList dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListAuditSummaryInfosResponse withDataList(Consumer<List<AuditSummaryResponseDataList>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 列表信息
     * @return dataList
     */
    public List<AuditSummaryResponseDataList> getDataList() {
        return dataList;
    }

    public void setDataList(List<AuditSummaryResponseDataList> dataList) {
        this.dataList = dataList;
    }

    public ListAuditSummaryInfosResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditSummaryInfosResponse that = (ListAuditSummaryInfosResponse) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.auditDuration, that.auditDuration)
            && Objects.equals(this.totalSql, that.totalSql) && Objects.equals(this.totalRisk, that.totalRisk)
            && Objects.equals(this.todaySql, that.todaySql) && Objects.equals(this.todayRisk, that.todayRisk)
            && Objects.equals(this.todaySession, that.todaySession) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.dataList, that.dataList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            auditDuration,
            totalSql,
            totalRisk,
            todaySql,
            todayRisk,
            todaySession,
            updateTime,
            dataList,
            total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditSummaryInfosResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    auditDuration: ").append(toIndentedString(auditDuration)).append("\n");
        sb.append("    totalSql: ").append(toIndentedString(totalSql)).append("\n");
        sb.append("    totalRisk: ").append(toIndentedString(totalRisk)).append("\n");
        sb.append("    todaySql: ").append(toIndentedString(todaySql)).append("\n");
        sb.append("    todayRisk: ").append(toIndentedString(todayRisk)).append("\n");
        sb.append("    todaySession: ").append(toIndentedString(todaySession)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
