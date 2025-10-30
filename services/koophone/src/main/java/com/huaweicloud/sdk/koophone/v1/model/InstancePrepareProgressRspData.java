package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例准备进度响应
 */
public class InstancePrepareProgressRspData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waitingCount")

    private Integer waitingCount;

    public InstancePrepareProgressRspData withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 实例准备状态。0：正常，1：排队中，2：还原中和离线，-1：处理失败，3：备份中
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public InstancePrepareProgressRspData withWaitingCount(Integer waitingCount) {
        this.waitingCount = waitingCount;
        return this;
    }

    /**
     * 等待时间
     * @return waitingCount
     */
    public Integer getWaitingCount() {
        return waitingCount;
    }

    public void setWaitingCount(Integer waitingCount) {
        this.waitingCount = waitingCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstancePrepareProgressRspData that = (InstancePrepareProgressRspData) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.waitingCount, that.waitingCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, waitingCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancePrepareProgressRspData {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    waitingCount: ").append(toIndentedString(waitingCount)).append("\n");
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
