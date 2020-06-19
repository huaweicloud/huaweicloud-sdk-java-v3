package com.huaweicloud.sdk.meeting.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 分页查询企业用户信息
 */
public class SearchUserResultDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userAccount")
    
    private String userAccount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="englishName")
    
    private String englishName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone")
    
    private String phone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="country")
    
    private String country;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrId")
    
    private String vmrId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptCode")
    
    private String deptCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptNamePath")
    
    private String deptNamePath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userType")
    
    private Integer userType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminType")
    
    private Integer adminType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="signature")
    
    private String signature;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="title")
    
    private String title;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="desc")
    
    private String desc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sortLevel")
    
    private Integer sortLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hidePhone")
    
    private Boolean hidePhone;

    public SearchUserResultDTO withId(String id) {
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

    public SearchUserResultDTO withUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }

    


    /**
     * 账号
     * @return userAccount
     */
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public SearchUserResultDTO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 姓名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SearchUserResultDTO withEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }

    


    /**
     * 英文名称
     * @return englishName
     */
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public SearchUserResultDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    


    /**
     * 手机
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public SearchUserResultDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    


    /**
     * 手机所属国家
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public SearchUserResultDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    


    /**
     * 邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SearchUserResultDTO withVmrId(String vmrId) {
        this.vmrId = vmrId;
        return this;
    }

    


    /**
     * 个人会议室Id
     * @return vmrId
     */
    public String getVmrId() {
        return vmrId;
    }

    public void setVmrId(String vmrId) {
        this.vmrId = vmrId;
    }

    public SearchUserResultDTO withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    


    /**
     * 部门编码
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public SearchUserResultDTO withDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
        return this;
    }

    


    /**
     * 部门完整名称
     * @return deptNamePath
     */
    public String getDeptNamePath() {
        return deptNamePath;
    }

    public void setDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
    }

    public SearchUserResultDTO withUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

    


    /**
     * 用户类型 - 0：系统管理员账户 - 1：SP管理员账户 - 2：企业成员账户 - 3：注册用户 - 10：硬终端用户
     * @return userType
     */
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public SearchUserResultDTO withAdminType(Integer adminType) {
        this.adminType = adminType;
        return this;
    }

    


    /**
     * 管理员类型 - 0：默认（超级）管理员 - 1：普通管理员 - 2：非管理员（即为普通企业成员，UserType是2时有效）
     * @return adminType
     */
    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public SearchUserResultDTO withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    


    /**
     * 签名
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public SearchUserResultDTO withTitle(String title) {
        this.title = title;
        return this;
    }

    


    /**
     * 职位
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SearchUserResultDTO withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    


    /**
     * 备注
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SearchUserResultDTO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 用户状态，0、正常，1、停用
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SearchUserResultDTO withSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
        return this;
    }

    


    /**
     * 通讯录排序等级，序号越低优先级越高
     * @return sortLevel
     */
    public Integer getSortLevel() {
        return sortLevel;
    }

    public void setSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
    }

    public SearchUserResultDTO withHidePhone(Boolean hidePhone) {
        this.hidePhone = hidePhone;
        return this;
    }

    


    /**
     * 是否隐藏手机号码
     * @return hidePhone
     */
    public Boolean getHidePhone() {
        return hidePhone;
    }

    public void setHidePhone(Boolean hidePhone) {
        this.hidePhone = hidePhone;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchUserResultDTO searchUserResultDTO = (SearchUserResultDTO) o;
        return Objects.equals(this.id, searchUserResultDTO.id) &&
            Objects.equals(this.userAccount, searchUserResultDTO.userAccount) &&
            Objects.equals(this.name, searchUserResultDTO.name) &&
            Objects.equals(this.englishName, searchUserResultDTO.englishName) &&
            Objects.equals(this.phone, searchUserResultDTO.phone) &&
            Objects.equals(this.country, searchUserResultDTO.country) &&
            Objects.equals(this.email, searchUserResultDTO.email) &&
            Objects.equals(this.vmrId, searchUserResultDTO.vmrId) &&
            Objects.equals(this.deptCode, searchUserResultDTO.deptCode) &&
            Objects.equals(this.deptNamePath, searchUserResultDTO.deptNamePath) &&
            Objects.equals(this.userType, searchUserResultDTO.userType) &&
            Objects.equals(this.adminType, searchUserResultDTO.adminType) &&
            Objects.equals(this.signature, searchUserResultDTO.signature) &&
            Objects.equals(this.title, searchUserResultDTO.title) &&
            Objects.equals(this.desc, searchUserResultDTO.desc) &&
            Objects.equals(this.status, searchUserResultDTO.status) &&
            Objects.equals(this.sortLevel, searchUserResultDTO.sortLevel) &&
            Objects.equals(this.hidePhone, searchUserResultDTO.hidePhone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, userAccount, name, englishName, phone, country, email, vmrId, deptCode, deptNamePath, userType, adminType, signature, title, desc, status, sortLevel, hidePhone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchUserResultDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userAccount: ").append(toIndentedString(userAccount)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    vmrId: ").append(toIndentedString(vmrId)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    deptNamePath: ").append(toIndentedString(deptNamePath)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    adminType: ").append(toIndentedString(adminType)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sortLevel: ").append(toIndentedString(sortLevel)).append("\n");
        sb.append("    hidePhone: ").append(toIndentedString(hidePhone)).append("\n");
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

