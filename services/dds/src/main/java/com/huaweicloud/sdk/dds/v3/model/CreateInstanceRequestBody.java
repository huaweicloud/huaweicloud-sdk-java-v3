package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceBackupStrategyOption;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceDatastoreOption;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceFlavorOption;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceStorageOption;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 实例信息。
 */
public class CreateInstanceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    private CreateInstanceDatastoreOption datastore = null;


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
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_encryption_id")
    
    private String diskEncryptionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private String mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private List<CreateInstanceFlavorOption> flavor = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage")
    
    private CreateInstanceStorageOption storage = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_strategy")
    
    private CreateInstanceBackupStrategyOption backupStrategy = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_option")
    
    private String sslOption;

    public CreateInstanceRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 实例名称。用于表示实例的名称，用于表示实例的名称，同一租户下，同类型的实例名唯一。 取值范围：长度为4~64位，必须以字母开头（A~Z或a~z），区分大小写，可以包含字母、数字（0~9）、中划线（-）或者下划线（_），不能包含其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstanceRequestBody withDatastore(CreateInstanceDatastoreOption datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateInstanceRequestBody withDatastore(Consumer<CreateInstanceDatastoreOption> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new CreateInstanceDatastoreOption();
        }
        datastoreSetter.accept(this.datastore);
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public CreateInstanceDatastoreOption getDatastore() {
        return datastore;
    }

    public void setDatastore(CreateInstanceDatastoreOption datastore) {
        this.datastore = datastore;
    }

    public CreateInstanceRequestBody withRegion(String region) {
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

    public CreateInstanceRequestBody withAvailabilityZone(String availabilityZone) {
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

    public CreateInstanceRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID。获取方法请参见《虚拟私有云API参考》中“VPC”的内容。 取值：非空，字符长度校验，严格UUID正则校验。
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
     * 子网ID。获取方法请参见《虚拟私有云API参考》中“子网”的内容。
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
     * 指定实例所属的安全组ID。 获取方法请参见《虚拟私有云API参考》中“安全组”的内容。
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
     * 数据库密码。 取值范围：长度为8~32位，必须是大写字母（A~Z）、小写字母（a~z）、数字（0~9）、特殊字符~!@#%^*-_=+?的组合。 建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateInstanceRequestBody withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    


    /**
     * 磁盘加密时的密钥ID，严格UUID正则校验。仅支持社区版引擎。 不传该参数时，表示不进行磁盘加密。
     * @return diskEncryptionId
     */
    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    public CreateInstanceRequestBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 实例类型。支持集群、副本集、以及单节点。 取值   - Sharding   - ReplicaSet   - Single
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public CreateInstanceRequestBody withFlavor(List<CreateInstanceFlavorOption> flavor) {
        this.flavor = flavor;
        return this;
    }

    
    public CreateInstanceRequestBody addFlavorItem(CreateInstanceFlavorOption flavorItem) {
        this.flavor.add(flavorItem);
        return this;
    }

    public CreateInstanceRequestBody withFlavor(Consumer<List<CreateInstanceFlavorOption>> flavorSetter) {
        if(this.flavor == null ){
            this.flavor = new ArrayList<>();
        }
        flavorSetter.accept(this.flavor);
        return this;
    }

    /**
     * 实例规格详情。
     * @return flavor
     */
    public List<CreateInstanceFlavorOption> getFlavor() {
        return flavor;
    }

    public void setFlavor(List<CreateInstanceFlavorOption> flavor) {
        this.flavor = flavor;
    }

    public CreateInstanceRequestBody withStorage(CreateInstanceStorageOption storage) {
        this.storage = storage;
        return this;
    }

    public CreateInstanceRequestBody withStorage(Consumer<CreateInstanceStorageOption> storageSetter) {
        if(this.storage == null ){
            this.storage = new CreateInstanceStorageOption();
        }
        storageSetter.accept(this.storage);
        return this;
    }


    /**
     * Get storage
     * @return storage
     */
    public CreateInstanceStorageOption getStorage() {
        return storage;
    }

    public void setStorage(CreateInstanceStorageOption storage) {
        this.storage = storage;
    }

    public CreateInstanceRequestBody withBackupStrategy(CreateInstanceBackupStrategyOption backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public CreateInstanceRequestBody withBackupStrategy(Consumer<CreateInstanceBackupStrategyOption> backupStrategySetter) {
        if(this.backupStrategy == null ){
            this.backupStrategy = new CreateInstanceBackupStrategyOption();
        }
        backupStrategySetter.accept(this.backupStrategy);
        return this;
    }


    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public CreateInstanceBackupStrategyOption getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(CreateInstanceBackupStrategyOption backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public CreateInstanceRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
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

    public CreateInstanceRequestBody withSslOption(String sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    


    /**
     * SSL开关选项。 取值： - 取“0”，表示DDS实例默认不启用SSL连接。 - 取“1”，表示DDS实例默认启用SSL连接。 - 不传该参数时，默认启用SSL连接。
     * @return sslOption
     */
    public String getSslOption() {
        return sslOption;
    }

    public void setSslOption(String sslOption) {
        this.sslOption = sslOption;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceRequestBody createInstanceRequestBody = (CreateInstanceRequestBody) o;
        return Objects.equals(this.name, createInstanceRequestBody.name) &&
            Objects.equals(this.datastore, createInstanceRequestBody.datastore) &&
            Objects.equals(this.region, createInstanceRequestBody.region) &&
            Objects.equals(this.availabilityZone, createInstanceRequestBody.availabilityZone) &&
            Objects.equals(this.vpcId, createInstanceRequestBody.vpcId) &&
            Objects.equals(this.subnetId, createInstanceRequestBody.subnetId) &&
            Objects.equals(this.securityGroupId, createInstanceRequestBody.securityGroupId) &&
            Objects.equals(this.password, createInstanceRequestBody.password) &&
            Objects.equals(this.diskEncryptionId, createInstanceRequestBody.diskEncryptionId) &&
            Objects.equals(this.mode, createInstanceRequestBody.mode) &&
            Objects.equals(this.flavor, createInstanceRequestBody.flavor) &&
            Objects.equals(this.storage, createInstanceRequestBody.storage) &&
            Objects.equals(this.backupStrategy, createInstanceRequestBody.backupStrategy) &&
            Objects.equals(this.enterpriseProjectId, createInstanceRequestBody.enterpriseProjectId) &&
            Objects.equals(this.sslOption, createInstanceRequestBody.sslOption);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, datastore, region, availabilityZone, vpcId, subnetId, securityGroupId, password, diskEncryptionId, mode, flavor, storage, backupStrategy, enterpriseProjectId, sslOption);
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
            sb.append("    diskEncryptionId: ").append(toIndentedString(diskEncryptionId)).append("\n");
            sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
            sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
            sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
            sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
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

