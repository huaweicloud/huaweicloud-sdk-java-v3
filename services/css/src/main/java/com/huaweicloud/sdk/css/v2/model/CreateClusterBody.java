package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群对象。
 */
public class CreateClusterBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backupStrategy")

    private CreateClusterBackupStrategyBody backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<CreateClusterRolesBody> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private CreateClusterInstanceNicsBody nics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateClusterTagsBody> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private CreateClusterDatastoreBody datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorityEnable")

    private Boolean authorityEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpsEnable")

    private Boolean httpsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminPwd")

    private String adminPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicIPReq")

    private CreateClusterPublicIpReq publicIPReq;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadBalance")

    private CreateClusterLoadBalance loadBalance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicKibanaReq")

    private CreateClusterPublicKibanaReq publicKibanaReq;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payInfo")

    private PayInfoBody payInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diskEncryption")

    private DiskEncryptionInfo diskEncryption;

    public CreateClusterBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 集群名称。4～32个字符，只能包含数字、字母、中划线和下划线，且必须以字母开头。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateClusterBody withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 集群描述。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CreateClusterBody withBackupStrategy(CreateClusterBackupStrategyBody backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public CreateClusterBody withBackupStrategy(Consumer<CreateClusterBackupStrategyBody> backupStrategySetter) {
        if (this.backupStrategy == null) {
            this.backupStrategy = new CreateClusterBackupStrategyBody();
            backupStrategySetter.accept(this.backupStrategy);
        }

        return this;
    }

    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public CreateClusterBackupStrategyBody getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(CreateClusterBackupStrategyBody backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public CreateClusterBody withRoles(List<CreateClusterRolesBody> roles) {
        this.roles = roles;
        return this;
    }

    public CreateClusterBody addRolesItem(CreateClusterRolesBody rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public CreateClusterBody withRoles(Consumer<List<CreateClusterRolesBody>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * Get roles
     * @return roles
     */
    public List<CreateClusterRolesBody> getRoles() {
        return roles;
    }

    public void setRoles(List<CreateClusterRolesBody> roles) {
        this.roles = roles;
    }

    public CreateClusterBody withNics(CreateClusterInstanceNicsBody nics) {
        this.nics = nics;
        return this;
    }

    public CreateClusterBody withNics(Consumer<CreateClusterInstanceNicsBody> nicsSetter) {
        if (this.nics == null) {
            this.nics = new CreateClusterInstanceNicsBody();
            nicsSetter.accept(this.nics);
        }

        return this;
    }

    /**
     * Get nics
     * @return nics
     */
    public CreateClusterInstanceNicsBody getNics() {
        return nics;
    }

    public void setNics(CreateClusterInstanceNicsBody nics) {
        this.nics = nics;
    }

    public CreateClusterBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。创建集群时，给集群绑定企业项目ID。最大长度36个字符，带\"-\"连字符的UUID格式，或者是字符串\"0\"。\"0\"表示默认企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateClusterBody withTags(List<CreateClusterTagsBody> tags) {
        this.tags = tags;
        return this;
    }

    public CreateClusterBody addTagsItem(CreateClusterTagsBody tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateClusterBody withTags(Consumer<List<CreateClusterTagsBody>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 集群标签。
     * @return tags
     */
    public List<CreateClusterTagsBody> getTags() {
        return tags;
    }

    public void setTags(List<CreateClusterTagsBody> tags) {
        this.tags = tags;
    }

    public CreateClusterBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateClusterBody withDatastore(CreateClusterDatastoreBody datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateClusterBody withDatastore(Consumer<CreateClusterDatastoreBody> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new CreateClusterDatastoreBody();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public CreateClusterDatastoreBody getDatastore() {
        return datastore;
    }

    public void setDatastore(CreateClusterDatastoreBody datastore) {
        this.datastore = datastore;
    }

    public CreateClusterBody withAuthorityEnable(Boolean authorityEnable) {
        this.authorityEnable = authorityEnable;
        return this;
    }

    /**
     * 是否开启认证，取值范围为true或false。默认关闭认证功能。  - true：表示集群开启认证。 - false：表示集群不开启认证。  >此参数只有6.5.4及之后版本支持。
     * @return authorityEnable
     */
    public Boolean getAuthorityEnable() {
        return authorityEnable;
    }

    public void setAuthorityEnable(Boolean authorityEnable) {
        this.authorityEnable = authorityEnable;
    }

    public CreateClusterBody withHttpsEnable(Boolean httpsEnable) {
        this.httpsEnable = httpsEnable;
        return this;
    }

    /**
     * 设置是否进行通信加密。取值范围为true或false。默认关闭通信加密功能。当httpsEnable设置为true时，authorityEnable字段需要设置为true。 - true：表示集群进行通信加密。 - false：表示集群不进行通信加密。  >此参数只有6.5.4及之后版本支持。
     * @return httpsEnable
     */
    public Boolean getHttpsEnable() {
        return httpsEnable;
    }

    public void setHttpsEnable(Boolean httpsEnable) {
        this.httpsEnable = httpsEnable;
    }

    public CreateClusterBody withAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
        return this;
    }

    /**
     * 安全模式下集群管理员admin的密码，只有在创建集群时authorityEnable设置为true时需要设置此参数。  - 参数范围：8~32个字符。  - 参数要求：密码至少包含大写字母，小写字母，数字、特殊字符四类中的三类，其中可输入的特殊字符为：~!@#$%&*()-_=|[{}];:,<.>/?
     * @return adminPwd
     */
    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public CreateClusterBody withPublicIPReq(CreateClusterPublicIpReq publicIPReq) {
        this.publicIPReq = publicIPReq;
        return this;
    }

    public CreateClusterBody withPublicIPReq(Consumer<CreateClusterPublicIpReq> publicIPReqSetter) {
        if (this.publicIPReq == null) {
            this.publicIPReq = new CreateClusterPublicIpReq();
            publicIPReqSetter.accept(this.publicIPReq);
        }

        return this;
    }

    /**
     * Get publicIPReq
     * @return publicIPReq
     */
    public CreateClusterPublicIpReq getPublicIPReq() {
        return publicIPReq;
    }

    public void setPublicIPReq(CreateClusterPublicIpReq publicIPReq) {
        this.publicIPReq = publicIPReq;
    }

    public CreateClusterBody withLoadBalance(CreateClusterLoadBalance loadBalance) {
        this.loadBalance = loadBalance;
        return this;
    }

    public CreateClusterBody withLoadBalance(Consumer<CreateClusterLoadBalance> loadBalanceSetter) {
        if (this.loadBalance == null) {
            this.loadBalance = new CreateClusterLoadBalance();
            loadBalanceSetter.accept(this.loadBalance);
        }

        return this;
    }

    /**
     * Get loadBalance
     * @return loadBalance
     */
    public CreateClusterLoadBalance getLoadBalance() {
        return loadBalance;
    }

    public void setLoadBalance(CreateClusterLoadBalance loadBalance) {
        this.loadBalance = loadBalance;
    }

    public CreateClusterBody withPublicKibanaReq(CreateClusterPublicKibanaReq publicKibanaReq) {
        this.publicKibanaReq = publicKibanaReq;
        return this;
    }

    public CreateClusterBody withPublicKibanaReq(Consumer<CreateClusterPublicKibanaReq> publicKibanaReqSetter) {
        if (this.publicKibanaReq == null) {
            this.publicKibanaReq = new CreateClusterPublicKibanaReq();
            publicKibanaReqSetter.accept(this.publicKibanaReq);
        }

        return this;
    }

    /**
     * Get publicKibanaReq
     * @return publicKibanaReq
     */
    public CreateClusterPublicKibanaReq getPublicKibanaReq() {
        return publicKibanaReq;
    }

    public void setPublicKibanaReq(CreateClusterPublicKibanaReq publicKibanaReq) {
        this.publicKibanaReq = publicKibanaReq;
    }

    public CreateClusterBody withPayInfo(PayInfoBody payInfo) {
        this.payInfo = payInfo;
        return this;
    }

    public CreateClusterBody withPayInfo(Consumer<PayInfoBody> payInfoSetter) {
        if (this.payInfo == null) {
            this.payInfo = new PayInfoBody();
            payInfoSetter.accept(this.payInfo);
        }

        return this;
    }

    /**
     * Get payInfo
     * @return payInfo
     */
    public PayInfoBody getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(PayInfoBody payInfo) {
        this.payInfo = payInfo;
    }

    public CreateClusterBody withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 集群是否开启自动分配IPv6地址。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public CreateClusterBody withDiskEncryption(DiskEncryptionInfo diskEncryption) {
        this.diskEncryption = diskEncryption;
        return this;
    }

    public CreateClusterBody withDiskEncryption(Consumer<DiskEncryptionInfo> diskEncryptionSetter) {
        if (this.diskEncryption == null) {
            this.diskEncryption = new DiskEncryptionInfo();
            diskEncryptionSetter.accept(this.diskEncryption);
        }

        return this;
    }

    /**
     * Get diskEncryption
     * @return diskEncryption
     */
    public DiskEncryptionInfo getDiskEncryption() {
        return diskEncryption;
    }

    public void setDiskEncryption(DiskEncryptionInfo diskEncryption) {
        this.diskEncryption = diskEncryption;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterBody that = (CreateClusterBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.backupStrategy, that.backupStrategy) && Objects.equals(this.roles, that.roles)
            && Objects.equals(this.nics, that.nics)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.authorityEnable, that.authorityEnable)
            && Objects.equals(this.httpsEnable, that.httpsEnable) && Objects.equals(this.adminPwd, that.adminPwd)
            && Objects.equals(this.publicIPReq, that.publicIPReq) && Objects.equals(this.loadBalance, that.loadBalance)
            && Objects.equals(this.publicKibanaReq, that.publicKibanaReq) && Objects.equals(this.payInfo, that.payInfo)
            && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.diskEncryption, that.diskEncryption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            desc,
            backupStrategy,
            roles,
            nics,
            enterpriseProjectId,
            tags,
            availabilityZone,
            datastore,
            authorityEnable,
            httpsEnable,
            adminPwd,
            publicIPReq,
            loadBalance,
            publicKibanaReq,
            payInfo,
            ipv6Enable,
            diskEncryption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    authorityEnable: ").append(toIndentedString(authorityEnable)).append("\n");
        sb.append("    httpsEnable: ").append(toIndentedString(httpsEnable)).append("\n");
        sb.append("    adminPwd: ").append(toIndentedString(adminPwd)).append("\n");
        sb.append("    publicIPReq: ").append(toIndentedString(publicIPReq)).append("\n");
        sb.append("    loadBalance: ").append(toIndentedString(loadBalance)).append("\n");
        sb.append("    publicKibanaReq: ").append(toIndentedString(publicKibanaReq)).append("\n");
        sb.append("    payInfo: ").append(toIndentedString(payInfo)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    diskEncryption: ").append(toIndentedString(diskEncryption)).append("\n");
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
