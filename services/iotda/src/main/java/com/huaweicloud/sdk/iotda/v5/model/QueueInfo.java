package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 添加时队列结构体。
 */
public class QueueInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_name")
    
    private String queueName;

    public QueueInfo withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    


    /**
     * 队列名称，同一租户不允许生重复。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueueInfo queueInfo = (QueueInfo) o;
        return Objects.equals(this.queueName, queueInfo.queueName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(queueName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueInfo {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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

