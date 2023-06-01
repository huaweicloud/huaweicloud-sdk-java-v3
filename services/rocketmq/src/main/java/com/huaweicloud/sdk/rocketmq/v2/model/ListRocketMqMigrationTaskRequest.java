package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListRocketMqMigrationTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 查询类型
     */
    public static final class TypeEnum {

        /**
         * Enum VHOST for value: "vhost"
         */
        public static final TypeEnum VHOST = new TypeEnum("vhost");

        /**
         * Enum EXCHANGE for value: "exchange"
         */
        public static final TypeEnum EXCHANGE = new TypeEnum("exchange");

        /**
         * Enum QUEUE for value: "queue"
         */
        public static final TypeEnum QUEUE = new TypeEnum("queue");

        /**
         * Enum ALL for value: "all"
         */
        public static final TypeEnum ALL = new TypeEnum("all");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("vhost", VHOST);
            map.put("exchange", EXCHANGE);
            map.put("queue", QUEUE);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ListRocketMqMigrationTaskRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListRocketMqMigrationTaskRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListRocketMqMigrationTaskRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 查询类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListRocketMqMigrationTaskRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 当前页，从1开始
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListRocketMqMigrationTaskRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 当前页大小
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListRocketMqMigrationTaskRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 查询vhost列表时，该字段可为空，查询exchange列表时，该字段为exchange所属vhost名称，查询queue列表时，该字段为queue所属vhost-所属exchange，例vhost1-exchange1
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRocketMqMigrationTaskRequest listRocketMqMigrationTaskRequest = (ListRocketMqMigrationTaskRequest) o;
        return Objects.equals(this.instanceId, listRocketMqMigrationTaskRequest.instanceId)
            && Objects.equals(this.id, listRocketMqMigrationTaskRequest.id)
            && Objects.equals(this.type, listRocketMqMigrationTaskRequest.type)
            && Objects.equals(this.offset, listRocketMqMigrationTaskRequest.offset)
            && Objects.equals(this.limit, listRocketMqMigrationTaskRequest.limit)
            && Objects.equals(this.name, listRocketMqMigrationTaskRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, id, type, offset, limit, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRocketMqMigrationTaskRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
