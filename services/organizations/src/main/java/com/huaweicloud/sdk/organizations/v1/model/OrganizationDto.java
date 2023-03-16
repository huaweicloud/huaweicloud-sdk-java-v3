package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 包含有关组织的详细信息。组织是帐号集合，使用合并计费集中管理，由组织单元构成的层次结构，并通过策略控制。
 */
public class OrganizationDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_account_id")

    private String managementAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "management_account_name")

    private String managementAccountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public OrganizationDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 组织的唯一标识符（ID）。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrganizationDto withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 组织的统一资源名称。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public OrganizationDto withManagementAccountId(String managementAccountId) {
        this.managementAccountId = managementAccountId;
        return this;
    }

    /**
     * 组织管理帐号的唯一标识符（ID）。
     * @return managementAccountId
     */
    public String getManagementAccountId() {
        return managementAccountId;
    }

    public void setManagementAccountId(String managementAccountId) {
        this.managementAccountId = managementAccountId;
    }

    public OrganizationDto withManagementAccountName(String managementAccountName) {
        this.managementAccountName = managementAccountName;
        return this;
    }

    /**
     * 组织的管理帐号的名称。
     * @return managementAccountName
     */
    public String getManagementAccountName() {
        return managementAccountName;
    }

    public void setManagementAccountName(String managementAccountName) {
        this.managementAccountName = managementAccountName;
    }

    public OrganizationDto withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 组织的创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganizationDto organizationDto = (OrganizationDto) o;
        return Objects.equals(this.id, organizationDto.id) && Objects.equals(this.urn, organizationDto.urn)
            && Objects.equals(this.managementAccountId, organizationDto.managementAccountId)
            && Objects.equals(this.managementAccountName, organizationDto.managementAccountName)
            && Objects.equals(this.createdAt, organizationDto.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, urn, managementAccountId, managementAccountName, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    managementAccountId: ").append(toIndentedString(managementAccountId)).append("\n");
        sb.append("    managementAccountName: ").append(toIndentedString(managementAccountName)).append("\n");
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
