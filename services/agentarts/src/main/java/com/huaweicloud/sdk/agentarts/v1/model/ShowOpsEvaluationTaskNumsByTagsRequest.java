package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowOpsEvaluationTaskNumsByTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private OpsQueryResourceInstancesFilterRequestBody body;

    public ShowOpsEvaluationTaskNumsByTagsRequest withBody(OpsQueryResourceInstancesFilterRequestBody body) {
        this.body = body;
        return this;
    }

    public ShowOpsEvaluationTaskNumsByTagsRequest withBody(
        Consumer<OpsQueryResourceInstancesFilterRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new OpsQueryResourceInstancesFilterRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public OpsQueryResourceInstancesFilterRequestBody getBody() {
        return body;
    }

    public void setBody(OpsQueryResourceInstancesFilterRequestBody body) {
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
        ShowOpsEvaluationTaskNumsByTagsRequest that = (ShowOpsEvaluationTaskNumsByTagsRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluationTaskNumsByTagsRequest {\n");
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
