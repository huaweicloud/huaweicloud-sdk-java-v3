package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateServerNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    @JacksonXmlProperty(localName = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private PutSourceServerBody body;

    public UpdateServerNameRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 源端服务器在主机迁移服务中的id
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public UpdateServerNameRequest withBody(PutSourceServerBody body) {
        this.body = body;
        return this;
    }

    public UpdateServerNameRequest withBody(Consumer<PutSourceServerBody> bodySetter) {
        if (this.body == null) {
            this.body = new PutSourceServerBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PutSourceServerBody getBody() {
        return body;
    }

    public void setBody(PutSourceServerBody body) {
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
        UpdateServerNameRequest updateServerNameRequest = (UpdateServerNameRequest) o;
        return Objects.equals(this.sourceId, updateServerNameRequest.sourceId)
            && Objects.equals(this.body, updateServerNameRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerNameRequest {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
