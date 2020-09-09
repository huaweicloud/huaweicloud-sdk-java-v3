package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.UpdateVpcPeeringOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdateVpcPeeringRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="peering")
    
    private UpdateVpcPeeringOption peering = null;

    public UpdateVpcPeeringRequestBody withPeering(UpdateVpcPeeringOption peering) {
        this.peering = peering;
        return this;
    }

    public UpdateVpcPeeringRequestBody withPeering(Consumer<UpdateVpcPeeringOption> peeringSetter) {
        if(this.peering == null ){
            this.peering = new UpdateVpcPeeringOption();
            peeringSetter.accept(this.peering);
        }
        
        return this;
    }


    /**
     * Get peering
     * @return peering
     */
    public UpdateVpcPeeringOption getPeering() {
        return peering;
    }

    public void setPeering(UpdateVpcPeeringOption peering) {
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
        UpdateVpcPeeringRequestBody updateVpcPeeringRequestBody = (UpdateVpcPeeringRequestBody) o;
        return Objects.equals(this.peering, updateVpcPeeringRequestBody.peering);
    }
    @Override
    public int hashCode() {
        return Objects.hash(peering);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcPeeringRequestBody {\n");
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

