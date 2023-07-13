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
 * BusinessRiskItem
 */
public class BusinessRiskItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_id")

    private String riskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_url")

    private String riskUrl;

    /**
     * 业务风险类型:   * text - 不合规文字   * image - 不合规图片   * dead_link - 不合规链接（死链）   * dark_link - 不合规链接（暗链）   * business_risk - 业务风险 
     */
    public static final class RiskTypeEnum {

        /**
         * Enum TEXT for value: "text"
         */
        public static final RiskTypeEnum TEXT = new RiskTypeEnum("text");

        /**
         * Enum IMAGE for value: "image"
         */
        public static final RiskTypeEnum IMAGE = new RiskTypeEnum("image");

        /**
         * Enum DEAD_LINK for value: "dead_link"
         */
        public static final RiskTypeEnum DEAD_LINK = new RiskTypeEnum("dead_link");

        /**
         * Enum DARK_LINK for value: "dark_link"
         */
        public static final RiskTypeEnum DARK_LINK = new RiskTypeEnum("dark_link");

        /**
         * Enum BUSINESS_RISK for value: "business_risk"
         */
        public static final RiskTypeEnum BUSINESS_RISK = new RiskTypeEnum("business_risk");

        private static final Map<String, RiskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RiskTypeEnum> createStaticFields() {
            Map<String, RiskTypeEnum> map = new HashMap<>();
            map.put("text", TEXT);
            map.put("image", IMAGE);
            map.put("dead_link", DEAD_LINK);
            map.put("dark_link", DARK_LINK);
            map.put("business_risk", BUSINESS_RISK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RiskTypeEnum(String value) {
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
        public static RiskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RiskTypeEnum(value));
        }

        public static RiskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RiskTypeEnum) {
                return this.value.equals(((RiskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_type")

    private RiskTypeEnum riskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_time")

    private String findTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_content")

    private String riskContent;

    /**
     * 漏洞状态:   * repairing - 未修复   * repaired - 已修复   * false_report - 误报，已忽略 
     */
    public static final class RiskStatusEnum {

        /**
         * Enum REPAIRING for value: "repairing"
         */
        public static final RiskStatusEnum REPAIRING = new RiskStatusEnum("repairing");

        /**
         * Enum REPAIRED for value: "repaired"
         */
        public static final RiskStatusEnum REPAIRED = new RiskStatusEnum("repaired");

        /**
         * Enum FALSE_REPORT for value: "false_report"
         */
        public static final RiskStatusEnum FALSE_REPORT = new RiskStatusEnum("false_report");

        private static final Map<String, RiskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RiskStatusEnum> createStaticFields() {
            Map<String, RiskStatusEnum> map = new HashMap<>();
            map.put("repairing", REPAIRING);
            map.put("repaired", REPAIRED);
            map.put("false_report", FALSE_REPORT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RiskStatusEnum(String value) {
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
        public static RiskStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RiskStatusEnum(value));
        }

        public static RiskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RiskStatusEnum) {
                return this.value.equals(((RiskStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_status")

    private RiskStatusEnum riskStatus;

    public BusinessRiskItem withRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }

    /**
     * 业务风险ID
     * @return riskId
     */
    public String getRiskId() {
        return riskId;
    }

    public void setRiskId(String riskId) {
        this.riskId = riskId;
    }

    public BusinessRiskItem withRiskUrl(String riskUrl) {
        this.riskUrl = riskUrl;
        return this;
    }

    /**
     * 有风险的URL
     * @return riskUrl
     */
    public String getRiskUrl() {
        return riskUrl;
    }

    public void setRiskUrl(String riskUrl) {
        this.riskUrl = riskUrl;
    }

    public BusinessRiskItem withRiskType(RiskTypeEnum riskType) {
        this.riskType = riskType;
        return this;
    }

    /**
     * 业务风险类型:   * text - 不合规文字   * image - 不合规图片   * dead_link - 不合规链接（死链）   * dark_link - 不合规链接（暗链）   * business_risk - 业务风险 
     * @return riskType
     */
    public RiskTypeEnum getRiskType() {
        return riskType;
    }

    public void setRiskType(RiskTypeEnum riskType) {
        this.riskType = riskType;
    }

    public BusinessRiskItem withFindTime(String findTime) {
        this.findTime = findTime;
        return this;
    }

    /**
     * 业务风险发现时间
     * @return findTime
     */
    public String getFindTime() {
        return findTime;
    }

    public void setFindTime(String findTime) {
        this.findTime = findTime;
    }

    public BusinessRiskItem withRiskContent(String riskContent) {
        this.riskContent = riskContent;
        return this;
    }

    /**
     * 业务风险内容
     * @return riskContent
     */
    public String getRiskContent() {
        return riskContent;
    }

    public void setRiskContent(String riskContent) {
        this.riskContent = riskContent;
    }

    public BusinessRiskItem withRiskStatus(RiskStatusEnum riskStatus) {
        this.riskStatus = riskStatus;
        return this;
    }

    /**
     * 漏洞状态:   * repairing - 未修复   * repaired - 已修复   * false_report - 误报，已忽略 
     * @return riskStatus
     */
    public RiskStatusEnum getRiskStatus() {
        return riskStatus;
    }

    public void setRiskStatus(RiskStatusEnum riskStatus) {
        this.riskStatus = riskStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusinessRiskItem that = (BusinessRiskItem) obj;
        return Objects.equals(this.riskId, that.riskId) && Objects.equals(this.riskUrl, that.riskUrl)
            && Objects.equals(this.riskType, that.riskType) && Objects.equals(this.findTime, that.findTime)
            && Objects.equals(this.riskContent, that.riskContent) && Objects.equals(this.riskStatus, that.riskStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskId, riskUrl, riskType, findTime, riskContent, riskStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessRiskItem {\n");
        sb.append("    riskId: ").append(toIndentedString(riskId)).append("\n");
        sb.append("    riskUrl: ").append(toIndentedString(riskUrl)).append("\n");
        sb.append("    riskType: ").append(toIndentedString(riskType)).append("\n");
        sb.append("    findTime: ").append(toIndentedString(findTime)).append("\n");
        sb.append("    riskContent: ").append(toIndentedString(riskContent)).append("\n");
        sb.append("    riskStatus: ").append(toIndentedString(riskStatus)).append("\n");
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
