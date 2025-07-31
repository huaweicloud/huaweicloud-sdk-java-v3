package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重置密码所需要的信息
 */
public class ResetAccountPasswordRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_provider")

    private String resourceProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accounts_password_change_status")

    private List<String> accountsPasswordChangeStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources_id")

    private List<String> resourcesId = null;

    public ResetAccountPasswordRequestBody withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * 云服务厂商
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public ResetAccountPasswordRequestBody withResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
        return this;
    }

    /**
     * 云服务
     * @return resourceProvider
     */
    public String getResourceProvider() {
        return resourceProvider;
    }

    public void setResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    public ResetAccountPasswordRequestBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ResetAccountPasswordRequestBody withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 实例类型
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public ResetAccountPasswordRequestBody withAccountsPasswordChangeStatus(List<String> accountsPasswordChangeStatus) {
        this.accountsPasswordChangeStatus = accountsPasswordChangeStatus;
        return this;
    }

    public ResetAccountPasswordRequestBody addAccountsPasswordChangeStatusItem(
        String accountsPasswordChangeStatusItem) {
        if (this.accountsPasswordChangeStatus == null) {
            this.accountsPasswordChangeStatus = new ArrayList<>();
        }
        this.accountsPasswordChangeStatus.add(accountsPasswordChangeStatusItem);
        return this;
    }

    public ResetAccountPasswordRequestBody withAccountsPasswordChangeStatus(
        Consumer<List<String>> accountsPasswordChangeStatusSetter) {
        if (this.accountsPasswordChangeStatus == null) {
            this.accountsPasswordChangeStatus = new ArrayList<>();
        }
        accountsPasswordChangeStatusSetter.accept(this.accountsPasswordChangeStatus);
        return this;
    }

    /**
     * 需要改密的账号的状态，枚举值  TO_BE_CHANGED：待改密 FAILED：改密失败 SUCCESSFUL：改密成功 PROCESSING：改密中  不传默认修改所有状态的账号
     * @return accountsPasswordChangeStatus
     */
    public List<String> getAccountsPasswordChangeStatus() {
        return accountsPasswordChangeStatus;
    }

    public void setAccountsPasswordChangeStatus(List<String> accountsPasswordChangeStatus) {
        this.accountsPasswordChangeStatus = accountsPasswordChangeStatus;
    }

    public ResetAccountPasswordRequestBody withResourcesId(List<String> resourcesId) {
        this.resourcesId = resourcesId;
        return this;
    }

    public ResetAccountPasswordRequestBody addResourcesIdItem(String resourcesIdItem) {
        if (this.resourcesId == null) {
            this.resourcesId = new ArrayList<>();
        }
        this.resourcesId.add(resourcesIdItem);
        return this;
    }

    public ResetAccountPasswordRequestBody withResourcesId(Consumer<List<String>> resourcesIdSetter) {
        if (this.resourcesId == null) {
            this.resourcesId = new ArrayList<>();
        }
        resourcesIdSetter.accept(this.resourcesId);
        return this;
    }

    /**
     * 实例id列表
     * @return resourcesId
     */
    public List<String> getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(List<String> resourcesId) {
        this.resourcesId = resourcesId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetAccountPasswordRequestBody that = (ResetAccountPasswordRequestBody) obj;
        return Objects.equals(this.vendor, that.vendor) && Objects.equals(this.resourceProvider, that.resourceProvider)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.accountsPasswordChangeStatus, that.accountsPasswordChangeStatus)
            && Objects.equals(this.resourcesId, that.resourcesId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(vendor, resourceProvider, resourceType, instanceType, accountsPasswordChangeStatus, resourcesId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetAccountPasswordRequestBody {\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    resourceProvider: ").append(toIndentedString(resourceProvider)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    accountsPasswordChangeStatus: ")
            .append(toIndentedString(accountsPasswordChangeStatus))
            .append("\n");
        sb.append("    resourcesId: ").append(toIndentedString(resourcesId)).append("\n");
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
