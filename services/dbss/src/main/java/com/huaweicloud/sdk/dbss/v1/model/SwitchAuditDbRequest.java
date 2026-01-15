package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SwitchAuditDbRequest
 */
public class SwitchAuditDbRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 开关状态 - ON：开启 - OFF：关闭
     */
    public static final class StatusEnum {

        /**
         * Enum ON for value: "ON"
         */
        public static final StatusEnum ON = new StatusEnum("ON");

        /**
         * Enum OFF for value: "OFF"
         */
        public static final StatusEnum OFF = new StatusEnum("OFF");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ON", ON);
            map.put("OFF", OFF);
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
    @JsonProperty(value = "lts_audit_switch")

    private Integer ltsAuditSwitch;

    public SwitchAuditDbRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库ID,可在查询数据库列表接口的ID字段获取。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SwitchAuditDbRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 开关状态 - ON：开启 - OFF：关闭
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public SwitchAuditDbRequest withLtsAuditSwitch(Integer ltsAuditSwitch) {
        this.ltsAuditSwitch = ltsAuditSwitch;
        return this;
    }

    /**
     * 是否关闭LTS审计,DWS数据库场景使用。若用户未选择关闭LTS审计,则不做操作。 - 1：是 - 0 或 其它：保持原状
     * @return ltsAuditSwitch
     */
    public Integer getLtsAuditSwitch() {
        return ltsAuditSwitch;
    }

    public void setLtsAuditSwitch(Integer ltsAuditSwitch) {
        this.ltsAuditSwitch = ltsAuditSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchAuditDbRequest that = (SwitchAuditDbRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.ltsAuditSwitch, that.ltsAuditSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, ltsAuditSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchAuditDbRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ltsAuditSwitch: ").append(toIndentedString(ltsAuditSwitch)).append("\n");
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
