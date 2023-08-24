package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回调地址请求体。
 */
public class AddCallbackRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_type")

    private Integer urlType;

    public AddCallbackRequestBody withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * 回调地址。  > - 必须http或https开头，建议使用https > - 支持域名或公网IP回调地址，不支持私网IP回调地址 
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public AddCallbackRequestBody withUrlType(Integer urlType) {
        this.urlType = urlType;
        return this;
    }

    /**
     * 回调类型。  - 0：智能信息单条发送回调 - 1：模板状态回调 - 2：智能信息批量发送回调 
     * @return urlType
     */
    public Integer getUrlType() {
        return urlType;
    }

    public void setUrlType(Integer urlType) {
        this.urlType = urlType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddCallbackRequestBody that = (AddCallbackRequestBody) obj;
        return Objects.equals(this.callbackUrl, that.callbackUrl) && Objects.equals(this.urlType, that.urlType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callbackUrl, urlType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddCallbackRequestBody {\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    urlType: ").append(toIndentedString(urlType)).append("\n");
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
