package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 弹性公网IP对象返回模板
 */
public class PublicipResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    /**
     * - 功能说明: 弹性公网IP版本号 - 取值范围: 4、6   - 4表示公网IP地址为public_ip_address地址   - 6表示公网IP地址为public_ipv6_address地址
     */
    public static final class IpVersionEnum {

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final IpVersionEnum NUMBER_4 = new IpVersionEnum(4);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final IpVersionEnum NUMBER_6 = new IpVersionEnum(6);

        private static final Map<Integer, IpVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IpVersionEnum> createStaticFields() {
            Map<Integer, IpVersionEnum> map = new HashMap<>();
            map.put(4, NUMBER_4);
            map.put(6, NUMBER_6);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IpVersionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IpVersionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpVersionEnum(value));
        }

        public static IpVersionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpVersionEnum) {
                return this.value.equals(((IpVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private IpVersionEnum ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_address")

    private String publicIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ipv6_address")

    private String publicIpv6Address;

    /**
     * - 功能说明：弹性公网IP的状态 - 取值范围：FREEZED，DOWN，ACTIVE，ERROR。   - FREEZED表示弹性公网IP处于冻结状态   - DOWN表示弹性公网IP未绑定实例   - ACTIVE表示弹性公网IP绑定实例，正在使用中   - ERROR表示弹性公网IP状态异常
     */
    public static final class StatusEnum {

        /**
         * Enum FREEZED for value: "FREEZED"
         */
        public static final StatusEnum FREEZED = new StatusEnum("FREEZED");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("FREEZED", FREEZED);
            map.put("DOWN", DOWN);
            map.put("ACTIVE", ACTIVE);
            map.put("ERROR", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    /**
     * - 功能说明：弹性公网IP的类型 - 取值范围：EIP，DUALSTACK
     */
    public static final class TypeEnum {

        /**
         * Enum EIP for value: "EIP"
         */
        public static final TypeEnum EIP = new TypeEnum("EIP");

        /**
         * Enum DUALSTACK for value: "DUALSTACK"
         */
        public static final TypeEnum DUALSTACK = new TypeEnum("DUALSTACK");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("EIP", EIP);
            map.put("DUALSTACK", DUALSTACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic")

    private VnicResp vnic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BandwidthResp bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    private String lockStatus;

    /**
     * - 功能说明：弹性公网IP绑定的实例类型 - 取值范围：PORT、NATGW、ELB、ELBV1、VPN 
     */
    public static final class AssociateInstanceTypeEnum {

        /**
         * Enum PORT for value: "PORT"
         */
        public static final AssociateInstanceTypeEnum PORT = new AssociateInstanceTypeEnum("PORT");

        /**
         * Enum NATGW for value: "NATGW"
         */
        public static final AssociateInstanceTypeEnum NATGW = new AssociateInstanceTypeEnum("NATGW");

        /**
         * Enum ELB for value: "ELB"
         */
        public static final AssociateInstanceTypeEnum ELB = new AssociateInstanceTypeEnum("ELB");

        /**
         * Enum ELBV1 for value: "ELBV1"
         */
        public static final AssociateInstanceTypeEnum ELBV1 = new AssociateInstanceTypeEnum("ELBV1");

        /**
         * Enum VPN for value: "VPN"
         */
        public static final AssociateInstanceTypeEnum VPN = new AssociateInstanceTypeEnum("VPN");

        private static final Map<String, AssociateInstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssociateInstanceTypeEnum> createStaticFields() {
            Map<String, AssociateInstanceTypeEnum> map = new HashMap<>();
            map.put("PORT", PORT);
            map.put("NATGW", NATGW);
            map.put("ELB", ELB);
            map.put("ELBV1", ELBV1);
            map.put("VPN", VPN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssociateInstanceTypeEnum(String value) {
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
        public static AssociateInstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssociateInstanceTypeEnum(value));
        }

        public static AssociateInstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssociateInstanceTypeEnum) {
                return this.value.equals(((AssociateInstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_type")

    private AssociateInstanceTypeEnum associateInstanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_id")

    private String associateInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_pool_id")

    private String publicipPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_pool_name")

    private String publicipPoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    public PublicipResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP的唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicipResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * - 功能说明：项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PublicipResp withIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * - 功能说明: 弹性公网IP版本号 - 取值范围: 4、6   - 4表示公网IP地址为public_ip_address地址   - 6表示公网IP地址为public_ipv6_address地址
     * minimum: 4
     * maximum: 6
     * @return ipVersion
     */
    public IpVersionEnum getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
    }

    public PublicipResp withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * - 功能说明: 弹性公网IPv4地址
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public PublicipResp withPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
        return this;
    }

    /**
     * - 功能说明: 弹性公网IPv6地址
     * @return publicIpv6Address
     */
    public String getPublicIpv6Address() {
        return publicIpv6Address;
    }

    public void setPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
    }

    public PublicipResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP的状态 - 取值范围：FREEZED，DOWN，ACTIVE，ERROR。   - FREEZED表示弹性公网IP处于冻结状态   - DOWN表示弹性公网IP未绑定实例   - ACTIVE表示弹性公网IP绑定实例，正在使用中   - ERROR表示弹性公网IP状态异常
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PublicipResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP的描述信息 - 约束：用户以自定义方式标识资源，系统不感知
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublicipResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP的创建时间 - 约束：UTC时间格式（2018-12-25T10:07:24Z）
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public PublicipResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP最近的更新时间 - 约束：UTC时间格式（2018-12-25T10:09:20Z）
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PublicipResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP的类型 - 取值范围：EIP，DUALSTACK
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PublicipResp withVnic(VnicResp vnic) {
        this.vnic = vnic;
        return this;
    }

    public PublicipResp withVnic(Consumer<VnicResp> vnicSetter) {
        if (this.vnic == null) {
            this.vnic = new VnicResp();
            vnicSetter.accept(this.vnic);
        }

        return this;
    }

    /**
     * Get vnic
     * @return vnic
     */
    public VnicResp getVnic() {
        return vnic;
    }

    public void setVnic(VnicResp vnic) {
        this.vnic = vnic;
    }

    public PublicipResp withBandwidth(BandwidthResp bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public PublicipResp withBandwidth(Consumer<BandwidthResp> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BandwidthResp();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandwidthResp getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandwidthResp bandwidth) {
        this.bandwidth = bandwidth;
    }

    public PublicipResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP的企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PublicipResp withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP的订单信息 - 约束：包周期才会有订单信息，按需资源此字段为空
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public PublicipResp withLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    /**
     * - 功能说明：记录弹性公网IP当前的冻结状态 - 约束：metadata类型，标识欠费冻结、公安冻结
     * @return lockStatus
     */
    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public PublicipResp withAssociateInstanceType(AssociateInstanceTypeEnum associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP绑定的实例类型 - 取值范围：PORT、NATGW、ELB、ELBV1、VPN 
     * @return associateInstanceType
     */
    public AssociateInstanceTypeEnum getAssociateInstanceType() {
        return associateInstanceType;
    }

    public void setAssociateInstanceType(AssociateInstanceTypeEnum associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
    }

    public PublicipResp withAssociateInstanceId(String associateInstanceId) {
        this.associateInstanceId = associateInstanceId;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP绑定的实例ID
     * @return associateInstanceId
     */
    public String getAssociateInstanceId() {
        return associateInstanceId;
    }

    public void setAssociateInstanceId(String associateInstanceId) {
        this.associateInstanceId = associateInstanceId;
    }

    public PublicipResp withPublicipPoolId(String publicipPoolId) {
        this.publicipPoolId = publicipPoolId;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP所属网络的ID。publicip_pool_name对应的网络ID
     * @return publicipPoolId
     */
    public String getPublicipPoolId() {
        return publicipPoolId;
    }

    public void setPublicipPoolId(String publicipPoolId) {
        this.publicipPoolId = publicipPoolId;
    }

    public PublicipResp withPublicipPoolName(String publicipPoolName) {
        this.publicipPoolName = publicipPoolName;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP的网络类型， 包括公共池类型，如5_bgp/5_sbgp...，和用户购买的专属池。专属池见publcip_pool相关接口
     * @return publicipPoolName
     */
    public String getPublicipPoolName() {
        return publicipPoolName;
    }

    public void setPublicipPoolName(String publicipPoolName) {
        this.publicipPoolName = publicipPoolName;
    }

    public PublicipResp withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * - 功能说明：弹性公网IP别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public PublicipResp withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * - 功能说明：中心还是边缘。中心CENTER，边缘为各边缘az名称
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicipResp that = (PublicipResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.publicIpAddress, that.publicIpAddress)
            && Objects.equals(this.publicIpv6Address, that.publicIpv6Address)
            && Objects.equals(this.status, that.status) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.type, that.type) && Objects.equals(this.vnic, that.vnic)
            && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.billingInfo, that.billingInfo) && Objects.equals(this.lockStatus, that.lockStatus)
            && Objects.equals(this.associateInstanceType, that.associateInstanceType)
            && Objects.equals(this.associateInstanceId, that.associateInstanceId)
            && Objects.equals(this.publicipPoolId, that.publicipPoolId)
            && Objects.equals(this.publicipPoolName, that.publicipPoolName) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            ipVersion,
            publicIpAddress,
            publicIpv6Address,
            status,
            description,
            createdAt,
            updatedAt,
            type,
            vnic,
            bandwidth,
            enterpriseProjectId,
            billingInfo,
            lockStatus,
            associateInstanceType,
            associateInstanceId,
            publicipPoolId,
            publicipPoolName,
            alias,
            publicBorderGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicipResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    publicIpv6Address: ").append(toIndentedString(publicIpv6Address)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vnic: ").append(toIndentedString(vnic)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    associateInstanceType: ").append(toIndentedString(associateInstanceType)).append("\n");
        sb.append("    associateInstanceId: ").append(toIndentedString(associateInstanceId)).append("\n");
        sb.append("    publicipPoolId: ").append(toIndentedString(publicipPoolId)).append("\n");
        sb.append("    publicipPoolName: ").append(toIndentedString(publicipPoolName)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
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
