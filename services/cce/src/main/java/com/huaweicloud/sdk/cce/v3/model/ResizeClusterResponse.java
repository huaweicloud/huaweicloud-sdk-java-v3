package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ResizeClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobID")

    private String jobID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderID")

    private String orderID;

    public ResizeClusterResponse withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    /**
     * 任务ID
     * @return jobID
     */
    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public ResizeClusterResponse withOrderID(String orderID) {
        this.orderID = orderID;
        return this;
    }

    /**
     * 包周期集群变更规格订单ID
     * @return orderID
     */
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeClusterResponse that = (ResizeClusterResponse) obj;
        return Objects.equals(this.jobID, that.jobID) && Objects.equals(this.orderID, that.orderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobID, orderID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeClusterResponse {\n");
        sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
        sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
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
