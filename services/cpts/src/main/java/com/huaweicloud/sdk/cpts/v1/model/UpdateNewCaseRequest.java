package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateNewCaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id")

    private Integer caseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CaseInfoDetail body;

    public UpdateNewCaseRequest withCaseId(Integer caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * 用例id
     * minimum: 0
     * maximum: 2147483647
     * @return caseId
     */
    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public UpdateNewCaseRequest withBody(CaseInfoDetail body) {
        this.body = body;
        return this;
    }

    public UpdateNewCaseRequest withBody(Consumer<CaseInfoDetail> bodySetter) {
        if (this.body == null) {
            this.body = new CaseInfoDetail();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CaseInfoDetail getBody() {
        return body;
    }

    public void setBody(CaseInfoDetail body) {
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
        UpdateNewCaseRequest updateNewCaseRequest = (UpdateNewCaseRequest) o;
        return Objects.equals(this.caseId, updateNewCaseRequest.caseId)
            && Objects.equals(this.body, updateNewCaseRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNewCaseRequest {\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
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
