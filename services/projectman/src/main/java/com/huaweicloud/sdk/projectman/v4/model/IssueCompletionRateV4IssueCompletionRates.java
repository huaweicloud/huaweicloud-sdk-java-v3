package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** IssueCompletionRateV4IssueCompletionRates */
public class IssueCompletionRateV4IssueCompletionRates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_status")

    private IssueCompletionRateV4IssueStatus issueStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private Integer trackerId;

    public IssueCompletionRateV4IssueCompletionRates withIssueStatus(IssueCompletionRateV4IssueStatus issueStatus) {
        this.issueStatus = issueStatus;
        return this;
    }

    public IssueCompletionRateV4IssueCompletionRates withIssueStatus(
        Consumer<IssueCompletionRateV4IssueStatus> issueStatusSetter) {
        if (this.issueStatus == null) {
            this.issueStatus = new IssueCompletionRateV4IssueStatus();
            issueStatusSetter.accept(this.issueStatus);
        }

        return this;
    }

    /** Get issueStatus
     * 
     * @return issueStatus */
    public IssueCompletionRateV4IssueStatus getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(IssueCompletionRateV4IssueStatus issueStatus) {
        this.issueStatus = issueStatus;
    }

    public IssueCompletionRateV4IssueCompletionRates withTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /** 工作项类型id,1需求,2任务/task,3缺陷/bug,5epic,6feature,7story
     * 
     * @return trackerId */
    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueCompletionRateV4IssueCompletionRates issueCompletionRateV4IssueCompletionRates =
            (IssueCompletionRateV4IssueCompletionRates) o;
        return Objects.equals(this.issueStatus, issueCompletionRateV4IssueCompletionRates.issueStatus)
            && Objects.equals(this.trackerId, issueCompletionRateV4IssueCompletionRates.trackerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueStatus, trackerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueCompletionRateV4IssueCompletionRates {\n");
        sb.append("    issueStatus: ").append(toIndentedString(issueStatus)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
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
