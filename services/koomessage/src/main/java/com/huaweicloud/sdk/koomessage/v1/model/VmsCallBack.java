package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回执接口。
 */
public class VmsCallBack {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_type")

    private Integer urlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    public VmsCallBack withUrlType(Integer urlType) {
        this.urlType = urlType;
        return this;
    }

    /**
     * 回调类型。  - 0：发送状态回执 - 1：上行消息回执 
     * @return urlType
     */
    public Integer getUrlType() {
        return urlType;
    }

    public void setUrlType(Integer urlType) {
        this.urlType = urlType;
    }

    public VmsCallBack withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * 回调地址。
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public VmsCallBack withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmsCallBack vmsCallBack = (VmsCallBack) o;
        return Objects.equals(this.urlType, vmsCallBack.urlType)
            && Objects.equals(this.callbackUrl, vmsCallBack.callbackUrl)
            && Objects.equals(this.remark, vmsCallBack.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlType, callbackUrl, remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmsCallBack {\n");
        sb.append("    urlType: ").append(toIndentedString(urlType)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
