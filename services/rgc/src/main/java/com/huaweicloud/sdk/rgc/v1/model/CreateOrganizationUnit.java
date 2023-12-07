package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 纳管的OU的基本信息。
 */
public class CreateOrganizationUnit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_account_id")

    private String manageAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_unit_id")

    private String organizationUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_unit_name")

    private String organizationUnitName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_unit_status")

    private String organizationUnitStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_unit_type")

    private OrganizationalUnitType organizationUnitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organization_unit_id")

    private String parentOrganizationUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organization_unit_name")

    private String parentOrganizationUnitName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public CreateOrganizationUnit withManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
        return this;
    }

    /**
     * 管理账号ID。
     * @return manageAccountId
     */
    public String getManageAccountId() {
        return manageAccountId;
    }

    public void setManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
    }

    public CreateOrganizationUnit withOrganizationUnitId(String organizationUnitId) {
        this.organizationUnitId = organizationUnitId;
        return this;
    }

    /**
     * OU ID。
     * @return organizationUnitId
     */
    public String getOrganizationUnitId() {
        return organizationUnitId;
    }

    public void setOrganizationUnitId(String organizationUnitId) {
        this.organizationUnitId = organizationUnitId;
    }

    public CreateOrganizationUnit withOrganizationUnitName(String organizationUnitName) {
        this.organizationUnitName = organizationUnitName;
        return this;
    }

    /**
     * OU名称。
     * @return organizationUnitName
     */
    public String getOrganizationUnitName() {
        return organizationUnitName;
    }

    public void setOrganizationUnitName(String organizationUnitName) {
        this.organizationUnitName = organizationUnitName;
    }

    public CreateOrganizationUnit withOrganizationUnitStatus(String organizationUnitStatus) {
        this.organizationUnitStatus = organizationUnitStatus;
        return this;
    }

    /**
     * OU状态。
     * @return organizationUnitStatus
     */
    public String getOrganizationUnitStatus() {
        return organizationUnitStatus;
    }

    public void setOrganizationUnitStatus(String organizationUnitStatus) {
        this.organizationUnitStatus = organizationUnitStatus;
    }

    public CreateOrganizationUnit withOrganizationUnitType(OrganizationalUnitType organizationUnitType) {
        this.organizationUnitType = organizationUnitType;
        return this;
    }

    /**
     * Get organizationUnitType
     * @return organizationUnitType
     */
    public OrganizationalUnitType getOrganizationUnitType() {
        return organizationUnitType;
    }

    public void setOrganizationUnitType(OrganizationalUnitType organizationUnitType) {
        this.organizationUnitType = organizationUnitType;
    }

    public CreateOrganizationUnit withParentOrganizationUnitId(String parentOrganizationUnitId) {
        this.parentOrganizationUnitId = parentOrganizationUnitId;
        return this;
    }

    /**
     * 父OU ID。
     * @return parentOrganizationUnitId
     */
    public String getParentOrganizationUnitId() {
        return parentOrganizationUnitId;
    }

    public void setParentOrganizationUnitId(String parentOrganizationUnitId) {
        this.parentOrganizationUnitId = parentOrganizationUnitId;
    }

    public CreateOrganizationUnit withParentOrganizationUnitName(String parentOrganizationUnitName) {
        this.parentOrganizationUnitName = parentOrganizationUnitName;
        return this;
    }

    /**
     * 父OU名称。
     * @return parentOrganizationUnitName
     */
    public String getParentOrganizationUnitName() {
        return parentOrganizationUnitName;
    }

    public void setParentOrganizationUnitName(String parentOrganizationUnitName) {
        this.parentOrganizationUnitName = parentOrganizationUnitName;
    }

    public CreateOrganizationUnit withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 被创建的时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOrganizationUnit that = (CreateOrganizationUnit) obj;
        return Objects.equals(this.manageAccountId, that.manageAccountId)
            && Objects.equals(this.organizationUnitId, that.organizationUnitId)
            && Objects.equals(this.organizationUnitName, that.organizationUnitName)
            && Objects.equals(this.organizationUnitStatus, that.organizationUnitStatus)
            && Objects.equals(this.organizationUnitType, that.organizationUnitType)
            && Objects.equals(this.parentOrganizationUnitId, that.parentOrganizationUnitId)
            && Objects.equals(this.parentOrganizationUnitName, that.parentOrganizationUnitName)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manageAccountId,
            organizationUnitId,
            organizationUnitName,
            organizationUnitStatus,
            organizationUnitType,
            parentOrganizationUnitId,
            parentOrganizationUnitName,
            createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrganizationUnit {\n");
        sb.append("    manageAccountId: ").append(toIndentedString(manageAccountId)).append("\n");
        sb.append("    organizationUnitId: ").append(toIndentedString(organizationUnitId)).append("\n");
        sb.append("    organizationUnitName: ").append(toIndentedString(organizationUnitName)).append("\n");
        sb.append("    organizationUnitStatus: ").append(toIndentedString(organizationUnitStatus)).append("\n");
        sb.append("    organizationUnitType: ").append(toIndentedString(organizationUnitType)).append("\n");
        sb.append("    parentOrganizationUnitId: ").append(toIndentedString(parentOrganizationUnitId)).append("\n");
        sb.append("    parentOrganizationUnitName: ").append(toIndentedString(parentOrganizationUnitName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
