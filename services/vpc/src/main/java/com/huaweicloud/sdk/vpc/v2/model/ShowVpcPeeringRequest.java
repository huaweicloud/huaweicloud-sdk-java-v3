package com.huaweicloud.sdk.vpc.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowVpcPeeringRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="peering_id")
    
    private String peeringId;

    public ShowVpcPeeringRequest withPeeringId(String peeringId) {
        this.peeringId = peeringId;
        return this;
    }

    


    /**
     * Get peeringId
     * @return peeringId
     */
    public String getPeeringId() {
        return peeringId;
    }

    public void setPeeringId(String peeringId) {
        this.peeringId = peeringId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowVpcPeeringRequest showVpcPeeringRequest = (ShowVpcPeeringRequest) o;
        return Objects.equals(this.peeringId, showVpcPeeringRequest.peeringId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(peeringId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVpcPeeringRequest {\n");
        sb.append("    peeringId: ").append(toIndentedString(peeringId)).append("\n");
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

