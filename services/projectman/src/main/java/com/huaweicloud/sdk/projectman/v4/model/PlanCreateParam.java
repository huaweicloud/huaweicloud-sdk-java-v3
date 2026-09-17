package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 创建发布/迭代计划的请求参数。 **约束限制**： 不涉及。
 */
public class PlanCreateParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_date")

    private String planStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private String planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload")

    private String workload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    public PlanCreateParam withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释**： 计划标题。 **约束限制**： 不涉及。 **取值范围**： 1~256个字符。 **默认取值**： 不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PlanCreateParam withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 计划分类，枚举类型。 **约束限制**： 不涉及。 **取值范围**： - PI：发布 - Iteration：迭代 - PlanMilestone：里程碑 **默认取值**： 不涉及。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public PlanCreateParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 计划描述信息。 **约束限制**： 不涉及。 **取值范围**： 0~1000个字符。 **默认取值**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PlanCreateParam withPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * **参数解释**： 计划开始时间，格式为yyyy-MM-dd，如2024-01-01。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return planStartDate
     */
    public String getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
    }

    public PlanCreateParam withPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * **参数解释**： 计划完成时间，格式为yyyy-MM-dd，如2024-01-01。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    public PlanCreateParam withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释**： 父计划ID，当category为Iteration时必填，用于指定所属的发布计划。 **约束限制**： category为Iteration时必填。 **取值范围**： 长度为18~19个字符的数字字符串。 **默认取值**： 不涉及。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public PlanCreateParam withWorkload(String workload) {
        this.workload = workload;
        return this;
    }

    /**
     * **参数解释**： 预估工作量，用于标识计划所需的人力投入，单位人/天。 **约束限制**： 不涉及。 **取值范围**： 0~11个字符。 **默认取值**： 不涉及。
     * @return workload
     */
    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public PlanCreateParam withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * **参数解释**： 责任人ID，标识计划的负责人。 **约束限制**： 不涉及。 **取值范围**： 长度为32个字符。 **默认取值**： 不涉及。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlanCreateParam that = (PlanCreateParam) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.category, that.category)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.planStartDate, that.planStartDate)
            && Objects.equals(this.planEndDate, that.planEndDate) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.workload, that.workload) && Objects.equals(this.owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, category, description, planStartDate, planEndDate, parentId, workload, owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanCreateParam {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    workload: ").append(toIndentedString(workload)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
