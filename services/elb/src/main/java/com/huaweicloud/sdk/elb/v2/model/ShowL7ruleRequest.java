package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowL7ruleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy_id")

    private String l7policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7rule_id")

    private String l7ruleId;

    public ShowL7ruleRequest withL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
        return this;
    }

    /** 转发策略id
     * 
     * @return l7policyId */
    public String getL7policyId() {
        return l7policyId;
    }

    public void setL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
    }

    public ShowL7ruleRequest withL7ruleId(String l7ruleId) {
        this.l7ruleId = l7ruleId;
        return this;
    }

    /** 转发规则id
     * 
     * @return l7ruleId */
    public String getL7ruleId() {
        return l7ruleId;
    }

    public void setL7ruleId(String l7ruleId) {
        this.l7ruleId = l7ruleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowL7ruleRequest showL7ruleRequest = (ShowL7ruleRequest) o;
        return Objects.equals(this.l7policyId, showL7ruleRequest.l7policyId)
            && Objects.equals(this.l7ruleId, showL7ruleRequest.l7ruleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l7policyId, l7ruleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowL7ruleRequest {\n");
        sb.append("    l7policyId: ").append(toIndentedString(l7policyId)).append("\n");
        sb.append("    l7ruleId: ").append(toIndentedString(l7ruleId)).append("\n");
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
