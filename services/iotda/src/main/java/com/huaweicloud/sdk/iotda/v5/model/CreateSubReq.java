package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.Subject;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建订阅请求结构体
 */
public class CreateSubReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subject")
    
    private Subject subject;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="callbackurl")
    
    private String callbackurl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channel")
    
    private String channel;

    public CreateSubReq withSubject(Subject subject) {
        this.subject = subject;
        return this;
    }

    public CreateSubReq withSubject(Consumer<Subject> subjectSetter) {
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

    

    public CreateSubReq withCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
        return this;
    }

    


    /**
     * 订阅的回调地址，用于接收对应资源事件的通知消息，例如：https://10.10.10.10:443/callbackurltest。
     * @return callbackurl
     */
    public String getCallbackurl() {
        return callbackurl;
    }

    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
    }

    

    public CreateSubReq withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定订阅哪个资源空间下的消息通知，否则订阅的消息通知将会归属到[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public CreateSubReq withChannel(String channel) {
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
        CreateSubReq createSubReq = (CreateSubReq) o;
        return Objects.equals(this.subject, createSubReq.subject) &&
            Objects.equals(this.callbackurl, createSubReq.callbackurl) &&
            Objects.equals(this.appId, createSubReq.appId) &&
            Objects.equals(this.channel, createSubReq.channel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(subject, callbackurl, appId, channel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubReq {\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    callbackurl: ").append(toIndentedString(callbackurl)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

