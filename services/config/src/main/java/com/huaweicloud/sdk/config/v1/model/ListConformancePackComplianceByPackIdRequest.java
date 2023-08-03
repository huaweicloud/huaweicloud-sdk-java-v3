package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListConformancePackComplianceByPackIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conformance_pack_id")

    private String conformancePackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_name")

    private String policyAssignmentName;

    public ListConformancePackComplianceByPackIdRequest withConformancePackId(String conformancePackId) {
        this.conformancePackId = conformancePackId;
        return this;
    }

    /**
     * 合规规则包ID。
     * @return conformancePackId
     */
    public String getConformancePackId() {
        return conformancePackId;
    }

    public void setConformancePackId(String conformancePackId) {
        this.conformancePackId = conformancePackId;
    }

    public ListConformancePackComplianceByPackIdRequest withLimit(Integer limit) {
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

    public ListConformancePackComplianceByPackIdRequest withMarker(String marker) {
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

    public ListConformancePackComplianceByPackIdRequest withPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
        return this;
    }

    /**
     * 合规规则名称。
     * @return policyAssignmentName
     */
    public String getPolicyAssignmentName() {
        return policyAssignmentName;
    }

    public void setPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConformancePackComplianceByPackIdRequest that = (ListConformancePackComplianceByPackIdRequest) obj;
        return Objects.equals(this.conformancePackId, that.conformancePackId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.policyAssignmentName, that.policyAssignmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conformancePackId, limit, marker, policyAssignmentName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConformancePackComplianceByPackIdRequest {\n");
        sb.append("    conformancePackId: ").append(toIndentedString(conformancePackId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    policyAssignmentName: ").append(toIndentedString(policyAssignmentName)).append("\n");
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
