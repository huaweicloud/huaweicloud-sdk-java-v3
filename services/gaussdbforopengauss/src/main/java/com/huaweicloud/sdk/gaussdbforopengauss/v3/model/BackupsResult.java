package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussDatastoreResult;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BackupsResult
 */
public class BackupsResult  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

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
         * Enum FAILED_ for value: "FAILED：备份失败。。"
         */
        public static final StatusEnum FAILED_ = new StatusEnum("FAILED：备份失败。。");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("BUILDING：备份中。", BUILDING_);
            map.put("COMPLETED：备份完成。", COMPLETED_);
            map.put("FAILED：备份失败。。", FAILED_);
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
    @JsonProperty(value="size")
    

    private Double size;
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
    @JsonProperty(value="datastore")
    

    private OpenGaussDatastoreResult datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    

    private String instanceId;

    public BackupsResult withId(String id) {
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

    

    public BackupsResult withName(String name) {
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

    

    public BackupsResult withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 备份文件描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public BackupsResult withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 备份开始时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    

    public BackupsResult withEndTime(String endTime) {
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

    

    public BackupsResult withStatus(StatusEnum status) {
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

    

    public BackupsResult withSize(Double size) {
        this.size = size;
        return this;
    }

    


    /**
     * 备份大小(单位：MB)
     * @return size
     */
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    

    public BackupsResult withType(TypeEnum type) {
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

    

    public BackupsResult withDatastore(OpenGaussDatastoreResult datastore) {
        this.datastore = datastore;
        return this;
    }

    public BackupsResult withDatastore(Consumer<OpenGaussDatastoreResult> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new OpenGaussDatastoreResult();
            datastoreSetter.accept(this.datastore);
        }
        
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public OpenGaussDatastoreResult getDatastore() {
        return datastore;
    }

    public void setDatastore(OpenGaussDatastoreResult datastore) {
        this.datastore = datastore;
    }

    

    public BackupsResult withInstanceId(String instanceId) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupsResult backupsResult = (BackupsResult) o;
        return Objects.equals(this.id, backupsResult.id) &&
            Objects.equals(this.name, backupsResult.name) &&
            Objects.equals(this.description, backupsResult.description) &&
            Objects.equals(this.beginTime, backupsResult.beginTime) &&
            Objects.equals(this.endTime, backupsResult.endTime) &&
            Objects.equals(this.status, backupsResult.status) &&
            Objects.equals(this.size, backupsResult.size) &&
            Objects.equals(this.type, backupsResult.type) &&
            Objects.equals(this.datastore, backupsResult.datastore) &&
            Objects.equals(this.instanceId, backupsResult.instanceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, beginTime, endTime, status, size, type, datastore, instanceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupsResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

