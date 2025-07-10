package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 注册OU的基本信息。
 */
public class CreateOrganizationalUnit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_account_id")

    private String manageAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit_id")

    private String organizationalUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit_name")

    private String organizationalUnitName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit_status")

    private String organizationalUnitStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit_type")

    private OrganizationalUnitType organizationalUnitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organizational_unit_id")

    private String parentOrganizationalUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organizational_unit_name")

    private String parentOrganizationalUnitName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "landing_zone_version")

    private String landingZoneVersion;

    public CreateOrganizationalUnit withManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
        return this;
    }

    /**
     * 管理纳管账号ID。
     * @return manageAccountId
     */
    public String getManageAccountId() {
        return manageAccountId;
    }

    public void setManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
    }

    public CreateOrganizationalUnit withOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }

    /**
     * 注册OU ID。
     * @return organizationalUnitId
     */
    public String getOrganizationalUnitId() {
        return organizationalUnitId;
    }

    public void setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
    }

    public CreateOrganizationalUnit withOrganizationalUnitName(String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
        return this;
    }

    /**
     * 注册OU名称。
     * @return organizationalUnitName
     */
    public String getOrganizationalUnitName() {
        return organizationalUnitName;
    }

    public void setOrganizationalUnitName(String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
    }

    public CreateOrganizationalUnit withOrganizationalUnitStatus(String organizationalUnitStatus) {
        this.organizationalUnitStatus = organizationalUnitStatus;
        return this;
    }

    /**
     * 注册OU状态。
     * @return organizationalUnitStatus
     */
    public String getOrganizationalUnitStatus() {
        return organizationalUnitStatus;
    }

    public void setOrganizationalUnitStatus(String organizationalUnitStatus) {
        this.organizationalUnitStatus = organizationalUnitStatus;
    }

    public CreateOrganizationalUnit withOrganizationalUnitType(OrganizationalUnitType organizationalUnitType) {
        this.organizationalUnitType = organizationalUnitType;
        return this;
    }

    /**
     * Get organizationalUnitType
     * @return organizationalUnitType
     */
    public OrganizationalUnitType getOrganizationalUnitType() {
        return organizationalUnitType;
    }

    public void setOrganizationalUnitType(OrganizationalUnitType organizationalUnitType) {
        this.organizationalUnitType = organizationalUnitType;
    }

    public CreateOrganizationalUnit withParentOrganizationalUnitId(String parentOrganizationalUnitId) {
        this.parentOrganizationalUnitId = parentOrganizationalUnitId;
        return this;
    }

    /**
     * 父注册OU ID。
     * @return parentOrganizationalUnitId
     */
    public String getParentOrganizationalUnitId() {
        return parentOrganizationalUnitId;
    }

    public void setParentOrganizationalUnitId(String parentOrganizationalUnitId) {
        this.parentOrganizationalUnitId = parentOrganizationalUnitId;
    }

    public CreateOrganizationalUnit withParentOrganizationalUnitName(String parentOrganizationalUnitName) {
        this.parentOrganizationalUnitName = parentOrganizationalUnitName;
        return this;
    }

    /**
     * 父注册OU名称。
     * @return parentOrganizationalUnitName
     */
    public String getParentOrganizationalUnitName() {
        return parentOrganizationalUnitName;
    }

    public void setParentOrganizationalUnitName(String parentOrganizationalUnitName) {
        this.parentOrganizationalUnitName = parentOrganizationalUnitName;
    }

    public CreateOrganizationalUnit withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 组织里某个注册OU下的纳管账号被创建的时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CreateOrganizationalUnit withLandingZoneVersion(String landingZoneVersion) {
        this.landingZoneVersion = landingZoneVersion;
        return this;
    }

    /**
     * Landing Zone版本。
     * @return landingZoneVersion
     */
    public String getLandingZoneVersion() {
        return landingZoneVersion;
    }

    public void setLandingZoneVersion(String landingZoneVersion) {
        this.landingZoneVersion = landingZoneVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOrganizationalUnit that = (CreateOrganizationalUnit) obj;
        return Objects.equals(this.manageAccountId, that.manageAccountId)
            && Objects.equals(this.organizationalUnitId, that.organizationalUnitId)
            && Objects.equals(this.organizationalUnitName, that.organizationalUnitName)
            && Objects.equals(this.organizationalUnitStatus, that.organizationalUnitStatus)
            && Objects.equals(this.organizationalUnitType, that.organizationalUnitType)
            && Objects.equals(this.parentOrganizationalUnitId, that.parentOrganizationalUnitId)
            && Objects.equals(this.parentOrganizationalUnitName, that.parentOrganizationalUnitName)
            && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.landingZoneVersion, that.landingZoneVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manageAccountId,
            organizationalUnitId,
            organizationalUnitName,
            organizationalUnitStatus,
            organizationalUnitType,
            parentOrganizationalUnitId,
            parentOrganizationalUnitName,
            createdAt,
            landingZoneVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrganizationalUnit {\n");
        sb.append("    manageAccountId: ").append(toIndentedString(manageAccountId)).append("\n");
        sb.append("    organizationalUnitId: ").append(toIndentedString(organizationalUnitId)).append("\n");
        sb.append("    organizationalUnitName: ").append(toIndentedString(organizationalUnitName)).append("\n");
        sb.append("    organizationalUnitStatus: ").append(toIndentedString(organizationalUnitStatus)).append("\n");
        sb.append("    organizationalUnitType: ").append(toIndentedString(organizationalUnitType)).append("\n");
        sb.append("    parentOrganizationalUnitId: ").append(toIndentedString(parentOrganizationalUnitId)).append("\n");
        sb.append("    parentOrganizationalUnitName: ")
            .append(toIndentedString(parentOrganizationalUnitName))
            .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    landingZoneVersion: ").append(toIndentedString(landingZoneVersion)).append("\n");
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
