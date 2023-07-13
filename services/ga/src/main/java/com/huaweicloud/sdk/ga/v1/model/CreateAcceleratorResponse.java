package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAcceleratorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerator")

    private AcceleratorDetail accelerator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreateAcceleratorResponse withAccelerator(AcceleratorDetail accelerator) {
        this.accelerator = accelerator;
        return this;
    }

    public CreateAcceleratorResponse withAccelerator(Consumer<AcceleratorDetail> acceleratorSetter) {
        if (this.accelerator == null) {
            this.accelerator = new AcceleratorDetail();
            acceleratorSetter.accept(this.accelerator);
        }

        return this;
    }

    /**
     * Get accelerator
     * @return accelerator
     */
    public AcceleratorDetail getAccelerator() {
        return accelerator;
    }

    public void setAccelerator(AcceleratorDetail accelerator) {
        this.accelerator = accelerator;
    }

    public CreateAcceleratorResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAcceleratorResponse that = (CreateAcceleratorResponse) obj;
        return Objects.equals(this.accelerator, that.accelerator) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accelerator, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAcceleratorResponse {\n");
        sb.append("    accelerator: ").append(toIndentedString(accelerator)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
