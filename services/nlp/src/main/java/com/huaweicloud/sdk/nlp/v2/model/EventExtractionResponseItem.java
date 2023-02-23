package com.huaweicloud.sdk.nlp.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.EventExtractionResponseItemArgument;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * events数据结构
 */
public class EventExtractionResponseItem  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="argument")
    
    private List<EventExtractionResponseItemArgument> argument = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_trigger")
    

    private String eventTrigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_type")
    

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_span")
    
    private List<Integer> triggerSpan = null;
    
    public EventExtractionResponseItem withArgument(List<EventExtractionResponseItemArgument> argument) {
        this.argument = argument;
        return this;
    }

    
    public EventExtractionResponseItem addArgumentItem(EventExtractionResponseItemArgument argumentItem) {
        if(this.argument == null) {
            this.argument = new ArrayList<>();
        }
        this.argument.add(argumentItem);
        return this;
    }

    public EventExtractionResponseItem withArgument(Consumer<List<EventExtractionResponseItemArgument>> argumentSetter) {
        if(this.argument == null) {
            this.argument = new ArrayList<>();
        }
        argumentSetter.accept(this.argument);
        return this;
    }

    /**
     * 事件元素列表。
     * @return argument
     */
    public List<EventExtractionResponseItemArgument> getArgument() {
        return argument;
    }

    public void setArgument(List<EventExtractionResponseItemArgument> argument) {
        this.argument = argument;
    }

    

    public EventExtractionResponseItem withEventTrigger(String eventTrigger) {
        this.eventTrigger = eventTrigger;
        return this;
    }

    


    /**
     * 事件触发词。触发词是事件描述中最能代表事件发生的词汇，决定事件类别的重要特征。
     * @return eventTrigger
     */
    public String getEventTrigger() {
        return eventTrigger;
    }

    public void setEventTrigger(String eventTrigger) {
        this.eventTrigger = eventTrigger;
    }

    

    public EventExtractionResponseItem withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    


    /**
     * 事件类型。
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    

    public EventExtractionResponseItem withTriggerSpan(List<Integer> triggerSpan) {
        this.triggerSpan = triggerSpan;
        return this;
    }

    
    public EventExtractionResponseItem addTriggerSpanItem(Integer triggerSpanItem) {
        if(this.triggerSpan == null) {
            this.triggerSpan = new ArrayList<>();
        }
        this.triggerSpan.add(triggerSpanItem);
        return this;
    }

    public EventExtractionResponseItem withTriggerSpan(Consumer<List<Integer>> triggerSpanSetter) {
        if(this.triggerSpan == null) {
            this.triggerSpan = new ArrayList<>();
        }
        triggerSpanSetter.accept(this.triggerSpan);
        return this;
    }

    /**
     * 事件触发词在待分析文本中的起始和终止位置。
     * @return triggerSpan
     */
    public List<Integer> getTriggerSpan() {
        return triggerSpan;
    }

    public void setTriggerSpan(List<Integer> triggerSpan) {
        this.triggerSpan = triggerSpan;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventExtractionResponseItem eventExtractionResponseItem = (EventExtractionResponseItem) o;
        return Objects.equals(this.argument, eventExtractionResponseItem.argument) &&
            Objects.equals(this.eventTrigger, eventExtractionResponseItem.eventTrigger) &&
            Objects.equals(this.eventType, eventExtractionResponseItem.eventType) &&
            Objects.equals(this.triggerSpan, eventExtractionResponseItem.triggerSpan);
    }
    @Override
    public int hashCode() {
        return Objects.hash(argument, eventTrigger, eventType, triggerSpan);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventExtractionResponseItem {\n");
        sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
        sb.append("    eventTrigger: ").append(toIndentedString(eventTrigger)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    triggerSpan: ").append(toIndentedString(triggerSpan)).append("\n");
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

