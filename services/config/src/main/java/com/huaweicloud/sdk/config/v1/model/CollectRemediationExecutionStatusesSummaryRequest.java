package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CollectRemediationExecutionStatusesSummaryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_id")

    private String policyAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RemediationExecutionStatusesSummaryRequestBody body;

    public CollectRemediationExecutionStatusesSummaryRequest withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * 规则ID
     * @return policyAssignmentId
     */
    public String getPolicyAssignmentId() {
        return policyAssignmentId;
    }

    public void setPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
    }

    public CollectRemediationExecutionStatusesSummaryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 最大的返回数量
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public CollectRemediationExecutionStatusesSummaryRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页参数，通过上一个请求中返回的marker信息作为输入，获取当前页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public CollectRemediationExecutionStatusesSummaryRequest withBody(
        RemediationExecutionStatusesSummaryRequestBody body) {
        this.body = body;
        return this;
    }

    public CollectRemediationExecutionStatusesSummaryRequest withBody(
        Consumer<RemediationExecutionStatusesSummaryRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new RemediationExecutionStatusesSummaryRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RemediationExecutionStatusesSummaryRequestBody getBody() {
        return body;
    }

    public void setBody(RemediationExecutionStatusesSummaryRequestBody body) {
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
        CollectRemediationExecutionStatusesSummaryRequest that =
            (CollectRemediationExecutionStatusesSummaryRequest) obj;
        return Objects.equals(this.policyAssignmentId, that.policyAssignmentId)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyAssignmentId, limit, marker, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectRemediationExecutionStatusesSummaryRequest {\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
