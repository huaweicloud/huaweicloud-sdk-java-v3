package com.huaweicloud.sdk.vpc.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.VpcPeering;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateVpcPeeringResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="peering")
    
    private VpcPeering peering = null;

    public UpdateVpcPeeringResponse withPeering(VpcPeering peering) {
        this.peering = peering;
        return this;
    }

    public UpdateVpcPeeringResponse withPeering(Consumer<VpcPeering> peeringSetter) {
        if(this.peering == null ){
            this.peering = new VpcPeering();
            peeringSetter.accept(this.peering);
        }
        
        return this;
    }


    /**
     * Get peering
     * @return peering
     */
    public VpcPeering getPeering() {
        return peering;
    }

    public void setPeering(VpcPeering peering) {
        this.peering = peering;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVpcPeeringResponse updateVpcPeeringResponse = (UpdateVpcPeeringResponse) o;
        return Objects.equals(this.peering, updateVpcPeeringResponse.peering);
    }
    @Override
    public int hashCode() {
        return Objects.hash(peering);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcPeeringResponse {\n");
        sb.append("    peering: ").append(toIndentedString(peering)).append("\n");
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

