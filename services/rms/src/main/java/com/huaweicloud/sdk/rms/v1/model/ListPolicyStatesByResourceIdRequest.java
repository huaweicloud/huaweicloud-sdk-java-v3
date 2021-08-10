package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListPolicyStatesByResourceIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_state")

    private String complianceState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListPolicyStatesByResourceIdRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /** 资源ID
     * 
     * @return resourceId */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListPolicyStatesByResourceIdRequest withComplianceState(String complianceState) {
        this.complianceState = complianceState;
        return this;
    }

    /** 合规状态
     * 
     * @return complianceState */
    public String getComplianceState() {
        return complianceState;
    }

    public void setComplianceState(String complianceState) {
        this.complianceState = complianceState;
    }

    public ListPolicyStatesByResourceIdRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 最大的返回数量 minimum: 1 maximum: 200
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPolicyStatesByResourceIdRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 分页参数，通过上一个请求中返回的marker信息作为输入，获取当前页
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPolicyStatesByResourceIdRequest listPolicyStatesByResourceIdRequest =
            (ListPolicyStatesByResourceIdRequest) o;
        return Objects.equals(this.resourceId, listPolicyStatesByResourceIdRequest.resourceId)
            && Objects.equals(this.complianceState, listPolicyStatesByResourceIdRequest.complianceState)
            && Objects.equals(this.limit, listPolicyStatesByResourceIdRequest.limit)
            && Objects.equals(this.marker, listPolicyStatesByResourceIdRequest.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, complianceState, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyStatesByResourceIdRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
