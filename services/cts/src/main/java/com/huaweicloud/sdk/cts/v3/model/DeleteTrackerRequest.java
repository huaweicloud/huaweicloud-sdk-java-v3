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
 * Request Object
 */
public class DeleteTrackerRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_name")
    
    private String trackerName;
    /**
     * Gets or Sets trackerType
     */
    public static class TrackerTypeEnum {

        
        /**
         * Enum DATA for value: "data"
         */
        public static final TrackerTypeEnum DATA = new TrackerTypeEnum("data");
        

        public static final Map<String, TrackerTypeEnum> staticFields = new HashMap<String, TrackerTypeEnum>() {
            { 
                put("data", DATA);
            }
        };

        private String value;

        TrackerTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TrackerTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TrackerTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TrackerTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TrackerTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TrackerTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TrackerTypeEnum) {
                return this.value.equals(((TrackerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracker_type")
    
    private TrackerTypeEnum trackerType;

    public DeleteTrackerRequest withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    


    /**
     * Get trackerName
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    public DeleteTrackerRequest withTrackerType(TrackerTypeEnum trackerType) {
        this.trackerType = trackerType;
        return this;
    }

    


    /**
     * Get trackerType
     * @return trackerType
     */
    public TrackerTypeEnum getTrackerType() {
        return trackerType;
    }

    public void setTrackerType(TrackerTypeEnum trackerType) {
        this.trackerType = trackerType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteTrackerRequest deleteTrackerRequest = (DeleteTrackerRequest) o;
        return Objects.equals(this.trackerName, deleteTrackerRequest.trackerName) &&
            Objects.equals(this.trackerType, deleteTrackerRequest.trackerType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(trackerName, trackerType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTrackerRequest {\n");
        sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
        sb.append("    trackerType: ").append(toIndentedString(trackerType)).append("\n");
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

