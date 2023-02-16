package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateAuthorizationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id")

    private String caseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateUserCenterAuthorizationV2Req body;

    public CreateAuthorizationRequest withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * 事件id
     * @return caseId
     */
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public CreateAuthorizationRequest withBody(CreateUserCenterAuthorizationV2Req body) {
        this.body = body;
        return this;
    }

    public CreateAuthorizationRequest withBody(Consumer<CreateUserCenterAuthorizationV2Req> bodySetter) {
        if (this.body == null) {
            this.body = new CreateUserCenterAuthorizationV2Req();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateUserCenterAuthorizationV2Req getBody() {
        return body;
    }

    public void setBody(CreateUserCenterAuthorizationV2Req body) {
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
        CreateAuthorizationRequest createAuthorizationRequest = (CreateAuthorizationRequest) o;
        return Objects.equals(this.caseId, createAuthorizationRequest.caseId)
            && Objects.equals(this.body, createAuthorizationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAuthorizationRequest {\n");
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
