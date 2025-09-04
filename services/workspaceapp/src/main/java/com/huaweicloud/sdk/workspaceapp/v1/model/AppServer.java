package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AppServer
 */
public class AppServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_name")

    private String machineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private Flavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ServerStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_status")

    private Boolean maintainStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_auto_create")

    private Boolean scalingAutoCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private JobType jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_status")

    private JobStatus jobStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_time")

    private OffsetDateTime jobTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_pool_id")

    private String resourcePoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_pool_type")

    private String resourcePoolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_name")

    private String serverGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private ProductInfo productInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_count")

    private Integer sessionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_status")

    private AppServerStatus vmStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private AppServerTaskStatus taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freeze")

    private List<CbcFreezeInfo> freeze = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_address")

    private List<EcsNetWork> hostAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsTag> tags = null;

    public AppServer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * aps实例的唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 服务器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppServer withMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    /**
     * 计算机名称。
     * @return machineName
     */
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public AppServer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppServer withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 服务器组ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public AppServer withFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public AppServer withFlavor(Consumer<Flavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new Flavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public AppServer withStatus(ServerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ServerStatus getStatus() {
        return status;
    }

    public void setStatus(ServerStatus status) {
        this.status = status;
    }

    public AppServer withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 服务器创建时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public AppServer withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public AppServer withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public AppServer withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 服务器可用分区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public AppServer withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 域。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public AppServer withOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    /**
     * 组织名称。
     * @return ouName
     */
    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public AppServer withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * 实例的SID。
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public AppServer withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例的ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AppServer withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 服务器系统版本。
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public AppServer withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，当前仅支持Windows： - Linux - Windows - Other
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public AppServer withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 包周期产品的订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public AppServer withMaintainStatus(Boolean maintainStatus) {
        this.maintainStatus = maintainStatus;
        return this;
    }

    /**
     * 是否维护状态。
     * @return maintainStatus
     */
    public Boolean getMaintainStatus() {
        return maintainStatus;
    }

    public void setMaintainStatus(Boolean maintainStatus) {
        this.maintainStatus = maintainStatus;
    }

    public AppServer withScalingAutoCreate(Boolean scalingAutoCreate) {
        this.scalingAutoCreate = scalingAutoCreate;
        return this;
    }

    /**
     * 配置弹性伸缩策略时，服务自动创建的实例。 - true : 通过弹性伸缩创建。 - false: 不是通过弹性伸缩创建。
     * @return scalingAutoCreate
     */
    public Boolean getScalingAutoCreate() {
        return scalingAutoCreate;
    }

    public void setScalingAutoCreate(Boolean scalingAutoCreate) {
        this.scalingAutoCreate = scalingAutoCreate;
    }

    public AppServer withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 上一次执行job的id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public AppServer withJobType(JobType jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get jobType
     * @return jobType
     */
    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public AppServer withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * Get jobStatus
     * @return jobStatus
     */
    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    public AppServer withJobTime(OffsetDateTime jobTime) {
        this.jobTime = jobTime;
        return this;
    }

    /**
     * 上一次执行job的执行时间。
     * @return jobTime
     */
    public OffsetDateTime getJobTime() {
        return jobTime;
    }

    public void setJobTime(OffsetDateTime jobTime) {
        this.jobTime = jobTime;
    }

    public AppServer withResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }

    /**
     * 资源池ID。
     * @return resourcePoolId
     */
    public String getResourcePoolId() {
        return resourcePoolId;
    }

    public void setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
    }

    public AppServer withResourcePoolType(String resourcePoolType) {
        this.resourcePoolType = resourcePoolType;
        return this;
    }

    /**
     * 资源池类型： - private：私有资源池。 - public: 工作资源池。
     * @return resourcePoolType
     */
    public String getResourcePoolType() {
        return resourcePoolType;
    }

    public void setResourcePoolType(String resourcePoolType) {
        this.resourcePoolType = resourcePoolType;
    }

    public AppServer withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 云专属主机id。
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public AppServer withServerGroupName(String serverGroupName) {
        this.serverGroupName = serverGroupName;
        return this;
    }

    /**
     * 服务器组名称。
     * @return serverGroupName
     */
    public String getServerGroupName() {
        return serverGroupName;
    }

    public void setServerGroupName(String serverGroupName) {
        this.serverGroupName = serverGroupName;
    }

    public AppServer withProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public AppServer withProductInfo(Consumer<ProductInfo> productInfoSetter) {
        if (this.productInfo == null) {
            this.productInfo = new ProductInfo();
            productInfoSetter.accept(this.productInfo);
        }

        return this;
    }

    /**
     * Get productInfo
     * @return productInfo
     */
    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    public AppServer withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public AppServer putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public AppServer withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * [弹性云服务器元数据。  >   1. charging_mode 云服务器的计费类型。  - “0”：按需计费（即postPaid-后付费方式）。 - “1”：按包年包月计费（即prePaid-预付费方式）。\"2\"：竞价实例计费  2. metering.order_id 按“包年/包月”计费的云服务器对应的订单ID。  3. metering.product_id 按“包年/包月”计费的云服务器对应的产品ID。  4. vpc_id 云服务器所属的虚拟私有云ID。  5. EcmResStatus 云服务器的冻结状态。  - normal：云服务器正常状态（未被冻结）。 - freeze：云服务器被冻结。  > 当云服务器被冻结或者解冻后，系统默认添加该字段，且该字段必选。  6. metering.image_id 云服务器操作系统对应的镜像ID  7.  metering.imagetype 镜像类型，目前支持：  - 公共镜像（gold） - 私有镜像（private） - 共享镜像（shared）  8. metering.resourcespeccode 云服务器对应的资源规格。  9. image_name 云服务器操作系统对应的镜像名称。  10. os_bit 操作系统位数，一般取值为“32”或者“64”。  11. lockCheckEndpoint 回调URL，用于检查弹性云服务器的加锁是否有效。  - 如果有效，则云服务器保持锁定状态。 - 如果无效，解除锁定状态，删除失效的锁。  12. lockSource 弹性云服务器来自哪个服务。订单加锁（ORDER）  13. lockSourceId 弹性云服务器的加锁来自哪个ID。lockSource为“ORDER”时，lockSourceId为订单ID。  14. lockScene 弹性云服务器的加锁类型。  - 按需转包周期（TO_PERIOD_LOCK）  15. virtual_env_type  - IOS镜像创建虚拟机，\"virtual_env_type\": \"IsoImage\" 属性； - 非IOS镜像创建虚拟机，在19.5.0版本以后创建的虚拟机将不会添加virtual_env_type 属性，而在此之前的版本创建的虚拟机可能会返回\"virtual_env_type\": \"FusionCompute\"属性 。  > virtual_env_type属性不允许用户增加、删除和修改。  16. metering.resourcetype 云服务器对应的资源类型。  17. os_type 操作系统类型，取值为：Linux、Windows。  18. cascaded.instance_extrainfo 系统内部虚拟机扩展信息。  19. __support_agent_list 云服务器是否支持企业主机安全、主机监控。  - “hss”：企业主机安全 -  “ces”：主机监控  20. agency_name 委托的名称。  委托是由租户管理员在统一身份认证服务（Identity and Access Management，IAM）上创建的，可以为弹性云服务器提供访问云服务的临时凭证。](tag:HW) [弹性云服务器元数据。  >   1. vpc_id 云服务器所属的虚拟私有云ID。  2. EcmResStatus 云服务器的冻结状态。  - normal：云服务器正常状态（未被冻结）。 - freeze：云服务器被冻结。  > 当云服务器被冻结或者解冻后，系统默认添加该字段，且该字段必选。  3. metering.image_id 云服务器操作系统对应的镜像ID  4.  metering.imagetype 镜像类型，目前支持：  - 公共镜像（gold） - 私有镜像（private） - 共享镜像（shared）  5. metering.resourcespeccode 云服务器对应的资源规格。  6. image_name 云服务器操作系统对应的镜像名称。  7. os_bit 操作系统位数，一般取值为“32”或者“64”。  8. lockCheckEndpoint 回调URL，用于检查弹性云服务器的加锁是否有效。  - 如果有效，则云服务器保持锁定状态。 - 如果无效，解除锁定状态，删除失效的锁。  9. lockSource 弹性云服务器来自哪个服务。  10. lockSourceId 弹性云服务器的加锁来自哪个ID。  11. lockScene 弹性云服务器的加锁类型。  12. virtual_env_type  - IOS镜像创建虚拟机，\"virtual_env_type\": \"IsoImage\" 属性； - 非IOS镜像创建虚拟机，在19.5.0版本以后创建的虚拟机将不会添加virtual_env_type 属性，而在此之前的版本创建的虚拟机可能会返回\"virtual_env_type\": \"FusionCompute\"属性 。  > virtual_env_type属性不允许用户增加、删除和修改。  13. metering.resourcetype 云服务器对应的资源类型。  14. os_type 操作系统类型，取值为：Linux、Windows。  15. cascaded.instance_extrainfo 系统内部虚拟机扩展信息。  16. __support_agent_list 云服务器是否支持企业主机安全、主机监控。  - “hss”：企业主机安全 -  “ces”：主机监控  27. agency_name 委托的名称。  委托是由租户管理员在统一身份认证服务（Identity and Access Management，IAM）上创建的，可以为弹性云服务器提供访问云服务的临时凭证。](tag:HCS)
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public AppServer withSessionCount(Integer sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }

    /**
     * 会话数量。
     * @return sessionCount
     */
    public Integer getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(Integer sessionCount) {
        this.sessionCount = sessionCount;
    }

    public AppServer withVmStatus(AppServerStatus vmStatus) {
        this.vmStatus = vmStatus;
        return this;
    }

    /**
     * Get vmStatus
     * @return vmStatus
     */
    public AppServerStatus getVmStatus() {
        return vmStatus;
    }

    public void setVmStatus(AppServerStatus vmStatus) {
        this.vmStatus = vmStatus;
    }

    public AppServer withTaskStatus(AppServerTaskStatus taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * Get taskStatus
     * @return taskStatus
     */
    public AppServerTaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(AppServerTaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public AppServer withFreeze(List<CbcFreezeInfo> freeze) {
        this.freeze = freeze;
        return this;
    }

    public AppServer addFreezeItem(CbcFreezeInfo freezeItem) {
        if (this.freeze == null) {
            this.freeze = new ArrayList<>();
        }
        this.freeze.add(freezeItem);
        return this;
    }

    public AppServer withFreeze(Consumer<List<CbcFreezeInfo>> freezeSetter) {
        if (this.freeze == null) {
            this.freeze = new ArrayList<>();
        }
        freezeSetter.accept(this.freeze);
        return this;
    }

    /**
     * 冻结信息。
     * @return freeze
     */
    public List<CbcFreezeInfo> getFreeze() {
        return freeze;
    }

    public void setFreeze(List<CbcFreezeInfo> freeze) {
        this.freeze = freeze;
    }

    public AppServer withHostAddress(List<EcsNetWork> hostAddress) {
        this.hostAddress = hostAddress;
        return this;
    }

    public AppServer addHostAddressItem(EcsNetWork hostAddressItem) {
        if (this.hostAddress == null) {
            this.hostAddress = new ArrayList<>();
        }
        this.hostAddress.add(hostAddressItem);
        return this;
    }

    public AppServer withHostAddress(Consumer<List<EcsNetWork>> hostAddressSetter) {
        if (this.hostAddress == null) {
            this.hostAddress = new ArrayList<>();
        }
        hostAddressSetter.accept(this.hostAddress);
        return this;
    }

    /**
     * vpc和子网信息。
     * @return hostAddress
     */
    public List<EcsNetWork> getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(List<EcsNetWork> hostAddress) {
        this.hostAddress = hostAddress;
    }

    public AppServer withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID,仅企业项目会返回。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public AppServer withTags(List<TmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public AppServer addTagsItem(TmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public AppServer withTags(Consumer<List<TmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息。
     * @return tags
     */
    public List<TmsTag> getTags() {
        return tags;
    }

    public void setTags(List<TmsTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppServer that = (AppServer) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.machineName, that.machineName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.serverGroupId, that.serverGroupId) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.ouName, that.ouName) && Objects.equals(this.sid, that.sid)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.osVersion, that.osVersion)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.maintainStatus, that.maintainStatus)
            && Objects.equals(this.scalingAutoCreate, that.scalingAutoCreate) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.jobStatus, that.jobStatus)
            && Objects.equals(this.jobTime, that.jobTime) && Objects.equals(this.resourcePoolId, that.resourcePoolId)
            && Objects.equals(this.resourcePoolType, that.resourcePoolType) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.serverGroupName, that.serverGroupName)
            && Objects.equals(this.productInfo, that.productInfo) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.sessionCount, that.sessionCount) && Objects.equals(this.vmStatus, that.vmStatus)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.freeze, that.freeze)
            && Objects.equals(this.hostAddress, that.hostAddress)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            machineName,
            description,
            serverGroupId,
            flavor,
            status,
            createTime,
            updateTime,
            imageId,
            availabilityZone,
            domain,
            ouName,
            sid,
            instanceId,
            osVersion,
            osType,
            orderId,
            maintainStatus,
            scalingAutoCreate,
            jobId,
            jobType,
            jobStatus,
            jobTime,
            resourcePoolId,
            resourcePoolType,
            hostId,
            serverGroupName,
            productInfo,
            metadata,
            sessionCount,
            vmStatus,
            taskStatus,
            freeze,
            hostAddress,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppServer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    maintainStatus: ").append(toIndentedString(maintainStatus)).append("\n");
        sb.append("    scalingAutoCreate: ").append(toIndentedString(scalingAutoCreate)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
        sb.append("    jobTime: ").append(toIndentedString(jobTime)).append("\n");
        sb.append("    resourcePoolId: ").append(toIndentedString(resourcePoolId)).append("\n");
        sb.append("    resourcePoolType: ").append(toIndentedString(resourcePoolType)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    serverGroupName: ").append(toIndentedString(serverGroupName)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
        sb.append("    vmStatus: ").append(toIndentedString(vmStatus)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    freeze: ").append(toIndentedString(freeze)).append("\n");
        sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
