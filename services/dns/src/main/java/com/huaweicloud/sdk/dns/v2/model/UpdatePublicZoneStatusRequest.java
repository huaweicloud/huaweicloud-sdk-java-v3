package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePublicZoneStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePublicZoneStatusRequestBody body;

    public UpdatePublicZoneStatusRequest withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * 待设置状态Zone的ID
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public UpdatePublicZoneStatusRequest withBody(UpdatePublicZoneStatusRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePublicZoneStatusRequest withBody(Consumer<UpdatePublicZoneStatusRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePublicZoneStatusRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePublicZoneStatusRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePublicZoneStatusRequestBody body) {
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
        UpdatePublicZoneStatusRequest updatePublicZoneStatusRequest = (UpdatePublicZoneStatusRequest) o;
        return Objects.equals(this.zoneId, updatePublicZoneStatusRequest.zoneId)
            && Objects.equals(this.body, updatePublicZoneStatusRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicZoneStatusRequest {\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
