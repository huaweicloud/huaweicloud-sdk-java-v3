package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateRequestResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private RequestStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dispatched_task_number")

    private Integer dispatchedTaskNumber;

    public CreateRequestResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * the unique id of the request
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateRequestResponse withStatus(RequestStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public CreateRequestResponse withDispatchedTaskNumber(Integer dispatchedTaskNumber) {
        this.dispatchedTaskNumber = dispatchedTaskNumber;
        return this;
    }

    /**
     * the number of tasks dispatched successfully
     * minimum: 0
     * maximum: 100
     * @return dispatchedTaskNumber
     */
    public Integer getDispatchedTaskNumber() {
        return dispatchedTaskNumber;
    }

    public void setDispatchedTaskNumber(Integer dispatchedTaskNumber) {
        this.dispatchedTaskNumber = dispatchedTaskNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRequestResponse createRequestResponse = (CreateRequestResponse) o;
        return Objects.equals(this.requestId, createRequestResponse.requestId)
            && Objects.equals(this.status, createRequestResponse.status)
            && Objects.equals(this.dispatchedTaskNumber, createRequestResponse.dispatchedTaskNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, status, dispatchedTaskNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRequestResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dispatchedTaskNumber: ").append(toIndentedString(dispatchedTaskNumber)).append("\n");
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
