package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
public class ListDomainTrafficDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_domains")

    @JacksonXmlProperty(localName = "play_domains")

    private List<String> playDomains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    @JacksonXmlProperty(localName = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    @JacksonXmlProperty(localName = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    @JacksonXmlProperty(localName = "region")

    private List<String> region = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    @JacksonXmlProperty(localName = "isp")

    private List<String> isp = null;

    /**
    * 请求协议
    */
    public static final class ProtocolEnum {

        /**
         * Enum FLV for value: "flv"
         */
        public static final ProtocolEnum FLV = new ProtocolEnum("flv");

        /**
         * Enum HLS for value: "hls"
         */
        public static final ProtocolEnum HLS = new ProtocolEnum("hls");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("flv", FLV);
            map.put("hls", HLS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    @JacksonXmlProperty(localName = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    @JacksonXmlProperty(localName = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    public ListDomainTrafficDetailRequest withPlayDomains(List<String> playDomains) {
        this.playDomains = playDomains;
        return this;
    }

    public ListDomainTrafficDetailRequest addPlayDomainsItem(String playDomainsItem) {
        if (this.playDomains == null) {
            this.playDomains = new ArrayList<>();
        }
        this.playDomains.add(playDomainsItem);
        return this;
    }

    public ListDomainTrafficDetailRequest withPlayDomains(Consumer<List<String>> playDomainsSetter) {
        if (this.playDomains == null) {
            this.playDomains = new ArrayList<>();
        }
        playDomainsSetter.accept(this.playDomains);
        return this;
    }

    /**
     * 播放域名列表，最多支持查询100个域名，多个域名以逗号分隔。 
     * @return playDomains
     */
    public List<String> getPlayDomains() {
        return playDomains;
    }

    public void setPlayDomains(List<String> playDomains) {
        this.playDomains = playDomains;
    }

    public ListDomainTrafficDetailRequest withApp(String app) {
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

    public ListDomainTrafficDetailRequest withStream(String stream) {
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

    public ListDomainTrafficDetailRequest withRegion(List<String> region) {
        this.region = region;
        return this;
    }

    public ListDomainTrafficDetailRequest addRegionItem(String regionItem) {
        if (this.region == null) {
            this.region = new ArrayList<>();
        }
        this.region.add(regionItem);
        return this;
    }

    public ListDomainTrafficDetailRequest withRegion(Consumer<List<String>> regionSetter) {
        if (this.region == null) {
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

    public ListDomainTrafficDetailRequest withIsp(List<String> isp) {
        this.isp = isp;
        return this;
    }

    public ListDomainTrafficDetailRequest addIspItem(String ispItem) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        this.isp.add(ispItem);
        return this;
    }

    public ListDomainTrafficDetailRequest withIsp(Consumer<List<String>> ispSetter) {
        if (this.isp == null) {
            this.isp = new ArrayList<>();
        }
        ispSetter.accept(this.isp);
        return this;
    }

    /**
     * 运营商列表，取值如下： - CMCC ：移动 - CTCC ： 电信 - CUCC ：联通 - OTHER ：其他  不填写查询所有运营商。 
     * @return isp
     */
    public List<String> getIsp() {
        return isp;
    }

    public void setIsp(List<String> isp) {
        this.isp = isp;
    }

    public ListDomainTrafficDetailRequest withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 请求协议
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public ListDomainTrafficDetailRequest withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 查询数据的时间粒度。支持300（默认值）, 3600和86400秒。不传值时，使用默认值300秒。 
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

    public ListDomainTrafficDetailRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间。日期格式按照ISO8601表示法，并使用UTC时间。  格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度31天，最大查询周期一年。  若参数为空，默认查询7天数据。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListDomainTrafficDetailRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。日期格式按照ISO8601表示法，并使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。  若参数为空，默认为当前时间。结束时间需大于起始时间。 
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
        ListDomainTrafficDetailRequest listDomainTrafficDetailRequest = (ListDomainTrafficDetailRequest) o;
        return Objects.equals(this.playDomains, listDomainTrafficDetailRequest.playDomains)
            && Objects.equals(this.app, listDomainTrafficDetailRequest.app)
            && Objects.equals(this.stream, listDomainTrafficDetailRequest.stream)
            && Objects.equals(this.region, listDomainTrafficDetailRequest.region)
            && Objects.equals(this.isp, listDomainTrafficDetailRequest.isp)
            && Objects.equals(this.protocol, listDomainTrafficDetailRequest.protocol)
            && Objects.equals(this.interval, listDomainTrafficDetailRequest.interval)
            && Objects.equals(this.startTime, listDomainTrafficDetailRequest.startTime)
            && Objects.equals(this.endTime, listDomainTrafficDetailRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playDomains, app, stream, region, isp, protocol, interval, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainTrafficDetailRequest {\n");
        sb.append("    playDomains: ").append(toIndentedString(playDomains)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
