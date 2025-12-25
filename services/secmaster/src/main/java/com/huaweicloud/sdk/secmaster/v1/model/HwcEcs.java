package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云弹性云服务器
 */
public class HwcEcs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_status")

    private String protectedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private List<HwcEcsAddress> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<HwcEcsSecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private HwcEcsFlavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes_attached")

    private List<HwcEcsVolume> volumesAttached = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private HwcEcsMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduler_hints")

    private HwcEcsSchedulerHint schedulerHints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hypervisor")

    private HwcEcsHypervisor hypervisor;

    public HwcEcs withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 弹性云服务器ID，格式为UUID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HwcEcs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 弹性云服务器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HwcEcs withProtectedStatus(String protectedStatus) {
        this.protectedStatus = protectedStatus;
        return this;
    }

    /**
     * 主机安全开启状态：OPEN | CLOSE
     * @return protectedStatus
     */
    public String getProtectedStatus() {
        return protectedStatus;
    }

    public void setProtectedStatus(String protectedStatus) {
        this.protectedStatus = protectedStatus;
    }

    public HwcEcs withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 弹性云服务器的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HwcEcs withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 弹性云服务器状态。 取值范围： ACTIVE、BUILD、ERROR、HARD_REBOOT、MIGRATING、REBOOT、REBUILD、RESIZE、REVERT_RESIZE、SHUTOFF、VERIFY_RESIZE、DELETED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HwcEcs withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 弹性云服务器是否为锁定状态。 true：锁定 false：未锁定
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public HwcEcs withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 弹性云服务器所属的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public HwcEcs withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 创建弹性云服务器的用户ID，格式为UUID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public HwcEcs withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 弹性云服务器所属项目id，格式为UUID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public HwcEcs withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 弹性云服务器所在主机的主机ID。
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public HwcEcs withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 弹性云服务器所在主机的主机名称。
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public HwcEcs withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * 云服务器所在主机状态。 UP：服务正常 UNKNOWN：状态未知 DOWN：服务异常 MAINTENANCE：维护状态 空字符串：弹性云服务器无主机信息
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public HwcEcs withAddresses(List<HwcEcsAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public HwcEcs addAddressesItem(HwcEcsAddress addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    public HwcEcs withAddresses(Consumer<List<HwcEcsAddress>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 弹性云服务器的网络属性。
     * @return addresses
     */
    public List<HwcEcsAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<HwcEcsAddress> addresses) {
        this.addresses = addresses;
    }

    public HwcEcs withSecurityGroups(List<HwcEcsSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public HwcEcs addSecurityGroupsItem(HwcEcsSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public HwcEcs withSecurityGroups(Consumer<List<HwcEcsSecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 弹性云服务器所属安全组列表。
     * @return securityGroups
     */
    public List<HwcEcsSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<HwcEcsSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public HwcEcs withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 弹性云服务器所在可用区名称。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public HwcEcs withFlavor(HwcEcsFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public HwcEcs withFlavor(Consumer<HwcEcsFlavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new HwcEcsFlavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public HwcEcsFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(HwcEcsFlavor flavor) {
        this.flavor = flavor;
    }

    public HwcEcs withVolumesAttached(List<HwcEcsVolume> volumesAttached) {
        this.volumesAttached = volumesAttached;
        return this;
    }

    public HwcEcs addVolumesAttachedItem(HwcEcsVolume volumesAttachedItem) {
        if (this.volumesAttached == null) {
            this.volumesAttached = new ArrayList<>();
        }
        this.volumesAttached.add(volumesAttachedItem);
        return this;
    }

    public HwcEcs withVolumesAttached(Consumer<List<HwcEcsVolume>> volumesAttachedSetter) {
        if (this.volumesAttached == null) {
            this.volumesAttached = new ArrayList<>();
        }
        volumesAttachedSetter.accept(this.volumesAttached);
        return this;
    }

    /**
     * 挂载到弹性云服务器上的磁盘。
     * @return volumesAttached
     */
    public List<HwcEcsVolume> getVolumesAttached() {
        return volumesAttached;
    }

    public void setVolumesAttached(List<HwcEcsVolume> volumesAttached) {
        this.volumesAttached = volumesAttached;
    }

    public HwcEcs withMetadata(HwcEcsMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public HwcEcs withMetadata(Consumer<HwcEcsMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HwcEcsMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public HwcEcsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(HwcEcsMetadata metadata) {
        this.metadata = metadata;
    }

    public HwcEcs withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 弹性云服务器最近一次更新时间，例如开机、关机、重启等操作。 时间格式例如：2019-05-22T03:30:52Z
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public HwcEcs withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 弹性云服务器创建时间。 时间格式例如：2019-05-22T03:19:19Z
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public HwcEcs withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 弹性云服务器使用的密钥对名称。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public HwcEcs withSchedulerHints(HwcEcsSchedulerHint schedulerHints) {
        this.schedulerHints = schedulerHints;
        return this;
    }

    public HwcEcs withSchedulerHints(Consumer<HwcEcsSchedulerHint> schedulerHintsSetter) {
        if (this.schedulerHints == null) {
            this.schedulerHints = new HwcEcsSchedulerHint();
            schedulerHintsSetter.accept(this.schedulerHints);
        }

        return this;
    }

    /**
     * Get schedulerHints
     * @return schedulerHints
     */
    public HwcEcsSchedulerHint getSchedulerHints() {
        return schedulerHints;
    }

    public void setSchedulerHints(HwcEcsSchedulerHint schedulerHints) {
        this.schedulerHints = schedulerHints;
    }

    public HwcEcs withHypervisor(HwcEcsHypervisor hypervisor) {
        this.hypervisor = hypervisor;
        return this;
    }

    public HwcEcs withHypervisor(Consumer<HwcEcsHypervisor> hypervisorSetter) {
        if (this.hypervisor == null) {
            this.hypervisor = new HwcEcsHypervisor();
            hypervisorSetter.accept(this.hypervisor);
        }

        return this;
    }

    /**
     * Get hypervisor
     * @return hypervisor
     */
    public HwcEcsHypervisor getHypervisor() {
        return hypervisor;
    }

    public void setHypervisor(HwcEcsHypervisor hypervisor) {
        this.hypervisor = hypervisor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HwcEcs that = (HwcEcs) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.protectedStatus, that.protectedStatus)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.locked, that.locked)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostStatus, that.hostStatus) && Objects.equals(this.addresses, that.addresses)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.volumesAttached, that.volumesAttached)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.created, that.created) && Objects.equals(this.keyName, that.keyName)
            && Objects.equals(this.schedulerHints, that.schedulerHints)
            && Objects.equals(this.hypervisor, that.hypervisor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            protectedStatus,
            description,
            status,
            locked,
            enterpriseProjectId,
            userId,
            projectId,
            hostId,
            hostName,
            hostStatus,
            addresses,
            securityGroups,
            availabilityZone,
            flavor,
            volumesAttached,
            metadata,
            updated,
            created,
            keyName,
            schedulerHints,
            hypervisor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HwcEcs {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protectedStatus: ").append(toIndentedString(protectedStatus)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    volumesAttached: ").append(toIndentedString(volumesAttached)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    schedulerHints: ").append(toIndentedString(schedulerHints)).append("\n");
        sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
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
