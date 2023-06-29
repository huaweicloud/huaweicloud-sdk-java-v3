package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作保护策略。
 */
public class ShowDomainProtectPolicyResponseBodyProtectPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_user")

    private AllowUserBody allowUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_protection")

    private Boolean operationProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile")

    private String mobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_check")

    private String adminCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    public ShowDomainProtectPolicyResponseBodyProtectPolicy withAllowUser(AllowUserBody allowUser) {
        this.allowUser = allowUser;
        return this;
    }

    public ShowDomainProtectPolicyResponseBodyProtectPolicy withAllowUser(Consumer<AllowUserBody> allowUserSetter) {
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

    public ShowDomainProtectPolicyResponseBodyProtectPolicy withOperationProtection(Boolean operationProtection) {
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

    public ShowDomainProtectPolicyResponseBodyProtectPolicy withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * 操作保护验证指定手机号码。示例：0086-123456789。
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public ShowDomainProtectPolicyResponseBodyProtectPolicy withAdminCheck(String adminCheck) {
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

    public ShowDomainProtectPolicyResponseBodyProtectPolicy withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 操作保护验证指定邮件地址。示例：example@email.com。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShowDomainProtectPolicyResponseBodyProtectPolicy withScene(String scene) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainProtectPolicyResponseBodyProtectPolicy that = (ShowDomainProtectPolicyResponseBodyProtectPolicy) obj;
        return Objects.equals(this.allowUser, that.allowUser)
            && Objects.equals(this.operationProtection, that.operationProtection)
            && Objects.equals(this.mobile, that.mobile) && Objects.equals(this.adminCheck, that.adminCheck)
            && Objects.equals(this.email, that.email) && Objects.equals(this.scene, that.scene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowUser, operationProtection, mobile, adminCheck, email, scene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainProtectPolicyResponseBodyProtectPolicy {\n");
        sb.append("    allowUser: ").append(toIndentedString(allowUser)).append("\n");
        sb.append("    operationProtection: ").append(toIndentedString(operationProtection)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    adminCheck: ").append(toIndentedString(adminCheck)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
