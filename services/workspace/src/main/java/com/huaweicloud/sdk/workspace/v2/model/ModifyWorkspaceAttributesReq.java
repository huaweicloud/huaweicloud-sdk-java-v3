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
 * ModifyWorkspaceAttributesReq
 */
public class ModifyWorkspaceAttributesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad_info")

    private AdDomainInfo adInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad_domains")

    private AdDomain adDomains;

    /**
     * 接入模式。 - INTERNET：互联网接入。 - DEDICATED：专线接入。 - BOTH：代表两种接入方式都支持。
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
    @JsonProperty(value = "dedicated_subnets")

    private String dedicatedSubnets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adn_conflict_network")

    private String adnConflictNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_ids")

    private List<String> subnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_access_port")

    private String internetAccessPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_id")

    private String enterpriseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_send_email")

    private Boolean isSendEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_vnc_ip")

    private String dcVncIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorized_collect_log")

    private Boolean authorizedCollectLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorized_hda_upgrade")

    private Boolean authorizedHdaUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_shared_vpc_dedicated_param")

    private ApplySharedVpcDedicatedParam applySharedVpcDedicatedParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_dedicated_standby_network_param")

    private ApplyDedicatedStandbyNetworkParam applyDedicatedStandbyNetworkParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_authorized_install_agent")

    private Boolean isAuthorizedInstallAgent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_user_create_snapshot")

    private Boolean enableUserCreateSnapshot;

    public ModifyWorkspaceAttributesReq withAdInfo(AdDomainInfo adInfo) {
        this.adInfo = adInfo;
        return this;
    }

    public ModifyWorkspaceAttributesReq withAdInfo(Consumer<AdDomainInfo> adInfoSetter) {
        if (this.adInfo == null) {
            this.adInfo = new AdDomainInfo();
            adInfoSetter.accept(this.adInfo);
        }

        return this;
    }

    /**
     * Get adInfo
     * @return adInfo
     */
    public AdDomainInfo getAdInfo() {
        return adInfo;
    }

    public void setAdInfo(AdDomainInfo adInfo) {
        this.adInfo = adInfo;
    }

    public ModifyWorkspaceAttributesReq withAdDomains(AdDomain adDomains) {
        this.adDomains = adDomains;
        return this;
    }

    public ModifyWorkspaceAttributesReq withAdDomains(Consumer<AdDomain> adDomainsSetter) {
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

    public ModifyWorkspaceAttributesReq withAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * 接入模式。 - INTERNET：互联网接入。 - DEDICATED：专线接入。 - BOTH：代表两种接入方式都支持。
     * @return accessMode
     */
    public AccessModeEnum getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
    }

    public ModifyWorkspaceAttributesReq withDedicatedSubnets(String dedicatedSubnets) {
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

    public ModifyWorkspaceAttributesReq withAdnConflictNetwork(String adnConflictNetwork) {
        this.adnConflictNetwork = adnConflictNetwork;
        return this;
    }

    /**
     * ADN上网冲突网段列表，多个网段信息用分号隔开，列表长度不超过50。
     * @return adnConflictNetwork
     */
    public String getAdnConflictNetwork() {
        return adnConflictNetwork;
    }

    public void setAdnConflictNetwork(String adnConflictNetwork) {
        this.adnConflictNetwork = adnConflictNetwork;
    }

    public ModifyWorkspaceAttributesReq withSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    public ModifyWorkspaceAttributesReq addSubnetIdsItem(String subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    public ModifyWorkspaceAttributesReq withSubnetIds(Consumer<List<String>> subnetIdsSetter) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        subnetIdsSetter.accept(this.subnetIds);
        return this;
    }

    /**
     * 子网的网络ID列表。
     * @return subnetIds
     */
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public ModifyWorkspaceAttributesReq withInternetAccessPort(String internetAccessPort) {
        this.internetAccessPort = internetAccessPort;
        return this;
    }

    /**
     * 互联网接入端口。
     * @return internetAccessPort
     */
    public String getInternetAccessPort() {
        return internetAccessPort;
    }

    public void setInternetAccessPort(String internetAccessPort) {
        this.internetAccessPort = internetAccessPort;
    }

    public ModifyWorkspaceAttributesReq withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * 企业ID。
     * @return enterpriseId
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public ModifyWorkspaceAttributesReq withIsSendEmail(Boolean isSendEmail) {
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

    public ModifyWorkspaceAttributesReq withDcVncIp(String dcVncIp) {
        this.dcVncIp = dcVncIp;
        return this;
    }

    /**
     * 开通专线访问VNC功能，如果传入的是default则自动创建，如果传入的自定义的dc_vnc_ip则直接使用，如果传入的是close表示关闭自定义VNC。
     * @return dcVncIp
     */
    public String getDcVncIp() {
        return dcVncIp;
    }

    public void setDcVncIp(String dcVncIp) {
        this.dcVncIp = dcVncIp;
    }

    public ModifyWorkspaceAttributesReq withAuthorizedCollectLog(Boolean authorizedCollectLog) {
        this.authorizedCollectLog = authorizedCollectLog;
        return this;
    }

    /**
     * 是否授权收集日志。
     * @return authorizedCollectLog
     */
    public Boolean getAuthorizedCollectLog() {
        return authorizedCollectLog;
    }

    public void setAuthorizedCollectLog(Boolean authorizedCollectLog) {
        this.authorizedCollectLog = authorizedCollectLog;
    }

    public ModifyWorkspaceAttributesReq withAuthorizedHdaUpgrade(Boolean authorizedHdaUpgrade) {
        this.authorizedHdaUpgrade = authorizedHdaUpgrade;
        return this;
    }

    /**
     * 是否授权hda升级。
     * @return authorizedHdaUpgrade
     */
    public Boolean getAuthorizedHdaUpgrade() {
        return authorizedHdaUpgrade;
    }

    public void setAuthorizedHdaUpgrade(Boolean authorizedHdaUpgrade) {
        this.authorizedHdaUpgrade = authorizedHdaUpgrade;
    }

    public ModifyWorkspaceAttributesReq withApplySharedVpcDedicatedParam(
        ApplySharedVpcDedicatedParam applySharedVpcDedicatedParam) {
        this.applySharedVpcDedicatedParam = applySharedVpcDedicatedParam;
        return this;
    }

    public ModifyWorkspaceAttributesReq withApplySharedVpcDedicatedParam(
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

    public ModifyWorkspaceAttributesReq withApplyDedicatedStandbyNetworkParam(
        ApplyDedicatedStandbyNetworkParam applyDedicatedStandbyNetworkParam) {
        this.applyDedicatedStandbyNetworkParam = applyDedicatedStandbyNetworkParam;
        return this;
    }

    public ModifyWorkspaceAttributesReq withApplyDedicatedStandbyNetworkParam(
        Consumer<ApplyDedicatedStandbyNetworkParam> applyDedicatedStandbyNetworkParamSetter) {
        if (this.applyDedicatedStandbyNetworkParam == null) {
            this.applyDedicatedStandbyNetworkParam = new ApplyDedicatedStandbyNetworkParam();
            applyDedicatedStandbyNetworkParamSetter.accept(this.applyDedicatedStandbyNetworkParam);
        }

        return this;
    }

    /**
     * Get applyDedicatedStandbyNetworkParam
     * @return applyDedicatedStandbyNetworkParam
     */
    public ApplyDedicatedStandbyNetworkParam getApplyDedicatedStandbyNetworkParam() {
        return applyDedicatedStandbyNetworkParam;
    }

    public void setApplyDedicatedStandbyNetworkParam(
        ApplyDedicatedStandbyNetworkParam applyDedicatedStandbyNetworkParam) {
        this.applyDedicatedStandbyNetworkParam = applyDedicatedStandbyNetworkParam;
    }

    public ModifyWorkspaceAttributesReq withIsAuthorizedInstallAgent(Boolean isAuthorizedInstallAgent) {
        this.isAuthorizedInstallAgent = isAuthorizedInstallAgent;
        return this;
    }

    /**
     * 是否授权桌面自动安装agent插件。
     * @return isAuthorizedInstallAgent
     */
    public Boolean getIsAuthorizedInstallAgent() {
        return isAuthorizedInstallAgent;
    }

    public void setIsAuthorizedInstallAgent(Boolean isAuthorizedInstallAgent) {
        this.isAuthorizedInstallAgent = isAuthorizedInstallAgent;
    }

    public ModifyWorkspaceAttributesReq withEnableUserCreateSnapshot(Boolean enableUserCreateSnapshot) {
        this.enableUserCreateSnapshot = enableUserCreateSnapshot;
        return this;
    }

    /**
     * 是否授权最终租户创建快照。
     * @return enableUserCreateSnapshot
     */
    public Boolean getEnableUserCreateSnapshot() {
        return enableUserCreateSnapshot;
    }

    public void setEnableUserCreateSnapshot(Boolean enableUserCreateSnapshot) {
        this.enableUserCreateSnapshot = enableUserCreateSnapshot;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyWorkspaceAttributesReq that = (ModifyWorkspaceAttributesReq) obj;
        return Objects.equals(this.adInfo, that.adInfo) && Objects.equals(this.adDomains, that.adDomains)
            && Objects.equals(this.accessMode, that.accessMode)
            && Objects.equals(this.dedicatedSubnets, that.dedicatedSubnets)
            && Objects.equals(this.adnConflictNetwork, that.adnConflictNetwork)
            && Objects.equals(this.subnetIds, that.subnetIds)
            && Objects.equals(this.internetAccessPort, that.internetAccessPort)
            && Objects.equals(this.enterpriseId, that.enterpriseId)
            && Objects.equals(this.isSendEmail, that.isSendEmail) && Objects.equals(this.dcVncIp, that.dcVncIp)
            && Objects.equals(this.authorizedCollectLog, that.authorizedCollectLog)
            && Objects.equals(this.authorizedHdaUpgrade, that.authorizedHdaUpgrade)
            && Objects.equals(this.applySharedVpcDedicatedParam, that.applySharedVpcDedicatedParam)
            && Objects.equals(this.applyDedicatedStandbyNetworkParam, that.applyDedicatedStandbyNetworkParam)
            && Objects.equals(this.isAuthorizedInstallAgent, that.isAuthorizedInstallAgent)
            && Objects.equals(this.enableUserCreateSnapshot, that.enableUserCreateSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adInfo,
            adDomains,
            accessMode,
            dedicatedSubnets,
            adnConflictNetwork,
            subnetIds,
            internetAccessPort,
            enterpriseId,
            isSendEmail,
            dcVncIp,
            authorizedCollectLog,
            authorizedHdaUpgrade,
            applySharedVpcDedicatedParam,
            applyDedicatedStandbyNetworkParam,
            isAuthorizedInstallAgent,
            enableUserCreateSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyWorkspaceAttributesReq {\n");
        sb.append("    adInfo: ").append(toIndentedString(adInfo)).append("\n");
        sb.append("    adDomains: ").append(toIndentedString(adDomains)).append("\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    dedicatedSubnets: ").append(toIndentedString(dedicatedSubnets)).append("\n");
        sb.append("    adnConflictNetwork: ").append(toIndentedString(adnConflictNetwork)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    internetAccessPort: ").append(toIndentedString(internetAccessPort)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
        sb.append("    isSendEmail: ").append(toIndentedString(isSendEmail)).append("\n");
        sb.append("    dcVncIp: ").append(toIndentedString(dcVncIp)).append("\n");
        sb.append("    authorizedCollectLog: ").append(toIndentedString(authorizedCollectLog)).append("\n");
        sb.append("    authorizedHdaUpgrade: ").append(toIndentedString(authorizedHdaUpgrade)).append("\n");
        sb.append("    applySharedVpcDedicatedParam: ")
            .append(toIndentedString(applySharedVpcDedicatedParam))
            .append("\n");
        sb.append("    applyDedicatedStandbyNetworkParam: ")
            .append(toIndentedString(applyDedicatedStandbyNetworkParam))
            .append("\n");
        sb.append("    isAuthorizedInstallAgent: ").append(toIndentedString(isAuthorizedInstallAgent)).append("\n");
        sb.append("    enableUserCreateSnapshot: ").append(toIndentedString(enableUserCreateSnapshot)).append("\n");
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
