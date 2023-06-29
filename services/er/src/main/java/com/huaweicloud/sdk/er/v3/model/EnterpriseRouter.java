package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 企业路由器
 */
public class EnterpriseRouter {

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
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asn")

    private Long asn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_default_propagation")

    private Boolean enableDefaultPropagation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_default_association")

    private Boolean enableDefaultAssociation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_propagation_route_table_id")

    private String defaultPropagationRouteTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_association_route_table_id")

    private String defaultAssociationRouteTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_ids")

    private List<String> availabilityZoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_accept_shared_attachments")

    private Boolean autoAcceptSharedAttachments;

    public EnterpriseRouter withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 企业路由器实例的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnterpriseRouter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 企业路由器实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseRouter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 企业路由器实例描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnterpriseRouter withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 运行状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public EnterpriseRouter withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public EnterpriseRouter addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public EnterpriseRouter withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public EnterpriseRouter withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式 按需
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public EnterpriseRouter withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public EnterpriseRouter withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EnterpriseRouter withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public EnterpriseRouter withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public EnterpriseRouter withAsn(Long asn) {
        this.asn = asn;
        return this;
    }

    /**
     * 企业路由器实例的BGP AS号
     * @return asn
     */
    public Long getAsn() {
        return asn;
    }

    public void setAsn(Long asn) {
        this.asn = asn;
    }

    public EnterpriseRouter withEnableDefaultPropagation(Boolean enableDefaultPropagation) {
        this.enableDefaultPropagation = enableDefaultPropagation;
        return this;
    }

    /**
     * 是否开启默认路由表传播，默认false不开启
     * @return enableDefaultPropagation
     */
    public Boolean getEnableDefaultPropagation() {
        return enableDefaultPropagation;
    }

    public void setEnableDefaultPropagation(Boolean enableDefaultPropagation) {
        this.enableDefaultPropagation = enableDefaultPropagation;
    }

    public EnterpriseRouter withEnableDefaultAssociation(Boolean enableDefaultAssociation) {
        this.enableDefaultAssociation = enableDefaultAssociation;
        return this;
    }

    /**
     * 是否开启默认路由表关联，默认false不开启
     * @return enableDefaultAssociation
     */
    public Boolean getEnableDefaultAssociation() {
        return enableDefaultAssociation;
    }

    public void setEnableDefaultAssociation(Boolean enableDefaultAssociation) {
        this.enableDefaultAssociation = enableDefaultAssociation;
    }

    public EnterpriseRouter withDefaultPropagationRouteTableId(String defaultPropagationRouteTableId) {
        this.defaultPropagationRouteTableId = defaultPropagationRouteTableId;
        return this;
    }

    /**
     * 默认传播路由表id
     * @return defaultPropagationRouteTableId
     */
    public String getDefaultPropagationRouteTableId() {
        return defaultPropagationRouteTableId;
    }

    public void setDefaultPropagationRouteTableId(String defaultPropagationRouteTableId) {
        this.defaultPropagationRouteTableId = defaultPropagationRouteTableId;
    }

    public EnterpriseRouter withDefaultAssociationRouteTableId(String defaultAssociationRouteTableId) {
        this.defaultAssociationRouteTableId = defaultAssociationRouteTableId;
        return this;
    }

    /**
     * 默认关联路由表id
     * @return defaultAssociationRouteTableId
     */
    public String getDefaultAssociationRouteTableId() {
        return defaultAssociationRouteTableId;
    }

    public void setDefaultAssociationRouteTableId(String defaultAssociationRouteTableId) {
        this.defaultAssociationRouteTableId = defaultAssociationRouteTableId;
    }

    public EnterpriseRouter withAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
        return this;
    }

    public EnterpriseRouter addAvailabilityZoneIdsItem(String availabilityZoneIdsItem) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        this.availabilityZoneIds.add(availabilityZoneIdsItem);
        return this;
    }

    public EnterpriseRouter withAvailabilityZoneIds(Consumer<List<String>> availabilityZoneIdsSetter) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        availabilityZoneIdsSetter.accept(this.availabilityZoneIds);
        return this;
    }

    /**
     * 企业路由器所在可用区信息
     * @return availabilityZoneIds
     */
    public List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    public void setAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
    }

    public EnterpriseRouter withAutoAcceptSharedAttachments(Boolean autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
        return this;
    }

    /**
     * 是否自动接受共享连接创建，默认false不开启
     * @return autoAcceptSharedAttachments
     */
    public Boolean getAutoAcceptSharedAttachments() {
        return autoAcceptSharedAttachments;
    }

    public void setAutoAcceptSharedAttachments(Boolean autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnterpriseRouter that = (EnterpriseRouter) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.state, that.state)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.asn, that.asn)
            && Objects.equals(this.enableDefaultPropagation, that.enableDefaultPropagation)
            && Objects.equals(this.enableDefaultAssociation, that.enableDefaultAssociation)
            && Objects.equals(this.defaultPropagationRouteTableId, that.defaultPropagationRouteTableId)
            && Objects.equals(this.defaultAssociationRouteTableId, that.defaultAssociationRouteTableId)
            && Objects.equals(this.availabilityZoneIds, that.availabilityZoneIds)
            && Objects.equals(this.autoAcceptSharedAttachments, that.autoAcceptSharedAttachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            state,
            tags,
            chargeMode,
            createdAt,
            updatedAt,
            enterpriseProjectId,
            projectId,
            asn,
            enableDefaultPropagation,
            enableDefaultAssociation,
            defaultPropagationRouteTableId,
            defaultAssociationRouteTableId,
            availabilityZoneIds,
            autoAcceptSharedAttachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseRouter {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
        sb.append("    enableDefaultPropagation: ").append(toIndentedString(enableDefaultPropagation)).append("\n");
        sb.append("    enableDefaultAssociation: ").append(toIndentedString(enableDefaultAssociation)).append("\n");
        sb.append("    defaultPropagationRouteTableId: ")
            .append(toIndentedString(defaultPropagationRouteTableId))
            .append("\n");
        sb.append("    defaultAssociationRouteTableId: ")
            .append(toIndentedString(defaultAssociationRouteTableId))
            .append("\n");
        sb.append("    availabilityZoneIds: ").append(toIndentedString(availabilityZoneIds)).append("\n");
        sb.append("    autoAcceptSharedAttachments: ")
            .append(toIndentedString(autoAcceptSharedAttachments))
            .append("\n");
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
