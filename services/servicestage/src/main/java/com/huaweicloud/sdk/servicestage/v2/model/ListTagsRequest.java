package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Repo-Auth")
    
    private String xRepoAuth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project")
    
    private String project;

    public ListTagsRequest withXRepoAuth(String xRepoAuth) {
        this.xRepoAuth = xRepoAuth;
        return this;
    }

    


    /**
     * Get xRepoAuth
     * @return xRepoAuth
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Repo-Auth")
    public String getXRepoAuth() {
        return xRepoAuth;
    }

    public void setXRepoAuth(String xRepoAuth) {
        this.xRepoAuth = xRepoAuth;
    }

    

    public ListTagsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * Get namespace
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public ListTagsRequest withProject(String project) {
        this.project = project;
        return this;
    }

    


    /**
     * Get project
     * @return project
     */
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTagsRequest listTagsRequest = (ListTagsRequest) o;
        return Objects.equals(this.xRepoAuth, listTagsRequest.xRepoAuth) &&
            Objects.equals(this.namespace, listTagsRequest.namespace) &&
            Objects.equals(this.project, listTagsRequest.project);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRepoAuth, namespace, project);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagsRequest {\n");
        sb.append("    xRepoAuth: ").append(toIndentedString(xRepoAuth)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

