package com.huaweicloud.sdk.live.v1.model;




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
public class ListRecordConfigsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stream_name")
    
    private String streamName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;
    /**
     * 录制类型 configer_record：按照配置录制
     */
    public static final class RecordTypeEnum {

        
        /**
         * Enum CONFIGER_RECORD for value: "configer_record"
         */
        public static final RecordTypeEnum CONFIGER_RECORD = new RecordTypeEnum("configer_record");
        

        private static final Map<String, RecordTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordTypeEnum> createStaticFields() {
            Map<String, RecordTypeEnum> map = new HashMap<>();
            map.put("configer_record", CONFIGER_RECORD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordTypeEnum(String value) {
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
        public static RecordTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RecordTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecordTypeEnum(value);
            }
            return result;
        }

        public static RecordTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RecordTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RecordTypeEnum) {
                return this.value.equals(((RecordTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_type")
    
    private RecordTypeEnum recordType;

    public ListRecordConfigsRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 直播播放域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public ListRecordConfigsRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 流应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    

    public ListRecordConfigsRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    


    /**
     * 流名
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    

    public ListRecordConfigsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * 分页编号。 默认为0。 
     * minimum: 0
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    

    public ListRecordConfigsRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 每页记录数。 取值范围：1-100。 默认为10。 
     * minimum: 1
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListRecordConfigsRequest withRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
        return this;
    }

    


    /**
     * 录制类型 configer_record：按照配置录制
     * @return recordType
     */
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRecordConfigsRequest listRecordConfigsRequest = (ListRecordConfigsRequest) o;
        return Objects.equals(this.domain, listRecordConfigsRequest.domain) &&
            Objects.equals(this.appName, listRecordConfigsRequest.appName) &&
            Objects.equals(this.streamName, listRecordConfigsRequest.streamName) &&
            Objects.equals(this.page, listRecordConfigsRequest.page) &&
            Objects.equals(this.size, listRecordConfigsRequest.size) &&
            Objects.equals(this.recordType, listRecordConfigsRequest.recordType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, streamName, page, size, recordType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordConfigsRequest {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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

