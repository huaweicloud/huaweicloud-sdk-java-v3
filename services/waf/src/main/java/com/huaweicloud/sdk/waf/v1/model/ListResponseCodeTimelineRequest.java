package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
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

    private String hosts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private String instances;

    /** 响应源 */
    public static final class ResponseSourceEnum {

        /** Enum WAF for value: "WAF" */
        public static final ResponseSourceEnum WAF = new ResponseSourceEnum("WAF");

        /** Enum UPSTREAM for value: "UPSTREAM" */
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
            ResponseSourceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResponseSourceEnum(value);
            }
            return result;
        }

        public static ResponseSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResponseSourceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** 企业项目id
     * 
     * @return enterpriseProjectId */
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

    /** 起始时间
     * 
     * @return from */
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

    /** 结束时间
     * 
     * @return to */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ListResponseCodeTimelineRequest withHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }

    /** 要查询域名列表（通过ListHost接口查询）
     * 
     * @return hosts */
    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public ListResponseCodeTimelineRequest withInstances(String instances) {
        this.instances = instances;
        return this;
    }

    /** 要查询实例列表
     * 
     * @return instances */
    public String getInstances() {
        return instances;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    public ListResponseCodeTimelineRequest withResponseSource(ResponseSourceEnum responseSource) {
        this.responseSource = responseSource;
        return this;
    }

    /** 响应源
     * 
     * @return responseSource */
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

    /** 展示维度，按天展示时传\"DAY\"
     * 
     * @return groupBy */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResponseCodeTimelineRequest listResponseCodeTimelineRequest = (ListResponseCodeTimelineRequest) o;
        return Objects.equals(this.enterpriseProjectId, listResponseCodeTimelineRequest.enterpriseProjectId)
            && Objects.equals(this.from, listResponseCodeTimelineRequest.from)
            && Objects.equals(this.to, listResponseCodeTimelineRequest.to)
            && Objects.equals(this.hosts, listResponseCodeTimelineRequest.hosts)
            && Objects.equals(this.instances, listResponseCodeTimelineRequest.instances)
            && Objects.equals(this.responseSource, listResponseCodeTimelineRequest.responseSource)
            && Objects.equals(this.groupBy, listResponseCodeTimelineRequest.groupBy);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
