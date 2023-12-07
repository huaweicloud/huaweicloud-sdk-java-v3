package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DisableControlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_operate_request_id")

    private String controlOperateRequestId;

    public DisableControlResponse withControlOperateRequestId(String controlOperateRequestId) {
        this.controlOperateRequestId = controlOperateRequestId;
        return this;
    }

    /**
     * 控制策略的操作ID。
     * @return controlOperateRequestId
     */
    public String getControlOperateRequestId() {
        return controlOperateRequestId;
    }

    public void setControlOperateRequestId(String controlOperateRequestId) {
        this.controlOperateRequestId = controlOperateRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisableControlResponse that = (DisableControlResponse) obj;
        return Objects.equals(this.controlOperateRequestId, that.controlOperateRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controlOperateRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisableControlResponse {\n");
        sb.append("    controlOperateRequestId: ").append(toIndentedString(controlOperateRequestId)).append("\n");
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
