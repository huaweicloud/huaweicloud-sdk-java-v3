package com.huaweicloud.sdk.nlp.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.EventExtractionResponseItem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunEventExtractionResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="events")
    
    private List<EventExtractionResponseItem> events = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    

    private String errorMsg;

    public RunEventExtractionResponse withEvents(List<EventExtractionResponseItem> events) {
        this.events = events;
        return this;
    }

    
    public RunEventExtractionResponse addEventsItem(EventExtractionResponseItem eventsItem) {
        if(this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public RunEventExtractionResponse withEvents(Consumer<List<EventExtractionResponseItem>> eventsSetter) {
        if(this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 事件抽取结果。调用失败时无此字段。
     * @return events
     */
    public List<EventExtractionResponseItem> getEvents() {
        return events;
    }

    public void setEvents(List<EventExtractionResponseItem> events) {
        this.events = events;
    }

    

    public RunEventExtractionResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 调用失败时的错误码，具体请参见错误码。调用成功时无此字段。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public RunEventExtractionResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 调用失败时的错误信息。调用成功时无此字段。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunEventExtractionResponse runEventExtractionResponse = (RunEventExtractionResponse) o;
        return Objects.equals(this.events, runEventExtractionResponse.events) &&
            Objects.equals(this.errorCode, runEventExtractionResponse.errorCode) &&
            Objects.equals(this.errorMsg, runEventExtractionResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(events, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunEventExtractionResponse {\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

