package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussBackupStrategy;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussChargeInfo;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussDatastore;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussHa;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussVolume;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例信息
 */
public class OpenGaussInstanceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    @JacksonXmlProperty(localName = "datastore")
    
    private OpenGaussDatastore datastore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ha")
    
    @JacksonXmlProperty(localName = "ha")
    
    private OpenGaussHa ha;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_id")
    
    @JacksonXmlProperty(localName = "configuration_id")
    
    private String configurationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    @JacksonXmlProperty(localName = "port")
    
    private String port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    @JacksonXmlProperty(localName = "password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_strategy")
    
    @JacksonXmlProperty(localName = "backup_strategy")
    
    private OpenGaussBackupStrategy backupStrategy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    @JacksonXmlProperty(localName = "enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_encryption_id")
    
    @JacksonXmlProperty(localName = "disk_encryption_id")
    
    private String diskEncryptionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_ref")
    
    @JacksonXmlProperty(localName = "flavor_ref")
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    
    @JacksonXmlProperty(localName = "volume")
    
    private OpenGaussVolume volume;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    @JacksonXmlProperty(localName = "region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    @JacksonXmlProperty(localName = "availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    @JacksonXmlProperty(localName = "vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    @JacksonXmlProperty(localName = "subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    @JacksonXmlProperty(localName = "security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_info")
    
    @JacksonXmlProperty(localName = "charge_info")
    
    private OpenGaussChargeInfo chargeInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_zone")
    
    @JacksonXmlProperty(localName = "time_zone")
    
    private String timeZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sharding_num")
    
    @JacksonXmlProperty(localName = "sharding_num")
    
    private Integer shardingNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coordinator_num")
    
    @JacksonXmlProperty(localName = "coordinator_num")
    
    private Integer coordinatorNum;
    /**
     * 实例副本数，支持取值2，3。不填默认为3。仅支持1.3.0及以上版本的实例。  说明： 2副本选项仅针对特定用户开放，如需配置白名单权限，您可以在管理控制台右上角，选择“[工单 > 新建工单](https://auth.huaweicloud.com/authui/login.html?service=https%3A%2F%2Fconsole.huaweicloud.com%2Fticket%2F%3Fregion%3Dcn-north-1%26locale%3Dzh-cn%26cloud_route_state%3D%2Fticketindex%2FcreateIndex#/login)”，提交开通白名单的申请。
     */
    public static final class ReplicaNumEnum {

        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ReplicaNumEnum NUMBER_2 = new ReplicaNumEnum(2);
        
        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final ReplicaNumEnum NUMBER_3 = new ReplicaNumEnum(3);
        

        private static final Map<Integer, ReplicaNumEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ReplicaNumEnum> createStaticFields() {
            Map<Integer, ReplicaNumEnum> map = new HashMap<>();
            map.put(2, NUMBER_2);
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
            if( value == null ){
                return null;
            }
            ReplicaNumEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReplicaNumEnum(value);
            }
            return result;
        }

        public static ReplicaNumEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            ReplicaNumEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="replica_num")
    
    @JacksonXmlProperty(localName = "replica_num")
    
    private ReplicaNumEnum replicaNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_force_switch")
    
    @JacksonXmlProperty(localName = "enable_force_switch")
    
    private Boolean enableForceSwitch;

    public OpenGaussInstanceRequest withName(String name) {
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

    

    public OpenGaussInstanceRequest withDatastore(OpenGaussDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public OpenGaussInstanceRequest withDatastore(Consumer<OpenGaussDatastore> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new OpenGaussDatastore();
            datastoreSetter.accept(this.datastore);
        }
        
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public OpenGaussDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(OpenGaussDatastore datastore) {
        this.datastore = datastore;
    }

    

    public OpenGaussInstanceRequest withHa(OpenGaussHa ha) {
        this.ha = ha;
        return this;
    }

    public OpenGaussInstanceRequest withHa(Consumer<OpenGaussHa> haSetter) {
        if(this.ha == null ){
            this.ha = new OpenGaussHa();
            haSetter.accept(this.ha);
        }
        
        return this;
    }


    /**
     * Get ha
     * @return ha
     */
    public OpenGaussHa getHa() {
        return ha;
    }

    public void setHa(OpenGaussHa ha) {
        this.ha = ha;
    }

    

    public OpenGaussInstanceRequest withConfigurationId(String configurationId) {
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

    

    public OpenGaussInstanceRequest withPort(String port) {
        this.port = port;
        return this;
    }

    


    /**
     * 数据库对外开放的端口，不填默认为8000，可选范围为：1024-39998。限制端口： 2378,2379,2380,4999,5000,5999,6000,6001,8097,8098,12016,12017,20049,20050,21731,21732,32122,32123,32124。  - GaussDB(for openGauss)数据库端口当前只支持设置为8000，当不传该参数时，默认端口为8000。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    

    public OpenGaussInstanceRequest withPassword(String password) {
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

    

    public OpenGaussInstanceRequest withBackupStrategy(OpenGaussBackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public OpenGaussInstanceRequest withBackupStrategy(Consumer<OpenGaussBackupStrategy> backupStrategySetter) {
        if(this.backupStrategy == null ){
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

    

    public OpenGaussInstanceRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    

    public OpenGaussInstanceRequest withDiskEncryptionId(String diskEncryptionId) {
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

    

    public OpenGaussInstanceRequest withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 规格码，取值范围：非空。参考[表1](https://support.huaweicloud.com/api-opengauss/opengauss_api_0037.html#opengauss_api_0037__ted9b9d433c8a4c52884e199e17f94479)中GaussDB(for openGauss)的“规格编码”列内容获取。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    

    public OpenGaussInstanceRequest withVolume(OpenGaussVolume volume) {
        this.volume = volume;
        return this;
    }

    public OpenGaussInstanceRequest withVolume(Consumer<OpenGaussVolume> volumeSetter) {
        if(this.volume == null ){
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

    

    public OpenGaussInstanceRequest withRegion(String region) {
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

    

    public OpenGaussInstanceRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 可用区ID。  GaussDB(for openGauss)取值范围：非空，可选部署在同一可用区或三个不同可用区，可用区之间用逗号隔开。详见示例。  - 部署在同一可用区：需要输入三个相同的可用区。例如：部署在“cn-north-4a”可用区，则需要在此处输入\"cn-north-4a,cn-north-4a,cn-north-4a\"。 - 部署在三个不同可用区：需要分别输入三个不同的可用区。 取值范围：非空，请参见[地区和终端节点](https://developer.huaweicloud.com/endpoint)。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    

    public OpenGaussInstanceRequest withVpcId(String vpcId) {
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

    

    public OpenGaussInstanceRequest withSubnetId(String subnetId) {
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

    

    public OpenGaussInstanceRequest withSecurityGroupId(String securityGroupId) {
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

    

    public OpenGaussInstanceRequest withChargeInfo(OpenGaussChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public OpenGaussInstanceRequest withChargeInfo(Consumer<OpenGaussChargeInfo> chargeInfoSetter) {
        if(this.chargeInfo == null ){
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

    

    public OpenGaussInstanceRequest withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    


    /**
     * UTC时区。  - 不选择时，GaussDB(for openGauss)国内站、默认为UTC时间。 - 选择填写时，取值范围为UTC-12:00~UTC+12:00，且只支持整段时间，如UTC+08:00，不支持UTC+08:30。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    

    public OpenGaussInstanceRequest withShardingNum(Integer shardingNum) {
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

    

    public OpenGaussInstanceRequest withCoordinatorNum(Integer coordinatorNum) {
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

    

    public OpenGaussInstanceRequest withReplicaNum(ReplicaNumEnum replicaNum) {
        this.replicaNum = replicaNum;
        return this;
    }

    


    /**
     * 实例副本数，支持取值2，3。不填默认为3。仅支持1.3.0及以上版本的实例。  说明： 2副本选项仅针对特定用户开放，如需配置白名单权限，您可以在管理控制台右上角，选择“[工单 > 新建工单](https://auth.huaweicloud.com/authui/login.html?service=https%3A%2F%2Fconsole.huaweicloud.com%2Fticket%2F%3Fregion%3Dcn-north-1%26locale%3Dzh-cn%26cloud_route_state%3D%2Fticketindex%2FcreateIndex#/login)”，提交开通白名单的申请。
     * @return replicaNum
     */
    public ReplicaNumEnum getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(ReplicaNumEnum replicaNum) {
        this.replicaNum = replicaNum;
    }

    

    public OpenGaussInstanceRequest withEnableForceSwitch(Boolean enableForceSwitch) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenGaussInstanceRequest openGaussInstanceRequest = (OpenGaussInstanceRequest) o;
        return Objects.equals(this.name, openGaussInstanceRequest.name) &&
            Objects.equals(this.datastore, openGaussInstanceRequest.datastore) &&
            Objects.equals(this.ha, openGaussInstanceRequest.ha) &&
            Objects.equals(this.configurationId, openGaussInstanceRequest.configurationId) &&
            Objects.equals(this.port, openGaussInstanceRequest.port) &&
            Objects.equals(this.password, openGaussInstanceRequest.password) &&
            Objects.equals(this.backupStrategy, openGaussInstanceRequest.backupStrategy) &&
            Objects.equals(this.enterpriseProjectId, openGaussInstanceRequest.enterpriseProjectId) &&
            Objects.equals(this.diskEncryptionId, openGaussInstanceRequest.diskEncryptionId) &&
            Objects.equals(this.flavorRef, openGaussInstanceRequest.flavorRef) &&
            Objects.equals(this.volume, openGaussInstanceRequest.volume) &&
            Objects.equals(this.region, openGaussInstanceRequest.region) &&
            Objects.equals(this.availabilityZone, openGaussInstanceRequest.availabilityZone) &&
            Objects.equals(this.vpcId, openGaussInstanceRequest.vpcId) &&
            Objects.equals(this.subnetId, openGaussInstanceRequest.subnetId) &&
            Objects.equals(this.securityGroupId, openGaussInstanceRequest.securityGroupId) &&
            Objects.equals(this.chargeInfo, openGaussInstanceRequest.chargeInfo) &&
            Objects.equals(this.timeZone, openGaussInstanceRequest.timeZone) &&
            Objects.equals(this.shardingNum, openGaussInstanceRequest.shardingNum) &&
            Objects.equals(this.coordinatorNum, openGaussInstanceRequest.coordinatorNum) &&
            Objects.equals(this.replicaNum, openGaussInstanceRequest.replicaNum) &&
            Objects.equals(this.enableForceSwitch, openGaussInstanceRequest.enableForceSwitch);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, datastore, ha, configurationId, port, password, backupStrategy, enterpriseProjectId, diskEncryptionId, flavorRef, volume, region, availabilityZone, vpcId, subnetId, securityGroupId, chargeInfo, timeZone, shardingNum, coordinatorNum, replicaNum, enableForceSwitch);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussInstanceRequest {\n");
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

