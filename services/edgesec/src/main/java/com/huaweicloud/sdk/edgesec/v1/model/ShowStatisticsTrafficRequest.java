package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowStatisticsTrafficRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    /**
     * 类型：  - max_flow_bandwidth——DDos入流量带宽峰值   - max_drop_bandwidth——DDos入流量带宽峰值   - ddos_flow——DDos入流量   - flow_drop_traffic——入流量与清洗流量   - attack_traffic——不同类型攻击流量
     */
    public static final class TypeEnum {

        /**
         * Enum MAX_FLOW_BANDWIDTH for value: "max_flow_bandwidth"
         */
        public static final TypeEnum MAX_FLOW_BANDWIDTH = new TypeEnum("max_flow_bandwidth");

        /**
         * Enum MAX_DROP_BANDWIDTH for value: "max_drop_bandwidth"
         */
        public static final TypeEnum MAX_DROP_BANDWIDTH = new TypeEnum("max_drop_bandwidth");

        /**
         * Enum DDOS_FLOW for value: "ddos_flow"
         */
        public static final TypeEnum DDOS_FLOW = new TypeEnum("ddos_flow");

        /**
         * Enum FLOW_DROP_TRAFFIC for value: "flow_drop_traffic"
         */
        public static final TypeEnum FLOW_DROP_TRAFFIC = new TypeEnum("flow_drop_traffic");

        /**
         * Enum ATTACK_TRAFFIC for value: "attack_traffic"
         */
        public static final TypeEnum ATTACK_TRAFFIC = new TypeEnum("attack_traffic");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("max_flow_bandwidth", MAX_FLOW_BANDWIDTH);
            map.put("max_drop_bandwidth", MAX_DROP_BANDWIDTH);
            map.put("ddos_flow", DDOS_FLOW);
            map.put("flow_drop_traffic", FLOW_DROP_TRAFFIC);
            map.put("attack_traffic", ATTACK_TRAFFIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ShowStatisticsTrafficRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间（13位时间戳），需要和end_time同时使用
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowStatisticsTrafficRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间（13位时间戳），需要和start_time同时使用
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowStatisticsTrafficRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 类型：  - max_flow_bandwidth——DDos入流量带宽峰值   - max_drop_bandwidth——DDos入流量带宽峰值   - ddos_flow——DDos入流量   - flow_drop_traffic——入流量与清洗流量   - attack_traffic——不同类型攻击流量
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowStatisticsTrafficRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatisticsTrafficRequest that = (ShowStatisticsTrafficRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.type, that.type)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, type, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticsTrafficRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
