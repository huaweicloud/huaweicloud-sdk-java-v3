package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 子画面信息
 */
public class SubscriberInPic  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="index")
    
    private Integer index;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscriber")
    
    private List<String> subscriber = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isAssistStream")
    
    private Integer isAssistStream;

    public SubscriberInPic withIndex(Integer index) {
        this.index = index;
        return this;
    }

    


    /**
     * 多画面中每个画面的编号。编号从1开始。 默认值为1。
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    

    public SubscriberInPic withSubscriber(List<String> subscriber) {
        this.subscriber = subscriber;
        return this;
    }

    
    public SubscriberInPic addSubscriberItem(String subscriberItem) {
        if(this.subscriber == null) {
            this.subscriber = new ArrayList<>();
        }
        this.subscriber.add(subscriberItem);
        return this;
    }

    public SubscriberInPic withSubscriber(Consumer<List<String>> subscriberSetter) {
        if(this.subscriber == null) {
            this.subscriber = new ArrayList<>();
        }
        subscriberSetter.accept(this.subscriber);
        return this;
    }

    /**
     * 每个画面中与会者标识列表。
     * @return subscriber
     */
    public List<String> getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(List<String> subscriber) {
        this.subscriber = subscriber;
    }

    

    public SubscriberInPic withIsAssistStream(Integer isAssistStream) {
        this.isAssistStream = isAssistStream;
        return this;
    }

    


    /**
     * 是否为辅流。默认值为0。 - 0: 不是辅流。 - 1: 是辅流。
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
        SubscriberInPic subscriberInPic = (SubscriberInPic) o;
        return Objects.equals(this.index, subscriberInPic.index) &&
            Objects.equals(this.subscriber, subscriberInPic.subscriber) &&
            Objects.equals(this.isAssistStream, subscriberInPic.isAssistStream);
    }
    @Override
    public int hashCode() {
        return Objects.hash(index, subscriber, isAssistStream);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriberInPic {\n");
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

