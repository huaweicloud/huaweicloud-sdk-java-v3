package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListScalingV2PoliciesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_resource_id")

    private String scalingResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_name")

    private String scalingPolicyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_type")

    private String scalingPolicyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_id")

    private String scalingPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_number")

    private Integer startNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListScalingV2PoliciesRequest withScalingResourceId(String scalingResourceId) {
        this.scalingResourceId = scalingResourceId;
        return this;
    }

    /** 伸缩组ID。
     * 
     * @return scalingResourceId */
    public String getScalingResourceId() {
        return scalingResourceId;
    }

    public void setScalingResourceId(String scalingResourceId) {
        this.scalingResourceId = scalingResourceId;
    }

    public ListScalingV2PoliciesRequest withScalingPolicyName(String scalingPolicyName) {
        this.scalingPolicyName = scalingPolicyName;
        return this;
    }

    /** 伸缩策略名称。
     * 
     * @return scalingPolicyName */
    public String getScalingPolicyName() {
        return scalingPolicyName;
    }

    public void setScalingPolicyName(String scalingPolicyName) {
        this.scalingPolicyName = scalingPolicyName;
    }

    public ListScalingV2PoliciesRequest withScalingPolicyType(String scalingPolicyType) {
        this.scalingPolicyType = scalingPolicyType;
        return this;
    }

    /** 策略类型： - 告警策略：ALARM - 定时策略：SCHEDULED - 周期策略：RECURRENCE
     * 
     * @return scalingPolicyType */
    public String getScalingPolicyType() {
        return scalingPolicyType;
    }

    public void setScalingPolicyType(String scalingPolicyType) {
        this.scalingPolicyType = scalingPolicyType;
    }

    public ListScalingV2PoliciesRequest withScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
        return this;
    }

    /** 伸缩策略ID。
     * 
     * @return scalingPolicyId */
    public String getScalingPolicyId() {
        return scalingPolicyId;
    }

    public void setScalingPolicyId(String scalingPolicyId) {
        this.scalingPolicyId = scalingPolicyId;
    }

    public ListScalingV2PoliciesRequest withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    /** 查询的起始行号，默认为0。
     * 
     * @return startNumber */
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public ListScalingV2PoliciesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 查询记录数，默认20，最大100。 minimum: 0 maximum: 100
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingV2PoliciesRequest listScalingV2PoliciesRequest = (ListScalingV2PoliciesRequest) o;
        return Objects.equals(this.scalingResourceId, listScalingV2PoliciesRequest.scalingResourceId)
            && Objects.equals(this.scalingPolicyName, listScalingV2PoliciesRequest.scalingPolicyName)
            && Objects.equals(this.scalingPolicyType, listScalingV2PoliciesRequest.scalingPolicyType)
            && Objects.equals(this.scalingPolicyId, listScalingV2PoliciesRequest.scalingPolicyId)
            && Objects.equals(this.startNumber, listScalingV2PoliciesRequest.startNumber)
            && Objects.equals(this.limit, listScalingV2PoliciesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(scalingResourceId, scalingPolicyName, scalingPolicyType, scalingPolicyId, startNumber, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingV2PoliciesRequest {\n");
        sb.append("    scalingResourceId: ").append(toIndentedString(scalingResourceId)).append("\n");
        sb.append("    scalingPolicyName: ").append(toIndentedString(scalingPolicyName)).append("\n");
        sb.append("    scalingPolicyType: ").append(toIndentedString(scalingPolicyType)).append("\n");
        sb.append("    scalingPolicyId: ").append(toIndentedString(scalingPolicyId)).append("\n");
        sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
