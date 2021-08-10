package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowProjectSummaryV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bug_statistics")

    private List<BugStatisticResponseV4> bugStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demand_statistics")

    private List<DemandStatisticResponseV4> demandStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_completion_rates")

    private List<IssueCompletionRateResponseV4> issueCompletionRates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ShowProjectSummaryV4Response withBugStatistics(List<BugStatisticResponseV4> bugStatistics) {
        this.bugStatistics = bugStatistics;
        return this;
    }

    public ShowProjectSummaryV4Response addBugStatisticsItem(BugStatisticResponseV4 bugStatisticsItem) {
        if (this.bugStatistics == null) {
            this.bugStatistics = new ArrayList<>();
        }
        this.bugStatistics.add(bugStatisticsItem);
        return this;
    }

    public ShowProjectSummaryV4Response withBugStatistics(Consumer<List<BugStatisticResponseV4>> bugStatisticsSetter) {
        if (this.bugStatistics == null) {
            this.bugStatistics = new ArrayList<>();
        }
        bugStatisticsSetter.accept(this.bugStatistics);
        return this;
    }

    /** bug统计列表
     * 
     * @return bugStatistics */
    public List<BugStatisticResponseV4> getBugStatistics() {
        return bugStatistics;
    }

    public void setBugStatistics(List<BugStatisticResponseV4> bugStatistics) {
        this.bugStatistics = bugStatistics;
    }

    public ShowProjectSummaryV4Response withDemandStatistics(List<DemandStatisticResponseV4> demandStatistics) {
        this.demandStatistics = demandStatistics;
        return this;
    }

    public ShowProjectSummaryV4Response addDemandStatisticsItem(DemandStatisticResponseV4 demandStatisticsItem) {
        if (this.demandStatistics == null) {
            this.demandStatistics = new ArrayList<>();
        }
        this.demandStatistics.add(demandStatisticsItem);
        return this;
    }

    public ShowProjectSummaryV4Response withDemandStatistics(
        Consumer<List<DemandStatisticResponseV4>> demandStatisticsSetter) {
        if (this.demandStatistics == null) {
            this.demandStatistics = new ArrayList<>();
        }
        demandStatisticsSetter.accept(this.demandStatistics);
        return this;
    }

    /** 按模块统计列表
     * 
     * @return demandStatistics */
    public List<DemandStatisticResponseV4> getDemandStatistics() {
        return demandStatistics;
    }

    public void setDemandStatistics(List<DemandStatisticResponseV4> demandStatistics) {
        this.demandStatistics = demandStatistics;
    }

    public ShowProjectSummaryV4Response withIssueCompletionRates(
        List<IssueCompletionRateResponseV4> issueCompletionRates) {
        this.issueCompletionRates = issueCompletionRates;
        return this;
    }

    public ShowProjectSummaryV4Response addIssueCompletionRatesItem(
        IssueCompletionRateResponseV4 issueCompletionRatesItem) {
        if (this.issueCompletionRates == null) {
            this.issueCompletionRates = new ArrayList<>();
        }
        this.issueCompletionRates.add(issueCompletionRatesItem);
        return this;
    }

    public ShowProjectSummaryV4Response withIssueCompletionRates(
        Consumer<List<IssueCompletionRateResponseV4>> issueCompletionRatesSetter) {
        if (this.issueCompletionRates == null) {
            this.issueCompletionRates = new ArrayList<>();
        }
        issueCompletionRatesSetter.accept(this.issueCompletionRates);
        return this;
    }

    /** 按工作项类型统计列表
     * 
     * @return issueCompletionRates */
    public List<IssueCompletionRateResponseV4> getIssueCompletionRates() {
        return issueCompletionRates;
    }

    public void setIssueCompletionRates(List<IssueCompletionRateResponseV4> issueCompletionRates) {
        this.issueCompletionRates = issueCompletionRates;
    }

    public ShowProjectSummaryV4Response withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目id
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProjectSummaryV4Response showProjectSummaryV4Response = (ShowProjectSummaryV4Response) o;
        return Objects.equals(this.bugStatistics, showProjectSummaryV4Response.bugStatistics)
            && Objects.equals(this.demandStatistics, showProjectSummaryV4Response.demandStatistics)
            && Objects.equals(this.issueCompletionRates, showProjectSummaryV4Response.issueCompletionRates)
            && Objects.equals(this.projectId, showProjectSummaryV4Response.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugStatistics, demandStatistics, issueCompletionRates, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectSummaryV4Response {\n");
        sb.append("    bugStatistics: ").append(toIndentedString(bugStatistics)).append("\n");
        sb.append("    demandStatistics: ").append(toIndentedString(demandStatistics)).append("\n");
        sb.append("    issueCompletionRates: ").append(toIndentedString(issueCompletionRates)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
