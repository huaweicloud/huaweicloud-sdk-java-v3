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
public class ListSubfilesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository_uuid")
    
    private String repositoryUuid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="branch_name")
    
    private String branchName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;

    public ListSubfilesRequest withRepositoryUuid(String repositoryUuid) {
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

    public ListSubfilesRequest withBranchName(String branchName) {
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

    public ListSubfilesRequest withPath(String path) {
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

    public ListSubfilesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSubfilesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubfilesRequest listSubfilesRequest = (ListSubfilesRequest) o;
        return Objects.equals(this.repositoryUuid, listSubfilesRequest.repositoryUuid) &&
            Objects.equals(this.branchName, listSubfilesRequest.branchName) &&
            Objects.equals(this.path, listSubfilesRequest.path) &&
            Objects.equals(this.offset, listSubfilesRequest.offset) &&
            Objects.equals(this.limit, listSubfilesRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(repositoryUuid, branchName, path, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubfilesRequest {\n");
        sb.append("    repositoryUuid: ").append(toIndentedString(repositoryUuid)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

