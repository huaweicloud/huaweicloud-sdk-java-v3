package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteTestCasesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_async")

    private Boolean isAsync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteTestCaseInfo body;

    public BatchDeleteTestCasesRequest withIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }

    /**
     * 是否异步
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return isAsync;
    }

    public void setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
    }

    public BatchDeleteTestCasesRequest withBody(DeleteTestCaseInfo body) {
        this.body = body;
        return this;
    }

    public BatchDeleteTestCasesRequest withBody(Consumer<DeleteTestCaseInfo> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteTestCaseInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteTestCaseInfo getBody() {
        return body;
    }

    public void setBody(DeleteTestCaseInfo body) {
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
        BatchDeleteTestCasesRequest that = (BatchDeleteTestCasesRequest) obj;
        return Objects.equals(this.isAsync, that.isAsync) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAsync, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteTestCasesRequest {\n");
        sb.append("    isAsync: ").append(toIndentedString(isAsync)).append("\n");
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
