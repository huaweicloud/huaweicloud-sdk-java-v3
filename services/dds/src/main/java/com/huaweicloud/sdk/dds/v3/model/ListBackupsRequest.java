package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ListBackupsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_id")
    
    private String backupId;
    /**
     * Gets or Sets backupType
     */
    public static class BackupTypeEnum {

        
        /**
         * Enum AUTO for value: "Auto"
         */
        public static final BackupTypeEnum AUTO = new BackupTypeEnum("Auto");

        
        /**
         * Enum MANUAL for value: "Manual"
         */
        public static final BackupTypeEnum MANUAL = new BackupTypeEnum("Manual");

        

        public static Map<String, BackupTypeEnum> staticFields =
                new HashMap<String, BackupTypeEnum>() {
                    { 
                        put("Auto", AUTO);
                        put("Manual", MANUAL);
                    }
                };

        private String value;

        BackupTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BackupTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            BackupTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new BackupTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static BackupTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            BackupTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof BackupTypeEnum) {
                return this.value.equals(((BackupTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_type")
    
    private BackupTypeEnum backupType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    private String beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;
    /**
     * Gets or Sets mode
     */
    public static class ModeEnum {

        
        /**
         * Enum SHARDING for value: "Sharding"
         */
        public static final ModeEnum SHARDING = new ModeEnum("Sharding");

        
        /**
         * Enum REPLICASET for value: "ReplicaSet"
         */
        public static final ModeEnum REPLICASET = new ModeEnum("ReplicaSet");

        
        /**
         * Enum SINGLE for value: "Single"
         */
        public static final ModeEnum SINGLE = new ModeEnum("Single");

        

        public static Map<String, ModeEnum> staticFields =
                new HashMap<String, ModeEnum>() {
                    { 
                        put("Sharding", SHARDING);
                        put("ReplicaSet", REPLICASET);
                        put("Single", SINGLE);
                    }
                };

        private String value;

        ModeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ModeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ModeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ModeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ModeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ModeEnum) {
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

    public ListBackupsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListBackupsRequest withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    


    /**
     * Get backupId
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public ListBackupsRequest withBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
        return this;
    }

    


    /**
     * Get backupType
     * @return backupType
     */
    public BackupTypeEnum getBackupType() {
        return backupType;
    }

    public void setBackupType(BackupTypeEnum backupType) {
        this.backupType = backupType;
    }

    public ListBackupsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListBackupsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListBackupsRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * Get beginTime
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListBackupsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * Get endTime
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListBackupsRequest withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * Get mode
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackupsRequest listBackupsRequest = (ListBackupsRequest) o;
        return Objects.equals(this.instanceId, listBackupsRequest.instanceId) &&
            Objects.equals(this.backupId, listBackupsRequest.backupId) &&
            Objects.equals(this.backupType, listBackupsRequest.backupType) &&
            Objects.equals(this.offset, listBackupsRequest.offset) &&
            Objects.equals(this.limit, listBackupsRequest.limit) &&
            Objects.equals(this.beginTime, listBackupsRequest.beginTime) &&
            Objects.equals(this.endTime, listBackupsRequest.endTime) &&
            Objects.equals(this.mode, listBackupsRequest.mode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, backupId, backupType, offset, limit, beginTime, endTime, mode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupsRequest {\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
            sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
            sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
            sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
            sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

