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
public class ListBandwidthDetailRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="play_domains")
    
    private List<String> playDomains = null;
    

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
     * 查询数据的时间粒度。支持300（默认值）, 3600和86400秒。不传值时，使用默认值300秒。 
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
            return value;
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
            if (obj instanceof IntervalEnum) {
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

    public ListBandwidthDetailRequest withPlayDomains(List<String> playDomains) {
        this.playDomains = playDomains;
        return this;
    }

    
    public ListBandwidthDetailRequest addPlayDomainsItem(String playDomainsItem) {
        if(this.playDomains == null) {
            this.playDomains = new ArrayList<>();
        }
        this.playDomains.add(playDomainsItem);
        return this;
    }

    public ListBandwidthDetailRequest withPlayDomains(Consumer<List<String>> playDomainsSetter) {
        if(this.playDomains == null) {
            this.playDomains = new ArrayList<>();
        }
        playDomainsSetter.accept(this.playDomains);
        return this;
    }

    /**
     * 播放域名列表，最多支持查询10个域名，多个域名以逗号分隔。 
     * @return playDomains
     */
    public List<String> getPlayDomains() {
        return playDomains;
    }

    public void setPlayDomains(List<String> playDomains) {
        this.playDomains = playDomains;
    }

    

    public ListBandwidthDetailRequest withApp(String app) {
        this.app = app;
        return this;
    }

    


    /**
     * 应用名称。
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    

    public ListBandwidthDetailRequest withStream(String stream) {
        this.stream = stream;
        return this;
    }

    


    /**
     * 流名。
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    

    public ListBandwidthDetailRequest withRegion(List<String> region) {
        this.region = region;
        return this;
    }

    
    public ListBandwidthDetailRequest addRegionItem(String regionItem) {
        if(this.region == null) {
            this.region = new ArrayList<>();
        }
        this.region.add(regionItem);
        return this;
    }

    public ListBandwidthDetailRequest withRegion(Consumer<List<String>> regionSetter) {
        if(this.region == null) {
            this.region = new ArrayList<>();
        }
        regionSetter.accept(this.region);
        return this;
    }

    /**
     * 区域列表。具体取值请参考[省份名称缩写](live_03_0043.xml)，不填写查询所有区域。 
     * @return region
     */
    public List<String> getRegion() {
        return region;
    }

    public void setRegion(List<String> region) {
        this.region = region;
    }

    

    public ListBandwidthDetailRequest withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    
    public ListBandwidthDetailRequest addIspItem(String ispItem) {
        if(this.isp == null) {
            this.isp = new ArrayList<>();
        }
        this.isp.add(ispItem);
        return this;
    }

    public ListBandwidthDetailRequest withIsp(Consumer<List<String>> ispSetter) {
        if(this.isp == null) {
            this.isp = new ArrayList<>();
        }
        ispSetter.accept(this.isp);
        return this;
    }

    /**
     * 运营商列表，取值如下： - \"CMCC ：移动\" - \"CTCC ： 电信\" - \"CUCC ：联通\" - \"OTHER: 其他\"  不填写查询所有运营商。 
     * @return isp
     */
    public List<String> getIsp() {
        return isp;
    }

    public void setIsp(List<String> isp) {
        this.isp = isp;
    }

    

    public ListBandwidthDetailRequest withInterval(IntervalEnum interval) {
        this.interval = interval;
        return this;
    }

    


    /**
     * 查询数据的时间粒度。支持300（默认值）, 3600和86400秒。不传值时，使用默认值300秒。 
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

    

    public ListBandwidthDetailRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 起始时间。日期格式按照ISO8601表示法，并使用UTC时间。  格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度31天，最大查询周期90天。  若参数为空，默认查询7天数据。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ListBandwidthDetailRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 结束时间。日期格式按照ISO8601表示法，并使用UTC时间。  格式为：YYYY-MM-DDThh:mm:ssZ。  若参数为空，默认为当前时间。结束时间需大于起始时间。 
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
        ListBandwidthDetailRequest listBandwidthDetailRequest = (ListBandwidthDetailRequest) o;
        return Objects.equals(this.playDomains, listBandwidthDetailRequest.playDomains) &&
            Objects.equals(this.app, listBandwidthDetailRequest.app) &&
            Objects.equals(this.stream, listBandwidthDetailRequest.stream) &&
            Objects.equals(this.region, listBandwidthDetailRequest.region) &&
            Objects.equals(this.isp, listBandwidthDetailRequest.isp) &&
            Objects.equals(this.interval, listBandwidthDetailRequest.interval) &&
            Objects.equals(this.startTime, listBandwidthDetailRequest.startTime) &&
            Objects.equals(this.endTime, listBandwidthDetailRequest.endTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(playDomains, app, stream, region, isp, interval, startTime, endTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthDetailRequest {\n");
        sb.append("    playDomains: ").append(toIndentedString(playDomains)).append("\n");
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

