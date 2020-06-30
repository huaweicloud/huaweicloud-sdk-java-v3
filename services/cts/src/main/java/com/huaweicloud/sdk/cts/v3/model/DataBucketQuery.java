package com.huaweicloud.sdk.cts.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 追踪桶信息。
 */
public class DataBucketQuery  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_bucket_name")
    
    private String dataBucketName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search_enabled")
    
    private Boolean searchEnabled;
    /**
     * 追踪操作。
     */
    public static class DataEventEnum {

        
        /**
         * Enum READ for value: "READ"
         */
        public static final DataEventEnum READ = new DataEventEnum("READ");
        
        /**
         * Enum WRITE for value: "WRITE"
         */
        public static final DataEventEnum WRITE = new DataEventEnum("WRITE");
        

        public static final Map<String, DataEventEnum> staticFields = new HashMap<String, DataEventEnum>() {
            { 
                put("READ", READ);
                put("WRITE", WRITE);
            }
        };

        private String value;

        DataEventEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DataEventEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DataEventEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DataEventEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DataEventEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DataEventEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DataEventEnum) {
                return this.value.equals(((DataEventEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_event")
    
    private DataEventEnum dataEvent;

    public DataBucketQuery withDataBucketName(String dataBucketName) {
        this.dataBucketName = dataBucketName;
        return this;
    }

    


    /**
     * 标识OBS桶名称。由数字或字母开头，支持小写字母、数字、“-”、“.”，长度为3～63个字符。
     * @return dataBucketName
     */
    public String getDataBucketName() {
        return dataBucketName;
    }

    public void setDataBucketName(String dataBucketName) {
        this.dataBucketName = dataBucketName;
    }

    public DataBucketQuery withSearchEnabled(Boolean searchEnabled) {
        this.searchEnabled = searchEnabled;
        return this;
    }

    


    /**
     * 追踪桶日志是否支持搜索。
     * @return searchEnabled
     */
    public Boolean getSearchEnabled() {
        return searchEnabled;
    }

    public void setSearchEnabled(Boolean searchEnabled) {
        this.searchEnabled = searchEnabled;
    }

    public DataBucketQuery withDataEvent(DataEventEnum dataEvent) {
        this.dataEvent = dataEvent;
        return this;
    }

    


    /**
     * 追踪操作。
     * @return dataEvent
     */
    public DataEventEnum getDataEvent() {
        return dataEvent;
    }

    public void setDataEvent(DataEventEnum dataEvent) {
        this.dataEvent = dataEvent;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataBucketQuery dataBucketQuery = (DataBucketQuery) o;
        return Objects.equals(this.dataBucketName, dataBucketQuery.dataBucketName) &&
            Objects.equals(this.searchEnabled, dataBucketQuery.searchEnabled) &&
            Objects.equals(this.dataEvent, dataBucketQuery.dataEvent);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dataBucketName, searchEnabled, dataEvent);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataBucketQuery {\n");
        sb.append("    dataBucketName: ").append(toIndentedString(dataBucketName)).append("\n");
        sb.append("    searchEnabled: ").append(toIndentedString(searchEnabled)).append("\n");
        sb.append("    dataEvent: ").append(toIndentedString(dataEvent)).append("\n");
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

