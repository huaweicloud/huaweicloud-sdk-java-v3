package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项创建对象
 */
public class IssueCreateEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_layer_id")

    private String categoryLayerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private UserEntity assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recipient")

    private List<UserEntity> recipient = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_cc")

    private List<UserEntity> assignedCc = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private String planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload")

    private String workload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<LabelEntity> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_fields")

    private List<FieldCodeValuePair> customFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ir2feature")

    private String ir2feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private String priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_network_security")

    private String relatedNetworkSecurity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collaboratives")

    private String collaboratives;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_domain")

    private String businessDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_pi")

    private String planPi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submitted_by")

    private List<UserEntity> submittedBy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ir2rr")

    private String ir2rr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_set")

    private String featureSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_level")

    private String securityLevel;

    public IssueCreateEntity withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释**： 工作项标题。 **约束限制**：  不涉及。 **取值范围**： 2~256个字符。 **默认取值**： 不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IssueCreateEntity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 工作项描述字段。 **约束限制**： 不涉及。 **取值范围**： 0~500000个字符。 **默认取值**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueCreateEntity withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 工作项类型编码。编辑工作项时，此字段必填、值为当前工作项正确的工作项类型，但不会更新此字段。 **约束限制**： 不涉及。 **取值范围**： 支持多种工作项类型，使用英文逗号分隔。 - 系统设备类项目：RR、SF、IR、SR、AR、Task、Bug - 独立软件类项目：RR、SF、IR、US、Task、Bug - 云服务类项目：RR、Epic、FE、US、Task、Bug **默认取值**： 不涉及。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public IssueCreateEntity withCategoryLayerId(String categoryLayerId) {
        this.categoryLayerId = categoryLayerId;
        return this;
    }

    /**
     * **参数解释**： 工作项类型层级关系ID，此参数影响工作项的层级显示。通过[获取模型树配置信息](GetModelConfig.xml)获取，根据参数中的category在响应消息体中category_layer_config中找到对应的category_code，和category_code同级的id就是工作项类型层级关系ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return categoryLayerId
     */
    public String getCategoryLayerId() {
        return categoryLayerId;
    }

    public void setCategoryLayerId(String categoryLayerId) {
        this.categoryLayerId = categoryLayerId;
    }

    public IssueCreateEntity withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释**： 父工作项ID。 **约束限制**： 创建子工作项时必填，其他场景非必填。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public IssueCreateEntity withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 工作项状态code。可通过[查询工作项状态](ListIssueStatues.xml)接口获取，响应消息体中的**code**字段的值就是工作项状态code。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IssueCreateEntity withAssignee(UserEntity assignee) {
        this.assignee = assignee;
        return this;
    }

    public IssueCreateEntity withAssignee(Consumer<UserEntity> assigneeSetter) {
        if (this.assignee == null) {
            this.assignee = new UserEntity();
            assigneeSetter.accept(this.assignee);
        }

        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    public UserEntity getAssignee() {
        return assignee;
    }

    public void setAssignee(UserEntity assignee) {
        this.assignee = assignee;
    }

    public IssueCreateEntity withRecipient(List<UserEntity> recipient) {
        this.recipient = recipient;
        return this;
    }

    public IssueCreateEntity addRecipientItem(UserEntity recipientItem) {
        if (this.recipient == null) {
            this.recipient = new ArrayList<>();
        }
        this.recipient.add(recipientItem);
        return this;
    }

    public IssueCreateEntity withRecipient(Consumer<List<UserEntity>> recipientSetter) {
        if (this.recipient == null) {
            this.recipient = new ArrayList<>();
        }
        recipientSetter.accept(this.recipient);
        return this;
    }

    /**
     * **参数解释**： 原始需求承接人。 **约束限制**： 当工作项类型为RR时字段必填，其他工作项类型无此字段。
     * @return recipient
     */
    public List<UserEntity> getRecipient() {
        return recipient;
    }

    public void setRecipient(List<UserEntity> recipient) {
        this.recipient = recipient;
    }

    public IssueCreateEntity withAssignedCc(List<UserEntity> assignedCc) {
        this.assignedCc = assignedCc;
        return this;
    }

    public IssueCreateEntity addAssignedCcItem(UserEntity assignedCcItem) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        this.assignedCc.add(assignedCcItem);
        return this;
    }

    public IssueCreateEntity withAssignedCc(Consumer<List<UserEntity>> assignedCcSetter) {
        if (this.assignedCc == null) {
            this.assignedCc = new ArrayList<>();
        }
        assignedCcSetter.accept(this.assignedCc);
        return this;
    }

    /**
     * **参数解释**： 工作项抄送人，支持多个抄送人。 **约束限制**： 同一工作项最多支持50个抄送人。
     * @return assignedCc
     */
    public List<UserEntity> getAssignedCc() {
        return assignedCc;
    }

    public void setAssignedCc(List<UserEntity> assignedCc) {
        this.assignedCc = assignedCc;
    }

    public IssueCreateEntity withPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * **参数解释**： 工作项计划结束日期。 **约束限制**： 0~13个字符的数字字符串，可选负号前缀。 **取值范围**： 时间戳。 **默认取值**： 不涉及。
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    public IssueCreateEntity withWorkload(String workload) {
        this.workload = workload;
        return this;
    }

    /**
     * **参数解释**： 工作项计划工时。 **约束限制**： 不涉及。 **取值范围**： 0~999999999.9中的数字字符串。 **默认取值**： 不涉及。
     * @return workload
     */
    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public IssueCreateEntity withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * **参数解释**： 工作项关联项ID。 **约束限制**： 多个关联项用英文逗号分隔，同一工作项最多支持50个关联项。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public IssueCreateEntity withLabels(List<LabelEntity> labels) {
        this.labels = labels;
        return this;
    }

    public IssueCreateEntity addLabelsItem(LabelEntity labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public IssueCreateEntity withLabels(Consumer<List<LabelEntity>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**： 工作项标签。 **约束限制**： 不涉及。
     * @return labels
     */
    public List<LabelEntity> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelEntity> labels) {
        this.labels = labels;
    }

    public IssueCreateEntity withCustomFields(List<FieldCodeValuePair> customFields) {
        this.customFields = customFields;
        return this;
    }

    public IssueCreateEntity addCustomFieldsItem(FieldCodeValuePair customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    public IssueCreateEntity withCustomFields(Consumer<List<FieldCodeValuePair>> customFieldsSetter) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        customFieldsSetter.accept(this.customFields);
        return this;
    }

    /**
     * **参数解释**： 工作项自定义字段映射。用户添加的系统字段也在此列。 **约束限制**： 不涉及。
     * @return customFields
     */
    public List<FieldCodeValuePair> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<FieldCodeValuePair> customFields) {
        this.customFields = customFields;
    }

    public IssueCreateEntity withIr2feature(String ir2feature) {
        this.ir2feature = ir2feature;
        return this;
    }

    /**
     * **参数解释**： IR和SF的关联字段。 **约束限制**： IR可以填写该字段。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return ir2feature
     */
    public String getIr2feature() {
        return ir2feature;
    }

    public void setIr2feature(String ir2feature) {
        this.ir2feature = ir2feature;
    }

    public IssueCreateEntity withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释**： 工作项优先级。 **约束限制**： RR、SF、FE、IR、SR、AR、Task、Bug可以填写该字段。 **取值范围**： - 低：低优先级。 - 中：中优先级。 - 高：高优先级。 **默认取值**： 不涉及。
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public IssueCreateEntity withRelatedNetworkSecurity(String relatedNetworkSecurity) {
        this.relatedNetworkSecurity = relatedNetworkSecurity;
        return this;
    }

    /**
     * **参数解释**： 是否涉及网络安全。 **约束限制**： 仅研发需求有此字段。 **取值范围**： - yes：涉及网络安全。 - no：不涉及网络安全。 **默认取值**： 不涉及。
     * @return relatedNetworkSecurity
     */
    public String getRelatedNetworkSecurity() {
        return relatedNetworkSecurity;
    }

    public void setRelatedNetworkSecurity(String relatedNetworkSecurity) {
        this.relatedNetworkSecurity = relatedNetworkSecurity;
    }

    public IssueCreateEntity withCollaboratives(String collaboratives) {
        this.collaboratives = collaboratives;
        return this;
    }

    /**
     * **参数解释**： 研发需求协同信息，协同任务ID，可通过[查询树状工作项](ShowIpdIssueTree.xml)接口获取，响应消息体中的**collaboratives**字段的值就是研发需求协同信息，协同任务ID。 **约束限制**： 协同任务ID。IR、SR、AR、US有此字段。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return collaboratives
     */
    public String getCollaboratives() {
        return collaboratives;
    }

    public void setCollaboratives(String collaboratives) {
        this.collaboratives = collaboratives;
    }

    public IssueCreateEntity withBusinessDomain(String businessDomain) {
        this.businessDomain = businessDomain;
        return this;
    }

    /**
     * **参数解释**： 领域字段。 **约束限制**：  FE、SF、IR、SR、AR、Bug有此字段。 **取值范围**： - software - soft-hardware - hardware - 性能 - 功能 - 运维 - 运营 - 用户体验 - 隐私保护 - 合规 - 韧性(可靠性/可用性) - 韧性(危险检测与相应恢复) - 透明 - 无害 - 安全 - API - 成本 - 可维护性 - 其他DFX - 可用性 - others **默认取值**： 不涉及。
     * @return businessDomain
     */
    public String getBusinessDomain() {
        return businessDomain;
    }

    public void setBusinessDomain(String businessDomain) {
        this.businessDomain = businessDomain;
    }

    public IssueCreateEntity withPlanPi(String planPi) {
        this.planPi = planPi;
        return this;
    }

    /**
     * **参数解释**： 工作项发布计划ID。 **约束限制**： 默认SR、AR、US、Task、Bug有此字段。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return planPi
     */
    public String getPlanPi() {
        return planPi;
    }

    public void setPlanPi(String planPi) {
        this.planPi = planPi;
    }

    public IssueCreateEntity withSubmittedBy(List<UserEntity> submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    public IssueCreateEntity addSubmittedByItem(UserEntity submittedByItem) {
        if (this.submittedBy == null) {
            this.submittedBy = new ArrayList<>();
        }
        this.submittedBy.add(submittedByItem);
        return this;
    }

    public IssueCreateEntity withSubmittedBy(Consumer<List<UserEntity>> submittedBySetter) {
        if (this.submittedBy == null) {
            this.submittedBy = new ArrayList<>();
        }
        submittedBySetter.accept(this.submittedBy);
        return this;
    }

    /**
     * **参数解释**： 工作项提出人。 **约束限制**： 仅RR、Bug有此字段。
     * @return submittedBy
     */
    public List<UserEntity> getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(List<UserEntity> submittedBy) {
        this.submittedBy = submittedBy;
    }

    public IssueCreateEntity withIr2rr(String ir2rr) {
        this.ir2rr = ir2rr;
        return this;
    }

    /**
     * **参数解释**： IR关联的RR的Id。 **约束限制**： 仅IR有此字段，多选时用英文逗号分隔。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return ir2rr
     */
    public String getIr2rr() {
        return ir2rr;
    }

    public void setIr2rr(String ir2rr) {
        this.ir2rr = ir2rr;
    }

    public IssueCreateEntity withFeatureSet(String featureSet) {
        this.featureSet = featureSet;
        return this;
    }

    /**
     * **参数解释**： 特性集ID。 **约束限制**： 仅SF/FE有此字段。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return featureSet
     */
    public String getFeatureSet() {
        return featureSet;
    }

    public void setFeatureSet(String featureSet) {
        this.featureSet = featureSet;
    }

    public IssueCreateEntity withSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    /**
     * **参数解释**： 密级。低密级权限者不能访问高密级的工作项。可以通过[[查询字段列表](ListIpdProjectFields.xml)]接口获取，响应消息体中密级的**option**字段的值就是密级字段的可选值。 **约束限制**： 仅在涉密环境（SM）下存在此字段，非涉密环境下无此字段。涉密环境下必填。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return securityLevel
     */
    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueCreateEntity that = (IssueCreateEntity) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.description, that.description)
            && Objects.equals(this.category, that.category)
            && Objects.equals(this.categoryLayerId, that.categoryLayerId)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.recipient, that.recipient)
            && Objects.equals(this.assignedCc, that.assignedCc) && Objects.equals(this.planEndDate, that.planEndDate)
            && Objects.equals(this.workload, that.workload) && Objects.equals(this.link, that.link)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.customFields, that.customFields)
            && Objects.equals(this.ir2feature, that.ir2feature) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.relatedNetworkSecurity, that.relatedNetworkSecurity)
            && Objects.equals(this.collaboratives, that.collaboratives)
            && Objects.equals(this.businessDomain, that.businessDomain) && Objects.equals(this.planPi, that.planPi)
            && Objects.equals(this.submittedBy, that.submittedBy) && Objects.equals(this.ir2rr, that.ir2rr)
            && Objects.equals(this.featureSet, that.featureSet)
            && Objects.equals(this.securityLevel, that.securityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,
            description,
            category,
            categoryLayerId,
            parentId,
            status,
            assignee,
            recipient,
            assignedCc,
            planEndDate,
            workload,
            link,
            labels,
            customFields,
            ir2feature,
            priority,
            relatedNetworkSecurity,
            collaboratives,
            businessDomain,
            planPi,
            submittedBy,
            ir2rr,
            featureSet,
            securityLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueCreateEntity {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    categoryLayerId: ").append(toIndentedString(categoryLayerId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    assignedCc: ").append(toIndentedString(assignedCc)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    workload: ").append(toIndentedString(workload)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    ir2feature: ").append(toIndentedString(ir2feature)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    relatedNetworkSecurity: ").append(toIndentedString(relatedNetworkSecurity)).append("\n");
        sb.append("    collaboratives: ").append(toIndentedString(collaboratives)).append("\n");
        sb.append("    businessDomain: ").append(toIndentedString(businessDomain)).append("\n");
        sb.append("    planPi: ").append(toIndentedString(planPi)).append("\n");
        sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
        sb.append("    ir2rr: ").append(toIndentedString(ir2rr)).append("\n");
        sb.append("    featureSet: ").append(toIndentedString(featureSet)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
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
