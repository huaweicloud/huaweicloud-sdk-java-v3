package com.huaweicloud.sdk.swr.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowRetentionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository")
    
    private String repository;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retention_id")
    
    private Integer retentionId;

    public ShowRetentionRequest withNamespace(String namespace) {
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

    

    public ShowRetentionRequest withRepository(String repository) {
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

    

    public ShowRetentionRequest withRetentionId(Integer retentionId) {
        this.retentionId = retentionId;
        return this;
    }

    


    /**
     * Get retentionId
     * @return retentionId
     */
    public Integer getRetentionId() {
        return retentionId;
    }

    public void setRetentionId(Integer retentionId) {
        this.retentionId = retentionId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRetentionRequest showRetentionRequest = (ShowRetentionRequest) o;
        return Objects.equals(this.namespace, showRetentionRequest.namespace) &&
            Objects.equals(this.repository, showRetentionRequest.repository) &&
            Objects.equals(this.retentionId, showRetentionRequest.retentionId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, repository, retentionId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRetentionRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    retentionId: ").append(toIndentedString(retentionId)).append("\n");
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

