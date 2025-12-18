package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private InstanceState state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_state")

    private InstanceOperationStatus operationState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private ErrorStatus error;

    public ShowInstanceStatusResponse withState(InstanceState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public InstanceState getState() {
        return state;
    }

    public void setState(InstanceState state) {
        this.state = state;
    }

    public ShowInstanceStatusResponse withOperationState(InstanceOperationStatus operationState) {
        this.operationState = operationState;
        return this;
    }

    /**
     * Get operationState
     * @return operationState
     */
    public InstanceOperationStatus getOperationState() {
        return operationState;
    }

    public void setOperationState(InstanceOperationStatus operationState) {
        this.operationState = operationState;
    }

    public ShowInstanceStatusResponse withError(ErrorStatus error) {
        this.error = error;
        return this;
    }

    public ShowInstanceStatusResponse withError(Consumer<ErrorStatus> errorSetter) {
        if (this.error == null) {
            this.error = new ErrorStatus();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public ErrorStatus getError() {
        return error;
    }

    public void setError(ErrorStatus error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceStatusResponse that = (ShowInstanceStatusResponse) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.operationState, that.operationState)
            && Objects.equals(this.error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, operationState, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceStatusResponse {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    operationState: ").append(toIndentedString(operationState)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
