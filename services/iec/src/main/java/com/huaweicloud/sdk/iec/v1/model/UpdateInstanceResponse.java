package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostId")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private Map<String, List<InstanceAddress>> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<SysTags> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorInstance flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<InstanceSecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-STS:power_state")

    private Integer osEXTSTSPowerState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-STS:vm_state")

    private String osEXTSTSVmState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-STS:task_state")

    private String osEXTSTSTaskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-DCF:diskConfig")

    private String osDCFDiskConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-AZ:availability_zone")

    private String osEXTAZAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-SRV-USG:launched_at")

    private String osSRVUSGLaunchedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-SRV-USG:terminated_at")

    private String osSRVUSGTerminatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:root_device_name")

    private String osEXTSRVATTRRootDeviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:ramdisk_id")

    private String osEXTSRVATTRRamdiskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:kernel_id")

    private String osEXTSRVATTRKernelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:launch_index")

    private Integer osEXTSRVATTRLaunchIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:reservation_id")

    private String osEXTSRVATTRReservationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:hostname")

    private String osEXTSRVATTRHostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:user_data")

    private String osEXTSRVATTRUserData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:host")

    private String osEXTSRVATTRHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:hypervisor_hostname")

    private String osEXTSRVATTRHypervisorHostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os-extended-volumes:volumes_attached")

    private List<VolumesAttached> osExtendedVolumesVolumesAttached = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geolocation")

    private GeoLocation geolocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edgecloud_id")

    private String edgecloudId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edgecloud_name")

    private String edgecloudName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-SRV-ATTR:instance_name")

    private String osEXTSRVATTRInstanceName;

    public UpdateInstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 边缘实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 边缘实例状态。 取值范围： ACTIVE、BUILD、DELETED、ERROR、HARD_REBOOT、MIGRATING、PAUSED、REBOOT、REBUILD、RESIZE、REVERT_RESIZE、SHUTOFF、SHELVED、SHELVED_OFFLOADED、SOFT_DELETED、SUSPENDED、VERIFY_RESIZE
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateInstanceResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 边缘实例修改时间。 UTC时间，格式：yyyy-mm-ddTss:ss:ssZ，例如：2021-04-25T03:21:39Z
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public UpdateInstanceResponse withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 边缘实例所在主机的主机ID。
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public UpdateInstanceResponse withAddresses(Map<String, List<InstanceAddress>> addresses) {
        this.addresses = addresses;
        return this;
    }

    public UpdateInstanceResponse putAddressesItem(String key, List<InstanceAddress> addressesItem) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        this.addresses.put(key, addressesItem);
        return this;
    }

    public UpdateInstanceResponse withAddresses(Consumer<Map<String, List<InstanceAddress>>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 边缘实例对应的网络地址信息，详情请参见表addresses字段数据结构说明。
     * @return addresses
     */
    public Map<String, List<InstanceAddress>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<InstanceAddress>> addresses) {
        this.addresses = addresses;
    }

    public UpdateInstanceResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 边缘实例创建时间。 时间格式：yyyy-mm-ddTss:ss:ssZ，例如：2021-04-25T02:46:23Z
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public UpdateInstanceResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateInstanceResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateInstanceResponse withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 边缘实例标签。 主要用来存储边缘业务ID。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public UpdateInstanceResponse withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 边缘实例是否为锁定状态。  - true：锁定 - false：未锁定
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public UpdateInstanceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 边缘实例的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateInstanceResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 边缘实例所属租户ID，即项目ID，和project_id表示相同的概念，格式为UUID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public UpdateInstanceResponse withSysTags(List<SysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public UpdateInstanceResponse addSysTagsItem(SysTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public UpdateInstanceResponse withSysTags(Consumer<List<SysTags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 边缘实例系统标签。
     * @return sysTags
     */
    public List<SysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SysTags> sysTags) {
        this.sysTags = sysTags;
    }

    public UpdateInstanceResponse withFlavor(FlavorInstance flavor) {
        this.flavor = flavor;
        return this;
    }

    public UpdateInstanceResponse withFlavor(Consumer<FlavorInstance> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new FlavorInstance();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public FlavorInstance getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorInstance flavor) {
        this.flavor = flavor;
    }

    public UpdateInstanceResponse withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public UpdateInstanceResponse putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public UpdateInstanceResponse withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 边缘实例元数据。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public UpdateInstanceResponse withSecurityGroups(List<InstanceSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public UpdateInstanceResponse addSecurityGroupsItem(InstanceSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public UpdateInstanceResponse withSecurityGroups(Consumer<List<InstanceSecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 边缘实例所属安全组列表。
     * @return securityGroups
     */
    public List<InstanceSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<InstanceSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public UpdateInstanceResponse withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 边缘实例进度。
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public UpdateInstanceResponse withOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
        return this;
    }

    /**
     * 扩展属性，边缘实例电源状态。
     * @return osEXTSTSPowerState
     */
    public Integer getOsEXTSTSPowerState() {
        return osEXTSTSPowerState;
    }

    public void setOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
    }

    public UpdateInstanceResponse withOsEXTSTSVmState(String osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
        return this;
    }

    /**
     * 扩展属性，边缘实例当前状态。
     * @return osEXTSTSVmState
     */
    public String getOsEXTSTSVmState() {
        return osEXTSTSVmState;
    }

    public void setOsEXTSTSVmState(String osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
    }

    public UpdateInstanceResponse withOsEXTSTSTaskState(String osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
        return this;
    }

    /**
     * 边缘实例任务状态。
     * @return osEXTSTSTaskState
     */
    public String getOsEXTSTSTaskState() {
        return osEXTSTSTaskState;
    }

    public void setOsEXTSTSTaskState(String osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
    }

    public UpdateInstanceResponse withOsDCFDiskConfig(String osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    /**
     * 扩展属性， diskConfig的类型。  - MANUAL，镜像空间不会扩展。 - AUTO，系统盘镜像空间会自动扩展为与flavor大小一致。
     * @return osDCFDiskConfig
     */
    public String getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(String osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    public UpdateInstanceResponse withOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
        return this;
    }

    /**
     * 扩展属性，边缘实例所在可用区名称。
     * @return osEXTAZAvailabilityZone
     */
    public String getOsEXTAZAvailabilityZone() {
        return osEXTAZAvailabilityZone;
    }

    public void setOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
    }

    public UpdateInstanceResponse withOsSRVUSGLaunchedAt(String osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
        return this;
    }

    /**
     * 边缘实例启动时间。 时间格式例如：2019-05-22T03:23:59.000000
     * @return osSRVUSGLaunchedAt
     */
    public String getOsSRVUSGLaunchedAt() {
        return osSRVUSGLaunchedAt;
    }

    public void setOsSRVUSGLaunchedAt(String osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
    }

    public UpdateInstanceResponse withOsSRVUSGTerminatedAt(String osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
        return this;
    }

    /**
     * 边缘实例删除时间。 时间格式例如：2019-05-22T03:23:59.000000
     * @return osSRVUSGTerminatedAt
     */
    public String getOsSRVUSGTerminatedAt() {
        return osSRVUSGTerminatedAt;
    }

    public void setOsSRVUSGTerminatedAt(String osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
    }

    public UpdateInstanceResponse withOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
        return this;
    }

    /**
     * 边缘实例系统盘的设备名称。
     * @return osEXTSRVATTRRootDeviceName
     */
    public String getOsEXTSRVATTRRootDeviceName() {
        return osEXTSRVATTRRootDeviceName;
    }

    public void setOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
    }

    public UpdateInstanceResponse withOsEXTSRVATTRRamdiskId(String osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
        return this;
    }

    /**
     * 若使用AMI格式镜像，则表示ramdisk image的UUID；否则，留空。
     * @return osEXTSRVATTRRamdiskId
     */
    public String getOsEXTSRVATTRRamdiskId() {
        return osEXTSRVATTRRamdiskId;
    }

    public void setOsEXTSRVATTRRamdiskId(String osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
    }

    public UpdateInstanceResponse withOsEXTSRVATTRKernelId(String osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
        return this;
    }

    /**
     * 若使用AMI格式的镜像，则表示kernel image的UUID；否则，留空。
     * @return osEXTSRVATTRKernelId
     */
    public String getOsEXTSRVATTRKernelId() {
        return osEXTSRVATTRKernelId;
    }

    public void setOsEXTSRVATTRKernelId(String osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
    }

    public UpdateInstanceResponse withOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
        return this;
    }

    /**
     * 批量创建场景，边缘实例的启动顺序。
     * @return osEXTSRVATTRLaunchIndex
     */
    public Integer getOsEXTSRVATTRLaunchIndex() {
        return osEXTSRVATTRLaunchIndex;
    }

    public void setOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
    }

    public UpdateInstanceResponse withOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
        return this;
    }

    /**
     * 批量创建场景，边缘实例的预留ID。
     * @return osEXTSRVATTRReservationId
     */
    public String getOsEXTSRVATTRReservationId() {
        return osEXTSRVATTRReservationId;
    }

    public void setOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
    }

    public UpdateInstanceResponse withOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
        return this;
    }

    /**
     * 边缘实例的主机名。
     * @return osEXTSRVATTRHostname
     */
    public String getOsEXTSRVATTRHostname() {
        return osEXTSRVATTRHostname;
    }

    public void setOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
    }

    public UpdateInstanceResponse withOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
        return this;
    }

    /**
     * 创建边缘实例时指定的user_data。
     * @return osEXTSRVATTRUserData
     */
    public String getOsEXTSRVATTRUserData() {
        return osEXTSRVATTRUserData;
    }

    public void setOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
    }

    public UpdateInstanceResponse withOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
        return this;
    }

    /**
     * 边缘实例所在主机的主机名称。
     * @return osEXTSRVATTRHost
     */
    public String getOsEXTSRVATTRHost() {
        return osEXTSRVATTRHost;
    }

    public void setOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
    }

    public UpdateInstanceResponse withOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
        return this;
    }

    /**
     * 扩展属性，边缘实例所在虚拟化主机名。
     * @return osEXTSRVATTRHypervisorHostname
     */
    public String getOsEXTSRVATTRHypervisorHostname() {
        return osEXTSRVATTRHypervisorHostname;
    }

    public void setOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
    }

    public UpdateInstanceResponse withOsExtendedVolumesVolumesAttached(
        List<VolumesAttached> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
        return this;
    }

    public UpdateInstanceResponse addOsExtendedVolumesVolumesAttachedItem(
        VolumesAttached osExtendedVolumesVolumesAttachedItem) {
        if (this.osExtendedVolumesVolumesAttached == null) {
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        this.osExtendedVolumesVolumesAttached.add(osExtendedVolumesVolumesAttachedItem);
        return this;
    }

    public UpdateInstanceResponse withOsExtendedVolumesVolumesAttached(
        Consumer<List<VolumesAttached>> osExtendedVolumesVolumesAttachedSetter) {
        if (this.osExtendedVolumesVolumesAttached == null) {
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        osExtendedVolumesVolumesAttachedSetter.accept(this.osExtendedVolumesVolumesAttached);
        return this;
    }

    /**
     * 挂载到边缘实例上的磁盘。
     * @return osExtendedVolumesVolumesAttached
     */
    public List<VolumesAttached> getOsExtendedVolumesVolumesAttached() {
        return osExtendedVolumesVolumesAttached;
    }

    public void setOsExtendedVolumesVolumesAttached(List<VolumesAttached> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
    }

    public UpdateInstanceResponse withGeolocation(GeoLocation geolocation) {
        this.geolocation = geolocation;
        return this;
    }

    public UpdateInstanceResponse withGeolocation(Consumer<GeoLocation> geolocationSetter) {
        if (this.geolocation == null) {
            this.geolocation = new GeoLocation();
            geolocationSetter.accept(this.geolocation);
        }

        return this;
    }

    /**
     * Get geolocation
     * @return geolocation
     */
    public GeoLocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(GeoLocation geolocation) {
        this.geolocation = geolocation;
    }

    public UpdateInstanceResponse withEdgecloudId(String edgecloudId) {
        this.edgecloudId = edgecloudId;
        return this;
    }

    /**
     * 边缘实例所属边缘业务的ID。
     * @return edgecloudId
     */
    public String getEdgecloudId() {
        return edgecloudId;
    }

    public void setEdgecloudId(String edgecloudId) {
        this.edgecloudId = edgecloudId;
    }

    public UpdateInstanceResponse withEdgecloudName(String edgecloudName) {
        this.edgecloudName = edgecloudName;
        return this;
    }

    /**
     * 边缘实例所属边缘业务的名称
     * @return edgecloudName
     */
    public String getEdgecloudName() {
        return edgecloudName;
    }

    public void setEdgecloudName(String edgecloudName) {
        this.edgecloudName = edgecloudName;
    }

    public UpdateInstanceResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 帐号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UpdateInstanceResponse withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 使用的密钥对名称。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public UpdateInstanceResponse withOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
        return this;
    }

    /**
     * 扩展属性，边缘实例别名。
     * @return osEXTSRVATTRInstanceName
     */
    public String getOsEXTSRVATTRInstanceName() {
        return osEXTSRVATTRInstanceName;
    }

    public void setOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInstanceResponse that = (UpdateInstanceResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.addresses, that.addresses)
            && Objects.equals(this.created, that.created) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.locked, that.locked) && Objects.equals(this.description, that.description)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.securityGroups, that.securityGroups) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.osEXTSTSPowerState, that.osEXTSTSPowerState)
            && Objects.equals(this.osEXTSTSVmState, that.osEXTSTSVmState)
            && Objects.equals(this.osEXTSTSTaskState, that.osEXTSTSTaskState)
            && Objects.equals(this.osDCFDiskConfig, that.osDCFDiskConfig)
            && Objects.equals(this.osEXTAZAvailabilityZone, that.osEXTAZAvailabilityZone)
            && Objects.equals(this.osSRVUSGLaunchedAt, that.osSRVUSGLaunchedAt)
            && Objects.equals(this.osSRVUSGTerminatedAt, that.osSRVUSGTerminatedAt)
            && Objects.equals(this.osEXTSRVATTRRootDeviceName, that.osEXTSRVATTRRootDeviceName)
            && Objects.equals(this.osEXTSRVATTRRamdiskId, that.osEXTSRVATTRRamdiskId)
            && Objects.equals(this.osEXTSRVATTRKernelId, that.osEXTSRVATTRKernelId)
            && Objects.equals(this.osEXTSRVATTRLaunchIndex, that.osEXTSRVATTRLaunchIndex)
            && Objects.equals(this.osEXTSRVATTRReservationId, that.osEXTSRVATTRReservationId)
            && Objects.equals(this.osEXTSRVATTRHostname, that.osEXTSRVATTRHostname)
            && Objects.equals(this.osEXTSRVATTRUserData, that.osEXTSRVATTRUserData)
            && Objects.equals(this.osEXTSRVATTRHost, that.osEXTSRVATTRHost)
            && Objects.equals(this.osEXTSRVATTRHypervisorHostname, that.osEXTSRVATTRHypervisorHostname)
            && Objects.equals(this.osExtendedVolumesVolumesAttached, that.osExtendedVolumesVolumesAttached)
            && Objects.equals(this.geolocation, that.geolocation) && Objects.equals(this.edgecloudId, that.edgecloudId)
            && Objects.equals(this.edgecloudName, that.edgecloudName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.keyName, that.keyName)
            && Objects.equals(this.osEXTSRVATTRInstanceName, that.osEXTSRVATTRInstanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            updated,
            hostId,
            addresses,
            created,
            tags,
            locked,
            description,
            tenantId,
            sysTags,
            flavor,
            metadata,
            securityGroups,
            progress,
            osEXTSTSPowerState,
            osEXTSTSVmState,
            osEXTSTSTaskState,
            osDCFDiskConfig,
            osEXTAZAvailabilityZone,
            osSRVUSGLaunchedAt,
            osSRVUSGTerminatedAt,
            osEXTSRVATTRRootDeviceName,
            osEXTSRVATTRRamdiskId,
            osEXTSRVATTRKernelId,
            osEXTSRVATTRLaunchIndex,
            osEXTSRVATTRReservationId,
            osEXTSRVATTRHostname,
            osEXTSRVATTRUserData,
            osEXTSRVATTRHost,
            osEXTSRVATTRHypervisorHostname,
            osExtendedVolumesVolumesAttached,
            geolocation,
            edgecloudId,
            edgecloudName,
            domainId,
            keyName,
            osEXTSRVATTRInstanceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    osEXTSTSPowerState: ").append(toIndentedString(osEXTSTSPowerState)).append("\n");
        sb.append("    osEXTSTSVmState: ").append(toIndentedString(osEXTSTSVmState)).append("\n");
        sb.append("    osEXTSTSTaskState: ").append(toIndentedString(osEXTSTSTaskState)).append("\n");
        sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
        sb.append("    osEXTAZAvailabilityZone: ").append(toIndentedString(osEXTAZAvailabilityZone)).append("\n");
        sb.append("    osSRVUSGLaunchedAt: ").append(toIndentedString(osSRVUSGLaunchedAt)).append("\n");
        sb.append("    osSRVUSGTerminatedAt: ").append(toIndentedString(osSRVUSGTerminatedAt)).append("\n");
        sb.append("    osEXTSRVATTRRootDeviceName: ").append(toIndentedString(osEXTSRVATTRRootDeviceName)).append("\n");
        sb.append("    osEXTSRVATTRRamdiskId: ").append(toIndentedString(osEXTSRVATTRRamdiskId)).append("\n");
        sb.append("    osEXTSRVATTRKernelId: ").append(toIndentedString(osEXTSRVATTRKernelId)).append("\n");
        sb.append("    osEXTSRVATTRLaunchIndex: ").append(toIndentedString(osEXTSRVATTRLaunchIndex)).append("\n");
        sb.append("    osEXTSRVATTRReservationId: ").append(toIndentedString(osEXTSRVATTRReservationId)).append("\n");
        sb.append("    osEXTSRVATTRHostname: ").append(toIndentedString(osEXTSRVATTRHostname)).append("\n");
        sb.append("    osEXTSRVATTRUserData: ").append(toIndentedString(osEXTSRVATTRUserData)).append("\n");
        sb.append("    osEXTSRVATTRHost: ").append(toIndentedString(osEXTSRVATTRHost)).append("\n");
        sb.append("    osEXTSRVATTRHypervisorHostname: ")
            .append(toIndentedString(osEXTSRVATTRHypervisorHostname))
            .append("\n");
        sb.append("    osExtendedVolumesVolumesAttached: ")
            .append(toIndentedString(osExtendedVolumesVolumesAttached))
            .append("\n");
        sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
        sb.append("    edgecloudId: ").append(toIndentedString(edgecloudId)).append("\n");
        sb.append("    edgecloudName: ").append(toIndentedString(edgecloudName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    osEXTSRVATTRInstanceName: ").append(toIndentedString(osEXTSRVATTRInstanceName)).append("\n");
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
