package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 用户鉴权信息。
 */
public class UserInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userId")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ucloginAccount")
    
    private String ucloginAccount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="serviceAccount")
    
    private String serviceAccount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="numberHA1")
    
    private String numberHA1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alias1")
    
    private String alias1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="companyId")
    
    private String companyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spId")
    
    private String spId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="companyDomain")
    
    private String companyDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="realm")
    
    private String realm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userType")
    
    private Integer userType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminType")
    
    private Integer adminType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nameEn")
    
    private String nameEn;

    public UserInfo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    public UserInfo withUcloginAccount(String ucloginAccount) {
        this.ucloginAccount = ucloginAccount;
        return this;
    }

    


    /**
     * 用户UC帐号
     * @return ucloginAccount
     */
    public String getUcloginAccount() {
        return ucloginAccount;
    }

    public void setUcloginAccount(String ucloginAccount) {
        this.ucloginAccount = ucloginAccount;
    }

    

    public UserInfo withServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }

    


    /**
     * 用户关联的号码，sip格式。 登录类型不一样获取到的号码也不同，如软终端和硬终端客户端登录获取的号码不同。若未关联号码，则为空。 例如：sip:+8675590121000@domain5.huawei.com 
     * @return serviceAccount
     */
    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    

    public UserInfo withNumberHA1(String numberHA1) {
        this.numberHA1 = numberHA1;
        return this;
    }

    


    /**
     * 号码对应的HA1
     * @return numberHA1
     */
    public String getNumberHA1() {
        return numberHA1;
    }

    public void setNumberHA1(String numberHA1) {
        this.numberHA1 = numberHA1;
    }

    

    public UserInfo withAlias1(String alias1) {
        this.alias1 = alias1;
        return this;
    }

    


    /**
     * 用户别名1
     * @return alias1
     */
    public String getAlias1() {
        return alias1;
    }

    public void setAlias1(String alias1) {
        this.alias1 = alias1;
    }

    

    public UserInfo withCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    


    /**
     * 企业ID
     * @return companyId
     */
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    

    public UserInfo withSpId(String spId) {
        this.spId = spId;
        return this;
    }

    


    /**
     * SP ID
     * @return spId
     */
    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    

    public UserInfo withCompanyDomain(String companyDomain) {
        this.companyDomain = companyDomain;
        return this;
    }

    


    /**
     * 企业域名
     * @return companyDomain
     */
    public String getCompanyDomain() {
        return companyDomain;
    }

    public void setCompanyDomain(String companyDomain) {
        this.companyDomain = companyDomain;
    }

    

    public UserInfo withRealm(String realm) {
        this.realm = realm;
        return this;
    }

    


    /**
     * 本地鉴权：realm
     * @return realm
     */
    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    

    public UserInfo withUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

    


    /**
     * 用户类型。 * 0：系统管理用户 * 1：SP管理用户 * 2：企业用户 * 3：upath用户 * 4：硬终端默认用户 * 5：TE终端用户 * 6：顾客用户 * 7：公共设备用户 * 8：集群群组用户 * 9：USM用户 
     * @return userType
     */
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    

    public UserInfo withAdminType(Integer adminType) {
        this.adminType = adminType;
        return this;
    }

    


    /**
     * 管理员类型： * 0：默认管理员 * 1：普通管理员 * 2：非管理员，即普通企业成员，USERTYPE为2时有效 
     * @return adminType
     */
    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    

    public UserInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 用户姓名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UserInfo withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    


    /**
     * 用户英文姓名
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(this.userId, userInfo.userId) &&
            Objects.equals(this.ucloginAccount, userInfo.ucloginAccount) &&
            Objects.equals(this.serviceAccount, userInfo.serviceAccount) &&
            Objects.equals(this.numberHA1, userInfo.numberHA1) &&
            Objects.equals(this.alias1, userInfo.alias1) &&
            Objects.equals(this.companyId, userInfo.companyId) &&
            Objects.equals(this.spId, userInfo.spId) &&
            Objects.equals(this.companyDomain, userInfo.companyDomain) &&
            Objects.equals(this.realm, userInfo.realm) &&
            Objects.equals(this.userType, userInfo.userType) &&
            Objects.equals(this.adminType, userInfo.adminType) &&
            Objects.equals(this.name, userInfo.name) &&
            Objects.equals(this.nameEn, userInfo.nameEn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userId, ucloginAccount, serviceAccount, numberHA1, alias1, companyId, spId, companyDomain, realm, userType, adminType, name, nameEn);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserInfo {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    ucloginAccount: ").append(toIndentedString(ucloginAccount)).append("\n");
        sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
        sb.append("    numberHA1: ").append(toIndentedString(numberHA1)).append("\n");
        sb.append("    alias1: ").append(toIndentedString(alias1)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    spId: ").append(toIndentedString(spId)).append("\n");
        sb.append("    companyDomain: ").append(toIndentedString(companyDomain)).append("\n");
        sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    adminType: ").append(toIndentedString(adminType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
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

