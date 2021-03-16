package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.HookCreate;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateHookRequest  {



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
    @JsonProperty(value="body")
    
    private HookCreate body;

    public CreateHookRequest withXRepoAuth(String xRepoAuth) {
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

    

    public CreateHookRequest withNamespace(String namespace) {
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

    

    public CreateHookRequest withProject(String project) {
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

    

    public CreateHookRequest withBody(HookCreate body) {
        this.body = body;
        return this;
    }

    public CreateHookRequest withBody(Consumer<HookCreate> bodySetter) {
        if(this.body == null ){
            this.body = new HookCreate();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public HookCreate getBody() {
        return body;
    }

    public void setBody(HookCreate body) {
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
        CreateHookRequest createHookRequest = (CreateHookRequest) o;
        return Objects.equals(this.xRepoAuth, createHookRequest.xRepoAuth) &&
            Objects.equals(this.namespace, createHookRequest.namespace) &&
            Objects.equals(this.project, createHookRequest.project) &&
            Objects.equals(this.body, createHookRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRepoAuth, namespace, project, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHookRequest {\n");
        sb.append("    xRepoAuth: ").append(toIndentedString(xRepoAuth)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

