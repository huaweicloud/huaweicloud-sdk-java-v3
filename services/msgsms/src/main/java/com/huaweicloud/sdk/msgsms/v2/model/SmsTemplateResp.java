package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmsTemplateResp
 */
public class SmsTemplateResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private TenantBasic tenant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private String templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_id")

    private String signId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_content")

    private String templateContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_variable")

    private String hasVariable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_desc")

    private String templateDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_desc")

    private String reviewDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_order")

    private String reviewOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_status")

    private String flowStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "universal_template")

    private Integer universalTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brackets")

    private String brackets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site")

    private String site;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urge_status")

    private String urgeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urge_time")

    private String urgeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urge_desc")

    private String urgeDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_country1")

    private Long sendCountry1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_country2")

    private Long sendCountry2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_country3")

    private Long sendCountry3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_multiomp")

    private Boolean isSupportMultiomp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_name")

    private String countryName;

    public SmsTemplateResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模板主键ID，用于获取、修改、删除模板以及查询模板变量的唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SmsTemplateResp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间[yyyy-MM-dd HH:mm:ss]
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public SmsTemplateResp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间[yyyy-MM-dd HH:mm:ss]
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public SmsTemplateResp withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 租户customer id
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public SmsTemplateResp withTenant(TenantBasic tenant) {
        this.tenant = tenant;
        return this;
    }

    public SmsTemplateResp withTenant(Consumer<TenantBasic> tenantSetter) {
        if (this.tenant == null) {
            this.tenant = new TenantBasic();
            tenantSetter.accept(this.tenant);
        }

        return this;
    }

    /**
     * Get tenant
     * @return tenant
     */
    public TenantBasic getTenant() {
        return tenant;
    }

    public void setTenant(TenantBasic tenant) {
        this.tenant = tenant;
    }

    public SmsTemplateResp withTemplateName(String templateName) {
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

    public SmsTemplateResp withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public SmsTemplateResp withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 模板类型
     * @return templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public SmsTemplateResp withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public SmsTemplateResp withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * 应用key
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public SmsTemplateResp withSignId(String signId) {
        this.signId = signId;
        return this;
    }

    /**
     * 签名主键id
     * @return signId
     */
    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId;
    }

    public SmsTemplateResp withTemplateContent(String templateContent) {
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

    public SmsTemplateResp withHasVariable(String hasVariable) {
        this.hasVariable = hasVariable;
        return this;
    }

    /**
     * 是否有变量
     * @return hasVariable
     */
    public String getHasVariable() {
        return hasVariable;
    }

    public void setHasVariable(String hasVariable) {
        this.hasVariable = hasVariable;
    }

    public SmsTemplateResp withTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
        return this;
    }

    /**
     * 申请描述
     * @return templateDesc
     */
    public String getTemplateDesc() {
        return templateDesc;
    }

    public void setTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
    }

    public SmsTemplateResp withReviewDesc(String reviewDesc) {
        this.reviewDesc = reviewDesc;
        return this;
    }

    /**
     * 审核意见
     * @return reviewDesc
     */
    public String getReviewDesc() {
        return reviewDesc;
    }

    public void setReviewDesc(String reviewDesc) {
        this.reviewDesc = reviewDesc;
    }

    public SmsTemplateResp withReviewOrder(String reviewOrder) {
        this.reviewOrder = reviewOrder;
        return this;
    }

    /**
     * 审核人账号
     * @return reviewOrder
     */
    public String getReviewOrder() {
        return reviewOrder;
    }

    public void setReviewOrder(String reviewOrder) {
        this.reviewOrder = reviewOrder;
    }

    public SmsTemplateResp withFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }

    /**
     * 流程状态
     * @return flowStatus
     */
    public String getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    public SmsTemplateResp withUniversalTemplate(Integer universalTemplate) {
        this.universalTemplate = universalTemplate;
        return this;
    }

    /**
     * 是否是通用模板
     * minimum: 0
     * maximum: 2147483647
     * @return universalTemplate
     */
    public Integer getUniversalTemplate() {
        return universalTemplate;
    }

    public void setUniversalTemplate(Integer universalTemplate) {
        this.universalTemplate = universalTemplate;
    }

    public SmsTemplateResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 模板状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SmsTemplateResp withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 地域 1. cn：国内 2. intl：国际
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SmsTemplateResp withBrackets(String brackets) {
        this.brackets = brackets;
        return this;
    }

    /**
     * 中括号类型 支持枚举值：  CN: 中文类型  GB: 英文类型
     * @return brackets
     */
    public String getBrackets() {
        return brackets;
    }

    public void setBrackets(String brackets) {
        this.brackets = brackets;
    }

    public SmsTemplateResp withSite(String site) {
        this.site = site;
        return this;
    }

    /**
     * 站点
     * @return site
     */
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public SmsTemplateResp withUrgeStatus(String urgeStatus) {
        this.urgeStatus = urgeStatus;
        return this;
    }

    /**
     * 催审状态
     * @return urgeStatus
     */
    public String getUrgeStatus() {
        return urgeStatus;
    }

    public void setUrgeStatus(String urgeStatus) {
        this.urgeStatus = urgeStatus;
    }

    public SmsTemplateResp withUrgeTime(String urgeTime) {
        this.urgeTime = urgeTime;
        return this;
    }

    /**
     * 催审时间
     * @return urgeTime
     */
    public String getUrgeTime() {
        return urgeTime;
    }

    public void setUrgeTime(String urgeTime) {
        this.urgeTime = urgeTime;
    }

    public SmsTemplateResp withUrgeDesc(String urgeDesc) {
        this.urgeDesc = urgeDesc;
        return this;
    }

    /**
     * 催审描述
     * @return urgeDesc
     */
    public String getUrgeDesc() {
        return urgeDesc;
    }

    public void setUrgeDesc(String urgeDesc) {
        this.urgeDesc = urgeDesc;
    }

    public SmsTemplateResp withSendCountry1(Long sendCountry1) {
        this.sendCountry1 = sendCountry1;
        return this;
    }

    /**
     * 发送国家1
     * minimum: 0
     * maximum: 2147483647
     * @return sendCountry1
     */
    public Long getSendCountry1() {
        return sendCountry1;
    }

    public void setSendCountry1(Long sendCountry1) {
        this.sendCountry1 = sendCountry1;
    }

    public SmsTemplateResp withSendCountry2(Long sendCountry2) {
        this.sendCountry2 = sendCountry2;
        return this;
    }

    /**
     * 发送国家2
     * minimum: 0
     * maximum: 2147483647
     * @return sendCountry2
     */
    public Long getSendCountry2() {
        return sendCountry2;
    }

    public void setSendCountry2(Long sendCountry2) {
        this.sendCountry2 = sendCountry2;
    }

    public SmsTemplateResp withSendCountry3(Long sendCountry3) {
        this.sendCountry3 = sendCountry3;
        return this;
    }

    /**
     * 发送国家3
     * minimum: 0
     * maximum: 2147483647
     * @return sendCountry3
     */
    public Long getSendCountry3() {
        return sendCountry3;
    }

    public void setSendCountry3(Long sendCountry3) {
        this.sendCountry3 = sendCountry3;
    }

    public SmsTemplateResp withIsSupportMultiomp(Boolean isSupportMultiomp) {
        this.isSupportMultiomp = isSupportMultiomp;
        return this;
    }

    /**
     * 是否支持多OMP
     * @return isSupportMultiomp
     */
    public Boolean getIsSupportMultiomp() {
        return isSupportMultiomp;
    }

    public void setIsSupportMultiomp(Boolean isSupportMultiomp) {
        this.isSupportMultiomp = isSupportMultiomp;
    }

    public SmsTemplateResp withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * 国家名称列表，返回发送国家前三名的国家名称，国家名称间以\"~\"分隔
     * @return countryName
     */
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmsTemplateResp that = (SmsTemplateResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.customerId, that.customerId)
            && Objects.equals(this.tenant, that.tenant) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.templateType, that.templateType)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.appKey, that.appKey)
            && Objects.equals(this.signId, that.signId) && Objects.equals(this.templateContent, that.templateContent)
            && Objects.equals(this.hasVariable, that.hasVariable)
            && Objects.equals(this.templateDesc, that.templateDesc) && Objects.equals(this.reviewDesc, that.reviewDesc)
            && Objects.equals(this.reviewOrder, that.reviewOrder) && Objects.equals(this.flowStatus, that.flowStatus)
            && Objects.equals(this.universalTemplate, that.universalTemplate)
            && Objects.equals(this.status, that.status) && Objects.equals(this.region, that.region)
            && Objects.equals(this.brackets, that.brackets) && Objects.equals(this.site, that.site)
            && Objects.equals(this.urgeStatus, that.urgeStatus) && Objects.equals(this.urgeTime, that.urgeTime)
            && Objects.equals(this.urgeDesc, that.urgeDesc) && Objects.equals(this.sendCountry1, that.sendCountry1)
            && Objects.equals(this.sendCountry2, that.sendCountry2)
            && Objects.equals(this.sendCountry3, that.sendCountry3)
            && Objects.equals(this.isSupportMultiomp, that.isSupportMultiomp)
            && Objects.equals(this.countryName, that.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            createTime,
            updateTime,
            customerId,
            tenant,
            templateName,
            templateId,
            templateType,
            appName,
            appKey,
            signId,
            templateContent,
            hasVariable,
            templateDesc,
            reviewDesc,
            reviewOrder,
            flowStatus,
            universalTemplate,
            status,
            region,
            brackets,
            site,
            urgeStatus,
            urgeTime,
            urgeDesc,
            sendCountry1,
            sendCountry2,
            sendCountry3,
            isSupportMultiomp,
            countryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsTemplateResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    signId: ").append(toIndentedString(signId)).append("\n");
        sb.append("    templateContent: ").append(toIndentedString(templateContent)).append("\n");
        sb.append("    hasVariable: ").append(toIndentedString(hasVariable)).append("\n");
        sb.append("    templateDesc: ").append(toIndentedString(templateDesc)).append("\n");
        sb.append("    reviewDesc: ").append(toIndentedString(reviewDesc)).append("\n");
        sb.append("    reviewOrder: ").append(toIndentedString(reviewOrder)).append("\n");
        sb.append("    flowStatus: ").append(toIndentedString(flowStatus)).append("\n");
        sb.append("    universalTemplate: ").append(toIndentedString(universalTemplate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    brackets: ").append(toIndentedString(brackets)).append("\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
        sb.append("    urgeStatus: ").append(toIndentedString(urgeStatus)).append("\n");
        sb.append("    urgeTime: ").append(toIndentedString(urgeTime)).append("\n");
        sb.append("    urgeDesc: ").append(toIndentedString(urgeDesc)).append("\n");
        sb.append("    sendCountry1: ").append(toIndentedString(sendCountry1)).append("\n");
        sb.append("    sendCountry2: ").append(toIndentedString(sendCountry2)).append("\n");
        sb.append("    sendCountry3: ").append(toIndentedString(sendCountry3)).append("\n");
        sb.append("    isSupportMultiomp: ").append(toIndentedString(isSupportMultiomp)).append("\n");
        sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
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
