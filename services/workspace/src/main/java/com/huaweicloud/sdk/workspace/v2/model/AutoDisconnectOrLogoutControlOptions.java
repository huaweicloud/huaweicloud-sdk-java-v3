package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AutoDisconnectOrLogoutControlOptions
 */
public class AutoDisconnectOrLogoutControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_disconnect_minutes")

    private Integer autoDisconnectMinutes;

    public AutoDisconnectOrLogoutControlOptions withAutoDisconnectMinutes(Integer autoDisconnectMinutes) {
        this.autoDisconnectMinutes = autoDisconnectMinutes;
        return this;
    }

    /**
     * 断开或注销等待时间（分钟）。取值范围为[1-86400]。默认：1440。
     * minimum: 1
     * maximum: 86400
     * @return autoDisconnectMinutes
     */
    public Integer getAutoDisconnectMinutes() {
        return autoDisconnectMinutes;
    }

    public void setAutoDisconnectMinutes(Integer autoDisconnectMinutes) {
        this.autoDisconnectMinutes = autoDisconnectMinutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoDisconnectOrLogoutControlOptions that = (AutoDisconnectOrLogoutControlOptions) obj;
        return Objects.equals(this.autoDisconnectMinutes, that.autoDisconnectMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoDisconnectMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoDisconnectOrLogoutControlOptions {\n");
        sb.append("    autoDisconnectMinutes: ").append(toIndentedString(autoDisconnectMinutes)).append("\n");
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
