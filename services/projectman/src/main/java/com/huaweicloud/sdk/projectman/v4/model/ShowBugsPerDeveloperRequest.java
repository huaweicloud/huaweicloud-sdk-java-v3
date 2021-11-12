package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ShowBugsPerDeveloperRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private MetricRequest2 body;

    public ShowBugsPerDeveloperRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** devcloud的项目ID
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowBugsPerDeveloperRequest withBody(MetricRequest2 body) {
        this.body = body;
        return this;
    }

    public ShowBugsPerDeveloperRequest withBody(Consumer<MetricRequest2> bodySetter) {
        if (this.body == null) {
            this.body = new MetricRequest2();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public MetricRequest2 getBody() {
        return body;
    }

    public void setBody(MetricRequest2 body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBugsPerDeveloperRequest showBugsPerDeveloperRequest = (ShowBugsPerDeveloperRequest) o;
        return Objects.equals(this.projectId, showBugsPerDeveloperRequest.projectId)
            && Objects.equals(this.body, showBugsPerDeveloperRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBugsPerDeveloperRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
