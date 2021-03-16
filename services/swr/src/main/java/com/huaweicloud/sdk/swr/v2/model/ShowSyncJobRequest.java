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
public class ShowSyncJobRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository")
    
    private String repository;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="filter")
    
    private String filter;

    public ShowSyncJobRequest withNamespace(String namespace) {
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

    

    public ShowSyncJobRequest withRepository(String repository) {
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

    

    public ShowSyncJobRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    


    /**
     * Get filter
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSyncJobRequest showSyncJobRequest = (ShowSyncJobRequest) o;
        return Objects.equals(this.namespace, showSyncJobRequest.namespace) &&
            Objects.equals(this.repository, showSyncJobRequest.repository) &&
            Objects.equals(this.filter, showSyncJobRequest.filter);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, repository, filter);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSyncJobRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

