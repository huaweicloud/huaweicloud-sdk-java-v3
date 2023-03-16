package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetUserRsp
 */
public class GetUserRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

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
    @JsonProperty(value = "is_domain_owner")

    private Boolean isDomainOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_status")

    private Boolean pwdStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    public GetUserRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetUserRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名，长度4~31之间，首位不能为数字，特殊字符只能包含下划线“_”、中划线“-”和空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetUserRsp withRole(String role) {
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

    public GetUserRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetUserRsp withEmail(String email) {
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

    public GetUserRsp withPhone(String phone) {
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

    public GetUserRsp withAreacode(String areacode) {
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

    public GetUserRsp withIsDomainOwner(Boolean isDomainOwner) {
        this.isDomainOwner = isDomainOwner;
        return this;
    }

    /**
     * 是否domain用户
     * @return isDomainOwner
     */
    public Boolean getIsDomainOwner() {
        return isDomainOwner;
    }

    public void setIsDomainOwner(Boolean isDomainOwner) {
        this.isDomainOwner = isDomainOwner;
    }

    public GetUserRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 用户创建时间，UTC时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public GetUserRsp withPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
        return this;
    }

    /**
     * 是否需要修改密码
     * @return pwdStatus
     */
    public Boolean getPwdStatus() {
        return pwdStatus;
    }

    public void setPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
    }

    public GetUserRsp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，UTC时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public GetUserRsp withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 来源，PLATFORM或者IAM
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetUserRsp getUserRsp = (GetUserRsp) o;
        return Objects.equals(this.id, getUserRsp.id) && Objects.equals(this.name, getUserRsp.name)
            && Objects.equals(this.role, getUserRsp.role) && Objects.equals(this.status, getUserRsp.status)
            && Objects.equals(this.email, getUserRsp.email) && Objects.equals(this.phone, getUserRsp.phone)
            && Objects.equals(this.areacode, getUserRsp.areacode)
            && Objects.equals(this.isDomainOwner, getUserRsp.isDomainOwner)
            && Objects.equals(this.createTime, getUserRsp.createTime)
            && Objects.equals(this.pwdStatus, getUserRsp.pwdStatus)
            && Objects.equals(this.updateTime, getUserRsp.updateTime) && Objects.equals(this.source, getUserRsp.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            role,
            status,
            email,
            phone,
            areacode,
            isDomainOwner,
            createTime,
            pwdStatus,
            updateTime,
            source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUserRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
        sb.append("    isDomainOwner: ").append(toIndentedString(isDomainOwner)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    pwdStatus: ").append(toIndentedString(pwdStatus)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
