package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BranchResponse
 */
public class BranchResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branches")

    private List<BranchesItem> branches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Double total;

    public BranchResponse withBranches(List<BranchesItem> branches) {
        this.branches = branches;
        return this;
    }

    public BranchResponse addBranchesItem(BranchesItem branchesItem) {
        if (this.branches == null) {
            this.branches = new ArrayList<>();
        }
        this.branches.add(branchesItem);
        return this;
    }

    public BranchResponse withBranches(Consumer<List<BranchesItem>> branchesSetter) {
        if (this.branches == null) {
            this.branches = new ArrayList<>();
        }
        branchesSetter.accept(this.branches);
        return this;
    }

    /**
     * 分支信息
     * @return branches
     */
    public List<BranchesItem> getBranches() {
        return branches;
    }

    public void setBranches(List<BranchesItem> branches) {
        this.branches = branches;
    }

    public BranchResponse withTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BranchResponse that = (BranchResponse) obj;
        return Objects.equals(this.branches, that.branches) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branches, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchResponse {\n");
        sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
