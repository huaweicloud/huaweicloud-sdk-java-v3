package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建文件系统参数body
 */
public class Share {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_proto")

    private String shareProto;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_type")

    private String shareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    public Share withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 文件系统所在可用区(az)的编码
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Share withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 文件系统描述信息，长度为0~255。当前不支持。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Share withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 创建文件系统时，给文件系统绑定的企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public Share withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Share withMetadata(Consumer<Metadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Share withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * SFS Turbo文件系统的名称。长度为4~64位，必须以字母开头，可以包含字母、数字、中划线、下划线，不能包含其他的特殊字符，不区分大小写。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Share withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 用户在某一区域下的安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public Share withShareProto(String shareProto) {
        this.shareProto = shareProto;
        return this;
    }

    /**
     * 文件系统共享协议，有效值为NFS。NFS（Network File System），即网络文件系统。一种使用于分散式文件系统的协议，通过网络让不同的机器、不同的操作系统能够彼此分享数据。
     * @return shareProto
     */
    public String getShareProto() {
        return shareProto;
    }

    public void setShareProto(String shareProto) {
        this.shareProto = shareProto;
    }

    public Share withShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }

    /**
     * 文件系统类型，有效值为STANDARD或者PERFORMANCE。 通用型：标准型和标准型增强版填写STANDARD，性能型和性能型增强版填写PERFORMANCE。 HPC型：不校验该字段，可填写STANDARD或者PERFORMANCE。 HPC缓存型：不校验该字段，可填写STANDARD或者PERFORMANCE。 
     * @return shareType
     */
    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public Share withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 通用型-普通文件系统容量，取值范围500~32768，单位GB。 通用型-增强版文件系统，即在“metadata”字段中设置了expand_type=\"bandwidth\"，则容量范围是10240~327680，单位GiB。 HPC型文件系统，即在“metadata”字段中设置了expand_type=\"hpc\"，则容量范围是3686(或1228)~1048576，单位GiB。对于20MB/s/TiB的规格，起步容量为3686GiB；对于HPC其他规格，起步容量为1228GiB。HPC型文件系统的容量必须为1.2TiB的倍数，换算为GiB后需要向下取整。如3.6TiB->3686GiB, 4.8TiB->4915GiB，8.4TiB->8601GiB。 HPC缓存型文件系统，即在“metadata”字段中设置了expand_type=\"hpc_cache\"，则容量范围是4096~1048576，单位GiB。不同带宽，起步容量不一样，步长均为1TiB。如2GB/s带宽，起步容量为4TiB，即4096GiB；4GB/s带宽，起步容量为8TiB，即8192GiB；8GB/s带宽，起步容量为16TiB，即16384GiB。 
     * minimum: 500
     * maximum: 1048576
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Share withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 用户在VPC下面的子网的网络ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Share withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 用户在某一区域下的VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Share withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份ID，从备份创建文件系统时为必选。
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public Share withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public Share addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Share withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * tag标签的列表。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Share that = (Share) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.name, that.name)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.shareProto, that.shareProto) && Objects.equals(this.shareType, that.shareType)
            && Objects.equals(this.size, that.size) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.backupId, that.backupId)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone,
            description,
            enterpriseProjectId,
            metadata,
            name,
            securityGroupId,
            shareProto,
            shareType,
            size,
            subnetId,
            vpcId,
            backupId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Share {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    shareProto: ").append(toIndentedString(shareProto)).append("\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
