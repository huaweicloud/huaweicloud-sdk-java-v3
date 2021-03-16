package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.TagCreate;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateTagRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Repo-Auth")
    
    private String xRepoAuth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project")
    
    private String project;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ref")
    
    private String ref;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private TagCreate body;

    public CreateTagRequest withXRepoAuth(String xRepoAuth) {
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

    

    public CreateTagRequest withNamespace(String namespace) {
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

    

    public CreateTagRequest withProject(String project) {
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

    

    public CreateTagRequest withRef(String ref) {
        this.ref = ref;
        return this;
    }

    


    /**
     * Get ref
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    

    public CreateTagRequest withBody(TagCreate body) {
        this.body = body;
        return this;
    }

    public CreateTagRequest withBody(Consumer<TagCreate> bodySetter) {
        if(this.body == null ){
            this.body = new TagCreate();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public TagCreate getBody() {
        return body;
    }

    public void setBody(TagCreate body) {
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
        CreateTagRequest createTagRequest = (CreateTagRequest) o;
        return Objects.equals(this.xRepoAuth, createTagRequest.xRepoAuth) &&
            Objects.equals(this.namespace, createTagRequest.namespace) &&
            Objects.equals(this.project, createTagRequest.project) &&
            Objects.equals(this.ref, createTagRequest.ref) &&
            Objects.equals(this.body, createTagRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRepoAuth, namespace, project, ref, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTagRequest {\n");
        sb.append("    xRepoAuth: ").append(toIndentedString(xRepoAuth)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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

