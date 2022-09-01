package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 后端API请求参数
 */
public class LdApiParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    /**
     * 该参数在调用API时候所放的位置： - Headers ：放于请求头 - Parameters ：放于请求参数 - Body：放于请求体
     */
    public static final class InEnum {

        /**
         * Enum HEADERS for value: "Headers"
         */
        public static final InEnum HEADERS = new InEnum("Headers");

        /**
         * Enum PARAMETERS for value: "Parameters"
         */
        public static final InEnum PARAMETERS = new InEnum("Parameters");

        /**
         * Enum BODY for value: "Body"
         */
        public static final InEnum BODY = new InEnum("Body");

        private static final Map<String, InEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InEnum> createStaticFields() {
            Map<String, InEnum> map = new HashMap<>();
            map.put("Headers", HEADERS);
            map.put("Parameters", PARAMETERS);
            map.put("Body", BODY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InEnum(String value) {
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
        public static InEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InEnum(value);
            }
            return result;
        }

        public static InEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InEnum) {
                return this.value.equals(((InEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in")

    @JacksonXmlProperty(localName = "in")

    private InEnum in;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    @JacksonXmlProperty(localName = "default")

    private String _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    @JacksonXmlProperty(localName = "required")

    private Boolean required;

    public LdApiParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称： - 参数位于Headers、 Parameters时，用户自行定义，支持英文、数字、点、中划线、下划线，且需要英文开头，不区分大小写。 - 参数位于Body时候，参数以application/json、application/xml、application/text为名，但实际是以请求body里的键值对作为参数名和参数值，比如请求消息样例，参数名为application/json，参数值为{\\\"table\\\":\\\"apic01\\\",\\\"id\\\":\\\"1\\\"}，后端取table：apic01，id：1这两个键值对作为入参。 - 注意：定义参数不要重名，否则会覆盖掉，当Headers、Parameters重复时候，Parameters会被覆盖，当Parameters和Body里的键值对重复时候，Parameters会被覆盖。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LdApiParameter withIn(InEnum in) {
        this.in = in;
        return this;
    }

    /**
     * 该参数在调用API时候所放的位置： - Headers ：放于请求头 - Parameters ：放于请求参数 - Body：放于请求体
     * @return in
     */
    public InEnum getIn() {
        return in;
    }

    public void setIn(InEnum in) {
        this.in = in;
    }

    public LdApiParameter withDefault(String _default) {
        this._default = _default;
        return this;
    }

    /**
     * 参数默认值
     * @return _default
     */
    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public LdApiParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数描述  不支持<，>字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LdApiParameter withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 参数是否必须。true：必须，false：不必须
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LdApiParameter ldApiParameter = (LdApiParameter) o;
        return Objects.equals(this.name, ldApiParameter.name) && Objects.equals(this.in, ldApiParameter.in)
            && Objects.equals(this._default, ldApiParameter._default)
            && Objects.equals(this.description, ldApiParameter.description)
            && Objects.equals(this.required, ldApiParameter.required);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, in, _default, description, required);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdApiParameter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    in: ").append(toIndentedString(in)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
