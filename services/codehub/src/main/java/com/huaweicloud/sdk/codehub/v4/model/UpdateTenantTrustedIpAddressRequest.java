package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTenantTrustedIpAddressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_id")

    private Integer ipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddTrustedIpAddressRequestBody body;

    public UpdateTenantTrustedIpAddressRequest withIpId(Integer ipId) {
        this.ipId = ipId;
        return this;
    }

    /**
     * **参数解释：** ip白名单id。
     * minimum: 1
     * maximum: 2147483647
     * @return ipId
     */
    public Integer getIpId() {
        return ipId;
    }

    public void setIpId(Integer ipId) {
        this.ipId = ipId;
    }

    public UpdateTenantTrustedIpAddressRequest withBody(AddTrustedIpAddressRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTenantTrustedIpAddressRequest withBody(Consumer<AddTrustedIpAddressRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AddTrustedIpAddressRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddTrustedIpAddressRequestBody getBody() {
        return body;
    }

    public void setBody(AddTrustedIpAddressRequestBody body) {
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
        UpdateTenantTrustedIpAddressRequest that = (UpdateTenantTrustedIpAddressRequest) obj;
        return Objects.equals(this.ipId, that.ipId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTenantTrustedIpAddressRequest {\n");
        sb.append("    ipId: ").append(toIndentedString(ipId)).append("\n");
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
