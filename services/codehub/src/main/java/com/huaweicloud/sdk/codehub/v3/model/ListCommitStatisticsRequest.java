package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListCommitStatisticsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private String repositoryId;

    public ListCommitStatisticsRequest withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /** 分支名
     * 
     * @return branchName */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ListCommitStatisticsRequest withRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /** 仓库的主键id
     * 
     * @return repositoryId */
    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCommitStatisticsRequest listCommitStatisticsRequest = (ListCommitStatisticsRequest) o;
        return Objects.equals(this.branchName, listCommitStatisticsRequest.branchName)
            && Objects.equals(this.repositoryId, listCommitStatisticsRequest.repositoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchName, repositoryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCommitStatisticsRequest {\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
