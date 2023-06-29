package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Specifies parameters required for updating a virtual-interface.
 */
public class UpdateVirtualInterfaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_interface")

    private UpdateVirtualInterface virtualInterface;

    public UpdateVirtualInterfaceRequestBody withVirtualInterface(UpdateVirtualInterface virtualInterface) {
        this.virtualInterface = virtualInterface;
        return this;
    }

    public UpdateVirtualInterfaceRequestBody withVirtualInterface(
        Consumer<UpdateVirtualInterface> virtualInterfaceSetter) {
        if (this.virtualInterface == null) {
            this.virtualInterface = new UpdateVirtualInterface();
            virtualInterfaceSetter.accept(this.virtualInterface);
        }

        return this;
    }

    /**
     * Get virtualInterface
     * @return virtualInterface
     */
    public UpdateVirtualInterface getVirtualInterface() {
        return virtualInterface;
    }

    public void setVirtualInterface(UpdateVirtualInterface virtualInterface) {
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
        UpdateVirtualInterfaceRequestBody that = (UpdateVirtualInterfaceRequestBody) obj;
        return Objects.equals(this.virtualInterface, that.virtualInterface);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualInterface);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVirtualInterfaceRequestBody {\n");
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
