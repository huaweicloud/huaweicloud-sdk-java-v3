package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmRuleTemplateBody
 */
public class AlarmRuleTemplateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_name")

    private String alarmRuleTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_name_en")

    private String alarmRuleTemplateNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_description")

    private String alarmRuleTemplateDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_id")

    private String alarmRuleTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_project_id")

    private String alarmRuleTemplateProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_type")

    private String alarmRuleTemplateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_source")

    private String alarmRuleTemplateSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_binding")

    private Map<String, String> alarmRuleTemplateBinding = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_template_spec_list")

    private List<AlarmRuleTemplateSpecWithCloudService> alarmTemplateSpecList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_time")

    private Long modifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templating")

    private Templating templating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_version")

    private String templateVersion;

    public AlarmRuleTemplateBody withAlarmRuleTemplateName(String alarmRuleTemplateName) {
        this.alarmRuleTemplateName = alarmRuleTemplateName;
        return this;
    }

    /**
     * 告警模板名称。
     * @return alarmRuleTemplateName
     */
    public String getAlarmRuleTemplateName() {
        return alarmRuleTemplateName;
    }

    public void setAlarmRuleTemplateName(String alarmRuleTemplateName) {
        this.alarmRuleTemplateName = alarmRuleTemplateName;
    }

    public AlarmRuleTemplateBody withAlarmRuleTemplateNameEn(String alarmRuleTemplateNameEn) {
        this.alarmRuleTemplateNameEn = alarmRuleTemplateNameEn;
        return this;
    }

    /**
     * 告警模板英文名称。
     * @return alarmRuleTemplateNameEn
     */
    public String getAlarmRuleTemplateNameEn() {
        return alarmRuleTemplateNameEn;
    }

    public void setAlarmRuleTemplateNameEn(String alarmRuleTemplateNameEn) {
        this.alarmRuleTemplateNameEn = alarmRuleTemplateNameEn;
    }

    public AlarmRuleTemplateBody withAlarmRuleTemplateDescription(String alarmRuleTemplateDescription) {
        this.alarmRuleTemplateDescription = alarmRuleTemplateDescription;
        return this;
    }

    /**
     * 告警模板描述。
     * @return alarmRuleTemplateDescription
     */
    public String getAlarmRuleTemplateDescription() {
        return alarmRuleTemplateDescription;
    }

    public void setAlarmRuleTemplateDescription(String alarmRuleTemplateDescription) {
        this.alarmRuleTemplateDescription = alarmRuleTemplateDescription;
    }

    public AlarmRuleTemplateBody withAlarmRuleTemplateId(String alarmRuleTemplateId) {
        this.alarmRuleTemplateId = alarmRuleTemplateId;
        return this;
    }

    /**
     * 告警模板id。
     * @return alarmRuleTemplateId
     */
    public String getAlarmRuleTemplateId() {
        return alarmRuleTemplateId;
    }

    public void setAlarmRuleTemplateId(String alarmRuleTemplateId) {
        this.alarmRuleTemplateId = alarmRuleTemplateId;
    }

    public AlarmRuleTemplateBody withAlarmRuleTemplateProjectId(String alarmRuleTemplateProjectId) {
        this.alarmRuleTemplateProjectId = alarmRuleTemplateProjectId;
        return this;
    }

    /**
     * 项目ID，可以从控制台获取，也可以从调用API处获取。获取方式请参见：[获取项目ID](aom_04_0024.xml)。
     * @return alarmRuleTemplateProjectId
     */
    public String getAlarmRuleTemplateProjectId() {
        return alarmRuleTemplateProjectId;
    }

    public void setAlarmRuleTemplateProjectId(String alarmRuleTemplateProjectId) {
        this.alarmRuleTemplateProjectId = alarmRuleTemplateProjectId;
    }

    public AlarmRuleTemplateBody withAlarmRuleTemplateType(String alarmRuleTemplateType) {
        this.alarmRuleTemplateType = alarmRuleTemplateType;
        return this;
    }

    /**
     * 告警模板类型 - “statics”：静态告警模板 - “dynamic”：动态告警模板
     * @return alarmRuleTemplateType
     */
    public String getAlarmRuleTemplateType() {
        return alarmRuleTemplateType;
    }

    public void setAlarmRuleTemplateType(String alarmRuleTemplateType) {
        this.alarmRuleTemplateType = alarmRuleTemplateType;
    }

    public AlarmRuleTemplateBody withAlarmRuleTemplateSource(String alarmRuleTemplateSource) {
        this.alarmRuleTemplateSource = alarmRuleTemplateSource;
        return this;
    }

    /**
     * 告警模板来源。
     * @return alarmRuleTemplateSource
     */
    public String getAlarmRuleTemplateSource() {
        return alarmRuleTemplateSource;
    }

    public void setAlarmRuleTemplateSource(String alarmRuleTemplateSource) {
        this.alarmRuleTemplateSource = alarmRuleTemplateSource;
    }

    public AlarmRuleTemplateBody withAlarmRuleTemplateBinding(Map<String, String> alarmRuleTemplateBinding) {
        this.alarmRuleTemplateBinding = alarmRuleTemplateBinding;
        return this;
    }

    public AlarmRuleTemplateBody putAlarmRuleTemplateBindingItem(String key, String alarmRuleTemplateBindingItem) {
        if (this.alarmRuleTemplateBinding == null) {
            this.alarmRuleTemplateBinding = new HashMap<>();
        }
        this.alarmRuleTemplateBinding.put(key, alarmRuleTemplateBindingItem);
        return this;
    }

    public AlarmRuleTemplateBody withAlarmRuleTemplateBinding(
        Consumer<Map<String, String>> alarmRuleTemplateBindingSetter) {
        if (this.alarmRuleTemplateBinding == null) {
            this.alarmRuleTemplateBinding = new HashMap<>();
        }
        alarmRuleTemplateBindingSetter.accept(this.alarmRuleTemplateBinding);
        return this;
    }

    /**
     * 告警模板所绑定的告警规则。
     * @return alarmRuleTemplateBinding
     */
    public Map<String, String> getAlarmRuleTemplateBinding() {
        return alarmRuleTemplateBinding;
    }

    public void setAlarmRuleTemplateBinding(Map<String, String> alarmRuleTemplateBinding) {
        this.alarmRuleTemplateBinding = alarmRuleTemplateBinding;
    }

    public AlarmRuleTemplateBody withAlarmTemplateSpecList(
        List<AlarmRuleTemplateSpecWithCloudService> alarmTemplateSpecList) {
        this.alarmTemplateSpecList = alarmTemplateSpecList;
        return this;
    }

    public AlarmRuleTemplateBody addAlarmTemplateSpecListItem(
        AlarmRuleTemplateSpecWithCloudService alarmTemplateSpecListItem) {
        if (this.alarmTemplateSpecList == null) {
            this.alarmTemplateSpecList = new ArrayList<>();
        }
        this.alarmTemplateSpecList.add(alarmTemplateSpecListItem);
        return this;
    }

    public AlarmRuleTemplateBody withAlarmTemplateSpecList(
        Consumer<List<AlarmRuleTemplateSpecWithCloudService>> alarmTemplateSpecListSetter) {
        if (this.alarmTemplateSpecList == null) {
            this.alarmTemplateSpecList = new ArrayList<>();
        }
        alarmTemplateSpecListSetter.accept(this.alarmTemplateSpecList);
        return this;
    }

    /**
     * 告警模板列表。
     * @return alarmTemplateSpecList
     */
    public List<AlarmRuleTemplateSpecWithCloudService> getAlarmTemplateSpecList() {
        return alarmTemplateSpecList;
    }

    public void setAlarmTemplateSpecList(List<AlarmRuleTemplateSpecWithCloudService> alarmTemplateSpecList) {
        this.alarmTemplateSpecList = alarmTemplateSpecList;
    }

    public AlarmRuleTemplateBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id。获取方式请参见：[获取企业项目ID](aom_04_0024.xml)。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public AlarmRuleTemplateBody withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AlarmRuleTemplateBody withModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 更新时间。
     * @return modifyTime
     */
    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public AlarmRuleTemplateBody withTemplating(Templating templating) {
        this.templating = templating;
        return this;
    }

    public AlarmRuleTemplateBody withTemplating(Consumer<Templating> templatingSetter) {
        if (this.templating == null) {
            this.templating = new Templating();
            templatingSetter.accept(this.templating);
        }

        return this;
    }

    /**
     * Get templating
     * @return templating
     */
    public Templating getTemplating() {
        return templating;
    }

    public void setTemplating(Templating templating) {
        this.templating = templating;
    }

    public AlarmRuleTemplateBody withTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    /**
     * 告警模板版本。
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return templateVersion;
    }

    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmRuleTemplateBody that = (AlarmRuleTemplateBody) obj;
        return Objects.equals(this.alarmRuleTemplateName, that.alarmRuleTemplateName)
            && Objects.equals(this.alarmRuleTemplateNameEn, that.alarmRuleTemplateNameEn)
            && Objects.equals(this.alarmRuleTemplateDescription, that.alarmRuleTemplateDescription)
            && Objects.equals(this.alarmRuleTemplateId, that.alarmRuleTemplateId)
            && Objects.equals(this.alarmRuleTemplateProjectId, that.alarmRuleTemplateProjectId)
            && Objects.equals(this.alarmRuleTemplateType, that.alarmRuleTemplateType)
            && Objects.equals(this.alarmRuleTemplateSource, that.alarmRuleTemplateSource)
            && Objects.equals(this.alarmRuleTemplateBinding, that.alarmRuleTemplateBinding)
            && Objects.equals(this.alarmTemplateSpecList, that.alarmTemplateSpecList)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.modifyTime, that.modifyTime)
            && Objects.equals(this.templating, that.templating)
            && Objects.equals(this.templateVersion, that.templateVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRuleTemplateName,
            alarmRuleTemplateNameEn,
            alarmRuleTemplateDescription,
            alarmRuleTemplateId,
            alarmRuleTemplateProjectId,
            alarmRuleTemplateType,
            alarmRuleTemplateSource,
            alarmRuleTemplateBinding,
            alarmTemplateSpecList,
            enterpriseProjectId,
            createTime,
            modifyTime,
            templating,
            templateVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmRuleTemplateBody {\n");
        sb.append("    alarmRuleTemplateName: ").append(toIndentedString(alarmRuleTemplateName)).append("\n");
        sb.append("    alarmRuleTemplateNameEn: ").append(toIndentedString(alarmRuleTemplateNameEn)).append("\n");
        sb.append("    alarmRuleTemplateDescription: ")
            .append(toIndentedString(alarmRuleTemplateDescription))
            .append("\n");
        sb.append("    alarmRuleTemplateId: ").append(toIndentedString(alarmRuleTemplateId)).append("\n");
        sb.append("    alarmRuleTemplateProjectId: ").append(toIndentedString(alarmRuleTemplateProjectId)).append("\n");
        sb.append("    alarmRuleTemplateType: ").append(toIndentedString(alarmRuleTemplateType)).append("\n");
        sb.append("    alarmRuleTemplateSource: ").append(toIndentedString(alarmRuleTemplateSource)).append("\n");
        sb.append("    alarmRuleTemplateBinding: ").append(toIndentedString(alarmRuleTemplateBinding)).append("\n");
        sb.append("    alarmTemplateSpecList: ").append(toIndentedString(alarmTemplateSpecList)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
        sb.append("    templating: ").append(toIndentedString(templating)).append("\n");
        sb.append("    templateVersion: ").append(toIndentedString(templateVersion)).append("\n");
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
