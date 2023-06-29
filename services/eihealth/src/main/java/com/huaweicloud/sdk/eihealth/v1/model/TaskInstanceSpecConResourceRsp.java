package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskInstanceSpecConResourceRsp
 */
public class TaskInstanceSpecConResourceRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private TaskInstanceSpecConResLimitRsp limits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requests")

    private TaskInstanceSpecConResRequestRsp requests;

    public TaskInstanceSpecConResourceRsp withLimits(TaskInstanceSpecConResLimitRsp limits) {
        this.limits = limits;
        return this;
    }

    public TaskInstanceSpecConResourceRsp withLimits(Consumer<TaskInstanceSpecConResLimitRsp> limitsSetter) {
        if (this.limits == null) {
            this.limits = new TaskInstanceSpecConResLimitRsp();
            limitsSetter.accept(this.limits);
        }

        return this;
    }

    /**
     * Get limits
     * @return limits
     */
    public TaskInstanceSpecConResLimitRsp getLimits() {
        return limits;
    }

    public void setLimits(TaskInstanceSpecConResLimitRsp limits) {
        this.limits = limits;
    }

    public TaskInstanceSpecConResourceRsp withRequests(TaskInstanceSpecConResRequestRsp requests) {
        this.requests = requests;
        return this;
    }

    public TaskInstanceSpecConResourceRsp withRequests(Consumer<TaskInstanceSpecConResRequestRsp> requestsSetter) {
        if (this.requests == null) {
            this.requests = new TaskInstanceSpecConResRequestRsp();
            requestsSetter.accept(this.requests);
        }

        return this;
    }

    /**
     * Get requests
     * @return requests
     */
    public TaskInstanceSpecConResRequestRsp getRequests() {
        return requests;
    }

    public void setRequests(TaskInstanceSpecConResRequestRsp requests) {
        this.requests = requests;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskInstanceSpecConResourceRsp that = (TaskInstanceSpecConResourceRsp) obj;
        return Objects.equals(this.limits, that.limits) && Objects.equals(this.requests, that.requests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limits, requests);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInstanceSpecConResourceRsp {\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
