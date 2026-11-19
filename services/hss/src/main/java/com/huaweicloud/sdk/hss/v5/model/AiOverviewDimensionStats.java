package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AI Defender防护维度统计项
 */
public class AiOverviewDimensionStats {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private String dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_count")

    private Long alarmCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_count")

    private Long riskCount;

    public AiOverviewDimensionStats withDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * **参数解释**: 防护维度key，取值及含义如下： - consistency_detection：意图行为一致性检测 - command_control：命令执行控制 - file_access_control：文件访问控制 - sensitive_info_detection：敏感信息检测 - role_limit：角色限定（行为轨迹检测不覆盖此维度） - openclaw_detectors：记忆投毒防护（OpenClaw专属维度） - other：其他类  **取值范围**: consistency_detection、command_control、file_access_control、sensitive_info_detection、role_limit、openclaw_detectors、other 
     * @return dimension
     */
    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public AiOverviewDimensionStats withAlarmCount(Long alarmCount) {
        this.alarmCount = alarmCount;
        return this;
    }

    /**
     * **参数解释**： 告警数量，type=alarm时返回 **取值范围**： 最小值0，最大值9223372036854775807 
     * minimum: 0
     * @return alarmCount
     */
    public Long getAlarmCount() {
        return alarmCount;
    }

    public void setAlarmCount(Long alarmCount) {
        this.alarmCount = alarmCount;
    }

    public AiOverviewDimensionStats withRiskCount(Long riskCount) {
        this.riskCount = riskCount;
        return this;
    }

    /**
     * **参数解释**： 风险数量，type=risk时返回，role_limit固定为0 **取值范围**： 最小值0，最大值9223372036854775807 
     * minimum: 0
     * @return riskCount
     */
    public Long getRiskCount() {
        return riskCount;
    }

    public void setRiskCount(Long riskCount) {
        this.riskCount = riskCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiOverviewDimensionStats that = (AiOverviewDimensionStats) obj;
        return Objects.equals(this.dimension, that.dimension) && Objects.equals(this.alarmCount, that.alarmCount)
            && Objects.equals(this.riskCount, that.riskCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimension, alarmCount, riskCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiOverviewDimensionStats {\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    alarmCount: ").append(toIndentedString(alarmCount)).append("\n");
        sb.append("    riskCount: ").append(toIndentedString(riskCount)).append("\n");
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
