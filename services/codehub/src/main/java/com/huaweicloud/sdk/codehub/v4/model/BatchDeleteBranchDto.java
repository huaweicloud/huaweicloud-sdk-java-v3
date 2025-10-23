package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteBranchDto
 */
public class BatchDeleteBranchDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branches")

    private List<String> branches = null;

    public BatchDeleteBranchDto withBranches(List<String> branches) {
        this.branches = branches;
        return this;
    }

    public BatchDeleteBranchDto addBranchesItem(String branchesItem) {
        if (this.branches == null) {
            this.branches = new ArrayList<>();
        }
        this.branches.add(branchesItem);
        return this;
    }

    public BatchDeleteBranchDto withBranches(Consumer<List<String>> branchesSetter) {
        if (this.branches == null) {
            this.branches = new ArrayList<>();
        }
        branchesSetter.accept(this.branches);
        return this;
    }

    /**
     * 分支列表
     * @return branches
     */
    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteBranchDto that = (BatchDeleteBranchDto) obj;
        return Objects.equals(this.branches, that.branches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteBranchDto {\n");
        sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
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
