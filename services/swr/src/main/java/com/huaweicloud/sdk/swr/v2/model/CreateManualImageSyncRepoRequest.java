package com.huaweicloud.sdk.swr.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.CreateManualImageSyncRepoRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateManualImageSyncRepoRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository")
    
    private String repository;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateManualImageSyncRepoRequestBody body = null;

    public CreateManualImageSyncRepoRequest withNamespace(String namespace) {
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

    public CreateManualImageSyncRepoRequest withRepository(String repository) {
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

    public CreateManualImageSyncRepoRequest withBody(CreateManualImageSyncRepoRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateManualImageSyncRepoRequest withBody(Consumer<CreateManualImageSyncRepoRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateManualImageSyncRepoRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateManualImageSyncRepoRequestBody getBody() {
        return body;
    }

    public void setBody(CreateManualImageSyncRepoRequestBody body) {
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
        CreateManualImageSyncRepoRequest createManualImageSyncRepoRequest = (CreateManualImageSyncRepoRequest) o;
        return Objects.equals(this.namespace, createManualImageSyncRepoRequest.namespace) &&
            Objects.equals(this.repository, createManualImageSyncRepoRequest.repository) &&
            Objects.equals(this.body, createManualImageSyncRepoRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, repository, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateManualImageSyncRepoRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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

