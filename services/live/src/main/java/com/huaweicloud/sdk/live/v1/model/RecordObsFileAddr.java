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
 * RecordObsFileAddr
 */
public class RecordObsFileAddr  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket")
    
    private String bucket;
    /**
     * OBS Bucket所在RegionID
     */
    public static final class LocationEnum {

        
        /**
         * Enum CN_NORTH_4 for value: "cn-north-4"
         */
        public static final LocationEnum CN_NORTH_4 = new LocationEnum("cn-north-4");
        
        /**
         * Enum CN_NORTH_5 for value: "cn-north-5"
         */
        public static final LocationEnum CN_NORTH_5 = new LocationEnum("cn-north-5");
        
        /**
         * Enum CN_NORTH_6 for value: "cn-north-6"
         */
        public static final LocationEnum CN_NORTH_6 = new LocationEnum("cn-north-6");
        

        private static final Map<String, LocationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocationEnum> createStaticFields() {
            Map<String, LocationEnum> map = new HashMap<>();
            map.put("cn-north-4", CN_NORTH_4);
            map.put("cn-north-5", CN_NORTH_5);
            map.put("cn-north-6", CN_NORTH_6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocationEnum(String value) {
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
        public static LocationEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            LocationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LocationEnum(value);
            }
            return result;
        }

        public static LocationEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LocationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof LocationEnum) {
                return this.value.equals(((LocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="location")
    
    private LocationEnum location;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object")
    
    private String _object;

    public RecordObsFileAddr withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    


    /**
     * OBS的bucket名称
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    

    public RecordObsFileAddr withLocation(LocationEnum location) {
        this.location = location;
        return this;
    }

    


    /**
     * OBS Bucket所在RegionID
     * @return location
     */
    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    

    public RecordObsFileAddr withObject(String _object) {
        this._object = _object;
        return this;
    }

    


    /**
     * OBS对象路径，遵守OBS Object定义。如果为空则保存到根目录
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordObsFileAddr recordObsFileAddr = (RecordObsFileAddr) o;
        return Objects.equals(this.bucket, recordObsFileAddr.bucket) &&
            Objects.equals(this.location, recordObsFileAddr.location) &&
            Objects.equals(this._object, recordObsFileAddr._object);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bucket, location, _object);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordObsFileAddr {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

