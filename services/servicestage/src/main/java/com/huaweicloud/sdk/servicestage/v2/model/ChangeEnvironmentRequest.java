package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ChangeEnvironmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    @JacksonXmlProperty(localName = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private EnvironmentModify body;

    public ChangeEnvironmentRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * 环境ID。
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public ChangeEnvironmentRequest withBody(EnvironmentModify body) {
        this.body = body;
        return this;
    }

    public ChangeEnvironmentRequest withBody(Consumer<EnvironmentModify> bodySetter) {
        if (this.body == null) {
            this.body = new EnvironmentModify();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EnvironmentModify getBody() {
        return body;
    }

    public void setBody(EnvironmentModify body) {
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
        ChangeEnvironmentRequest changeEnvironmentRequest = (ChangeEnvironmentRequest) o;
        return Objects.equals(this.environmentId, changeEnvironmentRequest.environmentId)
            && Objects.equals(this.body, changeEnvironmentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environmentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeEnvironmentRequest {\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
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
