package com.huaweicloud.sdk.dms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SendMessagesRespMessages
 */
public class SendMessagesRespMessages  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error")
    
    private String error;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private Integer errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    private Integer state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;

    public SendMessagesRespMessages withError(String error) {
        this.error = error;
        return this;
    }

    


    /**
     * 错误描述信息。
     * @return error
     */
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public SendMessagesRespMessages withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 错误码。
     * @return errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public SendMessagesRespMessages withState(Integer state) {
        this.state = state;
        return this;
    }

    


    /**
     * 发送消息的状态。 0：表示发送成功。 1：表示发送失败，失败原因参考对应的error和error_code。 
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public SendMessagesRespMessages withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 消息ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendMessagesRespMessages sendMessagesRespMessages = (SendMessagesRespMessages) o;
        return Objects.equals(this.error, sendMessagesRespMessages.error) &&
            Objects.equals(this.errorCode, sendMessagesRespMessages.errorCode) &&
            Objects.equals(this.state, sendMessagesRespMessages.state) &&
            Objects.equals(this.id, sendMessagesRespMessages.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(error, errorCode, state, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendMessagesRespMessages {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

