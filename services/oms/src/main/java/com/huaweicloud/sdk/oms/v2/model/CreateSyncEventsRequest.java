package com.huaweicloud.sdk.oms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.oms.v2.model.SyncObjectReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateSyncEventsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync_task_id")
    
    private String syncTaskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private SyncObjectReq body;

    public CreateSyncEventsRequest withSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }

    


    /**
     * 同步任务ID
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return syncTaskId;
    }

    public void setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
    }

    

    public CreateSyncEventsRequest withBody(SyncObjectReq body) {
        this.body = body;
        return this;
    }

    public CreateSyncEventsRequest withBody(Consumer<SyncObjectReq> bodySetter) {
        if(this.body == null ){
            this.body = new SyncObjectReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public SyncObjectReq getBody() {
        return body;
    }

    public void setBody(SyncObjectReq body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSyncEventsRequest createSyncEventsRequest = (CreateSyncEventsRequest) o;
        return Objects.equals(this.syncTaskId, createSyncEventsRequest.syncTaskId) &&
            Objects.equals(this.body, createSyncEventsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(syncTaskId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSyncEventsRequest {\n");
        sb.append("    syncTaskId: ").append(toIndentedString(syncTaskId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

