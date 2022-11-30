package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.SmnInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SMN返回的发送结果信息
 */
public class SmnResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sent_time")
    
    
    private Long sentTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_notified_history")
    
    
    private List<SmnInfo> smnNotifiedHistory = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_request_id")
    
    
    private String smnRequestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_response_body")
    
    
    private String smnResponseBody;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_response_code")
    
    
    private String smnResponseCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_topic")
    
    
    private String smnTopic;

    public SmnResponse withSentTime(Long sentTime) {
        this.sentTime = sentTime;
        return this;
    }

    


    /**
     * 发送时间。
     * minimum: 0
     * maximum: 9999999999
     * @return sentTime
     */
    public Long getSentTime() {
        return sentTime;
    }

    public void setSentTime(Long sentTime) {
        this.sentTime = sentTime;
    }

    

    public SmnResponse withSmnNotifiedHistory(List<SmnInfo> smnNotifiedHistory) {
        this.smnNotifiedHistory = smnNotifiedHistory;
        return this;
    }

    
    public SmnResponse addSmnNotifiedHistoryItem(SmnInfo smnNotifiedHistoryItem) {
        if(this.smnNotifiedHistory == null) {
            this.smnNotifiedHistory = new ArrayList<>();
        }
        this.smnNotifiedHistory.add(smnNotifiedHistoryItem);
        return this;
    }

    public SmnResponse withSmnNotifiedHistory(Consumer<List<SmnInfo>> smnNotifiedHistorySetter) {
        if(this.smnNotifiedHistory == null) {
            this.smnNotifiedHistory = new ArrayList<>();
        }
        smnNotifiedHistorySetter.accept(this.smnNotifiedHistory);
        return this;
    }

    /**
     * 发送的通知的消息内容。
     * @return smnNotifiedHistory
     */
    public List<SmnInfo> getSmnNotifiedHistory() {
        return smnNotifiedHistory;
    }

    public void setSmnNotifiedHistory(List<SmnInfo> smnNotifiedHistory) {
        this.smnNotifiedHistory = smnNotifiedHistory;
    }

    

    public SmnResponse withSmnRequestId(String smnRequestId) {
        this.smnRequestId = smnRequestId;
        return this;
    }

    


    /**
     * 请求smn服务的请求id。
     * @return smnRequestId
     */
    public String getSmnRequestId() {
        return smnRequestId;
    }

    public void setSmnRequestId(String smnRequestId) {
        this.smnRequestId = smnRequestId;
    }

    

    public SmnResponse withSmnResponseBody(String smnResponseBody) {
        this.smnResponseBody = smnResponseBody;
        return this;
    }

    


    /**
     * 调用smn服务返回的信息。
     * @return smnResponseBody
     */
    public String getSmnResponseBody() {
        return smnResponseBody;
    }

    public void setSmnResponseBody(String smnResponseBody) {
        this.smnResponseBody = smnResponseBody;
    }

    

    public SmnResponse withSmnResponseCode(String smnResponseCode) {
        this.smnResponseCode = smnResponseCode;
        return this;
    }

    


    /**
     * 调用smn服务返回的http状态码。
     * @return smnResponseCode
     */
    public String getSmnResponseCode() {
        return smnResponseCode;
    }

    public void setSmnResponseCode(String smnResponseCode) {
        this.smnResponseCode = smnResponseCode;
    }

    

    public SmnResponse withSmnTopic(String smnTopic) {
        this.smnTopic = smnTopic;
        return this;
    }

    


    /**
     * smn的主题。
     * @return smnTopic
     */
    public String getSmnTopic() {
        return smnTopic;
    }

    public void setSmnTopic(String smnTopic) {
        this.smnTopic = smnTopic;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmnResponse smnResponse = (SmnResponse) o;
        return Objects.equals(this.sentTime, smnResponse.sentTime) &&
            Objects.equals(this.smnNotifiedHistory, smnResponse.smnNotifiedHistory) &&
            Objects.equals(this.smnRequestId, smnResponse.smnRequestId) &&
            Objects.equals(this.smnResponseBody, smnResponse.smnResponseBody) &&
            Objects.equals(this.smnResponseCode, smnResponse.smnResponseCode) &&
            Objects.equals(this.smnTopic, smnResponse.smnTopic);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sentTime, smnNotifiedHistory, smnRequestId, smnResponseBody, smnResponseCode, smnTopic);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmnResponse {\n");
        sb.append("    sentTime: ").append(toIndentedString(sentTime)).append("\n");
        sb.append("    smnNotifiedHistory: ").append(toIndentedString(smnNotifiedHistory)).append("\n");
        sb.append("    smnRequestId: ").append(toIndentedString(smnRequestId)).append("\n");
        sb.append("    smnResponseBody: ").append(toIndentedString(smnResponseBody)).append("\n");
        sb.append("    smnResponseCode: ").append(toIndentedString(smnResponseCode)).append("\n");
        sb.append("    smnTopic: ").append(toIndentedString(smnTopic)).append("\n");
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

