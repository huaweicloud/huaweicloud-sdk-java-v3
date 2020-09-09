package com.huaweicloud.sdk.dc.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VirtualInterfaceDict
 */
public class VirtualInterfaceDict  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private Integer bandwidth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bgp_asn")
    
    private Integer bgpAsn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bgp_md5")
    
    private String bgpMd5;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_time")
    
    private String deleteTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="direct_connect_id")
    
    private String directConnectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="local_gateway_v4_ip")
    
    private String localGatewayV4Ip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remote_ep_group")
    
    private List<String> remoteEpGroup = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remote_gateway_v4_ip")
    
    private String remoteGatewayV4Ip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="route_mode")
    
    private String routeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_ep_group_id")
    
    private String serviceEpGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type")
    
    private String serviceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vgw_id")
    
    private String vgwId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vlan")
    
    private Integer vlan;

    public VirtualInterfaceDict withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 管理状态：true或false
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public VirtualInterfaceDict withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    


    /**
     * 虚拟接口接入带宽
     * minimum: 2
     * maximum: 10000
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public VirtualInterfaceDict withBgpAsn(Integer bgpAsn) {
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

    public VirtualInterfaceDict withBgpMd5(String bgpMd5) {
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

    public VirtualInterfaceDict withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 虚拟接口创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public VirtualInterfaceDict withDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    


    /**
     * 虚拟接口删除时间
     * @return deleteTime
     */
    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public VirtualInterfaceDict withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 虚拟接口的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VirtualInterfaceDict withDirectConnectId(String directConnectId) {
        this.directConnectId = directConnectId;
        return this;
    }

    


    /**
     * 物理专线的ID
     * @return directConnectId
     */
    public String getDirectConnectId() {
        return directConnectId;
    }

    public void setDirectConnectId(String directConnectId) {
        this.directConnectId = directConnectId;
    }

    public VirtualInterfaceDict withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 虚拟接口的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VirtualInterfaceDict withLocalGatewayV4Ip(String localGatewayV4Ip) {
        this.localGatewayV4Ip = localGatewayV4Ip;
        return this;
    }

    


    /**
     * 本地网关IPv4地址
     * @return localGatewayV4Ip
     */
    public String getLocalGatewayV4Ip() {
        return localGatewayV4Ip;
    }

    public void setLocalGatewayV4Ip(String localGatewayV4Ip) {
        this.localGatewayV4Ip = localGatewayV4Ip;
    }

    public VirtualInterfaceDict withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 虚拟接口的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VirtualInterfaceDict withRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
        return this;
    }

    
    public VirtualInterfaceDict addRemoteEpGroupItem(String remoteEpGroupItem) {
        if (this.remoteEpGroup == null) {
            this.remoteEpGroup = new ArrayList<>();
        }
        this.remoteEpGroup.add(remoteEpGroupItem);
        return this;
    }

    public VirtualInterfaceDict withRemoteEpGroup(Consumer<List<String>> remoteEpGroupSetter) {
        if(this.remoteEpGroup == null ){
            this.remoteEpGroup = new ArrayList<>();
        }
        remoteEpGroupSetter.accept(this.remoteEpGroup);
        return this;
    }

    /**
     * 远端端口组,记录租户的cidrs
     * @return remoteEpGroup
     */
    public List<String> getRemoteEpGroup() {
        return remoteEpGroup;
    }

    public void setRemoteEpGroup(List<String> remoteEpGroup) {
        this.remoteEpGroup = remoteEpGroup;
    }

    public VirtualInterfaceDict withRemoteGatewayV4Ip(String remoteGatewayV4Ip) {
        this.remoteGatewayV4Ip = remoteGatewayV4Ip;
        return this;
    }

    


    /**
     * 远端网关IPv4地址
     * @return remoteGatewayV4Ip
     */
    public String getRemoteGatewayV4Ip() {
        return remoteGatewayV4Ip;
    }

    public void setRemoteGatewayV4Ip(String remoteGatewayV4Ip) {
        this.remoteGatewayV4Ip = remoteGatewayV4Ip;
    }

    public VirtualInterfaceDict withRouteMode(String routeMode) {
        this.routeMode = routeMode;
        return this;
    }

    


    /**
     * 路由模式：static/bgp
     * @return routeMode
     */
    public String getRouteMode() {
        return routeMode;
    }

    public void setRouteMode(String routeMode) {
        this.routeMode = routeMode;
    }

    public VirtualInterfaceDict withServiceEpGroupId(String serviceEpGroupId) {
        this.serviceEpGroupId = serviceEpGroupId;
        return this;
    }

    


    /**
     * 业务端口组的ID,记录公共服务的CIDRs
     * @return serviceEpGroupId
     */
    public String getServiceEpGroupId() {
        return serviceEpGroupId;
    }

    public void setServiceEpGroupId(String serviceEpGroupId) {
        this.serviceEpGroupId = serviceEpGroupId;
    }

    public VirtualInterfaceDict withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    


    /**
     * 接入业务类型：vpc/public service/vpc和public service
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public VirtualInterfaceDict withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 操作状态，合法值是：ACTIVE，DOWN，BUILD，ERROR，PENDING_CREATE，PENDING_UPDATE，PENDING_DELETE，DELETED，AUTHORIZATION，REJECTED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VirtualInterfaceDict withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 租户的ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public VirtualInterfaceDict withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 接口类型： public/private
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VirtualInterfaceDict withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    


    /**
     * 虚拟网关的ID
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    public VirtualInterfaceDict withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    


    /**
     * 对接客户侧vlan
     * minimum: 0
     * maximum: 4063
     * @return vlan
     */
    public Integer getVlan() {
        return vlan;
    }

    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualInterfaceDict virtualInterfaceDict = (VirtualInterfaceDict) o;
        return Objects.equals(this.adminStateUp, virtualInterfaceDict.adminStateUp) &&
            Objects.equals(this.bandwidth, virtualInterfaceDict.bandwidth) &&
            Objects.equals(this.bgpAsn, virtualInterfaceDict.bgpAsn) &&
            Objects.equals(this.bgpMd5, virtualInterfaceDict.bgpMd5) &&
            Objects.equals(this.createTime, virtualInterfaceDict.createTime) &&
            Objects.equals(this.deleteTime, virtualInterfaceDict.deleteTime) &&
            Objects.equals(this.description, virtualInterfaceDict.description) &&
            Objects.equals(this.directConnectId, virtualInterfaceDict.directConnectId) &&
            Objects.equals(this.id, virtualInterfaceDict.id) &&
            Objects.equals(this.localGatewayV4Ip, virtualInterfaceDict.localGatewayV4Ip) &&
            Objects.equals(this.name, virtualInterfaceDict.name) &&
            Objects.equals(this.remoteEpGroup, virtualInterfaceDict.remoteEpGroup) &&
            Objects.equals(this.remoteGatewayV4Ip, virtualInterfaceDict.remoteGatewayV4Ip) &&
            Objects.equals(this.routeMode, virtualInterfaceDict.routeMode) &&
            Objects.equals(this.serviceEpGroupId, virtualInterfaceDict.serviceEpGroupId) &&
            Objects.equals(this.serviceType, virtualInterfaceDict.serviceType) &&
            Objects.equals(this.status, virtualInterfaceDict.status) &&
            Objects.equals(this.projectId, virtualInterfaceDict.projectId) &&
            Objects.equals(this.type, virtualInterfaceDict.type) &&
            Objects.equals(this.vgwId, virtualInterfaceDict.vgwId) &&
            Objects.equals(this.vlan, virtualInterfaceDict.vlan);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, bandwidth, bgpAsn, bgpMd5, createTime, deleteTime, description, directConnectId, id, localGatewayV4Ip, name, remoteEpGroup, remoteGatewayV4Ip, routeMode, serviceEpGroupId, serviceType, status, projectId, type, vgwId, vlan);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualInterfaceDict {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    bgpMd5: ").append(toIndentedString(bgpMd5)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    directConnectId: ").append(toIndentedString(directConnectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localGatewayV4Ip: ").append(toIndentedString(localGatewayV4Ip)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remoteEpGroup: ").append(toIndentedString(remoteEpGroup)).append("\n");
        sb.append("    remoteGatewayV4Ip: ").append(toIndentedString(remoteGatewayV4Ip)).append("\n");
        sb.append("    routeMode: ").append(toIndentedString(routeMode)).append("\n");
        sb.append("    serviceEpGroupId: ").append(toIndentedString(serviceEpGroupId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
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

