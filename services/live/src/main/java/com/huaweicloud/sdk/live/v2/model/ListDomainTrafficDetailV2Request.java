package com.huaweicloud.sdk.live.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListDomainTrafficDetailV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="play_domains")
    
    private List<String> playDomains = new ArrayList<>();
    

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
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interval")
    
    private Integer interval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;

    public ListDomainTrafficDetailV2Request withPlayDomains(List<String> playDomains) {
        this.playDomains = playDomains;
        return this;
    }

    
    public ListDomainTrafficDetailV2Request addPlayDomainsItem(String playDomainsItem) {
        this.playDomains.add(playDomainsItem);
        return this;
    }

    public ListDomainTrafficDetailV2Request withPlayDomains(Consumer<List<String>> playDomainsSetter) {
        if(this.playDomains == null ){
            this.playDomains = new ArrayList<>();
        }
        playDomainsSetter.accept(this.playDomains);
        return this;
    }

    /**
     * Get playDomains
     * @return playDomains
     */
    public List<String> getPlayDomains() {
        return playDomains;
    }

    public void setPlayDomains(List<String> playDomains) {
        this.playDomains = playDomains;
    }

    public ListDomainTrafficDetailV2Request withApp(String app) {
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

    public ListDomainTrafficDetailV2Request withStream(String stream) {
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

    public ListDomainTrafficDetailV2Request withRegion(List<String> region) {
        this.region = region;
        return this;
    }

    
    public ListDomainTrafficDetailV2Request addRegionItem(String regionItem) {
        if (this.region == null) {
            this.region = new ArrayList<>();
        }
        this.region.add(regionItem);
        return this;
    }

    public ListDomainTrafficDetailV2Request withRegion(Consumer<List<String>> regionSetter) {
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

    public ListDomainTrafficDetailV2Request withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    
    public ListDomainTrafficDetailV2Request addIspItem(String ispItem) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        this.isp.add(ispItem);
        return this;
    }

    public ListDomainTrafficDetailV2Request withIsp(Consumer<List<String>> ispSetter) {
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

    public ListDomainTrafficDetailV2Request withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    


    /**
     * Get interval
     * minimum: 300
     * maximum: 86400
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public ListDomainTrafficDetailV2Request withStartTime(String startTime) {
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

    public ListDomainTrafficDetailV2Request withEndTime(String endTime) {
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
        ListDomainTrafficDetailV2Request listDomainTrafficDetailV2Request = (ListDomainTrafficDetailV2Request) o;
        return Objects.equals(this.playDomains, listDomainTrafficDetailV2Request.playDomains) &&
            Objects.equals(this.app, listDomainTrafficDetailV2Request.app) &&
            Objects.equals(this.stream, listDomainTrafficDetailV2Request.stream) &&
            Objects.equals(this.region, listDomainTrafficDetailV2Request.region) &&
            Objects.equals(this.isp, listDomainTrafficDetailV2Request.isp) &&
            Objects.equals(this.interval, listDomainTrafficDetailV2Request.interval) &&
            Objects.equals(this.startTime, listDomainTrafficDetailV2Request.startTime) &&
            Objects.equals(this.endTime, listDomainTrafficDetailV2Request.endTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(playDomains, app, stream, region, isp, interval, startTime, endTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainTrafficDetailV2Request {\n");
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

