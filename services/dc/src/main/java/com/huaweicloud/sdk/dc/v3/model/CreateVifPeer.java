package com.huaweicloud.sdk.dc.v3.model;

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
 * 创建虚拟接口对等体参数
 */
public class CreateVifPeer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_family")

    private String addressFamily;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_gateway_ip")

    private String localGatewayIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_gateway_ip")

    private String remoteGatewayIp;

    /**
     * 路由模式：static/bgp
     */
    public static final class RouteModeEnum {

        /**
         * Enum BGP for value: "bgp"
         */
        public static final RouteModeEnum BGP = new RouteModeEnum("bgp");

        /**
         * Enum STATIC for value: "static"
         */
        public static final RouteModeEnum STATIC = new RouteModeEnum("static");

        private static final Map<String, RouteModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RouteModeEnum> createStaticFields() {
            Map<String, RouteModeEnum> map = new HashMap<>();
            map.put("bgp", BGP);
            map.put("static", STATIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RouteModeEnum(String value) {
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
        public static RouteModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RouteModeEnum(value));
        }

        public static RouteModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RouteModeEnum) {
                return this.value.equals(((RouteModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_mode")

    private RouteModeEnum routeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Integer bgpAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_md5")

    private String bgpMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_ep_group")

    private List<String> remoteEpGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vif_id")

    private String vifId;

    public CreateVifPeer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * VIF对等体名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVifPeer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * VIF对等体名字描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVifPeer withAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }

    /**
     * 接口的地址簇类型，ipv4，ipv6
     * @return addressFamily
     */
    public String getAddressFamily() {
        return addressFamily;
    }

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    public CreateVifPeer withLocalGatewayIp(String localGatewayIp) {
        this.localGatewayIp = localGatewayIp;
        return this;
    }

    /**
     * VIF对等体云侧接口地址
     * @return localGatewayIp
     */
    public String getLocalGatewayIp() {
        return localGatewayIp;
    }

    public void setLocalGatewayIp(String localGatewayIp) {
        this.localGatewayIp = localGatewayIp;
    }

    public CreateVifPeer withRemoteGatewayIp(String remoteGatewayIp) {
        this.remoteGatewayIp = remoteGatewayIp;
        return this;
    }

    /**
     * VIF对等体客户侧接口地址
     * @return remoteGatewayIp
     */
    public String getRemoteGatewayIp() {
        return remoteGatewayIp;
    }

    public void setRemoteGatewayIp(String remoteGatewayIp) {
        this.remoteGatewayIp = remoteGatewayIp;
    }

    public CreateVifPeer withRouteMode(RouteModeEnum routeMode) {
        this.routeMode = routeMode;
        return this;
    }

    /**
     * 路由模式：static/bgp
     * @return routeMode
     */
    public RouteModeEnum getRouteMode() {
        return routeMode;
    }

    public void setRouteMode(RouteModeEnum routeMode) {
        this.routeMode = routeMode;
    }

    public CreateVifPeer withBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * BGP邻居的AS号
     * minimum: 1
     * maximum: 4294967295
     * @return bgpAsn
     */
    public Integer getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public CreateVifPeer withBgpMd5(String bgpMd5) {
        this.bgpMd5 = bgpMd5;
        return this;
    }

    /**
     * BGP邻居的MD5密码
     * @return bgpMd5
     */
    public String getBgpMd5() {
        return bgpMd5;
    }

    public void setBgpMd5(String bgpMd5) {
        this.bgpMd5 = bgpMd5;
    }

    public CreateVifPeer withRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
        return this;
    }

    public CreateVifPeer addRemoteEpGroupItem(String remoteEpGroupItem) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        this.remoteEpGroup.add(remoteEpGroupItem);
        return this;
    }

    public CreateVifPeer withRemoteEpGroup(Consumer<List<String>> remoteEpGroupSetter) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        remoteEpGroupSetter.accept(this.remoteEpGroup);
        return this;
    }

    /**
     * 远端子网列表，记录租户侧的cidrs
     * @return remoteEpGroup
     */
    public List<String> getRemoteEpGroup() {
        return remoteEpGroup;
    }

    public void setRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
    }

    public CreateVifPeer withVifId(String vifId) {
        this.vifId = vifId;
        return this;
    }

    /**
     * vif对等体对应的虚拟接口ID
     * @return vifId
     */
    public String getVifId() {
        return vifId;
    }

    public void setVifId(String vifId) {
        this.vifId = vifId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVifPeer that = (CreateVifPeer) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.addressFamily, that.addressFamily)
            && Objects.equals(this.localGatewayIp, that.localGatewayIp)
            && Objects.equals(this.remoteGatewayIp, that.remoteGatewayIp)
            && Objects.equals(this.routeMode, that.routeMode) && Objects.equals(this.bgpAsn, that.bgpAsn)
            && Objects.equals(this.bgpMd5, that.bgpMd5) && Objects.equals(this.remoteEpGroup, that.remoteEpGroup)
            && Objects.equals(this.vifId, that.vifId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            addressFamily,
            localGatewayIp,
            remoteGatewayIp,
            routeMode,
            bgpAsn,
            bgpMd5,
            remoteEpGroup,
            vifId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVifPeer {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
        sb.append("    localGatewayIp: ").append(toIndentedString(localGatewayIp)).append("\n");
        sb.append("    remoteGatewayIp: ").append(toIndentedString(remoteGatewayIp)).append("\n");
        sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    bgpMd5: ").append(toIndentedString(bgpMd5)).append("\n");
        sb.append("    remoteEpGroup: ").append(toIndentedString(remoteEpGroup)).append("\n");
        sb.append("    vifId: ").append(toIndentedString(vifId)).append("\n");
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
