package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AssociatePublicipsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    @JacksonXmlProperty(localName = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private AssociatePublicipsRequestBody body;

    public AssociatePublicipsRequest withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 弹性公网IP的ID
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public AssociatePublicipsRequest withBody(AssociatePublicipsRequestBody body) {
        this.body = body;
        return this;
    }

    public AssociatePublicipsRequest withBody(Consumer<AssociatePublicipsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AssociatePublicipsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AssociatePublicipsRequestBody getBody() {
        return body;
    }

    public void setBody(AssociatePublicipsRequestBody body) {
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
        AssociatePublicipsRequest associatePublicipsRequest = (AssociatePublicipsRequest) o;
        return Objects.equals(this.publicipId, associatePublicipsRequest.publicipId)
            && Objects.equals(this.body, associatePublicipsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociatePublicipsRequest {\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
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
