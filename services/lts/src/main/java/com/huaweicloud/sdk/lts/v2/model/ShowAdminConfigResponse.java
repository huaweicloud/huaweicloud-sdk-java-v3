package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAdminConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_converge_switch")

    private Boolean logConvergeSwitch;

    public ShowAdminConfigResponse withLogConvergeSwitch(Boolean logConvergeSwitch) {
        this.logConvergeSwitch = logConvergeSwitch;
        return this;
    }

    /**
     * Get logConvergeSwitch
     * @return logConvergeSwitch
     */
    public Boolean getLogConvergeSwitch() {
        return logConvergeSwitch;
    }

    public void setLogConvergeSwitch(Boolean logConvergeSwitch) {
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
        ShowAdminConfigResponse that = (ShowAdminConfigResponse) obj;
        return Objects.equals(this.logConvergeSwitch, that.logConvergeSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logConvergeSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAdminConfigResponse {\n");
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
