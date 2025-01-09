package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 申请开通云办公服务请求
 */
public class ApplyWorkspaceReq {

    /**
     * 主认证方式。 - KERBEROS：KERBEROS。 - KERBEROS_THIRD_SSO：第三方登录认证。
     */
    public static final class AuthTypeEnum {

        /**
         * Enum KERBEROS for value: "KERBEROS"
         */
        public static final AuthTypeEnum KERBEROS = new AuthTypeEnum("KERBEROS");

        /**
         * Enum KERBEROS_THIRD_SSO for value: "KERBEROS_THIRD_SSO"
         */
        public static final AuthTypeEnum KERBEROS_THIRD_SSO = new AuthTypeEnum("KERBEROS_THIRD_SSO");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("KERBEROS", KERBEROS);
            map.put("KERBEROS_THIRD_SSO", KERBEROS_THIRD_SSO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthTypeEnum(value));
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthTypeEnum) {
                return this.value.equals(((AuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthTypeEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad_domains")

    private AdDomain adDomains;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_gateway_info")

    private ThirdGatewayConfigInfo thirdGatewayInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_id")

    private String enterpriseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_ids")

    private List<Subnet> subnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_subnet_cidr")

    private String manageSubnetCidr;

    /**
     * 接入方式。 - INTERNET：表示Internet接入。 - DEDICATED：表示专线接入。 - BOTH：表示两种接入方式都支持。
     */
    public static final class AccessModeEnum {

        /**
         * Enum INTERNET for value: "INTERNET"
         */
        public static final AccessModeEnum INTERNET = new AccessModeEnum("INTERNET");

        /**
         * Enum DEDICATED for value: "DEDICATED"
         */
        public static final AccessModeEnum DEDICATED = new AccessModeEnum("DEDICATED");

        /**
         * Enum BOTH for value: "BOTH"
         */
        public static final AccessModeEnum BOTH = new AccessModeEnum("BOTH");

        private static final Map<String, AccessModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessModeEnum> createStaticFields() {
            Map<String, AccessModeEnum> map = new HashMap<>();
            map.put("INTERNET", INTERNET);
            map.put("DEDICATED", DEDICATED);
            map.put("BOTH", BOTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AccessModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessModeEnum(value));
        }

        public static AccessModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessModeEnum) {
                return this.value.equals(((AccessModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    private AccessModeEnum accessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_shared_vpc_dedicated_param")

    private ApplySharedVpcDedicatedParam applySharedVpcDedicatedParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_subnets")

    private String dedicatedSubnets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_type")

    private String publicipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assist_auth_config")

    private AssistAuthMethodConfigRequest assistAuthConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_configs")

    private List<SiteConfigsRequest> siteConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_send_email")

    private Boolean isSendEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ApplyWorkspaceReq withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 主认证方式。 - KERBEROS：KERBEROS。 - KERBEROS_THIRD_SSO：第三方登录认证。
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public ApplyWorkspaceReq withAdDomains(AdDomain adDomains) {
        this.adDomains = adDomains;
        return this;
    }

    public ApplyWorkspaceReq withAdDomains(Consumer<AdDomain> adDomainsSetter) {
        if (this.adDomains == null) {
            this.adDomains = new AdDomain();
            adDomainsSetter.accept(this.adDomains);
        }

        return this;
    }

    /**
     * Get adDomains
     * @return adDomains
     */
    public AdDomain getAdDomains() {
        return adDomains;
    }

    public void setAdDomains(AdDomain adDomains) {
        this.adDomains = adDomains;
    }

    public ApplyWorkspaceReq withThirdGatewayInfo(ThirdGatewayConfigInfo thirdGatewayInfo) {
        this.thirdGatewayInfo = thirdGatewayInfo;
        return this;
    }

    public ApplyWorkspaceReq withThirdGatewayInfo(Consumer<ThirdGatewayConfigInfo> thirdGatewayInfoSetter) {
        if (this.thirdGatewayInfo == null) {
            this.thirdGatewayInfo = new ThirdGatewayConfigInfo();
            thirdGatewayInfoSetter.accept(this.thirdGatewayInfo);
        }

        return this;
    }

    /**
     * Get thirdGatewayInfo
     * @return thirdGatewayInfo
     */
    public ThirdGatewayConfigInfo getThirdGatewayInfo() {
        return thirdGatewayInfo;
    }

    public void setThirdGatewayInfo(ThirdGatewayConfigInfo thirdGatewayInfo) {
        this.thirdGatewayInfo = thirdGatewayInfo;
    }

    public ApplyWorkspaceReq withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * 企业ID。 企业ID是您在云桌面服务的唯一标识，终端用户登录时需要填写企业ID，若不自定义设置企业ID，系统将自动生成您的企业ID。格式为由半角数字、字母、_-组成，长度范围小于等于32个字符。
     * @return enterpriseId
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public ApplyWorkspaceReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ApplyWorkspaceReq withSubnetIds(List<Subnet> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public ApplyWorkspaceReq addSubnetIdsItem(Subnet subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    public ApplyWorkspaceReq withSubnetIds(Consumer<List<Subnet>> subnetIdsSetter) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        subnetIdsSetter.accept(this.subnetIds);
        return this;
    }

    /**
     * 指定业务子网的网络ID，子网不能与172.16.0.0/12冲突。
     * @return subnetIds
     */
    public List<Subnet> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<Subnet> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public ApplyWorkspaceReq withManageSubnetCidr(String manageSubnetCidr) {
        this.manageSubnetCidr = manageSubnetCidr;
        return this;
    }

    /**
     * 管理子网网段。 注：不能与172.16.0.0/12以及subnet_ids参数下子网的网段冲突。
     * @return manageSubnetCidr
     */
    public String getManageSubnetCidr() {
        return manageSubnetCidr;
    }

    public void setManageSubnetCidr(String manageSubnetCidr) {
        this.manageSubnetCidr = manageSubnetCidr;
    }

    public ApplyWorkspaceReq withAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * 接入方式。 - INTERNET：表示Internet接入。 - DEDICATED：表示专线接入。 - BOTH：表示两种接入方式都支持。
     * @return accessMode
     */
    public AccessModeEnum getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
    }

    public ApplyWorkspaceReq withApplySharedVpcDedicatedParam(
        ApplySharedVpcDedicatedParam applySharedVpcDedicatedParam) {
        this.applySharedVpcDedicatedParam = applySharedVpcDedicatedParam;
        return this;
    }

    public ApplyWorkspaceReq withApplySharedVpcDedicatedParam(
        Consumer<ApplySharedVpcDedicatedParam> applySharedVpcDedicatedParamSetter) {
        if (this.applySharedVpcDedicatedParam == null) {
            this.applySharedVpcDedicatedParam = new ApplySharedVpcDedicatedParam();
            applySharedVpcDedicatedParamSetter.accept(this.applySharedVpcDedicatedParam);
        }

        return this;
    }

    /**
     * Get applySharedVpcDedicatedParam
     * @return applySharedVpcDedicatedParam
     */
    public ApplySharedVpcDedicatedParam getApplySharedVpcDedicatedParam() {
        return applySharedVpcDedicatedParam;
    }

    public void setApplySharedVpcDedicatedParam(ApplySharedVpcDedicatedParam applySharedVpcDedicatedParam) {
        this.applySharedVpcDedicatedParam = applySharedVpcDedicatedParam;
    }

    public ApplyWorkspaceReq withDedicatedSubnets(String dedicatedSubnets) {
        this.dedicatedSubnets = dedicatedSubnets;
        return this;
    }

    /**
     * 专线接入网段列表，多个网段信息用分号隔开，列表长度不超过5。
     * @return dedicatedSubnets
     */
    public String getDedicatedSubnets() {
        return dedicatedSubnets;
    }

    public void setDedicatedSubnets(String dedicatedSubnets) {
        this.dedicatedSubnets = dedicatedSubnets;
    }

    public ApplyWorkspaceReq withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 开通服务资源使用的可用分区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ApplyWorkspaceReq withPublicipType(String publicipType) {
        this.publicipType = publicipType;
        return this;
    }

    /**
     * 外部网络。
     * @return publicipType
     */
    public String getPublicipType() {
        return publicipType;
    }

    public void setPublicipType(String publicipType) {
        this.publicipType = publicipType;
    }

    public ApplyWorkspaceReq withAssistAuthConfig(AssistAuthMethodConfigRequest assistAuthConfig) {
        this.assistAuthConfig = assistAuthConfig;
        return this;
    }

    public ApplyWorkspaceReq withAssistAuthConfig(Consumer<AssistAuthMethodConfigRequest> assistAuthConfigSetter) {
        if (this.assistAuthConfig == null) {
            this.assistAuthConfig = new AssistAuthMethodConfigRequest();
            assistAuthConfigSetter.accept(this.assistAuthConfig);
        }

        return this;
    }

    /**
     * Get assistAuthConfig
     * @return assistAuthConfig
     */
    public AssistAuthMethodConfigRequest getAssistAuthConfig() {
        return assistAuthConfig;
    }

    public void setAssistAuthConfig(AssistAuthMethodConfigRequest assistAuthConfig) {
        this.assistAuthConfig = assistAuthConfig;
    }

    public ApplyWorkspaceReq withSiteConfigs(List<SiteConfigsRequest> siteConfigs) {
        this.siteConfigs = siteConfigs;
        return this;
    }

    public ApplyWorkspaceReq addSiteConfigsItem(SiteConfigsRequest siteConfigsItem) {
        if (this.siteConfigs == null) {
            this.siteConfigs = new ArrayList<>();
        }
        this.siteConfigs.add(siteConfigsItem);
        return this;
    }

    public ApplyWorkspaceReq withSiteConfigs(Consumer<List<SiteConfigsRequest>> siteConfigsSetter) {
        if (this.siteConfigs == null) {
            this.siteConfigs = new ArrayList<>();
        }
        siteConfigsSetter.accept(this.siteConfigs);
        return this;
    }

    /**
     * 边缘开户信息
     * @return siteConfigs
     */
    public List<SiteConfigsRequest> getSiteConfigs() {
        return siteConfigs;
    }

    public void setSiteConfigs(List<SiteConfigsRequest> siteConfigs) {
        this.siteConfigs = siteConfigs;
    }

    public ApplyWorkspaceReq withIsSendEmail(Boolean isSendEmail) {
        this.isSendEmail = isSendEmail;
        return this;
    }

    /**
     * 桌面退订是否发送邮件通知。
     * @return isSendEmail
     */
    public Boolean getIsSendEmail() {
        return isSendEmail;
    }

    public void setIsSendEmail(Boolean isSendEmail) {
        this.isSendEmail = isSendEmail;
    }

    public ApplyWorkspaceReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，默认\"0\"
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyWorkspaceReq that = (ApplyWorkspaceReq) obj;
        return Objects.equals(this.authType, that.authType) && Objects.equals(this.adDomains, that.adDomains)
            && Objects.equals(this.thirdGatewayInfo, that.thirdGatewayInfo)
            && Objects.equals(this.enterpriseId, that.enterpriseId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetIds, that.subnetIds)
            && Objects.equals(this.manageSubnetCidr, that.manageSubnetCidr)
            && Objects.equals(this.accessMode, that.accessMode)
            && Objects.equals(this.applySharedVpcDedicatedParam, that.applySharedVpcDedicatedParam)
            && Objects.equals(this.dedicatedSubnets, that.dedicatedSubnets)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.publicipType, that.publicipType)
            && Objects.equals(this.assistAuthConfig, that.assistAuthConfig)
            && Objects.equals(this.siteConfigs, that.siteConfigs) && Objects.equals(this.isSendEmail, that.isSendEmail)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType,
            adDomains,
            thirdGatewayInfo,
            enterpriseId,
            vpcId,
            subnetIds,
            manageSubnetCidr,
            accessMode,
            applySharedVpcDedicatedParam,
            dedicatedSubnets,
            availabilityZone,
            publicipType,
            assistAuthConfig,
            siteConfigs,
            isSendEmail,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyWorkspaceReq {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    adDomains: ").append(toIndentedString(adDomains)).append("\n");
        sb.append("    thirdGatewayInfo: ").append(toIndentedString(thirdGatewayInfo)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    manageSubnetCidr: ").append(toIndentedString(manageSubnetCidr)).append("\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    applySharedVpcDedicatedParam: ")
            .append(toIndentedString(applySharedVpcDedicatedParam))
            .append("\n");
        sb.append("    dedicatedSubnets: ").append(toIndentedString(dedicatedSubnets)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    publicipType: ").append(toIndentedString(publicipType)).append("\n");
        sb.append("    assistAuthConfig: ").append(toIndentedString(assistAuthConfig)).append("\n");
        sb.append("    siteConfigs: ").append(toIndentedString(siteConfigs)).append("\n");
        sb.append("    isSendEmail: ").append(toIndentedString(isSendEmail)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
