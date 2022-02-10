package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowWebHookConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnCode")

    private Integer returnCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnDesc")

    private String returnDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriberId")

    private String subscriberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ShowWebHookConfigResponse withReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    /** 结果码 minimum: 0 maximum: 2147483647
     * 
     * @return returnCode */
    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public ShowWebHookConfigResponse withReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
        return this;
    }

    /** 结果描述
     * 
     * @return returnDesc */
    public String getReturnDesc() {
        return returnDesc;
    }

    public void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
    }

    public ShowWebHookConfigResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 配置记录id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowWebHookConfigResponse withSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
        return this;
    }

    /** 订阅ID
     * 
     * @return subscriberId */
    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public ShowWebHookConfigResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 订阅url
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowWebHookConfigResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 连接状态： 0表示已启用 ；1表示未启动； 2表示已锁定
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowWebHookConfigResponse showWebHookConfigResponse = (ShowWebHookConfigResponse) o;
        return Objects.equals(this.returnCode, showWebHookConfigResponse.returnCode)
            && Objects.equals(this.returnDesc, showWebHookConfigResponse.returnDesc)
            && Objects.equals(this.id, showWebHookConfigResponse.id)
            && Objects.equals(this.subscriberId, showWebHookConfigResponse.subscriberId)
            && Objects.equals(this.url, showWebHookConfigResponse.url)
            && Objects.equals(this.status, showWebHookConfigResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnCode, returnDesc, id, subscriberId, url, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWebHookConfigResponse {\n");
        sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
        sb.append("    returnDesc: ").append(toIndentedString(returnDesc)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
