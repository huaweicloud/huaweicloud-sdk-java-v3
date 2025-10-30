package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 口令策略二级标签信息
 */
public class PwdCheckSubTagInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tag")

    private String subTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checked")

    private String checked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_ids")

    private List<String> checkRuleIds = null;

    public PwdCheckSubTagInfo withSubTag(String subTag) {
        this.subTag = subTag;
        return this;
    }

    /**
     * **参数解释** 口令检测二级tag **取值范围** - weakpwd - pwdcomplexity
     * @return subTag
     */
    public String getSubTag() {
        return subTag;
    }

    public void setSubTag(String subTag) {
        this.subTag = subTag;
    }

    public PwdCheckSubTagInfo withChecked(String checked) {
        this.checked = checked;
        return this;
    }

    /**
     * **参数解释** 检测范围。 **取值范围** - true: 如果sub_tag有值,则二级标签sub_tag下所有的检测项都会检测 - false: 如果sub_tag有值，则二级标签sub_tag下所有的检测项都不会检测。 - indeterminate: 部分检测，由check_rule_ids决定具体检测项。
     * @return checked
     */
    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public PwdCheckSubTagInfo withCheckRuleIds(List<String> checkRuleIds) {
        this.checkRuleIds = checkRuleIds;
        return this;
    }

    public PwdCheckSubTagInfo addCheckRuleIdsItem(String checkRuleIdsItem) {
        if (this.checkRuleIds == null) {
            this.checkRuleIds = new ArrayList<>();
        }
        this.checkRuleIds.add(checkRuleIdsItem);
        return this;
    }

    public PwdCheckSubTagInfo withCheckRuleIds(Consumer<List<String>> checkRuleIdsSetter) {
        if (this.checkRuleIds == null) {
            this.checkRuleIds = new ArrayList<>();
        }
        checkRuleIdsSetter.accept(this.checkRuleIds);
        return this;
    }

    /**
     * 检测项列表
     * @return checkRuleIds
     */
    public List<String> getCheckRuleIds() {
        return checkRuleIds;
    }

    public void setCheckRuleIds(List<String> checkRuleIds) {
        this.checkRuleIds = checkRuleIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PwdCheckSubTagInfo that = (PwdCheckSubTagInfo) obj;
        return Objects.equals(this.subTag, that.subTag) && Objects.equals(this.checked, that.checked)
            && Objects.equals(this.checkRuleIds, that.checkRuleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subTag, checked, checkRuleIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PwdCheckSubTagInfo {\n");
        sb.append("    subTag: ").append(toIndentedString(subTag)).append("\n");
        sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
        sb.append("    checkRuleIds: ").append(toIndentedString(checkRuleIds)).append("\n");
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
