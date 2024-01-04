package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例信息
 */
public class MysqlInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private MysqlChargeInfo chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private MysqlDatastoreInReq datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

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
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy")

    private MysqlBackupStrategy backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_mode")

    private String availabilityZoneMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_availability_zone")

    private String masterAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_count")

    private Integer slaveCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private MysqlVolume volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<MysqlTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lower_case_table_names")

    private Integer lowerCaseTableNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_resource_id")

    private String dedicatedResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_point")

    private MysqlRestorePoint restorePoint;

    public MysqlInstanceRequest withChargeInfo(MysqlChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public MysqlInstanceRequest withChargeInfo(Consumer<MysqlChargeInfo> chargeInfoSetter) {
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

    public MysqlInstanceRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域ID。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public MysqlInstanceRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。用于表示实例的名称，同一租户下，同类型的实例名可重名。  取值范围：最小为4个字符，最大为64个字符且不超过64个字节（注意：一个中文字符占用3个字节），必须以字母或中文开头，区分大小写，可以包含字母、数字、中划线、下划线或中文，不能包含其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MysqlInstanceRequest withDatastore(MysqlDatastoreInReq datastore) {
        this.datastore = datastore;
        return this;
    }

    public MysqlInstanceRequest withDatastore(Consumer<MysqlDatastoreInReq> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new MysqlDatastoreInReq();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public MysqlDatastoreInReq getDatastore() {
        return datastore;
    }

    public void setDatastore(MysqlDatastoreInReq datastore) {
        this.datastore = datastore;
    }

    public MysqlInstanceRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 实例类型，目前仅支持Cluster。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public MysqlInstanceRequest withFlavorRef(String flavorRef) {
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

    public MysqlInstanceRequest withVpcId(String vpcId) {
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

    public MysqlInstanceRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网的网络ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public MysqlInstanceRequest withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。如果实例所选用的子网开启网络ACL进行访问控制，则该参数非必选。如果未开启ACL进行访问控制，则该参数必选。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public MysqlInstanceRequest withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * 参数模板ID。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public MysqlInstanceRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 数据库密码。  取值范围：至少包含以下字符的三种：大小写字母、数字和特殊符号~!@#$%^*-_=+?,()&，长度8~32个字符。 建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。如果您输入弱密码，系统会自动判定密码非法。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MysqlInstanceRequest withBackupStrategy(MysqlBackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public MysqlInstanceRequest withBackupStrategy(Consumer<MysqlBackupStrategy> backupStrategySetter) {
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

    public MysqlInstanceRequest withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。默认时区为UTC。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public MysqlInstanceRequest withAvailabilityZoneMode(String availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
        return this;
    }

    /**
     * 可用区类型,单可用区single或多可用区multi。
     * @return availabilityZoneMode
     */
    public String getAvailabilityZoneMode() {
        return availabilityZoneMode;
    }

    public void setAvailabilityZoneMode(String availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
    }

    public MysqlInstanceRequest withMasterAvailabilityZone(String masterAvailabilityZone) {
        this.masterAvailabilityZone = masterAvailabilityZone;
        return this;
    }

    /**
     * 主可用区。
     * @return masterAvailabilityZone
     */
    public String getMasterAvailabilityZone() {
        return masterAvailabilityZone;
    }

    public void setMasterAvailabilityZone(String masterAvailabilityZone) {
        this.masterAvailabilityZone = masterAvailabilityZone;
    }

    public MysqlInstanceRequest withSlaveCount(Integer slaveCount) {
        this.slaveCount = slaveCount;
        return this;
    }

    /**
     * 只读节点个数。单次接口调用最多支持创建9个只读节点。
     * @return slaveCount
     */
    public Integer getSlaveCount() {
        return slaveCount;
    }

    public void setSlaveCount(Integer slaveCount) {
        this.slaveCount = slaveCount;
    }

    public MysqlInstanceRequest withVolume(MysqlVolume volume) {
        this.volume = volume;
        return this;
    }

    public MysqlInstanceRequest withVolume(Consumer<MysqlVolume> volumeSetter) {
        if (this.volume == null) {
            this.volume = new MysqlVolume();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public MysqlVolume getVolume() {
        return volume;
    }

    public void setVolume(MysqlVolume volume) {
        this.volume = volume;
    }

    public MysqlInstanceRequest withTags(List<MysqlTags> tags) {
        this.tags = tags;
        return this;
    }

    public MysqlInstanceRequest addTagsItem(MysqlTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public MysqlInstanceRequest withTags(Consumer<List<MysqlTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public List<MysqlTags> getTags() {
        return tags;
    }

    public void setTags(List<MysqlTags> tags) {
        this.tags = tags;
    }

    public MysqlInstanceRequest withLowerCaseTableNames(Integer lowerCaseTableNames) {
        this.lowerCaseTableNames = lowerCaseTableNames;
        return this;
    }

    /**
     * 表名大小写是否敏感，默认值是“1”。  取值范围： - 0：表名被存储成固定且表名称大小写敏感。 - 1：表名将被存储成小写且表名称大小写不敏感。
     * @return lowerCaseTableNames
     */
    public Integer getLowerCaseTableNames() {
        return lowerCaseTableNames;
    }

    public void setLowerCaseTableNames(Integer lowerCaseTableNames) {
        this.lowerCaseTableNames = lowerCaseTableNames;
    }

    public MysqlInstanceRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。如果账户开通企业项目服务则该参数必选，未开启该参数不可选。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public MysqlInstanceRequest withDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
        return this;
    }

    /**
     * 专属资源池ID，只有开通专属资源池后才可以下发此参数。
     * @return dedicatedResourceId
     */
    public String getDedicatedResourceId() {
        return dedicatedResourceId;
    }

    public void setDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
    }

    public MysqlInstanceRequest withRestorePoint(MysqlRestorePoint restorePoint) {
        this.restorePoint = restorePoint;
        return this;
    }

    public MysqlInstanceRequest withRestorePoint(Consumer<MysqlRestorePoint> restorePointSetter) {
        if (this.restorePoint == null) {
            this.restorePoint = new MysqlRestorePoint();
            restorePointSetter.accept(this.restorePoint);
        }

        return this;
    }

    /**
     * Get restorePoint
     * @return restorePoint
     */
    public MysqlRestorePoint getRestorePoint() {
        return restorePoint;
    }

    public void setRestorePoint(MysqlRestorePoint restorePoint) {
        this.restorePoint = restorePoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MysqlInstanceRequest that = (MysqlInstanceRequest) obj;
        return Objects.equals(this.chargeInfo, that.chargeInfo) && Objects.equals(this.region, that.region)
            && Objects.equals(this.name, that.name) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.configurationId, that.configurationId)
            && Objects.equals(this.password, that.password) && Objects.equals(this.backupStrategy, that.backupStrategy)
            && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.availabilityZoneMode, that.availabilityZoneMode)
            && Objects.equals(this.masterAvailabilityZone, that.masterAvailabilityZone)
            && Objects.equals(this.slaveCount, that.slaveCount) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.lowerCaseTableNames, that.lowerCaseTableNames)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.dedicatedResourceId, that.dedicatedResourceId)
            && Objects.equals(this.restorePoint, that.restorePoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeInfo,
            region,
            name,
            datastore,
            mode,
            flavorRef,
            vpcId,
            subnetId,
            securityGroupId,
            configurationId,
            password,
            backupStrategy,
            timeZone,
            availabilityZoneMode,
            masterAvailabilityZone,
            slaveCount,
            volume,
            tags,
            lowerCaseTableNames,
            enterpriseProjectId,
            dedicatedResourceId,
            restorePoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlInstanceRequest {\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    availabilityZoneMode: ").append(toIndentedString(availabilityZoneMode)).append("\n");
        sb.append("    masterAvailabilityZone: ").append(toIndentedString(masterAvailabilityZone)).append("\n");
        sb.append("    slaveCount: ").append(toIndentedString(slaveCount)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    lowerCaseTableNames: ").append(toIndentedString(lowerCaseTableNames)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    dedicatedResourceId: ").append(toIndentedString(dedicatedResourceId)).append("\n");
        sb.append("    restorePoint: ").append(toIndentedString(restorePoint)).append("\n");
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
