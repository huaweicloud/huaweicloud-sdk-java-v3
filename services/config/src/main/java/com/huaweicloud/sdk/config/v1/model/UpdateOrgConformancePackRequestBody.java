package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新组织合规规则包请求体。
 */
public class UpdateOrgConformancePackRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excluded_accounts")

    private List<String> excludedAccounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_structure")

    private List<VarsStructure> varsStructure = null;

    public UpdateOrgConformancePackRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组织合规规则包名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateOrgConformancePackRequestBody withExcludedAccounts(List<String> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
        return this;
    }

    public UpdateOrgConformancePackRequestBody addExcludedAccountsItem(String excludedAccountsItem) {
        if (this.excludedAccounts == null) {
            this.excludedAccounts = new ArrayList<>();
        }
        this.excludedAccounts.add(excludedAccountsItem);
        return this;
    }

    public UpdateOrgConformancePackRequestBody withExcludedAccounts(Consumer<List<String>> excludedAccountsSetter) {
        if (this.excludedAccounts == null) {
            this.excludedAccounts = new ArrayList<>();
        }
        excludedAccountsSetter.accept(this.excludedAccounts);
        return this;
    }

    /**
     * 排除配置合规包的帐号。
     * @return excludedAccounts
     */
    public List<String> getExcludedAccounts() {
        return excludedAccounts;
    }

    public void setExcludedAccounts(List<String> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
    }

    public UpdateOrgConformancePackRequestBody withVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
        return this;
    }

    public UpdateOrgConformancePackRequestBody addVarsStructureItem(VarsStructure varsStructureItem) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        this.varsStructure.add(varsStructureItem);
        return this;
    }

    public UpdateOrgConformancePackRequestBody withVarsStructure(Consumer<List<VarsStructure>> varsStructureSetter) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        varsStructureSetter.accept(this.varsStructure);
        return this;
    }

    /**
     * 合规规则包参数。
     * @return varsStructure
     */
    public List<VarsStructure> getVarsStructure() {
        return varsStructure;
    }

    public void setVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOrgConformancePackRequestBody that = (UpdateOrgConformancePackRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.excludedAccounts, that.excludedAccounts)
            && Objects.equals(this.varsStructure, that.varsStructure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, excludedAccounts, varsStructure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrgConformancePackRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    excludedAccounts: ").append(toIndentedString(excludedAccounts)).append("\n");
        sb.append("    varsStructure: ").append(toIndentedString(varsStructure)).append("\n");
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
