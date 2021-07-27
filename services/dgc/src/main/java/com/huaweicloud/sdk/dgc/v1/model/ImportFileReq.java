package com.huaweicloud.sdk.dgc.v1.model;




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
 * ImportFileReq
 */
public class ImportFileReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="params")
    
    private Object params;
    /**
     * Gets or Sets sameNamePolicy
     */
    public static final class SameNamePolicyEnum {

        
        /**
         * Enum SKIP for value: "SKIP"
         */
        public static final SameNamePolicyEnum SKIP = new SameNamePolicyEnum("SKIP");
        
        /**
         * Enum OVERWRITE for value: "OVERWRITE"
         */
        public static final SameNamePolicyEnum OVERWRITE = new SameNamePolicyEnum("OVERWRITE");
        

        private static final Map<String, SameNamePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SameNamePolicyEnum> createStaticFields() {
            Map<String, SameNamePolicyEnum> map = new HashMap<>();
            map.put("SKIP", SKIP);
            map.put("OVERWRITE", OVERWRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SameNamePolicyEnum(String value) {
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
        public static SameNamePolicyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SameNamePolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SameNamePolicyEnum(value);
            }
            return result;
        }

        public static SameNamePolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SameNamePolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SameNamePolicyEnum) {
                return this.value.equals(((SameNamePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sameNamePolicy")
    
    private SameNamePolicyEnum sameNamePolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobsParam")
    
    private Object jobsParam;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="executeUser")
    
    private String executeUser;

    public ImportFileReq withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * Get path
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public ImportFileReq withParams(Object params) {
        this.params = params;
        return this;
    }

    


    /**
     * 公共作业参数
     * @return params
     */
    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    

    public ImportFileReq withSameNamePolicy(SameNamePolicyEnum sameNamePolicy) {
        this.sameNamePolicy = sameNamePolicy;
        return this;
    }

    


    /**
     * Get sameNamePolicy
     * @return sameNamePolicy
     */
    public SameNamePolicyEnum getSameNamePolicy() {
        return sameNamePolicy;
    }

    public void setSameNamePolicy(SameNamePolicyEnum sameNamePolicy) {
        this.sameNamePolicy = sameNamePolicy;
    }

    

    public ImportFileReq withJobsParam(Object jobsParam) {
        this.jobsParam = jobsParam;
        return this;
    }

    


    /**
     * 指定作业参数
     * @return jobsParam
     */
    public Object getJobsParam() {
        return jobsParam;
    }

    public void setJobsParam(Object jobsParam) {
        this.jobsParam = jobsParam;
    }

    

    public ImportFileReq withExecuteUser(String executeUser) {
        this.executeUser = executeUser;
        return this;
    }

    


    /**
     * Get executeUser
     * @return executeUser
     */
    public String getExecuteUser() {
        return executeUser;
    }

    public void setExecuteUser(String executeUser) {
        this.executeUser = executeUser;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportFileReq importFileReq = (ImportFileReq) o;
        return Objects.equals(this.path, importFileReq.path) &&
            Objects.equals(this.params, importFileReq.params) &&
            Objects.equals(this.sameNamePolicy, importFileReq.sameNamePolicy) &&
            Objects.equals(this.jobsParam, importFileReq.jobsParam) &&
            Objects.equals(this.executeUser, importFileReq.executeUser);
    }
    @Override
    public int hashCode() {
        return Objects.hash(path, params, sameNamePolicy, jobsParam, executeUser);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportFileReq {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    sameNamePolicy: ").append(toIndentedString(sameNamePolicy)).append("\n");
        sb.append("    jobsParam: ").append(toIndentedString(jobsParam)).append("\n");
        sb.append("    executeUser: ").append(toIndentedString(executeUser)).append("\n");
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

