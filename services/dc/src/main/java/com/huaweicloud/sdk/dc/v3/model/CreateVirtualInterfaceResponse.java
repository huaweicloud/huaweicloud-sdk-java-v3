package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateVirtualInterfaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_interface")

    private VirtualInterface virtualInterface;

    public CreateVirtualInterfaceResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 操作请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateVirtualInterfaceResponse withVirtualInterface(VirtualInterface virtualInterface) {
        this.virtualInterface = virtualInterface;
        return this;
    }

    public CreateVirtualInterfaceResponse withVirtualInterface(Consumer<VirtualInterface> virtualInterfaceSetter) {
        if (this.virtualInterface == null) {
            this.virtualInterface = new VirtualInterface();
            virtualInterfaceSetter.accept(this.virtualInterface);
        }

        return this;
    }

    /**
     * Get virtualInterface
     * @return virtualInterface
     */
    public VirtualInterface getVirtualInterface() {
        return virtualInterface;
    }

    public void setVirtualInterface(VirtualInterface virtualInterface) {
        this.virtualInterface = virtualInterface;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVirtualInterfaceResponse createVirtualInterfaceResponse = (CreateVirtualInterfaceResponse) o;
        return Objects.equals(this.requestId, createVirtualInterfaceResponse.requestId)
            && Objects.equals(this.virtualInterface, createVirtualInterfaceResponse.virtualInterface);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, virtualInterface);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVirtualInterfaceResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    virtualInterface: ").append(toIndentedString(virtualInterface)).append("\n");
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
