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
public class ListTranscodeConcurrencyNumRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_domains")

    private List<String> publishDomains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    /**
     * 查询数据的时间粒度。支持60, 300（默认值）和3600秒。不传值时，使用默认值300秒。 
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

        /**
         * Enum NUMBER_3600 for value: 3600
         */
        public static final IntervalEnum NUMBER_3600 = new IntervalEnum(3600);

        private static final Map<Integer, IntervalEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IntervalEnum> createStaticFields() {
            Map<Integer, IntervalEnum> map = new HashMap<>();
            map.put(60, NUMBER_60);
            map.put(300, NUMBER_300);
            map.put(3600, NUMBER_3600);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IntervalEnum(value));
        }

        public static IntervalEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ListTranscodeConcurrencyNumRequest withPublishDomains(List<String> publishDomains) {
        this.publishDomains = publishDomains;
        return this;
    }

    public ListTranscodeConcurrencyNumRequest addPublishDomainsItem(String publishDomainsItem) {
        if (this.publishDomains == null) {
            this.publishDomains = new ArrayList<>();
        }
        this.publishDomains.add(publishDomainsItem);
        return this;
    }

    public ListTranscodeConcurrencyNumRequest withPublishDomains(Consumer<List<String>> publishDomainsSetter) {
        if (this.publishDomains == null) {
            this.publishDomains = new ArrayList<>();
        }
        publishDomainsSetter.accept(this.publishDomains);
        return this;
    }

    /**
     * 推流域名列表，最多支持查询100个域名，多个域名以逗号分隔。  若查询多个域名，则返回的是多个域名合并数据。 
     * @return publishDomains
     */
    public List<String> getPublishDomains() {
        return publishDomains;
    }

    public void setPublishDomains(List<String> publishDomains) {
        this.publishDomains = publishDomains;
    }

    public ListTranscodeConcurrencyNumRequest withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用名称
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ListTranscodeConcurrencyNumRequest withInterval(IntervalEnum interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 查询数据的时间粒度。支持60, 300（默认值）和3600秒。不传值时，使用默认值300秒。 
     * minimum: 60
     * maximum: 3600
     * @return interval
     */
    public IntervalEnum getInterval() {
        return interval;
    }

    public void setInterval(IntervalEnum interval) {
        this.interval = interval;
    }

    public ListTranscodeConcurrencyNumRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间。日期格式按照ISO8601表示法，并使用UTC时间。  格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度1天，最大查询周期90天。  若参数为空，默认查询1天数据。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListTranscodeConcurrencyNumRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。日期格式按照ISO8601表示法，并使用UTC时间。  格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度1天，最大查询周期90天。  若参数为空，默认为当前时间。结束时间需大于起始时间。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTranscodeConcurrencyNumRequest that = (ListTranscodeConcurrencyNumRequest) obj;
        return Objects.equals(this.publishDomains, that.publishDomains) && Objects.equals(this.app, that.app)
            && Objects.equals(this.interval, that.interval) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDomains, app, interval, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTranscodeConcurrencyNumRequest {\n");
        sb.append("    publishDomains: ").append(toIndentedString(publishDomains)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
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
