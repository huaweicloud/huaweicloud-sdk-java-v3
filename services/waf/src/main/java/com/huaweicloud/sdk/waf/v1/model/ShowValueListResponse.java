package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowValueListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：** 引用表类型 **约束限制：** 不涉及 **取值范围：**  - url  - params  - ip  - cookie  - referer  - user-agent  - header  - response_code  - response_header  - response_body  **默认取值：** 不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum URL for value: "url"
         */
        public static final TypeEnum URL = new TypeEnum("url");

        /**
         * Enum PARAMS for value: "params"
         */
        public static final TypeEnum PARAMS = new TypeEnum("params");

        /**
         * Enum IP for value: "ip"
         */
        public static final TypeEnum IP = new TypeEnum("ip");

        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final TypeEnum COOKIE = new TypeEnum("cookie");

        /**
         * Enum REFERER for value: "referer"
         */
        public static final TypeEnum REFERER = new TypeEnum("referer");

        /**
         * Enum USER_AGENT for value: "user-agent"
         */
        public static final TypeEnum USER_AGENT = new TypeEnum("user-agent");

        /**
         * Enum HEADER for value: "header"
         */
        public static final TypeEnum HEADER = new TypeEnum("header");

        /**
         * Enum RESPONSE_CODE for value: "response_code"
         */
        public static final TypeEnum RESPONSE_CODE = new TypeEnum("response_code");

        /**
         * Enum RESPONSE_HEADER for value: "response_header"
         */
        public static final TypeEnum RESPONSE_HEADER = new TypeEnum("response_header");

        /**
         * Enum RESPONSE_BODY for value: "response_body"
         */
        public static final TypeEnum RESPONSE_BODY = new TypeEnum("response_body");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("url", URL);
            map.put("params", PARAMS);
            map.put("ip", IP);
            map.put("cookie", COOKIE);
            map.put("referer", REFERER);
            map.put("user-agent", USER_AGENT);
            map.put("header", HEADER);
            map.put("response_code", RESPONSE_CODE);
            map.put("response_header", RESPONSE_HEADER);
            map.put("response_body", RESPONSE_BODY);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<String> values = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "producer")

    private Integer producer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    public ShowValueListResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 引用表id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowValueListResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 引用表名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowValueListResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 引用表类型 **约束限制：** 不涉及 **取值范围：**  - url  - params  - ip  - cookie  - referer  - user-agent  - header  - response_code  - response_header  - response_body  **默认取值：** 不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowValueListResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 引用表描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowValueListResponse withValues(List<String> values) {
        this.values = values;
        return this;
    }

    public ShowValueListResponse addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ShowValueListResponse withValues(Consumer<List<String>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 引用表的值
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public ShowValueListResponse withProducer(Integer producer) {
        this.producer = producer;
        return this;
    }

    /**
     * 引用表来源：  - 1:表示来源于用户手动创建  - 2:表示来源于智能访问控制自动创建
     * @return producer
     */
    public Integer getProducer() {
        return producer;
    }

    public void setProducer(Integer producer) {
        this.producer = producer;
    }

    public ShowValueListResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建规则的时间，格式为13位毫秒时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowValueListResponse that = (ShowValueListResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.description, that.description)
            && Objects.equals(this.values, that.values) && Objects.equals(this.producer, that.producer)
            && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, description, values, producer, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowValueListResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    producer: ").append(toIndentedString(producer)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
