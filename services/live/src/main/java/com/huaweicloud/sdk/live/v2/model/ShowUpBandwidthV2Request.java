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
public class ShowUpBandwidthV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_domains")
    
    private List<String> publishDomains = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app")
    
    private String app;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stream")
    
    private String stream;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private List<String> region = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isp")
    
    private List<String> isp = null;
        /**
     * Gets or Sets interval
     */
    public static final class IntervalEnum {

        
        /**
         * Enum NUMBER_300 for value: 300
         */
        public static final IntervalEnum NUMBER_300 = new IntervalEnum(300);
        
        /**
         * Enum NUMBER_3600 for value: 3600
         */
        public static final IntervalEnum NUMBER_3600 = new IntervalEnum(3600);
        
        /**
         * Enum NUMBER_86400 for value: 86400
         */
        public static final IntervalEnum NUMBER_86400 = new IntervalEnum(86400);
        

        private static final Map<Integer, IntervalEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IntervalEnum> createStaticFields() {
            Map<Integer, IntervalEnum> map = new HashMap<>();
            map.put(300, NUMBER_300);
            map.put(3600, NUMBER_3600);
            map.put(86400, NUMBER_86400);
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

    public ShowUpBandwidthV2Request withPublishDomains(List<String> publishDomains) {
        this.publishDomains = publishDomains;
        return this;
    }

    
    public ShowUpBandwidthV2Request addPublishDomainsItem(String publishDomainsItem) {
        this.publishDomains.add(publishDomainsItem);
        return this;
    }

    public ShowUpBandwidthV2Request withPublishDomains(Consumer<List<String>> publishDomainsSetter) {
        if(this.publishDomains == null ){
            this.publishDomains = new ArrayList<>();
        }
        publishDomainsSetter.accept(this.publishDomains);
        return this;
    }

    /**
     * Get publishDomains
     * @return publishDomains
     */
    public List<String> getPublishDomains() {
        return publishDomains;
    }

    public void setPublishDomains(List<String> publishDomains) {
        this.publishDomains = publishDomains;
    }

    public ShowUpBandwidthV2Request withApp(String app) {
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

    public ShowUpBandwidthV2Request withStream(String stream) {
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

    public ShowUpBandwidthV2Request withRegion(List<String> region) {
        this.region = region;
        return this;
    }

    
    public ShowUpBandwidthV2Request addRegionItem(String regionItem) {
        if (this.region == null) {
            this.region = new ArrayList<>();
        }
        this.region.add(regionItem);
        return this;
    }

    public ShowUpBandwidthV2Request withRegion(Consumer<List<String>> regionSetter) {
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

    public ShowUpBandwidthV2Request withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    
    public ShowUpBandwidthV2Request addIspItem(String ispItem) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        this.isp.add(ispItem);
        return this;
    }

    public ShowUpBandwidthV2Request withIsp(Consumer<List<String>> ispSetter) {
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

    public ShowUpBandwidthV2Request withInterval(IntervalEnum interval) {
        this.interval = interval;
        return this;
    }

    


    /**
     * Get interval
     * minimum: 300
     * maximum: 86400
     * @return interval
     */
    public IntervalEnum getInterval() {
        return interval;
    }

    public void setInterval(IntervalEnum interval) {
        this.interval = interval;
    }

    public ShowUpBandwidthV2Request withStartTime(String startTime) {
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

    public ShowUpBandwidthV2Request withEndTime(String endTime) {
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
        ShowUpBandwidthV2Request showUpBandwidthV2Request = (ShowUpBandwidthV2Request) o;
        return Objects.equals(this.publishDomains, showUpBandwidthV2Request.publishDomains) &&
            Objects.equals(this.app, showUpBandwidthV2Request.app) &&
            Objects.equals(this.stream, showUpBandwidthV2Request.stream) &&
            Objects.equals(this.region, showUpBandwidthV2Request.region) &&
            Objects.equals(this.isp, showUpBandwidthV2Request.isp) &&
            Objects.equals(this.interval, showUpBandwidthV2Request.interval) &&
            Objects.equals(this.startTime, showUpBandwidthV2Request.startTime) &&
            Objects.equals(this.endTime, showUpBandwidthV2Request.endTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publishDomains, app, stream, region, isp, interval, startTime, endTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUpBandwidthV2Request {\n");
        sb.append("    publishDomains: ").append(toIndentedString(publishDomains)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
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

