package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmsTemplateReq
 */
public class SmsTemplateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brackets")

    private String brackets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_country")

    private List<Long> sendCountry = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_id")

    private String signId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_content")

    private String templateContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_desc")

    private String templateDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private String templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "universal_template")

    private Integer universalTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_attributes")

    private List<SmsTemplateVariableAttrReq> variableAttributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_status")

    private String flowStatus;

    public SmsTemplateReq withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用主键ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public SmsTemplateReq withBrackets(String brackets) {
        this.brackets = brackets;
        return this;
    }

    /**
     * 中括号类型。支持枚举值： 1. CN: 中文类型 2. GB: 英文类型
     * @return brackets
     */
    public String getBrackets() {
        return brackets;
    }

    public void setBrackets(String brackets) {
        this.brackets = brackets;
    }

    public SmsTemplateReq withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 地域 1. cn：国内 2. intl：
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SmsTemplateReq withSendCountry(List<Long> sendCountry) {
        this.sendCountry = sendCountry;
        return this;
    }

    public SmsTemplateReq addSendCountryItem(Long sendCountryItem) {
        if (this.sendCountry == null) {
            this.sendCountry = new ArrayList<>();
        }
        this.sendCountry.add(sendCountryItem);
        return this;
    }

    public SmsTemplateReq withSendCountry(Consumer<List<Long>> sendCountrySetter) {
        if (this.sendCountry == null) {
            this.sendCountry = new ArrayList<>();
        }
        sendCountrySetter.accept(this.sendCountry);
        return this;
    }

    /**
     * 发送国家id列表，只有地域为国际时，该字段有效
     * @return sendCountry
     */
    public List<Long> getSendCountry() {
        return sendCountry;
    }

    public void setSendCountry(List<Long> sendCountry) {
        this.sendCountry = sendCountry;
    }

    public SmsTemplateReq withSignId(String signId) {
        this.signId = signId;
        return this;
    }

    /**
     * 签名主键ID，只有地域为国内时，该字段有效
     * @return signId
     */
    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId;
    }

    public SmsTemplateReq withTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }

    /**
     * 模板内容
     * @return templateContent
     */
    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public SmsTemplateReq withTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
        return this;
    }

    /**
     * 模板描述
     * @return templateDesc
     */
    public String getTemplateDesc() {
        return templateDesc;
    }

    public void setTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
    }

    public SmsTemplateReq withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public SmsTemplateReq withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 模板类型。只有地域为国内时，该字段有效。支持枚举值： 1. VERIFY_CODE_TYPE: 验证码类 2. PROMOTION_TYPE: 推广类 3. NOTIFY_TYPE: 通知类
     * @return templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public SmsTemplateReq withUniversalTemplate(Integer universalTemplate) {
        this.universalTemplate = universalTemplate;
        return this;
    }

    /**
     * 是否为通用模板 1. 0: 非通用模板 2. 1: 通用模板
     * minimum: 1
     * maximum: 2147483647
     * @return universalTemplate
     */
    public Integer getUniversalTemplate() {
        return universalTemplate;
    }

    public void setUniversalTemplate(Integer universalTemplate) {
        this.universalTemplate = universalTemplate;
    }

    public SmsTemplateReq withVariableAttributes(List<SmsTemplateVariableAttrReq> variableAttributes) {
        this.variableAttributes = variableAttributes;
        return this;
    }

    public SmsTemplateReq addVariableAttributesItem(SmsTemplateVariableAttrReq variableAttributesItem) {
        if (this.variableAttributes == null) {
            this.variableAttributes = new ArrayList<>();
        }
        this.variableAttributes.add(variableAttributesItem);
        return this;
    }

    public SmsTemplateReq withVariableAttributes(Consumer<List<SmsTemplateVariableAttrReq>> variableAttributesSetter) {
        if (this.variableAttributes == null) {
            this.variableAttributes = new ArrayList<>();
        }
        variableAttributesSetter.accept(this.variableAttributes);
        return this;
    }

    /**
     * 模板参数
     * @return variableAttributes
     */
    public List<SmsTemplateVariableAttrReq> getVariableAttributes() {
        return variableAttributes;
    }

    public void setVariableAttributes(List<SmsTemplateVariableAttrReq> variableAttributes) {
        this.variableAttributes = variableAttributes;
    }

    public SmsTemplateReq withFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }

    /**
     * 流程状态 1. Pending: 待提交 2. Reviewing: 待审核 3. Disable：停用
     * @return flowStatus
     */
    public String getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmsTemplateReq that = (SmsTemplateReq) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.brackets, that.brackets)
            && Objects.equals(this.region, that.region) && Objects.equals(this.sendCountry, that.sendCountry)
            && Objects.equals(this.signId, that.signId) && Objects.equals(this.templateContent, that.templateContent)
            && Objects.equals(this.templateDesc, that.templateDesc)
            && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.templateType, that.templateType)
            && Objects.equals(this.universalTemplate, that.universalTemplate)
            && Objects.equals(this.variableAttributes, that.variableAttributes)
            && Objects.equals(this.flowStatus, that.flowStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId,
            brackets,
            region,
            sendCountry,
            signId,
            templateContent,
            templateDesc,
            templateName,
            templateType,
            universalTemplate,
            variableAttributes,
            flowStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsTemplateReq {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    brackets: ").append(toIndentedString(brackets)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    sendCountry: ").append(toIndentedString(sendCountry)).append("\n");
        sb.append("    signId: ").append(toIndentedString(signId)).append("\n");
        sb.append("    templateContent: ").append(toIndentedString(templateContent)).append("\n");
        sb.append("    templateDesc: ").append(toIndentedString(templateDesc)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    universalTemplate: ").append(toIndentedString(universalTemplate)).append("\n");
        sb.append("    variableAttributes: ").append(toIndentedString(variableAttributes)).append("\n");
        sb.append("    flowStatus: ").append(toIndentedString(flowStatus)).append("\n");
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
