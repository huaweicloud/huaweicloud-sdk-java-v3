package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateTopicReq
 */
public class UpdateTopicReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_queue_num")

    private BigDecimal readQueueNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_queue_num")

    private BigDecimal writeQueueNum;

    /**
     * **参数解释**： 权限。 **约束限制**： 仅4.8.0实例支持修改该参数。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     */
    public static final class PermissionEnum {

        /**
         * Enum SUB for value: "sub"
         */
        public static final PermissionEnum SUB = new PermissionEnum("sub");

        /**
         * Enum PUB for value: "pub"
         */
        public static final PermissionEnum PUB = new PermissionEnum("pub");

        /**
         * Enum ALL for value: "all"
         */
        public static final PermissionEnum ALL = new PermissionEnum("all");

        private static final Map<String, PermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionEnum> createStaticFields() {
            Map<String, PermissionEnum> map = new HashMap<>();
            map.put("sub", SUB);
            map.put("pub", PUB);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionEnum(String value) {
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
        public static PermissionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionEnum(value));
        }

        public static PermissionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionEnum) {
                return this.value.equals(((PermissionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private PermissionEnum permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    private List<UpdateTopicQueueEntity> queues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_desc")

    private String topicDesc;

    public UpdateTopicReq withReadQueueNum(BigDecimal readQueueNum) {
        this.readQueueNum = readQueueNum;
        return this;
    }

    /**
     * **参数解释**： 总读队列个数。 **约束限制**： 仅4.8.0实例支持修改该参数。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return readQueueNum
     */
    public BigDecimal getReadQueueNum() {
        return readQueueNum;
    }

    public void setReadQueueNum(BigDecimal readQueueNum) {
        this.readQueueNum = readQueueNum;
    }

    public UpdateTopicReq withWriteQueueNum(BigDecimal writeQueueNum) {
        this.writeQueueNum = writeQueueNum;
        return this;
    }

    /**
     * **参数解释**： 总写队列个数。 **约束限制**： 仅4.8.0实例支持修改该参数。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return writeQueueNum
     */
    public BigDecimal getWriteQueueNum() {
        return writeQueueNum;
    }

    public void setWriteQueueNum(BigDecimal writeQueueNum) {
        this.writeQueueNum = writeQueueNum;
    }

    public UpdateTopicReq withPermission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * **参数解释**： 权限。 **约束限制**： 仅4.8.0实例支持修改该参数。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return permission
     */
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    public UpdateTopicReq withQueues(List<UpdateTopicQueueEntity> queues) {
        this.queues = queues;
        return this;
    }

    public UpdateTopicReq addQueuesItem(UpdateTopicQueueEntity queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public UpdateTopicReq withQueues(Consumer<List<UpdateTopicQueueEntity>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * **参数解释**： 队列。 **约束限制**： 仅4.8.0实例支持修改该参数。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return queues
     */
    public List<UpdateTopicQueueEntity> getQueues() {
        return queues;
    }

    public void setQueues(List<UpdateTopicQueueEntity> queues) {
        this.queues = queues;
    }

    public UpdateTopicReq withTopicDesc(String topicDesc) {
        this.topicDesc = topicDesc;
        return this;
    }

    /**
     * **参数解释**： Topic描述。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return topicDesc
     */
    public String getTopicDesc() {
        return topicDesc;
    }

    public void setTopicDesc(String topicDesc) {
        this.topicDesc = topicDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTopicReq that = (UpdateTopicReq) obj;
        return Objects.equals(this.readQueueNum, that.readQueueNum)
            && Objects.equals(this.writeQueueNum, that.writeQueueNum)
            && Objects.equals(this.permission, that.permission) && Objects.equals(this.queues, that.queues)
            && Objects.equals(this.topicDesc, that.topicDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readQueueNum, writeQueueNum, permission, queues, topicDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopicReq {\n");
        sb.append("    readQueueNum: ").append(toIndentedString(readQueueNum)).append("\n");
        sb.append("    writeQueueNum: ").append(toIndentedString(writeQueueNum)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
        sb.append("    topicDesc: ").append(toIndentedString(topicDesc)).append("\n");
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
