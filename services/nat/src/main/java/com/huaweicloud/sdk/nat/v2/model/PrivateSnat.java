package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SNAT规则的响应体。
 */
public class PrivateSnat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_associations")

    private List<AssociatedTransitIp> transitIpAssociations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public PrivateSnat withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * SNAT规则的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PrivateSnat withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目的ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PrivateSnat withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * 私网NAT网关实例的ID。
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public PrivateSnat withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 功能说明：规则匹配的CIDR。 取值约束： - 与virsubnet_id参数二选一。 - cidr不能与已有snat规则的网段相同。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public PrivateSnat withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * 功能说明：规则匹配的子网的ID。 取值约束：与cidr参数二选一。
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public PrivateSnat withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * SNAT规则的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PrivateSnat withTransitIpAssociations(List<AssociatedTransitIp> transitIpAssociations) {
        this.transitIpAssociations = transitIpAssociations;
        return this;
    }

    public PrivateSnat addTransitIpAssociationsItem(AssociatedTransitIp transitIpAssociationsItem) {
        if (this.transitIpAssociations == null) {
            this.transitIpAssociations = new ArrayList<>();
        }
        this.transitIpAssociations.add(transitIpAssociationsItem);
        return this;
    }

    public PrivateSnat withTransitIpAssociations(Consumer<List<AssociatedTransitIp>> transitIpAssociationsSetter) {
        if (this.transitIpAssociations == null) {
            this.transitIpAssociations = new ArrayList<>();
        }
        transitIpAssociationsSetter.accept(this.transitIpAssociations);
        return this;
    }

    /**
     * 关联的中转IP详情列表。
     * @return transitIpAssociations
     */
    public List<AssociatedTransitIp> getTransitIpAssociations() {
        return transitIpAssociations;
    }

    public void setTransitIpAssociations(List<AssociatedTransitIp> transitIpAssociations) {
        this.transitIpAssociations = transitIpAssociations;
    }

    public PrivateSnat withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * SNAT规则的创建时间，遵循UTC时间，格式是yyyy-mm-ddThh:mm:ssZ。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PrivateSnat withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * SNAT规则的更新时间，遵循UTC时间，格式是yyyy-mm-ddThh:mm:ssZ。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PrivateSnat withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivateSnat privateSnat = (PrivateSnat) o;
        return Objects.equals(this.id, privateSnat.id) && Objects.equals(this.projectId, privateSnat.projectId)
            && Objects.equals(this.gatewayId, privateSnat.gatewayId) && Objects.equals(this.cidr, privateSnat.cidr)
            && Objects.equals(this.virsubnetId, privateSnat.virsubnetId)
            && Objects.equals(this.description, privateSnat.description)
            && Objects.equals(this.transitIpAssociations, privateSnat.transitIpAssociations)
            && Objects.equals(this.createdAt, privateSnat.createdAt)
            && Objects.equals(this.updatedAt, privateSnat.updatedAt)
            && Objects.equals(this.enterpriseProjectId, privateSnat.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            gatewayId,
            cidr,
            virsubnetId,
            description,
            transitIpAssociations,
            createdAt,
            updatedAt,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateSnat {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    transitIpAssociations: ").append(toIndentedString(transitIpAssociations)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
