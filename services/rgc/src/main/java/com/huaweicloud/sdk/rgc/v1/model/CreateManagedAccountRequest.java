package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建账号的基本信息。
 */
public class CreateManagedAccountRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_email")

    private String accountEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_user_name")

    private String identityStoreUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_email")

    private String identityStoreEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organization_unit_id")

    private String parentOrganizationUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organization_unit_name")

    private String parentOrganizationUnitName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint")

    private Blueprint blueprint;

    public CreateManagedAccountRequest withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 账号名。
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public CreateManagedAccountRequest withAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
        return this;
    }

    /**
     * 账号邮箱。
     * @return accountEmail
     */
    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public CreateManagedAccountRequest withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 手机号码。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CreateManagedAccountRequest withIdentityStoreUserName(String identityStoreUserName) {
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

    public CreateManagedAccountRequest withIdentityStoreEmail(String identityStoreEmail) {
        this.identityStoreEmail = identityStoreEmail;
        return this;
    }

    /**
     * Identity Center邮箱。
     * @return identityStoreEmail
     */
    public String getIdentityStoreEmail() {
        return identityStoreEmail;
    }

    public void setIdentityStoreEmail(String identityStoreEmail) {
        this.identityStoreEmail = identityStoreEmail;
    }

    public CreateManagedAccountRequest withParentOrganizationUnitId(String parentOrganizationUnitId) {
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

    public CreateManagedAccountRequest withParentOrganizationUnitName(String parentOrganizationUnitName) {
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

    public CreateManagedAccountRequest withBlueprint(Blueprint blueprint) {
        this.blueprint = blueprint;
        return this;
    }

    public CreateManagedAccountRequest withBlueprint(Consumer<Blueprint> blueprintSetter) {
        if (this.blueprint == null) {
            this.blueprint = new Blueprint();
            blueprintSetter.accept(this.blueprint);
        }

        return this;
    }

    /**
     * Get blueprint
     * @return blueprint
     */
    public Blueprint getBlueprint() {
        return blueprint;
    }

    public void setBlueprint(Blueprint blueprint) {
        this.blueprint = blueprint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateManagedAccountRequest that = (CreateManagedAccountRequest) obj;
        return Objects.equals(this.accountName, that.accountName)
            && Objects.equals(this.accountEmail, that.accountEmail) && Objects.equals(this.phone, that.phone)
            && Objects.equals(this.identityStoreUserName, that.identityStoreUserName)
            && Objects.equals(this.identityStoreEmail, that.identityStoreEmail)
            && Objects.equals(this.parentOrganizationUnitId, that.parentOrganizationUnitId)
            && Objects.equals(this.parentOrganizationUnitName, that.parentOrganizationUnitName)
            && Objects.equals(this.blueprint, that.blueprint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName,
            accountEmail,
            phone,
            identityStoreUserName,
            identityStoreEmail,
            parentOrganizationUnitId,
            parentOrganizationUnitName,
            blueprint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateManagedAccountRequest {\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    accountEmail: ").append(toIndentedString(accountEmail)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    identityStoreUserName: ").append(toIndentedString(identityStoreUserName)).append("\n");
        sb.append("    identityStoreEmail: ").append(toIndentedString(identityStoreEmail)).append("\n");
        sb.append("    parentOrganizationUnitId: ").append(toIndentedString(parentOrganizationUnitId)).append("\n");
        sb.append("    parentOrganizationUnitName: ").append(toIndentedString(parentOrganizationUnitName)).append("\n");
        sb.append("    blueprint: ").append(toIndentedString(blueprint)).append("\n");
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
