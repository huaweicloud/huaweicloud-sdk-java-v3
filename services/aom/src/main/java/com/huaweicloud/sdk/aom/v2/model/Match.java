package com.huaweicloud.sdk.aom.v2.model;

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
 * 静默规则的匹配条件
 */
public class Match {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    /**
     * 指定匹配的方式：EXIST:存在，REGEX:正则，EQUALS:等于
     */
    public static final class OperateEnum {

        /**
         * Enum EQUALS for value: "EQUALS"
         */
        public static final OperateEnum EQUALS = new OperateEnum("EQUALS");

        /**
         * Enum REGEX for value: "REGEX"
         */
        public static final OperateEnum REGEX = new OperateEnum("REGEX");

        /**
         * Enum EXIST for value: "EXIST"
         */
        public static final OperateEnum EXIST = new OperateEnum("EXIST");

        private static final Map<String, OperateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateEnum> createStaticFields() {
            Map<String, OperateEnum> map = new HashMap<>();
            map.put("EQUALS", EQUALS);
            map.put("REGEX", REGEX);
            map.put("EXIST", EXIST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateEnum(String value) {
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
        public static OperateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperateEnum(value));
        }

        public static OperateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateEnum) {
                return this.value.equals(((OperateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate")

    private OperateEnum operate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private List<String> value = null;

    public Match withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 指定按照Metadata中的key进行匹配
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Match withOperate(OperateEnum operate) {
        this.operate = operate;
        return this;
    }

    /**
     * 指定匹配的方式：EXIST:存在，REGEX:正则，EQUALS:等于
     * @return operate
     */
    public OperateEnum getOperate() {
        return operate;
    }

    public void setOperate(OperateEnum operate) {
        this.operate = operate;
    }

    public Match withValue(List<String> value) {
        this.value = value;
        return this;
    }

    public Match addValueItem(String valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public Match withValue(Consumer<List<String>> valueSetter) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 要匹配的key对应的value，当operate为存在时，此值为空
     * @return value
     */
    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Match that = (Match) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.operate, that.operate)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, operate, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Match {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    operate: ").append(toIndentedString(operate)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
