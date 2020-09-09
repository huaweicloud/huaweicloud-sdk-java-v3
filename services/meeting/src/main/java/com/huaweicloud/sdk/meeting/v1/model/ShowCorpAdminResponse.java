package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.DeptBasicDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowCorpAdminResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="account")
    
    private String account;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminType")
    
    private Integer adminType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone")
    
    private String phone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="country")
    
    private String country;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="menuTemplateId")
    
    private String menuTemplateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="menuTemplateName")
    
    private String menuTemplateName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dept")
    
    private DeptBasicDTO dept = null;

    public ShowCorpAdminResponse withId(String id) {
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

    public ShowCorpAdminResponse withAccount(String account) {
        this.account = account;
        return this;
    }

    


    /**
     * 用户账号
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ShowCorpAdminResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCorpAdminResponse withAdminType(Integer adminType) {
        this.adminType = adminType;
        return this;
    }

    


    /**
     * 管理员类型。 0：默认管理员 1：普通管理员 
     * @return adminType
     */
    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public ShowCorpAdminResponse withEmail(String email) {
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

    public ShowCorpAdminResponse withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    


    /**
     * 手机号
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ShowCorpAdminResponse withCountry(String country) {
        this.country = country;
        return this;
    }

    


    /**
     * 手机号所属的国家
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ShowCorpAdminResponse withMenuTemplateId(String menuTemplateId) {
        this.menuTemplateId = menuTemplateId;
        return this;
    }

    


    /**
     * 菜单模板id
     * @return menuTemplateId
     */
    public String getMenuTemplateId() {
        return menuTemplateId;
    }

    public void setMenuTemplateId(String menuTemplateId) {
        this.menuTemplateId = menuTemplateId;
    }

    public ShowCorpAdminResponse withMenuTemplateName(String menuTemplateName) {
        this.menuTemplateName = menuTemplateName;
        return this;
    }

    


    /**
     * 菜单模板名称
     * @return menuTemplateName
     */
    public String getMenuTemplateName() {
        return menuTemplateName;
    }

    public void setMenuTemplateName(String menuTemplateName) {
        this.menuTemplateName = menuTemplateName;
    }

    public ShowCorpAdminResponse withDept(DeptBasicDTO dept) {
        this.dept = dept;
        return this;
    }

    public ShowCorpAdminResponse withDept(Consumer<DeptBasicDTO> deptSetter) {
        if(this.dept == null ){
            this.dept = new DeptBasicDTO();
            deptSetter.accept(this.dept);
        }
        
        return this;
    }


    /**
     * Get dept
     * @return dept
     */
    public DeptBasicDTO getDept() {
        return dept;
    }

    public void setDept(DeptBasicDTO dept) {
        this.dept = dept;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCorpAdminResponse showCorpAdminResponse = (ShowCorpAdminResponse) o;
        return Objects.equals(this.id, showCorpAdminResponse.id) &&
            Objects.equals(this.account, showCorpAdminResponse.account) &&
            Objects.equals(this.name, showCorpAdminResponse.name) &&
            Objects.equals(this.adminType, showCorpAdminResponse.adminType) &&
            Objects.equals(this.email, showCorpAdminResponse.email) &&
            Objects.equals(this.phone, showCorpAdminResponse.phone) &&
            Objects.equals(this.country, showCorpAdminResponse.country) &&
            Objects.equals(this.menuTemplateId, showCorpAdminResponse.menuTemplateId) &&
            Objects.equals(this.menuTemplateName, showCorpAdminResponse.menuTemplateName) &&
            Objects.equals(this.dept, showCorpAdminResponse.dept);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, account, name, adminType, email, phone, country, menuTemplateId, menuTemplateName, dept);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCorpAdminResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminType: ").append(toIndentedString(adminType)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    menuTemplateId: ").append(toIndentedString(menuTemplateId)).append("\n");
        sb.append("    menuTemplateName: ").append(toIndentedString(menuTemplateName)).append("\n");
        sb.append("    dept: ").append(toIndentedString(dept)).append("\n");
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

