package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSignatureResponse extends SdkResponse {

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

    public ShowSignatureResponse withId(String id) {
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

    public ShowSignatureResponse withCreateTime(String createTime) {
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

    public ShowSignatureResponse withUpdateTime(String updateTime) {
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

    public ShowSignatureResponse withCustomerId(String customerId) {
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

    public ShowSignatureResponse withTenant(TenantBasic tenant) {
        this.tenant = tenant;
        return this;
    }

    public ShowSignatureResponse withTenant(Consumer<TenantBasic> tenantSetter) {
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

    public ShowSignatureResponse withSignatureName(String signatureName) {
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

    public ShowSignatureResponse withSignatureId(String signatureId) {
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

    public ShowSignatureResponse withSignatureType(String signatureType) {
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

    public ShowSignatureResponse withAppName(String appName) {
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

    public ShowSignatureResponse withApplyDesc(String applyDesc) {
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

    public ShowSignatureResponse withChannelNum(String channelNum) {
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

    public ShowSignatureResponse withReviewDesc(String reviewDesc) {
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

    public ShowSignatureResponse withFileId(String fileId) {
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

    public ShowSignatureResponse withStatus(String status) {
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

    public ShowSignatureResponse withSite(String site) {
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

    public ShowSignatureResponse withSignatureSource(Integer signatureSource) {
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

    public ShowSignatureResponse withIsInvolvedThird(String isInvolvedThird) {
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

    public ShowSignatureResponse withPowerAttorneyFileId(String powerAttorneyFileId) {
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

    public ShowSignatureResponse withUrgeStatus(String urgeStatus) {
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

    public ShowSignatureResponse withUrgeTime(String urgeTime) {
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

    public ShowSignatureResponse withUrgeDesc(String urgeDesc) {
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

    public ShowSignatureResponse withAppKey(String appKey) {
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

    public ShowSignatureResponse withSourceTitleContent(String sourceTitleContent) {
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

    public ShowSignatureResponse withSignatureUsage(String signatureUsage) {
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
        ShowSignatureResponse showSignatureResponse = (ShowSignatureResponse) o;
        return Objects.equals(this.id, showSignatureResponse.id)
            && Objects.equals(this.createTime, showSignatureResponse.createTime)
            && Objects.equals(this.updateTime, showSignatureResponse.updateTime)
            && Objects.equals(this.customerId, showSignatureResponse.customerId)
            && Objects.equals(this.tenant, showSignatureResponse.tenant)
            && Objects.equals(this.signatureName, showSignatureResponse.signatureName)
            && Objects.equals(this.signatureId, showSignatureResponse.signatureId)
            && Objects.equals(this.signatureType, showSignatureResponse.signatureType)
            && Objects.equals(this.appName, showSignatureResponse.appName)
            && Objects.equals(this.applyDesc, showSignatureResponse.applyDesc)
            && Objects.equals(this.channelNum, showSignatureResponse.channelNum)
            && Objects.equals(this.reviewDesc, showSignatureResponse.reviewDesc)
            && Objects.equals(this.fileId, showSignatureResponse.fileId)
            && Objects.equals(this.status, showSignatureResponse.status)
            && Objects.equals(this.site, showSignatureResponse.site)
            && Objects.equals(this.signatureSource, showSignatureResponse.signatureSource)
            && Objects.equals(this.isInvolvedThird, showSignatureResponse.isInvolvedThird)
            && Objects.equals(this.powerAttorneyFileId, showSignatureResponse.powerAttorneyFileId)
            && Objects.equals(this.urgeStatus, showSignatureResponse.urgeStatus)
            && Objects.equals(this.urgeTime, showSignatureResponse.urgeTime)
            && Objects.equals(this.urgeDesc, showSignatureResponse.urgeDesc)
            && Objects.equals(this.appKey, showSignatureResponse.appKey)
            && Objects.equals(this.sourceTitleContent, showSignatureResponse.sourceTitleContent)
            && Objects.equals(this.signatureUsage, showSignatureResponse.signatureUsage);
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
        sb.append("class ShowSignatureResponse {\n");
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
