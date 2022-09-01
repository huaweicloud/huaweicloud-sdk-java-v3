package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddHooksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    @JacksonXmlProperty(localName = "repository_name")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private RepositoryHookRequest body;

    public AddHooksRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 组名
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public AddHooksRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * 仓库名
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public AddHooksRequest withBody(RepositoryHookRequest body) {
        this.body = body;
        return this;
    }

    public AddHooksRequest withBody(Consumer<RepositoryHookRequest> bodySetter) {
        if (this.body == null) {
            this.body = new RepositoryHookRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RepositoryHookRequest getBody() {
        return body;
    }

    public void setBody(RepositoryHookRequest body) {
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
        AddHooksRequest addHooksRequest = (AddHooksRequest) o;
        return Objects.equals(this.groupName, addHooksRequest.groupName)
            && Objects.equals(this.repositoryName, addHooksRequest.repositoryName)
            && Objects.equals(this.body, addHooksRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, repositoryName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddHooksRequest {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
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
