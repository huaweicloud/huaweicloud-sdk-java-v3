package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class KeystoneUpdateMappingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private KeystoneUpdateMappingRequestBody body;

    public KeystoneUpdateMappingRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 待更新的映射ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KeystoneUpdateMappingRequest withBody(KeystoneUpdateMappingRequestBody body) {
        this.body = body;
        return this;
    }

    public KeystoneUpdateMappingRequest withBody(Consumer<KeystoneUpdateMappingRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new KeystoneUpdateMappingRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public KeystoneUpdateMappingRequestBody getBody() {
        return body;
    }

    public void setBody(KeystoneUpdateMappingRequestBody body) {
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
        KeystoneUpdateMappingRequest keystoneUpdateMappingRequest = (KeystoneUpdateMappingRequest) o;
        return Objects.equals(this.id, keystoneUpdateMappingRequest.id)
            && Objects.equals(this.body, keystoneUpdateMappingRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateMappingRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
