package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteHookRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Repo-Auth")

    @JacksonXmlProperty(localName = "X-Repo-Auth")

    private String xRepoAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    @JacksonXmlProperty(localName = "project")

    private String project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hook_id")

    @JacksonXmlProperty(localName = "hook_id")

    private String hookId;

    public DeleteHookRequest withXRepoAuth(String xRepoAuth) {
        this.xRepoAuth = xRepoAuth;
        return this;
    }

    /**
     * 授权名称。
     * @return xRepoAuth
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Repo-Auth")
    public String getXRepoAuth() {
        return xRepoAuth;
    }

    public void setXRepoAuth(String xRepoAuth) {
        this.xRepoAuth = xRepoAuth;
    }

    public DeleteHookRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 组织ID。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public DeleteHookRequest withProject(String project) {
        this.project = project;
        return this;
    }

    /**
     * 仓库项目ID，如果含有“/”，需要将“/”替换为“:”。
     * @return project
     */
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public DeleteHookRequest withHookId(String hookId) {
        this.hookId = hookId;
        return this;
    }

    /**
     * hook ID。
     * @return hookId
     */
    public String getHookId() {
        return hookId;
    }

    public void setHookId(String hookId) {
        this.hookId = hookId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteHookRequest deleteHookRequest = (DeleteHookRequest) o;
        return Objects.equals(this.xRepoAuth, deleteHookRequest.xRepoAuth)
            && Objects.equals(this.namespace, deleteHookRequest.namespace)
            && Objects.equals(this.project, deleteHookRequest.project)
            && Objects.equals(this.hookId, deleteHookRequest.hookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xRepoAuth, namespace, project, hookId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteHookRequest {\n");
        sb.append("    xRepoAuth: ").append(toIndentedString(xRepoAuth)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
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
