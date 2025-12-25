package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云虚拟私有云
 */
public class HwcVpc {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_status")

    private String protectedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_cidrs")

    private List<String> extendCidrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_resources")

    private List<HwcVpcCloudResource> cloudResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public HwcVpc withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * VPC对应的唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HwcVpc withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * VPC对应的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HwcVpc withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * VPC的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HwcVpc withProtectedStatus(String protectedStatus) {
        this.protectedStatus = protectedStatus;
        return this;
    }

    /**
     * CFW开启或安全组规则配置状态：OPEN | CLOSE
     * @return protectedStatus
     */
    public String getProtectedStatus() {
        return protectedStatus;
    }

    public void setProtectedStatus(String protectedStatus) {
        this.protectedStatus = protectedStatus;
    }

    public HwcVpc withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * VPC下可用子网的范围 取值范围： 10.0.0.0/8~10.255.255.240/28 172.16.0.0/12 ~ 172.31.255.240/28 192.168.0.0/16 ~ 192.168.255.240/28 不指定cidr时，默认值为“” 约束：必须是ipv4 cidr格式，例如:192.168.0.0/16
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public HwcVpc withExtendCidrs(List<String> extendCidrs) {
        this.extendCidrs = extendCidrs;
        return this;
    }

    public HwcVpc addExtendCidrsItem(String extendCidrsItem) {
        if (this.extendCidrs == null) {
            this.extendCidrs = new ArrayList<>();
        }
        this.extendCidrs.add(extendCidrsItem);
        return this;
    }

    public HwcVpc withExtendCidrs(Consumer<List<String>> extendCidrsSetter) {
        if (this.extendCidrs == null) {
            this.extendCidrs = new ArrayList<>();
        }
        extendCidrsSetter.accept(this.extendCidrs);
        return this;
    }

    /**
     * VPC的扩展网段 约束：目前只支持ipv4
     * @return extendCidrs
     */
    public List<String> getExtendCidrs() {
        return extendCidrs;
    }

    public void setExtendCidrs(List<String> extendCidrs) {
        this.extendCidrs = extendCidrs;
    }

    public HwcVpc withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * VPC对应的状态 取值范围： PENDING：创建中 ACTIVE：创建成功
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HwcVpc withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * VPC所属的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public HwcVpc withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * VPC所属的企业项目ID。 取值范围：最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public HwcVpc withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * VPC创建时间 取值范围：UTC时间格式，yyyy-MM-ddTHH:mm:ss
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public HwcVpc withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * VPC更新时间 取值范围：UTC时间格式，yyyy-MM-ddTHH:mm:ss
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public HwcVpc withCloudResources(List<HwcVpcCloudResource> cloudResources) {
        this.cloudResources = cloudResources;
        return this;
    }

    public HwcVpc addCloudResourcesItem(HwcVpcCloudResource cloudResourcesItem) {
        if (this.cloudResources == null) {
            this.cloudResources = new ArrayList<>();
        }
        this.cloudResources.add(cloudResourcesItem);
        return this;
    }

    public HwcVpc withCloudResources(Consumer<List<HwcVpcCloudResource>> cloudResourcesSetter) {
        if (this.cloudResources == null) {
            this.cloudResources = new ArrayList<>();
        }
        cloudResourcesSetter.accept(this.cloudResources);
        return this;
    }

    /**
     * VPC关联资产类型和数量 取值范围：目前只返回VPC关联的routetable和virsubnet。virsubnet数量为ipv4和ipv6子网总数。
     * @return cloudResources
     */
    public List<HwcVpcCloudResource> getCloudResources() {
        return cloudResources;
    }

    public void setCloudResources(List<HwcVpcCloudResource> cloudResources) {
        this.cloudResources = cloudResources;
    }

    public HwcVpc withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public HwcVpc addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public HwcVpc withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * VPC的标签信息，详情参见Tag对象 取值范围：0-10个标签键值对
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
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
        HwcVpc that = (HwcVpc) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.protectedStatus, that.protectedStatus) && Objects.equals(this.cidr, that.cidr)
            && Objects.equals(this.extendCidrs, that.extendCidrs) && Objects.equals(this.status, that.status)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.cloudResources, that.cloudResources) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            protectedStatus,
            cidr,
            extendCidrs,
            status,
            projectId,
            enterpriseProjectId,
            createdAt,
            updatedAt,
            cloudResources,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HwcVpc {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protectedStatus: ").append(toIndentedString(protectedStatus)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    extendCidrs: ").append(toIndentedString(extendCidrs)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    cloudResources: ").append(toIndentedString(cloudResources)).append("\n");
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
