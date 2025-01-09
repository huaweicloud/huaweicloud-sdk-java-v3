package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateSubnetIdsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateSubnetIdsRequestBody body;

    public UpdateSubnetIdsRequest withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 站点ID。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public UpdateSubnetIdsRequest withBody(UpdateSubnetIdsRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateSubnetIdsRequest withBody(Consumer<UpdateSubnetIdsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateSubnetIdsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateSubnetIdsRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateSubnetIdsRequestBody body) {
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
        UpdateSubnetIdsRequest that = (UpdateSubnetIdsRequest) obj;
        return Objects.equals(this.siteId, that.siteId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubnetIdsRequest {\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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
