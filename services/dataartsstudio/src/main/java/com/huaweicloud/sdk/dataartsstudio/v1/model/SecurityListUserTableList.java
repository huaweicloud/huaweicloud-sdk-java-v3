package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取用户对某些表是否有权限的参数，如果有权限，那么返回这些表
 */
public class SecurityListUserTableList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_list")

    private List<SecurityListUserTableListTableList> tableList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proposer")

    private SecurityListUserTableListProposer proposer;

    public SecurityListUserTableList withTableList(List<SecurityListUserTableListTableList> tableList) {
        this.tableList = tableList;
        return this;
    }

    public SecurityListUserTableList addTableListItem(SecurityListUserTableListTableList tableListItem) {
        if (this.tableList == null) {
            this.tableList = new ArrayList<>();
        }
        this.tableList.add(tableListItem);
        return this;
    }

    public SecurityListUserTableList withTableList(Consumer<List<SecurityListUserTableListTableList>> tableListSetter) {
        if (this.tableList == null) {
            this.tableList = new ArrayList<>();
        }
        tableListSetter.accept(this.tableList);
        return this;
    }

    /**
     * 需要查询的表
     * @return tableList
     */
    public List<SecurityListUserTableListTableList> getTableList() {
        return tableList;
    }

    public void setTableList(List<SecurityListUserTableListTableList> tableList) {
        this.tableList = tableList;
    }

    public SecurityListUserTableList withProposer(SecurityListUserTableListProposer proposer) {
        this.proposer = proposer;
        return this;
    }

    public SecurityListUserTableList withProposer(Consumer<SecurityListUserTableListProposer> proposerSetter) {
        if (this.proposer == null) {
            this.proposer = new SecurityListUserTableListProposer();
            proposerSetter.accept(this.proposer);
        }

        return this;
    }

    /**
     * Get proposer
     * @return proposer
     */
    public SecurityListUserTableListProposer getProposer() {
        return proposer;
    }

    public void setProposer(SecurityListUserTableListProposer proposer) {
        this.proposer = proposer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityListUserTableList that = (SecurityListUserTableList) obj;
        return Objects.equals(this.tableList, that.tableList) && Objects.equals(this.proposer, that.proposer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableList, proposer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityListUserTableList {\n");
        sb.append("    tableList: ").append(toIndentedString(tableList)).append("\n");
        sb.append("    proposer: ").append(toIndentedString(proposer)).append("\n");
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
