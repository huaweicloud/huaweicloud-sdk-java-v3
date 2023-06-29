package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例信息。
 */
public class OpenGaussInstanceResult {

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
    @JsonProperty(value = "datastore")

    private OpenGaussDatastoreResult datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha")

    private OpenGaussHaResult ha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_num")

    private Integer replicaNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy")

    private OpenGaussBackupStrategyForResponse backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private OpenGaussVolumeResult volume;

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

    private OpenGaussChargeInfoResponse chargeInfo;

    public OpenGaussInstanceResult withId(String id) {
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

    public OpenGaussInstanceResult withName(String name) {
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

    public OpenGaussInstanceResult withStatus(String status) {
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

    public OpenGaussInstanceResult withDatastore(OpenGaussDatastoreResult datastore) {
        this.datastore = datastore;
        return this;
    }

    public OpenGaussInstanceResult withDatastore(Consumer<OpenGaussDatastoreResult> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new OpenGaussDatastoreResult();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public OpenGaussDatastoreResult getDatastore() {
        return datastore;
    }

    public void setDatastore(OpenGaussDatastoreResult datastore) {
        this.datastore = datastore;
    }

    public OpenGaussInstanceResult withHa(OpenGaussHaResult ha) {
        this.ha = ha;
        return this;
    }

    public OpenGaussInstanceResult withHa(Consumer<OpenGaussHaResult> haSetter) {
        if (this.ha == null) {
            this.ha = new OpenGaussHaResult();
            haSetter.accept(this.ha);
        }

        return this;
    }

    /**
     * Get ha
     * @return ha
     */
    public OpenGaussHaResult getHa() {
        return ha;
    }

    public void setHa(OpenGaussHaResult ha) {
        this.ha = ha;
    }

    public OpenGaussInstanceResult withReplicaNum(Integer replicaNum) {
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

    public OpenGaussInstanceResult withBackupStrategy(OpenGaussBackupStrategyForResponse backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public OpenGaussInstanceResult withBackupStrategy(
        Consumer<OpenGaussBackupStrategyForResponse> backupStrategySetter) {
        if (this.backupStrategy == null) {
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

    public OpenGaussInstanceResult withPort(String port) {
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

    public OpenGaussInstanceResult withEnterpriseProjectId(String enterpriseProjectId) {
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

    public OpenGaussInstanceResult withFlavorRef(String flavorRef) {
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

    public OpenGaussInstanceResult withVolume(OpenGaussVolumeResult volume) {
        this.volume = volume;
        return this;
    }

    public OpenGaussInstanceResult withVolume(Consumer<OpenGaussVolumeResult> volumeSetter) {
        if (this.volume == null) {
            this.volume = new OpenGaussVolumeResult();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public OpenGaussVolumeResult getVolume() {
        return volume;
    }

    public void setVolume(OpenGaussVolumeResult volume) {
        this.volume = volume;
    }

    public OpenGaussInstanceResult withRegion(String region) {
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

    public OpenGaussInstanceResult withAvailabilityZone(String availabilityZone) {
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

    public OpenGaussInstanceResult withVpcId(String vpcId) {
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

    public OpenGaussInstanceResult withSubnetId(String subnetId) {
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

    public OpenGaussInstanceResult withSecurityGroupId(String securityGroupId) {
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

    public OpenGaussInstanceResult withChargeInfo(OpenGaussChargeInfoResponse chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public OpenGaussInstanceResult withChargeInfo(Consumer<OpenGaussChargeInfoResponse> chargeInfoSetter) {
        if (this.chargeInfo == null) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenGaussInstanceResult that = (OpenGaussInstanceResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.ha, that.ha) && Objects.equals(this.replicaNum, that.replicaNum)
            && Objects.equals(this.backupStrategy, that.backupStrategy) && Objects.equals(this.port, that.port)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.flavorRef, that.flavorRef) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.region, that.region) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.chargeInfo, that.chargeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            datastore,
            ha,
            replicaNum,
            backupStrategy,
            port,
            enterpriseProjectId,
            flavorRef,
            volume,
            region,
            availabilityZone,
            vpcId,
            subnetId,
            securityGroupId,
            chargeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussInstanceResult {\n");
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
