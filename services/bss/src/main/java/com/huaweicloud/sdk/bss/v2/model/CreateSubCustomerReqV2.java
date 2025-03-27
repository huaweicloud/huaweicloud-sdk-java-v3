package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSubCustomerReqV2
 */
public class CreateSubCustomerReqV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "party_id")

    private String partyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customer_association_type")

    private Integer subCustomerAssociationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_ids")

    private List<String> permissionIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_sub_customer")

    private NewCustomerV2 newSubCustomer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "financial_custody")

    private Integer financialCustody;

    public CreateSubCustomerReqV2 withPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }

    /**
     * 企业子账号挂载的组织单元。 组织单元的Party ID，通过查询企业组织结构接口的响应获得。
     * @return partyId
     */
    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public CreateSubCustomerReqV2 withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 企业子账号的显示名称，不限制特殊字符。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateSubCustomerReqV2 withSubCustomerAssociationType(Integer subCustomerAssociationType) {
        this.subCustomerAssociationType = subCustomerAssociationType;
        return this;
    }

    /**
     * 子账号关联类型：1：同一法人。 关联类型目前只能是同一法人。
     * minimum: -1
     * maximum: 1
     * @return subCustomerAssociationType
     */
    public Integer getSubCustomerAssociationType() {
        return subCustomerAssociationType;
    }

    public void setSubCustomerAssociationType(Integer subCustomerAssociationType) {
        this.subCustomerAssociationType = subCustomerAssociationType;
    }

    public CreateSubCustomerReqV2 withPermissionIds(List<String> permissionIds) {
        this.permissionIds = permissionIds;
        return this;
    }

    public CreateSubCustomerReqV2 addPermissionIdsItem(String permissionIdsItem) {
        if (this.permissionIds == null) {
            this.permissionIds = new ArrayList<>();
        }
        this.permissionIds.add(permissionIdsItem);
        return this;
    }

    public CreateSubCustomerReqV2 withPermissionIds(Consumer<List<String>> permissionIdsSetter) {
        if (this.permissionIds == null) {
            this.permissionIds = new ArrayList<>();
        }
        permissionIdsSetter.accept(this.permissionIds);
        return this;
    }

    /**
     * 申请的权限列表。 支持的权限项请参见下表。当financial_custody为1时，此参数不生效，默认指定权限项：READ_FINANCE_INFO、READ_CONSUME_BILL、SHARE-BIZ-DISCOUNT-TO-SUB。
     * @return permissionIds
     */
    public List<String> getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(List<String> permissionIds) {
        this.permissionIds = permissionIds;
    }

    public CreateSubCustomerReqV2 withNewSubCustomer(NewCustomerV2 newSubCustomer) {
        this.newSubCustomer = newSubCustomer;
        return this;
    }

    public CreateSubCustomerReqV2 withNewSubCustomer(Consumer<NewCustomerV2> newSubCustomerSetter) {
        if (this.newSubCustomer == null) {
            this.newSubCustomer = new NewCustomerV2();
            newSubCustomerSetter.accept(this.newSubCustomer);
        }

        return this;
    }

    /**
     * Get newSubCustomer
     * @return newSubCustomer
     */
    public NewCustomerV2 getNewSubCustomer() {
        return newSubCustomer;
    }

    public void setNewSubCustomer(NewCustomerV2 newSubCustomer) {
        this.newSubCustomer = newSubCustomer;
    }

    public CreateSubCustomerReqV2 withFinancialCustody(Integer financialCustody) {
        this.financialCustody = financialCustody;
        return this;
    }

    /**
     * 是否开通财务托管，0：不开通；1：开通。默认值0，默认不开通。
     * minimum: 0
     * maximum: 1
     * @return financialCustody
     */
    public Integer getFinancialCustody() {
        return financialCustody;
    }

    public void setFinancialCustody(Integer financialCustody) {
        this.financialCustody = financialCustody;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubCustomerReqV2 that = (CreateSubCustomerReqV2) obj;
        return Objects.equals(this.partyId, that.partyId) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.subCustomerAssociationType, that.subCustomerAssociationType)
            && Objects.equals(this.permissionIds, that.permissionIds)
            && Objects.equals(this.newSubCustomer, that.newSubCustomer)
            && Objects.equals(this.financialCustody, that.financialCustody);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(partyId, displayName, subCustomerAssociationType, permissionIds, newSubCustomer, financialCustody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubCustomerReqV2 {\n");
        sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    subCustomerAssociationType: ").append(toIndentedString(subCustomerAssociationType)).append("\n");
        sb.append("    permissionIds: ").append(toIndentedString(permissionIds)).append("\n");
        sb.append("    newSubCustomer: ").append(toIndentedString(newSubCustomer)).append("\n");
        sb.append("    financialCustody: ").append(toIndentedString(financialCustody)).append("\n");
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
