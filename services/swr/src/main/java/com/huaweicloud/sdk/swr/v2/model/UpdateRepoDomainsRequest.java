package com.huaweicloud.sdk.swr.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoDomainsRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateRepoDomainsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository")
    
    private String repository;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_domain")
    
    private String accessDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateRepoDomainsRequestBody body;

    public UpdateRepoDomainsRequest withNamespace(String namespace) {
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

    

    public UpdateRepoDomainsRequest withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    


    /**
     * Get repository
     * @return repository
     */
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    

    public UpdateRepoDomainsRequest withAccessDomain(String accessDomain) {
        this.accessDomain = accessDomain;
        return this;
    }

    


    /**
     * Get accessDomain
     * @return accessDomain
     */
    public String getAccessDomain() {
        return accessDomain;
    }

    public void setAccessDomain(String accessDomain) {
        this.accessDomain = accessDomain;
    }

    

    public UpdateRepoDomainsRequest withBody(UpdateRepoDomainsRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateRepoDomainsRequest withBody(Consumer<UpdateRepoDomainsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateRepoDomainsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateRepoDomainsRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateRepoDomainsRequestBody body) {
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
        UpdateRepoDomainsRequest updateRepoDomainsRequest = (UpdateRepoDomainsRequest) o;
        return Objects.equals(this.namespace, updateRepoDomainsRequest.namespace) &&
            Objects.equals(this.repository, updateRepoDomainsRequest.repository) &&
            Objects.equals(this.accessDomain, updateRepoDomainsRequest.accessDomain) &&
            Objects.equals(this.body, updateRepoDomainsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, repository, accessDomain, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRepoDomainsRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    accessDomain: ").append(toIndentedString(accessDomain)).append("\n");
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

