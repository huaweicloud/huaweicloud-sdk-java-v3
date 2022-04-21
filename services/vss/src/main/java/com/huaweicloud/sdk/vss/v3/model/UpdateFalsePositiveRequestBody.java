package com.huaweicloud.sdk.vss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateFalsePositiveRequestBody
 */
public class UpdateFalsePositiveRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_id")

    private String vulnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    /**
     * 对漏洞的操作:   * false_report - 更新漏洞状态为误报，并忽略   * repairing - 更新漏洞状态未修复 
     */
    public static final class VulnStatusEnum {

        /**
         * Enum FALSE_REPORT for value: "false_report"
         */
        public static final VulnStatusEnum FALSE_REPORT = new VulnStatusEnum("false_report");

        /**
         * Enum REPAIRING for value: "repairing"
         */
        public static final VulnStatusEnum REPAIRING = new VulnStatusEnum("repairing");

        private static final Map<String, VulnStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VulnStatusEnum> createStaticFields() {
            Map<String, VulnStatusEnum> map = new HashMap<>();
            map.put("false_report", FALSE_REPORT);
            map.put("repairing", REPAIRING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VulnStatusEnum(String value) {
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
        public static VulnStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VulnStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VulnStatusEnum(value);
            }
            return result;
        }

        public static VulnStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VulnStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VulnStatusEnum) {
                return this.value.equals(((VulnStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_status")

    private VulnStatusEnum vulnStatus;

    public UpdateFalsePositiveRequestBody withVulnId(String vulnId) {
        this.vulnId = vulnId;
        return this;
    }

    /**
     * 漏洞ID
     * @return vulnId
     */
    public String getVulnId() {
        return vulnId;
    }

    public void setVulnId(String vulnId) {
        this.vulnId = vulnId;
    }

    public UpdateFalsePositiveRequestBody withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 误报确认人
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public UpdateFalsePositiveRequestBody withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 误报确认理由
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public UpdateFalsePositiveRequestBody withVulnStatus(VulnStatusEnum vulnStatus) {
        this.vulnStatus = vulnStatus;
        return this;
    }

    /**
     * 对漏洞的操作:   * false_report - 更新漏洞状态为误报，并忽略   * repairing - 更新漏洞状态未修复 
     * @return vulnStatus
     */
    public VulnStatusEnum getVulnStatus() {
        return vulnStatus;
    }

    public void setVulnStatus(VulnStatusEnum vulnStatus) {
        this.vulnStatus = vulnStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFalsePositiveRequestBody updateFalsePositiveRequestBody = (UpdateFalsePositiveRequestBody) o;
        return Objects.equals(this.vulnId, updateFalsePositiveRequestBody.vulnId)
            && Objects.equals(this.provider, updateFalsePositiveRequestBody.provider)
            && Objects.equals(this.reason, updateFalsePositiveRequestBody.reason)
            && Objects.equals(this.vulnStatus, updateFalsePositiveRequestBody.vulnStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulnId, provider, reason, vulnStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFalsePositiveRequestBody {\n");
        sb.append("    vulnId: ").append(toIndentedString(vulnId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    vulnStatus: ").append(toIndentedString(vulnStatus)).append("\n");
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
