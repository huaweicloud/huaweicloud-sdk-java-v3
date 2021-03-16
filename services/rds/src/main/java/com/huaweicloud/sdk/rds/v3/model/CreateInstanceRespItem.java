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
public class CreateInstanceRespItem  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    private Datastore datastore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ha")
    
    private Ha ha;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_id")
    
    private String configurationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private String port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_strategy")
    
    private BackupStrategy backupStrategy;


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
    
    private Volume volume;


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
    
    private ChargeInfo chargeInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="collation")
    
    private String collation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restore_point")
    
    private RestorePoint restorePoint;

    public CreateInstanceRespItem withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public CreateInstanceRespItem withName(String name) {
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

    

    public CreateInstanceRespItem withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 实例状态。如BUILD，表示创建中。 仅创建按需实例时会返回该参数。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public CreateInstanceRespItem withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateInstanceRespItem withDatastore(Consumer<Datastore> datastoreSetter) {
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

    

    public CreateInstanceRespItem withHa(Ha ha) {
        this.ha = ha;
        return this;
    }

    public CreateInstanceRespItem withHa(Consumer<Ha> haSetter) {
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

    

    public CreateInstanceRespItem withConfigurationId(String configurationId) {
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

    

    public CreateInstanceRespItem withPort(String port) {
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

    

    public CreateInstanceRespItem withBackupStrategy(BackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public CreateInstanceRespItem withBackupStrategy(Consumer<BackupStrategy> backupStrategySetter) {
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

    

    public CreateInstanceRespItem withEnterpriseProjectId(String enterpriseProjectId) {
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

    

    public CreateInstanceRespItem withDiskEncryptionId(String diskEncryptionId) {
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

    

    public CreateInstanceRespItem withFlavorRef(String flavorRef) {
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

    

    public CreateInstanceRespItem withVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public CreateInstanceRespItem withVolume(Consumer<Volume> volumeSetter) {
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

    

    public CreateInstanceRespItem withRegion(String region) {
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

    

    public CreateInstanceRespItem withAvailabilityZone(String availabilityZone) {
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

    

    public CreateInstanceRespItem withVpcId(String vpcId) {
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

    

    public CreateInstanceRespItem withSubnetId(String subnetId) {
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

    

    public CreateInstanceRespItem withSecurityGroupId(String securityGroupId) {
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

    

    public CreateInstanceRespItem withChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public CreateInstanceRespItem withChargeInfo(Consumer<ChargeInfo> chargeInfoSetter) {
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

    

    public CreateInstanceRespItem withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    


    /**
     * 仅限Microsoft SQL Server实例使用。取值范围：根据查询SQL Server可用字符集的字符集查询列表查询可设置的字符集。
     * @return collation
     */
    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    

    public CreateInstanceRespItem withRestorePoint(RestorePoint restorePoint) {
        this.restorePoint = restorePoint;
        return this;
    }

    public CreateInstanceRespItem withRestorePoint(Consumer<RestorePoint> restorePointSetter) {
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
        CreateInstanceRespItem createInstanceRespItem = (CreateInstanceRespItem) o;
        return Objects.equals(this.id, createInstanceRespItem.id) &&
            Objects.equals(this.name, createInstanceRespItem.name) &&
            Objects.equals(this.status, createInstanceRespItem.status) &&
            Objects.equals(this.datastore, createInstanceRespItem.datastore) &&
            Objects.equals(this.ha, createInstanceRespItem.ha) &&
            Objects.equals(this.configurationId, createInstanceRespItem.configurationId) &&
            Objects.equals(this.port, createInstanceRespItem.port) &&
            Objects.equals(this.backupStrategy, createInstanceRespItem.backupStrategy) &&
            Objects.equals(this.enterpriseProjectId, createInstanceRespItem.enterpriseProjectId) &&
            Objects.equals(this.diskEncryptionId, createInstanceRespItem.diskEncryptionId) &&
            Objects.equals(this.flavorRef, createInstanceRespItem.flavorRef) &&
            Objects.equals(this.volume, createInstanceRespItem.volume) &&
            Objects.equals(this.region, createInstanceRespItem.region) &&
            Objects.equals(this.availabilityZone, createInstanceRespItem.availabilityZone) &&
            Objects.equals(this.vpcId, createInstanceRespItem.vpcId) &&
            Objects.equals(this.subnetId, createInstanceRespItem.subnetId) &&
            Objects.equals(this.securityGroupId, createInstanceRespItem.securityGroupId) &&
            Objects.equals(this.chargeInfo, createInstanceRespItem.chargeInfo) &&
            Objects.equals(this.collation, createInstanceRespItem.collation) &&
            Objects.equals(this.restorePoint, createInstanceRespItem.restorePoint);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, datastore, ha, configurationId, port, backupStrategy, enterpriseProjectId, diskEncryptionId, flavorRef, volume, region, availabilityZone, vpcId, subnetId, securityGroupId, chargeInfo, collation, restorePoint);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceRespItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
        sb.append("    collation: ").append(toIndentedString(collation)).append("\n");
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

