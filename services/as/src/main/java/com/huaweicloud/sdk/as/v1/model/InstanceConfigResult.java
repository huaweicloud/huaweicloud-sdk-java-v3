package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例配置信息
 */
public class InstanceConfigResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageRef")

    private String imageRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private List<DiskResult> disk = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_fingerprint")

    private String keyFingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminPass")

    private String adminPass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "personality")

    private List<PersonalityResult> personality = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private PublicipResult publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private VmMetaData metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroups> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenancy")

    private String tenancy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private String dedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market_type")

    private String marketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_flavor_priority_policy")

    private String multiFlavorPriorityPolicy;

    public InstanceConfigResult withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 云服务器的规格ID。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public InstanceConfigResult withImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    /**
     * 镜像ID，同image_id。
     * @return imageRef
     */
    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public InstanceConfigResult withDisk(List<DiskResult> disk) {
        this.disk = disk;
        return this;
    }

    public InstanceConfigResult addDiskItem(DiskResult diskItem) {
        if (this.disk == null) {
            this.disk = new ArrayList<>();
        }
        this.disk.add(diskItem);
        return this;
    }

    public InstanceConfigResult withDisk(Consumer<List<DiskResult>> diskSetter) {
        if (this.disk == null) {
            this.disk = new ArrayList<>();
        }
        diskSetter.accept(this.disk);
        return this;
    }

    /**
     * 磁盘组信息。
     * @return disk
     */
    public List<DiskResult> getDisk() {
        return disk;
    }

    public void setDisk(List<DiskResult> disk) {
        this.disk = disk;
    }

    public InstanceConfigResult withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 登录云服务器的SSH密钥名称。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public InstanceConfigResult withKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
        return this;
    }

    /**
     * 登录云服务器的SSH密钥指纹。
     * @return keyFingerprint
     */
    public String getKeyFingerprint() {
        return keyFingerprint;
    }

    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    public InstanceConfigResult withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 该参数为预留字段。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public InstanceConfigResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 该参数为预留字段。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceConfigResult withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    /**
     * 登录云服务器的密码，非明文回显。
     * @return adminPass
     */
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public InstanceConfigResult withPersonality(List<PersonalityResult> personality) {
        this.personality = personality;
        return this;
    }

    public InstanceConfigResult addPersonalityItem(PersonalityResult personalityItem) {
        if (this.personality == null) {
            this.personality = new ArrayList<>();
        }
        this.personality.add(personalityItem);
        return this;
    }

    public InstanceConfigResult withPersonality(Consumer<List<PersonalityResult>> personalitySetter) {
        if (this.personality == null) {
            this.personality = new ArrayList<>();
        }
        personalitySetter.accept(this.personality);
        return this;
    }

    /**
     * 个人信息
     * @return personality
     */
    public List<PersonalityResult> getPersonality() {
        return personality;
    }

    public void setPersonality(List<PersonalityResult> personality) {
        this.personality = personality;
    }

    public InstanceConfigResult withPublicIp(PublicipResult publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public InstanceConfigResult withPublicIp(Consumer<PublicipResult> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new PublicipResult();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public PublicipResult getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(PublicipResult publicIp) {
        this.publicIp = publicIp;
    }

    public InstanceConfigResult withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * cloud-init用户数据，base64格式编码。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public InstanceConfigResult withMetadata(VmMetaData metadata) {
        this.metadata = metadata;
        return this;
    }

    public InstanceConfigResult withMetadata(Consumer<VmMetaData> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new VmMetaData();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public VmMetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(VmMetaData metadata) {
        this.metadata = metadata;
    }

    public InstanceConfigResult withSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public InstanceConfigResult addSecurityGroupsItem(SecurityGroups securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public InstanceConfigResult withSecurityGroups(Consumer<List<SecurityGroups>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组信息。
     * @return securityGroups
     */
    public List<SecurityGroups> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public InstanceConfigResult withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 云服务器组ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public InstanceConfigResult withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * 在专属主机上创建弹性云服务器。
     * @return tenancy
     */
    public String getTenancy() {
        return tenancy;
    }

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    public InstanceConfigResult withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    /**
     * 专属主机的ID。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public InstanceConfigResult withMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }

    /**
     * 云服务器的计费模式，可以选择竞价计费或按需计费。
     * @return marketType
     */
    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public InstanceConfigResult withMultiFlavorPriorityPolicy(String multiFlavorPriorityPolicy) {
        this.multiFlavorPriorityPolicy = multiFlavorPriorityPolicy;
        return this;
    }

    /**
     * 使用伸缩配置创建云主机的时候，多规格使用的优先级策略。  PICK_FIRST（默认）：选择优先，虚拟机扩容时规格的选择按照flavorRef列表的顺序进行优先级排序。 COST_FIRST：成本优化，虚拟机扩容时规格的选择按照价格最优原则进行优先级排序。
     * @return multiFlavorPriorityPolicy
     */
    public String getMultiFlavorPriorityPolicy() {
        return multiFlavorPriorityPolicy;
    }

    public void setMultiFlavorPriorityPolicy(String multiFlavorPriorityPolicy) {
        this.multiFlavorPriorityPolicy = multiFlavorPriorityPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceConfigResult that = (InstanceConfigResult) obj;
        return Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.imageRef, that.imageRef)
            && Objects.equals(this.disk, that.disk) && Objects.equals(this.keyName, that.keyName)
            && Objects.equals(this.keyFingerprint, that.keyFingerprint)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.adminPass, that.adminPass) && Objects.equals(this.personality, that.personality)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.serverGroupId, that.serverGroupId) && Objects.equals(this.tenancy, that.tenancy)
            && Objects.equals(this.dedicatedHostId, that.dedicatedHostId)
            && Objects.equals(this.marketType, that.marketType)
            && Objects.equals(this.multiFlavorPriorityPolicy, that.multiFlavorPriorityPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorRef,
            imageRef,
            disk,
            keyName,
            keyFingerprint,
            instanceName,
            instanceId,
            adminPass,
            personality,
            publicIp,
            userData,
            metadata,
            securityGroups,
            serverGroupId,
            tenancy,
            dedicatedHostId,
            marketType,
            multiFlavorPriorityPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceConfigResult {\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    keyFingerprint: ").append(toIndentedString(keyFingerprint)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
        sb.append("    personality: ").append(toIndentedString(personality)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
        sb.append("    marketType: ").append(toIndentedString(marketType)).append("\n");
        sb.append("    multiFlavorPriorityPolicy: ").append(toIndentedString(multiFlavorPriorityPolicy)).append("\n");
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
