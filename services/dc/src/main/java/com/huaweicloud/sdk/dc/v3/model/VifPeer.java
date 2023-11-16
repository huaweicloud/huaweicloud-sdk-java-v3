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
 * 虚拟接口对等体对象
 */
public class VifPeer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

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
    @JsonProperty(value = "service_ep_group")

    private List<String> serviceEpGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_route_limit")

    private Integer bgpRouteLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_status")

    private String bgpStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vif_id")

    private String vifId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receive_route_num")

    private Integer receiveRouteNum;

    public VifPeer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VifPeer withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 归属租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public VifPeer withName(String name) {
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

    public VifPeer withDescription(String description) {
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

    public VifPeer withAddressFamily(String addressFamily) {
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

    public VifPeer withLocalGatewayIp(String localGatewayIp) {
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

    public VifPeer withRemoteGatewayIp(String remoteGatewayIp) {
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

    public VifPeer withRouteMode(RouteModeEnum routeMode) {
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

    public VifPeer withBgpAsn(Integer bgpAsn) {
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

    public VifPeer withBgpMd5(String bgpMd5) {
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

    public VifPeer withRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
        return this;
    }

    public VifPeer addRemoteEpGroupItem(String remoteEpGroupItem) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        this.remoteEpGroup.add(remoteEpGroupItem);
        return this;
    }

    public VifPeer withRemoteEpGroup(Consumer<List<String>> remoteEpGroupSetter) {
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

    public VifPeer withServiceEpGroup(List<String> serviceEpGroup) {
        this.serviceEpGroup = serviceEpGroup;
        return this;
    }

    public VifPeer addServiceEpGroupItem(String serviceEpGroupItem) {
        if (this.serviceEpGroup == null) {
            this.serviceEpGroup = new ArrayList<>();
        }
        this.serviceEpGroup.add(serviceEpGroupItem);
        return this;
    }

    public VifPeer withServiceEpGroup(Consumer<List<String>> serviceEpGroupSetter) {
        if (this.serviceEpGroup == null) {
            this.serviceEpGroup = new ArrayList<>();
        }
        serviceEpGroupSetter.accept(this.serviceEpGroup);
        return this;
    }

    /**
     * 该字段用于公网专线接口,表示租户可以访问云上公网服务地址列表
     * @return serviceEpGroup
     */
    public List<String> getServiceEpGroup() {
        return serviceEpGroup;
    }

    public void setServiceEpGroup(List<String> serviceEpGroup) {
        this.serviceEpGroup = serviceEpGroup;
    }

    public VifPeer withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 归属的设备ID
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public VifPeer withBgpRouteLimit(Integer bgpRouteLimit) {
        this.bgpRouteLimit = bgpRouteLimit;
        return this;
    }

    /**
     * BGP的路由配置规格
     * @return bgpRouteLimit
     */
    public Integer getBgpRouteLimit() {
        return bgpRouteLimit;
    }

    public void setBgpRouteLimit(Integer bgpRouteLimit) {
        this.bgpRouteLimit = bgpRouteLimit;
    }

    public VifPeer withBgpStatus(String bgpStatus) {
        this.bgpStatus = bgpStatus;
        return this;
    }

    /**
     * 接口BGP协议状态,如果是静态路由接口则状态为 null
     * @return bgpStatus
     */
    public String getBgpStatus() {
        return bgpStatus;
    }

    public void setBgpStatus(String bgpStatus) {
        this.bgpStatus = bgpStatus;
    }

    public VifPeer withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * VIF对等体状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VifPeer withVifId(String vifId) {
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

    public VifPeer withReceiveRouteNum(Integer receiveRouteNum) {
        this.receiveRouteNum = receiveRouteNum;
        return this;
    }

    /**
     * 路由模式为bgp：receive_route_num值为接收搭配BGP的路由数目； 路由模式为static：该字段无意义，值为-1； 注：若早期接入华为云的部分用户无法获取该字段信息，如需要请联系客服迁移专线端口。
     * @return receiveRouteNum
     */
    public Integer getReceiveRouteNum() {
        return receiveRouteNum;
    }

    public void setReceiveRouteNum(Integer receiveRouteNum) {
        this.receiveRouteNum = receiveRouteNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VifPeer that = (VifPeer) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.addressFamily, that.addressFamily)
            && Objects.equals(this.localGatewayIp, that.localGatewayIp)
            && Objects.equals(this.remoteGatewayIp, that.remoteGatewayIp)
            && Objects.equals(this.routeMode, that.routeMode) && Objects.equals(this.bgpAsn, that.bgpAsn)
            && Objects.equals(this.bgpMd5, that.bgpMd5) && Objects.equals(this.remoteEpGroup, that.remoteEpGroup)
            && Objects.equals(this.serviceEpGroup, that.serviceEpGroup) && Objects.equals(this.deviceId, that.deviceId)
            && Objects.equals(this.bgpRouteLimit, that.bgpRouteLimit) && Objects.equals(this.bgpStatus, that.bgpStatus)
            && Objects.equals(this.status, that.status) && Objects.equals(this.vifId, that.vifId)
            && Objects.equals(this.receiveRouteNum, that.receiveRouteNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            name,
            description,
            addressFamily,
            localGatewayIp,
            remoteGatewayIp,
            routeMode,
            bgpAsn,
            bgpMd5,
            remoteEpGroup,
            serviceEpGroup,
            deviceId,
            bgpRouteLimit,
            bgpStatus,
            status,
            vifId,
            receiveRouteNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VifPeer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
        sb.append("    localGatewayIp: ").append(toIndentedString(localGatewayIp)).append("\n");
        sb.append("    remoteGatewayIp: ").append(toIndentedString(remoteGatewayIp)).append("\n");
        sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    bgpMd5: ").append(toIndentedString(bgpMd5)).append("\n");
        sb.append("    remoteEpGroup: ").append(toIndentedString(remoteEpGroup)).append("\n");
        sb.append("    serviceEpGroup: ").append(toIndentedString(serviceEpGroup)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    bgpRouteLimit: ").append(toIndentedString(bgpRouteLimit)).append("\n");
        sb.append("    bgpStatus: ").append(toIndentedString(bgpStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vifId: ").append(toIndentedString(vifId)).append("\n");
        sb.append("    receiveRouteNum: ").append(toIndentedString(receiveRouteNum)).append("\n");
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
