package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceBackupStrategyResult;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceDatastoreResult;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceFlavorResult;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceStorageResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class CreateInstanceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    private CreateInstanceDatastoreResult datastore = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


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
    @JsonProperty(value="disk_encryption_id")
    
    private String diskEncryptionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private String mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private List<CreateInstanceFlavorResult> flavor = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage")
    
    private CreateInstanceStorageResult storage = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_strategy")
    
    private CreateInstanceBackupStrategyResult backupStrategy = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_option")
    
    private String sslOption;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;

    public CreateInstanceResponse withId(String id) {
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

    public CreateInstanceResponse withDatastore(CreateInstanceDatastoreResult datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateInstanceResponse withDatastore(Consumer<CreateInstanceDatastoreResult> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new CreateInstanceDatastoreResult();
        }
        datastoreSetter.accept(this.datastore);
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public CreateInstanceDatastoreResult getDatastore() {
        return datastore;
    }

    public void setDatastore(CreateInstanceDatastoreResult datastore) {
        this.datastore = datastore;
    }

    public CreateInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 实例名称，与请求参数相同。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstanceResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 创建时间为本地时间，格式为“yyyy-mm-dd hh:mm:ss”。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CreateInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 实例状态，取值为“creating”。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateInstanceResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 区域ID，与请求参数相同。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateInstanceResponse withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 可用区ID，与请求参数相同。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateInstanceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID，与请求参数相同。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateInstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网ID，与请求参数相同。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateInstanceResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 实例所属的安全组ID，与请求参数相同。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateInstanceResponse withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    


    /**
     * 磁盘加密的密钥ID，与请求参数相同。
     * @return diskEncryptionId
     */
    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    public CreateInstanceResponse withMode(String mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 实例类型，与请求参数相同。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public CreateInstanceResponse withFlavor(List<CreateInstanceFlavorResult> flavor) {
        this.flavor = flavor;
        return this;
    }

    
    public CreateInstanceResponse addFlavorItem(CreateInstanceFlavorResult flavorItem) {
        if (this.flavor == null) {
            this.flavor = new ArrayList<>();
        }
        this.flavor.add(flavorItem);
        return this;
    }

    public CreateInstanceResponse withFlavor(Consumer<List<CreateInstanceFlavorResult>> flavorSetter) {
        if(this.flavor == null ){
            this.flavor = new ArrayList<>();
        }
        flavorSetter.accept(this.flavor);
        return this;
    }

    /**
     * 实例规格详情，与请求参数相同。
     * @return flavor
     */
    public List<CreateInstanceFlavorResult> getFlavor() {
        return flavor;
    }

    public void setFlavor(List<CreateInstanceFlavorResult> flavor) {
        this.flavor = flavor;
    }

    public CreateInstanceResponse withStorage(CreateInstanceStorageResult storage) {
        this.storage = storage;
        return this;
    }

    public CreateInstanceResponse withStorage(Consumer<CreateInstanceStorageResult> storageSetter) {
        if(this.storage == null ){
            this.storage = new CreateInstanceStorageResult();
        }
        storageSetter.accept(this.storage);
        return this;
    }


    /**
     * Get storage
     * @return storage
     */
    public CreateInstanceStorageResult getStorage() {
        return storage;
    }

    public void setStorage(CreateInstanceStorageResult storage) {
        this.storage = storage;
    }

    public CreateInstanceResponse withBackupStrategy(CreateInstanceBackupStrategyResult backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public CreateInstanceResponse withBackupStrategy(Consumer<CreateInstanceBackupStrategyResult> backupStrategySetter) {
        if(this.backupStrategy == null ){
            this.backupStrategy = new CreateInstanceBackupStrategyResult();
        }
        backupStrategySetter.accept(this.backupStrategy);
        return this;
    }


    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public CreateInstanceBackupStrategyResult getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(CreateInstanceBackupStrategyResult backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public CreateInstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。取值为“0”，表示为default企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateInstanceResponse withSslOption(String sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    


    /**
     * SSL开关选项，与请求参数相同。
     * @return sslOption
     */
    public String getSslOption() {
        return sslOption;
    }

    public void setSslOption(String sslOption) {
        this.sslOption = sslOption;
    }

    public CreateInstanceResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 创建实例的工作流ID。
     * @return jobId
     */
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
        CreateInstanceResponse createInstanceResponse = (CreateInstanceResponse) o;
        return Objects.equals(this.id, createInstanceResponse.id) &&
            Objects.equals(this.datastore, createInstanceResponse.datastore) &&
            Objects.equals(this.name, createInstanceResponse.name) &&
            Objects.equals(this.created, createInstanceResponse.created) &&
            Objects.equals(this.status, createInstanceResponse.status) &&
            Objects.equals(this.region, createInstanceResponse.region) &&
            Objects.equals(this.availabilityZone, createInstanceResponse.availabilityZone) &&
            Objects.equals(this.vpcId, createInstanceResponse.vpcId) &&
            Objects.equals(this.subnetId, createInstanceResponse.subnetId) &&
            Objects.equals(this.securityGroupId, createInstanceResponse.securityGroupId) &&
            Objects.equals(this.diskEncryptionId, createInstanceResponse.diskEncryptionId) &&
            Objects.equals(this.mode, createInstanceResponse.mode) &&
            Objects.equals(this.flavor, createInstanceResponse.flavor) &&
            Objects.equals(this.storage, createInstanceResponse.storage) &&
            Objects.equals(this.backupStrategy, createInstanceResponse.backupStrategy) &&
            Objects.equals(this.enterpriseProjectId, createInstanceResponse.enterpriseProjectId) &&
            Objects.equals(this.sslOption, createInstanceResponse.sslOption) &&
            Objects.equals(this.jobId, createInstanceResponse.jobId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, datastore, name, created, status, region, availabilityZone, vpcId, subnetId, securityGroupId, diskEncryptionId, mode, flavor, storage, backupStrategy, enterpriseProjectId, sslOption, jobId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceResponse {\n");
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
            sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
            sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
            sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

