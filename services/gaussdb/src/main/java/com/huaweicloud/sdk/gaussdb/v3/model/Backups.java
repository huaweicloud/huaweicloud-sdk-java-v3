package com.huaweicloud.sdk.gaussdb.v3.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlDatastore;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Backups
 */
public class Backups  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    
    private String beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    
    private String endTime;
    /**
     * 备份状态
     */
    public static final class StatusEnum {

        
        /**
         * Enum BUILDING_ for value: "BUILDING：备份中。"
         */
        public static final StatusEnum BUILDING_ = new StatusEnum("BUILDING：备份中。");
        
        /**
         * Enum COMPLETED_ for value: "COMPLETED：备份完成。"
         */
        public static final StatusEnum COMPLETED_ = new StatusEnum("COMPLETED：备份完成。");
        
        /**
         * Enum FAILED_ for value: "FAILED：备份失败。"
         */
        public static final StatusEnum FAILED_ = new StatusEnum("FAILED：备份失败。");
        
        /**
         * Enum AVAILABLE_ for value: "AVAILABLE：备份可用。"
         */
        public static final StatusEnum AVAILABLE_ = new StatusEnum("AVAILABLE：备份可用。");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("BUILDING：备份中。", BUILDING_);
            map.put("COMPLETED：备份完成。", COMPLETED_);
            map.put("FAILED：备份失败。", FAILED_);
            map.put("AVAILABLE：备份可用。", AVAILABLE_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="take_up_time")
    
    
    private Integer takeUpTime;
    /**
     * 备份类型
     */
    public static final class TypeEnum {

        
        /**
         * Enum AUTO_ for value: "auto：自动全量备份。"
         */
        public static final TypeEnum AUTO_ = new TypeEnum("auto：自动全量备份。");
        
        /**
         * Enum MANUAL_ for value: "manual：手动全量备份。"
         */
        public static final TypeEnum MANUAL_ = new TypeEnum("manual：手动全量备份。");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("auto：自动全量备份。", AUTO_);
            map.put("manual：手动全量备份。", MANUAL_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    
    private Long size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    
    private MysqlDatastore datastore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;
    /**
     * 备份级别。当开启一级备份开关时，返回该参数。
     */
    public static final class BackupLevelEnum {

        
        /**
         * Enum _0_ for value: "0：备份正在创建中或者备份失败。"
         */
        public static final BackupLevelEnum _0_ = new BackupLevelEnum("0：备份正在创建中或者备份失败。");
        
        /**
         * Enum _1_ for value: "1：一级备份。"
         */
        public static final BackupLevelEnum _1_ = new BackupLevelEnum("1：一级备份。");
        
        /**
         * Enum _2_ for value: "2：二级备份。"
         */
        public static final BackupLevelEnum _2_ = new BackupLevelEnum("2：二级备份。");
        

        private static final Map<String, BackupLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackupLevelEnum> createStaticFields() {
            Map<String, BackupLevelEnum> map = new HashMap<>();
            map.put("0：备份正在创建中或者备份失败。", _0_);
            map.put("1：一级备份。", _1_);
            map.put("2：二级备份。", _2_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackupLevelEnum(String value) {
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
        public static BackupLevelEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            BackupLevelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BackupLevelEnum(value);
            }
            return result;
        }

        public static BackupLevelEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            BackupLevelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackupLevelEnum) {
                return this.value.equals(((BackupLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_level")
    
    
    private BackupLevelEnum backupLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;

    public Backups withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 备份ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Backups withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 备份名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Backups withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 备份开始时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    

    public Backups withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 备份结束时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public Backups withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 备份状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public Backups withTakeUpTime(Integer takeUpTime) {
        this.takeUpTime = takeUpTime;
        return this;
    }

    


    /**
     * 备份花费时间(单位：minutes)
     * @return takeUpTime
     */
    public Integer getTakeUpTime() {
        return takeUpTime;
    }

    public void setTakeUpTime(Integer takeUpTime) {
        this.takeUpTime = takeUpTime;
    }

    

    public Backups withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 备份类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public Backups withSize(Long size) {
        this.size = size;
        return this;
    }

    


    /**
     * 备份大小，(单位：MB)
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    

    public Backups withDatastore(MysqlDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public Backups withDatastore(Consumer<MysqlDatastore> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new MysqlDatastore();
            datastoreSetter.accept(this.datastore);
        }
        
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public MysqlDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(MysqlDatastore datastore) {
        this.datastore = datastore;
    }

    

    public Backups withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public Backups withBackupLevel(BackupLevelEnum backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }

    


    /**
     * 备份级别。当开启一级备份开关时，返回该参数。
     * @return backupLevel
     */
    public BackupLevelEnum getBackupLevel() {
        return backupLevel;
    }

    public void setBackupLevel(BackupLevelEnum backupLevel) {
        this.backupLevel = backupLevel;
    }

    

    public Backups withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 备份文件描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Backups backups = (Backups) o;
        return Objects.equals(this.id, backups.id) &&
            Objects.equals(this.name, backups.name) &&
            Objects.equals(this.beginTime, backups.beginTime) &&
            Objects.equals(this.endTime, backups.endTime) &&
            Objects.equals(this.status, backups.status) &&
            Objects.equals(this.takeUpTime, backups.takeUpTime) &&
            Objects.equals(this.type, backups.type) &&
            Objects.equals(this.size, backups.size) &&
            Objects.equals(this.datastore, backups.datastore) &&
            Objects.equals(this.instanceId, backups.instanceId) &&
            Objects.equals(this.backupLevel, backups.backupLevel) &&
            Objects.equals(this.description, backups.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, beginTime, endTime, status, takeUpTime, type, size, datastore, instanceId, backupLevel, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Backups {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    takeUpTime: ").append(toIndentedString(takeUpTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    backupLevel: ").append(toIndentedString(backupLevel)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

