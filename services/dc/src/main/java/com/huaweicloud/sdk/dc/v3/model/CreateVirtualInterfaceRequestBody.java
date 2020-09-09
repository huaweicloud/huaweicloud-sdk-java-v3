package com.huaweicloud.sdk.dc.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dc.v3.model.VirtualInterfaceDict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateVirtualInterfaceRequestBody
 */
public class CreateVirtualInterfaceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="virtual_interface")
    
    private VirtualInterfaceDict virtualInterface = null;

    public CreateVirtualInterfaceRequestBody withVirtualInterface(VirtualInterfaceDict virtualInterface) {
        this.virtualInterface = virtualInterface;
        return this;
    }

    public CreateVirtualInterfaceRequestBody withVirtualInterface(Consumer<VirtualInterfaceDict> virtualInterfaceSetter) {
        if(this.virtualInterface == null ){
            this.virtualInterface = new VirtualInterfaceDict();
            virtualInterfaceSetter.accept(this.virtualInterface);
        }
        
        return this;
    }


    /**
     * Get virtualInterface
     * @return virtualInterface
     */
    public VirtualInterfaceDict getVirtualInterface() {
        return virtualInterface;
    }

    public void setVirtualInterface(VirtualInterfaceDict virtualInterface) {
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
        return Objects.equals(this.virtualInterface, createVirtualInterfaceRequestBody.virtualInterface);
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

