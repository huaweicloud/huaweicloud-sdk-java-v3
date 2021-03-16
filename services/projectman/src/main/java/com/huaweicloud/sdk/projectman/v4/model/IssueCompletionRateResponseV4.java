package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.IssueStatusResponseV4;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 项目工作项概览信息
 */
public class IssueCompletionRateResponseV4  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issue_status")
    
    private IssueStatusResponseV4 issueStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_id")
    
    private Integer trackerId;

    public IssueCompletionRateResponseV4 withIssueStatus(IssueStatusResponseV4 issueStatus) {
        this.issueStatus = issueStatus;
        return this;
    }

    public IssueCompletionRateResponseV4 withIssueStatus(Consumer<IssueStatusResponseV4> issueStatusSetter) {
        if(this.issueStatus == null ){
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
     * 工作项类型,2任务/task,3缺陷/bug,5epic,6feature,7story
     * @return trackerId
     */
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
        IssueCompletionRateResponseV4 issueCompletionRateResponseV4 = (IssueCompletionRateResponseV4) o;
        return Objects.equals(this.issueStatus, issueCompletionRateResponseV4.issueStatus) &&
            Objects.equals(this.trackerId, issueCompletionRateResponseV4.trackerId);
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

