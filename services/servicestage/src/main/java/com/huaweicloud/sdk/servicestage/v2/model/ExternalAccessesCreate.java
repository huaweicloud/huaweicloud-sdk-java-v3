package com.huaweicloud.sdk.servicestage.v2.model;




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
 * 外网访问。
 */
public class ExternalAccessesCreate  {

    /**
     * 协议，支持http、https。
     */
    public static final class ProtocolEnum {

        
        /**
         * Enum HTTP for value: "http"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("http");
        
        /**
         * Enum HTTPS for value: "https"
         */
        public static final ProtocolEnum HTTPS = new ProtocolEnum("https");
        

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("http", HTTP);
            map.put("https", HTTPS);
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="forward_port")
    
    private Integer forwardPort;

    public ExternalAccessesCreate withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 协议，支持http、https。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public ExternalAccessesCreate withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * 访问地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ExternalAccessesCreate withForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
        return this;
    }

    


    /**
     * 端口号。
     * @return forwardPort
     */
    public Integer getForwardPort() {
        return forwardPort;
    }

    public void setForwardPort(Integer forwardPort) {
        this.forwardPort = forwardPort;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalAccessesCreate externalAccessesCreate = (ExternalAccessesCreate) o;
        return Objects.equals(this.protocol, externalAccessesCreate.protocol) &&
            Objects.equals(this.address, externalAccessesCreate.address) &&
            Objects.equals(this.forwardPort, externalAccessesCreate.forwardPort);
    }
    @Override
    public int hashCode() {
        return Objects.hash(protocol, address, forwardPort);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalAccessesCreate {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    forwardPort: ").append(toIndentedString(forwardPort)).append("\n");
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

