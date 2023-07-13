package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class CreateUserResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    private String accessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_status")

    private Boolean pwdStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xuser_id")

    private String xuserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xuser_type")

    private String xuserType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_domain_owner")

    private Boolean isDomainOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "areacode")

    private String areacode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xdomain_id")

    private String xdomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xdomain_type")

    private String xdomainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_expires_at")

    private String passwordExpiresAt;

    public CreateUserResult withAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * IAM用户访问方式。 - default：默认访问模式，编程访问和管理控制台访问。 - programmatic：编程访问。 - console：管理控制台访问。
     * @return accessMode
     */
    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    public CreateUserResult withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * IAM用户状态信息。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CreateUserResult withPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
        return this;
    }

    /**
     * IAM用户首次登录是否重置密码。
     * @return pwdStatus
     */
    public Boolean getPwdStatus() {
        return pwdStatus;
    }

    public void setPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
    }

    public CreateUserResult withXuserId(String xuserId) {
        this.xuserId = xuserId;
        return this;
    }

    /**
     * IAM用户在外部系统中的ID。 >外部系统指与华为云对接的外部企业管理系统，xaccount_type、xaccount_id、xdomain_type、xdomain_id、xuser_type、xuser_id等参数值，无法在华为云获取，请咨询企业管理员。
     * @return xuserId
     */
    public String getXuserId() {
        return xuserId;
    }

    public void setXuserId(String xuserId) {
        this.xuserId = xuserId;
    }

    public CreateUserResult withXuserType(String xuserType) {
        this.xuserType = xuserType;
        return this;
    }

    /**
     * 用户在外部系统中的类型。 >外部系统指与华为云对接的外部企业管理系统，xaccount_type、xaccount_id、xdomain_type、xdomain_id、xuser_type、xuser_id等参数值，无法在华为云获取，请咨询企业管理员。
     * @return xuserType
     */
    public String getXuserType() {
        return xuserType;
    }

    public void setXuserType(String xuserType) {
        this.xuserType = xuserType;
    }

    public CreateUserResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * IAM用户描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateUserResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * IAM用户新用户名，长度1~64之间，只能包含如下字符：大小写字母、空格、数字或特殊字符（-_.）且不能以数字开头。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateUserResult withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * IAM用户手机号，纯数字，长度小于等于32字符。必须与国家码同时存在。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CreateUserResult withIsDomainOwner(Boolean isDomainOwner) {
        this.isDomainOwner = isDomainOwner;
        return this;
    }

    /**
     * IAM用户是否为账号管理员。
     * @return isDomainOwner
     */
    public Boolean getIsDomainOwner() {
        return isDomainOwner;
    }

    public void setIsDomainOwner(Boolean isDomainOwner) {
        this.isDomainOwner = isDomainOwner;
    }

    public CreateUserResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * IAM用户所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreateUserResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用IAM用户。true为启用，false为停用，默认为true。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CreateUserResult withAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }

    /**
     * 国家码。中国大陆为“0086”。
     * @return areacode
     */
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public CreateUserResult withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * IAM用户邮箱。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CreateUserResult withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * IAM用户创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateUserResult withXdomainId(String xdomainId) {
        this.xdomainId = xdomainId;
        return this;
    }

    /**
     * 运营主体的客户编码。
     * @return xdomainId
     */
    public String getXdomainId() {
        return xdomainId;
    }

    public void setXdomainId(String xdomainId) {
        this.xdomainId = xdomainId;
    }

    public CreateUserResult withXdomainType(String xdomainType) {
        this.xdomainType = xdomainType;
        return this;
    }

    /**
     * 运营主体。
     * @return xdomainType
     */
    public String getXdomainType() {
        return xdomainType;
    }

    public void setXdomainType(String xdomainType) {
        this.xdomainType = xdomainType;
    }

    public CreateUserResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * IAM用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateUserResult withPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
        return this;
    }

    /**
     * 密码过期时间（UTC时间），“null”表示密码不过期。
     * @return passwordExpiresAt
     */
    public String getPasswordExpiresAt() {
        return passwordExpiresAt;
    }

    public void setPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUserResult that = (CreateUserResult) obj;
        return Objects.equals(this.accessMode, that.accessMode) && Objects.equals(this.status, that.status)
            && Objects.equals(this.pwdStatus, that.pwdStatus) && Objects.equals(this.xuserId, that.xuserId)
            && Objects.equals(this.xuserType, that.xuserType) && Objects.equals(this.description, that.description)
            && Objects.equals(this.name, that.name) && Objects.equals(this.phone, that.phone)
            && Objects.equals(this.isDomainOwner, that.isDomainOwner) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.areacode, that.areacode)
            && Objects.equals(this.email, that.email) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.xdomainId, that.xdomainId) && Objects.equals(this.xdomainType, that.xdomainType)
            && Objects.equals(this.id, that.id) && Objects.equals(this.passwordExpiresAt, that.passwordExpiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessMode,
            status,
            pwdStatus,
            xuserId,
            xuserType,
            description,
            name,
            phone,
            isDomainOwner,
            domainId,
            enabled,
            areacode,
            email,
            createTime,
            xdomainId,
            xdomainType,
            id,
            passwordExpiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserResult {\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    pwdStatus: ").append(toIndentedString(pwdStatus)).append("\n");
        sb.append("    xuserId: ").append(toIndentedString(xuserId)).append("\n");
        sb.append("    xuserType: ").append(toIndentedString(xuserType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    isDomainOwner: ").append(toIndentedString(isDomainOwner)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    xdomainId: ").append(toIndentedString(xdomainId)).append("\n");
        sb.append("    xdomainType: ").append(toIndentedString(xdomainType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    passwordExpiresAt: ").append(toIndentedString(passwordExpiresAt)).append("\n");
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
