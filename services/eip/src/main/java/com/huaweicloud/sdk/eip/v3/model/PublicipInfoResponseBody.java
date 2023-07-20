package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * PublicipInfo对象
 */
public class PublicipInfoResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_address")

    private String publicipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private UUID publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_type")

    private String publicipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicipv6_address")

    private String publicipv6Address;

    /**
     * - 功能说明：IP版本信息 - 取值范围：  4：IPv4；  6：IPv6
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

    public PublicipInfoResponseBody withPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
        return this;
    }

    /**
     * - 功能说明：弹性公网IPV4或IPv6的公网地址
     * @return publicipAddress
     */
    public String getPublicipAddress() {
        return publicipAddress;
    }

    public void setPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
    }

    public PublicipInfoResponseBody withPublicipId(UUID publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * - 功能说明：带宽对应的弹性公网IPV4或IPv6的唯一标识
     * @return publicipId
     */
    public UUID getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(UUID publicipId) {
        this.publicipId = publicipId;
    }

    public PublicipInfoResponseBody withPublicipType(String publicipType) {
        this.publicipType = publicipType;
        return this;
    }

    /**
     * - 功能说明：EIP的类型  - [取值范围：5_bgp](tag:hk_g42,g42,hk_sbc,sbc)  - [取值范围：5_chinamobile](tag:cmcc)  - [取值范围：5_bgp（Dynamic BGP）、5_mainbgp（Mail BGP）](tag:dt)  - [取值范围：    - eu-de: 5_bgp（Dynamic BGP）、5_mainbgp（Mail BGP）、5_gray（Dedicated Load Balancer）    - eu-nl: 5_bgp（Dynamic BGP）、5_mainbgp（Mail BGP）](tag:dt_test) - [取值范围：5_bgp（全动态BGP），5_sbgp（静态BGP），5_youxuanbgp（优选BGP）    - 华南-广州：5_bgp、5_sbgp    - 华东-上海一：5_bgp、5_sbgp    - 华东-上海二：5_bgp、5_sbgp    - 华北-北京一：5_bgp、5_sbgp    - 中国-香港：5_bgp、5_youxuanbgp    - 亚太-曼谷：5_bgp    - 亚太-新加坡：5_bgp    - 非洲-约翰内斯堡：5_bgp    - 西南-贵阳一：5_sbgp    - 华北-北京四：5_bgp、5_sbgp    - 拉美-圣地亚哥：5_bgp    - 拉美-圣保罗一：5_bgp    - 拉美-墨西哥城一：5_bgp    - 拉美-布宜诺斯艾利一：5_bgp    - 拉美-利马一：5_bgp    - 拉美-圣地亚哥二： 5_bgp  ](tag:hws,hws_hk)  - 约束：     - 必须是系统具体支持的类型。     - publicip_id为IPv4端口，所以[\"publicip_type\"](tag:cmcc,ctc,dt,dt_test,fcs,fcs_dt,fcs_vm,hws_hk,hws_ocb,ocb,tlf,tm,hk_g42,g42,hk_sbc,sbc)[\"type\"](tag:hws)字段未给定时，默认为[5_bgp](tag:ctc,dt,dt_test,fcs,fcs_dt,fcs_vm,g42,hk_g42,hk_sbc,hws,hws_hk,hws_ocb,mix,ocb,sbc,tlf,tm)[5_chinamobile](tag:cmcc)。
     * @return publicipType
     */
    public String getPublicipType() {
        return publicipType;
    }

    public void setPublicipType(String publicipType) {
        this.publicipType = publicipType;
    }

    public PublicipInfoResponseBody withPublicipv6Address(String publicipv6Address) {
        this.publicipv6Address = publicipv6Address;
        return this;
    }

    /**
     * - 功能说明：IPv4时无此字段，IPv6时为申请到的弹性公网IP地址
     * @return publicipv6Address
     */
    public String getPublicipv6Address() {
        return publicipv6Address;
    }

    public void setPublicipv6Address(String publicipv6Address) {
        this.publicipv6Address = publicipv6Address;
    }

    public PublicipInfoResponseBody withIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * - 功能说明：IP版本信息 - 取值范围：  4：IPv4；  6：IPv6
     * @return ipVersion
     */
    public IpVersionEnum getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicipInfoResponseBody that = (PublicipInfoResponseBody) obj;
        return Objects.equals(this.publicipAddress, that.publicipAddress)
            && Objects.equals(this.publicipId, that.publicipId) && Objects.equals(this.publicipType, that.publicipType)
            && Objects.equals(this.publicipv6Address, that.publicipv6Address)
            && Objects.equals(this.ipVersion, that.ipVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipAddress, publicipId, publicipType, publicipv6Address, ipVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicipInfoResponseBody {\n");
        sb.append("    publicipAddress: ").append(toIndentedString(publicipAddress)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    publicipType: ").append(toIndentedString(publicipType)).append("\n");
        sb.append("    publicipv6Address: ").append(toIndentedString(publicipv6Address)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
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
