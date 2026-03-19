package com.huaweicloud.sdk.waf.v1.model;

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
public class ListUrlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    /**
     * **参数解释：** 查询的时间范围，recent参数与from、to必须使用其中一个。当同时使用recent参数与from、to时，以recent参数为准 **约束限制：** 不涉及 **取值范围：**  - yesterday：昨天  - today：今天  - 3days：近3天   - 1week：近7天   - 1month：近30天  **默认取值：** 不涉及
     */
    public static final class RecentEnum {

        /**
         * Enum YESTERDAY for value: "yesterday"
         */
        public static final RecentEnum YESTERDAY = new RecentEnum("yesterday");

        /**
         * Enum TODAY for value: "today"
         */
        public static final RecentEnum TODAY = new RecentEnum("today");

        /**
         * Enum _3DAYS for value: "3days"
         */
        public static final RecentEnum _3DAYS = new RecentEnum("3days");

        /**
         * Enum _1WEEK for value: "1week"
         */
        public static final RecentEnum _1WEEK = new RecentEnum("1week");

        /**
         * Enum _1MONTH for value: "1month"
         */
        public static final RecentEnum _1MONTH = new RecentEnum("1month");

        private static final Map<String, RecentEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecentEnum> createStaticFields() {
            Map<String, RecentEnum> map = new HashMap<>();
            map.put("yesterday", YESTERDAY);
            map.put("today", TODAY);
            map.put("3days", _3DAYS);
            map.put("1week", _1WEEK);
            map.put("1month", _1MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecentEnum(String value) {
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
        public static RecentEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecentEnum(value));
        }

        public static RecentEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecentEnum) {
                return this.value.equals(((RecentEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent")

    private RecentEnum recent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Integer from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Integer to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<String> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<String> instances = null;

    public ListUrlRequest withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * **参数解释：** 查询前TopN的结果 **约束限制：** 不涉及 **取值范围：** [1, 10] **默认取值：** 5
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public ListUrlRequest withRecent(RecentEnum recent) {
        this.recent = recent;
        return this;
    }

    /**
     * **参数解释：** 查询的时间范围，recent参数与from、to必须使用其中一个。当同时使用recent参数与from、to时，以recent参数为准 **约束限制：** 不涉及 **取值范围：**  - yesterday：昨天  - today：今天  - 3days：近3天   - 1week：近7天   - 1month：近30天  **默认取值：** 不涉及
     * @return recent
     */
    public RecentEnum getRecent() {
        return recent;
    }

    public void setRecent(RecentEnum recent) {
        this.recent = recent;
    }

    public ListUrlRequest withFrom(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释：** 起始时间(毫秒时间戳)，需要和to同时使用 **约束限制：** from <= to **取值范围：** from ~ to 最大范围30天 **默认取值：** 不涉及
     * @return from
     */
    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public ListUrlRequest withTo(Integer to) {
        this.to = to;
        return this;
    }

    /**
     * **参数解释：** 结束时间(毫秒时间戳)，需要和from同时使用 **约束限制：** from ~ to 最大范围30天 **取值范围：** 不能超过当天的结束时间 **默认取值：** 不涉及
     * @return to
     */
    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public ListUrlRequest withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ListUrlRequest addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListUrlRequest withHosts(Consumer<List<String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * **参数解释：** 要查询的域名id列表，通过 ”查询独享模式域名列表“（ListPremiumHost）或者 “查询云模式防护域名列表” （ListHost）接口获取；不传参代表查询全部域名的数据 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public ListUrlRequest withInstances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    public ListUrlRequest addInstancesItem(String instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListUrlRequest withInstances(Consumer<List<String>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * **参数解释：** 要查询的实例id列表，通过 “查询WAF独享引擎列表”（ListInstance）接口获取 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return instances
     */
    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUrlRequest that = (ListUrlRequest) obj;
        return Objects.equals(this.top, that.top) && Objects.equals(this.recent, that.recent)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.hosts, that.hosts) && Objects.equals(this.instances, that.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(top, recent, from, to, hosts, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUrlRequest {\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
