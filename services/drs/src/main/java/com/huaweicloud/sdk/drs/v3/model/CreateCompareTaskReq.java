package com.huaweicloud.sdk.drs.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.CreateDataLevelCompareReq;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CreateCompareTaskReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;
    /**
     * 对象级对比类型，取值为空代表不创建对象级对比。object_level_compare_type和data_level_compare_info都为空时，只查询已创建的对比任务列表。
     */
    public static final class ObjectLevelCompareTypeEnum {

        
        /**
         * Enum OBJECTS_ for value: "objects-对象对比"
         */
        public static final ObjectLevelCompareTypeEnum OBJECTS_ = new ObjectLevelCompareTypeEnum("objects-对象对比");
        

        private static final Map<String, ObjectLevelCompareTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectLevelCompareTypeEnum> createStaticFields() {
            Map<String, ObjectLevelCompareTypeEnum> map = new HashMap<>();
            map.put("objects-对象对比", OBJECTS_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectLevelCompareTypeEnum(String value) {
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
        public static ObjectLevelCompareTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ObjectLevelCompareTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ObjectLevelCompareTypeEnum(value);
            }
            return result;
        }

        public static ObjectLevelCompareTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ObjectLevelCompareTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ObjectLevelCompareTypeEnum) {
                return this.value.equals(((ObjectLevelCompareTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_level_compare_type")
    
    private ObjectLevelCompareTypeEnum objectLevelCompareType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_level_compare_info")
    
    private CreateDataLevelCompareReq dataLevelCompareInfo = null;

    public CreateCompareTaskReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateCompareTaskReq withObjectLevelCompareType(ObjectLevelCompareTypeEnum objectLevelCompareType) {
        this.objectLevelCompareType = objectLevelCompareType;
        return this;
    }

    


    /**
     * 对象级对比类型，取值为空代表不创建对象级对比。object_level_compare_type和data_level_compare_info都为空时，只查询已创建的对比任务列表。
     * @return objectLevelCompareType
     */
    public ObjectLevelCompareTypeEnum getObjectLevelCompareType() {
        return objectLevelCompareType;
    }

    public void setObjectLevelCompareType(ObjectLevelCompareTypeEnum objectLevelCompareType) {
        this.objectLevelCompareType = objectLevelCompareType;
    }

    public CreateCompareTaskReq withDataLevelCompareInfo(CreateDataLevelCompareReq dataLevelCompareInfo) {
        this.dataLevelCompareInfo = dataLevelCompareInfo;
        return this;
    }

    public CreateCompareTaskReq withDataLevelCompareInfo(Consumer<CreateDataLevelCompareReq> dataLevelCompareInfoSetter) {
        if(this.dataLevelCompareInfo == null ){
            this.dataLevelCompareInfo = new CreateDataLevelCompareReq();
            dataLevelCompareInfoSetter.accept(this.dataLevelCompareInfo);
        }
        
        return this;
    }


    /**
     * Get dataLevelCompareInfo
     * @return dataLevelCompareInfo
     */
    public CreateDataLevelCompareReq getDataLevelCompareInfo() {
        return dataLevelCompareInfo;
    }

    public void setDataLevelCompareInfo(CreateDataLevelCompareReq dataLevelCompareInfo) {
        this.dataLevelCompareInfo = dataLevelCompareInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCompareTaskReq createCompareTaskReq = (CreateCompareTaskReq) o;
        return Objects.equals(this.jobId, createCompareTaskReq.jobId) &&
            Objects.equals(this.objectLevelCompareType, createCompareTaskReq.objectLevelCompareType) &&
            Objects.equals(this.dataLevelCompareInfo, createCompareTaskReq.dataLevelCompareInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, objectLevelCompareType, dataLevelCompareInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCompareTaskReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    objectLevelCompareType: ").append(toIndentedString(objectLevelCompareType)).append("\n");
        sb.append("    dataLevelCompareInfo: ").append(toIndentedString(dataLevelCompareInfo)).append("\n");
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

