package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddSubscriptionRequestBody
 */
public class AddSubscriptionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension")

    private SubscriptionExtension extension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptions")

    private List<BatchAddSubscriptionsRequestBody> subscriptions = null;

    public AddSubscriptionRequestBody withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 不同协议对应不同的endpoint（接受消息的接入点）。 目前支持的协议包括：  “email”：邮件传输协议，endpoint为邮箱地址。  “sms”：短信传输协议，endpoint为手机号码。  “functionstage”：FunctionGraph（函数）传输协议，endpoint为一个函数。  “functiongraph”：FunctionGraph（工作流）传输协议，endpoint为由一组函数编排成的工作流。  “http”、“https”：HTTP/HTTPS传输协议，endpoint为URL。  “callnotify”：语音通知传输协议，endpoint为手机号码。  “wechat”：微信群机器人传输协议。  “dingding”：钉钉群机器人传输协议。  “feishu”：飞书群机器人传输协议。  “welink”：welink群机器人传输协议。  “dingTalkBot”：个人钉钉传输协议。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public AddSubscriptionRequestBody withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 说明：  http协议，接入点必须以“http://”开头。  https协议，接入点必须以“https://”开头。  email协议，接入点必须是邮件地址。  sms协议，接入点必须是一个电话号码。  functionstage协议，接入点必须是一个函数。  functiongraph协议，接入点必须是一个函数工作流。  callnotify协议，接入点必须是一个电话号码。  dingding协议，接入点必须是一个钉钉自定义群机器人的地址，或添加了钉钉企业内部机器人的群组openConversationId。添加钉钉企业内部机器人对应的群组openConversationId时，该字段不能以“http://”或“https://”为开头。  wechat协议，接入点必须是一个微信群机器人的地址。  feishu协议，接入点必须是一个飞书群机器人的地址。  welink协议，接入点必须是一个welink的群号。  dingTalkBot协议，接入点必须是一个钉钉企业用户的userId。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public AddSubscriptionRequestBody withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注。最大支持128字节，约42个中文，必须是UTF-8编码的字符串，否则无法正常显示中文。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public AddSubscriptionRequestBody withExtension(SubscriptionExtension extension) {
        this.extension = extension;
        return this;
    }

    public AddSubscriptionRequestBody withExtension(Consumer<SubscriptionExtension> extensionSetter) {
        if (this.extension == null) {
            this.extension = new SubscriptionExtension();
            extensionSetter.accept(this.extension);
        }

        return this;
    }

    /**
     * Get extension
     * @return extension
     */
    public SubscriptionExtension getExtension() {
        return extension;
    }

    public void setExtension(SubscriptionExtension extension) {
        this.extension = extension;
    }

    public AddSubscriptionRequestBody withSubscriptions(List<BatchAddSubscriptionsRequestBody> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public AddSubscriptionRequestBody addSubscriptionsItem(BatchAddSubscriptionsRequestBody subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public AddSubscriptionRequestBody withSubscriptions(
        Consumer<List<BatchAddSubscriptionsRequestBody>> subscriptionsSetter) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * 当需要批量创建订阅时，需要传入该字段。SMN支持一次最多创建50个订阅。
     * @return subscriptions
     */
    public List<BatchAddSubscriptionsRequestBody> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<BatchAddSubscriptionsRequestBody> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddSubscriptionRequestBody that = (AddSubscriptionRequestBody) obj;
        return Objects.equals(this.protocol, that.protocol) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.remark, that.remark) && Objects.equals(this.extension, that.extension)
            && Objects.equals(this.subscriptions, that.subscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, endpoint, remark, extension, subscriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSubscriptionRequestBody {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
