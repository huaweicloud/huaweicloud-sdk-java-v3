package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SlideVerifyCodeSendDTO
 */
public class SlideVerifyCodeSendDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private String user;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clientType")
    
    private Integer clientType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checkType")
    
    private Integer checkType;

    public SlideVerifyCodeSendDTO withUser(String user) {
        this.user = user;
        return this;
    }

    


    /**
     * 用户身份信息（手机号码或邮箱账号或用户真实账号） maxLength：255 minLength：1 
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public SlideVerifyCodeSendDTO withClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }

    


    /**
     * 登录客户端类型。 * 0：Web客户端类型； * 5：cloudlink pc； * 6：cloudlink mobile； * 16：workplace pc 
     * @return clientType
     */
    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public SlideVerifyCodeSendDTO withCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }

    


    /**
     * 校验类型。 * 0：登录； * 1：忘记密码； 默认值：0 
     * @return checkType
     */
    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlideVerifyCodeSendDTO slideVerifyCodeSendDTO = (SlideVerifyCodeSendDTO) o;
        return Objects.equals(this.user, slideVerifyCodeSendDTO.user) &&
            Objects.equals(this.clientType, slideVerifyCodeSendDTO.clientType) &&
            Objects.equals(this.checkType, slideVerifyCodeSendDTO.checkType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(user, clientType, checkType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlideVerifyCodeSendDTO {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
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

