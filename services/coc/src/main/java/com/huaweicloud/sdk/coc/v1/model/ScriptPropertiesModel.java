package com.huaweicloud.sdk.coc.v1.model;

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
 * 脚本标签：风险等级risk_level(取值范围：LOW/MEDIUM/HIGH)、审批人reviewer、脚本解释器interpreter等
 */
public class ScriptPropertiesModel {

    /**
     * 风险等级 LOW:低风险 MEDIUM:中风险 HIGH:高风险
     */
    public static final class RiskLevelEnum {

        /**
         * Enum LOW for value: "LOW"
         */
        public static final RiskLevelEnum LOW = new RiskLevelEnum("LOW");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final RiskLevelEnum MEDIUM = new RiskLevelEnum("MEDIUM");

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final RiskLevelEnum HIGH = new RiskLevelEnum("HIGH");

        private static final Map<String, RiskLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RiskLevelEnum> createStaticFields() {
            Map<String, RiskLevelEnum> map = new HashMap<>();
            map.put("LOW", LOW);
            map.put("MEDIUM", MEDIUM);
            map.put("HIGH", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RiskLevelEnum(String value) {
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
        public static RiskLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RiskLevelEnum(value));
        }

        public static RiskLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RiskLevelEnum) {
                return this.value.equals(((RiskLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private RiskLevelEnum riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewers")

    private List<ReviewerInfo> reviewers = null;

    /**
     * 审批消息通知协议，用于通知审批人 DEFAULT：默认 SMS：短信 EMAIL：邮件 DING_TALK：钉钉 WE_LINK：welink WECHAT:微信 CALLNOTIFY：语言 NOT_TO_NOTIFY：不通知
     */
    public static final class ProtocolEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final ProtocolEnum DEFAULT = new ProtocolEnum("DEFAULT");

        /**
         * Enum SMS for value: "SMS"
         */
        public static final ProtocolEnum SMS = new ProtocolEnum("SMS");

        /**
         * Enum EMAIL for value: "EMAIL"
         */
        public static final ProtocolEnum EMAIL = new ProtocolEnum("EMAIL");

        /**
         * Enum DING_TALK for value: "DING_TALK"
         */
        public static final ProtocolEnum DING_TALK = new ProtocolEnum("DING_TALK");

        /**
         * Enum WE_LINK for value: "WE_LINK"
         */
        public static final ProtocolEnum WE_LINK = new ProtocolEnum("WE_LINK");

        /**
         * Enum WECHAT for value: "WECHAT"
         */
        public static final ProtocolEnum WECHAT = new ProtocolEnum("WECHAT");

        /**
         * Enum CALLNOTIFY for value: "CALLNOTIFY"
         */
        public static final ProtocolEnum CALLNOTIFY = new ProtocolEnum("CALLNOTIFY");

        /**
         * Enum NOT_TO_NOTIFY for value: "NOT_TO_NOTIFY"
         */
        public static final ProtocolEnum NOT_TO_NOTIFY = new ProtocolEnum("NOT_TO_NOTIFY");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("SMS", SMS);
            map.put("EMAIL", EMAIL);
            map.put("DING_TALK", DING_TALK);
            map.put("WE_LINK", WE_LINK);
            map.put("WECHAT", WECHAT);
            map.put("CALLNOTIFY", CALLNOTIFY);
            map.put("NOT_TO_NOTIFY", NOT_TO_NOTIFY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    public ScriptPropertiesModel withRiskLevel(RiskLevelEnum riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级 LOW:低风险 MEDIUM:中风险 HIGH:高风险
     * @return riskLevel
     */
    public RiskLevelEnum getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(RiskLevelEnum riskLevel) {
        this.riskLevel = riskLevel;
    }

    public ScriptPropertiesModel withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 脚本版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ScriptPropertiesModel withReviewers(List<ReviewerInfo> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public ScriptPropertiesModel addReviewersItem(ReviewerInfo reviewersItem) {
        if (this.reviewers == null) {
            this.reviewers = new ArrayList<>();
        }
        this.reviewers.add(reviewersItem);
        return this;
    }

    public ScriptPropertiesModel withReviewers(Consumer<List<ReviewerInfo>> reviewersSetter) {
        if (this.reviewers == null) {
            this.reviewers = new ArrayList<>();
        }
        reviewersSetter.accept(this.reviewers);
        return this;
    }

    /**
     * 审批人，不填写不需要审批
     * @return reviewers
     */
    public List<ReviewerInfo> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<ReviewerInfo> reviewers) {
        this.reviewers = reviewers;
    }

    public ScriptPropertiesModel withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 审批消息通知协议，用于通知审批人 DEFAULT：默认 SMS：短信 EMAIL：邮件 DING_TALK：钉钉 WE_LINK：welink WECHAT:微信 CALLNOTIFY：语言 NOT_TO_NOTIFY：不通知
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptPropertiesModel that = (ScriptPropertiesModel) obj;
        return Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.version, that.version)
            && Objects.equals(this.reviewers, that.reviewers) && Objects.equals(this.protocol, that.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskLevel, version, reviewers, protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptPropertiesModel {\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
