package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 回写改密结果所需要的信息
 */
public class UpdateAccountPasswordRequestBody {

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
    @JsonProperty(value = "password_change_result")

    private List<UpdateAccountPassword> passwordChangeResult = null;

    public UpdateAccountPasswordRequestBody withVendor(String vendor) {
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

    public UpdateAccountPasswordRequestBody withResourceProvider(String resourceProvider) {
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

    public UpdateAccountPasswordRequestBody withResourceType(String resourceType) {
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

    public UpdateAccountPasswordRequestBody withInstanceType(String instanceType) {
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

    public UpdateAccountPasswordRequestBody withPasswordChangeResult(List<UpdateAccountPassword> passwordChangeResult) {
        this.passwordChangeResult = passwordChangeResult;
        return this;
    }

    public UpdateAccountPasswordRequestBody addPasswordChangeResultItem(
        UpdateAccountPassword passwordChangeResultItem) {
        if (this.passwordChangeResult == null) {
            this.passwordChangeResult = new ArrayList<>();
        }
        this.passwordChangeResult.add(passwordChangeResultItem);
        return this;
    }

    public UpdateAccountPasswordRequestBody withPasswordChangeResult(
        Consumer<List<UpdateAccountPassword>> passwordChangeResultSetter) {
        if (this.passwordChangeResult == null) {
            this.passwordChangeResult = new ArrayList<>();
        }
        passwordChangeResultSetter.accept(this.passwordChangeResult);
        return this;
    }

    /**
     * 改密结果
     * @return passwordChangeResult
     */
    public List<UpdateAccountPassword> getPasswordChangeResult() {
        return passwordChangeResult;
    }

    public void setPasswordChangeResult(List<UpdateAccountPassword> passwordChangeResult) {
        this.passwordChangeResult = passwordChangeResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAccountPasswordRequestBody that = (UpdateAccountPasswordRequestBody) obj;
        return Objects.equals(this.vendor, that.vendor) && Objects.equals(this.resourceProvider, that.resourceProvider)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.passwordChangeResult, that.passwordChangeResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendor, resourceProvider, resourceType, instanceType, passwordChangeResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccountPasswordRequestBody {\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    resourceProvider: ").append(toIndentedString(resourceProvider)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    passwordChangeResult: ").append(toIndentedString(passwordChangeResult)).append("\n");
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
