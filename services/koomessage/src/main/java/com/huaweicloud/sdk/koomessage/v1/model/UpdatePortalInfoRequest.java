package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePortalInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portal_id")

    private String portalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePortalInfoRequestBody body;

    public UpdatePortalInfoRequest withPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }

    /**
     * 主页ID。
     * @return portalId
     */
    public String getPortalId() {
        return portalId;
    }

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    public UpdatePortalInfoRequest withBody(UpdatePortalInfoRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePortalInfoRequest withBody(Consumer<UpdatePortalInfoRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePortalInfoRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePortalInfoRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePortalInfoRequestBody body) {
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
        UpdatePortalInfoRequest updatePortalInfoRequest = (UpdatePortalInfoRequest) o;
        return Objects.equals(this.portalId, updatePortalInfoRequest.portalId)
            && Objects.equals(this.body, updatePortalInfoRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portalId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePortalInfoRequest {\n");
        sb.append("    portalId: ").append(toIndentedString(portalId)).append("\n");
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
