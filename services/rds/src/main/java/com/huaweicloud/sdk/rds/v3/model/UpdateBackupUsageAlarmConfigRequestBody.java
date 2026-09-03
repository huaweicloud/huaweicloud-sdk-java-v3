package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改备份空间告警配置请求体
 */
public class UpdateBackupUsageAlarmConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_enabled")

    private String alarmEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_percent")

    private Integer thresholdPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "increment_percent")

    private Integer incrementPercent;

    public UpdateBackupUsageAlarmConfigRequestBody withAlarmEnabled(String alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
        return this;
    }

    /**
     * **参数解释**：  告警开关。  **约束限制**：  不涉及。  **取值范围**：  - ON - OFF  **默认取值**：  不涉及。
     * @return alarmEnabled
     */
    public String getAlarmEnabled() {
        return alarmEnabled;
    }

    public void setAlarmEnabled(String alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
    }

    public UpdateBackupUsageAlarmConfigRequestBody withThresholdPercent(Integer thresholdPercent) {
        this.thresholdPercent = thresholdPercent;
        return this;
    }

    /**
     * **参数解释**：  阈值百分比，占免费备份空间大小的百分比。  **约束限制**：  不涉及。  **取值范围**：  1-100。  **默认取值**：  90
     * @return thresholdPercent
     */
    public Integer getThresholdPercent() {
        return thresholdPercent;
    }

    public void setThresholdPercent(Integer thresholdPercent) {
        this.thresholdPercent = thresholdPercent;
    }

    public UpdateBackupUsageAlarmConfigRequestBody withIncrementPercent(Integer incrementPercent) {
        this.incrementPercent = incrementPercent;
        return this;
    }

    /**
     * **参数解释**：  增量百分比，占免费备份空间大小的百分比。  **约束限制**：  不涉及。  **取值范围**：  1-100。  **默认取值**：  10
     * @return incrementPercent
     */
    public Integer getIncrementPercent() {
        return incrementPercent;
    }

    public void setIncrementPercent(Integer incrementPercent) {
        this.incrementPercent = incrementPercent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBackupUsageAlarmConfigRequestBody that = (UpdateBackupUsageAlarmConfigRequestBody) obj;
        return Objects.equals(this.alarmEnabled, that.alarmEnabled)
            && Objects.equals(this.thresholdPercent, that.thresholdPercent)
            && Objects.equals(this.incrementPercent, that.incrementPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmEnabled, thresholdPercent, incrementPercent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBackupUsageAlarmConfigRequestBody {\n");
        sb.append("    alarmEnabled: ").append(toIndentedString(alarmEnabled)).append("\n");
        sb.append("    thresholdPercent: ").append(toIndentedString(thresholdPercent)).append("\n");
        sb.append("    incrementPercent: ").append(toIndentedString(incrementPercent)).append("\n");
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
