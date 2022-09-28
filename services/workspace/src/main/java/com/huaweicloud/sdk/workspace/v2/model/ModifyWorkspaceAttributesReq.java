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
            AccessModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AccessModeEnum(value);
            }
            return result;
        }

        public static AccessModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AccessModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "subnet_ids")

    private List<String> subnetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_access_port")

    private String internetAccessPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_id")

    private String enterpriseId;

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyWorkspaceAttributesReq modifyWorkspaceAttributesReq = (ModifyWorkspaceAttributesReq) o;
        return Objects.equals(this.adInfo, modifyWorkspaceAttributesReq.adInfo)
            && Objects.equals(this.adDomains, modifyWorkspaceAttributesReq.adDomains)
            && Objects.equals(this.accessMode, modifyWorkspaceAttributesReq.accessMode)
            && Objects.equals(this.dedicatedSubnets, modifyWorkspaceAttributesReq.dedicatedSubnets)
            && Objects.equals(this.subnetIds, modifyWorkspaceAttributesReq.subnetIds)
            && Objects.equals(this.internetAccessPort, modifyWorkspaceAttributesReq.internetAccessPort)
            && Objects.equals(this.enterpriseId, modifyWorkspaceAttributesReq.enterpriseId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(adInfo, adDomains, accessMode, dedicatedSubnets, subnetIds, internetAccessPort, enterpriseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyWorkspaceAttributesReq {\n");
        sb.append("    adInfo: ").append(toIndentedString(adInfo)).append("\n");
        sb.append("    adDomains: ").append(toIndentedString(adDomains)).append("\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    dedicatedSubnets: ").append(toIndentedString(dedicatedSubnets)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    internetAccessPort: ").append(toIndentedString(internetAccessPort)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
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
