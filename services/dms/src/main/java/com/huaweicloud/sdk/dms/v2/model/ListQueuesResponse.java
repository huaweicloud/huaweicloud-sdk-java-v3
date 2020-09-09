package com.huaweicloud.sdk.dms.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dms.v2.model.ListQueuesRespQueues;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListQueuesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queues")
    
    private List<ListQueuesRespQueues> queues = null;
    
    public ListQueuesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 该租户的所有队列总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListQueuesResponse withQueues(List<ListQueuesRespQueues> queues) {
        this.queues = queues;
        return this;
    }

    
    public ListQueuesResponse addQueuesItem(ListQueuesRespQueues queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public ListQueuesResponse withQueues(Consumer<List<ListQueuesRespQueues>> queuesSetter) {
        if(this.queues == null ){
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * 该租户的所有队列数组。
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
        return Objects.equals(this.total, listQueuesResponse.total) &&
            Objects.equals(this.queues, listQueuesResponse.queues);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, queues);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueuesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

