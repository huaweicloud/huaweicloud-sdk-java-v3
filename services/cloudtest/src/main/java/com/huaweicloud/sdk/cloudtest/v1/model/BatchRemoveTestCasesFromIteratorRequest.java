package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchRemoveTestCasesFromIteratorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_id")

    private String iteratorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CaseRemoveInfo body;

    public BatchRemoveTestCasesFromIteratorRequest withIteratorId(String iteratorId) {
        this.iteratorId = iteratorId;
        return this;
    }

    /**
     * 迭代uri
     * @return iteratorId
     */
    public String getIteratorId() {
        return iteratorId;
    }

    public void setIteratorId(String iteratorId) {
        this.iteratorId = iteratorId;
    }

    public BatchRemoveTestCasesFromIteratorRequest withBody(CaseRemoveInfo body) {
        this.body = body;
        return this;
    }

    public BatchRemoveTestCasesFromIteratorRequest withBody(Consumer<CaseRemoveInfo> bodySetter) {
        if (this.body == null) {
            this.body = new CaseRemoveInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CaseRemoveInfo getBody() {
        return body;
    }

    public void setBody(CaseRemoveInfo body) {
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
        BatchRemoveTestCasesFromIteratorRequest that = (BatchRemoveTestCasesFromIteratorRequest) obj;
        return Objects.equals(this.iteratorId, that.iteratorId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iteratorId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRemoveTestCasesFromIteratorRequest {\n");
        sb.append("    iteratorId: ").append(toIndentedString(iteratorId)).append("\n");
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
