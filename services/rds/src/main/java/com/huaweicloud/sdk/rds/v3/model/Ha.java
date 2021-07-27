package com.huaweicloud.sdk.rds.v3.model;




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
 * HA配置参数，创建HA实例时使用。
 */
public class Ha  {

    /**
     * 实例主备模式，取值：Ha（主备），不区分大小写。
     */
    public static final class ModeEnum {

        
        /**
         * Enum HA for value: "Ha"
         */
        public static final ModeEnum HA = new ModeEnum("Ha");
        
        /**
         * Enum SINGLE for value: "Single"
         */
        public static final ModeEnum SINGLE = new ModeEnum("Single");
        

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Ha", HA);
            map.put("Single", SINGLE);
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
    
    private ModeEnum mode;
    /**
     * 备机同步参数。实例主备模式为Ha时有效。 取值： - MySQL为“async”或“semisync”。 - PostgreSQL为“async”或“sync”。 - Microsoft SQL Server为“sync”。
     */
    public static final class ReplicationModeEnum {

        
        /**
         * Enum ASYNC for value: "async"
         */
        public static final ReplicationModeEnum ASYNC = new ReplicationModeEnum("async");
        
        /**
         * Enum SEMISYNC for value: "semisync"
         */
        public static final ReplicationModeEnum SEMISYNC = new ReplicationModeEnum("semisync");
        
        /**
         * Enum SYNC for value: "sync"
         */
        public static final ReplicationModeEnum SYNC = new ReplicationModeEnum("sync");
        

        private static final Map<String, ReplicationModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplicationModeEnum> createStaticFields() {
            Map<String, ReplicationModeEnum> map = new HashMap<>();
            map.put("async", ASYNC);
            map.put("semisync", SEMISYNC);
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
    
    private ReplicationModeEnum replicationMode;

    public Ha withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 实例主备模式，取值：Ha（主备），不区分大小写。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    

    public Ha withReplicationMode(ReplicationModeEnum replicationMode) {
        this.replicationMode = replicationMode;
        return this;
    }

    


    /**
     * 备机同步参数。实例主备模式为Ha时有效。 取值： - MySQL为“async”或“semisync”。 - PostgreSQL为“async”或“sync”。 - Microsoft SQL Server为“sync”。
     * @return replicationMode
     */
    public ReplicationModeEnum getReplicationMode() {
        return replicationMode;
    }

    public void setReplicationMode(ReplicationModeEnum replicationMode) {
        this.replicationMode = replicationMode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ha ha = (Ha) o;
        return Objects.equals(this.mode, ha.mode) &&
            Objects.equals(this.replicationMode, ha.replicationMode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mode, replicationMode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ha {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    replicationMode: ").append(toIndentedString(replicationMode)).append("\n");
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

