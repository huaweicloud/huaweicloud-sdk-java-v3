package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建独享引擎代理请求体列表
 */
public class PremiumWafAgencyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name_list")

    private List<String> roleNameList = null;

    public PremiumWafAgencyRequest withRoleNameList(List<String> roleNameList) {
        this.roleNameList = roleNameList;
        return this;
    }

    public PremiumWafAgencyRequest addRoleNameListItem(String roleNameListItem) {
        if (this.roleNameList == null) {
            this.roleNameList = new ArrayList<>();
        }
        this.roleNameList.add(roleNameListItem);
        return this;
    }

    public PremiumWafAgencyRequest withRoleNameList(Consumer<List<String>> roleNameListSetter) {
        if (this.roleNameList == null) {
            this.roleNameList = new ArrayList<>();
        }
        roleNameListSetter.accept(this.roleNameList);
        return this;
    }

    /**
     * 具体代理策略名
     * @return roleNameList
     */
    public List<String> getRoleNameList() {
        return roleNameList;
    }

    public void setRoleNameList(List<String> roleNameList) {
        this.roleNameList = roleNameList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PremiumWafAgencyRequest that = (PremiumWafAgencyRequest) obj;
        return Objects.equals(this.roleNameList, that.roleNameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleNameList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PremiumWafAgencyRequest {\n");
        sb.append("    roleNameList: ").append(toIndentedString(roleNameList)).append("\n");
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
