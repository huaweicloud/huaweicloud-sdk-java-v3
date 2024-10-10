package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRecoveryTimeWindowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_min_time")

    private String recoveryMinTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_max_time")

    private String recoveryMaxTime;

    public ShowRecoveryTimeWindowResponse withRecoveryMinTime(String recoveryMinTime) {
        this.recoveryMinTime = recoveryMinTime;
        return this;
    }

    /**
     * 恢复时间窗左边界（不包含）
     * @return recoveryMinTime
     */
    public String getRecoveryMinTime() {
        return recoveryMinTime;
    }

    public void setRecoveryMinTime(String recoveryMinTime) {
        this.recoveryMinTime = recoveryMinTime;
    }

    public ShowRecoveryTimeWindowResponse withRecoveryMaxTime(String recoveryMaxTime) {
        this.recoveryMaxTime = recoveryMaxTime;
        return this;
    }

    /**
     * 恢复时间窗右边界（包含）
     * @return recoveryMaxTime
     */
    public String getRecoveryMaxTime() {
        return recoveryMaxTime;
    }

    public void setRecoveryMaxTime(String recoveryMaxTime) {
        this.recoveryMaxTime = recoveryMaxTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRecoveryTimeWindowResponse that = (ShowRecoveryTimeWindowResponse) obj;
        return Objects.equals(this.recoveryMinTime, that.recoveryMinTime)
            && Objects.equals(this.recoveryMaxTime, that.recoveryMaxTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recoveryMinTime, recoveryMaxTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRecoveryTimeWindowResponse {\n");
        sb.append("    recoveryMinTime: ").append(toIndentedString(recoveryMinTime)).append("\n");
        sb.append("    recoveryMaxTime: ").append(toIndentedString(recoveryMaxTime)).append("\n");
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
