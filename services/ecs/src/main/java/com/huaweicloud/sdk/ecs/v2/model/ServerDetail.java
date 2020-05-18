package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.ServerAddress;
import com.huaweicloud.sdk.ecs.v2.model.ServerExtendVolumeAttachment;
import com.huaweicloud.sdk.ecs.v2.model.ServerFault;
import com.huaweicloud.sdk.ecs.v2.model.ServerFlavor;
import com.huaweicloud.sdk.ecs.v2.model.ServerImage;
import com.huaweicloud.sdk.ecs.v2.model.ServerSchedulerHints;
import com.huaweicloud.sdk.ecs.v2.model.ServerSecurityGroup;
import com.huaweicloud.sdk.ecs.v2.model.ServerSystemTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 云服务器详情。
 */
public class ServerDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostId")
    
    private String hostId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:host")
    
    private String osEXTSRVATTRHost;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addresses")
    
    private Map<String, List<ServerAddress>> addresses = new HashMap<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_name")
    
    private String keyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image")
    
    private ServerImage image = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-STS:task_state")
    
    private String osEXTSTSTaskState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-STS:vm_state")
    
    private String osEXTSTSVmState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:instance_name")
    
    private String osEXTSRVATTRInstanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:hypervisor_hostname")
    
    private String osEXTSRVATTRHypervisorHostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private ServerFlavor flavor = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<ServerSecurityGroup> securityGroups = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-AZ:availability_zone")
    
    private String osEXTAZAvailabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-DCF:diskConfig")
    
    private String osDCFDiskConfig;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessIPv4")
    
    private String accessIPv4;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessIPv6")
    
    private String accessIPv6;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fault")
    
    private ServerFault fault = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="progress")
    
    private Integer progress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-STS:power_state")
    
    private Integer osEXTSTSPowerState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_drive")
    
    private String configDrive;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private Map<String, String> metadata = new HashMap<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-SRV-USG:launched_at")
    
    private String osSRVUSGLaunchedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-SRV-USG:terminated_at")
    
    private String osSRVUSGTerminatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-extended-volumes:volumes_attached")
    
    private List<ServerExtendVolumeAttachment> osExtendedVolumesVolumesAttached = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_status")
    
    private String hostStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:hostname")
    
    private String osEXTSRVATTRHostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:reservation_id")
    
    private String osEXTSRVATTRReservationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:launch_index")
    
    private Integer osEXTSRVATTRLaunchIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:kernel_id")
    
    private String osEXTSRVATTRKernelId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:ramdisk_id")
    
    private String osEXTSRVATTRRamdiskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:root_device_name")
    
    private String osEXTSRVATTRRootDeviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:user_data")
    
    private String osEXTSRVATTRUserData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="locked")
    
    private Boolean locked;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os:scheduler_hints")
    
    private ServerSchedulerHints osSchedulerHints = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    private List<ServerSystemTag> sysTags = null;
    
    public ServerDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 弹性云服务器状态。  取值范围：  ACTIVE、BUILD、DELETED、ERROR、HARD_REBOOT、MIGRATING、PAUSED、REBOOT、REBUILD、RESIZE、REVERT_RESIZE、SHUTOFF、SHELVED、SHELVED_OFFLOADED、SOFT_DELETED、SUSPENDED、VERIFY_RESIZE
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServerDetail withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 弹性云服务器更新时间。  时间格式例如：2019-05-22T03:30:52Z
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ServerDetail withHostId(String hostId) {
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

    public ServerDetail withOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
        return this;
    }

    


    /**
     * 弹性云服务器所在主机的主机名称。
     * @return osEXTSRVATTRHost
     */
    public String getOsEXTSRVATTRHost() {
        return osEXTSRVATTRHost;
    }

    public void setOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
    }

    public ServerDetail withAddresses(Map<String, List<ServerAddress>> addresses) {
        this.addresses = addresses;
        return this;
    }

    

    public ServerDetail putAddressesItem(String key, List<ServerAddress> addressesItem) {
        this.addresses.put(key, addressesItem);
        return this;
    }

    public ServerDetail withAddresses(Consumer<Map<String, List<ServerAddress>>> addressesSetter) {
        if(this.addresses == null ){
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }
    /**
     * 弹性云服务器的网络属性。
     * @return addresses
     */
    public Map<String, List<ServerAddress>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<ServerAddress>> addresses) {
        this.addresses = addresses;
    }

    public ServerDetail withKeyName(String keyName) {
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

    public ServerDetail withImage(ServerImage image) {
        this.image = image;
        return this;
    }

    public ServerDetail withImage(Consumer<ServerImage> imageSetter) {
        if(this.image == null ){
            this.image = new ServerImage();
        }
        imageSetter.accept(this.image);
        return this;
    }


    /**
     * Get image
     * @return image
     */
    public ServerImage getImage() {
        return image;
    }

    public void setImage(ServerImage image) {
        this.image = image;
    }

    public ServerDetail withOsEXTSTSTaskState(String osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
        return this;
    }

    


    /**
     * 扩展属性，弹性云服务器当前任务的状态。
     * @return osEXTSTSTaskState
     */
    public String getOsEXTSTSTaskState() {
        return osEXTSTSTaskState;
    }

    public void setOsEXTSTSTaskState(String osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
    }

    public ServerDetail withOsEXTSTSVmState(String osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
        return this;
    }

    


    /**
     * 扩展属性，弹性云服务器当前状态。
     * @return osEXTSTSVmState
     */
    public String getOsEXTSTSVmState() {
        return osEXTSTSVmState;
    }

    public void setOsEXTSTSVmState(String osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
    }

    public ServerDetail withOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
        return this;
    }

    


    /**
     * 扩展属性，弹性云服务器别名。
     * @return osEXTSRVATTRInstanceName
     */
    public String getOsEXTSRVATTRInstanceName() {
        return osEXTSRVATTRInstanceName;
    }

    public void setOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
    }

    public ServerDetail withOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
        return this;
    }

    


    /**
     * 扩展属性，弹性云服务器所在虚拟化主机名。
     * @return osEXTSRVATTRHypervisorHostname
     */
    public String getOsEXTSRVATTRHypervisorHostname() {
        return osEXTSRVATTRHypervisorHostname;
    }

    public void setOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
    }

    public ServerDetail withFlavor(ServerFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public ServerDetail withFlavor(Consumer<ServerFlavor> flavorSetter) {
        if(this.flavor == null ){
            this.flavor = new ServerFlavor();
        }
        flavorSetter.accept(this.flavor);
        return this;
    }


    /**
     * Get flavor
     * @return flavor
     */
    public ServerFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(ServerFlavor flavor) {
        this.flavor = flavor;
    }

    public ServerDetail withId(String id) {
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

    public ServerDetail withSecurityGroups(List<ServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public ServerDetail addSecurityGroupsItem(ServerSecurityGroup securityGroupsItem) {
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public ServerDetail withSecurityGroups(Consumer<List<ServerSecurityGroup>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 弹性云服务器所属安全组列表。
     * @return securityGroups
     */
    public List<ServerSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<ServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public ServerDetail withOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
        return this;
    }

    


    /**
     * 扩展属性，弹性云服务器所在可用区名称。
     * @return osEXTAZAvailabilityZone
     */
    public String getOsEXTAZAvailabilityZone() {
        return osEXTAZAvailabilityZone;
    }

    public void setOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
    }

    public ServerDetail withUserId(String userId) {
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

    public ServerDetail withName(String name) {
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

    public ServerDetail withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 弹性云服务器创建时间。  时间格式例如：2019-05-22T03:19:19Z
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ServerDetail withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 弹性云服务器所属租户ID，即项目id，和project_id表示相同的概念，格式为UUID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ServerDetail withOsDCFDiskConfig(String osDCFDiskConfig) {
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

    public ServerDetail withAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
        return this;
    }

    


    /**
     * 预留属性。
     * @return accessIPv4
     */
    public String getAccessIPv4() {
        return accessIPv4;
    }

    public void setAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
    }

    public ServerDetail withAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
        return this;
    }

    


    /**
     * 预留属性。
     * @return accessIPv6
     */
    public String getAccessIPv6() {
        return accessIPv6;
    }

    public void setAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
    }

    public ServerDetail withFault(ServerFault fault) {
        this.fault = fault;
        return this;
    }

    public ServerDetail withFault(Consumer<ServerFault> faultSetter) {
        if(this.fault == null ){
            this.fault = new ServerFault();
        }
        faultSetter.accept(this.fault);
        return this;
    }


    /**
     * Get fault
     * @return fault
     */
    public ServerFault getFault() {
        return fault;
    }

    public void setFault(ServerFault fault) {
        this.fault = fault;
    }

    public ServerDetail withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    


    /**
     * 弹性云服务器进度。
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ServerDetail withOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
        return this;
    }

    


    /**
     * 扩展属性，弹性云服务器电源状态。
     * @return osEXTSTSPowerState
     */
    public Integer getOsEXTSTSPowerState() {
        return osEXTSTSPowerState;
    }

    public void setOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
    }

    public ServerDetail withConfigDrive(String configDrive) {
        this.configDrive = configDrive;
        return this;
    }

    


    /**
     * config drive信息。
     * @return configDrive
     */
    public String getConfigDrive() {
        return configDrive;
    }

    public void setConfigDrive(String configDrive) {
        this.configDrive = configDrive;
    }

    public ServerDetail withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    

    public ServerDetail putMetadataItem(String key, String metadataItem) {
        this.metadata.put(key, metadataItem);
        return this;
    }

    public ServerDetail withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }
    /**
     * 弹性云服务器元数据。  > 说明： >  > 元数据包含系统默认添加字段和用户设置的字段。  系统默认添加字段  1. charging_mode 云服务器的计费类型。  - “0”：按需计费（即postPaid-后付费方式）。 - “1”：按包年包月计费（即prePaid-预付费方式）。\"2\"：竞价实例计费  2. metering.order_id 按“包年/包月”计费的云服务器对应的订单ID。  3. metering.product_id 按“包年/包月”计费的云服务器对应的产品ID。  4. vpc_id 云服务器所属的虚拟私有云ID。  5. EcmResStatus 云服务器的冻结状态。  - normal：云服务器正常状态（未被冻结）。 - freeze：云服务器被冻结。  > 当云服务器被冻结或者解冻后，系统默认添加该字段，且该字段必选。  6. metering.image_id 云服务器操作系统对应的镜像ID  7.  metering.imagetype 镜像类型，目前支持：  - 公共镜像（gold） - 私有镜像（private） - 共享镜像（shared）  8. metering.resourcespeccode 云服务器对应的资源规格。  9. image_name 云服务器操作系统对应的镜像名称。  10. os_bit 操作系统位数，一般取值为“32”或者“64”。  11. lockCheckEndpoint 回调URL，用于检查弹性云服务器的加锁是否有效。  - 如果有效，则云服务器保持锁定状态。 - 如果无效，解除锁定状态，删除失效的锁。  12. lockSource 弹性云服务器来自哪个服务。订单加锁（ORDER）  13. lockSourceId 弹性云服务器的加锁来自哪个ID。lockSource为“ORDER”时，lockSourceId为订单ID。  14. lockScene 弹性云服务器的加锁类型。  - 按需转包周期（TO_PERIOD_LOCK）  15. virtual_env_type  - IOS镜像创建虚拟机，\"virtual_env_type\": \"IsoImage\" 属性； - 非IOS镜像创建虚拟机，在19.5.0版本以后创建的虚拟机将不会添加virtual_env_type 属性，而在此之前的版本创建的虚拟机可能会返回\"virtual_env_type\": \"FusionCompute\"属性 。  > virtual_env_type属性不允许用户增加、删除和修改。  16. metering.resourcetype 云服务器对应的资源类型。  17. os_type 操作系统类型，取值为：Linux、Windows。  18. cascaded.instance_extrainfo 系统内部虚拟机扩展信息。  19. __support_agent_list 云服务器是否支持企业主机安全、主机监控。  - “hss”：企业主机安全 -  “ces”：主机监控  20. agency_name 委托的名称。  委托是由租户管理员在统一身份认证服务（Identity and Access Management，IAM）上创建的，可以为弹性云服务器提供访问云服务的临时凭证。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public ServerDetail withOsSRVUSGLaunchedAt(String osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
        return this;
    }

    


    /**
     * 弹性云服务器启动时间。时间格式例如：2019-05-22T03:23:59.000000
     * @return osSRVUSGLaunchedAt
     */
    public String getOsSRVUSGLaunchedAt() {
        return osSRVUSGLaunchedAt;
    }

    public void setOsSRVUSGLaunchedAt(String osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
    }

    public ServerDetail withOsSRVUSGTerminatedAt(String osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
        return this;
    }

    


    /**
     * 弹性云服务器删除时间。  时间格式例如：2019-05-22T03:23:59.000000
     * @return osSRVUSGTerminatedAt
     */
    public String getOsSRVUSGTerminatedAt() {
        return osSRVUSGTerminatedAt;
    }

    public void setOsSRVUSGTerminatedAt(String osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
    }

    public ServerDetail withOsExtendedVolumesVolumesAttached(List<ServerExtendVolumeAttachment> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
        return this;
    }

    
    public ServerDetail addOsExtendedVolumesVolumesAttachedItem(ServerExtendVolumeAttachment osExtendedVolumesVolumesAttachedItem) {
        this.osExtendedVolumesVolumesAttached.add(osExtendedVolumesVolumesAttachedItem);
        return this;
    }

    public ServerDetail withOsExtendedVolumesVolumesAttached(Consumer<List<ServerExtendVolumeAttachment>> osExtendedVolumesVolumesAttachedSetter) {
        if(this.osExtendedVolumesVolumesAttached == null ){
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        osExtendedVolumesVolumesAttachedSetter.accept(this.osExtendedVolumesVolumesAttached);
        return this;
    }

    /**
     * 挂载到弹性云服务器上的磁盘。
     * @return osExtendedVolumesVolumesAttached
     */
    public List<ServerExtendVolumeAttachment> getOsExtendedVolumesVolumesAttached() {
        return osExtendedVolumesVolumesAttached;
    }

    public void setOsExtendedVolumesVolumesAttached(List<ServerExtendVolumeAttachment> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
    }

    public ServerDetail withDescription(String description) {
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

    public ServerDetail withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    


    /**
     * nova-compute状态。  - UP：服务正常 - UNKNOWN：状态未知 - DOWN：服务异常 - MAINTENANCE：维护状态 - 空字符串：弹性云服务器无主机信息
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public ServerDetail withOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
        return this;
    }

    


    /**
     * 弹性云服务器的主机名。
     * @return osEXTSRVATTRHostname
     */
    public String getOsEXTSRVATTRHostname() {
        return osEXTSRVATTRHostname;
    }

    public void setOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
    }

    public ServerDetail withOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
        return this;
    }

    


    /**
     * 批量创建场景，弹性云服务器的预留ID。
     * @return osEXTSRVATTRReservationId
     */
    public String getOsEXTSRVATTRReservationId() {
        return osEXTSRVATTRReservationId;
    }

    public void setOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
    }

    public ServerDetail withOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
        return this;
    }

    


    /**
     * 批量创建场景，弹性云服务器的启动顺序。
     * @return osEXTSRVATTRLaunchIndex
     */
    public Integer getOsEXTSRVATTRLaunchIndex() {
        return osEXTSRVATTRLaunchIndex;
    }

    public void setOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
    }

    public ServerDetail withOsEXTSRVATTRKernelId(String osEXTSRVATTRKernelId) {
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

    public ServerDetail withOsEXTSRVATTRRamdiskId(String osEXTSRVATTRRamdiskId) {
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

    public ServerDetail withOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
        return this;
    }

    


    /**
     * 弹性云服务器系统盘的设备名称。
     * @return osEXTSRVATTRRootDeviceName
     */
    public String getOsEXTSRVATTRRootDeviceName() {
        return osEXTSRVATTRRootDeviceName;
    }

    public void setOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
    }

    public ServerDetail withOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
        return this;
    }

    


    /**
     * 创建弹性云服务器时指定的user_data。
     * @return osEXTSRVATTRUserData
     */
    public String getOsEXTSRVATTRUserData() {
        return osEXTSRVATTRUserData;
    }

    public void setOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
    }

    public ServerDetail withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    


    /**
     * 弹性云服务器是否为锁定状态。  - true：锁定 - false：未锁定
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public ServerDetail withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public ServerDetail addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ServerDetail withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 弹性云服务器标签。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ServerDetail withOsSchedulerHints(ServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
        return this;
    }

    public ServerDetail withOsSchedulerHints(Consumer<ServerSchedulerHints> osSchedulerHintsSetter) {
        if(this.osSchedulerHints == null ){
            this.osSchedulerHints = new ServerSchedulerHints();
        }
        osSchedulerHintsSetter.accept(this.osSchedulerHints);
        return this;
    }


    /**
     * Get osSchedulerHints
     * @return osSchedulerHints
     */
    public ServerSchedulerHints getOsSchedulerHints() {
        return osSchedulerHints;
    }

    public void setOsSchedulerHints(ServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
    }

    public ServerDetail withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ServerDetail withSysTags(List<ServerSystemTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    
    public ServerDetail addSysTagsItem(ServerSystemTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ServerDetail withSysTags(Consumer<List<ServerSystemTag>> sysTagsSetter) {
        if(this.sysTags == null ){
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 弹性云服务器系统标签。
     * @return sysTags
     */
    public List<ServerSystemTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<ServerSystemTag> sysTags) {
        this.sysTags = sysTags;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServerDetail serverDetail = (ServerDetail) o;
        return Objects.equals(this.status, serverDetail.status) &&
            Objects.equals(this.updated, serverDetail.updated) &&
            Objects.equals(this.hostId, serverDetail.hostId) &&
            Objects.equals(this.osEXTSRVATTRHost, serverDetail.osEXTSRVATTRHost) &&
            Objects.equals(this.addresses, serverDetail.addresses) &&
            Objects.equals(this.keyName, serverDetail.keyName) &&
            Objects.equals(this.image, serverDetail.image) &&
            Objects.equals(this.osEXTSTSTaskState, serverDetail.osEXTSTSTaskState) &&
            Objects.equals(this.osEXTSTSVmState, serverDetail.osEXTSTSVmState) &&
            Objects.equals(this.osEXTSRVATTRInstanceName, serverDetail.osEXTSRVATTRInstanceName) &&
            Objects.equals(this.osEXTSRVATTRHypervisorHostname, serverDetail.osEXTSRVATTRHypervisorHostname) &&
            Objects.equals(this.flavor, serverDetail.flavor) &&
            Objects.equals(this.id, serverDetail.id) &&
            Objects.equals(this.securityGroups, serverDetail.securityGroups) &&
            Objects.equals(this.osEXTAZAvailabilityZone, serverDetail.osEXTAZAvailabilityZone) &&
            Objects.equals(this.userId, serverDetail.userId) &&
            Objects.equals(this.name, serverDetail.name) &&
            Objects.equals(this.created, serverDetail.created) &&
            Objects.equals(this.tenantId, serverDetail.tenantId) &&
            Objects.equals(this.osDCFDiskConfig, serverDetail.osDCFDiskConfig) &&
            Objects.equals(this.accessIPv4, serverDetail.accessIPv4) &&
            Objects.equals(this.accessIPv6, serverDetail.accessIPv6) &&
            Objects.equals(this.fault, serverDetail.fault) &&
            Objects.equals(this.progress, serverDetail.progress) &&
            Objects.equals(this.osEXTSTSPowerState, serverDetail.osEXTSTSPowerState) &&
            Objects.equals(this.configDrive, serverDetail.configDrive) &&
            Objects.equals(this.metadata, serverDetail.metadata) &&
            Objects.equals(this.osSRVUSGLaunchedAt, serverDetail.osSRVUSGLaunchedAt) &&
            Objects.equals(this.osSRVUSGTerminatedAt, serverDetail.osSRVUSGTerminatedAt) &&
            Objects.equals(this.osExtendedVolumesVolumesAttached, serverDetail.osExtendedVolumesVolumesAttached) &&
            Objects.equals(this.description, serverDetail.description) &&
            Objects.equals(this.hostStatus, serverDetail.hostStatus) &&
            Objects.equals(this.osEXTSRVATTRHostname, serverDetail.osEXTSRVATTRHostname) &&
            Objects.equals(this.osEXTSRVATTRReservationId, serverDetail.osEXTSRVATTRReservationId) &&
            Objects.equals(this.osEXTSRVATTRLaunchIndex, serverDetail.osEXTSRVATTRLaunchIndex) &&
            Objects.equals(this.osEXTSRVATTRKernelId, serverDetail.osEXTSRVATTRKernelId) &&
            Objects.equals(this.osEXTSRVATTRRamdiskId, serverDetail.osEXTSRVATTRRamdiskId) &&
            Objects.equals(this.osEXTSRVATTRRootDeviceName, serverDetail.osEXTSRVATTRRootDeviceName) &&
            Objects.equals(this.osEXTSRVATTRUserData, serverDetail.osEXTSRVATTRUserData) &&
            Objects.equals(this.locked, serverDetail.locked) &&
            Objects.equals(this.tags, serverDetail.tags) &&
            Objects.equals(this.osSchedulerHints, serverDetail.osSchedulerHints) &&
            Objects.equals(this.enterpriseProjectId, serverDetail.enterpriseProjectId) &&
            Objects.equals(this.sysTags, serverDetail.sysTags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, updated, hostId, osEXTSRVATTRHost, addresses, keyName, image, osEXTSTSTaskState, osEXTSTSVmState, osEXTSRVATTRInstanceName, osEXTSRVATTRHypervisorHostname, flavor, id, securityGroups, osEXTAZAvailabilityZone, userId, name, created, tenantId, osDCFDiskConfig, accessIPv4, accessIPv6, fault, progress, osEXTSTSPowerState, configDrive, metadata, osSRVUSGLaunchedAt, osSRVUSGTerminatedAt, osExtendedVolumesVolumesAttached, description, hostStatus, osEXTSRVATTRHostname, osEXTSRVATTRReservationId, osEXTSRVATTRLaunchIndex, osEXTSRVATTRKernelId, osEXTSRVATTRRamdiskId, osEXTSRVATTRRootDeviceName, osEXTSRVATTRUserData, locked, tags, osSchedulerHints, enterpriseProjectId, sysTags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerDetail {\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
            sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
            sb.append("    osEXTSRVATTRHost: ").append(toIndentedString(osEXTSRVATTRHost)).append("\n");
            sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
            sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
            sb.append("    image: ").append(toIndentedString(image)).append("\n");
            sb.append("    osEXTSTSTaskState: ").append(toIndentedString(osEXTSTSTaskState)).append("\n");
            sb.append("    osEXTSTSVmState: ").append(toIndentedString(osEXTSTSVmState)).append("\n");
            sb.append("    osEXTSRVATTRInstanceName: ").append(toIndentedString(osEXTSRVATTRInstanceName)).append("\n");
            sb.append("    osEXTSRVATTRHypervisorHostname: ").append(toIndentedString(osEXTSRVATTRHypervisorHostname)).append("\n");
            sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
            sb.append("    osEXTAZAvailabilityZone: ").append(toIndentedString(osEXTAZAvailabilityZone)).append("\n");
            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    created: ").append(toIndentedString(created)).append("\n");
            sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
            sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
            sb.append("    accessIPv4: ").append(toIndentedString(accessIPv4)).append("\n");
            sb.append("    accessIPv6: ").append(toIndentedString(accessIPv6)).append("\n");
            sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
            sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
            sb.append("    osEXTSTSPowerState: ").append(toIndentedString(osEXTSTSPowerState)).append("\n");
            sb.append("    configDrive: ").append(toIndentedString(configDrive)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    osSRVUSGLaunchedAt: ").append(toIndentedString(osSRVUSGLaunchedAt)).append("\n");
            sb.append("    osSRVUSGTerminatedAt: ").append(toIndentedString(osSRVUSGTerminatedAt)).append("\n");
            sb.append("    osExtendedVolumesVolumesAttached: ").append(toIndentedString(osExtendedVolumesVolumesAttached)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
            sb.append("    osEXTSRVATTRHostname: ").append(toIndentedString(osEXTSRVATTRHostname)).append("\n");
            sb.append("    osEXTSRVATTRReservationId: ").append(toIndentedString(osEXTSRVATTRReservationId)).append("\n");
            sb.append("    osEXTSRVATTRLaunchIndex: ").append(toIndentedString(osEXTSRVATTRLaunchIndex)).append("\n");
            sb.append("    osEXTSRVATTRKernelId: ").append(toIndentedString(osEXTSRVATTRKernelId)).append("\n");
            sb.append("    osEXTSRVATTRRamdiskId: ").append(toIndentedString(osEXTSRVATTRRamdiskId)).append("\n");
            sb.append("    osEXTSRVATTRRootDeviceName: ").append(toIndentedString(osEXTSRVATTRRootDeviceName)).append("\n");
            sb.append("    osEXTSRVATTRUserData: ").append(toIndentedString(osEXTSRVATTRUserData)).append("\n");
            sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    osSchedulerHints: ").append(toIndentedString(osSchedulerHints)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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

