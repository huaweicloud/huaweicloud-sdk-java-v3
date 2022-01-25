package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ClusterDetailInstance */
public class ClusterDetailInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private ClusterDetailInstanceFlavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private ClusterDetailInstanceVolume volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isFrozen")

    private String isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private String components;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    private String configStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<ClusterLinks> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paramsGroupId")

    private String paramsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicIp")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manageIp")

    private String manageIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trafficIp")

    private String trafficIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_id")

    private String shardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_fix_ip")

    private String manageFixIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_ip")

    private String internalIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private List<Resource> resource = null;

    public ClusterDetailInstance withFlavor(ClusterDetailInstanceFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public ClusterDetailInstance withFlavor(Consumer<ClusterDetailInstanceFlavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new ClusterDetailInstanceFlavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /** Get flavor
     * 
     * @return flavor */
    public ClusterDetailInstanceFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(ClusterDetailInstanceFlavor flavor) {
        this.flavor = flavor;
    }

    public ClusterDetailInstance withVolume(ClusterDetailInstanceVolume volume) {
        this.volume = volume;
        return this;
    }

    public ClusterDetailInstance withVolume(Consumer<ClusterDetailInstanceVolume> volumeSetter) {
        if (this.volume == null) {
            this.volume = new ClusterDetailInstanceVolume();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /** Get volume
     * 
     * @return volume */
    public ClusterDetailInstanceVolume getVolume() {
        return volume;
    }

    public void setVolume(ClusterDetailInstanceVolume volume) {
        this.volume = volume;
    }

    public ClusterDetailInstance withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 节点状态： - 100：创建中。 - 200：正常。 - 300：失败。 - 303：创建失败。 - 400：已删除。 - 800：冻结。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClusterDetailInstance withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public ClusterDetailInstance addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ClusterDetailInstance withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /** 节点操作状态列表： - REBOOTING：重启中。 - RESTORING：恢复中。 - REBOOT_FAILURE：重启失败。
     * 
     * @return actions */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public ClusterDetailInstance withType(String type) {
        this.type = type;
        return this;
    }

    /** 节点类型，只支持一种类型“cdm”。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClusterDetailInstance withId(String id) {
        this.id = id;
        return this;
    }

    /** 节点的虚拟机ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterDetailInstance withName(String name) {
        this.name = name;
        return this;
    }

    /** 节点的虚拟机名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterDetailInstance withIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /** 节点是否冻结：0：否。1：是。
     * 
     * @return isFrozen */
    public String getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
    }

    public ClusterDetailInstance withComponents(String components) {
        this.components = components;
        return this;
    }

    /** 组件
     * 
     * @return components */
    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public ClusterDetailInstance withConfigStatus(String configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /** 节点配置状态： - In-Sync：配置已同步。 - Applying：配置中。 - Sync-Failure：配置失败。
     * 
     * @return configStatus */
    public String getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(String configStatus) {
        this.configStatus = configStatus;
    }

    public ClusterDetailInstance withRole(String role) {
        this.role = role;
        return this;
    }

    /** 实例角色
     * 
     * @return role */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ClusterDetailInstance withGroup(String group) {
        this.group = group;
        return this;
    }

    /** 分组
     * 
     * @return group */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ClusterDetailInstance withLinks(List<ClusterLinks> links) {
        this.links = links;
        return this;
    }

    public ClusterDetailInstance addLinksItem(ClusterLinks linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public ClusterDetailInstance withLinks(Consumer<List<ClusterLinks>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /** 链接信息（查询集群列表时返回值为null）
     * 
     * @return links */
    public List<ClusterLinks> getLinks() {
        return links;
    }

    public void setLinks(List<ClusterLinks> links) {
        this.links = links;
    }

    public ClusterDetailInstance withParamsGroupId(String paramsGroupId) {
        this.paramsGroupId = paramsGroupId;
        return this;
    }

    /** 组件分组id
     * 
     * @return paramsGroupId */
    public String getParamsGroupId() {
        return paramsGroupId;
    }

    public void setParamsGroupId(String paramsGroupId) {
        this.paramsGroupId = paramsGroupId;
    }

    public ClusterDetailInstance withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /** 公网ip
     * 
     * @return publicIp */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ClusterDetailInstance withManageIp(String manageIp) {
        this.manageIp = manageIp;
        return this;
    }

    /** 管理ip
     * 
     * @return manageIp */
    public String getManageIp() {
        return manageIp;
    }

    public void setManageIp(String manageIp) {
        this.manageIp = manageIp;
    }

    public ClusterDetailInstance withTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
        return this;
    }

    /** 流量ip
     * 
     * @return trafficIp */
    public String getTrafficIp() {
        return trafficIp;
    }

    public void setTrafficIp(String trafficIp) {
        this.trafficIp = trafficIp;
    }

    public ClusterDetailInstance withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /** 分片id
     * 
     * @return shardId */
    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public ClusterDetailInstance withManageFixIp(String manageFixIp) {
        this.manageFixIp = manageFixIp;
        return this;
    }

    /** 管理修复ip
     * 
     * @return manageFixIp */
    public String getManageFixIp() {
        return manageFixIp;
    }

    public void setManageFixIp(String manageFixIp) {
        this.manageFixIp = manageFixIp;
    }

    public ClusterDetailInstance withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /** 私有ip
     * 
     * @return privateIp */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ClusterDetailInstance withInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    /** 内部ip
     * 
     * @return internalIp */
    public String getInternalIp() {
        return internalIp;
    }

    public void setInternalIp(String internalIp) {
        this.internalIp = internalIp;
    }

    public ClusterDetailInstance withResource(List<Resource> resource) {
        this.resource = resource;
        return this;
    }

    public ClusterDetailInstance addResourceItem(Resource resourceItem) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        this.resource.add(resourceItem);
        return this;
    }

    public ClusterDetailInstance withResource(Consumer<List<Resource>> resourceSetter) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        resourceSetter.accept(this.resource);
        return this;
    }

    /** 资源信息
     * 
     * @return resource */
    public List<Resource> getResource() {
        return resource;
    }

    public void setResource(List<Resource> resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterDetailInstance clusterDetailInstance = (ClusterDetailInstance) o;
        return Objects.equals(this.flavor, clusterDetailInstance.flavor)
            && Objects.equals(this.volume, clusterDetailInstance.volume)
            && Objects.equals(this.status, clusterDetailInstance.status)
            && Objects.equals(this.actions, clusterDetailInstance.actions)
            && Objects.equals(this.type, clusterDetailInstance.type)
            && Objects.equals(this.id, clusterDetailInstance.id)
            && Objects.equals(this.name, clusterDetailInstance.name)
            && Objects.equals(this.isFrozen, clusterDetailInstance.isFrozen)
            && Objects.equals(this.components, clusterDetailInstance.components)
            && Objects.equals(this.configStatus, clusterDetailInstance.configStatus)
            && Objects.equals(this.role, clusterDetailInstance.role)
            && Objects.equals(this.group, clusterDetailInstance.group)
            && Objects.equals(this.links, clusterDetailInstance.links)
            && Objects.equals(this.paramsGroupId, clusterDetailInstance.paramsGroupId)
            && Objects.equals(this.publicIp, clusterDetailInstance.publicIp)
            && Objects.equals(this.manageIp, clusterDetailInstance.manageIp)
            && Objects.equals(this.trafficIp, clusterDetailInstance.trafficIp)
            && Objects.equals(this.shardId, clusterDetailInstance.shardId)
            && Objects.equals(this.manageFixIp, clusterDetailInstance.manageFixIp)
            && Objects.equals(this.privateIp, clusterDetailInstance.privateIp)
            && Objects.equals(this.internalIp, clusterDetailInstance.internalIp)
            && Objects.equals(this.resource, clusterDetailInstance.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor,
            volume,
            status,
            actions,
            type,
            id,
            name,
            isFrozen,
            components,
            configStatus,
            role,
            group,
            links,
            paramsGroupId,
            publicIp,
            manageIp,
            trafficIp,
            shardId,
            manageFixIp,
            privateIp,
            internalIp,
            resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterDetailInstance {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    paramsGroupId: ").append(toIndentedString(paramsGroupId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    manageIp: ").append(toIndentedString(manageIp)).append("\n");
        sb.append("    trafficIp: ").append(toIndentedString(trafficIp)).append("\n");
        sb.append("    shardId: ").append(toIndentedString(shardId)).append("\n");
        sb.append("    manageFixIp: ").append(toIndentedString(manageFixIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    internalIp: ").append(toIndentedString(internalIp)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
