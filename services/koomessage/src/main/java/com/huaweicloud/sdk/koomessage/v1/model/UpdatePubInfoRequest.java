package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePubInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_id")

    private String pubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePubInfoRequestBody body;

    public UpdatePubInfoRequest withPubId(String pubId) {
        this.pubId = pubId;
        return this;
    }

    /**
     * 服务号ID。
     * @return pubId
     */
    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    public UpdatePubInfoRequest withBody(UpdatePubInfoRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePubInfoRequest withBody(Consumer<UpdatePubInfoRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePubInfoRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePubInfoRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePubInfoRequestBody body) {
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
        UpdatePubInfoRequest that = (UpdatePubInfoRequest) obj;
        return Objects.equals(this.pubId, that.pubId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pubId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePubInfoRequest {\n");
        sb.append("    pubId: ").append(toIndentedString(pubId)).append("\n");
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
