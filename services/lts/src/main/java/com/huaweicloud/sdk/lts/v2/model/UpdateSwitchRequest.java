package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class UpdateSwitchRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_converge_switch")

    private String logConvergeSwitch;

    public UpdateSwitchRequest withLogConvergeSwitch(String logConvergeSwitch) {
        this.logConvergeSwitch = logConvergeSwitch;
        return this;
    }

    /**
     * 开关参数
     * @return logConvergeSwitch
     */
    public String getLogConvergeSwitch() {
        return logConvergeSwitch;
    }

    public void setLogConvergeSwitch(String logConvergeSwitch) {
        this.logConvergeSwitch = logConvergeSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSwitchRequest that = (UpdateSwitchRequest) obj;
        return Objects.equals(this.logConvergeSwitch, that.logConvergeSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logConvergeSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSwitchRequest {\n");
        sb.append("    logConvergeSwitch: ").append(toIndentedString(logConvergeSwitch)).append("\n");
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
