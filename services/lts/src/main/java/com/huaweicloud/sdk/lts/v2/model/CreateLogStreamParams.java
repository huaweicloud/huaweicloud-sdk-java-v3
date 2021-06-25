package com.huaweicloud.sdk.lts.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建日志流参数。
 */
public class CreateLogStreamParams  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_stream_name")
    
    private String logStreamName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private Object tag;

    public CreateLogStreamParams withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    


    /**
     * 需要创建的日志流名称。
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    

    public CreateLogStreamParams withTag(Object tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 日志流Tag集合，不同日志流属性不同。
     * @return tag
     */
    public Object getTag() {
        return tag;
    }

    public void setTag(Object tag) {
        this.tag = tag;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLogStreamParams createLogStreamParams = (CreateLogStreamParams) o;
        return Objects.equals(this.logStreamName, createLogStreamParams.logStreamName) &&
            Objects.equals(this.tag, createLogStreamParams.tag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(logStreamName, tag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogStreamParams {\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

