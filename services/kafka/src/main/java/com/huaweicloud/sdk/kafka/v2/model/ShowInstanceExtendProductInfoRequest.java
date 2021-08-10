package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ShowInstanceExtendProductInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /** 产品的类型。 - advanced: 专享版 - platinum: 铂金版 - dec: 专属云版 - exp: 体验版 */
    public static final class TypeEnum {

        /** Enum ADVANCED for value: "advanced" */
        public static final TypeEnum ADVANCED = new TypeEnum("advanced");

        /** Enum PLATINUM for value: "platinum" */
        public static final TypeEnum PLATINUM = new TypeEnum("platinum");

        /** Enum DEC for value: "dec" */
        public static final TypeEnum DEC = new TypeEnum("dec");

        /** Enum EXP for value: "exp" */
        public static final TypeEnum EXP = new TypeEnum("exp");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("advanced", ADVANCED);
            map.put("platinum", PLATINUM);
            map.put("dec", DEC);
            map.put("exp", EXP);
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
    @JsonProperty(value = "engine")

    private String engine;

    public ShowInstanceExtendProductInfoRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID。
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowInstanceExtendProductInfoRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 产品的类型。 - advanced: 专享版 - platinum: 铂金版 - dec: 专属云版 - exp: 体验版
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowInstanceExtendProductInfoRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /** 消息引擎的类型。当前支持的类型为kafka。
     * 
     * @return engine */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceExtendProductInfoRequest showInstanceExtendProductInfoRequest =
            (ShowInstanceExtendProductInfoRequest) o;
        return Objects.equals(this.instanceId, showInstanceExtendProductInfoRequest.instanceId)
            && Objects.equals(this.type, showInstanceExtendProductInfoRequest.type)
            && Objects.equals(this.engine, showInstanceExtendProductInfoRequest.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, type, engine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceExtendProductInfoRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
