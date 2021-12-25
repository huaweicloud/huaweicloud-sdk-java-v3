package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** BranchList */
public class BranchList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branches")

    private List<Branch> branches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public BranchList withBranches(List<Branch> branches) {
        this.branches = branches;
        return this;
    }

    public BranchList addBranchesItem(Branch branchesItem) {
        if (this.branches == null) {
            this.branches = new ArrayList<>();
        }
        this.branches.add(branchesItem);
        return this;
    }

    public BranchList withBranches(Consumer<List<Branch>> branchesSetter) {
        if (this.branches == null) {
            this.branches = new ArrayList<>();
        }
        branchesSetter.accept(this.branches);
        return this;
    }

    /** 指定仓库的分支列表
     * 
     * @return branches */
    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public BranchList withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 指定仓库的分支总数
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BranchList branchList = (BranchList) o;
        return Objects.equals(this.branches, branchList.branches) && Objects.equals(this.total, branchList.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branches, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchList {\n");
        sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
