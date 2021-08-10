package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/** 分页查询企业用户信息 */
public class UserDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusCode")

    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "englishName")

    private String englishName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTime")

    private BigDecimal updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isHardTerminal")

    private Boolean isHardTerminal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrId")

    private String vmrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    private String signature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hidePhone")

    private Boolean hidePhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public UserDTO withId(String id) {
        this.id = id;
        return this;
    }

    /** 用户ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDTO withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /** 查询用户详情时, 根据不同情况，响应不同。 * 0： 查询成功且用户信息有变化， 响应会把新的信息都返回回去 * 1 ：查询成功且用户信息没有变化，响应只会返回用户ID * 2 ：用户不存在 * 3 ：无权限查询这个用户
     * 
     * @return statusCode */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public UserDTO withAccount(String account) {
        this.account = account;
        return this;
    }

    /** 用户账号。
     * 
     * @return account */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public UserDTO withName(String name) {
        this.name = name;
        return this;
    }

    /** 用户名。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDTO withEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }

    /** 英文名。
     * 
     * @return englishName */
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public UserDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /** 邮箱。
     * 
     * @return email */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /** 用户手机。
     * 
     * @return phone */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserDTO withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /** 用户部门。
     * 
     * @return deptName */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public UserDTO withNumber(String number) {
        this.number = number;
        return this;
    }

    /** 用户号码。
     * 
     * @return number */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public UserDTO withUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 用户信息最后更新时间。
     * 
     * @return updateTime */
    public BigDecimal getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
    }

    public UserDTO withIsHardTerminal(Boolean isHardTerminal) {
        this.isHardTerminal = isHardTerminal;
        return this;
    }

    /** 是否为硬终端。
     * 
     * @return isHardTerminal */
    public Boolean getIsHardTerminal() {
        return isHardTerminal;
    }

    public void setIsHardTerminal(Boolean isHardTerminal) {
        this.isHardTerminal = isHardTerminal;
    }

    public UserDTO withVmrId(String vmrId) {
        this.vmrId = vmrId;
        return this;
    }

    /** 用户虚拟会议室ID。
     * 
     * @return vmrId */
    public String getVmrId() {
        return vmrId;
    }

    public void setVmrId(String vmrId) {
        this.vmrId = vmrId;
    }

    public UserDTO withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /** 用户签名。
     * 
     * @return signature */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public UserDTO withTitle(String title) {
        this.title = title;
        return this;
    }

    /** 职位。
     * 
     * @return title */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UserDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述信息。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDTO withHidePhone(Boolean hidePhone) {
        this.hidePhone = hidePhone;
        return this;
    }

    /** 是否隐藏手机号（如果为true，其他人查询该用户时，不会返回该用户的手机号。自己查自己是可见的）
     * 
     * @return hidePhone */
    public Boolean getHidePhone() {
        return hidePhone;
    }

    public void setHidePhone(Boolean hidePhone) {
        this.hidePhone = hidePhone;
    }

    public UserDTO withType(String type) {
        this.type = type;
        return this;
    }

    /** 类型： * NORMAL_USER=普通用户 * HARD_TERMINAL=硬终端用户 * WHITE_BOARD=第三方白板 * HW_VISION_MEMBER=智慧屏
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(this.id, userDTO.id) && Objects.equals(this.statusCode, userDTO.statusCode)
            && Objects.equals(this.account, userDTO.account) && Objects.equals(this.name, userDTO.name)
            && Objects.equals(this.englishName, userDTO.englishName) && Objects.equals(this.email, userDTO.email)
            && Objects.equals(this.phone, userDTO.phone) && Objects.equals(this.deptName, userDTO.deptName)
            && Objects.equals(this.number, userDTO.number) && Objects.equals(this.updateTime, userDTO.updateTime)
            && Objects.equals(this.isHardTerminal, userDTO.isHardTerminal) && Objects.equals(this.vmrId, userDTO.vmrId)
            && Objects.equals(this.signature, userDTO.signature) && Objects.equals(this.title, userDTO.title)
            && Objects.equals(this.description, userDTO.description)
            && Objects.equals(this.hidePhone, userDTO.hidePhone) && Objects.equals(this.type, userDTO.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            statusCode,
            account,
            name,
            englishName,
            email,
            phone,
            deptName,
            number,
            updateTime,
            isHardTerminal,
            vmrId,
            signature,
            title,
            description,
            hidePhone,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    isHardTerminal: ").append(toIndentedString(isHardTerminal)).append("\n");
        sb.append("    vmrId: ").append(toIndentedString(vmrId)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hidePhone: ").append(toIndentedString(hidePhone)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
