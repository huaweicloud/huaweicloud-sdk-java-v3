package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVirtualInterfaceRequestBody
 */
public class CreateVirtualInterfaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_interface")

    private CreateVirtualInterface virtualInterface;

    public CreateVirtualInterfaceRequestBody withRequestId(String requestId) {
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

    public CreateVirtualInterfaceRequestBody withVirtualInterface(CreateVirtualInterface virtualInterface) {
        this.virtualInterface = virtualInterface;
        return this;
    }

    public CreateVirtualInterfaceRequestBody withVirtualInterface(
        Consumer<CreateVirtualInterface> virtualInterfaceSetter) {
        if (this.virtualInterface == null) {
            this.virtualInterface = new CreateVirtualInterface();
            virtualInterfaceSetter.accept(this.virtualInterface);
        }

        return this;
    }

    /**
     * Get virtualInterface
     * @return virtualInterface
     */
    public CreateVirtualInterface getVirtualInterface() {
        return virtualInterface;
    }

    public void setVirtualInterface(CreateVirtualInterface virtualInterface) {
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
        CreateVirtualInterfaceRequestBody createVirtualInterfaceRequestBody = (CreateVirtualInterfaceRequestBody) o;
        return Objects.equals(this.requestId, createVirtualInterfaceRequestBody.requestId)
            && Objects.equals(this.virtualInterface, createVirtualInterfaceRequestBody.virtualInterface);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, virtualInterface);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVirtualInterfaceRequestBody {\n");
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
