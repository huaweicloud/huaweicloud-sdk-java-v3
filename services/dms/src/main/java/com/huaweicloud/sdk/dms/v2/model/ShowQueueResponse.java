package com.huaweicloud.sdk.dms.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowQueueResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 队列类型。
     */
    public static class QueueModeEnum {

        
        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final QueueModeEnum NORMAL = new QueueModeEnum("NORMAL");
        
        /**
         * Enum FIFO for value: "FIFO"
         */
        public static final QueueModeEnum FIFO = new QueueModeEnum("FIFO");
        
        /**
         * Enum KAFKA_HA for value: "KAFKA_HA"
         */
        public static final QueueModeEnum KAFKA_HA = new QueueModeEnum("KAFKA_HA");
        
        /**
         * Enum KAFKA_HT for value: "KAFKA_HT"
         */
        public static final QueueModeEnum KAFKA_HT = new QueueModeEnum("KAFKA_HT");
        

        public static final Map<String, QueueModeEnum> staticFields = new HashMap<String, QueueModeEnum>() {
            { 
                put("NORMAL", NORMAL);
                put("FIFO", FIFO);
                put("KAFKA_HA", KAFKA_HA);
                put("KAFKA_HT", KAFKA_HT);
            }
        };

        private String value;

        QueueModeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static QueueModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            QueueModeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new QueueModeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static QueueModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            QueueModeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof QueueModeEnum) {
                return this.value.equals(((QueueModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_mode")
    
    private QueueModeEnum queueMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reservation")
    
    private Integer reservation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_msg_size_byte")
    
    private Integer maxMsgSizeByte;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="produced_messages")
    
    private Integer producedMessages;
    /**
     * 该队列是否开启死信消息。仅当include_deadletter为true时，才有该响应参数。 - enable：表示开启。 - disable：表示不开启。
     */
    public static class RedrivePolicyEnum {

        
        /**
         * Enum ENABLE for value: "enable"
         */
        public static final RedrivePolicyEnum ENABLE = new RedrivePolicyEnum("enable");
        
        /**
         * Enum DISABLE for value: "disable"
         */
        public static final RedrivePolicyEnum DISABLE = new RedrivePolicyEnum("disable");
        

        public static final Map<String, RedrivePolicyEnum> staticFields = new HashMap<String, RedrivePolicyEnum>() {
            { 
                put("enable", ENABLE);
                put("disable", DISABLE);
            }
        };

        private String value;

        RedrivePolicyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RedrivePolicyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RedrivePolicyEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new RedrivePolicyEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static RedrivePolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RedrivePolicyEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RedrivePolicyEnum) {
                return this.value.equals(((RedrivePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redrive_policy")
    
    private RedrivePolicyEnum redrivePolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_consume_count")
    
    private Integer maxConsumeCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_count")
    
    private Integer groupCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_topic")
    
    private String kafkaTopic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eff_date")
    
    private String effDate;

    public ShowQueueResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 队列ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowQueueResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 队列的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowQueueResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 创建队列的时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowQueueResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 队列的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowQueueResponse withQueueMode(QueueModeEnum queueMode) {
        this.queueMode = queueMode;
        return this;
    }

    


    /**
     * 队列类型。
     * @return queueMode
     */
    public QueueModeEnum getQueueMode() {
        return queueMode;
    }

    public void setQueueMode(QueueModeEnum queueMode) {
        this.queueMode = queueMode;
    }

    public ShowQueueResponse withReservation(Integer reservation) {
        this.reservation = reservation;
        return this;
    }

    


    /**
     * 消息在队列中允许保留的时长（单位分钟）。
     * @return reservation
     */
    public Integer getReservation() {
        return reservation;
    }

    public void setReservation(Integer reservation) {
        this.reservation = reservation;
    }

    public ShowQueueResponse withMaxMsgSizeByte(Integer maxMsgSizeByte) {
        this.maxMsgSizeByte = maxMsgSizeByte;
        return this;
    }

    


    /**
     * 队列中允许的最大消息大小（单位Byte）。
     * @return maxMsgSizeByte
     */
    public Integer getMaxMsgSizeByte() {
        return maxMsgSizeByte;
    }

    public void setMaxMsgSizeByte(Integer maxMsgSizeByte) {
        this.maxMsgSizeByte = maxMsgSizeByte;
    }

    public ShowQueueResponse withProducedMessages(Integer producedMessages) {
        this.producedMessages = producedMessages;
        return this;
    }

    


    /**
     * 队列的消息总数。
     * @return producedMessages
     */
    public Integer getProducedMessages() {
        return producedMessages;
    }

    public void setProducedMessages(Integer producedMessages) {
        this.producedMessages = producedMessages;
    }

    public ShowQueueResponse withRedrivePolicy(RedrivePolicyEnum redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
        return this;
    }

    


    /**
     * 该队列是否开启死信消息。仅当include_deadletter为true时，才有该响应参数。 - enable：表示开启。 - disable：表示不开启。
     * @return redrivePolicy
     */
    public RedrivePolicyEnum getRedrivePolicy() {
        return redrivePolicy;
    }

    public void setRedrivePolicy(RedrivePolicyEnum redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
    }

    public ShowQueueResponse withMaxConsumeCount(Integer maxConsumeCount) {
        this.maxConsumeCount = maxConsumeCount;
        return this;
    }

    


    /**
     * 最大确认消费失败的次数，当达到最大确认失败次数后，DMS会将该条消息转存到死信队列中。 仅当include_deadletter为true时，才有该响应参数。
     * @return maxConsumeCount
     */
    public Integer getMaxConsumeCount() {
        return maxConsumeCount;
    }

    public void setMaxConsumeCount(Integer maxConsumeCount) {
        this.maxConsumeCount = maxConsumeCount;
    }

    public ShowQueueResponse withGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
        return this;
    }

    


    /**
     * 该队列下的消费组数量。
     * @return groupCount
     */
    public Integer getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
    }

    public ShowQueueResponse withKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
        return this;
    }

    


    /**
     * 仅Kafka队列才有该参数。
     * @return kafkaTopic
     */
    public String getKafkaTopic() {
        return kafkaTopic;
    }

    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }

    public ShowQueueResponse withEffDate(String effDate) {
        this.effDate = effDate;
        return this;
    }

    


    /**
     * 创建队列的时间。
     * @return effDate
     */
    public String getEffDate() {
        return effDate;
    }

    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQueueResponse showQueueResponse = (ShowQueueResponse) o;
        return Objects.equals(this.id, showQueueResponse.id) &&
            Objects.equals(this.name, showQueueResponse.name) &&
            Objects.equals(this.created, showQueueResponse.created) &&
            Objects.equals(this.description, showQueueResponse.description) &&
            Objects.equals(this.queueMode, showQueueResponse.queueMode) &&
            Objects.equals(this.reservation, showQueueResponse.reservation) &&
            Objects.equals(this.maxMsgSizeByte, showQueueResponse.maxMsgSizeByte) &&
            Objects.equals(this.producedMessages, showQueueResponse.producedMessages) &&
            Objects.equals(this.redrivePolicy, showQueueResponse.redrivePolicy) &&
            Objects.equals(this.maxConsumeCount, showQueueResponse.maxConsumeCount) &&
            Objects.equals(this.groupCount, showQueueResponse.groupCount) &&
            Objects.equals(this.kafkaTopic, showQueueResponse.kafkaTopic) &&
            Objects.equals(this.effDate, showQueueResponse.effDate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, created, description, queueMode, reservation, maxMsgSizeByte, producedMessages, redrivePolicy, maxConsumeCount, groupCount, kafkaTopic, effDate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQueueResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    queueMode: ").append(toIndentedString(queueMode)).append("\n");
        sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
        sb.append("    maxMsgSizeByte: ").append(toIndentedString(maxMsgSizeByte)).append("\n");
        sb.append("    producedMessages: ").append(toIndentedString(producedMessages)).append("\n");
        sb.append("    redrivePolicy: ").append(toIndentedString(redrivePolicy)).append("\n");
        sb.append("    maxConsumeCount: ").append(toIndentedString(maxConsumeCount)).append("\n");
        sb.append("    groupCount: ").append(toIndentedString(groupCount)).append("\n");
        sb.append("    kafkaTopic: ").append(toIndentedString(kafkaTopic)).append("\n");
        sb.append("    effDate: ").append(toIndentedString(effDate)).append("\n");
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

