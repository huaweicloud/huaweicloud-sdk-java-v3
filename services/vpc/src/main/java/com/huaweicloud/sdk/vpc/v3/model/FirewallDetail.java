package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class FirewallDetail {

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
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associations")

    private List<FirewallAssociation> associations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_rules")

    private List<FirewallRuleDetail> ingressRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress_rules")

    private List<FirewallRuleDetail> egressRules = null;

    public FirewallDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 功能说明：ACL唯一标识 取值范围：合法UUID的字符串
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FirewallDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：ACL名称 取值范围：0-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirewallDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：ACL描述信息 取值范围：0-255个字符 约束：不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FirewallDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 功能说明：资源所属项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public FirewallDetail withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 功能说明：ACL创建时间 取值范围：UTC时间格式：yyyy-MM-ddTHH:mm:ss；系统自动生成
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public FirewallDetail withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 功能描述：ACL最近一次更新资源的时间 取值范围：UTC时间格式：yyyy-MM-ddTHH:mm:ss；系统自动生成
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public FirewallDetail withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 功能说明：ACL是否开启 取值范围：true表示ACL开启；false表示ACL关闭
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public FirewallDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 功能说明：网络ACL的状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FirewallDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 功能说明：ACL企业项目ID。 取值范围：最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public FirewallDetail withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public FirewallDetail addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public FirewallDetail withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 功能描述：ACL资源标签
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public FirewallDetail withAssociations(List<FirewallAssociation> associations) {
        this.associations = associations;
        return this;
    }

    public FirewallDetail addAssociationsItem(FirewallAssociation associationsItem) {
        if (this.associations == null) {
            this.associations = new ArrayList<>();
        }
        this.associations.add(associationsItem);
        return this;
    }

    public FirewallDetail withAssociations(Consumer<List<FirewallAssociation>> associationsSetter) {
        if (this.associations == null) {
            this.associations = new ArrayList<>();
        }
        associationsSetter.accept(this.associations);
        return this;
    }

    /**
     * 功能说明：ACL绑定的子网列表
     * @return associations
     */
    public List<FirewallAssociation> getAssociations() {
        return associations;
    }

    public void setAssociations(List<FirewallAssociation> associations) {
        this.associations = associations;
    }

    public FirewallDetail withIngressRules(List<FirewallRuleDetail> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }

    public FirewallDetail addIngressRulesItem(FirewallRuleDetail ingressRulesItem) {
        if (this.ingressRules == null) {
            this.ingressRules = new ArrayList<>();
        }
        this.ingressRules.add(ingressRulesItem);
        return this;
    }

    public FirewallDetail withIngressRules(Consumer<List<FirewallRuleDetail>> ingressRulesSetter) {
        if (this.ingressRules == null) {
            this.ingressRules = new ArrayList<>();
        }
        ingressRulesSetter.accept(this.ingressRules);
        return this;
    }

    /**
     * 功能说明：ACL入方向规则列表
     * @return ingressRules
     */
    public List<FirewallRuleDetail> getIngressRules() {
        return ingressRules;
    }

    public void setIngressRules(List<FirewallRuleDetail> ingressRules) {
        this.ingressRules = ingressRules;
    }

    public FirewallDetail withEgressRules(List<FirewallRuleDetail> egressRules) {
        this.egressRules = egressRules;
        return this;
    }

    public FirewallDetail addEgressRulesItem(FirewallRuleDetail egressRulesItem) {
        if (this.egressRules == null) {
            this.egressRules = new ArrayList<>();
        }
        this.egressRules.add(egressRulesItem);
        return this;
    }

    public FirewallDetail withEgressRules(Consumer<List<FirewallRuleDetail>> egressRulesSetter) {
        if (this.egressRules == null) {
            this.egressRules = new ArrayList<>();
        }
        egressRulesSetter.accept(this.egressRules);
        return this;
    }

    /**
     * 功能说明：ACL出方向规则列表
     * @return egressRules
     */
    public List<FirewallRuleDetail> getEgressRules() {
        return egressRules;
    }

    public void setEgressRules(List<FirewallRuleDetail> egressRules) {
        this.egressRules = egressRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirewallDetail that = (FirewallDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.status, that.status)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.associations, that.associations)
            && Objects.equals(this.ingressRules, that.ingressRules)
            && Objects.equals(this.egressRules, that.egressRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            projectId,
            createdAt,
            updatedAt,
            adminStateUp,
            status,
            enterpriseProjectId,
            tags,
            associations,
            ingressRules,
            egressRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirewallDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
        sb.append("    ingressRules: ").append(toIndentedString(ingressRules)).append("\n");
        sb.append("    egressRules: ").append(toIndentedString(egressRules)).append("\n");
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
