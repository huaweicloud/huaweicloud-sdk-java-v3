package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class RestoreNewInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private Datastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

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
    @JsonProperty(value = "disk_encryption_id")

    private String diskEncryptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private List<RestoreNewInstanceFlavorOption> flavor = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_strategy")

    private BackupStrategy backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_option")

    private String sslOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dss_pool_id")

    private String dssPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public RestoreNewInstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 实例ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RestoreNewInstanceResponse withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public RestoreNewInstanceResponse withDatastore(Consumer<Datastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new Datastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /** Get datastore
     * 
     * @return datastore */
    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    public RestoreNewInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 实例名称，与请求参数相同。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RestoreNewInstanceResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /** 创建时间为本地时间，格式为“yyyy-mm-dd hh:mm:ss”。
     * 
     * @return created */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public RestoreNewInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 实例状态，取值为“creating”。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RestoreNewInstanceResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /** 区域ID，与请求参数相同。
     * 
     * @return region */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public RestoreNewInstanceResponse withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /** 可用区ID，与请求参数相同。
     * 
     * @return availabilityZone */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public RestoreNewInstanceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 虚拟私有云ID，与请求参数相同。
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public RestoreNewInstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /** 子网ID，与请求参数相同。
     * 
     * @return subnetId */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public RestoreNewInstanceResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /** 实例所属的安全组ID，与请求参数相同。
     * 
     * @return securityGroupId */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public RestoreNewInstanceResponse withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    /** 磁盘加密的密钥ID，与请求参数相同。
     * 
     * @return diskEncryptionId */
    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    public RestoreNewInstanceResponse withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /** 实例类型，与请求参数相同。
     * 
     * @return mode */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public RestoreNewInstanceResponse withFlavor(List<RestoreNewInstanceFlavorOption> flavor) {
        this.flavor = flavor;
        return this;
    }

    public RestoreNewInstanceResponse addFlavorItem(RestoreNewInstanceFlavorOption flavorItem) {
        if (this.flavor == null) {
            this.flavor = new ArrayList<>();
        }
        this.flavor.add(flavorItem);
        return this;
    }

    public RestoreNewInstanceResponse withFlavor(Consumer<List<RestoreNewInstanceFlavorOption>> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new ArrayList<>();
        }
        flavorSetter.accept(this.flavor);
        return this;
    }

    /** 实例规格详情，与请求参数相同。
     * 
     * @return flavor */
    public List<RestoreNewInstanceFlavorOption> getFlavor() {
        return flavor;
    }

    public void setFlavor(List<RestoreNewInstanceFlavorOption> flavor) {
        this.flavor = flavor;
    }

    public RestoreNewInstanceResponse withBackupStrategy(BackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public RestoreNewInstanceResponse withBackupStrategy(Consumer<BackupStrategy> backupStrategySetter) {
        if (this.backupStrategy == null) {
            this.backupStrategy = new BackupStrategy();
            backupStrategySetter.accept(this.backupStrategy);
        }

        return this;
    }

    /** Get backupStrategy
     * 
     * @return backupStrategy */
    public BackupStrategy getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(BackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public RestoreNewInstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID。取值为“0”，表示为default企业项目。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RestoreNewInstanceResponse withSslOption(String sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    /** SSL开关选项，与请求参数相同。
     * 
     * @return sslOption */
    public String getSslOption() {
        return sslOption;
    }

    public void setSslOption(String sslOption) {
        this.sslOption = sslOption;
    }

    public RestoreNewInstanceResponse withDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
        return this;
    }

    /** 专属存储池ID。
     * 
     * @return dssPoolId */
    public String getDssPoolId() {
        return dssPoolId;
    }

    public void setDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
    }

    public RestoreNewInstanceResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 创建实例的工作流ID。
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreNewInstanceResponse restoreNewInstanceResponse = (RestoreNewInstanceResponse) o;
        return Objects.equals(this.id, restoreNewInstanceResponse.id)
            && Objects.equals(this.datastore, restoreNewInstanceResponse.datastore)
            && Objects.equals(this.name, restoreNewInstanceResponse.name)
            && Objects.equals(this.created, restoreNewInstanceResponse.created)
            && Objects.equals(this.status, restoreNewInstanceResponse.status)
            && Objects.equals(this.region, restoreNewInstanceResponse.region)
            && Objects.equals(this.availabilityZone, restoreNewInstanceResponse.availabilityZone)
            && Objects.equals(this.vpcId, restoreNewInstanceResponse.vpcId)
            && Objects.equals(this.subnetId, restoreNewInstanceResponse.subnetId)
            && Objects.equals(this.securityGroupId, restoreNewInstanceResponse.securityGroupId)
            && Objects.equals(this.diskEncryptionId, restoreNewInstanceResponse.diskEncryptionId)
            && Objects.equals(this.mode, restoreNewInstanceResponse.mode)
            && Objects.equals(this.flavor, restoreNewInstanceResponse.flavor)
            && Objects.equals(this.backupStrategy, restoreNewInstanceResponse.backupStrategy)
            && Objects.equals(this.enterpriseProjectId, restoreNewInstanceResponse.enterpriseProjectId)
            && Objects.equals(this.sslOption, restoreNewInstanceResponse.sslOption)
            && Objects.equals(this.dssPoolId, restoreNewInstanceResponse.dssPoolId)
            && Objects.equals(this.jobId, restoreNewInstanceResponse.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            datastore,
            name,
            created,
            status,
            region,
            availabilityZone,
            vpcId,
            subnetId,
            securityGroupId,
            diskEncryptionId,
            mode,
            flavor,
            backupStrategy,
            enterpriseProjectId,
            sslOption,
            dssPoolId,
            jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreNewInstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    diskEncryptionId: ").append(toIndentedString(diskEncryptionId)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
        sb.append("    dssPoolId: ").append(toIndentedString(dssPoolId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
