package com.huaweicloud.sdk.drs.v3.model;




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
 * 删除在线迁移任务请求体
 */
public class DeleteJobReq  {

    /**
     * terminate:结束迁移任务,force_terminate:强制结束迁移任务,delete:删除迁移任务
     */
    public static final class DeleteTypeEnum {

        
        /**
         * Enum TERMINATE for value: "terminate"
         */
        public static final DeleteTypeEnum TERMINATE = new DeleteTypeEnum("terminate");
        
        /**
         * Enum FORCE_TERMINATE for value: "force_terminate"
         */
        public static final DeleteTypeEnum FORCE_TERMINATE = new DeleteTypeEnum("force_terminate");
        
        /**
         * Enum DELETE for value: "delete"
         */
        public static final DeleteTypeEnum DELETE = new DeleteTypeEnum("delete");
        

        private static final Map<String, DeleteTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteTypeEnum> createStaticFields() {
            Map<String, DeleteTypeEnum> map = new HashMap<>();
            map.put("terminate", TERMINATE);
            map.put("force_terminate", FORCE_TERMINATE);
            map.put("delete", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteTypeEnum(String value) {
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
        public static DeleteTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DeleteTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeleteTypeEnum(value);
            }
            return result;
        }

        public static DeleteTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DeleteTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DeleteTypeEnum) {
                return this.value.equals(((DeleteTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_type")
    
    private DeleteTypeEnum deleteType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;

    public DeleteJobReq withDeleteType(DeleteTypeEnum deleteType) {
        this.deleteType = deleteType;
        return this;
    }

    


    /**
     * terminate:结束迁移任务,force_terminate:强制结束迁移任务,delete:删除迁移任务
     * @return deleteType
     */
    public DeleteTypeEnum getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(DeleteTypeEnum deleteType) {
        this.deleteType = deleteType;
    }

    

    public DeleteJobReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteJobReq deleteJobReq = (DeleteJobReq) o;
        return Objects.equals(this.deleteType, deleteJobReq.deleteType) &&
            Objects.equals(this.jobId, deleteJobReq.jobId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deleteType, jobId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteJobReq {\n");
        sb.append("    deleteType: ").append(toIndentedString(deleteType)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

