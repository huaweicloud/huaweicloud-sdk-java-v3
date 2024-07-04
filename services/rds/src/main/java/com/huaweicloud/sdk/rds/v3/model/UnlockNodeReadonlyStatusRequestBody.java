package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 解除只读请求体
 */
public class UnlockNodeReadonlyStatusRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_preservation_time")

    private Integer statusPreservationTime;

    public UnlockNodeReadonlyStatusRequestBody withStatusPreservationTime(Integer statusPreservationTime) {
        this.statusPreservationTime = statusPreservationTime;
        return this;
    }

    /**
     * Ha保持不再设置节点只读状态的时间，单位为分钟。
     * minimum: 0
     * maximum: 1440
     * @return statusPreservationTime
     */
    public Integer getStatusPreservationTime() {
        return statusPreservationTime;
    }

    public void setStatusPreservationTime(Integer statusPreservationTime) {
        this.statusPreservationTime = statusPreservationTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnlockNodeReadonlyStatusRequestBody that = (UnlockNodeReadonlyStatusRequestBody) obj;
        return Objects.equals(this.statusPreservationTime, that.statusPreservationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusPreservationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnlockNodeReadonlyStatusRequestBody {\n");
        sb.append("    statusPreservationTime: ").append(toIndentedString(statusPreservationTime)).append("\n");
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
