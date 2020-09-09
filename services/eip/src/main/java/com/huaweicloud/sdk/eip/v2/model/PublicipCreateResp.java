package com.huaweicloud.sdk.eip.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 弹性公网IP对象
 */
public class PublicipCreateResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_size")
    
    private Integer bandwidthSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip_address")
    
    private String publicIpAddress;
    /**
     * 功能说明：弹性公网IP的状态  取值范围：冻结FREEZED，绑定失败BIND_ERROR，绑定中BINDING，释放中PENDING_DELETE， 创建中PENDING_CREATE，创建中NOTIFYING，释放中NOTIFY_DELETE，更新中PENDING_UPDATE， 未绑定DOWN ，绑定ACTIVE，绑定ELB，绑定VPN，失败ERROR。
     */
    public static final class StatusEnum {

        
        /**
         * Enum FREEZED for value: "FREEZED"
         */
        public static final StatusEnum FREEZED = new StatusEnum("FREEZED");
        
        /**
         * Enum BIND_ERROR for value: "BIND_ERROR"
         */
        public static final StatusEnum BIND_ERROR = new StatusEnum("BIND_ERROR");
        
        /**
         * Enum BINDING for value: "BINDING"
         */
        public static final StatusEnum BINDING = new StatusEnum("BINDING");
        
        /**
         * Enum PENDING_DELETE for value: "PENDING_DELETE"
         */
        public static final StatusEnum PENDING_DELETE = new StatusEnum("PENDING_DELETE");
        
        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final StatusEnum PENDING_CREATE = new StatusEnum("PENDING_CREATE");
        
        /**
         * Enum NOTIFYING for value: "NOTIFYING"
         */
        public static final StatusEnum NOTIFYING = new StatusEnum("NOTIFYING");
        
        /**
         * Enum NOTIFY_DELETE for value: "NOTIFY_DELETE"
         */
        public static final StatusEnum NOTIFY_DELETE = new StatusEnum("NOTIFY_DELETE");
        
        /**
         * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
         */
        public static final StatusEnum PENDING_UPDATE = new StatusEnum("PENDING_UPDATE");
        
        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");
        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");
        
        /**
         * Enum ELB for value: "ELB"
         */
        public static final StatusEnum ELB = new StatusEnum("ELB");
        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");
        
        /**
         * Enum VPN for value: "VPN"
         */
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

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof StatusEnum) {
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
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ipv6_address")
    
    private String publicIpv6Address;
    /**
     * IP版本信息，取值范围是4和6
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

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IpVersionEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            IpVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IpVersionEnum(value);
            }
            return result;
        }

        public static IpVersionEnum valueOf(Integer value) {
            if( value == null ){
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
            if (obj != null && obj instanceof IpVersionEnum) {
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
    @JsonProperty(value="ip_version")
    
    private IpVersionEnum ipVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public PublicipCreateResp withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    


    /**
     * 带宽大小，单位为Mbit/s。
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public PublicipCreateResp withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 弹性公网IP申请时间（UTC时间）
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public PublicipCreateResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 弹性公网IP唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicipCreateResp withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    


    /**
     * IPv4时是申请到的弹性公网IP地址，IPv6时是IPv6地址对应的IPv4地址
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public PublicipCreateResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 功能说明：弹性公网IP的状态  取值范围：冻结FREEZED，绑定失败BIND_ERROR，绑定中BINDING，释放中PENDING_DELETE， 创建中PENDING_CREATE，创建中NOTIFYING，释放中NOTIFY_DELETE，更新中PENDING_UPDATE， 未绑定DOWN ，绑定ACTIVE，绑定ELB，绑定VPN，失败ERROR。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PublicipCreateResp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public PublicipCreateResp withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 功能说明：弹性IP弹性公网IP的类型  取值范围：5_telcom（电信），5_union（联通），5_bgp（全动态BGP），5_sbgp（静态BGP），5_ipv6  东北-大连：5_telcom、5_union  华南-广州：5_bgp、5_sbgp  华东-上海二：5_bgp、5_sbgp  华北-北京一：5_bgp、5_sbgp、5_ipv6  亚太-香港：5_bgp  亚太-曼谷：5_bgp  亚太-新加坡：5_bgp  非洲-约翰内斯堡：5_bgp  西南-贵阳一：5_bgp、5_sbgp  华北-北京四：5_bgp、5_sbgp  约束：必须是系统具体支持的类型publicip_id为IPv4端口，所以\"publicip_type\"字段未给定时，默认为5_bgp。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PublicipCreateResp withPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
        return this;
    }

    


    /**
     * IPv4时无此字段，IPv6时为申请到的弹性公网IP地址
     * @return publicIpv6Address
     */
    public String getPublicIpv6Address() {
        return publicIpv6Address;
    }

    public void setPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
    }

    public PublicipCreateResp withIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    


    /**
     * IP版本信息，取值范围是4和6
     * @return ipVersion
     */
    public IpVersionEnum getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
    }

    public PublicipCreateResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。  创建弹性公网IP时，给弹性公网IP绑定企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicipCreateResp publicipCreateResp = (PublicipCreateResp) o;
        return Objects.equals(this.bandwidthSize, publicipCreateResp.bandwidthSize) &&
            Objects.equals(this.createTime, publicipCreateResp.createTime) &&
            Objects.equals(this.id, publicipCreateResp.id) &&
            Objects.equals(this.publicIpAddress, publicipCreateResp.publicIpAddress) &&
            Objects.equals(this.status, publicipCreateResp.status) &&
            Objects.equals(this.tenantId, publicipCreateResp.tenantId) &&
            Objects.equals(this.type, publicipCreateResp.type) &&
            Objects.equals(this.publicIpv6Address, publicipCreateResp.publicIpv6Address) &&
            Objects.equals(this.ipVersion, publicipCreateResp.ipVersion) &&
            Objects.equals(this.enterpriseProjectId, publicipCreateResp.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidthSize, createTime, id, publicIpAddress, status, tenantId, type, publicIpv6Address, ipVersion, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicipCreateResp {\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    publicIpv6Address: ").append(toIndentedString(publicIpv6Address)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
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

