package com.huaweicloud.sdk.nat.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nat.v2.model.NatGatewayResponseBody;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListNatGatewaysResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nat_gateways")
    
    private List<NatGatewayResponseBody> natGateways = null;
    
    public ListNatGatewaysResponse withNatGateways(List<NatGatewayResponseBody> natGateways) {
        this.natGateways = natGateways;
        return this;
    }

    
    public ListNatGatewaysResponse addNatGatewaysItem(NatGatewayResponseBody natGatewaysItem) {
        this.natGateways.add(natGatewaysItem);
        return this;
    }

    public ListNatGatewaysResponse withNatGateways(Consumer<List<NatGatewayResponseBody>> natGatewaysSetter) {
        if(this.natGateways == null ){
            this.natGateways = new ArrayList<>();
        }
        natGatewaysSetter.accept(this.natGateways);
        return this;
    }

    /**
     * 查询公网NAT网关实例列表的响应体。 详见NatGateway字段说明。
     * @return natGateways
     */
    public List<NatGatewayResponseBody> getNatGateways() {
        return natGateways;
    }

    public void setNatGateways(List<NatGatewayResponseBody> natGateways) {
        this.natGateways = natGateways;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNatGatewaysResponse listNatGatewaysResponse = (ListNatGatewaysResponse) o;
        return Objects.equals(this.natGateways, listNatGatewaysResponse.natGateways);
    }
    @Override
    public int hashCode() {
        return Objects.hash(natGateways);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNatGatewaysResponse {\n");
        sb.append("    natGateways: ").append(toIndentedString(natGateways)).append("\n");
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

