package com.huaweicloud.sdk.deh.v1.model;

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
 * 更新专属主机属性消息体。
 */
public class ReqUpdateDehMessage {

    /**
     * 在创建云服务器时（未指定专属主机ID），是否允许云服务器自动分配在一台可用的专属主机上。  取值范围：“on”或“off”。
     */
    public static final class AutoPlacementEnum {

        /**
         * Enum ON for value: "on"
         */
        public static final AutoPlacementEnum ON = new AutoPlacementEnum("on");

        /**
         * Enum OFF for value: "off"
         */
        public static final AutoPlacementEnum OFF = new AutoPlacementEnum("off");

        private static final Map<String, AutoPlacementEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AutoPlacementEnum> createStaticFields() {
            Map<String, AutoPlacementEnum> map = new HashMap<>();
            map.put("on", ON);
            map.put("off", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AutoPlacementEnum(String value) {
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
        public static AutoPlacementEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AutoPlacementEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AutoPlacementEnum(value);
            }
            return result;
        }

        public static AutoPlacementEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AutoPlacementEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AutoPlacementEnum) {
                return this.value.equals(((AutoPlacementEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_placement")

    @JacksonXmlProperty(localName = "auto_placement")

    private AutoPlacementEnum autoPlacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    public ReqUpdateDehMessage withAutoPlacement(AutoPlacementEnum autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * 在创建云服务器时（未指定专属主机ID），是否允许云服务器自动分配在一台可用的专属主机上。  取值范围：“on”或“off”。
     * @return autoPlacement
     */
    public AutoPlacementEnum getAutoPlacement() {
        return autoPlacement;
    }

    public void setAutoPlacement(AutoPlacementEnum autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    public ReqUpdateDehMessage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 专属主机名称。
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
        ReqUpdateDehMessage reqUpdateDehMessage = (ReqUpdateDehMessage) o;
        return Objects.equals(this.autoPlacement, reqUpdateDehMessage.autoPlacement)
            && Objects.equals(this.name, reqUpdateDehMessage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoPlacement, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqUpdateDehMessage {\n");
        sb.append("    autoPlacement: ").append(toIndentedString(autoPlacement)).append("\n");
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
