package com.huaweicloud.sdk.live.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v1.model.DomainSourceInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LiveDomainCreateReq
 */
public class LiveDomainCreateReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;
    /**
     * 域名类型 - pull表示播放域名 - push表示推流域名 
     */
    public static final class DomainTypeEnum {

        
        /**
         * Enum PULL for value: "pull"
         */
        public static final DomainTypeEnum PULL = new DomainTypeEnum("pull");
        
        /**
         * Enum PUSH for value: "push"
         */
        public static final DomainTypeEnum PUSH = new DomainTypeEnum("push");
        

        private static final Map<String, DomainTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainTypeEnum> createStaticFields() {
            Map<String, DomainTypeEnum> map = new HashMap<>();
            map.put("pull", PULL);
            map.put("push", PUSH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DomainTypeEnum(String value) {
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
        public static DomainTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DomainTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DomainTypeEnum(value);
            }
            return result;
        }

        public static DomainTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DomainTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DomainTypeEnum) {
                return this.value.equals(((DomainTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_type")
    
    private DomainTypeEnum domainType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_source")
    
    private DomainSourceInfo domainSource = null;

    public LiveDomainCreateReq withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 直播域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public LiveDomainCreateReq withDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
        return this;
    }

    


    /**
     * 域名类型 - pull表示播放域名 - push表示推流域名 
     * @return domainType
     */
    public DomainTypeEnum getDomainType() {
        return domainType;
    }

    public void setDomainType(DomainTypeEnum domainType) {
        this.domainType = domainType;
    }

    public LiveDomainCreateReq withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 直播所属的直播中心
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public LiveDomainCreateReq withDomainSource(DomainSourceInfo domainSource) {
        this.domainSource = domainSource;
        return this;
    }

    public LiveDomainCreateReq withDomainSource(Consumer<DomainSourceInfo> domainSourceSetter) {
        if(this.domainSource == null ){
            this.domainSource = new DomainSourceInfo();
            domainSourceSetter.accept(this.domainSource);
        }
        
        return this;
    }


    /**
     * Get domainSource
     * @return domainSource
     */
    public DomainSourceInfo getDomainSource() {
        return domainSource;
    }

    public void setDomainSource(DomainSourceInfo domainSource) {
        this.domainSource = domainSource;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveDomainCreateReq liveDomainCreateReq = (LiveDomainCreateReq) o;
        return Objects.equals(this.domain, liveDomainCreateReq.domain) &&
            Objects.equals(this.domainType, liveDomainCreateReq.domainType) &&
            Objects.equals(this.region, liveDomainCreateReq.region) &&
            Objects.equals(this.domainSource, liveDomainCreateReq.domainSource);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, domainType, region, domainSource);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveDomainCreateReq {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    domainSource: ").append(toIndentedString(domainSource)).append("\n");
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

