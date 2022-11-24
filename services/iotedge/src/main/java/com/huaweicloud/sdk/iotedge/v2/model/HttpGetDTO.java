package com.huaweicloud.sdk.iotedge.v2.model;




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
 * HttpGetDTO
 */
public class HttpGetDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    
    private String host;
    /**
     * 协议类型
     */
    public static final class SchemeEnum {

        
        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final SchemeEnum HTTP = new SchemeEnum("HTTP");
        
        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final SchemeEnum HTTPS = new SchemeEnum("HTTPS");
        

        private static final Map<String, SchemeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SchemeEnum> createStaticFields() {
            Map<String, SchemeEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SchemeEnum(String value) {
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
        public static SchemeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SchemeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SchemeEnum(value);
            }
            return result;
        }

        public static SchemeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SchemeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SchemeEnum) {
                return this.value.equals(((SchemeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scheme")
    
    
    private SchemeEnum scheme;

    public HttpGetDTO withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 请求路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public HttpGetDTO withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 端口
     * minimum: 1
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    

    public HttpGetDTO withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 主机地址
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public HttpGetDTO withScheme(SchemeEnum scheme) {
        this.scheme = scheme;
        return this;
    }

    


    /**
     * 协议类型
     * @return scheme
     */
    public SchemeEnum getScheme() {
        return scheme;
    }

    public void setScheme(SchemeEnum scheme) {
        this.scheme = scheme;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HttpGetDTO httpGetDTO = (HttpGetDTO) o;
        return Objects.equals(this.path, httpGetDTO.path) &&
            Objects.equals(this.port, httpGetDTO.port) &&
            Objects.equals(this.host, httpGetDTO.host) &&
            Objects.equals(this.scheme, httpGetDTO.scheme);
    }
    @Override
    public int hashCode() {
        return Objects.hash(path, port, host, scheme);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpGetDTO {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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

