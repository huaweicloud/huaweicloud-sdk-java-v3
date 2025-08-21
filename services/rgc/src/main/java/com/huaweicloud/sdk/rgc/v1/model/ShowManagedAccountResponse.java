package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowManagedAccountResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "landing_zone_version")

    private String landingZoneVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_account_id")

    private String manageAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_type")

    private String accountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organizational_unit_id")

    private String parentOrganizationalUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organizational_unit_name")

    private String parentOrganizationalUnitName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_user_name")

    private String identityStoreUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_id")

    private String blueprintProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_version")

    private String blueprintProductVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_status")

    private String blueprintStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_blueprint_has_multi_account_resource")

    private Boolean isBlueprintHasMultiAccountResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<RegionManagedList> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public ShowManagedAccountResponse withLandingZoneVersion(String landingZoneVersion) {
        this.landingZoneVersion = landingZoneVersion;
        return this;
    }

    /**
     * 纳管账号的Landing Zone版本。
     * @return landingZoneVersion
     */
    public String getLandingZoneVersion() {
        return landingZoneVersion;
    }

    public void setLandingZoneVersion(String landingZoneVersion) {
        this.landingZoneVersion = landingZoneVersion;
    }

    public ShowManagedAccountResponse withManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
        return this;
    }

    /**
     * 管理员账号ID。
     * @return manageAccountId
     */
    public String getManageAccountId() {
        return manageAccountId;
    }

    public void setManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
    }

    public ShowManagedAccountResponse withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 纳管账号ID。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public ShowManagedAccountResponse withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 纳管账号名称。
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public ShowManagedAccountResponse withAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * 纳管账号类型。
     * @return accountType
     */
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public ShowManagedAccountResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 纳管账号的创建来源，包括CUSTOM和RGC。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ShowManagedAccountResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 纳管账号状态。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowManagedAccountResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 错误状态描述信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowManagedAccountResponse withParentOrganizationalUnitId(String parentOrganizationalUnitId) {
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

    public ShowManagedAccountResponse withParentOrganizationalUnitName(String parentOrganizationalUnitName) {
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

    public ShowManagedAccountResponse withIdentityStoreUserName(String identityStoreUserName) {
        this.identityStoreUserName = identityStoreUserName;
        return this;
    }

    /**
     * Identity Center用户名。
     * @return identityStoreUserName
     */
    public String getIdentityStoreUserName() {
        return identityStoreUserName;
    }

    public void setIdentityStoreUserName(String identityStoreUserName) {
        this.identityStoreUserName = identityStoreUserName;
    }

    public ShowManagedAccountResponse withBlueprintProductId(String blueprintProductId) {
        this.blueprintProductId = blueprintProductId;
        return this;
    }

    /**
     * 模板ID。
     * @return blueprintProductId
     */
    public String getBlueprintProductId() {
        return blueprintProductId;
    }

    public void setBlueprintProductId(String blueprintProductId) {
        this.blueprintProductId = blueprintProductId;
    }

    public ShowManagedAccountResponse withBlueprintProductVersion(String blueprintProductVersion) {
        this.blueprintProductVersion = blueprintProductVersion;
        return this;
    }

    /**
     * 模板版本。
     * @return blueprintProductVersion
     */
    public String getBlueprintProductVersion() {
        return blueprintProductVersion;
    }

    public void setBlueprintProductVersion(String blueprintProductVersion) {
        this.blueprintProductVersion = blueprintProductVersion;
    }

    public ShowManagedAccountResponse withBlueprintStatus(String blueprintStatus) {
        this.blueprintStatus = blueprintStatus;
        return this;
    }

    /**
     * 模板部署状态，包括失败, 完成, 进行中。
     * @return blueprintStatus
     */
    public String getBlueprintStatus() {
        return blueprintStatus;
    }

    public void setBlueprintStatus(String blueprintStatus) {
        this.blueprintStatus = blueprintStatus;
    }

    public ShowManagedAccountResponse withIsBlueprintHasMultiAccountResource(
        Boolean isBlueprintHasMultiAccountResource) {
        this.isBlueprintHasMultiAccountResource = isBlueprintHasMultiAccountResource;
        return this;
    }

    /**
     * 模板是否包含多账号资源。
     * @return isBlueprintHasMultiAccountResource
     */
    public Boolean getIsBlueprintHasMultiAccountResource() {
        return isBlueprintHasMultiAccountResource;
    }

    public void setIsBlueprintHasMultiAccountResource(Boolean isBlueprintHasMultiAccountResource) {
        this.isBlueprintHasMultiAccountResource = isBlueprintHasMultiAccountResource;
    }

    public ShowManagedAccountResponse withRegions(List<RegionManagedList> regions) {
        this.regions = regions;
        return this;
    }

    public ShowManagedAccountResponse addRegionsItem(RegionManagedList regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ShowManagedAccountResponse withRegions(Consumer<List<RegionManagedList>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 区域信息。
     * @return regions
     */
    public List<RegionManagedList> getRegions() {
        return regions;
    }

    public void setRegions(List<RegionManagedList> regions) {
        this.regions = regions;
    }

    public ShowManagedAccountResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 纳管账号的创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ShowManagedAccountResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 纳管账号的更新时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
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
        ShowManagedAccountResponse that = (ShowManagedAccountResponse) obj;
        return Objects.equals(this.landingZoneVersion, that.landingZoneVersion)
            && Objects.equals(this.manageAccountId, that.manageAccountId)
            && Objects.equals(this.accountId, that.accountId) && Objects.equals(this.accountName, that.accountName)
            && Objects.equals(this.accountType, that.accountType) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.state, that.state) && Objects.equals(this.message, that.message)
            && Objects.equals(this.parentOrganizationalUnitId, that.parentOrganizationalUnitId)
            && Objects.equals(this.parentOrganizationalUnitName, that.parentOrganizationalUnitName)
            && Objects.equals(this.identityStoreUserName, that.identityStoreUserName)
            && Objects.equals(this.blueprintProductId, that.blueprintProductId)
            && Objects.equals(this.blueprintProductVersion, that.blueprintProductVersion)
            && Objects.equals(this.blueprintStatus, that.blueprintStatus)
            && Objects.equals(this.isBlueprintHasMultiAccountResource, that.isBlueprintHasMultiAccountResource)
            && Objects.equals(this.regions, that.regions) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(landingZoneVersion,
            manageAccountId,
            accountId,
            accountName,
            accountType,
            owner,
            state,
            message,
            parentOrganizationalUnitId,
            parentOrganizationalUnitName,
            identityStoreUserName,
            blueprintProductId,
            blueprintProductVersion,
            blueprintStatus,
            isBlueprintHasMultiAccountResource,
            regions,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowManagedAccountResponse {\n");
        sb.append("    landingZoneVersion: ").append(toIndentedString(landingZoneVersion)).append("\n");
        sb.append("    manageAccountId: ").append(toIndentedString(manageAccountId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    parentOrganizationalUnitId: ").append(toIndentedString(parentOrganizationalUnitId)).append("\n");
        sb.append("    parentOrganizationalUnitName: ")
            .append(toIndentedString(parentOrganizationalUnitName))
            .append("\n");
        sb.append("    identityStoreUserName: ").append(toIndentedString(identityStoreUserName)).append("\n");
        sb.append("    blueprintProductId: ").append(toIndentedString(blueprintProductId)).append("\n");
        sb.append("    blueprintProductVersion: ").append(toIndentedString(blueprintProductVersion)).append("\n");
        sb.append("    blueprintStatus: ").append(toIndentedString(blueprintStatus)).append("\n");
        sb.append("    isBlueprintHasMultiAccountResource: ")
            .append(toIndentedString(isBlueprintHasMultiAccountResource))
            .append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
