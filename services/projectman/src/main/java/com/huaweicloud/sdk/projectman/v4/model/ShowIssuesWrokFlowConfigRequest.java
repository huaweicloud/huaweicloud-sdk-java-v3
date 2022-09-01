package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowIssuesWrokFlowConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    @JacksonXmlProperty(localName = "tracker_id")

    private Integer trackerId;

    public ShowIssuesWrokFlowConfigRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * devcloud项目的32位id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowIssuesWrokFlowConfigRequest withTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * 工作项类型id [2,3,4,5,6,7]
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
        ShowIssuesWrokFlowConfigRequest showIssuesWrokFlowConfigRequest = (ShowIssuesWrokFlowConfigRequest) o;
        return Objects.equals(this.projectId, showIssuesWrokFlowConfigRequest.projectId)
            && Objects.equals(this.trackerId, showIssuesWrokFlowConfigRequest.trackerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, trackerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIssuesWrokFlowConfigRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
