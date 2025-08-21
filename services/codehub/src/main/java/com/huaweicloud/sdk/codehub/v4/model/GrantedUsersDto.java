package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GrantedUsersDto
 */
public class GrantedUsersDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_id")

    private String iamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_license_status")

    private Integer serviceLicenseStatus;

    public GrantedUsersDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 用户id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GrantedUsersDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 用户名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GrantedUsersDto withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * **参数解释：** 用户中文名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public GrantedUsersDto withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释：** 用户iam_id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public GrantedUsersDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * **参数解释：** 用户昵称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public GrantedUsersDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * **参数解释：** 租户名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public GrantedUsersDto withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * **参数解释：** 用户邮箱。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GrantedUsersDto withIamId(String iamId) {
        this.iamId = iamId;
        return this;
    }

    /**
     * **参数解释：** 用户iam_id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return iamId
     */
    public String getIamId() {
        return iamId;
    }

    public void setIamId(String iamId) {
        this.iamId = iamId;
    }

    public GrantedUsersDto withServiceLicenseStatus(Integer serviceLicenseStatus) {
        this.serviceLicenseStatus = serviceLicenseStatus;
        return this;
    }

    /**
     * **参数解释：** license的状态。
     * minimum: 1
     * maximum: 2147483647
     * @return serviceLicenseStatus
     */
    public Integer getServiceLicenseStatus() {
        return serviceLicenseStatus;
    }

    public void setServiceLicenseStatus(Integer serviceLicenseStatus) {
        this.serviceLicenseStatus = serviceLicenseStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GrantedUsersDto that = (GrantedUsersDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nameCn, that.nameCn) && Objects.equals(this.username, that.username)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.tenantName, that.tenantName)
            && Objects.equals(this.email, that.email) && Objects.equals(this.iamId, that.iamId)
            && Objects.equals(this.serviceLicenseStatus, that.serviceLicenseStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nameCn, username, nickName, tenantName, email, iamId, serviceLicenseStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GrantedUsersDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    iamId: ").append(toIndentedString(iamId)).append("\n");
        sb.append("    serviceLicenseStatus: ").append(toIndentedString(serviceLicenseStatus)).append("\n");
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
