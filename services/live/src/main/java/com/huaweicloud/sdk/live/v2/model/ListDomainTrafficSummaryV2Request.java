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
public class ListDomainTrafficSummaryV2Request  {



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
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;

    public ListDomainTrafficSummaryV2Request withPlayDomains(List<String> playDomains) {
        this.playDomains = playDomains;
        return this;
    }

    
    public ListDomainTrafficSummaryV2Request addPlayDomainsItem(String playDomainsItem) {
        this.playDomains.add(playDomainsItem);
        return this;
    }

    public ListDomainTrafficSummaryV2Request withPlayDomains(Consumer<List<String>> playDomainsSetter) {
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

    public ListDomainTrafficSummaryV2Request withApp(String app) {
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

    public ListDomainTrafficSummaryV2Request withStream(String stream) {
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

    public ListDomainTrafficSummaryV2Request withRegion(List<String> region) {
        this.region = region;
        return this;
    }

    
    public ListDomainTrafficSummaryV2Request addRegionItem(String regionItem) {
        if (this.region == null) {
            this.region = new ArrayList<>();
        }
        this.region.add(regionItem);
        return this;
    }

    public ListDomainTrafficSummaryV2Request withRegion(Consumer<List<String>> regionSetter) {
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

    public ListDomainTrafficSummaryV2Request withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    
    public ListDomainTrafficSummaryV2Request addIspItem(String ispItem) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        this.isp.add(ispItem);
        return this;
    }

    public ListDomainTrafficSummaryV2Request withIsp(Consumer<List<String>> ispSetter) {
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

    public ListDomainTrafficSummaryV2Request withStartTime(String startTime) {
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

    public ListDomainTrafficSummaryV2Request withEndTime(String endTime) {
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
        ListDomainTrafficSummaryV2Request listDomainTrafficSummaryV2Request = (ListDomainTrafficSummaryV2Request) o;
        return Objects.equals(this.playDomains, listDomainTrafficSummaryV2Request.playDomains) &&
            Objects.equals(this.app, listDomainTrafficSummaryV2Request.app) &&
            Objects.equals(this.stream, listDomainTrafficSummaryV2Request.stream) &&
            Objects.equals(this.region, listDomainTrafficSummaryV2Request.region) &&
            Objects.equals(this.isp, listDomainTrafficSummaryV2Request.isp) &&
            Objects.equals(this.startTime, listDomainTrafficSummaryV2Request.startTime) &&
            Objects.equals(this.endTime, listDomainTrafficSummaryV2Request.endTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(playDomains, app, stream, region, isp, startTime, endTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainTrafficSummaryV2Request {\n");
        sb.append("    playDomains: ").append(toIndentedString(playDomains)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
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

