package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ChangeAvailabilityZoneRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EnterpriseRouterAZ body;

    public ChangeAvailabilityZoneRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * 企业路由器实例ID
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public ChangeAvailabilityZoneRequest withBody(EnterpriseRouterAZ body) {
        this.body = body;
        return this;
    }

    public ChangeAvailabilityZoneRequest withBody(Consumer<EnterpriseRouterAZ> bodySetter) {
        if (this.body == null) {
            this.body = new EnterpriseRouterAZ();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EnterpriseRouterAZ getBody() {
        return body;
    }

    public void setBody(EnterpriseRouterAZ body) {
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
        ChangeAvailabilityZoneRequest changeAvailabilityZoneRequest = (ChangeAvailabilityZoneRequest) o;
        return Objects.equals(this.erId, changeAvailabilityZoneRequest.erId)
            && Objects.equals(this.body, changeAvailabilityZoneRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeAvailabilityZoneRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
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
