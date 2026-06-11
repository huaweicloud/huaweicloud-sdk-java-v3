package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** &#39;实例信息。&#39; **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class CreateInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private DatastoreOption datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

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
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type")

    private String productType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private List<CreateInstanceFlavorOption> flavor = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encryption_id")

    private String diskEncryptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_id")

    private String configurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy")

    private BackupStrategyOption backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_resource_id")

    private String dedicatedResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_option")

    private String sslOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private ChargeInfoOption chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_info")

    private RestoreInfo restoreInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_detail")

    private AvailabilityZoneDetail availabilityZoneDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_access_control_settings")

    private LbAccessControlSettings lbAccessControlSettings;

    public CreateInstanceRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 实例名称，允许和已有名称重复。 **约束限制：** 区分大小写，可以包含字母、数字（0~9）、中划线（-）或者下划线（_），不能包含其他特殊字符。 **取值范围：** 长度为4~64位，必须以字母开头（A~Z或a~z）。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstanceRequestBody withDatastore(DatastoreOption datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateInstanceRequestBody withDatastore(Consumer<DatastoreOption> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new DatastoreOption();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public DatastoreOption getDatastore() {
        return datastore;
    }

    public void setDatastore(DatastoreOption datastore) {
        this.datastore = datastore;
    }

    public CreateInstanceRequestBody withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 区域ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 非空。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateInstanceRequestBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释：** 可用区ID。 **约束限制：** 不涉及。 **取值范围：** 取值：请参见查询所有实例规格信息中返回的“az_status” ，支持创建3可用区实例，中间以逗号隔开。 **默认取值：** 不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateInstanceRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释：** 虚拟私有云ID。 **约束限制：**  获取方法如下：   - 方法1：登录虚拟私有云服务的控制台界面，在虚拟私有云的详情页面查找VPC ID。   - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考查询VPC列表。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateInstanceRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释：** 子网的网络ID。 **约束限制：** 不涉及。 **取值范围：**  获取方法如下：   - 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找网络ID。   - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考查询子网列表。 **默认取值：** 不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateInstanceRequestBody withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * **参数解释：** 安全组ID。 **约束限制：** 不涉及。 **取值范围：**  获取方法如下：   - 方法1：登录虚拟私有云服务的控制台界面，在安全组的详情页面查找安全组ID。   - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考查询安全组列表。 **默认取值：** 不涉及。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateInstanceRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数解释：** 数据库密码。 **约束限制：** 不涉及。 **取值范围：** 长度为8~32位，必须是大写字母（A~Z）、小写字母（a~z）、数字（0~9）、特殊字符~!@#%^*-_=+?的组合。建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。 **默认取值：** 不涉及。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateInstanceRequestBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释：** 实例类型。 **约束限制：** 不涉及。 **取值范围：**   -  GeminiDB Cassandra支持经典部署模式集群类型，取值为“Cluster”。   -  GeminiDB Cassandra支持云原生部署模式集群类型，取值“CloudNativeCluster”。   -  GeminiDB Mongo4.0版本支持副本集类型，取值为“ReplicaSet”。   -  GeminiDB Influx支持经典部署模式集群类型，取值为“Cluster”。   -  GeminiDB Influx支持云原生部署模式集群增强类型，取值为“CloudNativeCluster”。   -  GeminiDB Influx支持经典部署模式单节点类型，取值为“InfluxdbSingle”。   -  GeminiDB Influx支持经典部署模式集群增强类型，取值为“EnhancedCluster”。   -  GeminiDB Redis支持经典部署模式Proxy集群类型，取值为“Cluster”。   -  GeminiDB redis支持云原生部署模式集群类型，取值为“CloudNativeCluster”。   -  GeminiDB Redis支持经典部署模式Cluster集群类型，取值为“RedisCluster”   -  GeminiDB Redis支持经典部署模式主备类型，取值为“Replication”。   -  GeminiDB兼容DynamoDB支持经典部署模式集群类型，取值为“Cluster”。   -  GeminiDB兼容DynamoDB支持云原生部署模式集群类型，取值“CloudNativeCluster”。   -  GeminiDB HBase支持经典部署模式集群类型，取值为“Cluster”。   -  GeminiDB HBase支持云原生部署模式集群类型，取值“CloudNativeCluster”。 **默认取值：** 不涉及。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public CreateInstanceRequestBody withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * **参数解释：** 产品类型。 **约束限制：** 当创建GeminiDB Redis云原生部署模式集群类型必传此参数。 **取值范围：** - Capacity 容量型 **默认取值：** 不涉及。
     * @return productType
     */
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public CreateInstanceRequestBody withFlavor(List<CreateInstanceFlavorOption> flavor) {
        this.flavor = flavor;
        return this;
    }

    public CreateInstanceRequestBody addFlavorItem(CreateInstanceFlavorOption flavorItem) {
        if (this.flavor == null) {
            this.flavor = new ArrayList<>();
        }
        this.flavor.add(flavorItem);
        return this;
    }

    public CreateInstanceRequestBody withFlavor(Consumer<List<CreateInstanceFlavorOption>> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new ArrayList<>();
        }
        flavorSetter.accept(this.flavor);
        return this;
    }

    /**
     * **参数解释：** 实例规格详情。 **约束限制：** 获取方法请参见查询所有实例规格信息中响应“flavors”字段下参数的值。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return flavor
     */
    public List<CreateInstanceFlavorOption> getFlavor() {
        return flavor;
    }

    public void setFlavor(List<CreateInstanceFlavorOption> flavor) {
        this.flavor = flavor;
    }

    public CreateInstanceRequestBody withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    /**
     * **参数解释：** 磁盘加密时的密钥ID，创建实例时不传该参数，表示不进行磁盘加密。 **约束限制：** 备份恢复新实例时不支持指定该参数，如果原实例使用了磁盘加密，新实例复用原实例加密的密钥ID。 该参数仅GeminiDB influx 云原生部署模式集群增强版实例类型、GeminiDB Cassandra经典部署模式实例类型、GeminiDB兼容DynamoDB实例类型支持。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return diskEncryptionId
     */
    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    public CreateInstanceRequestBody withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * **参数解释：** '参数模板ID。' **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public CreateInstanceRequestBody withBackupStrategy(BackupStrategyOption backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public CreateInstanceRequestBody withBackupStrategy(Consumer<BackupStrategyOption> backupStrategySetter) {
        if (this.backupStrategy == null) {
            this.backupStrategy = new BackupStrategyOption();
            backupStrategySetter.accept(this.backupStrategy);
        }

        return this;
    }

    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public BackupStrategyOption getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(BackupStrategyOption backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public CreateInstanceRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** '企业项目ID。' **约束限制：**   -对于未开通企业多项目服务的用户，不传该参数。   -对于已开通企业多项目服务的用户，不传该参数时，表示为default企业项目。获取方式请参见《企业管理API参考》的“查询企业项目列表”响应消息表“enterprise_project字段数据结构说明”的“id”。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateInstanceRequestBody withDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
        return this;
    }

    /**
     * **参数解释：** '专属资源ID。' **约束限制：** 只有开通专属资源池后才可以下发此参数。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return dedicatedResourceId
     */
    public String getDedicatedResourceId() {
        return dedicatedResourceId;
    }

    public void setDedicatedResourceId(String dedicatedResourceId) {
        this.dedicatedResourceId = dedicatedResourceId;
    }

    public CreateInstanceRequestBody withSslOption(String sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    /**
     * **参数解释：** SSL开关选项。 **约束限制：** 不涉及。 **取值范围：** - 取“0”，表示DDS实例默认不启用SSL连接。 - 取“1”，表示DDS实例默认启用SSL连接。 - 不传该参数时，默认不启用SSL连接。 **默认取值：** 不涉及。
     * @return sslOption
     */
    public String getSslOption() {
        return sslOption;
    }

    public void setSslOption(String sslOption) {
        this.sslOption = sslOption;
    }

    public CreateInstanceRequestBody withChargeInfo(ChargeInfoOption chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public CreateInstanceRequestBody withChargeInfo(Consumer<ChargeInfoOption> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new ChargeInfoOption();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public ChargeInfoOption getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(ChargeInfoOption chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public CreateInstanceRequestBody withRestoreInfo(RestoreInfo restoreInfo) {
        this.restoreInfo = restoreInfo;
        return this;
    }

    public CreateInstanceRequestBody withRestoreInfo(Consumer<RestoreInfo> restoreInfoSetter) {
        if (this.restoreInfo == null) {
            this.restoreInfo = new RestoreInfo();
            restoreInfoSetter.accept(this.restoreInfo);
        }

        return this;
    }

    /**
     * Get restoreInfo
     * @return restoreInfo
     */
    public RestoreInfo getRestoreInfo() {
        return restoreInfo;
    }

    public void setRestoreInfo(RestoreInfo restoreInfo) {
        this.restoreInfo = restoreInfo;
    }

    public CreateInstanceRequestBody withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释：** 数据库访问端口号。 **约束限制：** 目前仅支持GeminiDB Redis实例支持自定义端口，取值范围为：1024~65535，禁用端口号为：2180、2887、3887、6377、6378、6380、8018、8079、8091、8479、8484、8999、12017、12333、50069。  不指定端口时，创建GeminiDB Redis实例的访问端口默认为6379。  如果该实例计划用于搭建双活容灾场景，请配置为8635端口。 **取值范围：** 取值范围为：1024~65535，禁用端口号为：2180、2887、3887、6377、6378、6380、8018、8079、8091、8479、8484、8999、12017、12333、50069。 **默认取值：** 6379。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public CreateInstanceRequestBody withAvailabilityZoneDetail(AvailabilityZoneDetail availabilityZoneDetail) {
        this.availabilityZoneDetail = availabilityZoneDetail;
        return this;
    }

    public CreateInstanceRequestBody withAvailabilityZoneDetail(
        Consumer<AvailabilityZoneDetail> availabilityZoneDetailSetter) {
        if (this.availabilityZoneDetail == null) {
            this.availabilityZoneDetail = new AvailabilityZoneDetail();
            availabilityZoneDetailSetter.accept(this.availabilityZoneDetail);
        }

        return this;
    }

    /**
     * Get availabilityZoneDetail
     * @return availabilityZoneDetail
     */
    public AvailabilityZoneDetail getAvailabilityZoneDetail() {
        return availabilityZoneDetail;
    }

    public void setAvailabilityZoneDetail(AvailabilityZoneDetail availabilityZoneDetail) {
        this.availabilityZoneDetail = availabilityZoneDetail;
    }

    public CreateInstanceRequestBody withLbAccessControlSettings(LbAccessControlSettings lbAccessControlSettings) {
        this.lbAccessControlSettings = lbAccessControlSettings;
        return this;
    }

    public CreateInstanceRequestBody withLbAccessControlSettings(
        Consumer<LbAccessControlSettings> lbAccessControlSettingsSetter) {
        if (this.lbAccessControlSettings == null) {
            this.lbAccessControlSettings = new LbAccessControlSettings();
            lbAccessControlSettingsSetter.accept(this.lbAccessControlSettings);
        }

        return this;
    }

    /**
     * Get lbAccessControlSettings
     * @return lbAccessControlSettings
     */
    public LbAccessControlSettings getLbAccessControlSettings() {
        return lbAccessControlSettings;
    }

    public void setLbAccessControlSettings(LbAccessControlSettings lbAccessControlSettings) {
        this.lbAccessControlSettings = lbAccessControlSettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceRequestBody that = (CreateInstanceRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.region, that.region) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.password, that.password) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.productType, that.productType) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.diskEncryptionId, that.diskEncryptionId)
            && Objects.equals(this.configurationId, that.configurationId)
            && Objects.equals(this.backupStrategy, that.backupStrategy)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.dedicatedResourceId, that.dedicatedResourceId)
            && Objects.equals(this.sslOption, that.sslOption) && Objects.equals(this.chargeInfo, that.chargeInfo)
            && Objects.equals(this.restoreInfo, that.restoreInfo) && Objects.equals(this.port, that.port)
            && Objects.equals(this.availabilityZoneDetail, that.availabilityZoneDetail)
            && Objects.equals(this.lbAccessControlSettings, that.lbAccessControlSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            datastore,
            region,
            availabilityZone,
            vpcId,
            subnetId,
            securityGroupId,
            password,
            mode,
            productType,
            flavor,
            diskEncryptionId,
            configurationId,
            backupStrategy,
            enterpriseProjectId,
            dedicatedResourceId,
            sslOption,
            chargeInfo,
            restoreInfo,
            port,
            availabilityZoneDetail,
            lbAccessControlSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    diskEncryptionId: ").append(toIndentedString(diskEncryptionId)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    dedicatedResourceId: ").append(toIndentedString(dedicatedResourceId)).append("\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    restoreInfo: ").append(toIndentedString(restoreInfo)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    availabilityZoneDetail: ").append(toIndentedString(availabilityZoneDetail)).append("\n");
        sb.append("    lbAccessControlSettings: ").append(toIndentedString(lbAccessControlSettings)).append("\n");
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
