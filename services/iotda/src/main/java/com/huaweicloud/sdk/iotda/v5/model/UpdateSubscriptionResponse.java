package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.Subject;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateSubscriptionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscription_id")
    
    private String subscriptionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subject")
    
    private Subject subject = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="callbackurl")
    
    private String callbackurl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channel")
    
    private String channel;

    public UpdateSubscriptionResponse withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    


    /**
     * 订阅ID，用于唯一标识一个订阅，在创建订阅时由物联网平台分配获得。
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public UpdateSubscriptionResponse withSubject(Subject subject) {
        this.subject = subject;
        return this;
    }

    public UpdateSubscriptionResponse withSubject(Consumer<Subject> subjectSetter) {
        if(this.subject == null ){
            this.subject = new Subject();
            subjectSetter.accept(this.subject);
        }
        
        return this;
    }


    /**
     * Get subject
     * @return subject
     */
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public UpdateSubscriptionResponse withCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
        return this;
    }

    


    /**
     * 订阅的回调地址，用于接收对应资源事件的通知消息。
     * @return callbackurl
     */
    public String getCallbackurl() {
        return callbackurl;
    }

    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
    }

    public UpdateSubscriptionResponse withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    


    /**
     * 物联网平台推送通知消息时使用的协议通道。使用“http”填充，表示该订阅推送协议通道为http(s)协议。
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSubscriptionResponse updateSubscriptionResponse = (UpdateSubscriptionResponse) o;
        return Objects.equals(this.subscriptionId, updateSubscriptionResponse.subscriptionId) &&
            Objects.equals(this.subject, updateSubscriptionResponse.subject) &&
            Objects.equals(this.callbackurl, updateSubscriptionResponse.callbackurl) &&
            Objects.equals(this.channel, updateSubscriptionResponse.channel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(subscriptionId, subject, callbackurl, channel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSubscriptionResponse {\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    callbackurl: ").append(toIndentedString(callbackurl)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

