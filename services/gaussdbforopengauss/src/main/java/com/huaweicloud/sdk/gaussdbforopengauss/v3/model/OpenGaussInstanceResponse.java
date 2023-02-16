package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussBackupStrategyForResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussChargeInfoResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussDatastoreResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussHaResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussVolumeResponse;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例信息。
 */
public class OpenGaussInstanceResponse  {



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
    
    
    private OpenGaussDatastoreResponse datastore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ha")
    
    
    private OpenGaussHaResponse ha;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replica_num")
    
    
    private Integer replicaNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_strategy")
    
    
    private OpenGaussBackupStrategyForResponse backupStrategy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    
    private String port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_ref")
    
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    
    
    private OpenGaussVolumeResponse volume;


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
    
    
    private OpenGaussChargeInfoResponse chargeInfo;

    public OpenGaussInstanceResponse withId(String id) {
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

    

    public OpenGaussInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 实例名称。用于表示实例的名称，同一租户下，同类型的实例名称可相同。  取值范围：4~64个字符之间，必须以字母开头，不区分大小写，可以包含字母、数字、中划线或者下划线，不能包含其他的特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public OpenGaussInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 实例状态。如BUILD，表示创建中。  仅创建按需实例时会返回该参数。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public OpenGaussInstanceResponse withDatastore(OpenGaussDatastoreResponse datastore) {
        this.datastore = datastore;
        return this;
    }

    public OpenGaussInstanceResponse withDatastore(Consumer<OpenGaussDatastoreResponse> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new OpenGaussDatastoreResponse();
            datastoreSetter.accept(this.datastore);
        }
        
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public OpenGaussDatastoreResponse getDatastore() {
        return datastore;
    }

    public void setDatastore(OpenGaussDatastoreResponse datastore) {
        this.datastore = datastore;
    }

    

    public OpenGaussInstanceResponse withHa(OpenGaussHaResponse ha) {
        this.ha = ha;
        return this;
    }

    public OpenGaussInstanceResponse withHa(Consumer<OpenGaussHaResponse> haSetter) {
        if(this.ha == null ){
            this.ha = new OpenGaussHaResponse();
            haSetter.accept(this.ha);
        }
        
        return this;
    }


    /**
     * Get ha
     * @return ha
     */
    public OpenGaussHaResponse getHa() {
        return ha;
    }

    public void setHa(OpenGaussHaResponse ha) {
        this.ha = ha;
    }

    

    public OpenGaussInstanceResponse withReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
        return this;
    }

    


    /**
     * 实例副本数。
     * @return replicaNum
     */
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    

    public OpenGaussInstanceResponse withBackupStrategy(OpenGaussBackupStrategyForResponse backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public OpenGaussInstanceResponse withBackupStrategy(Consumer<OpenGaussBackupStrategyForResponse> backupStrategySetter) {
        if(this.backupStrategy == null ){
            this.backupStrategy = new OpenGaussBackupStrategyForResponse();
            backupStrategySetter.accept(this.backupStrategy);
        }
        
        return this;
    }


    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public OpenGaussBackupStrategyForResponse getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(OpenGaussBackupStrategyForResponse backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    

    public OpenGaussInstanceResponse withPort(String port) {
        this.port = port;
        return this;
    }

    


    /**
     * 数据库端口信息，与请求参数相同。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    

    public OpenGaussInstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 项目标签。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public OpenGaussInstanceResponse withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 规格码，取值范围：非空。参考[表1](https://support.huaweicloud.com/api-opengauss/opengauss_api_0037.html#opengauss_api_0037__ted9b9d433c8a4c52884e199e17f94479)中GaussDB 的“规格编码”列内容获取。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    

    public OpenGaussInstanceResponse withVolume(OpenGaussVolumeResponse volume) {
        this.volume = volume;
        return this;
    }

    public OpenGaussInstanceResponse withVolume(Consumer<OpenGaussVolumeResponse> volumeSetter) {
        if(this.volume == null ){
            this.volume = new OpenGaussVolumeResponse();
            volumeSetter.accept(this.volume);
        }
        
        return this;
    }


    /**
     * Get volume
     * @return volume
     */
    public OpenGaussVolumeResponse getVolume() {
        return volume;
    }

    public void setVolume(OpenGaussVolumeResponse volume) {
        this.volume = volume;
    }

    

    public OpenGaussInstanceResponse withRegion(String region) {
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

    

    public OpenGaussInstanceResponse withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 可用区ID。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    

    public OpenGaussInstanceResponse withVpcId(String vpcId) {
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

    

    public OpenGaussInstanceResponse withSubnetId(String subnetId) {
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

    

    public OpenGaussInstanceResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 实例所属的安全组。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    

    public OpenGaussInstanceResponse withChargeInfo(OpenGaussChargeInfoResponse chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public OpenGaussInstanceResponse withChargeInfo(Consumer<OpenGaussChargeInfoResponse> chargeInfoSetter) {
        if(this.chargeInfo == null ){
            this.chargeInfo = new OpenGaussChargeInfoResponse();
            chargeInfoSetter.accept(this.chargeInfo);
        }
        
        return this;
    }


    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public OpenGaussChargeInfoResponse getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(OpenGaussChargeInfoResponse chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenGaussInstanceResponse openGaussInstanceResponse = (OpenGaussInstanceResponse) o;
        return Objects.equals(this.id, openGaussInstanceResponse.id) &&
            Objects.equals(this.name, openGaussInstanceResponse.name) &&
            Objects.equals(this.status, openGaussInstanceResponse.status) &&
            Objects.equals(this.datastore, openGaussInstanceResponse.datastore) &&
            Objects.equals(this.ha, openGaussInstanceResponse.ha) &&
            Objects.equals(this.replicaNum, openGaussInstanceResponse.replicaNum) &&
            Objects.equals(this.backupStrategy, openGaussInstanceResponse.backupStrategy) &&
            Objects.equals(this.port, openGaussInstanceResponse.port) &&
            Objects.equals(this.enterpriseProjectId, openGaussInstanceResponse.enterpriseProjectId) &&
            Objects.equals(this.flavorRef, openGaussInstanceResponse.flavorRef) &&
            Objects.equals(this.volume, openGaussInstanceResponse.volume) &&
            Objects.equals(this.region, openGaussInstanceResponse.region) &&
            Objects.equals(this.availabilityZone, openGaussInstanceResponse.availabilityZone) &&
            Objects.equals(this.vpcId, openGaussInstanceResponse.vpcId) &&
            Objects.equals(this.subnetId, openGaussInstanceResponse.subnetId) &&
            Objects.equals(this.securityGroupId, openGaussInstanceResponse.securityGroupId) &&
            Objects.equals(this.chargeInfo, openGaussInstanceResponse.chargeInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, datastore, ha, replicaNum, backupStrategy, port, enterpriseProjectId, flavorRef, volume, region, availabilityZone, vpcId, subnetId, securityGroupId, chargeInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussInstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
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

