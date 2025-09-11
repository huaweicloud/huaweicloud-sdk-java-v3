package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DatabaseRiskStatisticsDto
 */
public class DatabaseRiskStatisticsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private String dbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ip")

    private String dbIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risk")

    private Long highRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low_risk")

    private Long lowRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium_risk")

    private Long mediumRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_rule")

    private List<RiskRuleStatistic> riskRule = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_risk")

    private Long totalRisk;

    public DatabaseRiskStatisticsDto withDbId(String dbId) {
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

    public DatabaseRiskStatisticsDto withDbIp(String dbIp) {
        this.dbIp = dbIp;
        return this;
    }

    /**
     * 数据库IP
     * @return dbIp
     */
    public String getDbIp() {
        return dbIp;
    }

    public void setDbIp(String dbIp) {
        this.dbIp = dbIp;
    }

    public DatabaseRiskStatisticsDto withDbName(String dbName) {
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

    public DatabaseRiskStatisticsDto withHighRisk(Long highRisk) {
        this.highRisk = highRisk;
        return this;
    }

    /**
     * 高风险总量
     * @return highRisk
     */
    public Long getHighRisk() {
        return highRisk;
    }

    public void setHighRisk(Long highRisk) {
        this.highRisk = highRisk;
    }

    public DatabaseRiskStatisticsDto withInstanceId(String instanceId) {
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

    public DatabaseRiskStatisticsDto withInstanceName(String instanceName) {
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

    public DatabaseRiskStatisticsDto withLowRisk(Long lowRisk) {
        this.lowRisk = lowRisk;
        return this;
    }

    /**
     * 低风险总量
     * @return lowRisk
     */
    public Long getLowRisk() {
        return lowRisk;
    }

    public void setLowRisk(Long lowRisk) {
        this.lowRisk = lowRisk;
    }

    public DatabaseRiskStatisticsDto withMediumRisk(Long mediumRisk) {
        this.mediumRisk = mediumRisk;
        return this;
    }

    /**
     * 中风险总量
     * @return mediumRisk
     */
    public Long getMediumRisk() {
        return mediumRisk;
    }

    public void setMediumRisk(Long mediumRisk) {
        this.mediumRisk = mediumRisk;
    }

    public DatabaseRiskStatisticsDto withRiskRule(List<RiskRuleStatistic> riskRule) {
        this.riskRule = riskRule;
        return this;
    }

    public DatabaseRiskStatisticsDto addRiskRuleItem(RiskRuleStatistic riskRuleItem) {
        if (this.riskRule == null) {
            this.riskRule = new ArrayList<>();
        }
        this.riskRule.add(riskRuleItem);
        return this;
    }

    public DatabaseRiskStatisticsDto withRiskRule(Consumer<List<RiskRuleStatistic>> riskRuleSetter) {
        if (this.riskRule == null) {
            this.riskRule = new ArrayList<>();
        }
        riskRuleSetter.accept(this.riskRule);
        return this;
    }

    /**
     * 风险规则统计
     * @return riskRule
     */
    public List<RiskRuleStatistic> getRiskRule() {
        return riskRule;
    }

    public void setRiskRule(List<RiskRuleStatistic> riskRule) {
        this.riskRule = riskRule;
    }

    public DatabaseRiskStatisticsDto withTotalRisk(Long totalRisk) {
        this.totalRisk = totalRisk;
        return this;
    }

    /**
     * 总风险数量
     * @return totalRisk
     */
    public Long getTotalRisk() {
        return totalRisk;
    }

    public void setTotalRisk(Long totalRisk) {
        this.totalRisk = totalRisk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseRiskStatisticsDto that = (DatabaseRiskStatisticsDto) obj;
        return Objects.equals(this.dbId, that.dbId) && Objects.equals(this.dbIp, that.dbIp)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.highRisk, that.highRisk)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.lowRisk, that.lowRisk) && Objects.equals(this.mediumRisk, that.mediumRisk)
            && Objects.equals(this.riskRule, that.riskRule) && Objects.equals(this.totalRisk, that.totalRisk);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(dbId, dbIp, dbName, highRisk, instanceId, instanceName, lowRisk, mediumRisk, riskRule, totalRisk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseRiskStatisticsDto {\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
        sb.append("    dbIp: ").append(toIndentedString(dbIp)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    highRisk: ").append(toIndentedString(highRisk)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    lowRisk: ").append(toIndentedString(lowRisk)).append("\n");
        sb.append("    mediumRisk: ").append(toIndentedString(mediumRisk)).append("\n");
        sb.append("    riskRule: ").append(toIndentedString(riskRule)).append("\n");
        sb.append("    totalRisk: ").append(toIndentedString(totalRisk)).append("\n");
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
