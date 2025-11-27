package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTransitSubnetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_subnet_id")

    private String transitSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateTransitSubnetRequestBody body;

    public UpdateTransitSubnetRequest withTransitSubnetId(String transitSubnetId) {
        this.transitSubnetId = transitSubnetId;
        return this;
    }

    /**
     * 中转子网ID。
     * @return transitSubnetId
     */
    public String getTransitSubnetId() {
        return transitSubnetId;
    }

    public void setTransitSubnetId(String transitSubnetId) {
        this.transitSubnetId = transitSubnetId;
    }

    public UpdateTransitSubnetRequest withBody(UpdateTransitSubnetRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTransitSubnetRequest withBody(Consumer<UpdateTransitSubnetRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTransitSubnetRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateTransitSubnetRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTransitSubnetRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTransitSubnetRequest that = (UpdateTransitSubnetRequest) obj;
        return Objects.equals(this.transitSubnetId, that.transitSubnetId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitSubnetId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTransitSubnetRequest {\n");
        sb.append("    transitSubnetId: ").append(toIndentedString(transitSubnetId)).append("\n");
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
