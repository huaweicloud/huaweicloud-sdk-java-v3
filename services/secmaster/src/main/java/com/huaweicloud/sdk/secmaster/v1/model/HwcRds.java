package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云关系型数据库
 */
public class HwcRds {

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
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ips")

    private List<String> privateIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_dns_names")

    private List<String> privateDnsNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ips")

    private List<String> publicIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Boolean enableSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha")

    private HwcRdsHa ha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private HwcRdsDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user_name")

    private String dbUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private HwcRdsVolume volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_strategy")

    private String switchStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_by_user")

    private Boolean readOnlyByUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy")

    private HwcRdsBackupStrategy backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintenance_window")

    private String maintenanceWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<HwcRdsNode> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_instance")

    private List<HwcRdsRelatedInstance> relatedInstance = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encryption_id")

    private String diskEncryptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_used_space")

    private Double backupUsedSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_used_space")

    private Double storageUsedSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_with_ddm")

    private Boolean associatedWithDdm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_iops")

    private Long maxIops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private String expirationTime;

    public HwcRds withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HwcRds withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建的实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HwcRds withProtectedStatus(String protectedStatus) {
        this.protectedStatus = protectedStatus;
        return this;
    }

    /**
     * DBSS开启状态：OPEN | CLOSE
     * @return protectedStatus
     */
    public String getProtectedStatus() {
        return protectedStatus;
    }

    public void setProtectedStatus(String protectedStatus) {
        this.protectedStatus = protectedStatus;
    }

    public HwcRds withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。 取值： 值为“BUILD”，表示实例正在创建。 值为“ACTIVE”，表示实例正常。 值为“FAILED”，表示实例异常。 值为“FROZEN”，表示实例冻结。 值为“MODIFYING”，表示实例正在扩容。 值为“REBOOTING”，表示实例正在重启。 值为“RESTORING”，表示实例正在恢复。 值为“MODIFYING INSTANCE TYPE”，表示实例正在转主备。 值为“SWITCHOVER”，表示实例正在主备切换。 值为“MIGRATING”，表示实例正在迁移。 值为“BACKING UP”，表示实例正在进行备份。 值为“MODIFYING DATABASE PORT”，表示实例正在修改数据库端口。 值为“STORAGE FULL”，表示实例磁盘空间满。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HwcRds withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 实例的备注信息。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public HwcRds withPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
        return this;
    }

    public HwcRds addPrivateIpsItem(String privateIpsItem) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        this.privateIps.add(privateIpsItem);
        return this;
    }

    public HwcRds withPrivateIps(Consumer<List<String>> privateIpsSetter) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        privateIpsSetter.accept(this.privateIps);
        return this;
    }

    /**
     * 实例内网IP地址列表。弹性云服务器创建成功后该值存在，其他情况下为空字符串。
     * @return privateIps
     */
    public List<String> getPrivateIps() {
        return privateIps;
    }

    public void setPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
    }

    public HwcRds withPrivateDnsNames(List<String> privateDnsNames) {
        this.privateDnsNames = privateDnsNames;
        return this;
    }

    public HwcRds addPrivateDnsNamesItem(String privateDnsNamesItem) {
        if (this.privateDnsNames == null) {
            this.privateDnsNames = new ArrayList<>();
        }
        this.privateDnsNames.add(privateDnsNamesItem);
        return this;
    }

    public HwcRds withPrivateDnsNames(Consumer<List<String>> privateDnsNamesSetter) {
        if (this.privateDnsNames == null) {
            this.privateDnsNames = new ArrayList<>();
        }
        privateDnsNamesSetter.accept(this.privateDnsNames);
        return this;
    }

    /**
     * 实例内网域名列表。实例创建成功后，需要手动申请内网域名，否则查询内网域名为空。
     * @return privateDnsNames
     */
    public List<String> getPrivateDnsNames() {
        return privateDnsNames;
    }

    public void setPrivateDnsNames(List<String> privateDnsNames) {
        this.privateDnsNames = privateDnsNames;
    }

    public HwcRds withPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
        return this;
    }

    public HwcRds addPublicIpsItem(String publicIpsItem) {
        if (this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        this.publicIps.add(publicIpsItem);
        return this;
    }

    public HwcRds withPublicIps(Consumer<List<String>> publicIpsSetter) {
        if (this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        publicIpsSetter.accept(this.publicIps);
        return this;
    }

    /**
     * 实例外网IP地址列表。
     * @return publicIps
     */
    public List<String> getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
    }

    public HwcRds withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 数据库端口号。 RDS for MySQL数据库端口设置范围为1024～65535（其中12017和33071被RDS系统占用不可设置）。 RDS for PostgreSQL数据库端口修改范围为2100～9500。 RDS for SQL Server实例的端口设置范围为1433和2100~9500（其中5355和5985不可设置。对于2017 EE、2017 SE、2017 Web版，5050、5353和5986不可设置）。 当不传该参数时，默认端口如下：  RDS for MySQL默认3306。 RDS for PostgreSQL默认5432。 RDS for SQL Server默认1433。
     * minimum: 1024
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public HwcRds withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * 实例开启SSL标志。 取值为“true”：表示实例已开启SSL。 取值为“false”：表示实例未开启SSL。
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public HwcRds withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型，取值为“Single”，“Ha”或“Replica”, \"Enterprise\"，分别对应于单机实例、主备实例、只读实例、分布式实例（企业版）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HwcRds withHa(HwcRdsHa ha) {
        this.ha = ha;
        return this;
    }

    public HwcRds withHa(Consumer<HwcRdsHa> haSetter) {
        if (this.ha == null) {
            this.ha = new HwcRdsHa();
            haSetter.accept(this.ha);
        }

        return this;
    }

    /**
     * Get ha
     * @return ha
     */
    public HwcRdsHa getHa() {
        return ha;
    }

    public void setHa(HwcRdsHa ha) {
        this.ha = ha;
    }

    public HwcRds withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 实例所在区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public HwcRds withDatastore(HwcRdsDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public HwcRds withDatastore(Consumer<HwcRdsDatastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new HwcRdsDatastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public HwcRdsDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(HwcRdsDatastore datastore) {
        this.datastore = datastore;
    }

    public HwcRds withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。 说明：创建时返回值为空，数据库实例创建成功后该值不为空。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public HwcRds withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 更新时间，格式与“created”字段对应格式完全相同。 说明：创建时返回值为空，数据库实例创建成功后该值不为空。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public HwcRds withDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }

    /**
     * 默认用户名。
     * @return dbUserName
     */
    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public HwcRds withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public HwcRds withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网的网络ID信息。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public HwcRds withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public HwcRds withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 规格码。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public HwcRds withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU大小。例如，1表示1U。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public HwcRds withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 内存大小（单位：GB）。
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public HwcRds withVolume(HwcRdsVolume volume) {
        this.volume = volume;
        return this;
    }

    public HwcRds withVolume(Consumer<HwcRdsVolume> volumeSetter) {
        if (this.volume == null) {
            this.volume = new HwcRdsVolume();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public HwcRdsVolume getVolume() {
        return volume;
    }

    public void setVolume(HwcRdsVolume volume) {
        this.volume = volume;
    }

    public HwcRds withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public HwcRds addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public HwcRds withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，没有标签默认为空数组。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public HwcRds withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目标签ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public HwcRds withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public HwcRds withSwitchStrategy(String switchStrategy) {
        this.switchStrategy = switchStrategy;
        return this;
    }

    /**
     * 数据库切换策略。取值为“reliability”或“availability”，分别对应于可靠性优先和可用性优先。
     * @return switchStrategy
     */
    public String getSwitchStrategy() {
        return switchStrategy;
    }

    public void setSwitchStrategy(String switchStrategy) {
        this.switchStrategy = switchStrategy;
    }

    public HwcRds withReadOnlyByUser(Boolean readOnlyByUser) {
        this.readOnlyByUser = readOnlyByUser;
        return this;
    }

    /**
     * 用户设置的实例只读状态。仅支持RDS for MySQL引擎。 true，表示该实例被设置为只读状态。 false，表示该实例未被设置为只读状态。
     * @return readOnlyByUser
     */
    public Boolean getReadOnlyByUser() {
        return readOnlyByUser;
    }

    public void setReadOnlyByUser(Boolean readOnlyByUser) {
        this.readOnlyByUser = readOnlyByUser;
    }

    public HwcRds withBackupStrategy(HwcRdsBackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public HwcRds withBackupStrategy(Consumer<HwcRdsBackupStrategy> backupStrategySetter) {
        if (this.backupStrategy == null) {
            this.backupStrategy = new HwcRdsBackupStrategy();
            backupStrategySetter.accept(this.backupStrategy);
        }

        return this;
    }

    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public HwcRdsBackupStrategy getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(HwcRdsBackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public HwcRds withMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * 可维护时间窗，为UTC时间。
     * @return maintenanceWindow
     */
    public String getMaintenanceWindow() {
        return maintenanceWindow;
    }

    public void setMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    public HwcRds withNodes(List<HwcRdsNode> nodes) {
        this.nodes = nodes;
        return this;
    }

    public HwcRds addNodesItem(HwcRdsNode nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public HwcRds withNodes(Consumer<List<HwcRdsNode>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 主备实例信息
     * @return nodes
     */
    public List<HwcRdsNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<HwcRdsNode> nodes) {
        this.nodes = nodes;
    }

    public HwcRds withRelatedInstance(List<HwcRdsRelatedInstance> relatedInstance) {
        this.relatedInstance = relatedInstance;
        return this;
    }

    public HwcRds addRelatedInstanceItem(HwcRdsRelatedInstance relatedInstanceItem) {
        if (this.relatedInstance == null) {
            this.relatedInstance = new ArrayList<>();
        }
        this.relatedInstance.add(relatedInstanceItem);
        return this;
    }

    public HwcRds withRelatedInstance(Consumer<List<HwcRdsRelatedInstance>> relatedInstanceSetter) {
        if (this.relatedInstance == null) {
            this.relatedInstance = new ArrayList<>();
        }
        relatedInstanceSetter.accept(this.relatedInstance);
        return this;
    }

    /**
     * 所关联的数据库实例列表。
     * @return relatedInstance
     */
    public List<HwcRdsRelatedInstance> getRelatedInstance() {
        return relatedInstance;
    }

    public void setRelatedInstance(List<HwcRdsRelatedInstance> relatedInstance) {
        this.relatedInstance = relatedInstance;
    }

    public HwcRds withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    /**
     * 磁盘加密密钥ID。
     * @return diskEncryptionId
     */
    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    public HwcRds withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public HwcRds withBackupUsedSpace(Double backupUsedSpace) {
        this.backupUsedSpace = backupUsedSpace;
        return this;
    }

    /**
     * 备份空间使用量，单位GB。 该字段仅用于查询指定RDS for SQL Server单个实例信息时返回。
     * minimum: 0
     * maximum: 65536
     * @return backupUsedSpace
     */
    public Double getBackupUsedSpace() {
        return backupUsedSpace;
    }

    public void setBackupUsedSpace(Double backupUsedSpace) {
        this.backupUsedSpace = backupUsedSpace;
    }

    public HwcRds withStorageUsedSpace(Double storageUsedSpace) {
        this.storageUsedSpace = storageUsedSpace;
        return this;
    }

    /**
     * 磁盘空间使用量，单位GB。 该字段仅用于查询指定RDS for SQL Server单个实例信息时返回。
     * minimum: 0
     * maximum: 65535
     * @return storageUsedSpace
     */
    public Double getStorageUsedSpace() {
        return storageUsedSpace;
    }

    public void setStorageUsedSpace(Double storageUsedSpace) {
        this.storageUsedSpace = storageUsedSpace;
    }

    public HwcRds withAssociatedWithDdm(Boolean associatedWithDdm) {
        this.associatedWithDdm = associatedWithDdm;
        return this;
    }

    /**
     * 是否已被DDM实例关联。
     * @return associatedWithDdm
     */
    public Boolean getAssociatedWithDdm() {
        return associatedWithDdm;
    }

    public void setAssociatedWithDdm(Boolean associatedWithDdm) {
        this.associatedWithDdm = associatedWithDdm;
    }

    public HwcRds withMaxIops(Long maxIops) {
        this.maxIops = maxIops;
        return this;
    }

    /**
     * 实例磁盘的最大IOPS值。 当前该字段仅对于SQL Server引擎实例返回。
     * minimum: 0
     * maximum: 10000000000
     * @return maxIops
     */
    public Long getMaxIops() {
        return maxIops;
    }

    public void setMaxIops(Long maxIops) {
        this.maxIops = maxIops;
    }

    public HwcRds withExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * 实例的到期时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 仅包周期场景返回。
     * @return expirationTime
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HwcRds that = (HwcRds) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.protectedStatus, that.protectedStatus) && Objects.equals(this.status, that.status)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.privateIps, that.privateIps)
            && Objects.equals(this.privateDnsNames, that.privateDnsNames)
            && Objects.equals(this.publicIps, that.publicIps) && Objects.equals(this.port, that.port)
            && Objects.equals(this.enableSsl, that.enableSsl) && Objects.equals(this.type, that.type)
            && Objects.equals(this.ha, that.ha) && Objects.equals(this.region, that.region)
            && Objects.equals(this.datastore, that.datastore) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.dbUserName, that.dbUserName)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.mem, that.mem) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.switchStrategy, that.switchStrategy)
            && Objects.equals(this.readOnlyByUser, that.readOnlyByUser)
            && Objects.equals(this.backupStrategy, that.backupStrategy)
            && Objects.equals(this.maintenanceWindow, that.maintenanceWindow) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.relatedInstance, that.relatedInstance)
            && Objects.equals(this.diskEncryptionId, that.diskEncryptionId)
            && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.backupUsedSpace, that.backupUsedSpace)
            && Objects.equals(this.storageUsedSpace, that.storageUsedSpace)
            && Objects.equals(this.associatedWithDdm, that.associatedWithDdm)
            && Objects.equals(this.maxIops, that.maxIops) && Objects.equals(this.expirationTime, that.expirationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            protectedStatus,
            status,
            alias,
            privateIps,
            privateDnsNames,
            publicIps,
            port,
            enableSsl,
            type,
            ha,
            region,
            datastore,
            created,
            updated,
            dbUserName,
            vpcId,
            subnetId,
            securityGroupId,
            flavorRef,
            cpu,
            mem,
            volume,
            tags,
            enterpriseProjectId,
            projectId,
            switchStrategy,
            readOnlyByUser,
            backupStrategy,
            maintenanceWindow,
            nodes,
            relatedInstance,
            diskEncryptionId,
            timeZone,
            backupUsedSpace,
            storageUsedSpace,
            associatedWithDdm,
            maxIops,
            expirationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HwcRds {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protectedStatus: ").append(toIndentedString(protectedStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
        sb.append("    privateDnsNames: ").append(toIndentedString(privateDnsNames)).append("\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    dbUserName: ").append(toIndentedString(dbUserName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    switchStrategy: ").append(toIndentedString(switchStrategy)).append("\n");
        sb.append("    readOnlyByUser: ").append(toIndentedString(readOnlyByUser)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    relatedInstance: ").append(toIndentedString(relatedInstance)).append("\n");
        sb.append("    diskEncryptionId: ").append(toIndentedString(diskEncryptionId)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    backupUsedSpace: ").append(toIndentedString(backupUsedSpace)).append("\n");
        sb.append("    storageUsedSpace: ").append(toIndentedString(storageUsedSpace)).append("\n");
        sb.append("    associatedWithDdm: ").append(toIndentedString(associatedWithDdm)).append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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
