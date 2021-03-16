package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LTS转发配置信息
 */
public class LtsForwarding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_group_id")
    
    private String logGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_stream_id")
    
    private String logStreamId;

    public LtsForwarding withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    


    /**
     * 用于接收日志的日志组Id，通过调用LTS服务创建日志组接口获取(https://support.huaweicloud.com/api-lts/lts_api_0012.html)。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    

    public LtsForwarding withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    


    /**
     * 用于接收日志的日志流Id，通过调用LTS服务创建日志流接口获取(https://support.huaweicloud.com/api-lts/lts_api_0016.html)。
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
        LtsForwarding ltsForwarding = (LtsForwarding) o;
        return Objects.equals(this.logGroupId, ltsForwarding.logGroupId) &&
            Objects.equals(this.logStreamId, ltsForwarding.logStreamId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(logGroupId, logStreamId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsForwarding {\n");
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

