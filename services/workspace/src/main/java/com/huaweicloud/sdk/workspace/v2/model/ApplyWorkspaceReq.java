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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad_domains")

    private AdDomain adDomains;

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
    @JsonProperty(value = "is_send_email")

    private Boolean isSendEmail;

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

    public ApplyWorkspaceReq withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * 企业ID。  企业ID是您在云桌面服务的唯一标识，终端用户登录时需要填写企业ID，若不自定义设置企业ID，系统将自动生成您的企业ID。格式为由半角数字、字母、_-组成，长度范围小于等于32个字符。
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplyWorkspaceReq applyWorkspaceReq = (ApplyWorkspaceReq) o;
        return Objects.equals(this.adDomains, applyWorkspaceReq.adDomains)
            && Objects.equals(this.enterpriseId, applyWorkspaceReq.enterpriseId)
            && Objects.equals(this.vpcId, applyWorkspaceReq.vpcId)
            && Objects.equals(this.subnetIds, applyWorkspaceReq.subnetIds)
            && Objects.equals(this.manageSubnetCidr, applyWorkspaceReq.manageSubnetCidr)
            && Objects.equals(this.accessMode, applyWorkspaceReq.accessMode)
            && Objects.equals(this.dedicatedSubnets, applyWorkspaceReq.dedicatedSubnets)
            && Objects.equals(this.isSendEmail, applyWorkspaceReq.isSendEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adDomains,
            enterpriseId,
            vpcId,
            subnetIds,
            manageSubnetCidr,
            accessMode,
            dedicatedSubnets,
            isSendEmail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyWorkspaceReq {\n");
        sb.append("    adDomains: ").append(toIndentedString(adDomains)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    manageSubnetCidr: ").append(toIndentedString(manageSubnetCidr)).append("\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    dedicatedSubnets: ").append(toIndentedString(dedicatedSubnets)).append("\n");
        sb.append("    isSendEmail: ").append(toIndentedString(isSendEmail)).append("\n");
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
