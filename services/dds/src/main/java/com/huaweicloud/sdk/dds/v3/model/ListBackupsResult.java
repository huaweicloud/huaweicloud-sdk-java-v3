package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.ListBackupsDatastoreResult;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 备份信息。
 */
public class ListBackupsResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
    private String instanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    private ListBackupsDatastoreResult datastore = null;
    /**
     * 备份类型。 - 取值为“Auto”，表示自动全量备份。 - 取值为“Manual”，表示手动全量备份。
     */
    public static class TypeEnum {

        
        /**
         * Enum AUTO for value: "auto"
         */
        public static final TypeEnum AUTO = new TypeEnum("auto");

        
        /**
         * Enum MANUAL for value: "manual"
         */
        public static final TypeEnum MANUAL = new TypeEnum("manual");

        
        /**
         * Enum FRAGMENT for value: "fragment"
         */
        public static final TypeEnum FRAGMENT = new TypeEnum("fragment");

        
        /**
         * Enum INCREMENTAL for value: "incremental"
         */
        public static final TypeEnum INCREMENTAL = new TypeEnum("incremental");

        

        public static Map<String, TypeEnum> staticFields =
                new HashMap<String, TypeEnum>() {
                    { 
                        put("auto", AUTO);
                        put("manual", MANUAL);
                        put("fragment", FRAGMENT);
                        put("incremental", INCREMENTAL);
                    }
                };

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
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
    @JsonProperty(value="begin_time")
    
    private String beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;
    /**
     * 备份状态。 取值： - BUILDING：备份中。 - COMPLETED：备份完成。 - FAILED：备份失败。 - DISABLED：备份删除中。
     */
    public static class StatusEnum {

        
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

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("BUILDING", BUILDING);
                        put("COMPLETED", COMPLETED);
                        put("FAILED", FAILED);
                        put("DELETING", DELETING);
                    }
                };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public ListBackupsResult withId(String id) {
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

    public ListBackupsResult withName(String name) {
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

    public ListBackupsResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 备份所属的实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListBackupsResult withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 备份所属的实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ListBackupsResult withDatastore(ListBackupsDatastoreResult datastore) {
        this.datastore = datastore;
        return this;
    }

    public ListBackupsResult withDatastore(Consumer<ListBackupsDatastoreResult> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new ListBackupsDatastoreResult();
        }
        datastoreSetter.accept(this.datastore);
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public ListBackupsDatastoreResult getDatastore() {
        return datastore;
    }

    public void setDatastore(ListBackupsDatastoreResult datastore) {
        this.datastore = datastore;
    }

    public ListBackupsResult withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 备份类型。 - 取值为“Auto”，表示自动全量备份。 - 取值为“Manual”，表示手动全量备份。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListBackupsResult withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 备份开始时间，格式为“yyyy-mm-dd hh:mm:ss”。该时间为UTC时间。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListBackupsResult withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 备份结束时间，格式为“yyyy-mm-dd hh:mm:ss”。该时间为UTC时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListBackupsResult withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 备份状态。 取值： - BUILDING：备份中。 - COMPLETED：备份完成。 - FAILED：备份失败。 - DISABLED：备份删除中。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListBackupsResult withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 备份大小，单位：KB。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListBackupsResult withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 备份描述。
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
        ListBackupsResult listBackupsResult = (ListBackupsResult) o;
        return Objects.equals(this.id, listBackupsResult.id) &&
            Objects.equals(this.name, listBackupsResult.name) &&
            Objects.equals(this.instanceId, listBackupsResult.instanceId) &&
            Objects.equals(this.instanceName, listBackupsResult.instanceName) &&
            Objects.equals(this.datastore, listBackupsResult.datastore) &&
            Objects.equals(this.type, listBackupsResult.type) &&
            Objects.equals(this.beginTime, listBackupsResult.beginTime) &&
            Objects.equals(this.endTime, listBackupsResult.endTime) &&
            Objects.equals(this.status, listBackupsResult.status) &&
            Objects.equals(this.size, listBackupsResult.size) &&
            Objects.equals(this.description, listBackupsResult.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, instanceId, instanceName, datastore, type, beginTime, endTime, status, size, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupsResult {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
            sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
            sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

