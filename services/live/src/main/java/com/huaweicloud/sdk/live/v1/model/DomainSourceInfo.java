package com.huaweicloud.sdk.live.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DomainSourceInfo
 */
public class DomainSourceInfo  {

    /**
     * 回源、转推协议。
     */
    public static final class ProtocolEnum {

        
        /**
         * Enum RTMP for value: "rtmp"
         */
        public static final ProtocolEnum RTMP = new ProtocolEnum("rtmp");
        
        /**
         * Enum HTTP for value: "http"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("http");
        

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("rtmp", RTMP);
            map.put("http", HTTP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
     * 源站地址类型
     */
    public static final class SourceTypeEnum {

        
        /**
         * Enum DOMAIN for value: "domain"
         */
        public static final SourceTypeEnum DOMAIN = new SourceTypeEnum("domain");
        
        /**
         * Enum IPADDR for value: "ipaddr"
         */
        public static final SourceTypeEnum IPADDR = new SourceTypeEnum("ipaddr");
        
        /**
         * Enum HUAWEI for value: "huawei"
         */
        public static final SourceTypeEnum HUAWEI = new SourceTypeEnum("huawei");
        

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("domain", DOMAIN);
            map.put("ipaddr", IPADDR);
            map.put("huawei", HUAWEI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SourceTypeEnum(value);
            }
            return result;
        }

        public static SourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_type")
    
    private SourceTypeEnum sourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sources")
    
    private List<String> sources = null;
        /**
     * 多个回源、转推地址的优先级。
     */
    public static final class SourcesPriorityEnum {

        
        /**
         * Enum FIRST for value: "first"
         */
        public static final SourcesPriorityEnum FIRST = new SourcesPriorityEnum("first");
        
        /**
         * Enum ALL for value: "all"
         */
        public static final SourcesPriorityEnum ALL = new SourcesPriorityEnum("all");
        

        private static final Map<String, SourcesPriorityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourcesPriorityEnum> createStaticFields() {
            Map<String, SourcesPriorityEnum> map = new HashMap<>();
            map.put("first", FIRST);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourcesPriorityEnum(String value) {
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
        public static SourcesPriorityEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SourcesPriorityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SourcesPriorityEnum(value);
            }
            return result;
        }

        public static SourcesPriorityEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SourcesPriorityEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SourcesPriorityEnum) {
                return this.value.equals(((SourcesPriorityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sources_priority")
    
    private SourcesPriorityEnum sourcesPriority;

    public DomainSourceInfo withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 回源、转推协议。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    

    public DomainSourceInfo withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    


    /**
     * 源站地址类型
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    

    public DomainSourceInfo withSources(List<String> sources) {
        this.sources = sources;
        return this;
    }

    
    public DomainSourceInfo addSourcesItem(String sourcesItem) {
        if(this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public DomainSourceInfo withSources(Consumer<List<String>> sourcesSetter) {
        if(this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 回源、转推地址列表，格式为：{domain/IP}[:{port}]，port默认值为1935；最少1个，最多10个。
     * @return sources
     */
    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    

    public DomainSourceInfo withSourcesPriority(SourcesPriorityEnum sourcesPriority) {
        this.sourcesPriority = sourcesPriority;
        return this;
    }

    


    /**
     * 多个回源、转推地址的优先级。
     * @return sourcesPriority
     */
    public SourcesPriorityEnum getSourcesPriority() {
        return sourcesPriority;
    }

    public void setSourcesPriority(SourcesPriorityEnum sourcesPriority) {
        this.sourcesPriority = sourcesPriority;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainSourceInfo domainSourceInfo = (DomainSourceInfo) o;
        return Objects.equals(this.protocol, domainSourceInfo.protocol) &&
            Objects.equals(this.sourceType, domainSourceInfo.sourceType) &&
            Objects.equals(this.sources, domainSourceInfo.sources) &&
            Objects.equals(this.sourcesPriority, domainSourceInfo.sourcesPriority);
    }
    @Override
    public int hashCode() {
        return Objects.hash(protocol, sourceType, sources, sourcesPriority);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainSourceInfo {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    sourcesPriority: ").append(toIndentedString(sourcesPriority)).append("\n");
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

