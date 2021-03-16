package com.huaweicloud.sdk.nat.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nat.v2.model.NatGatewayResponseBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateNatGatewayResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nat_gateway")
    
    private NatGatewayResponseBody natGateway;

    public UpdateNatGatewayResponse withNatGateway(NatGatewayResponseBody natGateway) {
        this.natGateway = natGateway;
        return this;
    }

    public UpdateNatGatewayResponse withNatGateway(Consumer<NatGatewayResponseBody> natGatewaySetter) {
        if(this.natGateway == null ){
            this.natGateway = new NatGatewayResponseBody();
            natGatewaySetter.accept(this.natGateway);
        }
        
        return this;
    }


    /**
     * Get natGateway
     * @return natGateway
     */
    public NatGatewayResponseBody getNatGateway() {
        return natGateway;
    }

    public void setNatGateway(NatGatewayResponseBody natGateway) {
        this.natGateway = natGateway;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNatGatewayResponse updateNatGatewayResponse = (UpdateNatGatewayResponse) o;
        return Objects.equals(this.natGateway, updateNatGatewayResponse.natGateway);
    }
    @Override
    public int hashCode() {
        return Objects.hash(natGateway);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatGatewayResponse {\n");
        sb.append("    natGateway: ").append(toIndentedString(natGateway)).append("\n");
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

