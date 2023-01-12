package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建用户请求体
 */
public class CreateUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "areacode")

    private String areacode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "settings")

    private UserSettingDto settings;

    public CreateUserReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名，长度5~31之间，首位不能为数字，特殊字符只能包含下划线“_”、中划线“-”和空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateUserReq withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 用户密码，在8-32位之间支持用户自定义密码长度，至少包含以下四种字符中的三种： 大写字母、小写字母、数字和特殊字符。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateUserReq withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 角色类型：管理员(ADMIN)、操作者(OPERATOR)
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public CreateUserReq withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 用户邮箱，需符合邮箱格式
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CreateUserReq withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 用户手机号，纯数字，长度小于等于32位。必须与国家码同时存在。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CreateUserReq withAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }

    /**
     * 国家码。中国大陆为“0086”
     * @return areacode
     */
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public CreateUserReq withSettings(UserSettingDto settings) {
        this.settings = settings;
        return this;
    }

    public CreateUserReq withSettings(Consumer<UserSettingDto> settingsSetter) {
        if (this.settings == null) {
            this.settings = new UserSettingDto();
            settingsSetter.accept(this.settings);
        }

        return this;
    }

    /**
     * Get settings
     * @return settings
     */
    public UserSettingDto getSettings() {
        return settings;
    }

    public void setSettings(UserSettingDto settings) {
        this.settings = settings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateUserReq createUserReq = (CreateUserReq) o;
        return Objects.equals(this.name, createUserReq.name) && Objects.equals(this.password, createUserReq.password)
            && Objects.equals(this.role, createUserReq.role) && Objects.equals(this.email, createUserReq.email)
            && Objects.equals(this.phone, createUserReq.phone) && Objects.equals(this.areacode, createUserReq.areacode)
            && Objects.equals(this.settings, createUserReq.settings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, role, email, phone, areacode, settings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
