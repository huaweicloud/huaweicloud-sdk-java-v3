package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.BaseUser;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 邀请企业内用户的DTO对象
 */
public class AddUserRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contact")
    
    private String contact;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="country")
    
    private String country;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptCode")
    
    private String deptCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="title")
    
    private String title;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sortLevel")
    
    private Integer sortLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="desc")
    
    private String desc;

    public AddUserRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 用户名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public AddUserRequestBody withContact(String contact) {
        this.contact = contact;
        return this;
    }

    


    /**
     * 后台自动识别是手机还是邮箱,若为手机号，则要求和国家码匹配
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    

    public AddUserRequestBody withCountry(String country) {
        this.country = country;
        return this;
    }

    


    /**
     * 国家码。 国家和国家码的对应关系请参考:https://support.huaweicloud.com/api-meeting/meeting_21_0109.html 
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    

    public AddUserRequestBody withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    


    /**
     * 部门编号，若不携带则默认根部门
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    

    public AddUserRequestBody withTitle(String title) {
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

    

    public AddUserRequestBody withSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
        return this;
    }

    


    /**
     * 通讯录排序等级，序号越低优先级越高
     * minimum: 1
     * maximum: 10000
     * @return sortLevel
     */
    public Integer getSortLevel() {
        return sortLevel;
    }

    public void setSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
    }

    

    public AddUserRequestBody withDesc(String desc) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddUserRequestBody addUserRequestBody = (AddUserRequestBody) o;
        return Objects.equals(this.name, addUserRequestBody.name) &&
            Objects.equals(this.contact, addUserRequestBody.contact) &&
            Objects.equals(this.country, addUserRequestBody.country) &&
            Objects.equals(this.deptCode, addUserRequestBody.deptCode) &&
            Objects.equals(this.title, addUserRequestBody.title) &&
            Objects.equals(this.sortLevel, addUserRequestBody.sortLevel) &&
            Objects.equals(this.desc, addUserRequestBody.desc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, contact, country, deptCode, title, sortLevel, desc);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddUserRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    sortLevel: ").append(toIndentedString(sortLevel)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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

