package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 弹性公网IP列表返回体 */
public class PublicipShowResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_id")

    private String bandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_name")

    private String bandwidthName;

    /** 表示共享带宽或者独享带宽 取值范围：PER，WHOLE。 WHOLE表示共享带宽 PER表示独享带宽 约束：其中IPv6暂不支持WHOLE类型带宽。 */
    public static final class BandwidthShareTypeEnum {

        /** Enum WHOLE for value: "WHOLE" */
        public static final BandwidthShareTypeEnum WHOLE = new BandwidthShareTypeEnum("WHOLE");

        /** Enum PER for value: "PER" */
        public static final BandwidthShareTypeEnum PER = new BandwidthShareTypeEnum("PER");

        private static final Map<String, BandwidthShareTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BandwidthShareTypeEnum> createStaticFields() {
            Map<String, BandwidthShareTypeEnum> map = new HashMap<>();
            map.put("WHOLE", WHOLE);
            map.put("PER", PER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BandwidthShareTypeEnum(String value) {
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
        public static BandwidthShareTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BandwidthShareTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BandwidthShareTypeEnum(value);
            }
            return result;
        }

        public static BandwidthShareTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BandwidthShareTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BandwidthShareTypeEnum) {
                return this.value.equals(((BandwidthShareTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_share_type")

    private BandwidthShareTypeEnum bandwidthShareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Integer bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    private String privateIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile")

    private ProfileResp profile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_address")

    private String publicIpAddress;

    /** 功能说明：弹性公网IP的状态 取值范围：冻结FREEZED，绑定失败BIND_ERROR，绑定中BINDING，释放中PENDING_DELETE，
     * 创建中PENDING_CREATE，创建中NOTIFYING，释放中NOTIFY_DELETE，更新中PENDING_UPDATE， 未绑定DOWN ，绑定ACTIVE，绑定ELB，绑定VPN，失败ERROR。 */
    public static final class StatusEnum {

        /** Enum FREEZED for value: "FREEZED" */
        public static final StatusEnum FREEZED = new StatusEnum("FREEZED");

        /** Enum BIND_ERROR for value: "BIND_ERROR" */
        public static final StatusEnum BIND_ERROR = new StatusEnum("BIND_ERROR");

        /** Enum BINDING for value: "BINDING" */
        public static final StatusEnum BINDING = new StatusEnum("BINDING");

        /** Enum PENDING_DELETE for value: "PENDING_DELETE" */
        public static final StatusEnum PENDING_DELETE = new StatusEnum("PENDING_DELETE");

        /** Enum PENDING_CREATE for value: "PENDING_CREATE" */
        public static final StatusEnum PENDING_CREATE = new StatusEnum("PENDING_CREATE");

        /** Enum NOTIFYING for value: "NOTIFYING" */
        public static final StatusEnum NOTIFYING = new StatusEnum("NOTIFYING");

        /** Enum NOTIFY_DELETE for value: "NOTIFY_DELETE" */
        public static final StatusEnum NOTIFY_DELETE = new StatusEnum("NOTIFY_DELETE");

        /** Enum PENDING_UPDATE for value: "PENDING_UPDATE" */
        public static final StatusEnum PENDING_UPDATE = new StatusEnum("PENDING_UPDATE");

        /** Enum DOWN for value: "DOWN" */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");

        /** Enum ACTIVE for value: "ACTIVE" */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /** Enum ELB for value: "ELB" */
        public static final StatusEnum ELB = new StatusEnum("ELB");

        /** Enum ERROR for value: "ERROR" */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /** Enum VPN for value: "VPN" */
        public static final StatusEnum VPN = new StatusEnum("VPN");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("FREEZED", FREEZED);
            map.put("BIND_ERROR", BIND_ERROR);
            map.put("BINDING", BINDING);
            map.put("PENDING_DELETE", PENDING_DELETE);
            map.put("PENDING_CREATE", PENDING_CREATE);
            map.put("NOTIFYING", NOTIFYING);
            map.put("NOTIFY_DELETE", NOTIFY_DELETE);
            map.put("PENDING_UPDATE", PENDING_UPDATE);
            map.put("DOWN", DOWN);
            map.put("ACTIVE", ACTIVE);
            map.put("ELB", ELB);
            map.put("ERROR", ERROR);
            map.put("VPN", VPN);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ipv6_address")

    private String publicIpv6Address;

    /** IP版本信息，取值范围是4和6 4：表示IPv4 6：表示IPv6 */
    public static final class IpVersionEnum {

        /** Enum NUMBER_4 for value: 4 */
        public static final IpVersionEnum NUMBER_4 = new IpVersionEnum(4);

        /** Enum NUMBER_6 for value: 6 */
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
            IpVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IpVersionEnum(value);
            }
            return result;
        }

        public static IpVersionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            IpVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    public PublicipShowResp withBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
        return this;
    }

    /** 弹性公网IP对应带宽ID
     * 
     * @return bandwidthId */
    public String getBandwidthId() {
        return bandwidthId;
    }

    public void setBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
    }

    public PublicipShowResp withBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
        return this;
    }

    /** 带宽名称
     * 
     * @return bandwidthName */
    public String getBandwidthName() {
        return bandwidthName;
    }

    public void setBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
    }

    public PublicipShowResp withBandwidthShareType(BandwidthShareTypeEnum bandwidthShareType) {
        this.bandwidthShareType = bandwidthShareType;
        return this;
    }

    /** 表示共享带宽或者独享带宽 取值范围：PER，WHOLE。 WHOLE表示共享带宽 PER表示独享带宽 约束：其中IPv6暂不支持WHOLE类型带宽。
     * 
     * @return bandwidthShareType */
    public BandwidthShareTypeEnum getBandwidthShareType() {
        return bandwidthShareType;
    }

    public void setBandwidthShareType(BandwidthShareTypeEnum bandwidthShareType) {
        this.bandwidthShareType = bandwidthShareType;
    }

    public PublicipShowResp withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /** 带宽大小，单位为Mbit/s。 minimum: 0
     * 
     * @return bandwidthSize */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public PublicipShowResp withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 弹性公网IP申请时间（UTC）
     * 
     * @return createTime */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public PublicipShowResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID。最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。 创建弹性公网IP时，给弹性公网IP绑定企业项目ID。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PublicipShowResp withId(String id) {
        this.id = id;
        return this;
    }

    /** 弹性公网IP唯一标识
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicipShowResp withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /** 功能说明：端口id。 约束：只有绑定了的弹性公网IP查询才会返回该参数
     * 
     * @return portId */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public PublicipShowResp withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /** 功能说明：绑定弹性公网IP的私有IP地址 约束：只有绑定了的弹性公网IP查询才会返回该参数
     * 
     * @return privateIpAddress */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public PublicipShowResp withProfile(ProfileResp profile) {
        this.profile = profile;
        return this;
    }

    public PublicipShowResp withProfile(Consumer<ProfileResp> profileSetter) {
        if (this.profile == null) {
            this.profile = new ProfileResp();
            profileSetter.accept(this.profile);
        }

        return this;
    }

    /** Get profile
     * 
     * @return profile */
    public ProfileResp getProfile() {
        return profile;
    }

    public void setProfile(ProfileResp profile) {
        this.profile = profile;
    }

    public PublicipShowResp withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /** IPv4时是申请到的弹性公网IP地址，IPv6时是IPv6地址对应的IPv4地址
     * 
     * @return publicIpAddress */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public PublicipShowResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 功能说明：弹性公网IP的状态 取值范围：冻结FREEZED，绑定失败BIND_ERROR，绑定中BINDING，释放中PENDING_DELETE，
     * 创建中PENDING_CREATE，创建中NOTIFYING，释放中NOTIFY_DELETE，更新中PENDING_UPDATE， 未绑定DOWN ，绑定ACTIVE，绑定ELB，绑定VPN，失败ERROR。
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PublicipShowResp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /** 项目ID
     * 
     * @return tenantId */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public PublicipShowResp withType(String type) {
        this.type = type;
        return this;
    }

    /** 弹性公网IP的类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PublicipShowResp withPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
        return this;
    }

    /** IPv4时无此字段，IPv6时为申请到的弹性公网IP地址
     * 
     * @return publicIpv6Address */
    public String getPublicIpv6Address() {
        return publicIpv6Address;
    }

    public void setPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
    }

    public PublicipShowResp withIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /** IP版本信息，取值范围是4和6 4：表示IPv4 6：表示IPv6
     * 
     * @return ipVersion */
    public IpVersionEnum getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
    }

    public PublicipShowResp withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /** 功能说明：表示中心站点资源或者边缘站点资源，对接了边缘站点的区域才会返回此字段 取值范围： center、边缘站点名称 上线区域：华北-乌兰察布一，华南-广州 约束：publicip只能绑定该字段相同的资源
     * 
     * @return publicBorderGroup */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicipShowResp publicipShowResp = (PublicipShowResp) o;
        return Objects.equals(this.bandwidthId, publicipShowResp.bandwidthId)
            && Objects.equals(this.bandwidthName, publicipShowResp.bandwidthName)
            && Objects.equals(this.bandwidthShareType, publicipShowResp.bandwidthShareType)
            && Objects.equals(this.bandwidthSize, publicipShowResp.bandwidthSize)
            && Objects.equals(this.createTime, publicipShowResp.createTime)
            && Objects.equals(this.enterpriseProjectId, publicipShowResp.enterpriseProjectId)
            && Objects.equals(this.id, publicipShowResp.id) && Objects.equals(this.portId, publicipShowResp.portId)
            && Objects.equals(this.privateIpAddress, publicipShowResp.privateIpAddress)
            && Objects.equals(this.profile, publicipShowResp.profile)
            && Objects.equals(this.publicIpAddress, publicipShowResp.publicIpAddress)
            && Objects.equals(this.status, publicipShowResp.status)
            && Objects.equals(this.tenantId, publicipShowResp.tenantId)
            && Objects.equals(this.type, publicipShowResp.type)
            && Objects.equals(this.publicIpv6Address, publicipShowResp.publicIpv6Address)
            && Objects.equals(this.ipVersion, publicipShowResp.ipVersion)
            && Objects.equals(this.publicBorderGroup, publicipShowResp.publicBorderGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthId,
            bandwidthName,
            bandwidthShareType,
            bandwidthSize,
            createTime,
            enterpriseProjectId,
            id,
            portId,
            privateIpAddress,
            profile,
            publicIpAddress,
            status,
            tenantId,
            type,
            publicIpv6Address,
            ipVersion,
            publicBorderGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicipShowResp {\n");
        sb.append("    bandwidthId: ").append(toIndentedString(bandwidthId)).append("\n");
        sb.append("    bandwidthName: ").append(toIndentedString(bandwidthName)).append("\n");
        sb.append("    bandwidthShareType: ").append(toIndentedString(bandwidthShareType)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    publicIpv6Address: ").append(toIndentedString(publicIpv6Address)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
