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
public class ShowAuditStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_risk_statistics")

    private List<DatabaseRiskStatisticsDto> dbRiskStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risk_total")

    private Long highRiskTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low_risk_total")

    private Long lowRiskTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium_risk_total")

    private Long mediumRiskTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_risk_statistics")

    private List<RuleRiskStatisticsDto> ruleRiskStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsupported_audit_infos")

    private UnsupportedAuditInfoResponse unsupportedAuditInfos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public ShowAuditStatisticsResponse withDbRiskStatistics(List<DatabaseRiskStatisticsDto> dbRiskStatistics) {
        this.dbRiskStatistics = dbRiskStatistics;
        return this;
    }

    public ShowAuditStatisticsResponse addDbRiskStatisticsItem(DatabaseRiskStatisticsDto dbRiskStatisticsItem) {
        if (this.dbRiskStatistics == null) {
            this.dbRiskStatistics = new ArrayList<>();
        }
        this.dbRiskStatistics.add(dbRiskStatisticsItem);
        return this;
    }

    public ShowAuditStatisticsResponse withDbRiskStatistics(
        Consumer<List<DatabaseRiskStatisticsDto>> dbRiskStatisticsSetter) {
        if (this.dbRiskStatistics == null) {
            this.dbRiskStatistics = new ArrayList<>();
        }
        dbRiskStatisticsSetter.accept(this.dbRiskStatistics);
        return this;
    }

    /**
     * 数据库风险统计
     * @return dbRiskStatistics
     */
    public List<DatabaseRiskStatisticsDto> getDbRiskStatistics() {
        return dbRiskStatistics;
    }

    public void setDbRiskStatistics(List<DatabaseRiskStatisticsDto> dbRiskStatistics) {
        this.dbRiskStatistics = dbRiskStatistics;
    }

    public ShowAuditStatisticsResponse withHighRiskTotal(Long highRiskTotal) {
        this.highRiskTotal = highRiskTotal;
        return this;
    }

    /**
     * 高风险总量
     * @return highRiskTotal
     */
    public Long getHighRiskTotal() {
        return highRiskTotal;
    }

    public void setHighRiskTotal(Long highRiskTotal) {
        this.highRiskTotal = highRiskTotal;
    }

    public ShowAuditStatisticsResponse withLowRiskTotal(Long lowRiskTotal) {
        this.lowRiskTotal = lowRiskTotal;
        return this;
    }

    /**
     * 低风险总量
     * @return lowRiskTotal
     */
    public Long getLowRiskTotal() {
        return lowRiskTotal;
    }

    public void setLowRiskTotal(Long lowRiskTotal) {
        this.lowRiskTotal = lowRiskTotal;
    }

    public ShowAuditStatisticsResponse withMediumRiskTotal(Long mediumRiskTotal) {
        this.mediumRiskTotal = mediumRiskTotal;
        return this;
    }

    /**
     * 中风险总量
     * @return mediumRiskTotal
     */
    public Long getMediumRiskTotal() {
        return mediumRiskTotal;
    }

    public void setMediumRiskTotal(Long mediumRiskTotal) {
        this.mediumRiskTotal = mediumRiskTotal;
    }

    public ShowAuditStatisticsResponse withProjectId(String projectId) {
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

    public ShowAuditStatisticsResponse withRuleRiskStatistics(List<RuleRiskStatisticsDto> ruleRiskStatistics) {
        this.ruleRiskStatistics = ruleRiskStatistics;
        return this;
    }

    public ShowAuditStatisticsResponse addRuleRiskStatisticsItem(RuleRiskStatisticsDto ruleRiskStatisticsItem) {
        if (this.ruleRiskStatistics == null) {
            this.ruleRiskStatistics = new ArrayList<>();
        }
        this.ruleRiskStatistics.add(ruleRiskStatisticsItem);
        return this;
    }

    public ShowAuditStatisticsResponse withRuleRiskStatistics(
        Consumer<List<RuleRiskStatisticsDto>> ruleRiskStatisticsSetter) {
        if (this.ruleRiskStatistics == null) {
            this.ruleRiskStatistics = new ArrayList<>();
        }
        ruleRiskStatisticsSetter.accept(this.ruleRiskStatistics);
        return this;
    }

    /**
     * 风险规则统计
     * @return ruleRiskStatistics
     */
    public List<RuleRiskStatisticsDto> getRuleRiskStatistics() {
        return ruleRiskStatistics;
    }

    public void setRuleRiskStatistics(List<RuleRiskStatisticsDto> ruleRiskStatistics) {
        this.ruleRiskStatistics = ruleRiskStatistics;
    }

    public ShowAuditStatisticsResponse withUnsupportedAuditInfos(UnsupportedAuditInfoResponse unsupportedAuditInfos) {
        this.unsupportedAuditInfos = unsupportedAuditInfos;
        return this;
    }

    public ShowAuditStatisticsResponse withUnsupportedAuditInfos(
        Consumer<UnsupportedAuditInfoResponse> unsupportedAuditInfosSetter) {
        if (this.unsupportedAuditInfos == null) {
            this.unsupportedAuditInfos = new UnsupportedAuditInfoResponse();
            unsupportedAuditInfosSetter.accept(this.unsupportedAuditInfos);
        }

        return this;
    }

    /**
     * Get unsupportedAuditInfos
     * @return unsupportedAuditInfos
     */
    public UnsupportedAuditInfoResponse getUnsupportedAuditInfos() {
        return unsupportedAuditInfos;
    }

    public void setUnsupportedAuditInfos(UnsupportedAuditInfoResponse unsupportedAuditInfos) {
        this.unsupportedAuditInfos = unsupportedAuditInfos;
    }

    public ShowAuditStatisticsResponse withUpdateTime(Long updateTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuditStatisticsResponse that = (ShowAuditStatisticsResponse) obj;
        return Objects.equals(this.dbRiskStatistics, that.dbRiskStatistics)
            && Objects.equals(this.highRiskTotal, that.highRiskTotal)
            && Objects.equals(this.lowRiskTotal, that.lowRiskTotal)
            && Objects.equals(this.mediumRiskTotal, that.mediumRiskTotal)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.ruleRiskStatistics, that.ruleRiskStatistics)
            && Objects.equals(this.unsupportedAuditInfos, that.unsupportedAuditInfos)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbRiskStatistics,
            highRiskTotal,
            lowRiskTotal,
            mediumRiskTotal,
            projectId,
            ruleRiskStatistics,
            unsupportedAuditInfos,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditStatisticsResponse {\n");
        sb.append("    dbRiskStatistics: ").append(toIndentedString(dbRiskStatistics)).append("\n");
        sb.append("    highRiskTotal: ").append(toIndentedString(highRiskTotal)).append("\n");
        sb.append("    lowRiskTotal: ").append(toIndentedString(lowRiskTotal)).append("\n");
        sb.append("    mediumRiskTotal: ").append(toIndentedString(mediumRiskTotal)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    ruleRiskStatistics: ").append(toIndentedString(ruleRiskStatistics)).append("\n");
        sb.append("    unsupportedAuditInfos: ").append(toIndentedString(unsupportedAuditInfos)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
