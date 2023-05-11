package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowAggregateComplianceDetailsByPolicyAssignmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AggregateComplianceDetailRequest body;

    public ShowAggregateComplianceDetailsByPolicyAssignmentRequest withLimit(Integer limit) {
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

    public ShowAggregateComplianceDetailsByPolicyAssignmentRequest withMarker(String marker) {
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

    public ShowAggregateComplianceDetailsByPolicyAssignmentRequest withBody(AggregateComplianceDetailRequest body) {
        this.body = body;
        return this;
    }

    public ShowAggregateComplianceDetailsByPolicyAssignmentRequest withBody(
        Consumer<AggregateComplianceDetailRequest> bodySetter) {
        if (this.body == null) {
            this.body = new AggregateComplianceDetailRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AggregateComplianceDetailRequest getBody() {
        return body;
    }

    public void setBody(AggregateComplianceDetailRequest body) {
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
        ShowAggregateComplianceDetailsByPolicyAssignmentRequest showAggregateComplianceDetailsByPolicyAssignmentRequest =
            (ShowAggregateComplianceDetailsByPolicyAssignmentRequest) o;
        return Objects.equals(this.limit, showAggregateComplianceDetailsByPolicyAssignmentRequest.limit)
            && Objects.equals(this.marker, showAggregateComplianceDetailsByPolicyAssignmentRequest.marker)
            && Objects.equals(this.body, showAggregateComplianceDetailsByPolicyAssignmentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAggregateComplianceDetailsByPolicyAssignmentRequest {\n");
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
