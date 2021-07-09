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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isBindPhone")
    
    private Boolean isBindPhone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="freeUser")
    
    private Boolean freeUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thirdAccount")
    
    private String thirdAccount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="visionAccount")
    
    private String visionAccount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="headPictureUrl")
    
    private String headPictureUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paidAccount")
    
    private String paidAccount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paidPassword")
    
    private String paidPassword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="weLinkUser")
    
    private Boolean weLinkUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="appId")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tr069Account")
    
    private String tr069Account;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="corpType")
    
    private Integer corpType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloudUserId")
    
    private String cloudUserId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="grayUser")
    
    private Boolean grayUser;

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

    

    public UserInfo withIsBindPhone(Boolean isBindPhone) {
        this.isBindPhone = isBindPhone;
        return this;
    }

    


    /**
     * 标识是否绑定手机
     * @return isBindPhone
     */
    public Boolean getIsBindPhone() {
        return isBindPhone;
    }

    public void setIsBindPhone(Boolean isBindPhone) {
        this.isBindPhone = isBindPhone;
    }

    

    public UserInfo withFreeUser(Boolean freeUser) {
        this.freeUser = freeUser;
        return this;
    }

    


    /**
     * 标识是否是免费试用用户
     * @return freeUser
     */
    public Boolean getFreeUser() {
        return freeUser;
    }

    public void setFreeUser(Boolean freeUser) {
        this.freeUser = freeUser;
    }

    

    public UserInfo withThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount;
        return this;
    }

    


    /**
     * 用户的第三方账号，例如华为账号登录时获取到的union_id
     * @return thirdAccount
     */
    public String getThirdAccount() {
        return thirdAccount;
    }

    public void setThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount;
    }

    

    public UserInfo withVisionAccount(String visionAccount) {
        this.visionAccount = visionAccount;
        return this;
    }

    


    /**
     * 智慧屏设备id
     * @return visionAccount
     */
    public String getVisionAccount() {
        return visionAccount;
    }

    public void setVisionAccount(String visionAccount) {
        this.visionAccount = visionAccount;
    }

    

    public UserInfo withHeadPictureUrl(String headPictureUrl) {
        this.headPictureUrl = headPictureUrl;
        return this;
    }

    


    /**
     * 头像链接
     * @return headPictureUrl
     */
    public String getHeadPictureUrl() {
        return headPictureUrl;
    }

    public void setHeadPictureUrl(String headPictureUrl) {
        this.headPictureUrl = headPictureUrl;
    }

    

    public UserInfo withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 机机密码，用于智慧屏登录
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public UserInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 用户状态。 * 0：正常 * 1：停用 
     * minimum: 0
     * maximum: 7
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public UserInfo withPaidAccount(String paidAccount) {
        this.paidAccount = paidAccount;
        return this;
    }

    


    /**
     * 付费用户机机账号，用于智慧屏登录
     * @return paidAccount
     */
    public String getPaidAccount() {
        return paidAccount;
    }

    public void setPaidAccount(String paidAccount) {
        this.paidAccount = paidAccount;
    }

    

    public UserInfo withPaidPassword(String paidPassword) {
        this.paidPassword = paidPassword;
        return this;
    }

    


    /**
     * 付费用户机机密码，用于智慧屏登录
     * @return paidPassword
     */
    public String getPaidPassword() {
        return paidPassword;
    }

    public void setPaidPassword(String paidPassword) {
        this.paidPassword = paidPassword;
    }

    

    public UserInfo withWeLinkUser(Boolean weLinkUser) {
        this.weLinkUser = weLinkUser;
        return this;
    }

    


    /**
     * 标识是否是WeLink用户
     * @return weLinkUser
     */
    public Boolean getWeLinkUser() {
        return weLinkUser;
    }

    public void setWeLinkUser(Boolean weLinkUser) {
        this.weLinkUser = weLinkUser;
    }

    

    public UserInfo withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public UserInfo withTr069Account(String tr069Account) {
        this.tr069Account = tr069Account;
        return this;
    }

    


    /**
     * tr069帐号
     * @return tr069Account
     */
    public String getTr069Account() {
        return tr069Account;
    }

    public void setTr069Account(String tr069Account) {
        this.tr069Account = tr069Account;
    }

    

    public UserInfo withCorpType(Integer corpType) {
        this.corpType = corpType;
        return this;
    }

    


    /**
     * 企业类型。 * 0：企业版 * 1：公共企业，手机、邮箱注册时会放到该企业内 * 2：公共企业，智慧屏用户自动开户时会放到该企业内 * 3：公共企业，大屏用户自动开户时会放到该企业内 * 4：公共TOC消费者企业 * 5：免费版 * 6：专业版 
     * @return corpType
     */
    public Integer getCorpType() {
        return corpType;
    }

    public void setCorpType(Integer corpType) {
        this.corpType = corpType;
    }

    

    public UserInfo withCloudUserId(String cloudUserId) {
        this.cloudUserId = cloudUserId;
        return this;
    }

    


    /**
     * 华为云账号ID
     * @return cloudUserId
     */
    public String getCloudUserId() {
        return cloudUserId;
    }

    public void setCloudUserId(String cloudUserId) {
        this.cloudUserId = cloudUserId;
    }

    

    public UserInfo withGrayUser(Boolean grayUser) {
        this.grayUser = grayUser;
        return this;
    }

    


    /**
     * 标识是否是灰度用户
     * @return grayUser
     */
    public Boolean getGrayUser() {
        return grayUser;
    }

    public void setGrayUser(Boolean grayUser) {
        this.grayUser = grayUser;
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
            Objects.equals(this.nameEn, userInfo.nameEn) &&
            Objects.equals(this.isBindPhone, userInfo.isBindPhone) &&
            Objects.equals(this.freeUser, userInfo.freeUser) &&
            Objects.equals(this.thirdAccount, userInfo.thirdAccount) &&
            Objects.equals(this.visionAccount, userInfo.visionAccount) &&
            Objects.equals(this.headPictureUrl, userInfo.headPictureUrl) &&
            Objects.equals(this.password, userInfo.password) &&
            Objects.equals(this.status, userInfo.status) &&
            Objects.equals(this.paidAccount, userInfo.paidAccount) &&
            Objects.equals(this.paidPassword, userInfo.paidPassword) &&
            Objects.equals(this.weLinkUser, userInfo.weLinkUser) &&
            Objects.equals(this.appId, userInfo.appId) &&
            Objects.equals(this.tr069Account, userInfo.tr069Account) &&
            Objects.equals(this.corpType, userInfo.corpType) &&
            Objects.equals(this.cloudUserId, userInfo.cloudUserId) &&
            Objects.equals(this.grayUser, userInfo.grayUser);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userId, ucloginAccount, serviceAccount, numberHA1, alias1, companyId, spId, companyDomain, realm, userType, adminType, name, nameEn, isBindPhone, freeUser, thirdAccount, visionAccount, headPictureUrl, password, status, paidAccount, paidPassword, weLinkUser, appId, tr069Account, corpType, cloudUserId, grayUser);
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
        sb.append("    isBindPhone: ").append(toIndentedString(isBindPhone)).append("\n");
        sb.append("    freeUser: ").append(toIndentedString(freeUser)).append("\n");
        sb.append("    thirdAccount: ").append(toIndentedString(thirdAccount)).append("\n");
        sb.append("    visionAccount: ").append(toIndentedString(visionAccount)).append("\n");
        sb.append("    headPictureUrl: ").append(toIndentedString(headPictureUrl)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    paidAccount: ").append(toIndentedString(paidAccount)).append("\n");
        sb.append("    paidPassword: ").append(toIndentedString(paidPassword)).append("\n");
        sb.append("    weLinkUser: ").append(toIndentedString(weLinkUser)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    tr069Account: ").append(toIndentedString(tr069Account)).append("\n");
        sb.append("    corpType: ").append(toIndentedString(corpType)).append("\n");
        sb.append("    cloudUserId: ").append(toIndentedString(cloudUserId)).append("\n");
        sb.append("    grayUser: ").append(toIndentedString(grayUser)).append("\n");
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

