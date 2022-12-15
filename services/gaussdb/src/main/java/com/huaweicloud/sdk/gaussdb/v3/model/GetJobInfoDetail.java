package com.huaweicloud.sdk.gaussdb.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.GetJobEntitiesInfoDetail;
import com.huaweicloud.sdk.gaussdb.v3.model.GetJobInstanceInfoDetail;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 任务信息。
 */
public class GetJobInfoDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;
    /**
     * 任务执行状态。  取值： - 值为“Pending”，表示延时任务，未执行。 - 值为“Running”，表示任务正在执行。 - 值为“Completed”，表示任务执行成功。 - 值为“Failed”，表示任务执行失败。
     */
    public static final class StatusEnum {

        
        /**
         * Enum PENDING for value: "Pending"
         */
        public static final StatusEnum PENDING = new StatusEnum("Pending");
        
        /**
         * Enum RUNNING for value: "Running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("Running");
        
        /**
         * Enum COMPLETED for value: "Completed"
         */
        public static final StatusEnum COMPLETED = new StatusEnum("Completed");
        
        /**
         * Enum FAILED for value: "Failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("Failed");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Pending", PENDING);
            map.put("Running", RUNNING);
            map.put("Completed", COMPLETED);
            map.put("Failed", FAILED);
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
    @JsonProperty(value="created")
    
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ended")
    
    
    private String ended;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="process")
    
    
    private String process;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance")
    
    
    private GetJobInstanceInfoDetail instance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="entities")
    
    
    private GetJobEntitiesInfoDetail entities;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_reason")
    
    
    private String failReason;

    public GetJobInfoDetail withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public GetJobInfoDetail withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 任务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public GetJobInfoDetail withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务执行状态。  取值： - 值为“Pending”，表示延时任务，未执行。 - 值为“Running”，表示任务正在执行。 - 值为“Completed”，表示任务执行成功。 - 值为“Failed”，表示任务执行失败。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public GetJobInfoDetail withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 创建时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。  说明：创建时返回值为空，数据库实例创建成功后该值不为空。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    

    public GetJobInfoDetail withEnded(String ended) {
        this.ended = ended;
        return this;
    }

    


    /**
     * 结束时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。  说明：创建时返回值为空，数据库实例创建成功后该值不为空。
     * @return ended
     */
    public String getEnded() {
        return ended;
    }

    public void setEnded(String ended) {
        this.ended = ended;
    }

    

    public GetJobInfoDetail withProcess(String process) {
        this.process = process;
        return this;
    }

    


    /**
     * 任务执行进度。执行中状态才返回执行进度，例如60%，否则返回\"\"。
     * @return process
     */
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    

    public GetJobInfoDetail withInstance(GetJobInstanceInfoDetail instance) {
        this.instance = instance;
        return this;
    }

    public GetJobInfoDetail withInstance(Consumer<GetJobInstanceInfoDetail> instanceSetter) {
        if(this.instance == null ){
            this.instance = new GetJobInstanceInfoDetail();
            instanceSetter.accept(this.instance);
        }
        
        return this;
    }


    /**
     * Get instance
     * @return instance
     */
    public GetJobInstanceInfoDetail getInstance() {
        return instance;
    }

    public void setInstance(GetJobInstanceInfoDetail instance) {
        this.instance = instance;
    }

    

    public GetJobInfoDetail withEntities(GetJobEntitiesInfoDetail entities) {
        this.entities = entities;
        return this;
    }

    public GetJobInfoDetail withEntities(Consumer<GetJobEntitiesInfoDetail> entitiesSetter) {
        if(this.entities == null ){
            this.entities = new GetJobEntitiesInfoDetail();
            entitiesSetter.accept(this.entities);
        }
        
        return this;
    }


    /**
     * Get entities
     * @return entities
     */
    public GetJobEntitiesInfoDetail getEntities() {
        return entities;
    }

    public void setEntities(GetJobEntitiesInfoDetail entities) {
        this.entities = entities;
    }

    

    public GetJobInfoDetail withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    


    /**
     * 任务执行失败时的错误信息。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetJobInfoDetail getJobInfoDetail = (GetJobInfoDetail) o;
        return Objects.equals(this.id, getJobInfoDetail.id) &&
            Objects.equals(this.name, getJobInfoDetail.name) &&
            Objects.equals(this.status, getJobInfoDetail.status) &&
            Objects.equals(this.created, getJobInfoDetail.created) &&
            Objects.equals(this.ended, getJobInfoDetail.ended) &&
            Objects.equals(this.process, getJobInfoDetail.process) &&
            Objects.equals(this.instance, getJobInfoDetail.instance) &&
            Objects.equals(this.entities, getJobInfoDetail.entities) &&
            Objects.equals(this.failReason, getJobInfoDetail.failReason);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, created, ended, process, instance, entities, failReason);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetJobInfoDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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

