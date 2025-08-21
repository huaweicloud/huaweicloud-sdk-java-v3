package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowManagedAccountTemplateResponse extends SdkResponse {

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
    @JsonProperty(value = "blueprint_product_id")

    private String blueprintProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_name")

    private String blueprintProductName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_version")

    private String blueprintProductVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_status")

    private String blueprintStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_impl_type")

    private String blueprintProductImplType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_impl_detail")

    private String blueprintProductImplDetail;

    public ShowManagedAccountTemplateResponse withManageAccountId(String manageAccountId) {
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

    public ShowManagedAccountTemplateResponse withAccountId(String accountId) {
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

    public ShowManagedAccountTemplateResponse withAccountName(String accountName) {
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

    public ShowManagedAccountTemplateResponse withBlueprintProductId(String blueprintProductId) {
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

    public ShowManagedAccountTemplateResponse withBlueprintProductName(String blueprintProductName) {
        this.blueprintProductName = blueprintProductName;
        return this;
    }

    /**
     * 模板名称。
     * @return blueprintProductName
     */
    public String getBlueprintProductName() {
        return blueprintProductName;
    }

    public void setBlueprintProductName(String blueprintProductName) {
        this.blueprintProductName = blueprintProductName;
    }

    public ShowManagedAccountTemplateResponse withBlueprintProductVersion(String blueprintProductVersion) {
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

    public ShowManagedAccountTemplateResponse withBlueprintStatus(String blueprintStatus) {
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

    public ShowManagedAccountTemplateResponse withBlueprintProductImplType(String blueprintProductImplType) {
        this.blueprintProductImplType = blueprintProductImplType;
        return this;
    }

    /**
     * 模板实现类型。
     * @return blueprintProductImplType
     */
    public String getBlueprintProductImplType() {
        return blueprintProductImplType;
    }

    public void setBlueprintProductImplType(String blueprintProductImplType) {
        this.blueprintProductImplType = blueprintProductImplType;
    }

    public ShowManagedAccountTemplateResponse withBlueprintProductImplDetail(String blueprintProductImplDetail) {
        this.blueprintProductImplDetail = blueprintProductImplDetail;
        return this;
    }

    /**
     * 模板详情
     * @return blueprintProductImplDetail
     */
    public String getBlueprintProductImplDetail() {
        return blueprintProductImplDetail;
    }

    public void setBlueprintProductImplDetail(String blueprintProductImplDetail) {
        this.blueprintProductImplDetail = blueprintProductImplDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowManagedAccountTemplateResponse that = (ShowManagedAccountTemplateResponse) obj;
        return Objects.equals(this.manageAccountId, that.manageAccountId)
            && Objects.equals(this.accountId, that.accountId) && Objects.equals(this.accountName, that.accountName)
            && Objects.equals(this.blueprintProductId, that.blueprintProductId)
            && Objects.equals(this.blueprintProductName, that.blueprintProductName)
            && Objects.equals(this.blueprintProductVersion, that.blueprintProductVersion)
            && Objects.equals(this.blueprintStatus, that.blueprintStatus)
            && Objects.equals(this.blueprintProductImplType, that.blueprintProductImplType)
            && Objects.equals(this.blueprintProductImplDetail, that.blueprintProductImplDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manageAccountId,
            accountId,
            accountName,
            blueprintProductId,
            blueprintProductName,
            blueprintProductVersion,
            blueprintStatus,
            blueprintProductImplType,
            blueprintProductImplDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowManagedAccountTemplateResponse {\n");
        sb.append("    manageAccountId: ").append(toIndentedString(manageAccountId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    blueprintProductId: ").append(toIndentedString(blueprintProductId)).append("\n");
        sb.append("    blueprintProductName: ").append(toIndentedString(blueprintProductName)).append("\n");
        sb.append("    blueprintProductVersion: ").append(toIndentedString(blueprintProductVersion)).append("\n");
        sb.append("    blueprintStatus: ").append(toIndentedString(blueprintStatus)).append("\n");
        sb.append("    blueprintProductImplType: ").append(toIndentedString(blueprintProductImplType)).append("\n");
        sb.append("    blueprintProductImplDetail: ").append(toIndentedString(blueprintProductImplDetail)).append("\n");
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
