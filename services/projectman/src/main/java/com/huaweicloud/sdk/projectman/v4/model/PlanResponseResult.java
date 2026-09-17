package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 响应中的计划详情数据对象，日期字段为unix时间戳格式。 **约束限制**： 不涉及。
 */
public class PlanResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<PlanResponseResult> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_date")

    private Long planStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private Long planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private Long createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline")

    private String baseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload")

    private String workload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    public PlanResponseResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 发布、迭代、里程碑的ID **取值范围：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PlanResponseResult withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：** 标题 **取值范围：** 不涉及
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PlanResponseResult withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释：** 分类，枚举类型 **取值范围：** - PI：发布 - Iteration：迭代 - PlanMilestone：里程碑
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public PlanResponseResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述 **取值范围：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PlanResponseResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：** 作废标识，枚举类型。 **取值范围：** - 正在工作：可正常操作的发布。 - 作废：软删除后的发布。 - 删除：彻底删除后的发布。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public PlanResponseResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 发布/迭代的状态，枚举类型。 **取值范围：** - planned：发布/计划未开始 - going：发布/计划进行中 - ended：发布/计划已结束
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PlanResponseResult withChildren(List<PlanResponseResult> children) {
        this.children = children;
        return this;
    }

    public PlanResponseResult addChildrenItem(PlanResponseResult childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public PlanResponseResult withChildren(Consumer<List<PlanResponseResult>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * **参数解释：** 子项目迭代信息
     * @return children
     */
    public List<PlanResponseResult> getChildren() {
        return children;
    }

    public void setChildren(List<PlanResponseResult> children) {
        this.children = children;
    }

    public PlanResponseResult withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * **参数解释：** 创建人ID **取值范围：** 不涉及
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public PlanResponseResult withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * **参数解释：** 最近更新人ID。 **取值范围：** 不涉及
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public PlanResponseResult withPlanStartDate(Long planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * **参数解释：** 计划开始时间，unix时间戳，单位：毫秒。 **取值范围：** 不涉及
     * @return planStartDate
     */
    public Long getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(Long planStartDate) {
        this.planStartDate = planStartDate;
    }

    public PlanResponseResult withPlanEndDate(Long planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * **参数解释：** 计划完成时间，unix时间戳，单位：毫秒。 **取值范围：** 不涉及
     * @return planEndDate
     */
    public Long getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(Long planEndDate) {
        this.planEndDate = planEndDate;
    }

    public PlanResponseResult withCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * **参数解释：** 创建时间，unix时间戳，单位：毫秒 **取值范围：** 不涉及
     * @return createdDate
     */
    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public PlanResponseResult withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释：** 父计划ID，当计划类型为迭代(Iteration)时，用于指定所属的发布计划。 **取值范围：** 长度为18~19个字符的数字字符串。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public PlanResponseResult withBaseline(String baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * **参数解释：** 基线状态，枚举类型，标识计划是否已纳入基线管理。 **取值范围：** - baselined：已基线 - unbaseline：未基线 - \"\"：未基线
     * @return baseline
     */
    public String getBaseline() {
        return baseline;
    }

    public void setBaseline(String baseline) {
        this.baseline = baseline;
    }

    public PlanResponseResult withWorkload(String workload) {
        this.workload = workload;
        return this;
    }

    /**
     * **参数解释：** 预估工作量，用于标识计划所需的人力或时间投入，单位人/天。 **取值范围：** 最大长度11个字符。
     * @return workload
     */
    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public PlanResponseResult withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * **参数解释：** 责任人ID，标识计划的负责人。 **取值范围：** 长度为32位的字符串。
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
        PlanResponseResult that = (PlanResponseResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.title, that.title)
            && Objects.equals(this.category, that.category) && Objects.equals(this.description, that.description)
            && Objects.equals(this.state, that.state) && Objects.equals(this.status, that.status)
            && Objects.equals(this.children, that.children) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.planStartDate, that.planStartDate)
            && Objects.equals(this.planEndDate, that.planEndDate) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.baseline, that.baseline)
            && Objects.equals(this.workload, that.workload) && Objects.equals(this.owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            title,
            category,
            description,
            state,
            status,
            children,
            createdBy,
            modifiedBy,
            planStartDate,
            planEndDate,
            createdDate,
            parentId,
            baseline,
            workload,
            owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanResponseResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
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
