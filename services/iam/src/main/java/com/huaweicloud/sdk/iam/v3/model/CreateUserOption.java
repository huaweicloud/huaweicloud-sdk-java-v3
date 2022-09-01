package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class CreateUserOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    @JacksonXmlProperty(localName = "access_mode")

    private String accessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    @JacksonXmlProperty(localName = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    @JacksonXmlProperty(localName = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "areacode")

    @JacksonXmlProperty(localName = "areacode")

    private String areacode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    @JacksonXmlProperty(localName = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    @JacksonXmlProperty(localName = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_status")

    @JacksonXmlProperty(localName = "pwd_status")

    private Boolean pwdStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xuser_type")

    @JacksonXmlProperty(localName = "xuser_type")

    private String xuserType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xuser_id")

    @JacksonXmlProperty(localName = "xuser_id")

    private String xuserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    public CreateUserOption withAccessMode(String accessMode) {
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

    public CreateUserOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * IAM用户名，长度1~64之间，只能包含如下字符：大小写字母、空格、数字或特殊字符（-_.）且不能以数字开头。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateUserOption withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * IAM用户所属的账号ID，获取方式请参见：[获取账号、IAM用户、项目、用户组、委托的名称和ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreateUserOption withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * IAM用户密码。 - 系统默认密码最小长度为6字符，在6-32字符之间支持用户自定义密码长度。 - 至少包含以下四种字符中的两种： 大写字母、小写字母、数字和特殊字符。 - 不能包含手机号和邮箱。 - 必须满足账户设置中密码策略的要求。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateUserOption withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * IAM用户邮箱，需符合邮箱格式，长度小于等于255字符。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CreateUserOption withAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }

    /**
     * 国家码。必须与手机号同时存在。中国大陆为“0086”。
     * @return areacode
     */
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public CreateUserOption withPhone(String phone) {
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

    public CreateUserOption withEnabled(Boolean enabled) {
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

    public CreateUserOption withPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
        return this;
    }

    /**
     * IAM用户首次登录是否重置密码，默认需要重置。
     * @return pwdStatus
     */
    public Boolean getPwdStatus() {
        return pwdStatus;
    }

    public void setPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
    }

    public CreateUserOption withXuserType(String xuserType) {
        this.xuserType = xuserType;
        return this;
    }

    /**
     * IAM用户在外部系统中的类型。长度小于等于64字符。xuser_type如果存在且不等于TenantIdp时，则需要与同一租户中的xaccount_type、xdomain_type校验，须与xuser_id同时存在。 >外部系统指与华为云对接的外部企业管理系统，xaccount_type、xaccount_id、xdomain_type、xdomain_id、xuser_type、xuser_id等参数值，无法在华为云获取，请咨询企业管理员。 
     * @return xuserType
     */
    public String getXuserType() {
        return xuserType;
    }

    public void setXuserType(String xuserType) {
        this.xuserType = xuserType;
    }

    public CreateUserOption withXuserId(String xuserId) {
        this.xuserId = xuserId;
        return this;
    }

    /**
     * IAM用户在外部系统中的ID。长度小于等于128字符，须与xuser_type同时存在。 >外部系统指与华为云对接的外部企业管理系统，xaccount_type、xaccount_id、xdomain_type、xdomain_id、xuser_type、xuser_id等参数值，无法在华为云获取，请咨询企业管理员。
     * @return xuserId
     */
    public String getXuserId() {
        return xuserId;
    }

    public void setXuserId(String xuserId) {
        this.xuserId = xuserId;
    }

    public CreateUserOption withDescription(String description) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateUserOption createUserOption = (CreateUserOption) o;
        return Objects.equals(this.accessMode, createUserOption.accessMode)
            && Objects.equals(this.name, createUserOption.name)
            && Objects.equals(this.domainId, createUserOption.domainId)
            && Objects.equals(this.password, createUserOption.password)
            && Objects.equals(this.email, createUserOption.email)
            && Objects.equals(this.areacode, createUserOption.areacode)
            && Objects.equals(this.phone, createUserOption.phone)
            && Objects.equals(this.enabled, createUserOption.enabled)
            && Objects.equals(this.pwdStatus, createUserOption.pwdStatus)
            && Objects.equals(this.xuserType, createUserOption.xuserType)
            && Objects.equals(this.xuserId, createUserOption.xuserId)
            && Objects.equals(this.description, createUserOption.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessMode,
            name,
            domainId,
            password,
            email,
            areacode,
            phone,
            enabled,
            pwdStatus,
            xuserType,
            xuserId,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserOption {\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    pwdStatus: ").append(toIndentedString(pwdStatus)).append("\n");
        sb.append("    xuserType: ").append(toIndentedString(xuserType)).append("\n");
        sb.append("    xuserId: ").append(toIndentedString(xuserId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
