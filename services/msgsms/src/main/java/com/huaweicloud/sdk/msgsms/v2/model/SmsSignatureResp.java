package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmsSignatureResp
 */
public class SmsSignatureResp {

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
    @JsonProperty(value = "signature_name")

    private String signatureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_id")

    private String signatureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_type")

    private String signatureType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_desc")

    private String applyDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_num")

    private String channelNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_desc")

    private String reviewDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site")

    private String site;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_source")

    private Integer signatureSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_involved_third")

    private String isInvolvedThird;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_attorney_file_id")

    private String powerAttorneyFileId;

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
    @JsonProperty(value = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_title_content")

    private String sourceTitleContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_usage")

    private String signatureUsage;

    public SmsSignatureResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 签名主键id，用于获取、修改、删除、申请激活签名的唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SmsSignatureResp withCreateTime(String createTime) {
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

    public SmsSignatureResp withUpdateTime(String updateTime) {
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

    public SmsSignatureResp withCustomerId(String customerId) {
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

    public SmsSignatureResp withTenant(TenantBasic tenant) {
        this.tenant = tenant;
        return this;
    }

    public SmsSignatureResp withTenant(Consumer<TenantBasic> tenantSetter) {
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

    public SmsSignatureResp withSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }

    /**
     * 签名名称
     * @return signatureName
     */
    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    public SmsSignatureResp withSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }

    /**
     * 签名id
     * @return signatureId
     */
    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }

    public SmsSignatureResp withSignatureType(String signatureType) {
        this.signatureType = signatureType;
        return this;
    }

    /**
     * 签名类型
     * @return signatureType
     */
    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

    public SmsSignatureResp withAppName(String appName) {
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

    public SmsSignatureResp withApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
        return this;
    }

    /**
     * 申请描述
     * @return applyDesc
     */
    public String getApplyDesc() {
        return applyDesc;
    }

    public void setApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
    }

    public SmsSignatureResp withChannelNum(String channelNum) {
        this.channelNum = channelNum;
        return this;
    }

    /**
     * 国内短信通道号，仅当签名审核成功，运营人员配置完成后返回。
     * @return channelNum
     */
    public String getChannelNum() {
        return channelNum;
    }

    public void setChannelNum(String channelNum) {
        this.channelNum = channelNum;
    }

    public SmsSignatureResp withReviewDesc(String reviewDesc) {
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

    public SmsSignatureResp withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 文件id
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public SmsSignatureResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 签名状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SmsSignatureResp withSite(String site) {
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

    public SmsSignatureResp withSignatureSource(Integer signatureSource) {
        this.signatureSource = signatureSource;
        return this;
    }

    /**
     * 签名来源
     * minimum: 0
     * maximum: 2147483647
     * @return signatureSource
     */
    public Integer getSignatureSource() {
        return signatureSource;
    }

    public void setSignatureSource(Integer signatureSource) {
        this.signatureSource = signatureSource;
    }

    public SmsSignatureResp withIsInvolvedThird(String isInvolvedThird) {
        this.isInvolvedThird = isInvolvedThird;
        return this;
    }

    /**
     * 是否涉及第三方权益
     * @return isInvolvedThird
     */
    public String getIsInvolvedThird() {
        return isInvolvedThird;
    }

    public void setIsInvolvedThird(String isInvolvedThird) {
        this.isInvolvedThird = isInvolvedThird;
    }

    public SmsSignatureResp withPowerAttorneyFileId(String powerAttorneyFileId) {
        this.powerAttorneyFileId = powerAttorneyFileId;
        return this;
    }

    /**
     * 授权委托书文件ID
     * @return powerAttorneyFileId
     */
    public String getPowerAttorneyFileId() {
        return powerAttorneyFileId;
    }

    public void setPowerAttorneyFileId(String powerAttorneyFileId) {
        this.powerAttorneyFileId = powerAttorneyFileId;
    }

    public SmsSignatureResp withUrgeStatus(String urgeStatus) {
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

    public SmsSignatureResp withUrgeTime(String urgeTime) {
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

    public SmsSignatureResp withUrgeDesc(String urgeDesc) {
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

    public SmsSignatureResp withAppKey(String appKey) {
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

    public SmsSignatureResp withSourceTitleContent(String sourceTitleContent) {
        this.sourceTitleContent = sourceTitleContent;
        return this;
    }

    /**
     * 标题内容
     * @return sourceTitleContent
     */
    public String getSourceTitleContent() {
        return sourceTitleContent;
    }

    public void setSourceTitleContent(String sourceTitleContent) {
        this.sourceTitleContent = sourceTitleContent;
    }

    public SmsSignatureResp withSignatureUsage(String signatureUsage) {
        this.signatureUsage = signatureUsage;
        return this;
    }

    /**
     * 签名用途
     * @return signatureUsage
     */
    public String getSignatureUsage() {
        return signatureUsage;
    }

    public void setSignatureUsage(String signatureUsage) {
        this.signatureUsage = signatureUsage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsSignatureResp smsSignatureResp = (SmsSignatureResp) o;
        return Objects.equals(this.id, smsSignatureResp.id)
            && Objects.equals(this.createTime, smsSignatureResp.createTime)
            && Objects.equals(this.updateTime, smsSignatureResp.updateTime)
            && Objects.equals(this.customerId, smsSignatureResp.customerId)
            && Objects.equals(this.tenant, smsSignatureResp.tenant)
            && Objects.equals(this.signatureName, smsSignatureResp.signatureName)
            && Objects.equals(this.signatureId, smsSignatureResp.signatureId)
            && Objects.equals(this.signatureType, smsSignatureResp.signatureType)
            && Objects.equals(this.appName, smsSignatureResp.appName)
            && Objects.equals(this.applyDesc, smsSignatureResp.applyDesc)
            && Objects.equals(this.channelNum, smsSignatureResp.channelNum)
            && Objects.equals(this.reviewDesc, smsSignatureResp.reviewDesc)
            && Objects.equals(this.fileId, smsSignatureResp.fileId)
            && Objects.equals(this.status, smsSignatureResp.status) && Objects.equals(this.site, smsSignatureResp.site)
            && Objects.equals(this.signatureSource, smsSignatureResp.signatureSource)
            && Objects.equals(this.isInvolvedThird, smsSignatureResp.isInvolvedThird)
            && Objects.equals(this.powerAttorneyFileId, smsSignatureResp.powerAttorneyFileId)
            && Objects.equals(this.urgeStatus, smsSignatureResp.urgeStatus)
            && Objects.equals(this.urgeTime, smsSignatureResp.urgeTime)
            && Objects.equals(this.urgeDesc, smsSignatureResp.urgeDesc)
            && Objects.equals(this.appKey, smsSignatureResp.appKey)
            && Objects.equals(this.sourceTitleContent, smsSignatureResp.sourceTitleContent)
            && Objects.equals(this.signatureUsage, smsSignatureResp.signatureUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            createTime,
            updateTime,
            customerId,
            tenant,
            signatureName,
            signatureId,
            signatureType,
            appName,
            applyDesc,
            channelNum,
            reviewDesc,
            fileId,
            status,
            site,
            signatureSource,
            isInvolvedThird,
            powerAttorneyFileId,
            urgeStatus,
            urgeTime,
            urgeDesc,
            appKey,
            sourceTitleContent,
            signatureUsage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsSignatureResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
        sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
        sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    applyDesc: ").append(toIndentedString(applyDesc)).append("\n");
        sb.append("    channelNum: ").append(toIndentedString(channelNum)).append("\n");
        sb.append("    reviewDesc: ").append(toIndentedString(reviewDesc)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
        sb.append("    signatureSource: ").append(toIndentedString(signatureSource)).append("\n");
        sb.append("    isInvolvedThird: ").append(toIndentedString(isInvolvedThird)).append("\n");
        sb.append("    powerAttorneyFileId: ").append(toIndentedString(powerAttorneyFileId)).append("\n");
        sb.append("    urgeStatus: ").append(toIndentedString(urgeStatus)).append("\n");
        sb.append("    urgeTime: ").append(toIndentedString(urgeTime)).append("\n");
        sb.append("    urgeDesc: ").append(toIndentedString(urgeDesc)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    sourceTitleContent: ").append(toIndentedString(sourceTitleContent)).append("\n");
        sb.append("    signatureUsage: ").append(toIndentedString(signatureUsage)).append("\n");
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
