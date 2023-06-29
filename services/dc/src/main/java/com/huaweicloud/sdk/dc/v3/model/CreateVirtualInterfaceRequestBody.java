package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建虚拟接口请求参数
 */
public class CreateVirtualInterfaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_interface")

    private CreateVirtualInterface virtualInterface;

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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVirtualInterfaceRequestBody that = (CreateVirtualInterfaceRequestBody) obj;
        return Objects.equals(this.virtualInterface, that.virtualInterface);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualInterface);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVirtualInterfaceRequestBody {\n");
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
