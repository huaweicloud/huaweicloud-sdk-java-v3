package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置DDL日志下载策略
 */
public class SetDdlLogPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_status")

    private String switchStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    public SetDdlLogPolicyRequestBody withSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    /**
     * **参数解释**：  设置DDL日志下载功能开关。  **约束限制**：  不涉及。  **取值范围**：  - ON，开启。 - OFF，关闭。  **默认取值**：  不涉及。 
     * @return switchStatus
     */
    public String getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
    }

    public SetDdlLogPolicyRequestBody withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * **参数解释**：  设置DDL日志保留天数。  **约束限制**：  不涉及。  **取值范围**：  1~30。  **默认取值**：  3。 
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetDdlLogPolicyRequestBody that = (SetDdlLogPolicyRequestBody) obj;
        return Objects.equals(this.switchStatus, that.switchStatus) && Objects.equals(this.keepDays, that.keepDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchStatus, keepDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetDdlLogPolicyRequestBody {\n");
        sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
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
