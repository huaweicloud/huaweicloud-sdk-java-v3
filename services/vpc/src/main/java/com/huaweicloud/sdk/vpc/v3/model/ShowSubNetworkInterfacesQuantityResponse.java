package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSubNetworkInterfacesQuantityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_network_interfaces")

    private Integer subNetworkInterfaces;

    public ShowSubNetworkInterfacesQuantityResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowSubNetworkInterfacesQuantityResponse withSubNetworkInterfaces(Integer subNetworkInterfaces) {
        this.subNetworkInterfaces = subNetworkInterfaces;
        return this;
    }

    /**
     * 辅助弹性网卡数目
     * @return subNetworkInterfaces
     */
    public Integer getSubNetworkInterfaces() {
        return subNetworkInterfaces;
    }

    public void setSubNetworkInterfaces(Integer subNetworkInterfaces) {
        this.subNetworkInterfaces = subNetworkInterfaces;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSubNetworkInterfacesQuantityResponse showSubNetworkInterfacesQuantityResponse =
            (ShowSubNetworkInterfacesQuantityResponse) o;
        return Objects.equals(this.requestId, showSubNetworkInterfacesQuantityResponse.requestId)
            && Objects.equals(this.subNetworkInterfaces, showSubNetworkInterfacesQuantityResponse.subNetworkInterfaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, subNetworkInterfaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubNetworkInterfacesQuantityResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    subNetworkInterfaces: ").append(toIndentedString(subNetworkInterfaces)).append("\n");
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
