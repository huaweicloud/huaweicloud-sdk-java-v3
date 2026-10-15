package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSwitchoverInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_switchover_time")

    private String lastSwitchoverTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "increment_check_point")

    private String incrementCheckPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_safe_point")

    private String targetSafePoint;

    public ShowSwitchoverInfoResponse withLastSwitchoverTime(String lastSwitchoverTime) {
        this.lastSwitchoverTime = lastSwitchoverTime;
        return this;
    }

    /**
     * 上次倒换完成时间点
     * @return lastSwitchoverTime
     */
    public String getLastSwitchoverTime() {
        return lastSwitchoverTime;
    }

    public void setLastSwitchoverTime(String lastSwitchoverTime) {
        this.lastSwitchoverTime = lastSwitchoverTime;
    }

    public ShowSwitchoverInfoResponse withIncrementCheckPoint(String incrementCheckPoint) {
        this.incrementCheckPoint = incrementCheckPoint;
        return this;
    }

    /**
     * 上次倒换任务位点信息
     * @return incrementCheckPoint
     */
    public String getIncrementCheckPoint() {
        return incrementCheckPoint;
    }

    public void setIncrementCheckPoint(String incrementCheckPoint) {
        this.incrementCheckPoint = incrementCheckPoint;
    }

    public ShowSwitchoverInfoResponse withTargetSafePoint(String targetSafePoint) {
        this.targetSafePoint = targetSafePoint;
        return this;
    }

    /**
     * 上次倒换目标库倒换时位点
     * @return targetSafePoint
     */
    public String getTargetSafePoint() {
        return targetSafePoint;
    }

    public void setTargetSafePoint(String targetSafePoint) {
        this.targetSafePoint = targetSafePoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSwitchoverInfoResponse that = (ShowSwitchoverInfoResponse) obj;
        return Objects.equals(this.lastSwitchoverTime, that.lastSwitchoverTime)
            && Objects.equals(this.incrementCheckPoint, that.incrementCheckPoint)
            && Objects.equals(this.targetSafePoint, that.targetSafePoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastSwitchoverTime, incrementCheckPoint, targetSafePoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSwitchoverInfoResponse {\n");
        sb.append("    lastSwitchoverTime: ").append(toIndentedString(lastSwitchoverTime)).append("\n");
        sb.append("    incrementCheckPoint: ").append(toIndentedString(incrementCheckPoint)).append("\n");
        sb.append("    targetSafePoint: ").append(toIndentedString(targetSafePoint)).append("\n");
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
