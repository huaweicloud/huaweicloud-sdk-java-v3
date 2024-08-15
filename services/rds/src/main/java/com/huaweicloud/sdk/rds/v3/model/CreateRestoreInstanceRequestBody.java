package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例信息。
 */
public class CreateRestoreInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private Datastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha")

    private Ha ha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_id")

    private String configurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy")

    private BackupStrategy backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encryption_id")

    private String diskEncryptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private Volume volume;

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
    @JsonProperty(value = "data_vip")

    private String dataVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private ChargeInfo chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsspool_id")

    private String dsspoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_point")

    private RestorePoint restorePoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collation")

    private String collation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagWithKeyValue> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverless_info")

    private ServerlessInfo serverlessInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    public CreateRestoreInstanceRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。 用于表示实例的名称，同一租户下，同类型的实例名可重名。取值范围如下： - MySQL数据库支持的字符长度是4~64个字符，必须以字母开头，区分大小写，可以包含字母、数字、中文字符、中划线或者下划线，不能包含其他的特殊字符。 - PostgreSQL和SQL Server数据库支持的字符长度是4~64个字符，必须以字母开头，区分大小写，可以包含字母、数字、中划线或者下划线，不能包含其他的特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRestoreInstanceRequestBody withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateRestoreInstanceRequestBody withDatastore(Consumer<Datastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new Datastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public CreateRestoreInstanceRequestBody withHa(Ha ha) {
        this.ha = ha;
        return this;
    }

    public CreateRestoreInstanceRequestBody withHa(Consumer<Ha> haSetter) {
        if (this.ha == null) {
            this.ha = new Ha();
            haSetter.accept(this.ha);
        }

        return this;
    }

    /**
     * Get ha
     * @return ha
     */
    public Ha getHa() {
        return ha;
    }

    public void setHa(Ha ha) {
        this.ha = ha;
    }

    public CreateRestoreInstanceRequestBody withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * 参数模板ID。可调用[获取参数模板列表](https://support.huaweicloud.com/api-rds/rds_09_0301.html)接口返回的ID获取。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public CreateRestoreInstanceRequestBody withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 数据库端口信息。  - MySQL数据库端口设置范围为1024～65535（其中12017和33071被RDS系统占用不可设置）。 - PostgreSQL数据库端口修改范围为2100～9500。 - Microsoft SQL Server实例的端口设置范围为1433和2100~9500（其中5355和5985不可设置。对于2017 EE、2017 SE、2017 Web版，5050、5353和5986不可设置。  当不传该参数时，默认端口如下：  - MySQL默认3306。 - PostgreSQL默认5432。 - Microsoft SQL Server默认1433。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public CreateRestoreInstanceRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 数据库密码。创建只读实例时不可选，其它场景必选。  取值范围：  非空，由大小写字母、数字和特殊符号~!@#%^*-_=+?组成，长度8~32个字符。  其中允许的特殊字符如下： - MySQL数据库允许输入~!@#$%^*-_=+?,特殊字符。 - SQL Server数据库允许输入~!@#$%^*-_+?,特殊字符。 - PostgreSQL数据库允许输入~!@#%^*-_=+?,特殊字符。  建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateRestoreInstanceRequestBody withBackupStrategy(BackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public CreateRestoreInstanceRequestBody withBackupStrategy(Consumer<BackupStrategy> backupStrategySetter) {
        if (this.backupStrategy == null) {
            this.backupStrategy = new BackupStrategy();
            backupStrategySetter.accept(this.backupStrategy);
        }

        return this;
    }

    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public BackupStrategy getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(BackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public CreateRestoreInstanceRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。 使用请参考《企业管理 API参考》的[查询企业项目列表](https://support.huaweicloud.com/api-em/zh-cn_topic_0121230880.html)响应消息表“enterprise_project字段数据结构说明”的“id”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateRestoreInstanceRequestBody withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    /**
     * 用于磁盘加密的密钥ID，默认为空。
     * @return diskEncryptionId
     */
    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    public CreateRestoreInstanceRequestBody withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 规格码,取值范围：非空。 使用[查询数据库规格](https://support.huaweicloud.com/api-rds/rds_06_0002.html)接口响应消息中的 flavors字段中“spec_code”获取且对应az_status为“在售”状态。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CreateRestoreInstanceRequestBody withVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public CreateRestoreInstanceRequestBody withVolume(Consumer<Volume> volumeSetter) {
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

    public CreateRestoreInstanceRequestBody withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域ID。创建主实例时必选，其它场景不可选。 取值参见OpenAPI查询数据库规格(https://console.huaweicloud.com/apiexplorer/#/openapi/RDS/doc?api=ListFlavors)响应体的az_desc字段。 SQL Server数据库和PostgreSQL数据库备份恢复到新实例时为必填项。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateRestoreInstanceRequestBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区ID。对于数据库实例类型不是单机的实例，需要分别为实例所有节点指定可用区，并用逗号隔开。 取值参见OpenAPI查询数据库规格(https://console.huaweicloud.com/apiexplorer/#/openapi/RDS/doc?api=ListFlavors)响应体的az_desc字段。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateRestoreInstanceRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID。创建只读实例时不可选（只读实例的网络属性默认和主实例相同），其它场景必选。 获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，在虚拟私有云的详情页面查找VPC ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询VPC列表](https://support.huaweicloud.com/api-vpc/vpc_api01_0003.html)。 SQL Server数据库和PostgreSQL数据库备份恢复到新实例时为必填项。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateRestoreInstanceRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网的网络ID信息。创建只读实例时不可选（只读实例的网络属性默认和主实例相同），其它场景必选。 获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找网络ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询子网列表](https://support.huaweicloud.com/api-vpc/vpc_subnet01_0003.html)。 SQL Server数据库和PostgreSQL数据库备份恢复到新实例时为必填项。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateRestoreInstanceRequestBody withDataVip(String dataVip) {
        this.dataVip = dataVip;
        return this;
    }

    /**
     * 指定实例的内网IP,目前仅支持设置IPv4地址。 获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找子网的网段，选择未被占用的IP。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询私有IP列表](https://support.huaweicloud.com/api-vpc/vpc_privateip_0003.html),选择“device_owner”为空的私有IP。
     * @return dataVip
     */
    public String getDataVip() {
        return dataVip;
    }

    public void setDataVip(String dataVip) {
        this.dataVip = dataVip;
    }

    public CreateRestoreInstanceRequestBody withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。创建只读实例时不可选（只读实例的网络属性默认和主实例相同），其它场景必选。 获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，在安全组的详情页面查找安全组ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询安全组列表](https://support.huaweicloud.com/api-vpc/vpc_sg01_0003.html)。 SQL Server数据库和PostgreSQL数据库备份恢复到新实例时为必填项。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateRestoreInstanceRequestBody withChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public CreateRestoreInstanceRequestBody withChargeInfo(Consumer<ChargeInfo> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new ChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public ChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public CreateRestoreInstanceRequestBody withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。  - 不选择时，各个引擎时区如下：   - MySQL国内站、国际站默认为UTC时间。   - PostgreSQL国内站、国际站默认为UTC时间。   - Microsoft SQL Server国内站默认为China Standard Time，国际站默认为UTC时间。 - MySQL和PostgreSQL引擎选择填写时，取值范围为UTC-12:00~UTC+12:00，且只支持整段时间，如UTC+08:00，不支持UTC+08:30。 - Microsoft SQL Server引擎选择填写时，请参见“创建数据库实例”接口[表10](https://support.huaweicloud.com/api-rds/rds_01_0002.html#rds_01_0002__table613473883617) 时区与UTC偏移量对照表，填写时区列字符串，如：China Standard Time。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CreateRestoreInstanceRequestBody withDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
        return this;
    }

    /**
     * Dec用户专属存储ID，每个az配置的专属存储不同，Dec用户创建实例时，对于数据库实例类型不是单机或只读的实例，需要分别为实例所有节点指定dsspoolId，并用逗号隔开。 获取方法如下： - 方法1：登录专属分布式存储服务DSS的控制台界面，查看专属存储列表，选择符合条件的az下的专属dss的ID。 - 方法2：通过专属分布式存储服务DSS的API接口查询，具体操作可参考[获取专属存储详情列表](https://support.huaweicloud.com/api-dss/dss_02_1002.html)。
     * @return dsspoolId
     */
    public String getDsspoolId() {
        return dsspoolId;
    }

    public void setDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
    }

    public CreateRestoreInstanceRequestBody withRestorePoint(RestorePoint restorePoint) {
        this.restorePoint = restorePoint;
        return this;
    }

    public CreateRestoreInstanceRequestBody withRestorePoint(Consumer<RestorePoint> restorePointSetter) {
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

    public CreateRestoreInstanceRequestBody withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * 仅限Microsoft SQL Server实例创建使用。对于MySQL和PostgreSQL实例，该参数无意义。取值范围：根据查询SQL Server可用字符集的字符集查询列表查询可设置的字符集。 取值范围：根据[查询SQL Server可用字符集](https://support.huaweicloud.com/api-rds/rds_05_0010.html)查询可设置的字符集。
     * @return collation
     */
    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    public CreateRestoreInstanceRequestBody withTags(List<TagWithKeyValue> tags) {
        this.tags = tags;
        return this;
    }

    public CreateRestoreInstanceRequestBody addTagsItem(TagWithKeyValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateRestoreInstanceRequestBody withTags(Consumer<List<TagWithKeyValue>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。单个实例总标签数上限20个。
     * @return tags
     */
    public List<TagWithKeyValue> getTags() {
        return tags;
    }

    public void setTags(List<TagWithKeyValue> tags) {
        this.tags = tags;
    }

    public CreateRestoreInstanceRequestBody withServerlessInfo(ServerlessInfo serverlessInfo) {
        this.serverlessInfo = serverlessInfo;
        return this;
    }

    public CreateRestoreInstanceRequestBody withServerlessInfo(Consumer<ServerlessInfo> serverlessInfoSetter) {
        if (this.serverlessInfo == null) {
            this.serverlessInfo = new ServerlessInfo();
            serverlessInfoSetter.accept(this.serverlessInfo);
        }

        return this;
    }

    /**
     * Get serverlessInfo
     * @return serverlessInfo
     */
    public ServerlessInfo getServerlessInfo() {
        return serverlessInfo;
    }

    public void setServerlessInfo(ServerlessInfo serverlessInfo) {
        this.serverlessInfo = serverlessInfo;
    }

    public CreateRestoreInstanceRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 是否只预检此次请求，仅支持MySQL。 - true：发送参数检查请求，不会创建实例。   - 检查通过：返回202状态码。   - 检查不通过：返回对应错误码，详情请参考错误码。 - false：发送正常请求，通过检查后，并且执行创建实例的请求。
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRestoreInstanceRequestBody that = (CreateRestoreInstanceRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.ha, that.ha) && Objects.equals(this.configurationId, that.configurationId)
            && Objects.equals(this.port, that.port) && Objects.equals(this.password, that.password)
            && Objects.equals(this.backupStrategy, that.backupStrategy)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.diskEncryptionId, that.diskEncryptionId)
            && Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.region, that.region) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.dataVip, that.dataVip) && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.chargeInfo, that.chargeInfo) && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.dsspoolId, that.dsspoolId) && Objects.equals(this.restorePoint, that.restorePoint)
            && Objects.equals(this.collation, that.collation) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.serverlessInfo, that.serverlessInfo) && Objects.equals(this.dryRun, that.dryRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            datastore,
            ha,
            configurationId,
            port,
            password,
            backupStrategy,
            enterpriseProjectId,
            diskEncryptionId,
            flavorRef,
            volume,
            region,
            availabilityZone,
            vpcId,
            subnetId,
            dataVip,
            securityGroupId,
            chargeInfo,
            timeZone,
            dsspoolId,
            restorePoint,
            collation,
            tags,
            serverlessInfo,
            dryRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRestoreInstanceRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    diskEncryptionId: ").append(toIndentedString(diskEncryptionId)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    dataVip: ").append(toIndentedString(dataVip)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    dsspoolId: ").append(toIndentedString(dsspoolId)).append("\n");
        sb.append("    restorePoint: ").append(toIndentedString(restorePoint)).append("\n");
        sb.append("    collation: ").append(toIndentedString(collation)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    serverlessInfo: ").append(toIndentedString(serverlessInfo)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
