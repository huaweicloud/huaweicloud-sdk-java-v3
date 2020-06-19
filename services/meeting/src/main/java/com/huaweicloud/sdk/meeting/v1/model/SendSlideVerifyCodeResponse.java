package com.huaweicloud.sdk.meeting.v1.model;


import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class SendSlideVerifyCodeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="shadowImage")
    
    private String shadowImage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cutImage")
    
    private String cutImage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pointY")
    
    private Integer pointY;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="token")
    
    private String token;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire")
    
    private Integer expire;

    public SendSlideVerifyCodeResponse withShadowImage(String shadowImage) {
        this.shadowImage = shadowImage;
        return this;
    }

    


    /**
     * 抠出图形后的原背景图。通过“data:url”方式来定义图片。
     * @return shadowImage
     */
    public String getShadowImage() {
        return shadowImage;
    }

    public void setShadowImage(String shadowImage) {
        this.shadowImage = shadowImage;
    }

    public SendSlideVerifyCodeResponse withCutImage(String cutImage) {
        this.cutImage = cutImage;
        return this;
    }

    


    /**
     * 抠出的图形。
     * @return cutImage
     */
    public String getCutImage() {
        return cutImage;
    }

    public void setCutImage(String cutImage) {
        this.cutImage = cutImage;
    }

    public SendSlideVerifyCodeResponse withPointY(Integer pointY) {
        this.pointY = pointY;
        return this;
    }

    


    /**
     * 抠出图形的Y轴座标。
     * @return pointY
     */
    public Integer getPointY() {
        return pointY;
    }

    public void setPointY(Integer pointY) {
        this.pointY = pointY;
    }

    public SendSlideVerifyCodeResponse withToken(String token) {
        this.token = token;
        return this;
    }

    


    /**
     * 验证码token字符串。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public SendSlideVerifyCodeResponse withExpire(Integer expire) {
        this.expire = expire;
        return this;
    }

    


    /**
     * 验证码有效时间，单位：秒。
     * @return expire
     */
    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendSlideVerifyCodeResponse sendSlideVerifyCodeResponse = (SendSlideVerifyCodeResponse) o;
        return Objects.equals(this.shadowImage, sendSlideVerifyCodeResponse.shadowImage) &&
            Objects.equals(this.cutImage, sendSlideVerifyCodeResponse.cutImage) &&
            Objects.equals(this.pointY, sendSlideVerifyCodeResponse.pointY) &&
            Objects.equals(this.token, sendSlideVerifyCodeResponse.token) &&
            Objects.equals(this.expire, sendSlideVerifyCodeResponse.expire);
    }
    @Override
    public int hashCode() {
        return Objects.hash(shadowImage, cutImage, pointY, token, expire);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendSlideVerifyCodeResponse {\n");
        sb.append("    shadowImage: ").append(toIndentedString(shadowImage)).append("\n");
        sb.append("    cutImage: ").append(toIndentedString(cutImage)).append("\n");
        sb.append("    pointY: ").append(toIndentedString(pointY)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
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

