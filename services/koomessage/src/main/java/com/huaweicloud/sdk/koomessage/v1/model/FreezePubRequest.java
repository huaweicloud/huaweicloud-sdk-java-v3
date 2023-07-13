package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class FreezePubRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_id")

    private String pubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private FreezePubRequestBody body;

    public FreezePubRequest withPubId(String pubId) {
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

    public FreezePubRequest withBody(FreezePubRequestBody body) {
        this.body = body;
        return this;
    }

    public FreezePubRequest withBody(Consumer<FreezePubRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new FreezePubRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public FreezePubRequestBody getBody() {
        return body;
    }

    public void setBody(FreezePubRequestBody body) {
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
        FreezePubRequest that = (FreezePubRequest) obj;
        return Objects.equals(this.pubId, that.pubId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pubId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreezePubRequest {\n");
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
