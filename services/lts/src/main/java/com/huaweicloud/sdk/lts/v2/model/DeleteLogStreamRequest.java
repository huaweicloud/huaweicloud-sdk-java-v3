package com.huaweicloud.sdk.lts.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteLogStreamRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_group_id")
    
    private String logGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_stream_id")
    
    private String logStreamId;

    public DeleteLogStreamRequest withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    


    /**
     * 租户想删除的日志流所在的日志组的groupid，一般为36位字符串。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    

    public DeleteLogStreamRequest withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    


    /**
     * 需要删除的日志流ID，获取方式请参见：获取账号ID、项目ID、日志组ID、日志流ID（https://support.huaweicloud.com/api-lts/lts_api_0006.html）。
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteLogStreamRequest deleteLogStreamRequest = (DeleteLogStreamRequest) o;
        return Objects.equals(this.logGroupId, deleteLogStreamRequest.logGroupId) &&
            Objects.equals(this.logStreamId, deleteLogStreamRequest.logStreamId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(logGroupId, logStreamId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLogStreamRequest {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
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

