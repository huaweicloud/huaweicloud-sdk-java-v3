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
public class ListResponseCodeTimelineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<String> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<String> instances = null;

    /**
     * **参数解释：** 响应源 **约束限制：** 不涉及 **取值范围：** - WAF - UPSTREAM  **默认取值：** 不涉及
     */
    public static final class ResponseSourceEnum {

        /**
         * Enum WAF for value: "WAF"
         */
        public static final ResponseSourceEnum WAF = new ResponseSourceEnum("WAF");

        /**
         * Enum UPSTREAM for value: "UPSTREAM"
         */
        public static final ResponseSourceEnum UPSTREAM = new ResponseSourceEnum("UPSTREAM");

        private static final Map<String, ResponseSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResponseSourceEnum> createStaticFields() {
            Map<String, ResponseSourceEnum> map = new HashMap<>();
            map.put("WAF", WAF);
            map.put("UPSTREAM", UPSTREAM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResponseSourceEnum(String value) {
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
        public static ResponseSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResponseSourceEnum(value));
        }

        public static ResponseSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResponseSourceEnum) {
                return this.value.equals(((ResponseSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_source")

    private ResponseSourceEnum responseSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    public ListResponseCodeTimelineRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目ID。若需要查询当前用户所有企业项目绑定的资源信息，请传参all_granted_eps。 **约束限制：** 不涉及 **取值范围：**  - 0：代表default企业项目  - all_granted_eps：代表所有企业项目  - 其它企业项目ID：长度为36个字符 **默认取值：** 0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListResponseCodeTimelineRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * **参数解释：** 起始时间（13位毫秒时间戳） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ListResponseCodeTimelineRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * **参数解释：** 结束时间（13位毫秒时间戳） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ListResponseCodeTimelineRequest withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ListResponseCodeTimelineRequest addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListResponseCodeTimelineRequest withHosts(Consumer<List<String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * **参数解释：** 要查询的域名列表，通过 ”查询独享模式域名列表“（ListPremiumHost）或者 “查询云模式防护域名列表” （ListHost）接口获取 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public ListResponseCodeTimelineRequest withInstances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    public ListResponseCodeTimelineRequest addInstancesItem(String instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ListResponseCodeTimelineRequest withInstances(Consumer<List<String>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * **参数解释：** 要查询的实例列表，通过 “查询WAF独享引擎列表”（ListInstance）接口获取 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return instances
     */
    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public ListResponseCodeTimelineRequest withResponseSource(ResponseSourceEnum responseSource) {
        this.responseSource = responseSource;
        return this;
    }

    /**
     * **参数解释：** 响应源 **约束限制：** 不涉及 **取值范围：** - WAF - UPSTREAM  **默认取值：** 不涉及
     * @return responseSource
     */
    public ResponseSourceEnum getResponseSource() {
        return responseSource;
    }

    public void setResponseSource(ResponseSourceEnum responseSource) {
        this.responseSource = responseSource;
    }

    public ListResponseCodeTimelineRequest withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * **参数解释：** 展示维度，按天展示时传\"DAY\" **约束限制：** 不涉及 **取值范围：** - DAY  **默认取值：** 不涉及
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResponseCodeTimelineRequest that = (ListResponseCodeTimelineRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.hosts, that.hosts) && Objects.equals(this.instances, that.instances)
            && Objects.equals(this.responseSource, that.responseSource) && Objects.equals(this.groupBy, that.groupBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, from, to, hosts, instances, responseSource, groupBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResponseCodeTimelineRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    responseSource: ").append(toIndentedString(responseSource)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
