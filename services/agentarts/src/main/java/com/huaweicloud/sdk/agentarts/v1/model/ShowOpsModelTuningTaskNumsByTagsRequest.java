package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowOpsModelTuningTaskNumsByTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ShowOpsModelTuningTaskNumsByTagsRequestBody body;

    public ShowOpsModelTuningTaskNumsByTagsRequest withBody(ShowOpsModelTuningTaskNumsByTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public ShowOpsModelTuningTaskNumsByTagsRequest withBody(
        Consumer<ShowOpsModelTuningTaskNumsByTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ShowOpsModelTuningTaskNumsByTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ShowOpsModelTuningTaskNumsByTagsRequestBody getBody() {
        return body;
    }

    public void setBody(ShowOpsModelTuningTaskNumsByTagsRequestBody body) {
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
        ShowOpsModelTuningTaskNumsByTagsRequest that = (ShowOpsModelTuningTaskNumsByTagsRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsModelTuningTaskNumsByTagsRequest {\n");
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
