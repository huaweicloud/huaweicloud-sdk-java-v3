package com.huaweicloud.sdk.ecs.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * GetServerRemoteConsoleOption
 */
public class GetServerRemoteConsoleOption  {

    /**
     * 远程登录协议，请将protocol配置为“vnc”。
     */
    public static final class ProtocolEnum {

        
        /**
         * Enum VNC for value: "vnc"
         */
        public static final ProtocolEnum VNC = new ProtocolEnum("vnc");
        

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("vnc", VNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtocolEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private ProtocolEnum protocol;
    /**
     * 远程登录的类型，请将type配置为“novnc”。
     */
    public static final class TypeEnum {

        
        /**
         * Enum NOVNC for value: "novnc"
         */
        public static final TypeEnum NOVNC = new TypeEnum("novnc");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("novnc", NOVNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof TypeEnum) {
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
    @JsonProperty(value="type")
    
    private TypeEnum type;

    public GetServerRemoteConsoleOption withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 远程登录协议，请将protocol配置为“vnc”。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public GetServerRemoteConsoleOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 远程登录的类型，请将type配置为“novnc”。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetServerRemoteConsoleOption getServerRemoteConsoleOption = (GetServerRemoteConsoleOption) o;
        return Objects.equals(this.protocol, getServerRemoteConsoleOption.protocol) &&
            Objects.equals(this.type, getServerRemoteConsoleOption.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(protocol, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetServerRemoteConsoleOption {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

