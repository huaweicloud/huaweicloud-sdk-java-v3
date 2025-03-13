package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImportBuiltinCategoryParam
 */
public class ImportBuiltinCategoryParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_secrecy_level_list")

    private List<ImportRuleSecrecyLevelDto> ruleSecrecyLevelList = null;

    public ImportBuiltinCategoryParam withRuleSecrecyLevelList(List<ImportRuleSecrecyLevelDto> ruleSecrecyLevelList) {
        this.ruleSecrecyLevelList = ruleSecrecyLevelList;
        return this;
    }

    public ImportBuiltinCategoryParam addRuleSecrecyLevelListItem(ImportRuleSecrecyLevelDto ruleSecrecyLevelListItem) {
        if (this.ruleSecrecyLevelList == null) {
            this.ruleSecrecyLevelList = new ArrayList<>();
        }
        this.ruleSecrecyLevelList.add(ruleSecrecyLevelListItem);
        return this;
    }

    public ImportBuiltinCategoryParam withRuleSecrecyLevelList(
        Consumer<List<ImportRuleSecrecyLevelDto>> ruleSecrecyLevelListSetter) {
        if (this.ruleSecrecyLevelList == null) {
            this.ruleSecrecyLevelList = new ArrayList<>();
        }
        ruleSecrecyLevelListSetter.accept(this.ruleSecrecyLevelList);
        return this;
    }

    /**
     * 规则对应密级的列表，需要将所有未导入的内置规则导入。
     * @return ruleSecrecyLevelList
     */
    public List<ImportRuleSecrecyLevelDto> getRuleSecrecyLevelList() {
        return ruleSecrecyLevelList;
    }

    public void setRuleSecrecyLevelList(List<ImportRuleSecrecyLevelDto> ruleSecrecyLevelList) {
        this.ruleSecrecyLevelList = ruleSecrecyLevelList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportBuiltinCategoryParam that = (ImportBuiltinCategoryParam) obj;
        return Objects.equals(this.ruleSecrecyLevelList, that.ruleSecrecyLevelList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleSecrecyLevelList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportBuiltinCategoryParam {\n");
        sb.append("    ruleSecrecyLevelList: ").append(toIndentedString(ruleSecrecyLevelList)).append("\n");
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
