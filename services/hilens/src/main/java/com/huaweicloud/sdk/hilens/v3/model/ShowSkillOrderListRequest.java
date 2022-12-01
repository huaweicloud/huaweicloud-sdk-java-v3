package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowSkillOrderListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_name")

    private String skillName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_form")

    private String skillForm;

    public ShowSkillOrderListRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量, 最大 100，默认值 10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowSkillOrderListRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的起始位置, 默认值 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowSkillOrderListRequest withSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }

    /**
     * 技能名称，支持模糊匹配。中英文、数字、下划线、中划线 长度[1-60]
     * @return skillName
     */
    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public ShowSkillOrderListRequest withSkillForm(String skillForm) {
        this.skillForm = skillForm;
        return this;
    }

    /**
     * 技能形式，no_termplate不支持Modelbox部署模板，support_template支持Modelbox模板。
     * @return skillForm
     */
    public String getSkillForm() {
        return skillForm;
    }

    public void setSkillForm(String skillForm) {
        this.skillForm = skillForm;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSkillOrderListRequest showSkillOrderListRequest = (ShowSkillOrderListRequest) o;
        return Objects.equals(this.limit, showSkillOrderListRequest.limit)
            && Objects.equals(this.offset, showSkillOrderListRequest.offset)
            && Objects.equals(this.skillName, showSkillOrderListRequest.skillName)
            && Objects.equals(this.skillForm, showSkillOrderListRequest.skillForm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, skillName, skillForm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSkillOrderListRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    skillName: ").append(toIndentedString(skillName)).append("\n");
        sb.append("    skillForm: ").append(toIndentedString(skillForm)).append("\n");
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
