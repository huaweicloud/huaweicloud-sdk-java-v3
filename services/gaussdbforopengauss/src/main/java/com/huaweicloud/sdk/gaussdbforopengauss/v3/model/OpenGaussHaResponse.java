package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例部署形态。
 */
public class OpenGaussHaResponse  {

    /**
     * GaussDB(for openGauss) 分布式模式，返回值为：Enterprise（企业版）；主备版，返回值为：Ha(主备版)。
     */
    public static final class ModeEnum {

        
        /**
         * Enum ENTERPRISE for value: "Enterprise"
         */
        public static final ModeEnum ENTERPRISE = new ModeEnum("Enterprise");
        
        /**
         * Enum HA for value: "Ha"
         */
        public static final ModeEnum HA = new ModeEnum("Ha");
        

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Enterprise", ENTERPRISE);
            map.put("Ha", HA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ModeEnum(value);
            }
            return result;
        }

        public static ModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    @JacksonXmlProperty(localName = "mode")
    
    private ModeEnum mode;
    /**
     * 备机同步参数。  取值：  GaussDB(for openGauss)为“sync”。 说明： - “sync”为同步模式。
     */
    public static final class ReplicationModeEnum {

        
        /**
         * Enum SYNC for value: "sync"
         */
        public static final ReplicationModeEnum SYNC = new ReplicationModeEnum("sync");
        

        private static final Map<String, ReplicationModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplicationModeEnum> createStaticFields() {
            Map<String, ReplicationModeEnum> map = new HashMap<>();
            map.put("sync", SYNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplicationModeEnum(String value) {
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
        public static ReplicationModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ReplicationModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReplicationModeEnum(value);
            }
            return result;
        }

        public static ReplicationModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ReplicationModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplicationModeEnum) {
                return this.value.equals(((ReplicationModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication_mode")
    
    @JacksonXmlProperty(localName = "replication_mode")
    
    private ReplicationModeEnum replicationMode;
    /**
     * GaussDB(for openGauss)的预留参数：指定实例一致性类型，取值范围：strong（强一致性） | eventual(最终一致性)。
     */
    public static final class ConsistencyEnum {

        
        /**
         * Enum STRONG for value: "strong"
         */
        public static final ConsistencyEnum STRONG = new ConsistencyEnum("strong");
        
        /**
         * Enum EVENTUAL for value: "eventual"
         */
        public static final ConsistencyEnum EVENTUAL = new ConsistencyEnum("eventual");
        

        private static final Map<String, ConsistencyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConsistencyEnum> createStaticFields() {
            Map<String, ConsistencyEnum> map = new HashMap<>();
            map.put("strong", STRONG);
            map.put("eventual", EVENTUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConsistencyEnum(String value) {
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
        public static ConsistencyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ConsistencyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConsistencyEnum(value);
            }
            return result;
        }

        public static ConsistencyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ConsistencyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConsistencyEnum) {
                return this.value.equals(((ConsistencyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consistency")
    
    @JacksonXmlProperty(localName = "consistency")
    
    private ConsistencyEnum consistency;

    public OpenGaussHaResponse withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * GaussDB(for openGauss) 分布式模式，返回值为：Enterprise（企业版）；主备版，返回值为：Ha(主备版)。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    

    public OpenGaussHaResponse withReplicationMode(ReplicationModeEnum replicationMode) {
        this.replicationMode = replicationMode;
        return this;
    }

    


    /**
     * 备机同步参数。  取值：  GaussDB(for openGauss)为“sync”。 说明： - “sync”为同步模式。
     * @return replicationMode
     */
    public ReplicationModeEnum getReplicationMode() {
        return replicationMode;
    }

    public void setReplicationMode(ReplicationModeEnum replicationMode) {
        this.replicationMode = replicationMode;
    }

    

    public OpenGaussHaResponse withConsistency(ConsistencyEnum consistency) {
        this.consistency = consistency;
        return this;
    }

    


    /**
     * GaussDB(for openGauss)的预留参数：指定实例一致性类型，取值范围：strong（强一致性） | eventual(最终一致性)。
     * @return consistency
     */
    public ConsistencyEnum getConsistency() {
        return consistency;
    }

    public void setConsistency(ConsistencyEnum consistency) {
        this.consistency = consistency;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenGaussHaResponse openGaussHaResponse = (OpenGaussHaResponse) o;
        return Objects.equals(this.mode, openGaussHaResponse.mode) &&
            Objects.equals(this.replicationMode, openGaussHaResponse.replicationMode) &&
            Objects.equals(this.consistency, openGaussHaResponse.consistency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mode, replicationMode, consistency);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussHaResponse {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    replicationMode: ").append(toIndentedString(replicationMode)).append("\n");
        sb.append("    consistency: ").append(toIndentedString(consistency)).append("\n");
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

