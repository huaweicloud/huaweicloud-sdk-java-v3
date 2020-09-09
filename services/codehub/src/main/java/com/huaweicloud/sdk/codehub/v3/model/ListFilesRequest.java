package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListFilesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository_uuid")
    
    private String repositoryUuid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="branch_name")
    
    private String branchName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;

    public ListFilesRequest withRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
        return this;
    }

    


    /**
     * Get repositoryUuid
     * @return repositoryUuid
     */
    public String getRepositoryUuid() {
        return repositoryUuid;
    }

    public void setRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
    }

    public ListFilesRequest withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    


    /**
     * Get branchName
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ListFilesRequest withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * Get path
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFilesRequest listFilesRequest = (ListFilesRequest) o;
        return Objects.equals(this.repositoryUuid, listFilesRequest.repositoryUuid) &&
            Objects.equals(this.branchName, listFilesRequest.branchName) &&
            Objects.equals(this.path, listFilesRequest.path);
    }
    @Override
    public int hashCode() {
        return Objects.hash(repositoryUuid, branchName, path);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFilesRequest {\n");
        sb.append("    repositoryUuid: ").append(toIndentedString(repositoryUuid)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

