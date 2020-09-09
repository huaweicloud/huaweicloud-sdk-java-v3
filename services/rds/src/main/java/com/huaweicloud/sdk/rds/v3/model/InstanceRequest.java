package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.BackupStrategy;
import com.huaweicloud.sdk.rds.v3.model.ChargeInfo;
import com.huaweicloud.sdk.rds.v3.model.Datastore;
import com.huaweicloud.sdk.rds.v3.model.Ha;
import com.huaweicloud.sdk.rds.v3.model.RestorePoint;
import com.huaweicloud.sdk.rds.v3.model.Volume;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例信息。
 */
public class InstanceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    private Datastore datastore = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ha")
    
    private Ha ha = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_id")
    
    private String configurationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private String port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_strategy")
    
    private BackupStrategy backupStrategy = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_encryption_id")
    
    private String diskEncryptionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_ref")
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    
    private Volume volume = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_info")
    
    private ChargeInfo chargeInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_zone")
    
    private String timeZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dsspool_id")
    
    private String dsspoolId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replica_of_id")
    
    private String replicaOfId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restore_point")
    
    private RestorePoint restorePoint = null;

    public InstanceRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 实例名称。 用于表示实例的名称，同一租户下，同类型的实例名可重名，其中，SQL Server实例名唯一。 取值范围：4~64个字符之间，必须以字母开头，区分大小写，可以包含字母、数字、中划线或者下划线，不能包含其他的特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceRequest withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public InstanceRequest withDatastore(Consumer<Datastore> datastoreSetter) {
        if(this.datastore == null ){
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

    public InstanceRequest withHa(Ha ha) {
        this.ha = ha;
        return this;
    }

    public InstanceRequest withHa(Consumer<Ha> haSetter) {
        if(this.ha == null ){
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

    public InstanceRequest withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    


    /**
     * 参数组ID。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public InstanceRequest withPort(String port) {
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

    public InstanceRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 数据库密码。创建只读实例时不可选，其它场景必选。  取值范围：  非空，由大小写字母、数字和特殊符号~!@#%^*-_=+?组成，长度8~32个字符。  建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public InstanceRequest withBackupStrategy(BackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public InstanceRequest withBackupStrategy(Consumer<BackupStrategy> backupStrategySetter) {
        if(this.backupStrategy == null ){
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

    public InstanceRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public InstanceRequest withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    


    /**
     * 用于磁盘加密的密钥ID。
     * @return diskEncryptionId
     */
    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    public InstanceRequest withFlavorRef(String flavorRef) {
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

    public InstanceRequest withVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public InstanceRequest withVolume(Consumer<Volume> volumeSetter) {
        if(this.volume == null ){
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

    public InstanceRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 区域ID。创建主实例时必选，其它场景不可选。 取值参见[地区和终端节点](https://developer.huaweicloud.com/endpoint)。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public InstanceRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 可用区ID。对于数据库实例类型不是单机的实例，需要分别为实例所有节点指定可用区，并用逗号隔开。 取值参见[地区和终端节点](https://developer.huaweicloud.com/endpoint)。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public InstanceRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID。创建只读实例时不可选（只读实例的网络属性默认和主实例相同），其它场景必选。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public InstanceRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网ID。创建只读实例时不可选（只读实例的网络属性默认和主实例相同），其它场景必选。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public InstanceRequest withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 安全组ID。创建只读实例时不可选（只读实例的网络属性默认和主实例相同），其它场景必选。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public InstanceRequest withChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public InstanceRequest withChargeInfo(Consumer<ChargeInfo> chargeInfoSetter) {
        if(this.chargeInfo == null ){
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

    public InstanceRequest withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    


    /**
     * 时区。  - 不选择时，各个引擎时区如下：   - MySQL国内站、国际站默认为UTC时间。   - PostgreSQL国内站、国际站默认为UTC时间。   - Microsoft SQL Server国内站默认为UTC+08:00，国际站默认为UTC时间。 - 选择填写时，取值范围为UTC-12:00~UTC+12:00，且只支持整段时间，如UTC+08:00，不支持UTC+08:30。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public InstanceRequest withDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
        return this;
    }

    


    /**
     * 专属存储池ID。
     * @return dsspoolId
     */
    public String getDsspoolId() {
        return dsspoolId;
    }

    public void setDsspoolId(String dsspoolId) {
        this.dsspoolId = dsspoolId;
    }

    public InstanceRequest withReplicaOfId(String replicaOfId) {
        this.replicaOfId = replicaOfId;
        return this;
    }

    


    /**
     * 只读实例的主实例ID。创建只读实例时必选，其它场景不可选。
     * @return replicaOfId
     */
    public String getReplicaOfId() {
        return replicaOfId;
    }

    public void setReplicaOfId(String replicaOfId) {
        this.replicaOfId = replicaOfId;
    }

    public InstanceRequest withRestorePoint(RestorePoint restorePoint) {
        this.restorePoint = restorePoint;
        return this;
    }

    public InstanceRequest withRestorePoint(Consumer<RestorePoint> restorePointSetter) {
        if(this.restorePoint == null ){
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceRequest instanceRequest = (InstanceRequest) o;
        return Objects.equals(this.name, instanceRequest.name) &&
            Objects.equals(this.datastore, instanceRequest.datastore) &&
            Objects.equals(this.ha, instanceRequest.ha) &&
            Objects.equals(this.configurationId, instanceRequest.configurationId) &&
            Objects.equals(this.port, instanceRequest.port) &&
            Objects.equals(this.password, instanceRequest.password) &&
            Objects.equals(this.backupStrategy, instanceRequest.backupStrategy) &&
            Objects.equals(this.enterpriseProjectId, instanceRequest.enterpriseProjectId) &&
            Objects.equals(this.diskEncryptionId, instanceRequest.diskEncryptionId) &&
            Objects.equals(this.flavorRef, instanceRequest.flavorRef) &&
            Objects.equals(this.volume, instanceRequest.volume) &&
            Objects.equals(this.region, instanceRequest.region) &&
            Objects.equals(this.availabilityZone, instanceRequest.availabilityZone) &&
            Objects.equals(this.vpcId, instanceRequest.vpcId) &&
            Objects.equals(this.subnetId, instanceRequest.subnetId) &&
            Objects.equals(this.securityGroupId, instanceRequest.securityGroupId) &&
            Objects.equals(this.chargeInfo, instanceRequest.chargeInfo) &&
            Objects.equals(this.timeZone, instanceRequest.timeZone) &&
            Objects.equals(this.dsspoolId, instanceRequest.dsspoolId) &&
            Objects.equals(this.replicaOfId, instanceRequest.replicaOfId) &&
            Objects.equals(this.restorePoint, instanceRequest.restorePoint);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, datastore, ha, configurationId, port, password, backupStrategy, enterpriseProjectId, diskEncryptionId, flavorRef, volume, region, availabilityZone, vpcId, subnetId, securityGroupId, chargeInfo, timeZone, dsspoolId, replicaOfId, restorePoint);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceRequest {\n");
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
        sb.append("    dsspoolId: ").append(toIndentedString(dsspoolId)).append("\n");
        sb.append("    replicaOfId: ").append(toIndentedString(replicaOfId)).append("\n");
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

