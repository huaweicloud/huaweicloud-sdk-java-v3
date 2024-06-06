package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateSlowlogSensitiveSwitchRequestBody
 */
public class UpdateSlowlogSensitiveSwitchRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_slow_log_switch")

    private Boolean openSlowLogSwitch;

    public UpdateSlowlogSensitiveSwitchRequestBody withOpenSlowLogSwitch(Boolean openSlowLogSwitch) {
        this.openSlowLogSwitch = openSlowLogSwitch;
        return this;
    }

    /**
     * 慢日志开关状态。
     * @return openSlowLogSwitch
     */
    public Boolean getOpenSlowLogSwitch() {
        return openSlowLogSwitch;
    }

    public void setOpenSlowLogSwitch(Boolean openSlowLogSwitch) {
        this.openSlowLogSwitch = openSlowLogSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSlowlogSensitiveSwitchRequestBody that = (UpdateSlowlogSensitiveSwitchRequestBody) obj;
        return Objects.equals(this.openSlowLogSwitch, that.openSlowLogSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openSlowLogSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSlowlogSensitiveSwitchRequestBody {\n");
        sb.append("    openSlowLogSwitch: ").append(toIndentedString(openSlowLogSwitch)).append("\n");
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
