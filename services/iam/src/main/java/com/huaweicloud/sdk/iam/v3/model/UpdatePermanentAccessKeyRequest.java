package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePermanentAccessKeyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    @JacksonXmlProperty(localName = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdatePermanentAccessKeyRequestBody body;

    public UpdatePermanentAccessKeyRequest withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * 待修改的指定AK。
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public UpdatePermanentAccessKeyRequest withBody(UpdatePermanentAccessKeyRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePermanentAccessKeyRequest withBody(Consumer<UpdatePermanentAccessKeyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePermanentAccessKeyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePermanentAccessKeyRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePermanentAccessKeyRequestBody body) {
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
        UpdatePermanentAccessKeyRequest updatePermanentAccessKeyRequest = (UpdatePermanentAccessKeyRequest) o;
        return Objects.equals(this.accessKey, updatePermanentAccessKeyRequest.accessKey)
            && Objects.equals(this.body, updatePermanentAccessKeyRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePermanentAccessKeyRequest {\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
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
