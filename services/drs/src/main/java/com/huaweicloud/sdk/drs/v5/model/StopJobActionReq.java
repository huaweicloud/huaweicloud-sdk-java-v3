package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 结束单个任务请求体。
 */
public class StopJobActionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_force_stop")

    private Boolean isForceStop;

    public StopJobActionReq withIsForceStop(Boolean isForceStop) {
        this.isForceStop = isForceStop;
        return this;
    }

    /**
     * 强制结束任务时取值true，默认false。
     * @return isForceStop
     */
    public Boolean getIsForceStop() {
        return isForceStop;
    }

    public void setIsForceStop(Boolean isForceStop) {
        this.isForceStop = isForceStop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopJobActionReq that = (StopJobActionReq) obj;
        return Objects.equals(this.isForceStop, that.isForceStop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isForceStop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopJobActionReq {\n");
        sb.append("    isForceStop: ").append(toIndentedString(isForceStop)).append("\n");
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
