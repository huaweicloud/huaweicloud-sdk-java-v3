package com.huaweicloud.sdk.dc.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dc.v3.model.VirtualGatewayDict;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListVirtualGatewaysResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="virtual_gateways")
    
    private List<VirtualGatewayDict> virtualGateways = null;
    
    public ListVirtualGatewaysResponse withVirtualGateways(List<VirtualGatewayDict> virtualGateways) {
        this.virtualGateways = virtualGateways;
        return this;
    }

    
    public ListVirtualGatewaysResponse addVirtualGatewaysItem(VirtualGatewayDict virtualGatewaysItem) {
        if (this.virtualGateways == null) {
            this.virtualGateways = new ArrayList<>();
        }
        this.virtualGateways.add(virtualGatewaysItem);
        return this;
    }

    public ListVirtualGatewaysResponse withVirtualGateways(Consumer<List<VirtualGatewayDict>> virtualGatewaysSetter) {
        if(this.virtualGateways == null ){
            this.virtualGateways = new ArrayList<>();
        }
        virtualGatewaysSetter.accept(this.virtualGateways);
        return this;
    }

    /**
     * virtual_gateways对象
     * @return virtualGateways
     */
    public List<VirtualGatewayDict> getVirtualGateways() {
        return virtualGateways;
    }

    public void setVirtualGateways(List<VirtualGatewayDict> virtualGateways) {
        this.virtualGateways = virtualGateways;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVirtualGatewaysResponse listVirtualGatewaysResponse = (ListVirtualGatewaysResponse) o;
        return Objects.equals(this.virtualGateways, listVirtualGatewaysResponse.virtualGateways);
    }
    @Override
    public int hashCode() {
        return Objects.hash(virtualGateways);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVirtualGatewaysResponse {\n");
        sb.append("    virtualGateways: ").append(toIndentedString(virtualGateways)).append("\n");
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

