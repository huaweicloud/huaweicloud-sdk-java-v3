package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：  备份策略信息。
 */
public class BackupPolicyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Integer retentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private String policyType;

    public BackupPolicyInfo withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * **参数解释**：  指定已生成的备份文件可以保存的天数。  **取值范围**：  1-732。 您也可以联系客服申请开通最大保留天数为3660。
     * minimum: 1
     * maximum: 732
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    public BackupPolicyInfo withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * **参数解释**：  备份周期配置。  **取值范围**：  格式必须为“日期 月份 星期”形式的Cron表达式，时区为UTC时区。 日期支持填写1~31、特殊字符*（表示任意值）、特殊字符L（表示最后一天）。填写1~31或L时支持填写多个，需以逗号隔开。 月份支持填写1~12、特殊字符*（表示任意值）。 星期支持填写1~7，需以逗号隔开。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public BackupPolicyInfo withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * **参数解释**:  自动备份策略类型。  **取值范围**：   - base：表示基础策略。   - sparse：表示稀疏策略。
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
        BackupPolicyInfo that = (BackupPolicyInfo) obj;
        return Objects.equals(this.retentionDays, that.retentionDays) && Objects.equals(this.period, that.period)
            && Objects.equals(this.policyType, that.policyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retentionDays, period, policyType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupPolicyInfo {\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
