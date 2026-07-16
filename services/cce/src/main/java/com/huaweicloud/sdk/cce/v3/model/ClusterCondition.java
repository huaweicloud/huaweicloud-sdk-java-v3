package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 集群详细状态。
 */
public class ClusterCondition {

    /**
     * **参数解释**： 状态类型。 **约束限制**： 不涉及 **取值范围**： - \"AgencyAvailable\": CCE集群自定义委托的状态。 - \"ClusterCertificate\": CCE集群证书的状态。 - \"ClusterCustomCertificate\": CCE集群自有证书的状态。 - \"CertificateRotation\": CCE集群证书更新的状态。 - \"CustomCertificateRotation\": CCE集群自有证书更新的状态。 - \"OpenIDConnectProcessing\": CCE集群开启OIDC特性处理中状态。 - \"OpenIDConnectProcessSuccess\": CCE集群开启OIDC特性成功状态。 - \"OpenIDConnectProcessFailed\": CCE集群开启OIDC特性失败状态。  **默认取值**： 不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum AGENCYAVAILABLE for value: "AgencyAvailable"
         */
        public static final TypeEnum AGENCYAVAILABLE = new TypeEnum("AgencyAvailable");

        /**
         * Enum CLUSTERCERTIFICATE for value: "ClusterCertificate"
         */
        public static final TypeEnum CLUSTERCERTIFICATE = new TypeEnum("ClusterCertificate");

        /**
         * Enum CLUSTERCUSTOMCERTIFICATE for value: "ClusterCustomCertificate"
         */
        public static final TypeEnum CLUSTERCUSTOMCERTIFICATE = new TypeEnum("ClusterCustomCertificate");

        /**
         * Enum CERTIFICATEROTATION for value: "CertificateRotation"
         */
        public static final TypeEnum CERTIFICATEROTATION = new TypeEnum("CertificateRotation");

        /**
         * Enum CUSTOMCERTIFICATEROTATION for value: "CustomCertificateRotation"
         */
        public static final TypeEnum CUSTOMCERTIFICATEROTATION = new TypeEnum("CustomCertificateRotation");

        /**
         * Enum OPENIDCONNECTPROCESSING for value: "OpenIDConnectProcessing"
         */
        public static final TypeEnum OPENIDCONNECTPROCESSING = new TypeEnum("OpenIDConnectProcessing");

        /**
         * Enum OPENIDCONNECTPROCESSSUCCESS for value: "OpenIDConnectProcessSuccess"
         */
        public static final TypeEnum OPENIDCONNECTPROCESSSUCCESS = new TypeEnum("OpenIDConnectProcessSuccess");

        /**
         * Enum OPENIDCONNECTPROCESSFAILED for value: "OpenIDConnectProcessFailed"
         */
        public static final TypeEnum OPENIDCONNECTPROCESSFAILED = new TypeEnum("OpenIDConnectProcessFailed");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("AgencyAvailable", AGENCYAVAILABLE);
            map.put("ClusterCertificate", CLUSTERCERTIFICATE);
            map.put("ClusterCustomCertificate", CLUSTERCUSTOMCERTIFICATE);
            map.put("CertificateRotation", CERTIFICATEROTATION);
            map.put("CustomCertificateRotation", CUSTOMCERTIFICATEROTATION);
            map.put("OpenIDConnectProcessing", OPENIDCONNECTPROCESSING);
            map.put("OpenIDConnectProcessSuccess", OPENIDCONNECTPROCESSSUCCESS);
            map.put("OpenIDConnectProcessFailed", OPENIDCONNECTPROCESSFAILED);
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
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastProbeTime")

    private String lastProbeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastTransitTime")

    private String lastTransitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public ClusterCondition withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 状态类型。 **约束限制**： 不涉及 **取值范围**： - \"AgencyAvailable\": CCE集群自定义委托的状态。 - \"ClusterCertificate\": CCE集群证书的状态。 - \"ClusterCustomCertificate\": CCE集群自有证书的状态。 - \"CertificateRotation\": CCE集群证书更新的状态。 - \"CustomCertificateRotation\": CCE集群自有证书更新的状态。 - \"OpenIDConnectProcessing\": CCE集群开启OIDC特性处理中状态。 - \"OpenIDConnectProcessSuccess\": CCE集群开启OIDC特性成功状态。 - \"OpenIDConnectProcessFailed\": CCE集群开启OIDC特性失败状态。  **默认取值**： 不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ClusterCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： Condition当前状态。 **约束限制**： 不涉及 **取值范围**： - \"True\" - \"False\"  **默认取值**： 不涉及
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClusterCondition withLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
        return this;
    }

    /**
     * **参数解释**： 上次状态检查时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return lastProbeTime
     */
    public String getLastProbeTime() {
        return lastProbeTime;
    }

    public void setLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
    }

    public ClusterCondition withLastTransitTime(String lastTransitTime) {
        this.lastTransitTime = lastTransitTime;
        return this;
    }

    /**
     * **参数解释**： 上次状态变更时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return lastTransitTime
     */
    public String getLastTransitTime() {
        return lastTransitTime;
    }

    public void setLastTransitTime(String lastTransitTime) {
        this.lastTransitTime = lastTransitTime;
    }

    public ClusterCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释**： 上次状态变更原因。 **约束限制**： 不涉及 **取值范围**： - type为ClusterCertificate、ClusterCustomCertificate时取值范围：   - CertificateValid：证书状态正常   - CertificateExpiringWithin180Days：证书有效期低于180天   - CertificateExpiringWithin30Days：证书有效期低于30天   - CertificateExpired：证书已过期 - type为CertificateRotation、CustomCertificateRotation时取值范围：   - RotationInProgress：更新中   - RotationSucceeded：更新成功   - RotationFailed：更新失败  **默认取值**： 不涉及
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ClusterCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**： Condition详细描述。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterCondition that = (ClusterCondition) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.lastProbeTime, that.lastProbeTime)
            && Objects.equals(this.lastTransitTime, that.lastTransitTime) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, status, lastProbeTime, lastTransitTime, reason, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterCondition {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
        sb.append("    lastTransitTime: ").append(toIndentedString(lastTransitTime)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
