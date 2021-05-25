package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.ProxyTokenDTO;
import com.huaweicloud.sdk.meeting.v1.model.UserInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateTokenResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessToken")
    
    private String accessToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tokenIp")
    
    private String tokenIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="validPeriod")
    
    private Long validPeriod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expireTime")
    
    private Long expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="createTime")
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private UserInfo user;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clientType")
    
    private Integer clientType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="forceLoginInd")
    
    private Integer forceLoginInd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firstLogin")
    
    private Boolean firstLogin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pwdExpired")
    
    private Boolean pwdExpired;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="daysPwdAvailable")
    
    private Integer daysPwdAvailable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxyToken")
    
    private ProxyTokenDTO proxyToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delayDelete")
    
    private Boolean delayDelete;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tokenType")
    
    private Integer tokenType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="refreshToken")
    
    private String refreshToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="refreshValidPeriod")
    
    private Long refreshValidPeriod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="refreshExpireTime")
    
    private Long refreshExpireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="refreshCreateTime")
    
    private Long refreshCreateTime;

    public UpdateTokenResponse withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    


    /**
     * 接入token字符串。
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    

    public UpdateTokenResponse withTokenIp(String tokenIp) {
        this.tokenIp = tokenIp;
        return this;
    }

    


    /**
     * 用户IP。
     * @return tokenIp
     */
    public String getTokenIp() {
        return tokenIp;
    }

    public void setTokenIp(String tokenIp) {
        this.tokenIp = tokenIp;
    }

    

    public UpdateTokenResponse withValidPeriod(Long validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }

    


    /**
     * token有效时长，单位：秒。
     * @return validPeriod
     */
    public Long getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(Long validPeriod) {
        this.validPeriod = validPeriod;
    }

    

    public UpdateTokenResponse withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * token的失效时间戳，单位：秒。
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    

    public UpdateTokenResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 业务token的创建时间戳，单位：毫秒。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    

    public UpdateTokenResponse withUser(UserInfo user) {
        this.user = user;
        return this;
    }

    public UpdateTokenResponse withUser(Consumer<UserInfo> userSetter) {
        if(this.user == null ){
            this.user = new UserInfo();
            userSetter.accept(this.user);
        }
        
        return this;
    }


    /**
     * Get user
     * @return user
     */
    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    

    public UpdateTokenResponse withClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }

    


    /**
     * 登录帐号类型。 * 0：Web客户端类型； * 5：cloudlink pc； * 6：cloudlink mobile； * 15：硬终端; * 16：welink pc; * 17：cloudlink 大屏; * 18：welink mobile; * 20：welink 大屏; * 24：cloudlink/welink pad; * 26：智慧屏; * 50：手机客户端; * 51：PAD客户端; * 52：PC客户端; * 53：电视客户端; * 54：大屏客户端。 
     * @return clientType
     */
    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    

    public UpdateTokenResponse withForceLoginInd(Integer forceLoginInd) {
        this.forceLoginInd = forceLoginInd;
        return this;
    }

    


    /**
     * 抢占登录标识 * 0：非抢占 * 1：抢占  未启用 
     * @return forceLoginInd
     */
    public Integer getForceLoginInd() {
        return forceLoginInd;
    }

    public void setForceLoginInd(Integer forceLoginInd) {
        this.forceLoginInd = forceLoginInd;
    }

    

    public UpdateTokenResponse withFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
        return this;
    }

    


    /**
     * 是否首次登录（说明：首次登录表示尚未修改过密码。首次登录时，系统会提醒用户需要修改密码），默认值：false。
     * @return firstLogin
     */
    public Boolean getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    

    public UpdateTokenResponse withPwdExpired(Boolean pwdExpired) {
        this.pwdExpired = pwdExpired;
        return this;
    }

    


    /**
     * 密码是否过期，默认值：false。
     * @return pwdExpired
     */
    public Boolean getPwdExpired() {
        return pwdExpired;
    }

    public void setPwdExpired(Boolean pwdExpired) {
        this.pwdExpired = pwdExpired;
    }

    

    public UpdateTokenResponse withDaysPwdAvailable(Integer daysPwdAvailable) {
        this.daysPwdAvailable = daysPwdAvailable;
        return this;
    }

    


    /**
     * 密码有效天数
     * @return daysPwdAvailable
     */
    public Integer getDaysPwdAvailable() {
        return daysPwdAvailable;
    }

    public void setDaysPwdAvailable(Integer daysPwdAvailable) {
        this.daysPwdAvailable = daysPwdAvailable;
    }

    

    public UpdateTokenResponse withProxyToken(ProxyTokenDTO proxyToken) {
        this.proxyToken = proxyToken;
        return this;
    }

    public UpdateTokenResponse withProxyToken(Consumer<ProxyTokenDTO> proxyTokenSetter) {
        if(this.proxyToken == null ){
            this.proxyToken = new ProxyTokenDTO();
            proxyTokenSetter.accept(this.proxyToken);
        }
        
        return this;
    }


    /**
     * Get proxyToken
     * @return proxyToken
     */
    public ProxyTokenDTO getProxyToken() {
        return proxyToken;
    }

    public void setProxyToken(ProxyTokenDTO proxyToken) {
        this.proxyToken = proxyToken;
    }

    

    public UpdateTokenResponse withDelayDelete(Boolean delayDelete) {
        this.delayDelete = delayDelete;
        return this;
    }

    


    /**
     * 是否延时删除状态
     * @return delayDelete
     */
    public Boolean getDelayDelete() {
        return delayDelete;
    }

    public void setDelayDelete(Boolean delayDelete) {
        this.delayDelete = delayDelete;
    }

    

    public UpdateTokenResponse withTokenType(Integer tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    


    /**
     * token类型 * 0：用户ACCESS TOKEN； * 1：会控TOKEN * 2：一次性TOKEN 
     * @return tokenType
     */
    public Integer getTokenType() {
        return tokenType;
    }

    public void setTokenType(Integer tokenType) {
        this.tokenType = tokenType;
    }

    

    public UpdateTokenResponse withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    


    /**
     * 刷新token字符串。
     * @return refreshToken
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    

    public UpdateTokenResponse withRefreshValidPeriod(Long refreshValidPeriod) {
        this.refreshValidPeriod = refreshValidPeriod;
        return this;
    }

    


    /**
     * 刷新token有效时长，单位：秒。
     * @return refreshValidPeriod
     */
    public Long getRefreshValidPeriod() {
        return refreshValidPeriod;
    }

    public void setRefreshValidPeriod(Long refreshValidPeriod) {
        this.refreshValidPeriod = refreshValidPeriod;
    }

    

    public UpdateTokenResponse withRefreshExpireTime(Long refreshExpireTime) {
        this.refreshExpireTime = refreshExpireTime;
        return this;
    }

    


    /**
     * 刷新token的失效时间戳，单位：秒。
     * @return refreshExpireTime
     */
    public Long getRefreshExpireTime() {
        return refreshExpireTime;
    }

    public void setRefreshExpireTime(Long refreshExpireTime) {
        this.refreshExpireTime = refreshExpireTime;
    }

    

    public UpdateTokenResponse withRefreshCreateTime(Long refreshCreateTime) {
        this.refreshCreateTime = refreshCreateTime;
        return this;
    }

    


    /**
     * 刷新token的创建时间戳，单位：毫秒。
     * @return refreshCreateTime
     */
    public Long getRefreshCreateTime() {
        return refreshCreateTime;
    }

    public void setRefreshCreateTime(Long refreshCreateTime) {
        this.refreshCreateTime = refreshCreateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTokenResponse updateTokenResponse = (UpdateTokenResponse) o;
        return Objects.equals(this.accessToken, updateTokenResponse.accessToken) &&
            Objects.equals(this.tokenIp, updateTokenResponse.tokenIp) &&
            Objects.equals(this.validPeriod, updateTokenResponse.validPeriod) &&
            Objects.equals(this.expireTime, updateTokenResponse.expireTime) &&
            Objects.equals(this.createTime, updateTokenResponse.createTime) &&
            Objects.equals(this.user, updateTokenResponse.user) &&
            Objects.equals(this.clientType, updateTokenResponse.clientType) &&
            Objects.equals(this.forceLoginInd, updateTokenResponse.forceLoginInd) &&
            Objects.equals(this.firstLogin, updateTokenResponse.firstLogin) &&
            Objects.equals(this.pwdExpired, updateTokenResponse.pwdExpired) &&
            Objects.equals(this.daysPwdAvailable, updateTokenResponse.daysPwdAvailable) &&
            Objects.equals(this.proxyToken, updateTokenResponse.proxyToken) &&
            Objects.equals(this.delayDelete, updateTokenResponse.delayDelete) &&
            Objects.equals(this.tokenType, updateTokenResponse.tokenType) &&
            Objects.equals(this.refreshToken, updateTokenResponse.refreshToken) &&
            Objects.equals(this.refreshValidPeriod, updateTokenResponse.refreshValidPeriod) &&
            Objects.equals(this.refreshExpireTime, updateTokenResponse.refreshExpireTime) &&
            Objects.equals(this.refreshCreateTime, updateTokenResponse.refreshCreateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accessToken, tokenIp, validPeriod, expireTime, createTime, user, clientType, forceLoginInd, firstLogin, pwdExpired, daysPwdAvailable, proxyToken, delayDelete, tokenType, refreshToken, refreshValidPeriod, refreshExpireTime, refreshCreateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTokenResponse {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    tokenIp: ").append(toIndentedString(tokenIp)).append("\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    forceLoginInd: ").append(toIndentedString(forceLoginInd)).append("\n");
        sb.append("    firstLogin: ").append(toIndentedString(firstLogin)).append("\n");
        sb.append("    pwdExpired: ").append(toIndentedString(pwdExpired)).append("\n");
        sb.append("    daysPwdAvailable: ").append(toIndentedString(daysPwdAvailable)).append("\n");
        sb.append("    proxyToken: ").append(toIndentedString(proxyToken)).append("\n");
        sb.append("    delayDelete: ").append(toIndentedString(delayDelete)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
        sb.append("    refreshValidPeriod: ").append(toIndentedString(refreshValidPeriod)).append("\n");
        sb.append("    refreshExpireTime: ").append(toIndentedString(refreshExpireTime)).append("\n");
        sb.append("    refreshCreateTime: ").append(toIndentedString(refreshCreateTime)).append("\n");
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

