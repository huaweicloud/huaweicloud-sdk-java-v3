package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ModifyResourceInEnvironmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EnvironmentResourceModify body;

    public ModifyResourceInEnvironmentRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * 环境id
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public ModifyResourceInEnvironmentRequest withBody(EnvironmentResourceModify body) {
        this.body = body;
        return this;
    }

    public ModifyResourceInEnvironmentRequest withBody(Consumer<EnvironmentResourceModify> bodySetter) {
        if (this.body == null) {
            this.body = new EnvironmentResourceModify();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EnvironmentResourceModify getBody() {
        return body;
    }

    public void setBody(EnvironmentResourceModify body) {
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
        ModifyResourceInEnvironmentRequest modifyResourceInEnvironmentRequest = (ModifyResourceInEnvironmentRequest) o;
        return Objects.equals(this.environmentId, modifyResourceInEnvironmentRequest.environmentId)
            && Objects.equals(this.body, modifyResourceInEnvironmentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environmentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyResourceInEnvironmentRequest {\n");
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
