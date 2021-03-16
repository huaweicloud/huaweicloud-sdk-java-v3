package com.huaweicloud.sdk.cts.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DataBucket
 */
public class DataBucket  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_bucket_name")
    
    private String dataBucketName;
    /**
     * Gets or Sets dataEvent
     */
    public static final class DataEventEnum {

        
        /**
         * Enum WRITE for value: "WRITE"
         */
        public static final DataEventEnum WRITE = new DataEventEnum("WRITE");
        
        /**
         * Enum READ for value: "READ"
         */
        public static final DataEventEnum READ = new DataEventEnum("READ");
        

        private static final Map<String, DataEventEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataEventEnum> createStaticFields() {
            Map<String, DataEventEnum> map = new HashMap<>();
            map.put("WRITE", WRITE);
            map.put("READ", READ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataEventEnum(String value) {
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
        public static DataEventEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DataEventEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DataEventEnum(value);
            }
            return result;
        }

        public static DataEventEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DataEventEnum result = STATIC_FIELDS.get(value);
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
    
    private List<DataEventEnum> dataEvent = null;
    
    public DataBucket withDataBucketName(String dataBucketName) {
        this.dataBucketName = dataBucketName;
        return this;
    }

    


    /**
     * 数据类追踪器追踪对象的桶名。 - 当启用或者停用数据类追踪器时，该参数为必选。 - 管理类追踪器无此参数。 - 追踪器一旦创建追踪桶无法修改。
     * @return dataBucketName
     */
    public String getDataBucketName() {
        return dataBucketName;
    }

    public void setDataBucketName(String dataBucketName) {
        this.dataBucketName = dataBucketName;
    }

    

    public DataBucket withDataEvent(List<DataEventEnum> dataEvent) {
        this.dataEvent = dataEvent;
        return this;
    }

    
    public DataBucket addDataEventItem(DataEventEnum dataEventItem) {
        this.dataEvent.add(dataEventItem);
        return this;
    }

    public DataBucket withDataEvent(Consumer<List<DataEventEnum>> dataEventSetter) {
        if(this.dataEvent == null ){
            this.dataEvent = new ArrayList<>();
        }
        dataEventSetter.accept(this.dataEvent);
        return this;
    }

    /**
     * 数据类追踪器追踪的操作类型。 - 当启用或者停用数据类追踪器时，该参数为必选。 - 管理类追踪器无此参数。
     * @return dataEvent
     */
    public List<DataEventEnum> getDataEvent() {
        return dataEvent;
    }

    public void setDataEvent(List<DataEventEnum> dataEvent) {
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
        DataBucket dataBucket = (DataBucket) o;
        return Objects.equals(this.dataBucketName, dataBucket.dataBucketName) &&
            Objects.equals(this.dataEvent, dataBucket.dataEvent);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dataBucketName, dataEvent);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataBucket {\n");
        sb.append("    dataBucketName: ").append(toIndentedString(dataBucketName)).append("\n");
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

