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
public class ShowStatisticsEventRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    /**
     * 类型：  - attack_count——不同类型攻击事件次数   - flow_drop_count——访问与攻击次数   - ddos_attack_count——DDos攻击次数
     */
    public static final class TypeEnum {

        /**
         * Enum ATTACK_COUNT for value: "attack_count"
         */
        public static final TypeEnum ATTACK_COUNT = new TypeEnum("attack_count");

        /**
         * Enum FLOW_DROP_COUNT for value: "flow_drop_count"
         */
        public static final TypeEnum FLOW_DROP_COUNT = new TypeEnum("flow_drop_count");

        /**
         * Enum DDOS_ATTACK_COUNT for value: "ddos_attack_count"
         */
        public static final TypeEnum DDOS_ATTACK_COUNT = new TypeEnum("ddos_attack_count");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("attack_count", ATTACK_COUNT);
            map.put("flow_drop_count", FLOW_DROP_COUNT);
            map.put("ddos_attack_count", DDOS_ATTACK_COUNT);
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

    public ShowStatisticsEventRequest withStartTime(Long startTime) {
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

    public ShowStatisticsEventRequest withEndTime(Long endTime) {
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

    public ShowStatisticsEventRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 类型：  - attack_count——不同类型攻击事件次数   - flow_drop_count——访问与攻击次数   - ddos_attack_count——DDos攻击次数
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowStatisticsEventRequest withEnterpriseProjectId(String enterpriseProjectId) {
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
        ShowStatisticsEventRequest that = (ShowStatisticsEventRequest) obj;
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
        sb.append("class ShowStatisticsEventRequest {\n");
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
