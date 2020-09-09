package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.UserInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CheckTokenResponse extends SdkResponse {



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
    @JsonProperty(value="user")
    
    private UserInfo user = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clientType")
    
    private Integer clientType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="forceLoginInd")
    
    private Integer forceLoginInd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firstLogin")
    
    private Boolean firstLogin = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pwdExpired")
    
    private Boolean pwdExpired = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="daysPwdAvailable")
    
    private Integer daysPwdAvailable;

    public CheckTokenResponse withAccessToken(String accessToken) {
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

    public CheckTokenResponse withTokenIp(String tokenIp) {
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

    public CheckTokenResponse withValidPeriod(Long validPeriod) {
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

    public CheckTokenResponse withExpireTime(Long expireTime) {
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

    public CheckTokenResponse withUser(UserInfo user) {
        this.user = user;
        return this;
    }

    public CheckTokenResponse withUser(Consumer<UserInfo> userSetter) {
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

    public CheckTokenResponse withClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }

    


    /**
     * 登录帐号类型。 * 0：Web客户端类型； * 5：cloudlink pc； * 6：cloudlink mobile； * 16：workplace pc 
     * @return clientType
     */
    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public CheckTokenResponse withForceLoginInd(Integer forceLoginInd) {
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

    public CheckTokenResponse withFirstLogin(Boolean firstLogin) {
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

    public CheckTokenResponse withPwdExpired(Boolean pwdExpired) {
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

    public CheckTokenResponse withDaysPwdAvailable(Integer daysPwdAvailable) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckTokenResponse checkTokenResponse = (CheckTokenResponse) o;
        return Objects.equals(this.accessToken, checkTokenResponse.accessToken) &&
            Objects.equals(this.tokenIp, checkTokenResponse.tokenIp) &&
            Objects.equals(this.validPeriod, checkTokenResponse.validPeriod) &&
            Objects.equals(this.expireTime, checkTokenResponse.expireTime) &&
            Objects.equals(this.user, checkTokenResponse.user) &&
            Objects.equals(this.clientType, checkTokenResponse.clientType) &&
            Objects.equals(this.forceLoginInd, checkTokenResponse.forceLoginInd) &&
            Objects.equals(this.firstLogin, checkTokenResponse.firstLogin) &&
            Objects.equals(this.pwdExpired, checkTokenResponse.pwdExpired) &&
            Objects.equals(this.daysPwdAvailable, checkTokenResponse.daysPwdAvailable);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accessToken, tokenIp, validPeriod, expireTime, user, clientType, forceLoginInd, firstLogin, pwdExpired, daysPwdAvailable);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTokenResponse {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    tokenIp: ").append(toIndentedString(tokenIp)).append("\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    forceLoginInd: ").append(toIndentedString(forceLoginInd)).append("\n");
        sb.append("    firstLogin: ").append(toIndentedString(firstLogin)).append("\n");
        sb.append("    pwdExpired: ").append(toIndentedString(pwdExpired)).append("\n");
        sb.append("    daysPwdAvailable: ").append(toIndentedString(daysPwdAvailable)).append("\n");
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

