package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmsAppQueryResp
 */
public class SmsAppQueryResp {

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
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "developer_account")

    private String developerAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "omp_app_name")

    private String ompAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "up_link_addr")

    private String upLinkAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "industry")

    private Integer industry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intl_channel_num")

    private String intlChannelNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_white_list")

    private String ipWhiteList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_access_addr")

    private String appAccessAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_multiomp")

    private Boolean isSupportMultiomp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private TenantBasic tenant;

    public SmsAppQueryResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用主键ID，用于获取、修改应用的唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SmsAppQueryResp withCreateTime(String createTime) {
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

    public SmsAppQueryResp withUpdateTime(String updateTime) {
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

    public SmsAppQueryResp withCustomerId(String customerId) {
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

    public SmsAppQueryResp withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 租户resource id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public SmsAppQueryResp withDeveloperAccount(String developerAccount) {
        this.developerAccount = developerAccount;
        return this;
    }

    /**
     * 租户开发者账号
     * @return developerAccount
     */
    public String getDeveloperAccount() {
        return developerAccount;
    }

    public void setDeveloperAccount(String developerAccount) {
        this.developerAccount = developerAccount;
    }

    public SmsAppQueryResp withAppName(String appName) {
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

    public SmsAppQueryResp withOmpAppName(String ompAppName) {
        this.ompAppName = ompAppName;
        return this;
    }

    /**
     * omp应用名称
     * @return ompAppName
     */
    public String getOmpAppName() {
        return ompAppName;
    }

    public void setOmpAppName(String ompAppName) {
        this.ompAppName = ompAppName;
    }

    public SmsAppQueryResp withAppKey(String appKey) {
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

    public SmsAppQueryResp withUpLinkAddr(String upLinkAddr) {
        this.upLinkAddr = upLinkAddr;
        return this;
    }

    /**
     * 上行短信地址
     * @return upLinkAddr
     */
    public String getUpLinkAddr() {
        return upLinkAddr;
    }

    public void setUpLinkAddr(String upLinkAddr) {
        this.upLinkAddr = upLinkAddr;
    }

    public SmsAppQueryResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 应用状态   CREATED：待上线。应用暂未创建成功，请稍候。   SUSPENDED：暂停。无法发起业务请求。当客户所发短信内容触发业务违规，或客户申请退订短信业务时，运营经理会将客户短信应用暂停。   LAUNCHED：正常。应用添加成功，可以正常使用。   PROCESSING：资源待分配。请联系客户经理或通过工单系统申请配置资源。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SmsAppQueryResp withIndustry(Integer industry) {
        this.industry = industry;
        return this;
    }

    /**
     * 行业类型
     * minimum: 0
     * maximum: 2147483647
     * @return industry
     */
    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public SmsAppQueryResp withRegion(String region) {
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

    public SmsAppQueryResp withIntlChannelNum(String intlChannelNum) {
        this.intlChannelNum = intlChannelNum;
        return this;
    }

    /**
     * 国际/港澳台短信通道号
     * @return intlChannelNum
     */
    public String getIntlChannelNum() {
        return intlChannelNum;
    }

    public void setIntlChannelNum(String intlChannelNum) {
        this.intlChannelNum = intlChannelNum;
    }

    public SmsAppQueryResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SmsAppQueryResp withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public SmsAppQueryResp withIpWhiteList(String ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }

    /**
     * IP白名单
     * @return ipWhiteList
     */
    public String getIpWhiteList() {
        return ipWhiteList;
    }

    public void setIpWhiteList(String ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }

    public SmsAppQueryResp withAppAccessAddr(String appAccessAddr) {
        this.appAccessAddr = appAccessAddr;
        return this;
    }

    /**
     * 接入地址
     * @return appAccessAddr
     */
    public String getAppAccessAddr() {
        return appAccessAddr;
    }

    public void setAppAccessAddr(String appAccessAddr) {
        this.appAccessAddr = appAccessAddr;
    }

    public SmsAppQueryResp withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public SmsAppQueryResp withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 平台
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public SmsAppQueryResp withIsSupportMultiomp(Boolean isSupportMultiomp) {
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

    public SmsAppQueryResp withTenant(TenantBasic tenant) {
        this.tenant = tenant;
        return this;
    }

    public SmsAppQueryResp withTenant(Consumer<TenantBasic> tenantSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmsAppQueryResp that = (SmsAppQueryResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.customerId, that.customerId)
            && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.developerAccount, that.developerAccount)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.ompAppName, that.ompAppName)
            && Objects.equals(this.appKey, that.appKey) && Objects.equals(this.upLinkAddr, that.upLinkAddr)
            && Objects.equals(this.status, that.status) && Objects.equals(this.industry, that.industry)
            && Objects.equals(this.region, that.region) && Objects.equals(this.intlChannelNum, that.intlChannelNum)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.ipWhiteList, that.ipWhiteList)
            && Objects.equals(this.appAccessAddr, that.appAccessAddr) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.platform, that.platform)
            && Objects.equals(this.isSupportMultiomp, that.isSupportMultiomp)
            && Objects.equals(this.tenant, that.tenant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            createTime,
            updateTime,
            customerId,
            resourceId,
            developerAccount,
            appName,
            ompAppName,
            appKey,
            upLinkAddr,
            status,
            industry,
            region,
            intlChannelNum,
            enterpriseProjectId,
            enterpriseProjectName,
            ipWhiteList,
            appAccessAddr,
            protocol,
            platform,
            isSupportMultiomp,
            tenant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsAppQueryResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    developerAccount: ").append(toIndentedString(developerAccount)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    ompAppName: ").append(toIndentedString(ompAppName)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    upLinkAddr: ").append(toIndentedString(upLinkAddr)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    intlChannelNum: ").append(toIndentedString(intlChannelNum)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    ipWhiteList: ").append(toIndentedString(ipWhiteList)).append("\n");
        sb.append("    appAccessAddr: ").append(toIndentedString(appAccessAddr)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    isSupportMultiomp: ").append(toIndentedString(isSupportMultiomp)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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
