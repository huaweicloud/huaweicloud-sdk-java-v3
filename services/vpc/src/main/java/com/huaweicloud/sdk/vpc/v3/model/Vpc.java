package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Vpc {

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

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_resources")

    private List<CloudResource> cloudResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public Vpc withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 功能描述：VPC对应的唯一标识 取值范围：带“-”的UUID格式
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vpc withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：VPC对应的名称 取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vpc withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：VPC的描述信息 取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vpc withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 功能说明：VPC下可用子网的范围 取值范围： - 10.0.0.0/8~10.255.255.240/28 - 172.16.0.0/12 ~ 172.31.255.240/28 - 192.168.0.0/16 ~ 192.168.255.240/28 不指定cidr时，默认值为“” 约束：必须是ipv4 cidr格式，例如:192.168.0.0/16
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public Vpc withExtendCidrs(List<String> extendCidrs) {
        this.extendCidrs = extendCidrs;
        return this;
    }

    public Vpc addExtendCidrsItem(String extendCidrsItem) {
        if (this.extendCidrs == null) {
            this.extendCidrs = new ArrayList<>();
        }
        this.extendCidrs.add(extendCidrsItem);
        return this;
    }

    public Vpc withExtendCidrs(Consumer<List<String>> extendCidrsSetter) {
        if (this.extendCidrs == null) {
            this.extendCidrs = new ArrayList<>();
        }
        extendCidrsSetter.accept(this.extendCidrs);
        return this;
    }

    /**
     * 功能描述：VPC的扩展网段 取值范围： 约束：目前只支持ipv4
     * @return extendCidrs
     */
    public List<String> getExtendCidrs() {
        return extendCidrs;
    }

    public void setExtendCidrs(List<String> extendCidrs) {
        this.extendCidrs = extendCidrs;
    }

    public Vpc withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 功能说明：VPC对应的状态 取值范围：PENDING：创建中；ACTIVE：创建成功 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Vpc withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 功能说明：VPC所属的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Vpc withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 功能说明：VPC所属的企业项目ID。 取值范围：最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public Vpc withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 功能说明：VPC创建时间 取值范围：UTC时间格式：yyyy-MM-ddTHH:mm:ss
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Vpc withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 功能说明：VPC更新时间 取值范围：UTC时间格式：yyyy-MM-ddTHH:mm:ss
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Vpc withCloudResources(List<CloudResource> cloudResources) {
        this.cloudResources = cloudResources;
        return this;
    }

    public Vpc addCloudResourcesItem(CloudResource cloudResourcesItem) {
        if (this.cloudResources == null) {
            this.cloudResources = new ArrayList<>();
        }
        this.cloudResources.add(cloudResourcesItem);
        return this;
    }

    public Vpc withCloudResources(Consumer<List<CloudResource>> cloudResourcesSetter) {
        if (this.cloudResources == null) {
            this.cloudResources = new ArrayList<>();
        }
        cloudResourcesSetter.accept(this.cloudResources);
        return this;
    }

    /**
     * 功能说明：VPC关联资源类型和数量 取值范围：目前只返回VPC关联的routetable和virsubnet
     * @return cloudResources
     */
    public List<CloudResource> getCloudResources() {
        return cloudResources;
    }

    public void setCloudResources(List<CloudResource> cloudResources) {
        this.cloudResources = cloudResources;
    }

    public Vpc withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public Vpc addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Vpc withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 功能说明：VPC的标签信息，详情参见Tag对象 取值范围：0-10个标签键值对
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vpc vpc = (Vpc) o;
        return Objects.equals(this.id, vpc.id) && Objects.equals(this.name, vpc.name)
            && Objects.equals(this.description, vpc.description) && Objects.equals(this.cidr, vpc.cidr)
            && Objects.equals(this.extendCidrs, vpc.extendCidrs) && Objects.equals(this.status, vpc.status)
            && Objects.equals(this.projectId, vpc.projectId)
            && Objects.equals(this.enterpriseProjectId, vpc.enterpriseProjectId)
            && Objects.equals(this.createdAt, vpc.createdAt) && Objects.equals(this.updatedAt, vpc.updatedAt)
            && Objects.equals(this.cloudResources, vpc.cloudResources) && Objects.equals(this.tags, vpc.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
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
        sb.append("class Vpc {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
