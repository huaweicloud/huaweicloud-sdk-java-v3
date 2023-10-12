package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组织合规规则包详情。
 */
public class OrgConformancePackResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_conformance_pack_id")

    private String orgConformancePackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_conformance_pack_name")

    private String orgConformancePackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_conformance_pack_urn")

    private String orgConformancePackUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_structure")

    private List<VarsStructure> varsStructure = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public OrgConformancePackResponse withOrgConformancePackId(String orgConformancePackId) {
        this.orgConformancePackId = orgConformancePackId;
        return this;
    }

    /**
     * 组织合规规则包ID。
     * @return orgConformancePackId
     */
    public String getOrgConformancePackId() {
        return orgConformancePackId;
    }

    public void setOrgConformancePackId(String orgConformancePackId) {
        this.orgConformancePackId = orgConformancePackId;
    }

    public OrgConformancePackResponse withOrgConformancePackName(String orgConformancePackName) {
        this.orgConformancePackName = orgConformancePackName;
        return this;
    }

    /**
     * 组织合规规则包名称。
     * @return orgConformancePackName
     */
    public String getOrgConformancePackName() {
        return orgConformancePackName;
    }

    public void setOrgConformancePackName(String orgConformancePackName) {
        this.orgConformancePackName = orgConformancePackName;
    }

    public OrgConformancePackResponse withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 组织合规规则包创建者。
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public OrgConformancePackResponse withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 组织ID
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public OrgConformancePackResponse withOrgConformancePackUrn(String orgConformancePackUrn) {
        this.orgConformancePackUrn = orgConformancePackUrn;
        return this;
    }

    /**
     * 组织合规规则包资源唯一标识。
     * @return orgConformancePackUrn
     */
    public String getOrgConformancePackUrn() {
        return orgConformancePackUrn;
    }

    public void setOrgConformancePackUrn(String orgConformancePackUrn) {
        this.orgConformancePackUrn = orgConformancePackUrn;
    }

    public OrgConformancePackResponse withVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
        return this;
    }

    public OrgConformancePackResponse addVarsStructureItem(VarsStructure varsStructureItem) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        this.varsStructure.add(varsStructureItem);
        return this;
    }

    public OrgConformancePackResponse withVarsStructure(Consumer<List<VarsStructure>> varsStructureSetter) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        varsStructureSetter.accept(this.varsStructure);
        return this;
    }

    /**
     * 合规规则包参数。
     * @return varsStructure
     */
    public List<VarsStructure> getVarsStructure() {
        return varsStructure;
    }

    public void setVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
    }

    public OrgConformancePackResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 组织合规规则包创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public OrgConformancePackResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 组织合规规则包更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrgConformancePackResponse that = (OrgConformancePackResponse) obj;
        return Objects.equals(this.orgConformancePackId, that.orgConformancePackId)
            && Objects.equals(this.orgConformancePackName, that.orgConformancePackName)
            && Objects.equals(this.ownerId, that.ownerId) && Objects.equals(this.organizationId, that.organizationId)
            && Objects.equals(this.orgConformancePackUrn, that.orgConformancePackUrn)
            && Objects.equals(this.varsStructure, that.varsStructure) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgConformancePackId,
            orgConformancePackName,
            ownerId,
            organizationId,
            orgConformancePackUrn,
            varsStructure,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgConformancePackResponse {\n");
        sb.append("    orgConformancePackId: ").append(toIndentedString(orgConformancePackId)).append("\n");
        sb.append("    orgConformancePackName: ").append(toIndentedString(orgConformancePackName)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    orgConformancePackUrn: ").append(toIndentedString(orgConformancePackUrn)).append("\n");
        sb.append("    varsStructure: ").append(toIndentedString(varsStructure)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
