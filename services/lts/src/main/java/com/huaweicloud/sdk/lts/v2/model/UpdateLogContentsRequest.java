package com.huaweicloud.sdk.lts.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.lts.v2.model.QueryLTSLogParams;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateLogContentsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_group_id")
    
    private String logGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_stream_id")
    
    private String logStreamId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private QueryLTSLogParams body;

    public UpdateLogContentsRequest withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    


    /**
     * 日志组id。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    

    public UpdateLogContentsRequest withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    


    /**
     * 日志流id。
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    

    public UpdateLogContentsRequest withBody(QueryLTSLogParams body) {
        this.body = body;
        return this;
    }

    public UpdateLogContentsRequest withBody(Consumer<QueryLTSLogParams> bodySetter) {
        if(this.body == null ){
            this.body = new QueryLTSLogParams();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public QueryLTSLogParams getBody() {
        return body;
    }

    public void setBody(QueryLTSLogParams body) {
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
        UpdateLogContentsRequest updateLogContentsRequest = (UpdateLogContentsRequest) o;
        return Objects.equals(this.logGroupId, updateLogContentsRequest.logGroupId) &&
            Objects.equals(this.logStreamId, updateLogContentsRequest.logStreamId) &&
            Objects.equals(this.body, updateLogContentsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(logGroupId, logStreamId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogContentsRequest {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
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

