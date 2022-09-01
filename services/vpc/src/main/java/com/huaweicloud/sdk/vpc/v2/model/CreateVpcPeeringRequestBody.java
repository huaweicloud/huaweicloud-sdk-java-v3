package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class CreateVpcPeeringRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peering")

    @JacksonXmlProperty(localName = "peering")

    private CreateVpcPeeringOption peering;

    public CreateVpcPeeringRequestBody withPeering(CreateVpcPeeringOption peering) {
        this.peering = peering;
        return this;
    }

    public CreateVpcPeeringRequestBody withPeering(Consumer<CreateVpcPeeringOption> peeringSetter) {
        if (this.peering == null) {
            this.peering = new CreateVpcPeeringOption();
            peeringSetter.accept(this.peering);
        }

        return this;
    }

    /**
     * Get peering
     * @return peering
     */
    public CreateVpcPeeringOption getPeering() {
        return peering;
    }

    public void setPeering(CreateVpcPeeringOption peering) {
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
        CreateVpcPeeringRequestBody createVpcPeeringRequestBody = (CreateVpcPeeringRequestBody) o;
        return Objects.equals(this.peering, createVpcPeeringRequestBody.peering);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peering);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcPeeringRequestBody {\n");
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
