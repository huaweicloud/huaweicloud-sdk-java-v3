package com.huaweicloud.sdk.live.v2.model;




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
 * Request Object
 */
public class ListUsersOfStreamRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="play_domain")
    
    private String playDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app")
    
    private String app;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stream")
    
    private String stream;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isp")
    
    private List<String> isp = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private List<String> region = null;
        /**
     * Gets or Sets interval
     */
    public static final class IntervalEnum {

        
        /**
         * Enum NUMBER_60 for value: 60
         */
        public static final IntervalEnum NUMBER_60 = new IntervalEnum(60);
        
        /**
         * Enum NUMBER_300 for value: 300
         */
        public static final IntervalEnum NUMBER_300 = new IntervalEnum(300);
        

        private static final Map<Integer, IntervalEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IntervalEnum> createStaticFields() {
            Map<Integer, IntervalEnum> map = new HashMap<>();
            map.put(60, NUMBER_60);
            map.put(300, NUMBER_300);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IntervalEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IntervalEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            IntervalEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IntervalEnum(value);
            }
            return result;
        }

        public static IntervalEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            IntervalEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IntervalEnum) {
                return this.value.equals(((IntervalEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interval")
    
    private IntervalEnum interval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;

    public ListUsersOfStreamRequest withPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }

    


    /**
     * Get playDomain
     * @return playDomain
     */
    public String getPlayDomain() {
        return playDomain;
    }

    public void setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
    }

    

    public ListUsersOfStreamRequest withApp(String app) {
        this.app = app;
        return this;
    }

    


    /**
     * Get app
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    

    public ListUsersOfStreamRequest withStream(String stream) {
        this.stream = stream;
        return this;
    }

    


    /**
     * Get stream
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    

    public ListUsersOfStreamRequest withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    
    public ListUsersOfStreamRequest addIspItem(String ispItem) {
        this.isp.add(ispItem);
        return this;
    }

    public ListUsersOfStreamRequest withIsp(Consumer<List<String>> ispSetter) {
        if(this.isp == null ){
            this.isp = new ArrayList<>();
        }
        ispSetter.accept(this.isp);
        return this;
    }

    /**
     * Get isp
     * @return isp
     */
    public List<String> getIsp() {
        return isp;
    }

    public void setIsp(List<String> isp) {
        this.isp = isp;
    }

    

    public ListUsersOfStreamRequest withRegion(List<String> region) {
        this.region = region;
        return this;
    }

    
    public ListUsersOfStreamRequest addRegionItem(String regionItem) {
        this.region.add(regionItem);
        return this;
    }

    public ListUsersOfStreamRequest withRegion(Consumer<List<String>> regionSetter) {
        if(this.region == null ){
            this.region = new ArrayList<>();
        }
        regionSetter.accept(this.region);
        return this;
    }

    /**
     * Get region
     * @return region
     */
    public List<String> getRegion() {
        return region;
    }

    public void setRegion(List<String> region) {
        this.region = region;
    }

    

    public ListUsersOfStreamRequest withInterval(IntervalEnum interval) {
        this.interval = interval;
        return this;
    }

    


    /**
     * Get interval
     * minimum: 60
     * maximum: 300
     * @return interval
     */
    public IntervalEnum getInterval() {
        return interval;
    }

    public void setInterval(IntervalEnum interval) {
        this.interval = interval;
    }

    

    public ListUsersOfStreamRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * Get startTime
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ListUsersOfStreamRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * Get endTime
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUsersOfStreamRequest listUsersOfStreamRequest = (ListUsersOfStreamRequest) o;
        return Objects.equals(this.playDomain, listUsersOfStreamRequest.playDomain) &&
            Objects.equals(this.app, listUsersOfStreamRequest.app) &&
            Objects.equals(this.stream, listUsersOfStreamRequest.stream) &&
            Objects.equals(this.isp, listUsersOfStreamRequest.isp) &&
            Objects.equals(this.region, listUsersOfStreamRequest.region) &&
            Objects.equals(this.interval, listUsersOfStreamRequest.interval) &&
            Objects.equals(this.startTime, listUsersOfStreamRequest.startTime) &&
            Objects.equals(this.endTime, listUsersOfStreamRequest.endTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(playDomain, app, stream, isp, region, interval, startTime, endTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsersOfStreamRequest {\n");
        sb.append("    playDomain: ").append(toIndentedString(playDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

