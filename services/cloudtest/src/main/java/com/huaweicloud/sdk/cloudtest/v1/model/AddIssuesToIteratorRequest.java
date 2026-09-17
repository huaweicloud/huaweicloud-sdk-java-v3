package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddIssuesToIteratorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_uri")

    private String iteratorUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private IssuesInfo body;

    public AddIssuesToIteratorRequest withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public AddIssuesToIteratorRequest withIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
        return this;
    }

    /**
     * 迭代uri
     * @return iteratorUri
     */
    public String getIteratorUri() {
        return iteratorUri;
    }

    public void setIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
    }

    public AddIssuesToIteratorRequest withBody(IssuesInfo body) {
        this.body = body;
        return this;
    }

    public AddIssuesToIteratorRequest withBody(Consumer<IssuesInfo> bodySetter) {
        if (this.body == null) {
            this.body = new IssuesInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public IssuesInfo getBody() {
        return body;
    }

    public void setBody(IssuesInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddIssuesToIteratorRequest that = (AddIssuesToIteratorRequest) obj;
        return Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.iteratorUri, that.iteratorUri)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUuid, iteratorUri, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddIssuesToIteratorRequest {\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    iteratorUri: ").append(toIndentedString(iteratorUri)).append("\n");
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
