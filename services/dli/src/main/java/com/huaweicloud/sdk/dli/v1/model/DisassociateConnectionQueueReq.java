package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 解绑列队的请求body体。
 */
public class DisassociateConnectionQueueReq {

    /**
     * Gets or Sets queues
     */
    public static final class QueuesEnum {

        /**
         * Enum Q1 for value: "q1"
         */
        public static final QueuesEnum Q1 = new QueuesEnum("q1");

        /**
         * Enum Q2 for value: "q2"
         */
        public static final QueuesEnum Q2 = new QueuesEnum("q2");

        private static final Map<String, QueuesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueuesEnum> createStaticFields() {
            Map<String, QueuesEnum> map = new HashMap<>();
            map.put("q1", Q1);
            map.put("q2", Q2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QueuesEnum(String value) {
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
        public static QueuesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            QueuesEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new QueuesEnum(value);
            }
            return result;
        }

        public static QueuesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            QueuesEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QueuesEnum) {
                return this.value.equals(((QueuesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    private List<QueuesEnum> queues = null;

    public DisassociateConnectionQueueReq withQueues(List<QueuesEnum> queues) {
        this.queues = queues;
        return this;
    }

    public DisassociateConnectionQueueReq addQueuesItem(QueuesEnum queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public DisassociateConnectionQueueReq withQueues(Consumer<List<QueuesEnum>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * 需要使用跨源的队列名列表。
     * @return queues
     */
    public List<QueuesEnum> getQueues() {
        return queues;
    }

    public void setQueues(List<QueuesEnum> queues) {
        this.queues = queues;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateConnectionQueueReq disassociateConnectionQueueReq = (DisassociateConnectionQueueReq) o;
        return Objects.equals(this.queues, disassociateConnectionQueueReq.queues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateConnectionQueueReq {\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
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
