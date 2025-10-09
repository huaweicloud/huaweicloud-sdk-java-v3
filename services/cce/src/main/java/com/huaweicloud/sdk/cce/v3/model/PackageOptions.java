package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 配置参数结构
 */
public class PackageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Object _default;

    /**
     * **参数解释**： 参数生效方式 **取值范围**： - static：集群、节点池创建时生效，后续不可修改 - immediately：集群、节点池运行中时可以修改，修改后生效
     */
    public static final class ValidAtEnum {

        /**
         * Enum STATIC for value: "static"
         */
        public static final ValidAtEnum STATIC = new ValidAtEnum("static");

        /**
         * Enum IMMEDIATELY for value: "immediately"
         */
        public static final ValidAtEnum IMMEDIATELY = new ValidAtEnum("immediately");

        private static final Map<String, ValidAtEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ValidAtEnum> createStaticFields() {
            Map<String, ValidAtEnum> map = new HashMap<>();
            map.put("static", STATIC);
            map.put("immediately", IMMEDIATELY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ValidAtEnum(String value) {
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
        public static ValidAtEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ValidAtEnum(value));
        }

        public static ValidAtEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ValidAtEnum) {
                return this.value.equals(((ValidAtEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validAt")

    private ValidAtEnum validAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "empty")

    private Boolean empty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public PackageOptions withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 参数名称 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PackageOptions withDefault(Object _default) {
        this._default = _default;
        return this;
    }

    /**
     * **参数解释**： 参数默认值，不指定时按默认值生效, 参数类型以实际返回为准，可能为integer,string或者boolean **取值范围**： 不涉及
     * @return _default
     */
    public Object getDefault() {
        return _default;
    }

    public void setDefault(Object _default) {
        this._default = _default;
    }

    public PackageOptions withValidAt(ValidAtEnum validAt) {
        this.validAt = validAt;
        return this;
    }

    /**
     * **参数解释**： 参数生效方式 **取值范围**： - static：集群、节点池创建时生效，后续不可修改 - immediately：集群、节点池运行中时可以修改，修改后生效
     * @return validAt
     */
    public ValidAtEnum getValidAt() {
        return validAt;
    }

    public void setValidAt(ValidAtEnum validAt) {
        this.validAt = validAt;
    }

    public PackageOptions withEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }

    /**
     * **参数解释**： 配置项是否可以为空 **取值范围**： - true：配置项为空时，不使用默认值，为空值 - false：配置项为空时，使用默认值
     * @return empty
     */
    public Boolean getEmpty() {
        return empty;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public PackageOptions withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * **参数解释**： 参数分类 **取值范围**： 不涉及
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public PackageOptions withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 参数类型 **取值范围**： 不涉及
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PackageOptions that = (PackageOptions) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this._default, that._default)
            && Objects.equals(this.validAt, that.validAt) && Objects.equals(this.empty, that.empty)
            && Objects.equals(this.schema, that.schema) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, _default, validAt, empty, schema, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageOptions {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    validAt: ").append(toIndentedString(validAt)).append("\n");
        sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
