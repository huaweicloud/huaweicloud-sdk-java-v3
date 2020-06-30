package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SlideVerifyCodeCheckDTO
 */
public class SlideVerifyCodeCheckDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private String user;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clientType")
    
    private Integer clientType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checkType")
    
    private Integer checkType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="token")
    
    private String token;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pointX")
    
    private Integer pointX;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slideTime")
    
    private Integer slideTime;

    public SlideVerifyCodeCheckDTO withUser(String user) {
        this.user = user;
        return this;
    }

    


    /**
     * 必须和发送验证码时带的用户身份信息相同 maxLength：255 minLength：1 
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public SlideVerifyCodeCheckDTO withClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }

    


    /**
     * 登录客户端类型。 * 0：Web客户端类型； * 5：cloudlink pc； * 6：cloudlink mobile； * 16：workplace pc； * 18：workplace mobile 
     * minimum: 0
     * maximum: 255
     * @return clientType
     */
    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public SlideVerifyCodeCheckDTO withCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }

    


    /**
     * 校验类型。 * 0：登录； * 1：忘记密码; 默认值：0 
     * @return checkType
     */
    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public SlideVerifyCodeCheckDTO withToken(String token) {
        this.token = token;
        return this;
    }

    


    /**
     * 发送滑块验证码返回的token字符串 maxLength：255 minLength：1 
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public SlideVerifyCodeCheckDTO withPointX(Integer pointX) {
        this.pointX = pointX;
        return this;
    }

    


    /**
     * 抠出图形的X轴坐标。
     * @return pointX
     */
    public Integer getPointX() {
        return pointX;
    }

    public void setPointX(Integer pointX) {
        this.pointX = pointX;
    }

    public SlideVerifyCodeCheckDTO withSlideTime(Integer slideTime) {
        this.slideTime = slideTime;
        return this;
    }

    


    /**
     * 滑动时间，单位ms。
     * @return slideTime
     */
    public Integer getSlideTime() {
        return slideTime;
    }

    public void setSlideTime(Integer slideTime) {
        this.slideTime = slideTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlideVerifyCodeCheckDTO slideVerifyCodeCheckDTO = (SlideVerifyCodeCheckDTO) o;
        return Objects.equals(this.user, slideVerifyCodeCheckDTO.user) &&
            Objects.equals(this.clientType, slideVerifyCodeCheckDTO.clientType) &&
            Objects.equals(this.checkType, slideVerifyCodeCheckDTO.checkType) &&
            Objects.equals(this.token, slideVerifyCodeCheckDTO.token) &&
            Objects.equals(this.pointX, slideVerifyCodeCheckDTO.pointX) &&
            Objects.equals(this.slideTime, slideVerifyCodeCheckDTO.slideTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(user, clientType, checkType, token, pointX, slideTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlideVerifyCodeCheckDTO {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    pointX: ").append(toIndentedString(pointX)).append("\n");
        sb.append("    slideTime: ").append(toIndentedString(slideTime)).append("\n");
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

