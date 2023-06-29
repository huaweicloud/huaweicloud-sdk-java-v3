package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowIssueCompletionRateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_completion_rates")

    private List<IssueCompletionRateV4IssueCompletionRates> issueCompletionRates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowIssueCompletionRateResponse withIssueCompletionRates(
        List<IssueCompletionRateV4IssueCompletionRates> issueCompletionRates) {
        this.issueCompletionRates = issueCompletionRates;
        return this;
    }

    public ShowIssueCompletionRateResponse addIssueCompletionRatesItem(
        IssueCompletionRateV4IssueCompletionRates issueCompletionRatesItem) {
        if (this.issueCompletionRates == null) {
            this.issueCompletionRates = new ArrayList<>();
        }
        this.issueCompletionRates.add(issueCompletionRatesItem);
        return this;
    }

    public ShowIssueCompletionRateResponse withIssueCompletionRates(
        Consumer<List<IssueCompletionRateV4IssueCompletionRates>> issueCompletionRatesSetter) {
        if (this.issueCompletionRates == null) {
            this.issueCompletionRates = new ArrayList<>();
        }
        issueCompletionRatesSetter.accept(this.issueCompletionRates);
        return this;
    }

    /**
     * 不同类型的工作项完成率
     * @return issueCompletionRates
     */
    public List<IssueCompletionRateV4IssueCompletionRates> getIssueCompletionRates() {
        return issueCompletionRates;
    }

    public void setIssueCompletionRates(List<IssueCompletionRateV4IssueCompletionRates> issueCompletionRates) {
        this.issueCompletionRates = issueCompletionRates;
    }

    public ShowIssueCompletionRateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIssueCompletionRateResponse that = (ShowIssueCompletionRateResponse) obj;
        return Objects.equals(this.issueCompletionRates, that.issueCompletionRates)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueCompletionRates, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIssueCompletionRateResponse {\n");
        sb.append("    issueCompletionRates: ").append(toIndentedString(issueCompletionRates)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
