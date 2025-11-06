package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowImageBlobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_uuid")

    private String repositoryUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    public ShowImageBlobRequest withRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
        return this;
    }

    /**
     * 仓库id
     * @return repositoryUuid
     */
    public String getRepositoryUuid() {
        return repositoryUuid;
    }

    public void setRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
    }

    public ShowImageBlobRequest withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * 分支名称
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ShowImageBlobRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 图片路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImageBlobRequest that = (ShowImageBlobRequest) obj;
        return Objects.equals(this.repositoryUuid, that.repositoryUuid)
            && Objects.equals(this.branchName, that.branchName) && Objects.equals(this.path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryUuid, branchName, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageBlobRequest {\n");
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
