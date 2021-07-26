package com.huaweicloud.sdk.waf.v1.model;




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
 * 独享模式回源服务器配置
 */
public class CloudWafServer  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="front_protocol")
    
    private String frontProtocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="back_protocol")
    
    private String backProtocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;
    /**
     * 源站地址为ipv4或ipv6
     */
    public static final class TypeEnum {

        
        /**
         * Enum IPV4 for value: "ipv4"
         */
        public static final TypeEnum IPV4 = new TypeEnum("ipv4");
        
        /**
         * Enum IPV6 for value: "ipv6"
         */
        public static final TypeEnum IPV6 = new TypeEnum("ipv6");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ipv4", IPV4);
            map.put("ipv6", IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
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

    public CloudWafServer withFrontProtocol(String frontProtocol) {
        this.frontProtocol = frontProtocol;
        return this;
    }

    


    /**
     * 对外协议
     * @return frontProtocol
     */
    public String getFrontProtocol() {
        return frontProtocol;
    }

    public void setFrontProtocol(String frontProtocol) {
        this.frontProtocol = frontProtocol;
    }

    

    public CloudWafServer withBackProtocol(String backProtocol) {
        this.backProtocol = backProtocol;
        return this;
    }

    


    /**
     * 源站协议
     * @return backProtocol
     */
    public String getBackProtocol() {
        return backProtocol;
    }

    public void setBackProtocol(String backProtocol) {
        this.backProtocol = backProtocol;
    }

    

    public CloudWafServer withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * 源站地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public CloudWafServer withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 源站端口
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    

    public CloudWafServer withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 源站地址为ipv4或ipv6
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
        CloudWafServer cloudWafServer = (CloudWafServer) o;
        return Objects.equals(this.frontProtocol, cloudWafServer.frontProtocol) &&
            Objects.equals(this.backProtocol, cloudWafServer.backProtocol) &&
            Objects.equals(this.address, cloudWafServer.address) &&
            Objects.equals(this.port, cloudWafServer.port) &&
            Objects.equals(this.type, cloudWafServer.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(frontProtocol, backProtocol, address, port, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudWafServer {\n");
        sb.append("    frontProtocol: ").append(toIndentedString(frontProtocol)).append("\n");
        sb.append("    backProtocol: ").append(toIndentedString(backProtocol)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

