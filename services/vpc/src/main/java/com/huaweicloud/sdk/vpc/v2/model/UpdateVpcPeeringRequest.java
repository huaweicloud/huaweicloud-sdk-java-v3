package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateVpcPeeringRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peering_id")

    private String peeringId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateVpcPeeringRequestBody body;

    public UpdateVpcPeeringRequest withPeeringId(String peeringId) {
        this.peeringId = peeringId;
        return this;
    }

    /**
     * 对等连接ID
     * @return peeringId
     */
    public String getPeeringId() {
        return peeringId;
    }

    public void setPeeringId(String peeringId) {
        this.peeringId = peeringId;
    }

    public UpdateVpcPeeringRequest withBody(UpdateVpcPeeringRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateVpcPeeringRequest withBody(Consumer<UpdateVpcPeeringRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateVpcPeeringRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateVpcPeeringRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateVpcPeeringRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVpcPeeringRequest updateVpcPeeringRequest = (UpdateVpcPeeringRequest) o;
        return Objects.equals(this.peeringId, updateVpcPeeringRequest.peeringId)
            && Objects.equals(this.body, updateVpcPeeringRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peeringId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcPeeringRequest {\n");
        sb.append("    peeringId: ").append(toIndentedString(peeringId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
