package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBranchesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="branches")
    
    private List<String> branches = null;
    
    public ListBranchesResponse withBranches(List<String> branches) {
        this.branches = branches;
        return this;
    }

    
    public ListBranchesResponse addBranchesItem(String branchesItem) {
        if (this.branches == null) {
            this.branches = new ArrayList<>();
        }
        this.branches.add(branchesItem);
        return this;
    }

    public ListBranchesResponse withBranches(Consumer<List<String>> branchesSetter) {
        if(this.branches == null ){
            this.branches = new ArrayList<>();
        }
        branchesSetter.accept(this.branches);
        return this;
    }

    /**
     * 项目分支列表。
     * @return branches
     */
    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBranchesResponse listBranchesResponse = (ListBranchesResponse) o;
        return Objects.equals(this.branches, listBranchesResponse.branches);
    }
    @Override
    public int hashCode() {
        return Objects.hash(branches);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBranchesResponse {\n");
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

