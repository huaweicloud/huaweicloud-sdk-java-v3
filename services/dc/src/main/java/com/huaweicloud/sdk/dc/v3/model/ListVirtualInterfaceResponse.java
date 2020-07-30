package com.huaweicloud.sdk.dc.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dc.v3.model.VirtualInterfaceDict;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListVirtualInterfaceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="virtual_interfaces")
    
    private List<VirtualInterfaceDict> virtualInterfaces = null;
    
    public ListVirtualInterfaceResponse withVirtualInterfaces(List<VirtualInterfaceDict> virtualInterfaces) {
        this.virtualInterfaces = virtualInterfaces;
        return this;
    }

    
    public ListVirtualInterfaceResponse addVirtualInterfacesItem(VirtualInterfaceDict virtualInterfacesItem) {
        if (this.virtualInterfaces == null) {
            this.virtualInterfaces = new ArrayList<>();
        }
        this.virtualInterfaces.add(virtualInterfacesItem);
        return this;
    }

    public ListVirtualInterfaceResponse withVirtualInterfaces(Consumer<List<VirtualInterfaceDict>> virtualInterfacesSetter) {
        if(this.virtualInterfaces == null ){
            this.virtualInterfaces = new ArrayList<>();
        }
        virtualInterfacesSetter.accept(this.virtualInterfaces);
        return this;
    }

    /**
     * vvirtual_interfaces对象
     * @return virtualInterfaces
     */
    public List<VirtualInterfaceDict> getVirtualInterfaces() {
        return virtualInterfaces;
    }

    public void setVirtualInterfaces(List<VirtualInterfaceDict> virtualInterfaces) {
        this.virtualInterfaces = virtualInterfaces;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVirtualInterfaceResponse listVirtualInterfaceResponse = (ListVirtualInterfaceResponse) o;
        return Objects.equals(this.virtualInterfaces, listVirtualInterfaceResponse.virtualInterfaces);
    }
    @Override
    public int hashCode() {
        return Objects.hash(virtualInterfaces);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVirtualInterfaceResponse {\n");
        sb.append("    virtualInterfaces: ").append(toIndentedString(virtualInterfaces)).append("\n");
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

