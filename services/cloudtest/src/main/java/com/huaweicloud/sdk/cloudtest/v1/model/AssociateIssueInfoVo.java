package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 关联需求信息
 */
public class AssociateIssueInfoVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate")

    private Boolean associate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private String trackerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "board_id")

    private String boardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_name")

    private String trackerName;

    public AssociateIssueInfoVo withAssociate(Boolean associate) {
        this.associate = associate;
        return this;
    }

    /**
     * 是否已关联
     * @return associate
     */
    public Boolean getAssociate() {
        return associate;
    }

    public void setAssociate(Boolean associate) {
        this.associate = associate;
    }

    public AssociateIssueInfoVo withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 需求ID
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public AssociateIssueInfoVo withTrackerId(String trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * 需求类型
     * @return trackerId
     */
    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
    }

    public AssociateIssueInfoVo withBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }

    /**
     * 工作项层级ID
     * @return boardId
     */
    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public AssociateIssueInfoVo withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    /**
     * 需求类型名称
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateIssueInfoVo that = (AssociateIssueInfoVo) obj;
        return Objects.equals(this.associate, that.associate) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.trackerId, that.trackerId) && Objects.equals(this.boardId, that.boardId)
            && Objects.equals(this.trackerName, that.trackerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associate, issueId, trackerId, boardId, trackerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateIssueInfoVo {\n");
        sb.append("    associate: ").append(toIndentedString(associate)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
        sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
        sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
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
