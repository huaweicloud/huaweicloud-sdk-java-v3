package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.Page;
import com.huaweicloud.sdk.iotda.v5.model.QueryQueueBase;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchShowQueueResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queues")
    
    private List<QueryQueueBase> queues = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Page page = null;

    public BatchShowQueueResponse withQueues(List<QueryQueueBase> queues) {
        this.queues = queues;
        return this;
    }

    
    public BatchShowQueueResponse addQueuesItem(QueryQueueBase queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public BatchShowQueueResponse withQueues(Consumer<List<QueryQueueBase>> queuesSetter) {
        if(this.queues == null ){
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * 队列信息列表。
     * @return queues
     */
    public List<QueryQueueBase> getQueues() {
        return queues;
    }

    public void setQueues(List<QueryQueueBase> queues) {
        this.queues = queues;
    }

    public BatchShowQueueResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public BatchShowQueueResponse withPage(Consumer<Page> pageSetter) {
        if(this.page == null ){
            this.page = new Page();
            pageSetter.accept(this.page);
        }
        
        return this;
    }


    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchShowQueueResponse batchShowQueueResponse = (BatchShowQueueResponse) o;
        return Objects.equals(this.queues, batchShowQueueResponse.queues) &&
            Objects.equals(this.page, batchShowQueueResponse.page);
    }
    @Override
    public int hashCode() {
        return Objects.hash(queues, page);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowQueueResponse {\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

