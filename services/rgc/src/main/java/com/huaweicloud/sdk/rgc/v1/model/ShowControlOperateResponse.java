package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowControlOperateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_operation")

    private ControlOperation controlOperation;

    public ShowControlOperateResponse withControlOperation(ControlOperation controlOperation) {
        this.controlOperation = controlOperation;
        return this;
    }

    public ShowControlOperateResponse withControlOperation(Consumer<ControlOperation> controlOperationSetter) {
        if (this.controlOperation == null) {
            this.controlOperation = new ControlOperation();
            controlOperationSetter.accept(this.controlOperation);
        }

        return this;
    }

    /**
     * Get controlOperation
     * @return controlOperation
     */
    public ControlOperation getControlOperation() {
        return controlOperation;
    }

    public void setControlOperation(ControlOperation controlOperation) {
        this.controlOperation = controlOperation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowControlOperateResponse that = (ShowControlOperateResponse) obj;
        return Objects.equals(this.controlOperation, that.controlOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controlOperation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowControlOperateResponse {\n");
        sb.append("    controlOperation: ").append(toIndentedString(controlOperation)).append("\n");
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
