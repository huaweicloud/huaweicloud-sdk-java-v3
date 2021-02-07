package com.huaweicloud.sdk.roma.v2.model;




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
 * UrlDomain
 */
public class UrlDomain  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cname_status")
    
    private Integer cnameStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_id")
    
    private String sslId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_name")
    
    private String sslName;
    /**
     * 最小ssl协议版本号。支持TLSv1.1或TLSv1.2
     */
    public static final class MinSslVersionEnum {

        
        /**
         * Enum TLSV1_1 for value: "TLSv1.1"
         */
        public static final MinSslVersionEnum TLSV1_1 = new MinSslVersionEnum("TLSv1.1");
        
        /**
         * Enum TLSV1_2 for value: "TLSv1.2"
         */
        public static final MinSslVersionEnum TLSV1_2 = new MinSslVersionEnum("TLSv1.2");
        

        private static final Map<String, MinSslVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MinSslVersionEnum> createStaticFields() {
            Map<String, MinSslVersionEnum> map = new HashMap<>();
            map.put("TLSv1.1", TLSV1_1);
            map.put("TLSv1.2", TLSV1_2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MinSslVersionEnum(String value) {
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
        public static MinSslVersionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            MinSslVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MinSslVersionEnum(value);
            }
            return result;
        }

        public static MinSslVersionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MinSslVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof MinSslVersionEnum) {
                return this.value.equals(((MinSslVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_ssl_version")
    
    private MinSslVersionEnum minSslVersion = MinSslVersionEnum.TLSV1_1;

    public UrlDomain withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 域名编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UrlDomain withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 访问域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public UrlDomain withCnameStatus(Integer cnameStatus) {
        this.cnameStatus = cnameStatus;
        return this;
    }

    


    /**
     * 域名cname状态： - 1：未解析 - 2：解析中 - 3：解析成功 - 4：解析失败
     * @return cnameStatus
     */
    public Integer getCnameStatus() {
        return cnameStatus;
    }

    public void setCnameStatus(Integer cnameStatus) {
        this.cnameStatus = cnameStatus;
    }

    public UrlDomain withSslId(String sslId) {
        this.sslId = sslId;
        return this;
    }

    


    /**
     * SSL证书编号
     * @return sslId
     */
    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }

    public UrlDomain withSslName(String sslName) {
        this.sslName = sslName;
        return this;
    }

    


    /**
     * SSL证书名称
     * @return sslName
     */
    public String getSslName() {
        return sslName;
    }

    public void setSslName(String sslName) {
        this.sslName = sslName;
    }

    public UrlDomain withMinSslVersion(MinSslVersionEnum minSslVersion) {
        this.minSslVersion = minSslVersion;
        return this;
    }

    


    /**
     * 最小ssl协议版本号。支持TLSv1.1或TLSv1.2
     * @return minSslVersion
     */
    public MinSslVersionEnum getMinSslVersion() {
        return minSslVersion;
    }

    public void setMinSslVersion(MinSslVersionEnum minSslVersion) {
        this.minSslVersion = minSslVersion;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UrlDomain urlDomain = (UrlDomain) o;
        return Objects.equals(this.id, urlDomain.id) &&
            Objects.equals(this.domain, urlDomain.domain) &&
            Objects.equals(this.cnameStatus, urlDomain.cnameStatus) &&
            Objects.equals(this.sslId, urlDomain.sslId) &&
            Objects.equals(this.sslName, urlDomain.sslName) &&
            Objects.equals(this.minSslVersion, urlDomain.minSslVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, domain, cnameStatus, sslId, sslName, minSslVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlDomain {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    cnameStatus: ").append(toIndentedString(cnameStatus)).append("\n");
        sb.append("    sslId: ").append(toIndentedString(sslId)).append("\n");
        sb.append("    sslName: ").append(toIndentedString(sslName)).append("\n");
        sb.append("    minSslVersion: ").append(toIndentedString(minSslVersion)).append("\n");
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

