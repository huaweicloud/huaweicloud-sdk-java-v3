package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListIssueCustomFieldsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private ListIssueCustomFieldsRequestBody body;

    public ListIssueCustomFieldsRequest withProjectId(String projectId) {
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

    public ListIssueCustomFieldsRequest withBody(ListIssueCustomFieldsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListIssueCustomFieldsRequest withBody(Consumer<ListIssueCustomFieldsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListIssueCustomFieldsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListIssueCustomFieldsRequestBody getBody() {
        return body;
    }

    public void setBody(ListIssueCustomFieldsRequestBody body) {
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
        ListIssueCustomFieldsRequest listIssueCustomFieldsRequest = (ListIssueCustomFieldsRequest) o;
        return Objects.equals(this.projectId, listIssueCustomFieldsRequest.projectId)
            && Objects.equals(this.body, listIssueCustomFieldsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssueCustomFieldsRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
