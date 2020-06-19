package com.huaweicloud.sdk.iam.v3.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.LinksSelf;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ShowUserResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private LinksSelf links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xuser_id")
    
    private String xuserId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xuser_type")
    
    private String xuserType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="areacode")
    
    private String areacode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone")
    
    private String phone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pwd_status")
    
    private Boolean pwdStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private String updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_login_time")
    
    private String lastLoginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pwd_stength")
    
    private String pwdStength;

    public ShowUserResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    


    /**
     * IAM用户是否启用。true表示启用，false表示停用，默认为true。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ShowUserResult withId(String id) {
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

    public ShowUserResult withDomainId(String domainId) {
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

    public ShowUserResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * IAM用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowUserResult withLinks(LinksSelf links) {
        this.links = links;
        return this;
    }

    public ShowUserResult withLinks(Consumer<LinksSelf> linksSetter) {
        if(this.links == null ){
            this.links = new LinksSelf();
        }
        linksSetter.accept(this.links);
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public LinksSelf getLinks() {
        return links;
    }

    public void setLinks(LinksSelf links) {
        this.links = links;
    }

    public ShowUserResult withXuserId(String xuserId) {
        this.xuserId = xuserId;
        return this;
    }

    


    /**
     * IAM用户在外部系统中的ID。
     * @return xuserId
     */
    public String getXuserId() {
        return xuserId;
    }

    public void setXuserId(String xuserId) {
        this.xuserId = xuserId;
    }

    public ShowUserResult withXuserType(String xuserType) {
        this.xuserType = xuserType;
        return this;
    }

    


    /**
     * IAM用户在外部系统中的类型。
     * @return xuserType
     */
    public String getXuserType() {
        return xuserType;
    }

    public void setXuserType(String xuserType) {
        this.xuserType = xuserType;
    }

    public ShowUserResult withAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }

    


    /**
     * IAM用户手机号的国家码。
     * @return areacode
     */
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public ShowUserResult withEmail(String email) {
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

    public ShowUserResult withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    


    /**
     * IAM用户手机号。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ShowUserResult withPwdStatus(Boolean pwdStatus) {
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

    public ShowUserResult withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * IAM用户更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowUserResult withCreateTime(String createTime) {
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

    public ShowUserResult withLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }

    


    /**
     * IAM用户最后登录时间。
     * @return lastLoginTime
     */
    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public ShowUserResult withPwdStength(String pwdStength) {
        this.pwdStength = pwdStength;
        return this;
    }

    


    /**
     * IAM用户密码强度。结果为low/middle/high/none，分别表示密码强度低/中/高/无。
     * @return pwdStength
     */
    public String getPwdStength() {
        return pwdStength;
    }

    public void setPwdStength(String pwdStength) {
        this.pwdStength = pwdStength;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowUserResult showUserResult = (ShowUserResult) o;
        return Objects.equals(this.enabled, showUserResult.enabled) &&
            Objects.equals(this.id, showUserResult.id) &&
            Objects.equals(this.domainId, showUserResult.domainId) &&
            Objects.equals(this.name, showUserResult.name) &&
            Objects.equals(this.links, showUserResult.links) &&
            Objects.equals(this.xuserId, showUserResult.xuserId) &&
            Objects.equals(this.xuserType, showUserResult.xuserType) &&
            Objects.equals(this.areacode, showUserResult.areacode) &&
            Objects.equals(this.email, showUserResult.email) &&
            Objects.equals(this.phone, showUserResult.phone) &&
            Objects.equals(this.pwdStatus, showUserResult.pwdStatus) &&
            Objects.equals(this.updateTime, showUserResult.updateTime) &&
            Objects.equals(this.createTime, showUserResult.createTime) &&
            Objects.equals(this.lastLoginTime, showUserResult.lastLoginTime) &&
            Objects.equals(this.pwdStength, showUserResult.pwdStength);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enabled, id, domainId, name, links, xuserId, xuserType, areacode, email, phone, pwdStatus, updateTime, createTime, lastLoginTime, pwdStength);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserResult {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    xuserId: ").append(toIndentedString(xuserId)).append("\n");
        sb.append("    xuserType: ").append(toIndentedString(xuserType)).append("\n");
        sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    pwdStatus: ").append(toIndentedString(pwdStatus)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastLoginTime: ").append(toIndentedString(lastLoginTime)).append("\n");
        sb.append("    pwdStength: ").append(toIndentedString(pwdStength)).append("\n");
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

