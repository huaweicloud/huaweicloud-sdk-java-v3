package com.huaweicloud.sdk.sms.v3.model;




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
 * 源端复制状态
 */
public class PutCopyStateReq  {

    /**
     * 源端服务器状
     */
    public static final class CopystateEnum {

        
        /**
         * Enum UNAVAILABLE for value: "UNAVAILABLE"
         */
        public static final CopystateEnum UNAVAILABLE = new CopystateEnum("UNAVAILABLE");
        
        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final CopystateEnum WAITING = new CopystateEnum("WAITING");
        
        /**
         * Enum INIT for value: "INIT"
         */
        public static final CopystateEnum INIT = new CopystateEnum("INIT");
        
        /**
         * Enum REPLICATE for value: "REPLICATE"
         */
        public static final CopystateEnum REPLICATE = new CopystateEnum("REPLICATE");
        
        /**
         * Enum SYNCING for value: "SYNCING"
         */
        public static final CopystateEnum SYNCING = new CopystateEnum("SYNCING");
        
        /**
         * Enum STOPPING for value: "STOPPING"
         */
        public static final CopystateEnum STOPPING = new CopystateEnum("STOPPING");
        
        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final CopystateEnum STOPPED = new CopystateEnum("STOPPED");
        
        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final CopystateEnum DELETING = new CopystateEnum("DELETING");
        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final CopystateEnum ERROR = new CopystateEnum("ERROR");
        
        /**
         * Enum CLONING for value: "CLONING"
         */
        public static final CopystateEnum CLONING = new CopystateEnum("CLONING");
        
        /**
         * Enum CUTOVERING for value: "CUTOVERING"
         */
        public static final CopystateEnum CUTOVERING = new CopystateEnum("CUTOVERING");
        

        private static final Map<String, CopystateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CopystateEnum> createStaticFields() {
            Map<String, CopystateEnum> map = new HashMap<>();
            map.put("UNAVAILABLE", UNAVAILABLE);
            map.put("WAITING", WAITING);
            map.put("INIT", INIT);
            map.put("REPLICATE", REPLICATE);
            map.put("SYNCING", SYNCING);
            map.put("STOPPING", STOPPING);
            map.put("STOPPED", STOPPED);
            map.put("DELETING", DELETING);
            map.put("ERROR", ERROR);
            map.put("CLONING", CLONING);
            map.put("CUTOVERING", CUTOVERING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CopystateEnum(String value) {
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
        public static CopystateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CopystateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CopystateEnum(value);
            }
            return result;
        }

        public static CopystateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CopystateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CopystateEnum) {
                return this.value.equals(((CopystateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="copystate")
    
    private CopystateEnum copystate;
    /**
     * 迁移周期
     */
    public static final class MigrationcycleEnum {

        
        /**
         * Enum CUTOVERING for value: "cutovering"
         */
        public static final MigrationcycleEnum CUTOVERING = new MigrationcycleEnum("cutovering");
        
        /**
         * Enum CUTOVERED for value: "cutovered"
         */
        public static final MigrationcycleEnum CUTOVERED = new MigrationcycleEnum("cutovered");
        
        /**
         * Enum CHECKING for value: "checking"
         */
        public static final MigrationcycleEnum CHECKING = new MigrationcycleEnum("checking");
        
        /**
         * Enum SETTING for value: "setting"
         */
        public static final MigrationcycleEnum SETTING = new MigrationcycleEnum("setting");
        
        /**
         * Enum REPLICATING for value: "replicating"
         */
        public static final MigrationcycleEnum REPLICATING = new MigrationcycleEnum("replicating");
        
        /**
         * Enum SYNCING for value: "syncing"
         */
        public static final MigrationcycleEnum SYNCING = new MigrationcycleEnum("syncing");
        

        private static final Map<String, MigrationcycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MigrationcycleEnum> createStaticFields() {
            Map<String, MigrationcycleEnum> map = new HashMap<>();
            map.put("cutovering", CUTOVERING);
            map.put("cutovered", CUTOVERED);
            map.put("checking", CHECKING);
            map.put("setting", SETTING);
            map.put("replicating", REPLICATING);
            map.put("syncing", SYNCING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MigrationcycleEnum(String value) {
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
        public static MigrationcycleEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            MigrationcycleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MigrationcycleEnum(value);
            }
            return result;
        }

        public static MigrationcycleEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MigrationcycleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MigrationcycleEnum) {
                return this.value.equals(((MigrationcycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migrationcycle")
    
    private MigrationcycleEnum migrationcycle;

    public PutCopyStateReq withCopystate(CopystateEnum copystate) {
        this.copystate = copystate;
        return this;
    }

    


    /**
     * 源端服务器状
     * @return copystate
     */
    public CopystateEnum getCopystate() {
        return copystate;
    }

    public void setCopystate(CopystateEnum copystate) {
        this.copystate = copystate;
    }

    

    public PutCopyStateReq withMigrationcycle(MigrationcycleEnum migrationcycle) {
        this.migrationcycle = migrationcycle;
        return this;
    }

    


    /**
     * 迁移周期
     * @return migrationcycle
     */
    public MigrationcycleEnum getMigrationcycle() {
        return migrationcycle;
    }

    public void setMigrationcycle(MigrationcycleEnum migrationcycle) {
        this.migrationcycle = migrationcycle;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutCopyStateReq putCopyStateReq = (PutCopyStateReq) o;
        return Objects.equals(this.copystate, putCopyStateReq.copystate) &&
            Objects.equals(this.migrationcycle, putCopyStateReq.migrationcycle);
    }
    @Override
    public int hashCode() {
        return Objects.hash(copystate, migrationcycle);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutCopyStateReq {\n");
        sb.append("    copystate: ").append(toIndentedString(copystate)).append("\n");
        sb.append("    migrationcycle: ").append(toIndentedString(migrationcycle)).append("\n");
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

