package com.huaweicloud.sdk.dms.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateQueueReq
 */
public class CreateQueueReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 队列类型。  取值范围： - NORMAL：普通队列，更高的并发性能，不保证先入先出（FIFO）的严格顺序。 - FIFO：有序队列，保证消息先入先出（FIFO）的严格顺序。 - KAFKA_HA：高可靠模式的kafka队列。消息多副本同步落盘，保证消息的可靠性。 - KAFKA_HT：高吞吐模式的kafka队列。消息副本异步落盘，具有较高的性能。  默认值：NORMAL
     */
    public static final class QueueModeEnum {

        
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
        

        private static final Map<String, QueueModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueueModeEnum> createStaticFields() {
            Map<String, QueueModeEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("FIFO", FIFO);
            map.put("KAFKA_HA", KAFKA_HA);
            map.put("KAFKA_HT", KAFKA_HT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QueueModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static QueueModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            QueueModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new QueueModeEnum(value);
            }
            return result;
        }

        public static QueueModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            QueueModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QueueModeEnum) {
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
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 仅当queue_mode为“NORMAL”或者“FIFO”时，该参数有效。  是否开启死信消息，死信消息是指无法被正常消费的消息。  当达到最大消费次数仍然失败后，DMS会将该条消息转存到死信队列中，有效期为72小时，用户可以根据需要对死信消息进行重新消费。  消费死信消息时，只能消费该消费组产生的死信消息。  有序队列的死信消息依然按照先入先出（FIFO）的顺序存储在死信队列中。  取值范围： - enable：开启 - disable：不开启  默认值：disable
     */
    public static final class RedrivePolicyEnum {

        
        /**
         * Enum ENABLE for value: "enable"
         */
        public static final RedrivePolicyEnum ENABLE = new RedrivePolicyEnum("enable");
        
        /**
         * Enum DISABLE for value: "disable"
         */
        public static final RedrivePolicyEnum DISABLE = new RedrivePolicyEnum("disable");
        

        private static final Map<String, RedrivePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RedrivePolicyEnum> createStaticFields() {
            Map<String, RedrivePolicyEnum> map = new HashMap<>();
            map.put("enable", ENABLE);
            map.put("disable", DISABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RedrivePolicyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RedrivePolicyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RedrivePolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RedrivePolicyEnum(value);
            }
            return result;
        }

        public static RedrivePolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RedrivePolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RedrivePolicyEnum) {
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
    @JsonProperty(value="retention_hours")
    
    private Integer retentionHours;

    public CreateQueueReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 队列的名称，必须唯一。  长度不超过64位的字符串，包含a~z，A~Z，0~9、中划线（-）和下划线（_）。  创建队列后无法修改名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateQueueReq withQueueMode(QueueModeEnum queueMode) {
        this.queueMode = queueMode;
        return this;
    }

    


    /**
     * 队列类型。  取值范围： - NORMAL：普通队列，更高的并发性能，不保证先入先出（FIFO）的严格顺序。 - FIFO：有序队列，保证消息先入先出（FIFO）的严格顺序。 - KAFKA_HA：高可靠模式的kafka队列。消息多副本同步落盘，保证消息的可靠性。 - KAFKA_HT：高吞吐模式的kafka队列。消息副本异步落盘，具有较高的性能。  默认值：NORMAL
     * @return queueMode
     */
    public QueueModeEnum getQueueMode() {
        return queueMode;
    }

    public void setQueueMode(QueueModeEnum queueMode) {
        this.queueMode = queueMode;
    }

    

    public CreateQueueReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 队列的描述信息。  长度不超过160位的字符串，不能包含尖括号<>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public CreateQueueReq withRedrivePolicy(RedrivePolicyEnum redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
        return this;
    }

    


    /**
     * 仅当queue_mode为“NORMAL”或者“FIFO”时，该参数有效。  是否开启死信消息，死信消息是指无法被正常消费的消息。  当达到最大消费次数仍然失败后，DMS会将该条消息转存到死信队列中，有效期为72小时，用户可以根据需要对死信消息进行重新消费。  消费死信消息时，只能消费该消费组产生的死信消息。  有序队列的死信消息依然按照先入先出（FIFO）的顺序存储在死信队列中。  取值范围： - enable：开启 - disable：不开启  默认值：disable
     * @return redrivePolicy
     */
    public RedrivePolicyEnum getRedrivePolicy() {
        return redrivePolicy;
    }

    public void setRedrivePolicy(RedrivePolicyEnum redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
    }

    

    public CreateQueueReq withMaxConsumeCount(Integer maxConsumeCount) {
        this.maxConsumeCount = maxConsumeCount;
        return this;
    }

    


    /**
     * 仅当redrive_policy为enable时，该参数必选。  最大确认消费失败的次数，当达到最大确认失败次数后，DMS会将该条消息转存到死信队列中。  取值范围：1~100
     * @return maxConsumeCount
     */
    public Integer getMaxConsumeCount() {
        return maxConsumeCount;
    }

    public void setMaxConsumeCount(Integer maxConsumeCount) {
        this.maxConsumeCount = maxConsumeCount;
    }

    

    public CreateQueueReq withRetentionHours(Integer retentionHours) {
        this.retentionHours = retentionHours;
        return this;
    }

    


    /**
     * 指定kafka队列的消息保存时间，单位为小时。  仅当queue_mode为KAFKA_HA或者KAFKA_HT才有效。  取值范围: 1-72（小时）
     * @return retentionHours
     */
    public Integer getRetentionHours() {
        return retentionHours;
    }

    public void setRetentionHours(Integer retentionHours) {
        this.retentionHours = retentionHours;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateQueueReq createQueueReq = (CreateQueueReq) o;
        return Objects.equals(this.name, createQueueReq.name) &&
            Objects.equals(this.queueMode, createQueueReq.queueMode) &&
            Objects.equals(this.description, createQueueReq.description) &&
            Objects.equals(this.redrivePolicy, createQueueReq.redrivePolicy) &&
            Objects.equals(this.maxConsumeCount, createQueueReq.maxConsumeCount) &&
            Objects.equals(this.retentionHours, createQueueReq.retentionHours);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, queueMode, description, redrivePolicy, maxConsumeCount, retentionHours);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateQueueReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    queueMode: ").append(toIndentedString(queueMode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    redrivePolicy: ").append(toIndentedString(redrivePolicy)).append("\n");
        sb.append("    maxConsumeCount: ").append(toIndentedString(maxConsumeCount)).append("\n");
        sb.append("    retentionHours: ").append(toIndentedString(retentionHours)).append("\n");
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

