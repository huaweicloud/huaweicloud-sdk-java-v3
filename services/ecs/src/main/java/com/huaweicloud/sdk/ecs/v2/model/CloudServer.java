package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloudServer
 */
public class CloudServer {

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
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market_info")

    private MarketModel marketInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_state")

    private String vmState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_state")

    private String taskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_state")

    private Integer powerState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_recycle_bin")

    private Boolean inRecycleBin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spod_id")

    private String spodId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launched_at")

    private String launchedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_device_name")

    private String rootDeviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenancy")

    private String tenancy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private String dedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private Map<String, List<NetworkAddresses>> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes_attached")

    private List<VolumeAttach> volumesAttached = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private Image image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorQuasar flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault")

    private Fault fault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_options")

    private CpuOptions cpuOptions;

    public CloudServer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云服务器唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CloudServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云服务器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CloudServer withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 云服务器当前状态信息。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CloudServer withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 云服务器所属租户ID。即项目id，与project_id表示相同的概念。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CloudServer withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 云服务器所属用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CloudServer withMarketInfo(MarketModel marketInfo) {
        this.marketInfo = marketInfo;
        return this;
    }

    public CloudServer withMarketInfo(Consumer<MarketModel> marketInfoSetter) {
        if (this.marketInfo == null) {
            this.marketInfo = new MarketModel();
            marketInfoSetter.accept(this.marketInfo);
        }

        return this;
    }

    /**
     * Get marketInfo
     * @return marketInfo
     */
    public MarketModel getMarketInfo() {
        return marketInfo;
    }

    public void setMarketInfo(MarketModel marketInfo) {
        this.marketInfo = marketInfo;
    }

    public CloudServer withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CloudServer withVmState(String vmState) {
        this.vmState = vmState;
        return this;
    }

    /**
     * 云服务器的状态。
     * @return vmState
     */
    public String getVmState() {
        return vmState;
    }

    public void setVmState(String vmState) {
        this.vmState = vmState;
    }

    public CloudServer withTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * 云服务器任务状态。
     * @return taskState
     */
    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public CloudServer withPowerState(Integer powerState) {
        this.powerState = powerState;
        return this;
    }

    /**
     * 云服务器电源状态。
     * @return powerState
     */
    public Integer getPowerState() {
        return powerState;
    }

    public void setPowerState(Integer powerState) {
        this.powerState = powerState;
    }

    public CloudServer withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 云服务器创建时间。 时间格式例如：2020-05-22T07:48:53Z。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CloudServer withInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
        return this;
    }

    /**
     * 云服务器是否处于回收站中
     * @return inRecycleBin
     */
    public Boolean getInRecycleBin() {
        return inRecycleBin;
    }

    public void setInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
    }

    public CloudServer withSpodId(String spodId) {
        this.spodId = spodId;
        return this;
    }

    /**
     * 共池裸机按整机柜发放的同一批次的批创ID
     * @return spodId
     */
    public String getSpodId() {
        return spodId;
    }

    public void setSpodId(String spodId) {
        this.spodId = spodId;
    }

    public CloudServer withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 云服务器上一次更新时间。时间格式例如：2020-05-22T07:48:53Z
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public CloudServer withLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
        return this;
    }

    /**
     * 云服务器启动时间。时间格式例如：2020-05-22T07:48:53.000000。
     * @return launchedAt
     */
    public String getLaunchedAt() {
        return launchedAt;
    }

    public void setLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
    }

    public CloudServer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 云服务器的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CloudServer withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 云服务器使用的密钥对名称。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public CloudServer withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 云服务器是否为锁定状态。  true：锁定 false：未锁定
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public CloudServer withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }

    /**
     * 云服务器系统盘的设备名称，例如当系统盘的磁盘模式是VDB时，为/dev/vda。
     * @return rootDeviceName
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }

    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }

    public CloudServer withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * 在专属主机或共享池中创建云服务器。默认为在共享池创建。值为： shared或dedicated。  shared：表示共享池。 dedicated:表示专属主机。
     * @return tenancy
     */
    public String getTenancy() {
        return tenancy;
    }

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    public CloudServer withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    /**
     * 专属主机ID。此属性仅在tenancy值为dedicated时有效，不指定此属性，系统将自动分配租户可自动放置云服务器的专属主机。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public CloudServer withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 查询绑定某个企业项目的云服务器。 若需要查询当前用户所有企业项目绑定的云服务，请传参all_granted_eps。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CloudServer withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public CloudServer putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public CloudServer withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 云服务器元数据。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public CloudServer withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CloudServer addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CloudServer withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 云服务器的标签列表。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CloudServer withAddresses(Map<String, List<NetworkAddresses>> addresses) {
        this.addresses = addresses;
        return this;
    }

    public CloudServer putAddressesItem(String key, List<NetworkAddresses> addressesItem) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        this.addresses.put(key, addressesItem);
        return this;
    }

    public CloudServer withAddresses(Consumer<Map<String, List<NetworkAddresses>>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 云服务器对应的网络地址信息。
     * @return addresses
     */
    public Map<String, List<NetworkAddresses>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<NetworkAddresses>> addresses) {
        this.addresses = addresses;
    }

    public CloudServer withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CloudServer addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CloudServer withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 云服务器的安全组信息。
     * @return securityGroups
     */
    public List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public CloudServer withVolumesAttached(List<VolumeAttach> volumesAttached) {
        this.volumesAttached = volumesAttached;
        return this;
    }

    public CloudServer addVolumesAttachedItem(VolumeAttach volumesAttachedItem) {
        if (this.volumesAttached == null) {
            this.volumesAttached = new ArrayList<>();
        }
        this.volumesAttached.add(volumesAttachedItem);
        return this;
    }

    public CloudServer withVolumesAttached(Consumer<List<VolumeAttach>> volumesAttachedSetter) {
        if (this.volumesAttached == null) {
            this.volumesAttached = new ArrayList<>();
        }
        volumesAttachedSetter.accept(this.volumesAttached);
        return this;
    }

    /**
     * 云服务器挂载磁盘信息。
     * @return volumesAttached
     */
    public List<VolumeAttach> getVolumesAttached() {
        return volumesAttached;
    }

    public void setVolumesAttached(List<VolumeAttach> volumesAttached) {
        this.volumesAttached = volumesAttached;
    }

    public CloudServer withImage(Image image) {
        this.image = image;
        return this;
    }

    public CloudServer withImage(Consumer<Image> imageSetter) {
        if (this.image == null) {
            this.image = new Image();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public CloudServer withFlavor(FlavorQuasar flavor) {
        this.flavor = flavor;
        return this;
    }

    public CloudServer withFlavor(Consumer<FlavorQuasar> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new FlavorQuasar();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public FlavorQuasar getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorQuasar flavor) {
        this.flavor = flavor;
    }

    public CloudServer withFault(Fault fault) {
        this.fault = fault;
        return this;
    }

    public CloudServer withFault(Consumer<Fault> faultSetter) {
        if (this.fault == null) {
            this.fault = new Fault();
            faultSetter.accept(this.fault);
        }

        return this;
    }

    /**
     * Get fault
     * @return fault
     */
    public Fault getFault() {
        return fault;
    }

    public void setFault(Fault fault) {
        this.fault = fault;
    }

    public CloudServer withCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }

    public CloudServer withCpuOptions(Consumer<CpuOptions> cpuOptionsSetter) {
        if (this.cpuOptions == null) {
            this.cpuOptions = new CpuOptions();
            cpuOptionsSetter.accept(this.cpuOptions);
        }

        return this;
    }

    /**
     * Get cpuOptions
     * @return cpuOptions
     */
    public CpuOptions getCpuOptions() {
        return cpuOptions;
    }

    public void setCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudServer that = (CloudServer) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.marketInfo, that.marketInfo)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.vmState, that.vmState) && Objects.equals(this.taskState, that.taskState)
            && Objects.equals(this.powerState, that.powerState) && Objects.equals(this.created, that.created)
            && Objects.equals(this.inRecycleBin, that.inRecycleBin) && Objects.equals(this.spodId, that.spodId)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.launchedAt, that.launchedAt)
            && Objects.equals(this.description, that.description) && Objects.equals(this.keyName, that.keyName)
            && Objects.equals(this.locked, that.locked) && Objects.equals(this.rootDeviceName, that.rootDeviceName)
            && Objects.equals(this.tenancy, that.tenancy) && Objects.equals(this.dedicatedHostId, that.dedicatedHostId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.addresses, that.addresses)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.volumesAttached, that.volumesAttached) && Objects.equals(this.image, that.image)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.fault, that.fault)
            && Objects.equals(this.cpuOptions, that.cpuOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            tenantId,
            userId,
            marketInfo,
            availabilityZone,
            vmState,
            taskState,
            powerState,
            created,
            inRecycleBin,
            spodId,
            updated,
            launchedAt,
            description,
            keyName,
            locked,
            rootDeviceName,
            tenancy,
            dedicatedHostId,
            enterpriseProjectId,
            metadata,
            tags,
            addresses,
            securityGroups,
            volumesAttached,
            image,
            flavor,
            fault,
            cpuOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudServer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    marketInfo: ").append(toIndentedString(marketInfo)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    vmState: ").append(toIndentedString(vmState)).append("\n");
        sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
        sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    inRecycleBin: ").append(toIndentedString(inRecycleBin)).append("\n");
        sb.append("    spodId: ").append(toIndentedString(spodId)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    launchedAt: ").append(toIndentedString(launchedAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    rootDeviceName: ").append(toIndentedString(rootDeviceName)).append("\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    volumesAttached: ").append(toIndentedString(volumesAttached)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
        sb.append("    cpuOptions: ").append(toIndentedString(cpuOptions)).append("\n");
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
