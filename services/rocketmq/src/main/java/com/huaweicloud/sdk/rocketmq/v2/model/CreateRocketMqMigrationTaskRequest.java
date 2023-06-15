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
public class CreateRocketMqMigrationTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * true开启同名覆盖，会对已有的同名元数据的配置进行修改，false时当topic或group已存在则会报错。
     */
    public static final class OverwriteEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final OverwriteEnum TRUE = new OverwriteEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final OverwriteEnum FALSE = new OverwriteEnum("false");

        private static final Map<String, OverwriteEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OverwriteEnum> createStaticFields() {
            Map<String, OverwriteEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OverwriteEnum(String value) {
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
        public static OverwriteEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OverwriteEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OverwriteEnum(value);
            }
            return result;
        }

        public static OverwriteEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OverwriteEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OverwriteEnum) {
                return this.value.equals(((OverwriteEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overwrite")

    private OverwriteEnum overwrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 迁移任务类型，分为自建RocketMQ上云(rocketmq)、自建RabbitMQ上云(rabbitToRocket)
     */
    public static final class TypeEnum {

        /**
         * Enum ROCKETMQ for value: "rocketmq"
         */
        public static final TypeEnum ROCKETMQ = new TypeEnum("rocketmq");

        /**
         * Enum RABBITTOROCKET for value: "rabbitToRocket"
         */
        public static final TypeEnum RABBITTOROCKET = new TypeEnum("rabbitToRocket");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("rocketmq", ROCKETMQ);
            map.put("rabbitToRocket", RABBITTOROCKET);
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
    @JsonProperty(value = "body")

    private String body;

    public CreateRocketMqMigrationTaskRequest withInstanceId(String instanceId) {
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

    public CreateRocketMqMigrationTaskRequest withOverwrite(OverwriteEnum overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * true开启同名覆盖，会对已有的同名元数据的配置进行修改，false时当topic或group已存在则会报错。
     * @return overwrite
     */
    public OverwriteEnum getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(OverwriteEnum overwrite) {
        this.overwrite = overwrite;
    }

    public CreateRocketMqMigrationTaskRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 迁移任务名称，名称规则参考创建实例
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRocketMqMigrationTaskRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 迁移任务类型，分为自建RocketMQ上云(rocketmq)、自建RabbitMQ上云(rabbitToRocket)
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateRocketMqMigrationTaskRequest withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRocketMqMigrationTaskRequest createRocketMqMigrationTaskRequest = (CreateRocketMqMigrationTaskRequest) o;
        return Objects.equals(this.instanceId, createRocketMqMigrationTaskRequest.instanceId)
            && Objects.equals(this.overwrite, createRocketMqMigrationTaskRequest.overwrite)
            && Objects.equals(this.name, createRocketMqMigrationTaskRequest.name)
            && Objects.equals(this.type, createRocketMqMigrationTaskRequest.type)
            && Objects.equals(this.body, createRocketMqMigrationTaskRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, overwrite, name, type, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRocketMqMigrationTaskRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
