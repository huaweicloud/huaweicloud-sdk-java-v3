package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 实时作业节点事件触发配置
 */
public class Event {

    /**
     * 事件类型。 - KAFKA: 选择对应的连接名称与topic，当有新的kafka消息时将会触发作业运行一次 - DIS: 当前只支持监听DIS通道的新上报数据事件，每上报一条数据，触发作业运行一次。 - OBS: 选择要监听的OBS路径，如果该路径下有新增文件，则触发调度；新增的文件的路径名，可以通过变量Job.trigger.obsNewFiles引用。前提条件：该OBS路径已经配置DIS消息通知。
     */
    public static final class EventTypeEnum {

        /**
         * Enum KAFKA for value: "KAFKA"
         */
        public static final EventTypeEnum KAFKA = new EventTypeEnum("KAFKA");

        /**
         * Enum DIS for value: "DIS"
         */
        public static final EventTypeEnum DIS = new EventTypeEnum("DIS");

        /**
         * Enum OBS for value: "OBS"
         */
        public static final EventTypeEnum OBS = new EventTypeEnum("OBS");

        private static final Map<String, EventTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventTypeEnum> createStaticFields() {
            Map<String, EventTypeEnum> map = new HashMap<>();
            map.put("KAFKA", KAFKA);
            map.put("DIS", DIS);
            map.put("OBS", OBS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventTypeEnum(String value) {
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
        public static EventTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventTypeEnum(value));
        }

        public static EventTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventTypeEnum) {
                return this.value.equals(((EventTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private EventTypeEnum eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel")

    private String channel;

    /**
     * 执行失败处理策略。 - SUSPEND: 挂起 - IGNORE：忽略失败，读取下一事件
     */
    public static final class FailPolicyEnum {

        /**
         * Enum SUSPEND for value: "SUSPEND"
         */
        public static final FailPolicyEnum SUSPEND = new FailPolicyEnum("SUSPEND");

        /**
         * Enum IGNORE for value: "IGNORE"
         */
        public static final FailPolicyEnum IGNORE = new FailPolicyEnum("IGNORE");

        private static final Map<String, FailPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FailPolicyEnum> createStaticFields() {
            Map<String, FailPolicyEnum> map = new HashMap<>();
            map.put("SUSPEND", SUSPEND);
            map.put("IGNORE", IGNORE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FailPolicyEnum(String value) {
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
        public static FailPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FailPolicyEnum(value));
        }

        public static FailPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FailPolicyEnum) {
                return this.value.equals(((FailPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_policy")

    private FailPolicyEnum failPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrent")

    private Integer concurrent;

    /**
     * 读取策略。 - LAST: 从上次位置读取 - NEW：从最新位置读取
     */
    public static final class ReadPolicyEnum {

        /**
         * Enum LAST for value: "LAST"
         */
        public static final ReadPolicyEnum LAST = new ReadPolicyEnum("LAST");

        /**
         * Enum NEW for value: "NEW"
         */
        public static final ReadPolicyEnum NEW = new ReadPolicyEnum("NEW");

        private static final Map<String, ReadPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReadPolicyEnum> createStaticFields() {
            Map<String, ReadPolicyEnum> map = new HashMap<>();
            map.put("LAST", LAST);
            map.put("NEW", NEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReadPolicyEnum(String value) {
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
        public static ReadPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReadPolicyEnum(value));
        }

        public static ReadPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReadPolicyEnum) {
                return this.value.equals(((ReadPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_policy")

    private ReadPolicyEnum readPolicy;

    public Event withEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型。 - KAFKA: 选择对应的连接名称与topic，当有新的kafka消息时将会触发作业运行一次 - DIS: 当前只支持监听DIS通道的新上报数据事件，每上报一条数据，触发作业运行一次。 - OBS: 选择要监听的OBS路径，如果该路径下有新增文件，则触发调度；新增的文件的路径名，可以通过变量Job.trigger.obsNewFiles引用。前提条件：该OBS路径已经配置DIS消息通知。
     * @return eventType
     */
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public Event withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * DIS通道名称。通过DIS管理控制台获取通道名称：登录管理控制台。单击“数据接入服务”，左侧列表选择“通道管理”。通道管理页面中列出了用户拥有的通道
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Event withFailPolicy(FailPolicyEnum failPolicy) {
        this.failPolicy = failPolicy;
        return this;
    }

    /**
     * 执行失败处理策略。 - SUSPEND: 挂起 - IGNORE：忽略失败，读取下一事件
     * @return failPolicy
     */
    public FailPolicyEnum getFailPolicy() {
        return failPolicy;
    }

    public void setFailPolicy(FailPolicyEnum failPolicy) {
        this.failPolicy = failPolicy;
    }

    public Event withConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
        return this;
    }

    /**
     * 调度并发数
     * minimum: 1
     * maximum: 128
     * @return concurrent
     */
    public Integer getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
    }

    public Event withReadPolicy(ReadPolicyEnum readPolicy) {
        this.readPolicy = readPolicy;
        return this;
    }

    /**
     * 读取策略。 - LAST: 从上次位置读取 - NEW：从最新位置读取
     * @return readPolicy
     */
    public ReadPolicyEnum getReadPolicy() {
        return readPolicy;
    }

    public void setReadPolicy(ReadPolicyEnum readPolicy) {
        this.readPolicy = readPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event that = (Event) obj;
        return Objects.equals(this.eventType, that.eventType) && Objects.equals(this.channel, that.channel)
            && Objects.equals(this.failPolicy, that.failPolicy) && Objects.equals(this.concurrent, that.concurrent)
            && Objects.equals(this.readPolicy, that.readPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, channel, failPolicy, concurrent, readPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    failPolicy: ").append(toIndentedString(failPolicy)).append("\n");
        sb.append("    concurrent: ").append(toIndentedString(concurrent)).append("\n");
        sb.append("    readPolicy: ").append(toIndentedString(readPolicy)).append("\n");
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
