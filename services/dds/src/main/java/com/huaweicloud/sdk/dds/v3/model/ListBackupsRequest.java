package com.huaweicloud.sdk.dds.v3.model;




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
     * 备份类型。 - 取值为“Auto”，表示自动全量备份。 - 取值为“Manual”，表示手动全量备份。 - 取值为“Incremental”，表示自动增量备份。 - 当该字段未传入值时，默认只查询所有的全量备份，包括自动全备备份和手动全量备份。当该字段取值为“Incremental”时，实例ID必传。
     */
    public static final class BackupTypeEnum {

        
        /**
         * Enum AUTO for value: "Auto"
         */
        public static final BackupTypeEnum AUTO = new BackupTypeEnum("Auto");
        
        /**
         * Enum MANUAL for value: "Manual"
         */
        public static final BackupTypeEnum MANUAL = new BackupTypeEnum("Manual");
        
        /**
         * Enum INCREMENTAL for value: "Incremental"
         */
        public static final BackupTypeEnum INCREMENTAL = new BackupTypeEnum("Incremental");
        

        private static final Map<String, BackupTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackupTypeEnum> createStaticFields() {
            Map<String, BackupTypeEnum> map = new HashMap<>();
            map.put("Auto", AUTO);
            map.put("Manual", MANUAL);
            map.put("Incremental", INCREMENTAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackupTypeEnum(String value) {
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
        public static BackupTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            BackupTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BackupTypeEnum(value);
            }
            return result;
        }

        public static BackupTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            BackupTypeEnum result = STATIC_FIELDS.get(value);
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
     * 实例模式。 取值： - Sharding - ReplicaSet - Single
     */
    public static final class ModeEnum {

        
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
        

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Sharding", SHARDING);
            map.put("ReplicaSet", REPLICASET);
            map.put("Single", SINGLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
     * 实例ID，可以调用“查询实例列表”接口获取。如果未申请实例，可以调用“创建实例”接口创建。
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
     * 备份ID。 - 当该字段传入的备份ID归属为自动增量备份时，实例ID必传。
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
     * 备份类型。 - 取值为“Auto”，表示自动全量备份。 - 取值为“Manual”，表示手动全量备份。 - 取值为“Incremental”，表示自动增量备份。 - 当该字段未传入值时，默认只查询所有的全量备份，包括自动全备备份和手动全量备份。当该字段取值为“Incremental”时，实例ID必传。
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
     * 索引位置偏移量，表示从指定project ID下最新的实例创建时间开始，按时间的先后顺序偏移offset条数据后查询对应的实例信息。 取值大于或等于0。不传该参数时，查询偏移量默认为0，表示从最新的实例创建时间对应的实例开始查询。
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
     * 查询备份个数上限值。 取值范围：1~100。不传该参数时，默认查询前100条实例信息。
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
     * 查询开始时间，格式为“yyyy-mm-dd hh:mm:ss”。该时间为UTC时间。 “end_time”有值时，“begin_time”必选。
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
     * 查询结束时间，格式为“yyyy-mm-ddThh:mm:ssZ”，且大于查询开始时间。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 “begin_time”有值时，“end_time”必选。
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
     * 实例模式。 取值： - Sharding - ReplicaSet - Single
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

