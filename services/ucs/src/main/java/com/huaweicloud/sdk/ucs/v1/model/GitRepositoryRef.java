package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GitRepositoryRef
 */
public class GitRepositoryRef {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    public GitRepositoryRef withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 用于指定要检出的Git分支。如果未定义其他字段，则默认检出'master'分支。
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GitRepositoryRef that = (GitRepositoryRef) obj;
        return Objects.equals(this.branch, that.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitRepositoryRef {\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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
