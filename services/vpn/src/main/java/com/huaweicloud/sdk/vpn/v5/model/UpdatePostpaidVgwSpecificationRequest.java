package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePostpaidVgwSpecificationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_id")

    private String vgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateVgwSpecificationRequestBody body;

    public UpdatePostpaidVgwSpecificationRequest withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * VPN网关实例ID
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    public UpdatePostpaidVgwSpecificationRequest withBody(UpdateVgwSpecificationRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePostpaidVgwSpecificationRequest withBody(Consumer<UpdateVgwSpecificationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateVgwSpecificationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateVgwSpecificationRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateVgwSpecificationRequestBody body) {
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
        UpdatePostpaidVgwSpecificationRequest that = (UpdatePostpaidVgwSpecificationRequest) obj;
        return Objects.equals(this.vgwId, that.vgwId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vgwId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePostpaidVgwSpecificationRequest {\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
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
