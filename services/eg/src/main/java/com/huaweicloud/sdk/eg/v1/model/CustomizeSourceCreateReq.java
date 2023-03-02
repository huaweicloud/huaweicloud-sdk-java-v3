package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CustomizeSourceCreateReq
 */
public class CustomizeSourceCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    /**
     * 事件源类型
     */
    public static final class TypeEnum {

        /**
         * Enum APPLICATION for value: "APPLICATION"
         */
        public static final TypeEnum APPLICATION = new TypeEnum("APPLICATION");

        /**
         * Enum RABBITMQ for value: "RABBITMQ"
         */
        public static final TypeEnum RABBITMQ = new TypeEnum("RABBITMQ");

        /**
         * Enum ROCKETMQ for value: "ROCKETMQ"
         */
        public static final TypeEnum ROCKETMQ = new TypeEnum("ROCKETMQ");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("APPLICATION", APPLICATION);
            map.put("RABBITMQ", RABBITMQ);
            map.put("ROCKETMQ", ROCKETMQ);
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
    @JsonProperty(value = "detail")

    private Object detail;

    public CustomizeSourceCreateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义事件源名称，租户下唯一，由小写字母、数字、点、下划线和中划线组成，必须以字母或数字开头，且不能以hc.开头
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomizeSourceCreateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件源描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomizeSourceCreateReq withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 指导事件源归属的事件通道ID
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public CustomizeSourceCreateReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 事件源类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CustomizeSourceCreateReq withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    /**
     * json格式封装消息实例链接信息：如RabbitMQ实例的instance_id字段、虚拟主机vhost字段、队列queue字段、用户名、密码等
     * @return detail
     */
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomizeSourceCreateReq customizeSourceCreateReq = (CustomizeSourceCreateReq) o;
        return Objects.equals(this.name, customizeSourceCreateReq.name)
            && Objects.equals(this.description, customizeSourceCreateReq.description)
            && Objects.equals(this.channelId, customizeSourceCreateReq.channelId)
            && Objects.equals(this.type, customizeSourceCreateReq.type)
            && Objects.equals(this.detail, customizeSourceCreateReq.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, channelId, type, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizeSourceCreateReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
