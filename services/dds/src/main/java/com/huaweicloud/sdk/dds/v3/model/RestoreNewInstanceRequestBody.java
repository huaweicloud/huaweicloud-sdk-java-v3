package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例信息。
 */
public class RestoreNewInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encryption_id")

    private String diskEncryptionId;

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
    @JsonProperty(value = "server_group_policies")

    private List<String> serverGroupPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_point")

    private RestorePoint restorePoint;

    public RestoreNewInstanceRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。用于表示实例的名称，用于表示实例的名称，允许和已有名称重复。 取值范围：长度为4~64位，必须以字母开头（A~Z或a~z），区分大小写，可以包含字母、数字（0~9）、中划线（-）或者下划线（_），不能包含其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RestoreNewInstanceRequestBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区ID，请参见[地区和终端节点](https://developer.huaweicloud.com/endpoint)。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public RestoreNewInstanceRequestBody withVpcId(String vpcId) {
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

    public RestoreNewInstanceRequestBody withSubnetId(String subnetId) {
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

    public RestoreNewInstanceRequestBody withSecurityGroupId(String securityGroupId) {
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

    public RestoreNewInstanceRequestBody withPassword(String password) {
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

    public RestoreNewInstanceRequestBody withDiskEncryptionId(String diskEncryptionId) {
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

    public RestoreNewInstanceRequestBody withFlavor(List<RestoreNewInstanceFlavorOption> flavor) {
        this.flavor = flavor;
        return this;
    }

    public RestoreNewInstanceRequestBody addFlavorItem(RestoreNewInstanceFlavorOption flavorItem) {
        if (this.flavor == null) {
            this.flavor = new ArrayList<>();
        }
        this.flavor.add(flavorItem);
        return this;
    }

    public RestoreNewInstanceRequestBody withFlavor(Consumer<List<RestoreNewInstanceFlavorOption>> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new ArrayList<>();
        }
        flavorSetter.accept(this.flavor);
        return this;
    }

    /**
     * 实例规格详情。
     * @return flavor
     */
    public List<RestoreNewInstanceFlavorOption> getFlavor() {
        return flavor;
    }

    public void setFlavor(List<RestoreNewInstanceFlavorOption> flavor) {
        this.flavor = flavor;
    }

    public RestoreNewInstanceRequestBody withBackupStrategy(BackupStrategy backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public RestoreNewInstanceRequestBody withBackupStrategy(Consumer<BackupStrategy> backupStrategySetter) {
        if (this.backupStrategy == null) {
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

    public RestoreNewInstanceRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
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

    public RestoreNewInstanceRequestBody withSslOption(String sslOption) {
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

    public RestoreNewInstanceRequestBody withDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
        return this;
    }

    /**
     * 创建新实例所在专属存储池ID，仅专属云创建实例时有效。
     * @return dssPoolId
     */
    public String getDssPoolId() {
        return dssPoolId;
    }

    public void setDssPoolId(String dssPoolId) {
        this.dssPoolId = dssPoolId;
    }

    public RestoreNewInstanceRequestBody withServerGroupPolicies(List<String> serverGroupPolicies) {
        this.serverGroupPolicies = serverGroupPolicies;
        return this;
    }

    public RestoreNewInstanceRequestBody addServerGroupPoliciesItem(String serverGroupPoliciesItem) {
        if (this.serverGroupPolicies == null) {
            this.serverGroupPolicies = new ArrayList<>();
        }
        this.serverGroupPolicies.add(serverGroupPoliciesItem);
        return this;
    }

    public RestoreNewInstanceRequestBody withServerGroupPolicies(Consumer<List<String>> serverGroupPoliciesSetter) {
        if (this.serverGroupPolicies == null) {
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

    public RestoreNewInstanceRequestBody withRestorePoint(RestorePoint restorePoint) {
        this.restorePoint = restorePoint;
        return this;
    }

    public RestoreNewInstanceRequestBody withRestorePoint(Consumer<RestorePoint> restorePointSetter) {
        if (this.restorePoint == null) {
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
        RestoreNewInstanceRequestBody restoreNewInstanceRequestBody = (RestoreNewInstanceRequestBody) o;
        return Objects.equals(this.name, restoreNewInstanceRequestBody.name)
            && Objects.equals(this.availabilityZone, restoreNewInstanceRequestBody.availabilityZone)
            && Objects.equals(this.vpcId, restoreNewInstanceRequestBody.vpcId)
            && Objects.equals(this.subnetId, restoreNewInstanceRequestBody.subnetId)
            && Objects.equals(this.securityGroupId, restoreNewInstanceRequestBody.securityGroupId)
            && Objects.equals(this.password, restoreNewInstanceRequestBody.password)
            && Objects.equals(this.diskEncryptionId, restoreNewInstanceRequestBody.diskEncryptionId)
            && Objects.equals(this.flavor, restoreNewInstanceRequestBody.flavor)
            && Objects.equals(this.backupStrategy, restoreNewInstanceRequestBody.backupStrategy)
            && Objects.equals(this.enterpriseProjectId, restoreNewInstanceRequestBody.enterpriseProjectId)
            && Objects.equals(this.sslOption, restoreNewInstanceRequestBody.sslOption)
            && Objects.equals(this.dssPoolId, restoreNewInstanceRequestBody.dssPoolId)
            && Objects.equals(this.serverGroupPolicies, restoreNewInstanceRequestBody.serverGroupPolicies)
            && Objects.equals(this.restorePoint, restoreNewInstanceRequestBody.restorePoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            availabilityZone,
            vpcId,
            subnetId,
            securityGroupId,
            password,
            diskEncryptionId,
            flavor,
            backupStrategy,
            enterpriseProjectId,
            sslOption,
            dssPoolId,
            serverGroupPolicies,
            restorePoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreNewInstanceRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    diskEncryptionId: ").append(toIndentedString(diskEncryptionId)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
        sb.append("    dssPoolId: ").append(toIndentedString(dssPoolId)).append("\n");
        sb.append("    serverGroupPolicies: ").append(toIndentedString(serverGroupPolicies)).append("\n");
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
