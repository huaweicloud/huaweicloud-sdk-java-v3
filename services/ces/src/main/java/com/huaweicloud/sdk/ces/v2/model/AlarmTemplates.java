package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmTemplates
 */
public class AlarmTemplates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private TemplateType templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_description")

    private String templateDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_alarm_total")

    private Integer associationAlarmTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_total")

    private Integer policyTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_statistics")

    private List<PolicyStatistics> policyStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_resource_groups")

    private List<AssociationResourceGroup> associationResourceGroups = null;

    public AlarmTemplates withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 告警模板的ID，以at开头，后跟字母、数字，长度最长为64
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public AlarmTemplates withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 告警模板的名称，以字母或汉字开头，可包含字母、数字、汉字、_、-，长度范围[1,128]
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public AlarmTemplates withTemplateType(TemplateType templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * Get templateType
     * @return templateType
     */
    public TemplateType getTemplateType() {
        return templateType;
    }

    public void setTemplateType(TemplateType templateType) {
        this.templateType = templateType;
    }

    public AlarmTemplates withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 告警模板的创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public AlarmTemplates withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * 告警模板的描述，长度范围[0,256]，该字段默认值为空字符串
     * @return templateDescription
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    public AlarmTemplates withAssociationAlarmTotal(Integer associationAlarmTotal) {
        this.associationAlarmTotal = associationAlarmTotal;
        return this;
    }

    /**
     * 告警模板关联的告警规则数目
     * @return associationAlarmTotal
     */
    public Integer getAssociationAlarmTotal() {
        return associationAlarmTotal;
    }

    public void setAssociationAlarmTotal(Integer associationAlarmTotal) {
        this.associationAlarmTotal = associationAlarmTotal;
    }

    public AlarmTemplates withPolicyTotal(Integer policyTotal) {
        this.policyTotal = policyTotal;
        return this;
    }

    /**
     * 告警模板的告警策略总数
     * @return policyTotal
     */
    public Integer getPolicyTotal() {
        return policyTotal;
    }

    public void setPolicyTotal(Integer policyTotal) {
        this.policyTotal = policyTotal;
    }

    public AlarmTemplates withPolicyStatistics(List<PolicyStatistics> policyStatistics) {
        this.policyStatistics = policyStatistics;
        return this;
    }

    public AlarmTemplates addPolicyStatisticsItem(PolicyStatistics policyStatisticsItem) {
        if (this.policyStatistics == null) {
            this.policyStatistics = new ArrayList<>();
        }
        this.policyStatistics.add(policyStatisticsItem);
        return this;
    }

    public AlarmTemplates withPolicyStatistics(Consumer<List<PolicyStatistics>> policyStatisticsSetter) {
        if (this.policyStatistics == null) {
            this.policyStatistics = new ArrayList<>();
        }
        policyStatisticsSetter.accept(this.policyStatistics);
        return this;
    }

    /**
     * 服务列表告警策略数目统计
     * @return policyStatistics
     */
    public List<PolicyStatistics> getPolicyStatistics() {
        return policyStatistics;
    }

    public void setPolicyStatistics(List<PolicyStatistics> policyStatistics) {
        this.policyStatistics = policyStatistics;
    }

    public AlarmTemplates withAssociationResourceGroups(List<AssociationResourceGroup> associationResourceGroups) {
        this.associationResourceGroups = associationResourceGroups;
        return this;
    }

    public AlarmTemplates addAssociationResourceGroupsItem(AssociationResourceGroup associationResourceGroupsItem) {
        if (this.associationResourceGroups == null) {
            this.associationResourceGroups = new ArrayList<>();
        }
        this.associationResourceGroups.add(associationResourceGroupsItem);
        return this;
    }

    public AlarmTemplates withAssociationResourceGroups(
        Consumer<List<AssociationResourceGroup>> associationResourceGroupsSetter) {
        if (this.associationResourceGroups == null) {
            this.associationResourceGroups = new ArrayList<>();
        }
        associationResourceGroupsSetter.accept(this.associationResourceGroups);
        return this;
    }

    /**
     * 关联的资源分组
     * @return associationResourceGroups
     */
    public List<AssociationResourceGroup> getAssociationResourceGroups() {
        return associationResourceGroups;
    }

    public void setAssociationResourceGroups(List<AssociationResourceGroup> associationResourceGroups) {
        this.associationResourceGroups = associationResourceGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmTemplates that = (AlarmTemplates) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.templateType, that.templateType) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.templateDescription, that.templateDescription)
            && Objects.equals(this.associationAlarmTotal, that.associationAlarmTotal)
            && Objects.equals(this.policyTotal, that.policyTotal)
            && Objects.equals(this.policyStatistics, that.policyStatistics)
            && Objects.equals(this.associationResourceGroups, that.associationResourceGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId,
            templateName,
            templateType,
            createTime,
            templateDescription,
            associationAlarmTotal,
            policyTotal,
            policyStatistics,
            associationResourceGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmTemplates {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    templateDescription: ").append(toIndentedString(templateDescription)).append("\n");
        sb.append("    associationAlarmTotal: ").append(toIndentedString(associationAlarmTotal)).append("\n");
        sb.append("    policyTotal: ").append(toIndentedString(policyTotal)).append("\n");
        sb.append("    policyStatistics: ").append(toIndentedString(policyStatistics)).append("\n");
        sb.append("    associationResourceGroups: ").append(toIndentedString(associationResourceGroups)).append("\n");
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
