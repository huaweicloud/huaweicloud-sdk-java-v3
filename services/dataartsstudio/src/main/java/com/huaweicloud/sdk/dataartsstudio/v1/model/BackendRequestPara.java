package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BackendRequestPara
 */
public class BackendRequestPara {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 参数位置
     */
    public static final class PositionEnum {

        /**
         * Enum REQUEST_PARAMETER_POSITION_PATH for value: "REQUEST_PARAMETER_POSITION_PATH"
         */
        public static final PositionEnum REQUEST_PARAMETER_POSITION_PATH =
            new PositionEnum("REQUEST_PARAMETER_POSITION_PATH");

        /**
         * Enum REQUEST_PARAMETER_POSITION_HEADER for value: "REQUEST_PARAMETER_POSITION_HEADER"
         */
        public static final PositionEnum REQUEST_PARAMETER_POSITION_HEADER =
            new PositionEnum("REQUEST_PARAMETER_POSITION_HEADER");

        /**
         * Enum REQUEST_PARAMETER_POSITION_QUERY for value: "REQUEST_PARAMETER_POSITION_QUERY"
         */
        public static final PositionEnum REQUEST_PARAMETER_POSITION_QUERY =
            new PositionEnum("REQUEST_PARAMETER_POSITION_QUERY");

        private static final Map<String, PositionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PositionEnum> createStaticFields() {
            Map<String, PositionEnum> map = new HashMap<>();
            map.put("REQUEST_PARAMETER_POSITION_PATH", REQUEST_PARAMETER_POSITION_PATH);
            map.put("REQUEST_PARAMETER_POSITION_HEADER", REQUEST_PARAMETER_POSITION_HEADER);
            map.put("REQUEST_PARAMETER_POSITION_QUERY", REQUEST_PARAMETER_POSITION_QUERY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PositionEnum(String value) {
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
        public static PositionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PositionEnum(value));
        }

        public static PositionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PositionEnum) {
                return this.value.equals(((PositionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private PositionEnum position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_para_name")

    private String backendParaName;

    public BackendRequestPara withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * api请求参数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackendRequestPara withPosition(PositionEnum position) {
        this.position = position;
        return this;
    }

    /**
     * 参数位置
     * @return position
     */
    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }

    public BackendRequestPara withBackendParaName(String backendParaName) {
        this.backendParaName = backendParaName;
        return this;
    }

    /**
     * 对应的后端参数
     * @return backendParaName
     */
    public String getBackendParaName() {
        return backendParaName;
    }

    public void setBackendParaName(String backendParaName) {
        this.backendParaName = backendParaName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackendRequestPara that = (BackendRequestPara) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.position, that.position)
            && Objects.equals(this.backendParaName, that.backendParaName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, backendParaName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackendRequestPara {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    backendParaName: ").append(toIndentedString(backendParaName)).append("\n");
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
