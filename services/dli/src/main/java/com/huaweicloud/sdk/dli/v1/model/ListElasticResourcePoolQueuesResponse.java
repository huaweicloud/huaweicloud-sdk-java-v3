package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListElasticResourcePoolQueuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    private List<QueueInfo> queues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListElasticResourcePoolQueuesResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 是否成功
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListElasticResourcePoolQueuesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 请求消息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListElasticResourcePoolQueuesResponse withQueues(List<QueueInfo> queues) {
        this.queues = queues;
        return this;
    }

    public ListElasticResourcePoolQueuesResponse addQueuesItem(QueueInfo queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public ListElasticResourcePoolQueuesResponse withQueues(Consumer<List<QueueInfo>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * 该弹性资源池下所有queue信息及队列扩缩容策略信息。
     * @return queues
     */
    public List<QueueInfo> getQueues() {
        return queues;
    }

    public void setQueues(List<QueueInfo> queues) {
        this.queues = queues;
    }

    public ListElasticResourcePoolQueuesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 该资源池下关联的队列数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListElasticResourcePoolQueuesResponse listElasticResourcePoolQueuesResponse =
            (ListElasticResourcePoolQueuesResponse) o;
        return Objects.equals(this.isSuccess, listElasticResourcePoolQueuesResponse.isSuccess)
            && Objects.equals(this.message, listElasticResourcePoolQueuesResponse.message)
            && Objects.equals(this.queues, listElasticResourcePoolQueuesResponse.queues)
            && Objects.equals(this.count, listElasticResourcePoolQueuesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, queues, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListElasticResourcePoolQueuesResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
