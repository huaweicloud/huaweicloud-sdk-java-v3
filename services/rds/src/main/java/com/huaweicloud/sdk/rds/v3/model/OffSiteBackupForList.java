package com.huaweicloud.sdk.rds.v3.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.BackupDatabase;
import com.huaweicloud.sdk.rds.v3.model.Datastore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 跨区域备份信息。
 */
public class OffSiteBackupForList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="databases")
    
    private List<BackupDatabase> databases = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    private String beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;
    /**
     * 备份状态，取值：  - BUILDING: 备份中。 - COMPLETED: 备份完成。 - FAILED：备份失败。 - DELETING：备份删除中。
     */
    public static final class StatusEnum {

        
        /**
         * Enum BUILDING for value: "BUILDING"
         */
        public static final StatusEnum BUILDING = new StatusEnum("BUILDING");
        
        /**
         * Enum COMPLETED for value: "COMPLETED"
         */
        public static final StatusEnum COMPLETED = new StatusEnum("COMPLETED");
        
        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");
        
        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("BUILDING", BUILDING);
            map.put("COMPLETED", COMPLETED);
            map.put("FAILED", FAILED);
            map.put("DELETING", DELETING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
            if (obj != null && obj instanceof StatusEnum) {
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
    /**
     * 备份类型，取值：  - “auto”: 自动全量备份 - “incremental”: 自动增量备份
     */
    public static final class TypeEnum {

        
        /**
         * Enum AUTO for value: "auto"
         */
        public static final TypeEnum AUTO = new TypeEnum("auto");
        
        /**
         * Enum INCREMENTAL for value: "incremental"
         */
        public static final TypeEnum INCREMENTAL = new TypeEnum("incremental");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("auto", AUTO);
            map.put("incremental", INCREMENTAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
            if (obj != null && obj instanceof TypeEnum) {
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
    
    private Datastore datastore = null;

    public OffSiteBackupForList withId(String id) {
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

    public OffSiteBackupForList withInstanceId(String instanceId) {
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

    public OffSiteBackupForList withName(String name) {
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

    public OffSiteBackupForList withDatabases(List<BackupDatabase> databases) {
        this.databases = databases;
        return this;
    }

    
    public OffSiteBackupForList addDatabasesItem(BackupDatabase databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public OffSiteBackupForList withDatabases(Consumer<List<BackupDatabase>> databasesSetter) {
        if(this.databases == null ){
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 备份的数据库。
     * @return databases
     */
    public List<BackupDatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(List<BackupDatabase> databases) {
        this.databases = databases;
    }

    public OffSiteBackupForList withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 备份开始时间，格式为“yyyy-mm-ddThh:mm:ssZ”。  其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public OffSiteBackupForList withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 备份结束时间，格式为“yyyy-mm-ddThh:mm:ssZ”。  其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public OffSiteBackupForList withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 备份状态，取值：  - BUILDING: 备份中。 - COMPLETED: 备份完成。 - FAILED：备份失败。 - DELETING：备份删除中。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OffSiteBackupForList withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 备份类型，取值：  - “auto”: 自动全量备份 - “incremental”: 自动增量备份
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public OffSiteBackupForList withSize(Long size) {
        this.size = size;
        return this;
    }

    


    /**
     * 备份大小，单位为KB。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public OffSiteBackupForList withDatastore(Datastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public OffSiteBackupForList withDatastore(Consumer<Datastore> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new Datastore();
            datastoreSetter.accept(this.datastore);
        }
        
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OffSiteBackupForList offSiteBackupForList = (OffSiteBackupForList) o;
        return Objects.equals(this.id, offSiteBackupForList.id) &&
            Objects.equals(this.instanceId, offSiteBackupForList.instanceId) &&
            Objects.equals(this.name, offSiteBackupForList.name) &&
            Objects.equals(this.databases, offSiteBackupForList.databases) &&
            Objects.equals(this.beginTime, offSiteBackupForList.beginTime) &&
            Objects.equals(this.endTime, offSiteBackupForList.endTime) &&
            Objects.equals(this.status, offSiteBackupForList.status) &&
            Objects.equals(this.type, offSiteBackupForList.type) &&
            Objects.equals(this.size, offSiteBackupForList.size) &&
            Objects.equals(this.datastore, offSiteBackupForList.datastore);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, instanceId, name, databases, beginTime, endTime, status, type, size, datastore);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OffSiteBackupForList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
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

