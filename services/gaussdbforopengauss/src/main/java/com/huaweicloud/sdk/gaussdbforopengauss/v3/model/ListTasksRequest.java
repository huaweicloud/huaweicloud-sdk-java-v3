package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





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
public class ListTasksRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;
    /**
     * 任务状态。
     */
    public static final class StatusEnum {

        
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
    /**
     * 任务名称。
     */
    public static final class NameEnum {

        
        /**
         * Enum CREATEGAUSSDBV5INSTANCE for value: "CreateGaussDBV5Instance"
         */
        public static final NameEnum CREATEGAUSSDBV5INSTANCE = new NameEnum("CreateGaussDBV5Instance");
        
        /**
         * Enum BACKUPSNAPSHOTGAUSSDBV5ININSTANCE for value: "BackupSnapshotGaussDBV5InInstance"
         */
        public static final NameEnum BACKUPSNAPSHOTGAUSSDBV5ININSTANCE = new NameEnum("BackupSnapshotGaussDBV5InInstance");
        
        /**
         * Enum CLONEGAUSSDBV5NEWINSTANCE for value: "CloneGaussDBV5NewInstance"
         */
        public static final NameEnum CLONEGAUSSDBV5NEWINSTANCE = new NameEnum("CloneGaussDBV5NewInstance");
        
        /**
         * Enum RESTOREGAUSSDBV5ININSTANCE for value: "RestoreGaussDBV5InInstance"
         */
        public static final NameEnum RESTOREGAUSSDBV5ININSTANCE = new NameEnum("RestoreGaussDBV5InInstance");
        
        /**
         * Enum RESTOREGAUSSDBV5ININSTANCETOEXISTEDINST for value: "RestoreGaussDBV5InInstanceToExistedInst"
         */
        public static final NameEnum RESTOREGAUSSDBV5ININSTANCETOEXISTEDINST = new NameEnum("RestoreGaussDBV5InInstanceToExistedInst");
        
        /**
         * Enum DELETEGAUSSDBV5INSTANCE for value: "DeleteGaussDBV5Instance"
         */
        public static final NameEnum DELETEGAUSSDBV5INSTANCE = new NameEnum("DeleteGaussDBV5Instance");
        
        /**
         * Enum ENLARGEGAUSSDBV5VOLUME for value: "EnlargeGaussDBV5Volume"
         */
        public static final NameEnum ENLARGEGAUSSDBV5VOLUME = new NameEnum("EnlargeGaussDBV5Volume");
        
        /**
         * Enum RESIZEGAUSSDBV5FLAVOR for value: "ResizeGaussDBV5Flavor"
         */
        public static final NameEnum RESIZEGAUSSDBV5FLAVOR = new NameEnum("ResizeGaussDBV5Flavor");
        
        /**
         * Enum GAUSSDBV5EXPANDCLUSTERCN for value: "GaussDBV5ExpandClusterCN"
         */
        public static final NameEnum GAUSSDBV5EXPANDCLUSTERCN = new NameEnum("GaussDBV5ExpandClusterCN");
        
        /**
         * Enum GAUSSDBV5EXPANDCLUSTERDN for value: "GaussDBV5ExpandClusterDN"
         */
        public static final NameEnum GAUSSDBV5EXPANDCLUSTERDN = new NameEnum("GaussDBV5ExpandClusterDN");
        

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("CreateGaussDBV5Instance", CREATEGAUSSDBV5INSTANCE);
            map.put("BackupSnapshotGaussDBV5InInstance", BACKUPSNAPSHOTGAUSSDBV5ININSTANCE);
            map.put("CloneGaussDBV5NewInstance", CLONEGAUSSDBV5NEWINSTANCE);
            map.put("RestoreGaussDBV5InInstance", RESTOREGAUSSDBV5ININSTANCE);
            map.put("RestoreGaussDBV5InInstanceToExistedInst", RESTOREGAUSSDBV5ININSTANCETOEXISTEDINST);
            map.put("DeleteGaussDBV5Instance", DELETEGAUSSDBV5INSTANCE);
            map.put("EnlargeGaussDBV5Volume", ENLARGEGAUSSDBV5VOLUME);
            map.put("ResizeGaussDBV5Flavor", RESIZEGAUSSDBV5FLAVOR);
            map.put("GaussDBV5ExpandClusterCN", GAUSSDBV5EXPANDCLUSTERCN);
            map.put("GaussDBV5ExpandClusterDN", GAUSSDBV5EXPANDCLUSTERDN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NameEnum(value);
            }
            return result;
        }

        public static NameEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private NameEnum name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private Integer limit;

    public ListTasksRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public ListTasksRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public ListTasksRequest withName(NameEnum name) {
        this.name = name;
        return this;
    }

    


    /**
     * 任务名称。
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    

    public ListTasksRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ListTasksRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public ListTasksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询记录数。默认为100，不能为负数，最小值为1，最大值为100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTasksRequest listTasksRequest = (ListTasksRequest) o;
        return Objects.equals(this.xLanguage, listTasksRequest.xLanguage) &&
            Objects.equals(this.status, listTasksRequest.status) &&
            Objects.equals(this.name, listTasksRequest.name) &&
            Objects.equals(this.startTime, listTasksRequest.startTime) &&
            Objects.equals(this.endTime, listTasksRequest.endTime) &&
            Objects.equals(this.offset, listTasksRequest.offset) &&
            Objects.equals(this.limit, listTasksRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, status, name, startTime, endTime, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

