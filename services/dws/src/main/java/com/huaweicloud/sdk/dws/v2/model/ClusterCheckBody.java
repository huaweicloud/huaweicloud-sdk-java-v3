package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 集群校验对象。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class ClusterCheckBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private List<String> availabilityZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_node")

    private Integer numNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private OpenPublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_spec_restore")

    private String crossSpecRestore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private Volume volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_cluster_hostname")

    private String oldClusterHostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_point")

    private RestorePoint restorePoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_list")

    private List<Tag> tagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dss_pool_id")

    private String dssPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port")

    private String dbPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_password")

    private String dbPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_cn")

    private Integer numCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ClusterCheckBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID，对集群指定企业项目。如果未指定，则使用默认企业项目“default”的ID，即0。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ClusterCheckBody withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**： 集群规格名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ClusterCheckBody withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public ClusterCheckBody addAvailabilityZonesItem(String availabilityZonesItem) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        this.availabilityZones.add(availabilityZonesItem);
        return this;
    }

    public ClusterCheckBody withAvailabilityZones(Consumer<List<String>> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        availabilityZonesSetter.accept(this.availabilityZones);
        return this;
    }

    /**
     * **参数解释**： 可用区列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return availabilityZones
     */
    public List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public ClusterCheckBody withNumNode(Integer numNode) {
        this.numNode = numNode;
        return this;
    }

    /**
     * **参数解释**： 实例节点个数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return numNode
     */
    public Integer getNumNode() {
        return numNode;
    }

    public void setNumNode(Integer numNode) {
        this.numNode = numNode;
    }

    public ClusterCheckBody withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * **参数解释**： 安全组ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ClusterCheckBody withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    /**
     * **参数解释**： 集群版本。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    public ClusterCheckBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**： 集群虚拟私有云ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ClusterCheckBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**： 集群子网ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ClusterCheckBody withPublicIp(OpenPublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public ClusterCheckBody withPublicIp(Consumer<OpenPublicIp> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new OpenPublicIp();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public OpenPublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(OpenPublicIp publicIp) {
        this.publicIp = publicIp;
    }

    public ClusterCheckBody withCrossSpecRestore(String crossSpecRestore) {
        this.crossSpecRestore = crossSpecRestore;
        return this;
    }

    /**
     * **参数解释**： 跨规格恢复信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return crossSpecRestore
     */
    public String getCrossSpecRestore() {
        return crossSpecRestore;
    }

    public void setCrossSpecRestore(String crossSpecRestore) {
        this.crossSpecRestore = crossSpecRestore;
    }

    public ClusterCheckBody withVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public ClusterCheckBody withVolume(Consumer<Volume> volumeSetter) {
        if (this.volume == null) {
            this.volume = new Volume();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public ClusterCheckBody withOldClusterHostname(String oldClusterHostname) {
        this.oldClusterHostname = oldClusterHostname;
        return this;
    }

    /**
     * **参数解释**： 旧主机名。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return oldClusterHostname
     */
    public String getOldClusterHostname() {
        return oldClusterHostname;
    }

    public void setOldClusterHostname(String oldClusterHostname) {
        this.oldClusterHostname = oldClusterHostname;
    }

    public ClusterCheckBody withRestorePoint(RestorePoint restorePoint) {
        this.restorePoint = restorePoint;
        return this;
    }

    public ClusterCheckBody withRestorePoint(Consumer<RestorePoint> restorePointSetter) {
        if (this.restorePoint == null) {
            this.restorePoint = new RestorePoint();
            restorePointSetter.accept(this.restorePoint);
        }

        return this;
    }

    /**
     * Get restorePoint
     * @return restorePoint
     */
    public RestorePoint getRestorePoint() {
        return restorePoint;
    }

    public void setRestorePoint(RestorePoint restorePoint) {
        this.restorePoint = restorePoint;
    }

    public ClusterCheckBody withTagList(List<Tag> tagList) {
        this.tagList = tagList;
        return this;
    }

    public ClusterCheckBody addTagListItem(Tag tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public ClusterCheckBody withTagList(Consumer<List<Tag>> tagListSetter) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        tagListSetter.accept(this.tagList);
        return this;
    }

    /**
     * **参数解释**： 标签列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return tagList
     */
    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public ClusterCheckBody withDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
        return this;
    }

    /**
     * **参数解释**： 存储池ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return dssPoolId
     */
    public String getDssPoolId() {
        return dssPoolId;
    }

    public void setDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
    }

    public ClusterCheckBody withDbPort(String dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * **参数解释**： 数据库端口。 **约束限制**： 不涉及。 **取值范围**： 8000~30000 **默认取值**： 8000
     * @return dbPort
     */
    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public ClusterCheckBody withDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }

    /**
     * **参数解释**： 管理员密码。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return dbPassword
     */
    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public ClusterCheckBody withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * **参数解释**： 管理员用户。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： dbadmin
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ClusterCheckBody withNumCn(Integer numCn) {
        this.numCn = numCn;
        return this;
    }

    /**
     * **参数解释**： cn节点数量。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return numCn
     */
    public Integer getNumCn() {
        return numCn;
    }

    public void setNumCn(Integer numCn) {
        this.numCn = numCn;
    }

    public ClusterCheckBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 集群名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterCheckBody that = (ClusterCheckBody) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.availabilityZones, that.availabilityZones)
            && Objects.equals(this.numNode, that.numNode) && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.datastoreVersion, that.datastoreVersion) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.crossSpecRestore, that.crossSpecRestore) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.oldClusterHostname, that.oldClusterHostname)
            && Objects.equals(this.restorePoint, that.restorePoint) && Objects.equals(this.tagList, that.tagList)
            && Objects.equals(this.dssPoolId, that.dssPoolId) && Objects.equals(this.dbPort, that.dbPort)
            && Objects.equals(this.dbPassword, that.dbPassword) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.numCn, that.numCn) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            flavor,
            availabilityZones,
            numNode,
            securityGroupId,
            datastoreVersion,
            vpcId,
            subnetId,
            publicIp,
            crossSpecRestore,
            volume,
            oldClusterHostname,
            restorePoint,
            tagList,
            dssPoolId,
            dbPort,
            dbPassword,
            dbName,
            numCn,
            name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterCheckBody {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
        sb.append("    numNode: ").append(toIndentedString(numNode)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    crossSpecRestore: ").append(toIndentedString(crossSpecRestore)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    oldClusterHostname: ").append(toIndentedString(oldClusterHostname)).append("\n");
        sb.append("    restorePoint: ").append(toIndentedString(restorePoint)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
        sb.append("    dssPoolId: ").append(toIndentedString(dssPoolId)).append("\n");
        sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
        sb.append("    dbPassword: ").append(toIndentedString(dbPassword)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    numCn: ").append(toIndentedString(numCn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
