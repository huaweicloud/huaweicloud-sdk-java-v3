package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateDomainProtectPolicyResponseBodyProtectPolicy
 */
public class UpdateDomainProtectPolicyResponseBodyProtectPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_user")

    private AllowUserBody allowUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_protection")

    private Boolean operationProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_check")

    private String adminCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    public UpdateDomainProtectPolicyResponseBodyProtectPolicy withAllowUser(AllowUserBody allowUser) {
        this.allowUser = allowUser;
        return this;
    }

    public UpdateDomainProtectPolicyResponseBodyProtectPolicy withAllowUser(Consumer<AllowUserBody> allowUserSetter) {
        if (this.allowUser == null) {
            this.allowUser = new AllowUserBody();
            allowUserSetter.accept(this.allowUser);
        }

        return this;
    }

    /**
     * Get allowUser
     * @return allowUser
     */
    public AllowUserBody getAllowUser() {
        return allowUser;
    }

    public void setAllowUser(AllowUserBody allowUser) {
        this.allowUser = allowUser;
    }

    public UpdateDomainProtectPolicyResponseBodyProtectPolicy withOperationProtection(Boolean operationProtection) {
        this.operationProtection = operationProtection;
        return this;
    }

    /**
     * 是否开启操作保护，取值范围true或false。
     * @return operationProtection
     */
    public Boolean getOperationProtection() {
        return operationProtection;
    }

    public void setOperationProtection(Boolean operationProtection) {
        this.operationProtection = operationProtection;
    }

    public UpdateDomainProtectPolicyResponseBodyProtectPolicy withAdminCheck(String adminCheck) {
        this.adminCheck = adminCheck;
        return this;
    }

    /**
     * 是否指定人员验证。on为指定人员验证，必须填写scene参数。off为操作员验证。
     * @return adminCheck
     */
    public String getAdminCheck() {
        return adminCheck;
    }

    public void setAdminCheck(String adminCheck) {
        this.adminCheck = adminCheck;
    }

    public UpdateDomainProtectPolicyResponseBodyProtectPolicy withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 操作保护指定人员验证方式，admin_check为on时，必须填写。包括mobile、email。
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainProtectPolicyResponseBodyProtectPolicy updateDomainProtectPolicyResponseBodyProtectPolicy =
            (UpdateDomainProtectPolicyResponseBodyProtectPolicy) o;
        return Objects.equals(this.allowUser, updateDomainProtectPolicyResponseBodyProtectPolicy.allowUser)
            && Objects.equals(this.operationProtection,
                updateDomainProtectPolicyResponseBodyProtectPolicy.operationProtection)
            && Objects.equals(this.adminCheck, updateDomainProtectPolicyResponseBodyProtectPolicy.adminCheck)
            && Objects.equals(this.scene, updateDomainProtectPolicyResponseBodyProtectPolicy.scene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowUser, operationProtection, adminCheck, scene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainProtectPolicyResponseBodyProtectPolicy {\n");
        sb.append("    allowUser: ").append(toIndentedString(allowUser)).append("\n");
        sb.append("    operationProtection: ").append(toIndentedString(operationProtection)).append("\n");
        sb.append("    adminCheck: ").append(toIndentedString(adminCheck)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
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
