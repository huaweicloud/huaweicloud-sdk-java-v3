package com.huaweicloud.sdk.cdn.v1.model;




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
 * 源站信息
 */
public class SourceWithPort  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_or_domain")
    
    private String ipOrDomain;
    /**
     * 源站类型（\"ipaddr\"： \"IP源站\"；\"domain\"： \"域名源站\"；\"obs_bucket\"： \"OBS Bucket源站\"）
     */
    public static final class OriginTypeEnum {

        
        /**
         * Enum IPADDR for value: "ipaddr"
         */
        public static final OriginTypeEnum IPADDR = new OriginTypeEnum("ipaddr");
        
        /**
         * Enum DOMAIN for value: "domain"
         */
        public static final OriginTypeEnum DOMAIN = new OriginTypeEnum("domain");
        
        /**
         * Enum OBS_BUCKET for value: "obs_bucket"
         */
        public static final OriginTypeEnum OBS_BUCKET = new OriginTypeEnum("obs_bucket");
        

        private static final Map<String, OriginTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginTypeEnum> createStaticFields() {
            Map<String, OriginTypeEnum> map = new HashMap<>();
            map.put("ipaddr", IPADDR);
            map.put("domain", DOMAIN);
            map.put("obs_bucket", OBS_BUCKET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginTypeEnum(String value) {
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
        public static OriginTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OriginTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OriginTypeEnum(value);
            }
            return result;
        }

        public static OriginTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OriginTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OriginTypeEnum) {
                return this.value.equals(((OriginTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="origin_type")
    
    private OriginTypeEnum originType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="active_standby")
    
    private Integer activeStandby;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_obs_web_hosting")
    
    private Integer enableObsWebHosting;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http_port")
    
    private Integer httpPort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="https_port")
    
    private Integer httpsPort;

    public SourceWithPort withIpOrDomain(String ipOrDomain) {
        this.ipOrDomain = ipOrDomain;
        return this;
    }

    


    /**
     * 源站IP或者域名。
     * @return ipOrDomain
     */
    public String getIpOrDomain() {
        return ipOrDomain;
    }

    public void setIpOrDomain(String ipOrDomain) {
        this.ipOrDomain = ipOrDomain;
    }

    

    public SourceWithPort withOriginType(OriginTypeEnum originType) {
        this.originType = originType;
        return this;
    }

    


    /**
     * 源站类型（\"ipaddr\"： \"IP源站\"；\"domain\"： \"域名源站\"；\"obs_bucket\"： \"OBS Bucket源站\"）
     * @return originType
     */
    public OriginTypeEnum getOriginType() {
        return originType;
    }

    public void setOriginType(OriginTypeEnum originType) {
        this.originType = originType;
    }

    

    public SourceWithPort withActiveStandby(Integer activeStandby) {
        this.activeStandby = activeStandby;
        return this;
    }

    


    /**
     * 主备状态（1代表主站；0代表备站）；主源站必须存在，备源站可选。
     * @return activeStandby
     */
    public Integer getActiveStandby() {
        return activeStandby;
    }

    public void setActiveStandby(Integer activeStandby) {
        this.activeStandby = activeStandby;
    }

    

    public SourceWithPort withEnableObsWebHosting(Integer enableObsWebHosting) {
        this.enableObsWebHosting = enableObsWebHosting;
        return this;
    }

    


    /**
     * 是否开启Obs静态网站托管(0表示关闭,1表示则为开启)，源站类型为obs_bucket时传递。
     * @return enableObsWebHosting
     */
    public Integer getEnableObsWebHosting() {
        return enableObsWebHosting;
    }

    public void setEnableObsWebHosting(Integer enableObsWebHosting) {
        this.enableObsWebHosting = enableObsWebHosting;
    }

    

    public SourceWithPort withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    


    /**
     * HTTP端口，默认80
     * @return httpPort
     */
    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    

    public SourceWithPort withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    


    /**
     * HTTPS端口，默认443
     * @return httpsPort
     */
    public Integer getHttpsPort() {
        return httpsPort;
    }

    public void setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceWithPort sourceWithPort = (SourceWithPort) o;
        return Objects.equals(this.ipOrDomain, sourceWithPort.ipOrDomain) &&
            Objects.equals(this.originType, sourceWithPort.originType) &&
            Objects.equals(this.activeStandby, sourceWithPort.activeStandby) &&
            Objects.equals(this.enableObsWebHosting, sourceWithPort.enableObsWebHosting) &&
            Objects.equals(this.httpPort, sourceWithPort.httpPort) &&
            Objects.equals(this.httpsPort, sourceWithPort.httpsPort);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ipOrDomain, originType, activeStandby, enableObsWebHosting, httpPort, httpsPort);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceWithPort {\n");
        sb.append("    ipOrDomain: ").append(toIndentedString(ipOrDomain)).append("\n");
        sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
        sb.append("    activeStandby: ").append(toIndentedString(activeStandby)).append("\n");
        sb.append("    enableObsWebHosting: ").append(toIndentedString(enableObsWebHosting)).append("\n");
        sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
        sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
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

