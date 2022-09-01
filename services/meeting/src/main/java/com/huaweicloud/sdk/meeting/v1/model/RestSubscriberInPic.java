package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 子画面信息
 */
public class RestSubscriberInPic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    @JacksonXmlProperty(localName = "index")

    private Integer index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriber")

    @JacksonXmlProperty(localName = "subscriber")

    private List<String> subscriber = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAssistStream")

    @JacksonXmlProperty(localName = "isAssistStream")

    private Integer isAssistStream;

    public RestSubscriberInPic withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 多画面中每个画面的编号，编号从1开始
     * minimum: 1
     * maximum: 16
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public RestSubscriberInPic withSubscriber(List<String> subscriber) {
        this.subscriber = subscriber;
        return this;
    }

    public RestSubscriberInPic addSubscriberItem(String subscriberItem) {
        if (this.subscriber == null) {
            this.subscriber = new ArrayList<>();
        }
        this.subscriber.add(subscriberItem);
        return this;
    }

    public RestSubscriberInPic withSubscriber(Consumer<List<String>> subscriberSetter) {
        if (this.subscriber == null) {
            this.subscriber = new ArrayList<>();
        }
        subscriberSetter.accept(this.subscriber);
        return this;
    }

    /**
     * 每个画面中会话标识，即Call_ID，通过会议状态通知获取
     * @return subscriber
     */
    public List<String> getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(List<String> subscriber) {
        this.subscriber = subscriber;
    }

    public RestSubscriberInPic withIsAssistStream(Integer isAssistStream) {
        this.isAssistStream = isAssistStream;
        return this;
    }

    /**
     * 是否为辅流 0： 不是辅流 1： 是辅流
     * minimum: 0
     * maximum: 1
     * @return isAssistStream
     */
    public Integer getIsAssistStream() {
        return isAssistStream;
    }

    public void setIsAssistStream(Integer isAssistStream) {
        this.isAssistStream = isAssistStream;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestSubscriberInPic restSubscriberInPic = (RestSubscriberInPic) o;
        return Objects.equals(this.index, restSubscriberInPic.index)
            && Objects.equals(this.subscriber, restSubscriberInPic.subscriber)
            && Objects.equals(this.isAssistStream, restSubscriberInPic.isAssistStream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, subscriber, isAssistStream);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestSubscriberInPic {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
        sb.append("    isAssistStream: ").append(toIndentedString(isAssistStream)).append("\n");
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
