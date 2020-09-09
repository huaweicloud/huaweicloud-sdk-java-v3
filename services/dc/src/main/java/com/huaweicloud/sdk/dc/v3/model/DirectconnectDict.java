package com.huaweicloud.sdk.dc.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DirectconnectDict
 */
public class DirectconnectDict  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apply_time")
    
    private String applyTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private Integer bandwidth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private String chargeMode;


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
    @JsonProperty(value="device_id")
    
    private String deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hosting_id")
    
    private String hostingId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interface_name")
    
    private String interfaceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="location")
    
    private String location;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="peer_location")
    
    private String peerLocation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_type")
    
    private String portType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider")
    
    private String provider;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redundant_id")
    
    private String redundantId;


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
    @JsonProperty(value="vlan")
    
    private Integer vlan;

    public DirectconnectDict withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 管理状态：true或false。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public DirectconnectDict withApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    


    /**
     * 物理专线申请时间。
     * @return applyTime
     */
    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public DirectconnectDict withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    


    /**
     * 物理专线接入带宽，单位Mbps。
     * minimum: 2
     * maximum: 20000
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public DirectconnectDict withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 计费模式：prepayment/bandwidth/traffic。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public DirectconnectDict withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 物理专线创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DirectconnectDict withDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    


    /**
     * 物理专线删除时间。
     * @return deleteTime
     */
    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public DirectconnectDict withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 物理专线的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DirectconnectDict withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 物理专线网关设备的ID。
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public DirectconnectDict withHostingId(String hostingId) {
        this.hostingId = hostingId;
        return this;
    }

    


    /**
     * hosted物理专线对应的hosting物理专线的ID。
     * @return hostingId
     */
    public String getHostingId() {
        return hostingId;
    }

    public void setHostingId(String hostingId) {
        this.hostingId = hostingId;
    }

    public DirectconnectDict withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 物理专线的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DirectconnectDict withInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }

    


    /**
     * 物理专线接入接口的名字。
     * @return interfaceName
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public DirectconnectDict withLocation(String location) {
        this.location = location;
        return this;
    }

    


    /**
     * 物理专线的接入位置。
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public DirectconnectDict withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 物理专线的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DirectconnectDict withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * 物理专线对应订单号，用于支持包周期计费，识别用户订单。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public DirectconnectDict withPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
        return this;
    }

    


    /**
     * 物理专线对端所在的物理位置，省/市/街道或IDC名字。
     * @return peerLocation
     */
    public String getPeerLocation() {
        return peerLocation;
    }

    public void setPeerLocation(String peerLocation) {
        this.peerLocation = peerLocation;
    }

    public DirectconnectDict withPortType(String portType) {
        this.portType = portType;
        return this;
    }

    


    /**
     * 物理专线接入接口的类型：1G、10G。
     * @return portType
     */
    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public DirectconnectDict withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 物理专线订单对应产品标识，用于订制包周期套餐等计费策略。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public DirectconnectDict withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    


    /**
     * 物理专线运营商。 中国电信 中国联通 中国移动 中国其他 境外其他
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public DirectconnectDict withRedundantId(String redundantId) {
        this.redundantId = redundantId;
        return this;
    }

    


    /**
     * 同一专线网关备份物理专线的ID。
     * @return redundantId
     */
    public String getRedundantId() {
        return redundantId;
    }

    public void setRedundantId(String redundantId) {
        this.redundantId = redundantId;
    }

    public DirectconnectDict withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 操作状态，合法值是：ACTIVE，DOWN，BUILD，ERROR，PENDING_DELETE，DELETED，APPLY，DENY，PENDING_PAY，PAID，ORDERING，ACCEPT，REJECTED。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DirectconnectDict withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 租户的ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DirectconnectDict withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 物理专线类型：standard/hosting/hosted。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DirectconnectDict withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }

    


    /**
     * hosted物理专线预分配的vlan。
     * minimum: 1
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
        DirectconnectDict directconnectDict = (DirectconnectDict) o;
        return Objects.equals(this.adminStateUp, directconnectDict.adminStateUp) &&
            Objects.equals(this.applyTime, directconnectDict.applyTime) &&
            Objects.equals(this.bandwidth, directconnectDict.bandwidth) &&
            Objects.equals(this.chargeMode, directconnectDict.chargeMode) &&
            Objects.equals(this.createTime, directconnectDict.createTime) &&
            Objects.equals(this.deleteTime, directconnectDict.deleteTime) &&
            Objects.equals(this.description, directconnectDict.description) &&
            Objects.equals(this.deviceId, directconnectDict.deviceId) &&
            Objects.equals(this.hostingId, directconnectDict.hostingId) &&
            Objects.equals(this.id, directconnectDict.id) &&
            Objects.equals(this.interfaceName, directconnectDict.interfaceName) &&
            Objects.equals(this.location, directconnectDict.location) &&
            Objects.equals(this.name, directconnectDict.name) &&
            Objects.equals(this.orderId, directconnectDict.orderId) &&
            Objects.equals(this.peerLocation, directconnectDict.peerLocation) &&
            Objects.equals(this.portType, directconnectDict.portType) &&
            Objects.equals(this.productId, directconnectDict.productId) &&
            Objects.equals(this.provider, directconnectDict.provider) &&
            Objects.equals(this.redundantId, directconnectDict.redundantId) &&
            Objects.equals(this.status, directconnectDict.status) &&
            Objects.equals(this.projectId, directconnectDict.projectId) &&
            Objects.equals(this.type, directconnectDict.type) &&
            Objects.equals(this.vlan, directconnectDict.vlan);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, applyTime, bandwidth, chargeMode, createTime, deleteTime, description, deviceId, hostingId, id, interfaceName, location, name, orderId, peerLocation, portType, productId, provider, redundantId, status, projectId, type, vlan);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectconnectDict {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    hostingId: ").append(toIndentedString(hostingId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    peerLocation: ").append(toIndentedString(peerLocation)).append("\n");
        sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    redundantId: ").append(toIndentedString(redundantId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

