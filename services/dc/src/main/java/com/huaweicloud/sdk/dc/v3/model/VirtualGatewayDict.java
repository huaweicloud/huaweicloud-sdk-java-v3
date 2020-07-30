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
 * VirtualGatewayDict
 */
public class VirtualGatewayDict  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipsec_bandwidth")
    
    private Integer ipsecBandwidth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="local_ep_group")
    
    private List<String> localEpGroup = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redundant_device_id")
    
    private String redundantDeviceId;


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
    @JsonProperty(value="vpc_id")
    
    private String vpcId;

    public VirtualGatewayDict withAdminStateUp(Boolean adminStateUp) {
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

    public VirtualGatewayDict withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 虚拟网关的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VirtualGatewayDict withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 物理设备的ID
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public VirtualGatewayDict withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 虚拟网关的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VirtualGatewayDict withIpsecBandwidth(Integer ipsecBandwidth) {
        this.ipsecBandwidth = ipsecBandwidth;
        return this;
    }

    


    /**
     * ipsec vpn接入带宽，单位Mbps
     * minimum: 1
     * maximum: 300
     * @return ipsecBandwidth
     */
    public Integer getIpsecBandwidth() {
        return ipsecBandwidth;
    }

    public void setIpsecBandwidth(Integer ipsecBandwidth) {
        this.ipsecBandwidth = ipsecBandwidth;
    }

    public VirtualGatewayDict withLocalEpGroup(List<String> localEpGroup) {
        this.localEpGroup = localEpGroup;
        return this;
    }

    
    public VirtualGatewayDict addLocalEpGroupItem(String localEpGroupItem) {
        if (this.localEpGroup == null) {
            this.localEpGroup = new ArrayList<>();
        }
        this.localEpGroup.add(localEpGroupItem);
        return this;
    }

    public VirtualGatewayDict withLocalEpGroup(Consumer<List<String>> localEpGroupSetter) {
        if(this.localEpGroup == null ){
            this.localEpGroup = new ArrayList<>();
        }
        localEpGroupSetter.accept(this.localEpGroup);
        return this;
    }

    /**
     * 本地端口组，记录vpc的cidrs
     * @return localEpGroup
     */
    public List<String> getLocalEpGroup() {
        return localEpGroup;
    }

    public void setLocalEpGroup(List<String> localEpGroup) {
        this.localEpGroup = localEpGroup;
    }

    public VirtualGatewayDict withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 虚拟网关的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VirtualGatewayDict withRedundantDeviceId(String redundantDeviceId) {
        this.redundantDeviceId = redundantDeviceId;
        return this;
    }

    


    /**
     * 备份物理设备的ID
     * @return redundantDeviceId
     */
    public String getRedundantDeviceId() {
        return redundantDeviceId;
    }

    public void setRedundantDeviceId(String redundantDeviceId) {
        this.redundantDeviceId = redundantDeviceId;
    }

    public VirtualGatewayDict withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 操作状态，合法值是：ACTIVE，DOWN，BUILD，ERROR，PENDING_CREATE，PENDING_UPDATE，PENDING_DELETE
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VirtualGatewayDict withProjectId(String projectId) {
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

    public VirtualGatewayDict withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 虚拟网关类型：default/double ipsec
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VirtualGatewayDict withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 接入的vpc 的ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualGatewayDict virtualGatewayDict = (VirtualGatewayDict) o;
        return Objects.equals(this.adminStateUp, virtualGatewayDict.adminStateUp) &&
            Objects.equals(this.description, virtualGatewayDict.description) &&
            Objects.equals(this.deviceId, virtualGatewayDict.deviceId) &&
            Objects.equals(this.id, virtualGatewayDict.id) &&
            Objects.equals(this.ipsecBandwidth, virtualGatewayDict.ipsecBandwidth) &&
            Objects.equals(this.localEpGroup, virtualGatewayDict.localEpGroup) &&
            Objects.equals(this.name, virtualGatewayDict.name) &&
            Objects.equals(this.redundantDeviceId, virtualGatewayDict.redundantDeviceId) &&
            Objects.equals(this.status, virtualGatewayDict.status) &&
            Objects.equals(this.projectId, virtualGatewayDict.projectId) &&
            Objects.equals(this.type, virtualGatewayDict.type) &&
            Objects.equals(this.vpcId, virtualGatewayDict.vpcId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, description, deviceId, id, ipsecBandwidth, localEpGroup, name, redundantDeviceId, status, projectId, type, vpcId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualGatewayDict {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipsecBandwidth: ").append(toIndentedString(ipsecBandwidth)).append("\n");
        sb.append("    localEpGroup: ").append(toIndentedString(localEpGroup)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    redundantDeviceId: ").append(toIndentedString(redundantDeviceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

