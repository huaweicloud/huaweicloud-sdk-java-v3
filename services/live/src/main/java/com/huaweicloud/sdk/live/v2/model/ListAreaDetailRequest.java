package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListAreaDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_domains")

    private List<String> playDomains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    /**
     * 查询数据的时间粒度。支持300（默认值）、3600和86400秒。若参数为空，则默认为300秒。  注意，若metric的值为player（观众数），则interval填入的值不起效果，查询粒度interval默认为60秒。 
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
            if (value == null) {
                return null;
            }
            IntervalEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IntervalEnum(value);
            }
            return result;
        }

        public static IntervalEnum valueOf(Integer value) {
            if (value == null) {
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
    @JsonProperty(value = "interval")

    private IntervalEnum interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private List<String> isp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private List<String> area = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private String metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    public ListAreaDetailRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询起始时间。日期格式按照ISO8601表示法，并使用UTC时间。  格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度1天，最大查询周期90天。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListAreaDetailRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询结束时间。日期格式按照ISO8601表示法，并使用UTC时间。  格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度1天，最大查询周期90天。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListAreaDetailRequest withPlayDomains(List<String> playDomains) {
        this.playDomains = playDomains;
        return this;
    }

    public ListAreaDetailRequest addPlayDomainsItem(String playDomainsItem) {
        if (this.playDomains == null) {
            this.playDomains = new ArrayList<>();
        }
        this.playDomains.add(playDomainsItem);
        return this;
    }

    public ListAreaDetailRequest withPlayDomains(Consumer<List<String>> playDomainsSetter) {
        if (this.playDomains == null) {
            this.playDomains = new ArrayList<>();
        }
        playDomainsSetter.accept(this.playDomains);
        return this;
    }

    /**
     * 需查询的播放域名列表，最多支持查询100个域名。 
     * @return playDomains
     */
    public List<String> getPlayDomains() {
        return playDomains;
    }

    public void setPlayDomains(List<String> playDomains) {
        this.playDomains = playDomains;
    }

    public ListAreaDetailRequest withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 需查询的app。 
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ListAreaDetailRequest withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 流名称。
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public ListAreaDetailRequest withInterval(IntervalEnum interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 查询数据的时间粒度。支持300（默认值）、3600和86400秒。若参数为空，则默认为300秒。  注意，若metric的值为player（观众数），则interval填入的值不起效果，查询粒度interval默认为60秒。 
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

    public ListAreaDetailRequest withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    public ListAreaDetailRequest addIspItem(String ispItem) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        this.isp.add(ispItem);
        return this;
    }

    public ListAreaDetailRequest withIsp(Consumer<List<String>> ispSetter) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        ispSetter.accept(this.isp);
        return this;
    }

    /**
     * 运营商列表，取值如下： - CMCC：移动 - CTCC：电信 - CUCC：联通 - OTHER：其他  若参数为空，则查询所有运营商。 
     * @return isp
     */
    public List<String> getIsp() {
        return isp;
    }

    public void setIsp(List<String> isp) {
        this.isp = isp;
    }

    public ListAreaDetailRequest withArea(List<String> area) {
        this.area = area;
        return this;
    }

    public ListAreaDetailRequest addAreaItem(String areaItem) {
        if (this.area == null) {
            this.area = new ArrayList<>();
        }
        this.area.add(areaItem);
        return this;
    }

    public ListAreaDetailRequest withArea(Consumer<List<String>> areaSetter) {
        if (this.area == null) {
            this.area = new ArrayList<>();
        }
        areaSetter.accept(this.area);
        return this;
    }

    /**
     * 需查询的计费大区，取值如下： - CN：中国内地。 - AP1：亚太1区。 - AP2：亚太2区。 - AP3：亚太3区。 - MEAA：中东非洲。 - SA：南美。 - EU：欧洲。 - ALL：全部。  中国内地返回结果为省份/直辖市的中文名称，比如：广东、上海； 海外大区与地区/国家的对应关系请参考[地区/国家代码对照表](live_03_0049.xml)。 
     * @return area
     */
    public List<String> getArea() {
        return area;
    }

    public void setArea(List<String> area) {
        this.area = area;
    }

    public ListAreaDetailRequest withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * 指标，取值如下： - bandwidth：带宽 - traffic：流量 - player：观众数 
     * @return metric
     */
    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public ListAreaDetailRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 请求协议，取值如下： - flv - hls 
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAreaDetailRequest listAreaDetailRequest = (ListAreaDetailRequest) o;
        return Objects.equals(this.startTime, listAreaDetailRequest.startTime)
            && Objects.equals(this.endTime, listAreaDetailRequest.endTime)
            && Objects.equals(this.playDomains, listAreaDetailRequest.playDomains)
            && Objects.equals(this.app, listAreaDetailRequest.app)
            && Objects.equals(this.stream, listAreaDetailRequest.stream)
            && Objects.equals(this.interval, listAreaDetailRequest.interval)
            && Objects.equals(this.isp, listAreaDetailRequest.isp)
            && Objects.equals(this.area, listAreaDetailRequest.area)
            && Objects.equals(this.metric, listAreaDetailRequest.metric)
            && Objects.equals(this.protocol, listAreaDetailRequest.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, playDomains, app, stream, interval, isp, area, metric, protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAreaDetailRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    playDomains: ").append(toIndentedString(playDomains)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
