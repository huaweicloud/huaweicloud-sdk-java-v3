package com.huaweicloud.sdk.dds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.BackupStrategy;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceFlavorOption;
import com.huaweicloud.sdk.dds.v3.model.Datastore;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例信息。
 */
public class CreateInstanceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    private Datastore datastore;


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
    
    private List<CreateInstanceFlavorOption> flavor = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_strategy")
    
    private BackupStrategy backupStrategy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_option")
    
    private String sslOption;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dss_pool_id")
    
    private String dssPoolId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_group_policies")
    
    private List<String> serverGroupPolicies = null;
    
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

    

    public CreateInstanceRequestBody withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateInstanceRequestBody withDatastore(Consumer<Datastore> datastoreSetter) {
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

    

    public CreateInstanceRequestBody withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * - 区域ID - 取值：非空。
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
     * 可用区ID。非专属云用户可以选择多个AZ，创建跨AZ的集群。专属云用户暂不支持创建跨AZ的集群。取值：非空。
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
     * 磁盘加密时的密钥ID，严格UUID正则校验。 不传该参数时，表示不进行磁盘加密。
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
        if(this.flavor == null) {
            this.flavor = new ArrayList<>();
        }
        this.flavor.add(flavorItem);
        return this;
    }

    public CreateInstanceRequestBody withFlavor(Consumer<List<CreateInstanceFlavorOption>> flavorSetter) {
        if(this.flavor == null) {
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

    

    public CreateInstanceRequestBody withBackupStrategy(BackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public CreateInstanceRequestBody withBackupStrategy(Consumer<BackupStrategy> backupStrategySetter) {
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

    

    public CreateInstanceRequestBody withDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
        return this;
    }

    


    /**
     * Dec用户专属存储ID，默认为空。仅Dec用户支持该参数。
     * @return dssPoolId
     */
    public String getDssPoolId() {
        return dssPoolId;
    }

    public void setDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
    }

    

    public CreateInstanceRequestBody withServerGroupPolicies(List<String> serverGroupPolicies) {
        this.serverGroupPolicies = serverGroupPolicies;
        return this;
    }

    
    public CreateInstanceRequestBody addServerGroupPoliciesItem(String serverGroupPoliciesItem) {
        if(this.serverGroupPolicies == null) {
            this.serverGroupPolicies = new ArrayList<>();
        }
        this.serverGroupPolicies.add(serverGroupPoliciesItem);
        return this;
    }

    public CreateInstanceRequestBody withServerGroupPolicies(Consumer<List<String>> serverGroupPoliciesSetter) {
        if(this.serverGroupPolicies == null) {
            this.serverGroupPolicies = new ArrayList<>();
        }
        serverGroupPoliciesSetter.accept(this.serverGroupPolicies);
        return this;
    }

    /**
     * 创建新实例设置云服务器组关联的策略名称列表，仅专属云创建实例时有效。 取值    - 取“anti-affinity”，表示DDS实例开启反亲和部署，反亲和部署是出于高可用性考虑，将您的Primary、Secondary和Hidden节点分别创建在不同的物理机上。当前仅支持该值，不传该值默认不开启反亲和部署。
     * @return serverGroupPolicies
     */
    public List<String> getServerGroupPolicies() {
        return serverGroupPolicies;
    }

    public void setServerGroupPolicies(List<String> serverGroupPolicies) {
        this.serverGroupPolicies = serverGroupPolicies;
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
            Objects.equals(this.backupStrategy, createInstanceRequestBody.backupStrategy) &&
            Objects.equals(this.enterpriseProjectId, createInstanceRequestBody.enterpriseProjectId) &&
            Objects.equals(this.sslOption, createInstanceRequestBody.sslOption) &&
            Objects.equals(this.dssPoolId, createInstanceRequestBody.dssPoolId) &&
            Objects.equals(this.serverGroupPolicies, createInstanceRequestBody.serverGroupPolicies);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, datastore, region, availabilityZone, vpcId, subnetId, securityGroupId, password, diskEncryptionId, mode, flavor, backupStrategy, enterpriseProjectId, sslOption, dssPoolId, serverGroupPolicies);
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
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
        sb.append("    dssPoolId: ").append(toIndentedString(dssPoolId)).append("\n");
        sb.append("    serverGroupPolicies: ").append(toIndentedString(serverGroupPolicies)).append("\n");
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

