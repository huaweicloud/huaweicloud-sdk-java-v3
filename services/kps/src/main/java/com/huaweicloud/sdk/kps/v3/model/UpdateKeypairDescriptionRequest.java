package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateKeypairDescriptionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair_name")

    @JacksonXmlProperty(localName = "keypair_name")

    private String keypairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateKeypairDescriptionRequestBody body;

    public UpdateKeypairDescriptionRequest withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    /**
     * 密钥对名称
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public UpdateKeypairDescriptionRequest withBody(UpdateKeypairDescriptionRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateKeypairDescriptionRequest withBody(Consumer<UpdateKeypairDescriptionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateKeypairDescriptionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateKeypairDescriptionRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateKeypairDescriptionRequestBody body) {
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
        UpdateKeypairDescriptionRequest updateKeypairDescriptionRequest = (UpdateKeypairDescriptionRequest) o;
        return Objects.equals(this.keypairName, updateKeypairDescriptionRequest.keypairName)
            && Objects.equals(this.body, updateKeypairDescriptionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypairName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeypairDescriptionRequest {\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
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
