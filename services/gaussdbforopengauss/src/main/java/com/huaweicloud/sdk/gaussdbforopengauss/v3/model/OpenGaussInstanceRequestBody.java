package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例信息
 */
public class OpenGaussInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private OpenGaussDatastoreOption datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha")

    private OpenGaussHaOption ha;

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

    private OpenGaussBackupStrategy backupStrategy;

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

    private OpenGaussVolume volume;

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
    @JsonProperty(value = "charge_info")

    private OpenGaussChargeInfo chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sharding_num")

    private Integer shardingNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinator_num")

    private Integer coordinatorNum;

    /**
     * 实例副本数，支持取值3。不填默认为3。仅支持1.3.0及以上版本的实例。
     */
    public static final class ReplicaNumEnum {

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final ReplicaNumEnum NUMBER_3 = new ReplicaNumEnum(3);

        private static final Map<Integer, ReplicaNumEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ReplicaNumEnum> createStaticFields() {
            Map<Integer, ReplicaNumEnum> map = new HashMap<>();
            map.put(3, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ReplicaNumEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReplicaNumEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplicaNumEnum(value));
        }

        public static ReplicaNumEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplicaNumEnum) {
                return this.value.equals(((ReplicaNumEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_num")

    private ReplicaNumEnum replicaNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_force_switch")

    private Boolean enableForceSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_single_float_ip")

    private Boolean enableSingleFloatIp;

    public OpenGaussInstanceRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。 用于表示实例的名称，同一租户下，同类型的实例名可重名。  取值范围：4~64个字符之间，必须以字母开头，区分大小写，可以包含字母、数字、中划线或者下划线，不能包含其他的特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpenGaussInstanceRequestBody withDatastore(OpenGaussDatastoreOption datastore) {
        this.datastore = datastore;
        return this;
    }

    public OpenGaussInstanceRequestBody withDatastore(Consumer<OpenGaussDatastoreOption> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new OpenGaussDatastoreOption();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public OpenGaussDatastoreOption getDatastore() {
        return datastore;
    }

    public void setDatastore(OpenGaussDatastoreOption datastore) {
        this.datastore = datastore;
    }

    public OpenGaussInstanceRequestBody withHa(OpenGaussHaOption ha) {
        this.ha = ha;
        return this;
    }

    public OpenGaussInstanceRequestBody withHa(Consumer<OpenGaussHaOption> haSetter) {
        if (this.ha == null) {
            this.ha = new OpenGaussHaOption();
            haSetter.accept(this.ha);
        }

        return this;
    }

    /**
     * Get ha
     * @return ha
     */
    public OpenGaussHaOption getHa() {
        return ha;
    }

    public void setHa(OpenGaussHaOption ha) {
        this.ha = ha;
    }

    public OpenGaussInstanceRequestBody withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * 参数模板ID。当不传该参数时，使用系统默认的参数模板。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public OpenGaussInstanceRequestBody withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 数据库对外开放的端口，不填默认为8000，可选范围为：1024-39998。限制端口： 2378,2379,2380,4999,5000,5999,6000,6001,8097,8098,12016,12017,20049,20050,21731,21732,32122,32123,32124。  - GaussDB数据库端口当前只支持设置为8000，当不传该参数时，默认端口为8000。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public OpenGaussInstanceRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 数据库密码。必选。  取值范围：  '非空； 至少包含大写字母（A-Z），小写字母（a-z），数字（0-9），非字母数字字符（限定为~!@#%^*-_=+?,）四类字符中的三类字符；长度8~32个字符。'  '建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。'
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public OpenGaussInstanceRequestBody withBackupStrategy(OpenGaussBackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public OpenGaussInstanceRequestBody withBackupStrategy(Consumer<OpenGaussBackupStrategy> backupStrategySetter) {
        if (this.backupStrategy == null) {
            this.backupStrategy = new OpenGaussBackupStrategy();
            backupStrategySetter.accept(this.backupStrategy);
        }

        return this;
    }

    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public OpenGaussBackupStrategy getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(OpenGaussBackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public OpenGaussInstanceRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。只有企业租户时该参数才生效。  使用请参考《企业管理 API参考》的“[查询企业项目列表](https://support.huaweicloud.com/api-em/zh-cn_topic_0121230880.html)”响应消息表“enterprise_project字段数据结构说明”的“id”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public OpenGaussInstanceRequestBody withDiskEncryptionId(String diskEncryptionId) {
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

    public OpenGaussInstanceRequestBody withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 规格码，取值范围：非空。参考[表1](https://support.huaweicloud.com/api-opengauss/opengauss_api_0037.html#opengauss_api_0037__ted9b9d433c8a4c52884e199e17f94479)中GaussDB的“规格编码”列内容获取。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public OpenGaussInstanceRequestBody withVolume(OpenGaussVolume volume) {
        this.volume = volume;
        return this;
    }

    public OpenGaussInstanceRequestBody withVolume(Consumer<OpenGaussVolume> volumeSetter) {
        if (this.volume == null) {
            this.volume = new OpenGaussVolume();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public OpenGaussVolume getVolume() {
        return volume;
    }

    public void setVolume(OpenGaussVolume volume) {
        this.volume = volume;
    }

    public OpenGaussInstanceRequestBody withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域ID。  取值范围：非空，请参见[地区和终端节点](https://developer.huaweicloud.com/endpoint)。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public OpenGaussInstanceRequestBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区ID。  GaussDB取值范围：非空，可选部署在同一可用区或三个不同可用区，可用区之间用逗号隔开。详见示例。  - 部署在同一可用区：需要输入三个相同的可用区。例如：部署在“cn-north-4a”可用区，则需要在此处输入\"cn-north-4a,cn-north-4a,cn-north-4a\"。 - 部署在三个不同可用区：需要分别输入三个不同的可用区。 取值范围：非空，请参见[地区和终端节点](https://developer.huaweicloud.com/endpoint)。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public OpenGaussInstanceRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID，获取方法如下：  - 方法1：登录虚拟私有云服务的控制台界面，在虚拟私有云的详情页面查找VPC ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询VPC列表](https://support.huaweicloud.com/api-vpc/vpc_api01_0003.html)。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public OpenGaussInstanceRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网的网络ID信息，获取方法如下：  - 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找网络ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询子网列表](https://support.huaweicloud.com/api-vpc/vpc_subnet01_0003.html)。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public OpenGaussInstanceRequestBody withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 指定实例所属的安全组。如果不需要指定安全组，请联系客服申请白名单。  - 方法1：登录虚拟私有云服务的控制台界面，在安全组的详情页面查找安全组ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询安全组列表](https://support.huaweicloud.com/api-vpc/vpc_sg01_0003.html)。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public OpenGaussInstanceRequestBody withChargeInfo(OpenGaussChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public OpenGaussInstanceRequestBody withChargeInfo(Consumer<OpenGaussChargeInfo> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new OpenGaussChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public OpenGaussChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(OpenGaussChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public OpenGaussInstanceRequestBody withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * UTC时区。  - 不选择时，GaussDB国内站、默认为UTC时间。 - 选择填写时，取值范围为UTC-12:00~UTC+12:00，且只支持整段时间，如UTC+08:00，不支持UTC+08:30。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public OpenGaussInstanceRequestBody withShardingNum(Integer shardingNum) {
        this.shardingNum = shardingNum;
        return this;
    }

    /**
     * 仅分布式形态需要填写该参数。分片数量，取值范围1~9。
     * @return shardingNum
     */
    public Integer getShardingNum() {
        return shardingNum;
    }

    public void setShardingNum(Integer shardingNum) {
        this.shardingNum = shardingNum;
    }

    public OpenGaussInstanceRequestBody withCoordinatorNum(Integer coordinatorNum) {
        this.coordinatorNum = coordinatorNum;
        return this;
    }

    /**
     * 仅分布式形态需要填写该参数。协调节点数量，取值范围1~9。CN数量必须小于或等于两倍的分片数。
     * @return coordinatorNum
     */
    public Integer getCoordinatorNum() {
        return coordinatorNum;
    }

    public void setCoordinatorNum(Integer coordinatorNum) {
        this.coordinatorNum = coordinatorNum;
    }

    public OpenGaussInstanceRequestBody withReplicaNum(ReplicaNumEnum replicaNum) {
        this.replicaNum = replicaNum;
        return this;
    }

    /**
     * 实例副本数，支持取值3。不填默认为3。仅支持1.3.0及以上版本的实例。
     * @return replicaNum
     */
    public ReplicaNumEnum getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(ReplicaNumEnum replicaNum) {
        this.replicaNum = replicaNum;
    }

    public OpenGaussInstanceRequestBody withEnableForceSwitch(Boolean enableForceSwitch) {
        this.enableForceSwitch = enableForceSwitch;
        return this;
    }

    /**
     * enable_force_switch表示是否开启备机强升主功能，enable_force_switch=true表示开启备机强升主功能，enable_force_switch=false表示关闭，默认关闭。仅支持1.2.2及以上版本。  说明：  备机强升主功能适用场景：在主机发生故障后，为了保障集群的可用性，强制拉起备机作为新主机对外提供服务的场景。 本功能在集群故障状态下，以丢失部分数据为代价换取集群尽可能快的恢复服务。本功能是集群状态为不可用时的一个逃生方法，如果操作者不清楚备机强升后丢失数据对业务的影响，请勿使用本功能。 备机强升主相关介绍请参考《故障处理》备机强升主章节。
     * @return enableForceSwitch
     */
    public Boolean getEnableForceSwitch() {
        return enableForceSwitch;
    }

    public void setEnableForceSwitch(Boolean enableForceSwitch) {
        this.enableForceSwitch = enableForceSwitch;
    }

    public OpenGaussInstanceRequestBody withEnableSingleFloatIp(Boolean enableSingleFloatIp) {
        this.enableSingleFloatIp = enableSingleFloatIp;
        return this;
    }

    /**
     * 单浮动IP策略，仅主备版支持。默认值是false，表示不开启单浮动IP策略。 取值范围： true：开启单浮动IP策略，实例将只有一个浮动IP绑定主节点，如果发生主备倒换，浮动IP不会发生变化。 false：不开启单浮动IP策略，每个节点都会绑定一个浮动IP，如果发生主备倒换，浮动IP会发生变化。 说明： 仅支持3.206及以上版本的主备版实例。
     * @return enableSingleFloatIp
     */
    public Boolean getEnableSingleFloatIp() {
        return enableSingleFloatIp;
    }

    public void setEnableSingleFloatIp(Boolean enableSingleFloatIp) {
        this.enableSingleFloatIp = enableSingleFloatIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenGaussInstanceRequestBody that = (OpenGaussInstanceRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.ha, that.ha) && Objects.equals(this.configurationId, that.configurationId)
            && Objects.equals(this.port, that.port) && Objects.equals(this.password, that.password)
            && Objects.equals(this.backupStrategy, that.backupStrategy)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.diskEncryptionId, that.diskEncryptionId)
            && Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.region, that.region) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.chargeInfo, that.chargeInfo) && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.shardingNum, that.shardingNum)
            && Objects.equals(this.coordinatorNum, that.coordinatorNum)
            && Objects.equals(this.replicaNum, that.replicaNum)
            && Objects.equals(this.enableForceSwitch, that.enableForceSwitch)
            && Objects.equals(this.enableSingleFloatIp, that.enableSingleFloatIp);
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
            securityGroupId,
            chargeInfo,
            timeZone,
            shardingNum,
            coordinatorNum,
            replicaNum,
            enableForceSwitch,
            enableSingleFloatIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussInstanceRequestBody {\n");
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
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    shardingNum: ").append(toIndentedString(shardingNum)).append("\n");
        sb.append("    coordinatorNum: ").append(toIndentedString(coordinatorNum)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    enableForceSwitch: ").append(toIndentedString(enableForceSwitch)).append("\n");
        sb.append("    enableSingleFloatIp: ").append(toIndentedString(enableSingleFloatIp)).append("\n");
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
