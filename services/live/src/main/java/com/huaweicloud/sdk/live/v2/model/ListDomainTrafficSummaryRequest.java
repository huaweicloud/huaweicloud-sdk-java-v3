package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListDomainTrafficSummaryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_domains")

    private List<String> playDomains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private List<String> region = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private List<String> isp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ListDomainTrafficSummaryRequest withPlayDomains(List<String> playDomains) {
        this.playDomains = playDomains;
        return this;
    }

    public ListDomainTrafficSummaryRequest addPlayDomainsItem(String playDomainsItem) {
        if (this.playDomains == null) {
            this.playDomains = new ArrayList<>();
        }
        this.playDomains.add(playDomainsItem);
        return this;
    }

    public ListDomainTrafficSummaryRequest withPlayDomains(Consumer<List<String>> playDomainsSetter) {
        if (this.playDomains == null) {
            this.playDomains = new ArrayList<>();
        }
        playDomainsSetter.accept(this.playDomains);
        return this;
    }

    /** 播放域名列表，最多支持查询10个域名，多个域名以逗号分隔。
     * 
     * @return playDomains */
    public List<String> getPlayDomains() {
        return playDomains;
    }

    public void setPlayDomains(List<String> playDomains) {
        this.playDomains = playDomains;
    }

    public ListDomainTrafficSummaryRequest withApp(String app) {
        this.app = app;
        return this;
    }

    /** 应用名称。
     * 
     * @return app */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ListDomainTrafficSummaryRequest withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /** 流名。
     * 
     * @return stream */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public ListDomainTrafficSummaryRequest withRegion(List<String> region) {
        this.region = region;
        return this;
    }

    public ListDomainTrafficSummaryRequest addRegionItem(String regionItem) {
        if (this.region == null) {
            this.region = new ArrayList<>();
        }
        this.region.add(regionItem);
        return this;
    }

    public ListDomainTrafficSummaryRequest withRegion(Consumer<List<String>> regionSetter) {
        if (this.region == null) {
            this.region = new ArrayList<>();
        }
        regionSetter.accept(this.region);
        return this;
    }

    /** 区域列表。具体取值请参考[省份名称缩写](live_03_0043.xml)，不填写查询所有区域。
     * 
     * @return region */
    public List<String> getRegion() {
        return region;
    }

    public void setRegion(List<String> region) {
        this.region = region;
    }

    public ListDomainTrafficSummaryRequest withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    public ListDomainTrafficSummaryRequest addIspItem(String ispItem) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        this.isp.add(ispItem);
        return this;
    }

    public ListDomainTrafficSummaryRequest withIsp(Consumer<List<String>> ispSetter) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        ispSetter.accept(this.isp);
        return this;
    }

    /** 运营商列表。取值如下： - \"CMCC ：移动\" - \"CTCC ： 电信\" - \"CUCC ：联通\" - \"OTHER: 其他\" 不填写查询所有运营商。
     * 
     * @return isp */
    public List<String> getIsp() {
        return isp;
    }

    public void setIsp(List<String> isp) {
        this.isp = isp;
    }

    public ListDomainTrafficSummaryRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 起始时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度31天，最大查询周期90天。 若参数为空，默认查询7天数据。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListDomainTrafficSummaryRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 结束时间。日期格式按照ISO8601表示法，并使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。 若参数为空，默认为当前时间。结束时间需大于起始时间。
     * 
     * @return endTime */
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
        ListDomainTrafficSummaryRequest listDomainTrafficSummaryRequest = (ListDomainTrafficSummaryRequest) o;
        return Objects.equals(this.playDomains, listDomainTrafficSummaryRequest.playDomains)
            && Objects.equals(this.app, listDomainTrafficSummaryRequest.app)
            && Objects.equals(this.stream, listDomainTrafficSummaryRequest.stream)
            && Objects.equals(this.region, listDomainTrafficSummaryRequest.region)
            && Objects.equals(this.isp, listDomainTrafficSummaryRequest.isp)
            && Objects.equals(this.startTime, listDomainTrafficSummaryRequest.startTime)
            && Objects.equals(this.endTime, listDomainTrafficSummaryRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playDomains, app, stream, region, isp, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainTrafficSummaryRequest {\n");
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
