package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AutoLogoutOptions
 */
public class AutoLogoutOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sbc_logout_waiting_time")

    private Integer sbcLogoutWaitingTime;

    public AutoLogoutOptions withSbcLogoutWaitingTime(Integer sbcLogoutWaitingTime) {
        this.sbcLogoutWaitingTime = sbcLogoutWaitingTime;
        return this;
    }

    /**
     * 会话断连保留时长（分钟）。
     * minimum: 1
     * maximum: 86400
     * @return sbcLogoutWaitingTime
     */
    public Integer getSbcLogoutWaitingTime() {
        return sbcLogoutWaitingTime;
    }

    public void setSbcLogoutWaitingTime(Integer sbcLogoutWaitingTime) {
        this.sbcLogoutWaitingTime = sbcLogoutWaitingTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoLogoutOptions that = (AutoLogoutOptions) obj;
        return Objects.equals(this.sbcLogoutWaitingTime, that.sbcLogoutWaitingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sbcLogoutWaitingTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoLogoutOptions {\n");
        sb.append("    sbcLogoutWaitingTime: ").append(toIndentedString(sbcLogoutWaitingTime)).append("\n");
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
