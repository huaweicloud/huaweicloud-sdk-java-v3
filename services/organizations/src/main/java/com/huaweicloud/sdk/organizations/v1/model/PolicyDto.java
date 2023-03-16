package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 包含有关策略的详细信息的结构。
 */
public class PolicyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_summary")

    private PolicySummaryDto policySummary;

    public PolicyDto withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 策略的文本内容。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public PolicyDto withPolicySummary(PolicySummaryDto policySummary) {
        this.policySummary = policySummary;
        return this;
    }

    public PolicyDto withPolicySummary(Consumer<PolicySummaryDto> policySummarySetter) {
        if (this.policySummary == null) {
            this.policySummary = new PolicySummaryDto();
            policySummarySetter.accept(this.policySummary);
        }

        return this;
    }

    /**
     * Get policySummary
     * @return policySummary
     */
    public PolicySummaryDto getPolicySummary() {
        return policySummary;
    }

    public void setPolicySummary(PolicySummaryDto policySummary) {
        this.policySummary = policySummary;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyDto policyDto = (PolicyDto) o;
        return Objects.equals(this.content, policyDto.content)
            && Objects.equals(this.policySummary, policyDto.policySummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, policySummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyDto {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    policySummary: ").append(toIndentedString(policySummary)).append("\n");
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
