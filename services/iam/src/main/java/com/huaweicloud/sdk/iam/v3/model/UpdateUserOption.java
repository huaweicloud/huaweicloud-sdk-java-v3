package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdateUserOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="areacode")
    
    private String areacode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone")
    
    private String phone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pwd_status")
    
    private Boolean pwdStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xuser_type")
    
    private String xuserType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xuser_id")
    
    private String xuserId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public UpdateUserOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 新IAM用户名，长度5~32字符之间，首位不能为数字，特殊字符只能包含下划线“_”、中划线“-”和空格。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateUserOption withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * IAM用户新密码。   - 系统默认密码最小长度为6字符，在6-32字符之间支持用户自定义密码长度。   - 至少包含以下四种字符中的两种： 大写字母、小写字母、数字和特殊字符。   - 必须满足账户设置中[密码策略](https://support.huaweicloud.com/usermanual-iam/iam_01_0607.html)的要求。   - 新密码不能与当前密码相同。 
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public UpdateUserOption withEmail(String email) {
        this.email = email;
        return this;
    }

    


    /**
     * IAM用户新邮箱，需符合邮箱格式，长度小于等于255字符。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public UpdateUserOption withAreacode(String areacode) {
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

    

    public UpdateUserOption withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    


    /**
     * IAM用户新手机号，纯数字，长度小于等于32字符。必须与国家码同时存在。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

    public UpdateUserOption withEnabled(Boolean enabled) {
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

    

    public UpdateUserOption withPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
        return this;
    }

    


    /**
     * IAM用户密码状态。true：需要修改密码，false：正常。
     * @return pwdStatus
     */
    public Boolean getPwdStatus() {
        return pwdStatus;
    }

    public void setPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
    }

    

    public UpdateUserOption withXuserType(String xuserType) {
        this.xuserType = xuserType;
        return this;
    }

    


    /**
     * IAM用户在外部系统中的类型。长度小于等于64字符。xuser_type如果存在，则需要与同一租户中的xaccount_type、xdomain_type校验，须与xuser_id同时存在。 >外部系统指与华为云对接的外部企业管理系统，xaccount_type、xaccount_id、xdomain_type、xdomain_id、xuser_type、xuser_id等参数值，无法在华为云获取，请咨询企业管理员。
     * @return xuserType
     */
    public String getXuserType() {
        return xuserType;
    }

    public void setXuserType(String xuserType) {
        this.xuserType = xuserType;
    }

    

    public UpdateUserOption withXuserId(String xuserId) {
        this.xuserId = xuserId;
        return this;
    }

    


    /**
     * IAM用户在外部系统中的ID。长度小于等于128字符，必须与xuser_type同时存在。 >外部系统指与华为云对接的外部企业管理系统，xaccount_type、xaccount_id、xdomain_type、xdomain_id、xuser_type、xuser_id等参数值，无法在华为云获取，请咨询企业管理员。
     * @return xuserId
     */
    public String getXuserId() {
        return xuserId;
    }

    public void setXuserId(String xuserId) {
        this.xuserId = xuserId;
    }

    

    public UpdateUserOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * IAM用户新描述信息。
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
        UpdateUserOption updateUserOption = (UpdateUserOption) o;
        return Objects.equals(this.name, updateUserOption.name) &&
            Objects.equals(this.password, updateUserOption.password) &&
            Objects.equals(this.email, updateUserOption.email) &&
            Objects.equals(this.areacode, updateUserOption.areacode) &&
            Objects.equals(this.phone, updateUserOption.phone) &&
            Objects.equals(this.enabled, updateUserOption.enabled) &&
            Objects.equals(this.pwdStatus, updateUserOption.pwdStatus) &&
            Objects.equals(this.xuserType, updateUserOption.xuserType) &&
            Objects.equals(this.xuserId, updateUserOption.xuserId) &&
            Objects.equals(this.description, updateUserOption.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, password, email, areacode, phone, enabled, pwdStatus, xuserType, xuserId, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

