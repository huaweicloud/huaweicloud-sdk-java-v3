package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MysqlInstanceListInfo
 */
public class MysqlInstanceListInfo {

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
    @JsonProperty(value = "private_ips")

    private List<String> privateIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_ips")

    private List<String> proxyIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_private_ips")

    private List<String> readonlyPrivateIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ips")

    private List<String> publicIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private MysqlDatastoreWithKernelVersion datastore;

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
    @JsonProperty(value = "flavor_info")

    private MysqlFlavorInfo flavorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private MysqlVolumeInfo volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy")

    private MysqlBackupStrategy backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private MysqlChargeInfo chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_resource_id")

    private String dedicatedResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<InstanceTagItem> tags = null;

    public MysqlInstanceListInfo withId(String id) {
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

    public MysqlInstanceListInfo withName(String name) {
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

    public MysqlInstanceListInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MysqlInstanceListInfo withPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
        return this;
    }

    public MysqlInstanceListInfo addPrivateIpsItem(String privateIpsItem) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        this.privateIps.add(privateIpsItem);
        return this;
    }

    public MysqlInstanceListInfo withPrivateIps(Consumer<List<String>> privateIpsSetter) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        privateIpsSetter.accept(this.privateIps);
        return this;
    }

    /**
     * 实例写内网IP地址列表。弹性云服务器创建成功后该值存在，其他情况下为空字列表。
     * @return privateIps
     */
    public List<String> getPrivateIps() {
        return privateIps;
    }

    public void setPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
    }

    public MysqlInstanceListInfo withProxyIps(List<String> proxyIps) {
        this.proxyIps = proxyIps;
        return this;
    }

    public MysqlInstanceListInfo addProxyIpsItem(String proxyIpsItem) {
        if (this.proxyIps == null) {
            this.proxyIps = new ArrayList<>();
        }
        this.proxyIps.add(proxyIpsItem);
        return this;
    }

    public MysqlInstanceListInfo withProxyIps(Consumer<List<String>> proxyIpsSetter) {
        if (this.proxyIps == null) {
            this.proxyIps = new ArrayList<>();
        }
        proxyIpsSetter.accept(this.proxyIps);
        return this;
    }

    /**
     * 实例读写分离IP地址列表。TaurusDB实例开启代理成功后该值存在，其他情况下为空列表。
     * @return proxyIps
     */
    public List<String> getProxyIps() {
        return proxyIps;
    }

    public void setProxyIps(List<String> proxyIps) {
        this.proxyIps = proxyIps;
    }

    public MysqlInstanceListInfo withReadonlyPrivateIps(List<String> readonlyPrivateIps) {
        this.readonlyPrivateIps = readonlyPrivateIps;
        return this;
    }

    public MysqlInstanceListInfo addReadonlyPrivateIpsItem(String readonlyPrivateIpsItem) {
        if (this.readonlyPrivateIps == null) {
            this.readonlyPrivateIps = new ArrayList<>();
        }
        this.readonlyPrivateIps.add(readonlyPrivateIpsItem);
        return this;
    }

    public MysqlInstanceListInfo withReadonlyPrivateIps(Consumer<List<String>> readonlyPrivateIpsSetter) {
        if (this.readonlyPrivateIps == null) {
            this.readonlyPrivateIps = new ArrayList<>();
        }
        readonlyPrivateIpsSetter.accept(this.readonlyPrivateIps);
        return this;
    }

    /**
     * 实例读内网IP地址列表。弹性云服务器创建成功后该值存在，其他情况下为空列表。
     * @return readonlyPrivateIps
     */
    public List<String> getReadonlyPrivateIps() {
        return readonlyPrivateIps;
    }

    public void setReadonlyPrivateIps(List<String> readonlyPrivateIps) {
        this.readonlyPrivateIps = readonlyPrivateIps;
    }

    public MysqlInstanceListInfo withPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
        return this;
    }

    public MysqlInstanceListInfo addPublicIpsItem(String publicIpsItem) {
        if (this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        this.publicIps.add(publicIpsItem);
        return this;
    }

    public MysqlInstanceListInfo withPublicIps(Consumer<List<String>> publicIpsSetter) {
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

    public MysqlInstanceListInfo withPort(String port) {
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

    public MysqlInstanceListInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型，取值为“Cluster”。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MysqlInstanceListInfo withRegion(String region) {
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

    public MysqlInstanceListInfo withDatastore(MysqlDatastoreWithKernelVersion datastore) {
        this.datastore = datastore;
        return this;
    }

    public MysqlInstanceListInfo withDatastore(Consumer<MysqlDatastoreWithKernelVersion> datastoreSetter) {
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

    public MysqlInstanceListInfo withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。  其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。  说明：创建时返回值为空，数据库实例创建成功后该值不为空。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public MysqlInstanceListInfo withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 更新时间，格式与\"created\"字段对应格式完全相同。  说明：创建时返回值为空，数据库实例创建成功后该值不为空。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public MysqlInstanceListInfo withDbUserName(String dbUserName) {
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

    public MysqlInstanceListInfo withVpcId(String vpcId) {
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

    public MysqlInstanceListInfo withSubnetId(String subnetId) {
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

    public MysqlInstanceListInfo withSecurityGroupId(String securityGroupId) {
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

    public MysqlInstanceListInfo withFlavorRef(String flavorRef) {
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

    public MysqlInstanceListInfo withFlavorInfo(MysqlFlavorInfo flavorInfo) {
        this.flavorInfo = flavorInfo;
        return this;
    }

    public MysqlInstanceListInfo withFlavorInfo(Consumer<MysqlFlavorInfo> flavorInfoSetter) {
        if (this.flavorInfo == null) {
            this.flavorInfo = new MysqlFlavorInfo();
            flavorInfoSetter.accept(this.flavorInfo);
        }

        return this;
    }

    /**
     * Get flavorInfo
     * @return flavorInfo
     */
    public MysqlFlavorInfo getFlavorInfo() {
        return flavorInfo;
    }

    public void setFlavorInfo(MysqlFlavorInfo flavorInfo) {
        this.flavorInfo = flavorInfo;
    }

    public MysqlInstanceListInfo withVolume(MysqlVolumeInfo volume) {
        this.volume = volume;
        return this;
    }

    public MysqlInstanceListInfo withVolume(Consumer<MysqlVolumeInfo> volumeSetter) {
        if (this.volume == null) {
            this.volume = new MysqlVolumeInfo();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public MysqlVolumeInfo getVolume() {
        return volume;
    }

    public void setVolume(MysqlVolumeInfo volume) {
        this.volume = volume;
    }

    public MysqlInstanceListInfo withBackupStrategy(MysqlBackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public MysqlInstanceListInfo withBackupStrategy(Consumer<MysqlBackupStrategy> backupStrategySetter) {
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

    public MysqlInstanceListInfo withEnterpriseProjectId(String enterpriseProjectId) {
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

    public MysqlInstanceListInfo withTimeZone(String timeZone) {
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

    public MysqlInstanceListInfo withChargeInfo(MysqlChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public MysqlInstanceListInfo withChargeInfo(Consumer<MysqlChargeInfo> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new MysqlChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public MysqlChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(MysqlChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public MysqlInstanceListInfo withDedicatedResourceId(String dedicatedResourceId) {
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

    public MysqlInstanceListInfo withTags(List<InstanceTagItem> tags) {
        this.tags = tags;
        return this;
    }

    public MysqlInstanceListInfo addTagsItem(InstanceTagItem tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public MysqlInstanceListInfo withTags(Consumer<List<InstanceTagItem>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<InstanceTagItem> getTags() {
        return tags;
    }

    public void setTags(List<InstanceTagItem> tags) {
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
        MysqlInstanceListInfo that = (MysqlInstanceListInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.privateIps, that.privateIps)
            && Objects.equals(this.proxyIps, that.proxyIps)
            && Objects.equals(this.readonlyPrivateIps, that.readonlyPrivateIps)
            && Objects.equals(this.publicIps, that.publicIps) && Objects.equals(this.port, that.port)
            && Objects.equals(this.type, that.type) && Objects.equals(this.region, that.region)
            && Objects.equals(this.datastore, that.datastore) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.dbUserName, that.dbUserName)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.flavorInfo, that.flavorInfo)
            && Objects.equals(this.volume, that.volume) && Objects.equals(this.backupStrategy, that.backupStrategy)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.chargeInfo, that.chargeInfo)
            && Objects.equals(this.dedicatedResourceId, that.dedicatedResourceId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            privateIps,
            proxyIps,
            readonlyPrivateIps,
            publicIps,
            port,
            type,
            region,
            datastore,
            created,
            updated,
            dbUserName,
            vpcId,
            subnetId,
            securityGroupId,
            flavorRef,
            flavorInfo,
            volume,
            backupStrategy,
            enterpriseProjectId,
            timeZone,
            chargeInfo,
            dedicatedResourceId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlInstanceListInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
        sb.append("    proxyIps: ").append(toIndentedString(proxyIps)).append("\n");
        sb.append("    readonlyPrivateIps: ").append(toIndentedString(readonlyPrivateIps)).append("\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    dbUserName: ").append(toIndentedString(dbUserName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    flavorInfo: ").append(toIndentedString(flavorInfo)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    dedicatedResourceId: ").append(toIndentedString(dedicatedResourceId)).append("\n");
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
