package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 项目工作项概览信息
 */
public class IssueCompletionRateResponseV4 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_status")

    private IssueStatusResponseV4 issueStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private Integer trackerId;

    public IssueCompletionRateResponseV4 withIssueStatus(IssueStatusResponseV4 issueStatus) {
        this.issueStatus = issueStatus;
        return this;
    }

    public IssueCompletionRateResponseV4 withIssueStatus(Consumer<IssueStatusResponseV4> issueStatusSetter) {
        if (this.issueStatus == null) {
            this.issueStatus = new IssueStatusResponseV4();
            issueStatusSetter.accept(this.issueStatus);
        }

        return this;
    }

    /**
     * Get issueStatus
     * @return issueStatus
     */
    public IssueStatusResponseV4 getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(IssueStatusResponseV4 issueStatus) {
        this.issueStatus = issueStatus;
    }

    public IssueCompletionRateResponseV4 withTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * 工作项类型,2任务/Task,3缺陷/Bug,5Epic,6Feature,7Story
     * @return trackerId
     */
    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueCompletionRateResponseV4 that = (IssueCompletionRateResponseV4) obj;
        return Objects.equals(this.issueStatus, that.issueStatus) && Objects.equals(this.trackerId, that.trackerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueStatus, trackerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueCompletionRateResponseV4 {\n");
        sb.append("    issueStatus: ").append(toIndentedString(issueStatus)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
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
