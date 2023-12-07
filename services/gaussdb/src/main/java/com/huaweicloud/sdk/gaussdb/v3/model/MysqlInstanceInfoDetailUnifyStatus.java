package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MysqlInstanceInfoDetailUnifyStatus
 */
public class MysqlInstanceInfoDetailUnifyStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private MysqlInstanceChargeInfo chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_count")

    private Integer nodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private MysqlDatastoreWithKernelVersion datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_used_space")

    private Double backupUsedSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_write_ips")

    private List<String> privateWriteIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_dns_names")

    private List<String> privateDnsNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ips")

    private String publicIps;

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
    @JsonProperty(value = "configuration_id")

    private String configurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy")

    private MysqlBackupStrategy backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<MysqlInstanceNodeInfo> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_mode")

    private String azMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_az_code")

    private String masterAzCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintenance_window")

    private String maintenanceWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<MysqlTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_resource_id")

    private String dedicatedResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxies")

    private List<MysqlProxyInfo> proxies = null;

    public MysqlInstanceInfoDetailUnifyStatus withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID，严格匹配UUID规则。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MysqlInstanceInfoDetailUnifyStatus withName(String name) {
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

    public MysqlInstanceInfoDetailUnifyStatus withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户在某一Region下的project ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public MysqlInstanceInfoDetailUnifyStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。  取值： - 值为“creating”，表示实例正在创建。 - 值为“normal”，表示实例正常。 - 值为“abnormal”，表示实例异常。 - 值为“createfail”，表示实例创建失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MysqlInstanceInfoDetailUnifyStatus withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 数据库端口号。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public MysqlInstanceInfoDetailUnifyStatus withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 实例备注
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public MysqlInstanceInfoDetailUnifyStatus withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型，取Cluster”。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MysqlInstanceInfoDetailUnifyStatus withChargeInfo(MysqlInstanceChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus withChargeInfo(Consumer<MysqlInstanceChargeInfo> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new MysqlInstanceChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public MysqlInstanceChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(MysqlInstanceChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public MysqlInstanceInfoDetailUnifyStatus withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * 节点个数。
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public MysqlInstanceInfoDetailUnifyStatus withDatastore(MysqlDatastoreWithKernelVersion datastore) {
        this.datastore = datastore;
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus withDatastore(Consumer<MysqlDatastoreWithKernelVersion> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new MysqlDatastoreWithKernelVersion();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public MysqlDatastoreWithKernelVersion getDatastore() {
        return datastore;
    }

    public void setDatastore(MysqlDatastoreWithKernelVersion datastore) {
        this.datastore = datastore;
    }

    public MysqlInstanceInfoDetailUnifyStatus withBackupUsedSpace(Double backupUsedSpace) {
        this.backupUsedSpace = backupUsedSpace;
        return this;
    }

    /**
     * 备份空间使用大小，单位为GB。
     * @return backupUsedSpace
     */
    public Double getBackupUsedSpace() {
        return backupUsedSpace;
    }

    public void setBackupUsedSpace(Double backupUsedSpace) {
        this.backupUsedSpace = backupUsedSpace;
    }

    public MysqlInstanceInfoDetailUnifyStatus withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。  其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public MysqlInstanceInfoDetailUnifyStatus withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 更新时间，格式与\"created\"字段对应格式完全相同。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public MysqlInstanceInfoDetailUnifyStatus withPrivateWriteIps(List<String> privateWriteIps) {
        this.privateWriteIps = privateWriteIps;
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus addPrivateWriteIpsItem(String privateWriteIpsItem) {
        if (this.privateWriteIps == null) {
            this.privateWriteIps = new ArrayList<>();
        }
        this.privateWriteIps.add(privateWriteIpsItem);
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus withPrivateWriteIps(Consumer<List<String>> privateWriteIpsSetter) {
        if (this.privateWriteIps == null) {
            this.privateWriteIps = new ArrayList<>();
        }
        privateWriteIpsSetter.accept(this.privateWriteIps);
        return this;
    }

    /**
     * 实例的写内网IP地址。
     * @return privateWriteIps
     */
    public List<String> getPrivateWriteIps() {
        return privateWriteIps;
    }

    public void setPrivateWriteIps(List<String> privateWriteIps) {
        this.privateWriteIps = privateWriteIps;
    }

    public MysqlInstanceInfoDetailUnifyStatus withPrivateDnsNames(List<String> privateDnsNames) {
        this.privateDnsNames = privateDnsNames;
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus addPrivateDnsNamesItem(String privateDnsNamesItem) {
        if (this.privateDnsNames == null) {
            this.privateDnsNames = new ArrayList<>();
        }
        this.privateDnsNames.add(privateDnsNamesItem);
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus withPrivateDnsNames(Consumer<List<String>> privateDnsNamesSetter) {
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

    public MysqlInstanceInfoDetailUnifyStatus withPublicIps(String publicIps) {
        this.publicIps = publicIps;
        return this;
    }

    /**
     * 实例的公网IP地址。
     * @return publicIps
     */
    public String getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(String publicIps) {
        this.publicIps = publicIps;
    }

    public MysqlInstanceInfoDetailUnifyStatus withDbUserName(String dbUserName) {
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

    public MysqlInstanceInfoDetailUnifyStatus withVpcId(String vpcId) {
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

    public MysqlInstanceInfoDetailUnifyStatus withSubnetId(String subnetId) {
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

    public MysqlInstanceInfoDetailUnifyStatus withSecurityGroupId(String securityGroupId) {
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

    public MysqlInstanceInfoDetailUnifyStatus withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * 实例创建的模板ID，或者应用到实例的最新参数组模板ID。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public MysqlInstanceInfoDetailUnifyStatus withBackupStrategy(MysqlBackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus withBackupStrategy(Consumer<MysqlBackupStrategy> backupStrategySetter) {
        if (this.backupStrategy == null) {
            this.backupStrategy = new MysqlBackupStrategy();
            backupStrategySetter.accept(this.backupStrategy);
        }

        return this;
    }

    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public MysqlBackupStrategy getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(MysqlBackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public MysqlInstanceInfoDetailUnifyStatus withNodes(List<MysqlInstanceNodeInfo> nodes) {
        this.nodes = nodes;
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus addNodesItem(MysqlInstanceNodeInfo nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus withNodes(Consumer<List<MysqlInstanceNodeInfo>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 节点信息。
     * @return nodes
     */
    public List<MysqlInstanceNodeInfo> getNodes() {
        return nodes;
    }

    public void setNodes(List<MysqlInstanceNodeInfo> nodes) {
        this.nodes = nodes;
    }

    public MysqlInstanceInfoDetailUnifyStatus withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public MysqlInstanceInfoDetailUnifyStatus withTimeZone(String timeZone) {
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

    public MysqlInstanceInfoDetailUnifyStatus withAzMode(String azMode) {
        this.azMode = azMode;
        return this;
    }

    /**
     * 可用区模式。  取值范围： - single：单可用区。 - multi：多可用区。
     * @return azMode
     */
    public String getAzMode() {
        return azMode;
    }

    public void setAzMode(String azMode) {
        this.azMode = azMode;
    }

    public MysqlInstanceInfoDetailUnifyStatus withMasterAzCode(String masterAzCode) {
        this.masterAzCode = masterAzCode;
        return this;
    }

    /**
     * 主可用区。
     * @return masterAzCode
     */
    public String getMasterAzCode() {
        return masterAzCode;
    }

    public void setMasterAzCode(String masterAzCode) {
        this.masterAzCode = masterAzCode;
    }

    public MysqlInstanceInfoDetailUnifyStatus withMaintenanceWindow(String maintenanceWindow) {
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

    public MysqlInstanceInfoDetailUnifyStatus withTags(List<MysqlTags> tags) {
        this.tags = tags;
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus addTagsItem(MysqlTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus withTags(Consumer<List<MysqlTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 实例标签。
     * @return tags
     */
    public List<MysqlTags> getTags() {
        return tags;
    }

    public void setTags(List<MysqlTags> tags) {
        this.tags = tags;
    }

    public MysqlInstanceInfoDetailUnifyStatus withDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
        return this;
    }

    /**
     * 专属资源池ID，只有数据库实例属于专属资源池才会返回该参数。
     * @return dedicatedResourceId
     */
    public String getDedicatedResourceId() {
        return dedicatedResourceId;
    }

    public void setDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
    }

    public MysqlInstanceInfoDetailUnifyStatus withProxies(List<MysqlProxyInfo> proxies) {
        this.proxies = proxies;
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus addProxiesItem(MysqlProxyInfo proxiesItem) {
        if (this.proxies == null) {
            this.proxies = new ArrayList<>();
        }
        this.proxies.add(proxiesItem);
        return this;
    }

    public MysqlInstanceInfoDetailUnifyStatus withProxies(Consumer<List<MysqlProxyInfo>> proxiesSetter) {
        if (this.proxies == null) {
            this.proxies = new ArrayList<>();
        }
        proxiesSetter.accept(this.proxies);
        return this;
    }

    /**
     * 代理信息。
     * @return proxies
     */
    public List<MysqlProxyInfo> getProxies() {
        return proxies;
    }

    public void setProxies(List<MysqlProxyInfo> proxies) {
        this.proxies = proxies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MysqlInstanceInfoDetailUnifyStatus that = (MysqlInstanceInfoDetailUnifyStatus) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.port, that.port) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.type, that.type) && Objects.equals(this.chargeInfo, that.chargeInfo)
            && Objects.equals(this.nodeCount, that.nodeCount) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.backupUsedSpace, that.backupUsedSpace) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.privateWriteIps, that.privateWriteIps)
            && Objects.equals(this.privateDnsNames, that.privateDnsNames)
            && Objects.equals(this.publicIps, that.publicIps) && Objects.equals(this.dbUserName, that.dbUserName)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.configurationId, that.configurationId)
            && Objects.equals(this.backupStrategy, that.backupStrategy) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.azMode, that.azMode)
            && Objects.equals(this.masterAzCode, that.masterAzCode)
            && Objects.equals(this.maintenanceWindow, that.maintenanceWindow) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.dedicatedResourceId, that.dedicatedResourceId)
            && Objects.equals(this.proxies, that.proxies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            projectId,
            status,
            port,
            alias,
            type,
            chargeInfo,
            nodeCount,
            datastore,
            backupUsedSpace,
            created,
            updated,
            privateWriteIps,
            privateDnsNames,
            publicIps,
            dbUserName,
            vpcId,
            subnetId,
            securityGroupId,
            configurationId,
            backupStrategy,
            nodes,
            enterpriseProjectId,
            timeZone,
            azMode,
            masterAzCode,
            maintenanceWindow,
            tags,
            dedicatedResourceId,
            proxies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlInstanceInfoDetailUnifyStatus {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    backupUsedSpace: ").append(toIndentedString(backupUsedSpace)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    privateWriteIps: ").append(toIndentedString(privateWriteIps)).append("\n");
        sb.append("    privateDnsNames: ").append(toIndentedString(privateDnsNames)).append("\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
        sb.append("    dbUserName: ").append(toIndentedString(dbUserName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    azMode: ").append(toIndentedString(azMode)).append("\n");
        sb.append("    masterAzCode: ").append(toIndentedString(masterAzCode)).append("\n");
        sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    dedicatedResourceId: ").append(toIndentedString(dedicatedResourceId)).append("\n");
        sb.append("    proxies: ").append(toIndentedString(proxies)).append("\n");
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
