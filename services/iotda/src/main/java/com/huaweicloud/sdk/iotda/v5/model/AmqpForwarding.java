package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * amqp queue配置信息
 */
public class AmqpForwarding  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_name")
    
    private String queueName;

    public AmqpForwarding withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    


    /**
     * 用于接收满足规则条件数据的amqp queue。
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
        AmqpForwarding amqpForwarding = (AmqpForwarding) o;
        return Objects.equals(this.queueName, amqpForwarding.queueName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(queueName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AmqpForwarding {\n");
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

