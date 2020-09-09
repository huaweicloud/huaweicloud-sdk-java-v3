package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 下发的消息响应结果
 */
public class MessageResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private String createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="finished_time")
    
    private String finishedTime;

    public MessageResult withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 消息状态, PENDING，DELIVERED，FAILED和TIMEOUT。如果设备不在线，则平台缓存消息，并且返回PENDING，等设备数据上报之后再下发；如果设备在线，则消息直接进行下发，下发成功后接口返回DELIVERED，失败返回FAILED；如果消息在平台默认时间内（1天）还没有下发给设备，则平台会将消息设置为超时，状态为TIMEOUT。另外应用可以订阅消息的执行结果，平台会将消息结果推送给订阅的应用。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MessageResult withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 消息的创建时间，\"yyyyMMdd'T'HHmmss'Z'\"格式的UTC字符串。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public MessageResult withFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    


    /**
     * 消息结束时间, \"yyyyMMdd'T'HHmmss'Z'\"格式的UTC字符串，包含消息转换到DELIVERED，FAILED和TIMEOUT状态的时间。
     * @return finishedTime
     */
    public String getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageResult messageResult = (MessageResult) o;
        return Objects.equals(this.status, messageResult.status) &&
            Objects.equals(this.createdTime, messageResult.createdTime) &&
            Objects.equals(this.finishedTime, messageResult.finishedTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, createdTime, finishedTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageResult {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    finishedTime: ").append(toIndentedString(finishedTime)).append("\n");
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

