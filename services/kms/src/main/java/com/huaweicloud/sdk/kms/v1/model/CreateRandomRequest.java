package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateRandomRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    @JacksonXmlProperty(localName = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private GenRandomRequestBody body;

    public CreateRandomRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * API版本号
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public CreateRandomRequest withBody(GenRandomRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateRandomRequest withBody(Consumer<GenRandomRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new GenRandomRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public GenRandomRequestBody getBody() {
        return body;
    }

    public void setBody(GenRandomRequestBody body) {
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
        CreateRandomRequest createRandomRequest = (CreateRandomRequest) o;
        return Objects.equals(this.versionId, createRandomRequest.versionId)
            && Objects.equals(this.body, createRandomRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRandomRequest {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
