package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DisconnectLogoutOptions
 */
public class DisconnectLogoutOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disconnect_logout_minutes")

    private Integer disconnectLogoutMinutes;

    public DisconnectLogoutOptions withDisconnectLogoutMinutes(Integer disconnectLogoutMinutes) {
        this.disconnectLogoutMinutes = disconnectLogoutMinutes;
        return this;
    }

    /**
     * 断开后自动注销等待时间（分钟）。取值范围为[3-86400]。默认：10。
     * minimum: 3
     * maximum: 86400
     * @return disconnectLogoutMinutes
     */
    public Integer getDisconnectLogoutMinutes() {
        return disconnectLogoutMinutes;
    }

    public void setDisconnectLogoutMinutes(Integer disconnectLogoutMinutes) {
        this.disconnectLogoutMinutes = disconnectLogoutMinutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisconnectLogoutOptions that = (DisconnectLogoutOptions) obj;
        return Objects.equals(this.disconnectLogoutMinutes, that.disconnectLogoutMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disconnectLogoutMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisconnectLogoutOptions {\n");
        sb.append("    disconnectLogoutMinutes: ").append(toIndentedString(disconnectLogoutMinutes)).append("\n");
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
