package com.huaweicloud.sdk.dli.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dli.v1.model.ListQueuesRespQueues;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListQueuesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_success")
    
    private Boolean isSuccess;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queues")
    
    private List<ListQueuesRespQueues> queues = null;
    
    public ListQueuesResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    


    /**
     * 请求执行是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    

    public ListQueuesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    

    public ListQueuesResponse withQueues(List<ListQueuesRespQueues> queues) {
        this.queues = queues;
        return this;
    }

    
    public ListQueuesResponse addQueuesItem(ListQueuesRespQueues queuesItem) {
        if(this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public ListQueuesResponse withQueues(Consumer<List<ListQueuesRespQueues>> queuesSetter) {
        if(this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * 队列信息。
     * @return queues
     */
    public List<ListQueuesRespQueues> getQueues() {
        return queues;
    }

    public void setQueues(List<ListQueuesRespQueues> queues) {
        this.queues = queues;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQueuesResponse listQueuesResponse = (ListQueuesResponse) o;
        return Objects.equals(this.isSuccess, listQueuesResponse.isSuccess) &&
            Objects.equals(this.message, listQueuesResponse.message) &&
            Objects.equals(this.queues, listQueuesResponse.queues);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, queues);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueuesResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
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

