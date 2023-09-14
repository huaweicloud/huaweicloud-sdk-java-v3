package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteDeviceControlsSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private Integer resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_desc")

    private String resultDesc;

    public ExecuteDeviceControlsSetResponse withResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 属性设置的响应码，具体为实际设备返回的响应码
     * minimum: 0
     * maximum: 600
     * @return resultCode
     */
    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public ExecuteDeviceControlsSetResponse withResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
        return this;
    }

    /**
     * 属性设置的描述，具体为实际设备返回的描述
     * @return resultDesc
     */
    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteDeviceControlsSetResponse that = (ExecuteDeviceControlsSetResponse) obj;
        return Objects.equals(this.resultCode, that.resultCode) && Objects.equals(this.resultDesc, that.resultDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultCode, resultDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteDeviceControlsSetResponse {\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    resultDesc: ").append(toIndentedString(resultDesc)).append("\n");
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
