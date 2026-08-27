package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Policy
 */
public class Policy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Integer retentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private String policyType;

    public Policy withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * **参数解释**：  备份周期配置。  **约束限制**：  格式必须为“日期 月份 星期”形式的Cron表达式，时区为UTC时区。  **取值范围**：  日期支持填写1~31、特殊字符*（表示任意值）、特殊字符L（表示最后一天）。填写1~31或L时支持填写多个，需以逗号隔开。 月份支持填写1~12、特殊字符*（表示任意值）。 星期支持填写1~7（1表示星期一，2表示星期二，依次类推）、特殊字符*（表示任意值）。填写1~7数字时支持填写多个，需以逗号隔开。  取值示例： - \\* \\* 6 表示每周六执行任务，适用于周策略。 - \\* \\* 1,2,3 表示每周一、二、三执行任务，适用于周策略。 - 1,2 * * 表示每月1号、2号执行任务，适用于月策略。 - L * * 表示每月的最后一天执行任务，适用于月策略。 - 15 3 * 表示每年的3月15日执行任务，适用于年策略。  **默认取值**：  不涉及。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Policy withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * **参数解释**：  备份文件的保留天数，单位为天。  **约束限制**：  不涉及。  **取值范围**：  1~732天。 您也可以联系客服申请开通最大保留天数为3660。  **默认取值**：  不涉及。
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    public Policy withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * **参数解释**：  备份策略类型。  **约束限制**：  不涉及。  **取值范围**：    - base：表示基础策略。    - sparse：表示稀疏策略。  **默认取值**：  不涉及。
     * @return policyType
     */
    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Policy that = (Policy) obj;
        return Objects.equals(this.period, that.period) && Objects.equals(this.retentionDays, that.retentionDays)
            && Objects.equals(this.policyType, that.policyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, retentionDays, policyType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Policy {\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
