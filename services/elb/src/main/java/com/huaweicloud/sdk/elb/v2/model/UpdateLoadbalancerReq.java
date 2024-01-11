package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 更新负载均衡器的请求体
 */
public class UpdateLoadbalancerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护 - consoleProtection: 控制台修改保护
     */
    public static final class ProtectionStatusEnum {

        /**
         * Enum NONPROTECTION for value: "nonProtection"
         */
        public static final ProtectionStatusEnum NONPROTECTION = new ProtectionStatusEnum("nonProtection");

        /**
         * Enum CONSOLEPROTECTION for value: "consoleProtection"
         */
        public static final ProtectionStatusEnum CONSOLEPROTECTION = new ProtectionStatusEnum("consoleProtection");

        private static final Map<String, ProtectionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectionStatusEnum> createStaticFields() {
            Map<String, ProtectionStatusEnum> map = new HashMap<>();
            map.put("nonProtection", NONPROTECTION);
            map.put("consoleProtection", CONSOLEPROTECTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectionStatusEnum(String value) {
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
        public static ProtectionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectionStatusEnum(value));
        }

        public static ProtectionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectionStatusEnum) {
                return this.value.equals(((ProtectionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private ProtectionStatusEnum protectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_reason")

    private String protectionReason;

    public UpdateLoadbalancerReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 负载均衡器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateLoadbalancerReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 负载均衡器的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateLoadbalancerReq withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 负载均衡器的管理状态。只支持设定为true，该字段的值无实际意义。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public UpdateLoadbalancerReq withProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * 修改保护状态, 取值： - nonProtection: 不保护 - consoleProtection: 控制台修改保护
     * @return protectionStatus
     */
    public ProtectionStatusEnum getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public UpdateLoadbalancerReq withProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    /**
     * 设置保护的原因 >仅当protection_status为consoleProtection时有效。
     * @return protectionReason
     */
    public String getProtectionReason() {
        return protectionReason;
    }

    public void setProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLoadbalancerReq that = (UpdateLoadbalancerReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, adminStateUp, protectionStatus, protectionReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoadbalancerReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    protectionReason: ").append(toIndentedString(protectionReason)).append("\n");
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
