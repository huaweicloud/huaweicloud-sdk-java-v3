package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会议推送参数配置请求。
 */
public class WebHookConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corpId")

    private String corpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spId")

    private String spId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriberId")

    private String subscriberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriberKey")

    private String subscriberKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public WebHookConfigRequest withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    /**
     * 企业ID。按企业注册回调时需要填写。
     * @return corpId
     */
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public WebHookConfigRequest withSpId(String spId) {
        this.spId = spId;
        return this;
    }

    /**
     * SP ID。多租户场景下，按SP注册回调时需要填写。
     * @return spId
     */
    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public WebHookConfigRequest withSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
        return this;
    }

    /**
     * 订阅者ID。
     * @return subscriberId
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public WebHookConfigRequest withSubscriberKey(String subscriberKey) {
        this.subscriberKey = subscriberKey;
        return this;
    }

    /**
     * 订阅者秘钥。
     * @return subscriberKey
     */
    public String getSubscriberKey() {
        return subscriberKey;
    }

    public void setSubscriberKey(String subscriberKey) {
        this.subscriberKey = subscriberKey;
    }

    public WebHookConfigRequest withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 订阅url。 > 必须使用HTTPS。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebHookConfigRequest that = (WebHookConfigRequest) obj;
        return Objects.equals(this.corpId, that.corpId) && Objects.equals(this.spId, that.spId)
            && Objects.equals(this.subscriberId, that.subscriberId)
            && Objects.equals(this.subscriberKey, that.subscriberKey) && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corpId, spId, subscriberId, subscriberKey, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebHookConfigRequest {\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    spId: ").append(toIndentedString(spId)).append("\n");
        sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
        sb.append("    subscriberKey: ").append(toIndentedString(subscriberKey)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
