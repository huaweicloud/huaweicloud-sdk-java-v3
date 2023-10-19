package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户相关信息。
 */
public class VpsServiceReqPayloadUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpsMode")

    private String vpsMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpsType")

    private String vpsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requestType")

    private Integer requestType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    public VpsServiceReqPayloadUser withVpsMode(String vpsMode) {
        this.vpsMode = vpsMode;
        return this;
    }

    /**
     * vps的运行模式，目前支持FullMode。
     * @return vpsMode
     */
    public String getVpsMode() {
        return vpsMode;
    }

    public void setVpsMode(String vpsMode) {
        this.vpsMode = vpsMode;
    }

    public VpsServiceReqPayloadUser withVpsType(String vpsType) {
        this.vpsType = vpsType;
        return this;
    }

    /**
     * vps的定位方法，目前支持GVPS。
     * @return vpsType
     */
    public String getVpsType() {
        return vpsType;
    }

    public void setVpsType(String vpsType) {
        this.vpsType = vpsType;
    }

    public VpsServiceReqPayloadUser withRequestType(Integer requestType) {
        this.requestType = requestType;
        return this;
    }

    /**
     * 请求的设备类型。 - 0：安卓手机 - 1：IOS手机 - 2：安卓web端 - 3：IOS web端 - 4：AR眼镜
     * @return requestType
     */
    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public VpsServiceReqPayloadUser withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * base64编码的图片信息。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpsServiceReqPayloadUser that = (VpsServiceReqPayloadUser) obj;
        return Objects.equals(this.vpsMode, that.vpsMode) && Objects.equals(this.vpsType, that.vpsType)
            && Objects.equals(this.requestType, that.requestType) && Objects.equals(this.image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpsMode, vpsType, requestType, image);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpsServiceReqPayloadUser {\n");
        sb.append("    vpsMode: ").append(toIndentedString(vpsMode)).append("\n");
        sb.append("    vpsType: ").append(toIndentedString(vpsType)).append("\n");
        sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
