package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuditSummaryResponseDataList
 */
public class AuditSummaryResponseDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private Long instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

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
    @JsonProperty(value = "reserve1")

    private String reserve1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve2")

    private String reserve2;

    public AuditSummaryResponseDataList withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuditSummaryResponseDataList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态 - 1：success - 2：failure
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AuditSummaryResponseDataList withProjectId(String projectId) {
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

    public AuditSummaryResponseDataList withInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public AuditSummaryResponseDataList withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public AuditSummaryResponseDataList withAuditDuration(Long auditDuration) {
        this.auditDuration = auditDuration;
        return this;
    }

    /**
     * 审计时长
     * @return auditDuration
     */
    public Long getAuditDuration() {
        return auditDuration;
    }

    public void setAuditDuration(Long auditDuration) {
        this.auditDuration = auditDuration;
    }

    public AuditSummaryResponseDataList withTotalSql(Long totalSql) {
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

    public AuditSummaryResponseDataList withTotalRisk(Long totalRisk) {
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

    public AuditSummaryResponseDataList withTodaySql(Long todaySql) {
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

    public AuditSummaryResponseDataList withTodayRisk(Long todayRisk) {
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

    public AuditSummaryResponseDataList withTodaySession(Long todaySession) {
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

    public AuditSummaryResponseDataList withUpdateTime(Long updateTime) {
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

    public AuditSummaryResponseDataList withReserve1(String reserve1) {
        this.reserve1 = reserve1;
        return this;
    }

    /**
     * 保留字1
     * @return reserve1
     */
    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public AuditSummaryResponseDataList withReserve2(String reserve2) {
        this.reserve2 = reserve2;
        return this;
    }

    /**
     * 保留字2
     * @return reserve2
     */
    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditSummaryResponseDataList that = (AuditSummaryResponseDataList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.auditDuration, that.auditDuration) && Objects.equals(this.totalSql, that.totalSql)
            && Objects.equals(this.totalRisk, that.totalRisk) && Objects.equals(this.todaySql, that.todaySql)
            && Objects.equals(this.todayRisk, that.todayRisk) && Objects.equals(this.todaySession, that.todaySession)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.reserve1, that.reserve1)
            && Objects.equals(this.reserve2, that.reserve2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            projectId,
            instanceId,
            instanceName,
            auditDuration,
            totalSql,
            totalRisk,
            todaySql,
            todayRisk,
            todaySession,
            updateTime,
            reserve1,
            reserve2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditSummaryResponseDataList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    auditDuration: ").append(toIndentedString(auditDuration)).append("\n");
        sb.append("    totalSql: ").append(toIndentedString(totalSql)).append("\n");
        sb.append("    totalRisk: ").append(toIndentedString(totalRisk)).append("\n");
        sb.append("    todaySql: ").append(toIndentedString(todaySql)).append("\n");
        sb.append("    todayRisk: ").append(toIndentedString(todayRisk)).append("\n");
        sb.append("    todaySession: ").append(toIndentedString(todaySession)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    reserve1: ").append(toIndentedString(reserve1)).append("\n");
        sb.append("    reserve2: ").append(toIndentedString(reserve2)).append("\n");
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
