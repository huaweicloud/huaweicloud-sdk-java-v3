package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateClouddcnSubnetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clouddcn_subnet_id")

    private String clouddcnSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateClouddcnSubnetRequestBody body;

    public UpdateClouddcnSubnetRequest withClouddcnSubnetId(String clouddcnSubnetId) {
        this.clouddcnSubnetId = clouddcnSubnetId;
        return this;
    }

    /**
     * clouddcn子网ID
     * @return clouddcnSubnetId
     */
    public String getClouddcnSubnetId() {
        return clouddcnSubnetId;
    }

    public void setClouddcnSubnetId(String clouddcnSubnetId) {
        this.clouddcnSubnetId = clouddcnSubnetId;
    }

    public UpdateClouddcnSubnetRequest withBody(UpdateClouddcnSubnetRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateClouddcnSubnetRequest withBody(Consumer<UpdateClouddcnSubnetRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateClouddcnSubnetRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateClouddcnSubnetRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateClouddcnSubnetRequestBody body) {
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
        UpdateClouddcnSubnetRequest that = (UpdateClouddcnSubnetRequest) obj;
        return Objects.equals(this.clouddcnSubnetId, that.clouddcnSubnetId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clouddcnSubnetId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClouddcnSubnetRequest {\n");
        sb.append("    clouddcnSubnetId: ").append(toIndentedString(clouddcnSubnetId)).append("\n");
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
