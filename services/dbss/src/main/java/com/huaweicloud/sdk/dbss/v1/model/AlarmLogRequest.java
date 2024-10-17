package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmLogRequest
 */
public class AlarmLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private AlarmLogRequestTime time;

    /**
     * 风险级别 - LOW - MEDIUM - HIGH
     */
    public static final class RiskEnum {

        /**
         * Enum LOW for value: "LOW"
         */
        public static final RiskEnum LOW = new RiskEnum("LOW");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final RiskEnum MEDIUM = new RiskEnum("MEDIUM");

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final RiskEnum HIGH = new RiskEnum("HIGH");

        private static final Map<String, RiskEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RiskEnum> createStaticFields() {
            Map<String, RiskEnum> map = new HashMap<>();
            map.put("LOW", LOW);
            map.put("MEDIUM", MEDIUM);
            map.put("HIGH", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RiskEnum(String value) {
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
        public static RiskEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RiskEnum(value));
        }

        public static RiskEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RiskEnum) {
                return this.value.equals(((RiskEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk")

    private RiskEnum risk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    /**
     * 告警确认状态 - DONE: 已确认 - UNDO: 未确认
     */
    public static final class StatusEnum {

        /**
         * Enum DONE for value: "DONE"
         */
        public static final StatusEnum DONE = new StatusEnum("DONE");

        /**
         * Enum UNDO for value: "UNDO"
         */
        public static final StatusEnum UNDO = new StatusEnum("UNDO");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("DONE", DONE);
            map.put("UNDO", UNDO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public AlarmLogRequest withTime(AlarmLogRequestTime time) {
        this.time = time;
        return this;
    }

    public AlarmLogRequest withTime(Consumer<AlarmLogRequestTime> timeSetter) {
        if (this.time == null) {
            this.time = new AlarmLogRequestTime();
            timeSetter.accept(this.time);
        }

        return this;
    }

    /**
     * Get time
     * @return time
     */
    public AlarmLogRequestTime getTime() {
        return time;
    }

    public void setTime(AlarmLogRequestTime time) {
        this.time = time;
    }

    public AlarmLogRequest withRisk(RiskEnum risk) {
        this.risk = risk;
        return this;
    }

    /**
     * 风险级别 - LOW - MEDIUM - HIGH
     * @return risk
     */
    public RiskEnum getRisk() {
        return risk;
    }

    public void setRisk(RiskEnum risk) {
        this.risk = risk;
    }

    public AlarmLogRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 告警类型 - RISK_RULE: 风险规则 - RISK_CPU: CPU超限 - RISK_MEMORY: 内存超限 - RISK_DISK: 磁盘超限 - RISK_DISK_CAPACITY: 磁盘容量不足六个月 - RISK_BACKUP: 备份失败 - AUDIT_QPS_OVERFLOW: 流量超限入库延迟告警 - RISK_AGENT: Agent异常 - AUDIT_BACKUP_FAILED: 实例备份失败(运维侧)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AlarmLogRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 告警确认状态 - DONE: 已确认 - UNDO: 未确认
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AlarmLogRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 页码
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public AlarmLogRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 每页条数
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmLogRequest that = (AlarmLogRequest) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.risk, that.risk)
            && Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.page, that.page) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, risk, type, status, page, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmLogRequest {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
