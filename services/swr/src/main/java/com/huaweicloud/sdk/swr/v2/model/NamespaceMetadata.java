package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * NamespaceMetadata
 */
public class NamespaceMetadata {

    /**
     * 是否公开，可选true、false
     */
    public static final class PublicEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final PublicEnum TRUE = new PublicEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final PublicEnum FALSE = new PublicEnum("false");

        private static final Map<String, PublicEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PublicEnum> createStaticFields() {
            Map<String, PublicEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PublicEnum(String value) {
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
        public static PublicEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PublicEnum(value));
        }

        public static PublicEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PublicEnum) {
                return this.value.equals(((PublicEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public")

    private PublicEnum _public;

    /**
     * 上传制品时，是否自动触发制品扫描，可选true、false
     */
    public static final class AutoScanEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final AutoScanEnum TRUE = new AutoScanEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final AutoScanEnum FALSE = new AutoScanEnum("false");

        private static final Map<String, AutoScanEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AutoScanEnum> createStaticFields() {
            Map<String, AutoScanEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AutoScanEnum(String value) {
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
        public static AutoScanEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AutoScanEnum(value));
        }

        public static AutoScanEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AutoScanEnum) {
                return this.value.equals(((AutoScanEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scan")

    private AutoScanEnum autoScan;

    /**
     * 是否开启制品阻断，可选true、false
     */
    public static final class PreventVulEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final PreventVulEnum TRUE = new PreventVulEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final PreventVulEnum FALSE = new PreventVulEnum("false");

        private static final Map<String, PreventVulEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PreventVulEnum> createStaticFields() {
            Map<String, PreventVulEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PreventVulEnum(String value) {
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
        public static PreventVulEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PreventVulEnum(value));
        }

        public static PreventVulEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PreventVulEnum) {
                return this.value.equals(((PreventVulEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prevent_vul")

    private PreventVulEnum preventVul;

    /**
     * 阻断开启的场景下，如果存在漏洞，并且存在的漏洞严重程度高于此处定义的级别，则无法拉取镜像。可选值为\"none\", \"low\", \"medium\", \"high\", \"critical\"。
     */
    public static final class SeverityEnum {

        /**
         * Enum NONE for value: "none"
         */
        public static final SeverityEnum NONE = new SeverityEnum("none");

        /**
         * Enum LOW for value: "low"
         */
        public static final SeverityEnum LOW = new SeverityEnum("low");

        /**
         * Enum MEDIUM for value: "medium"
         */
        public static final SeverityEnum MEDIUM = new SeverityEnum("medium");

        /**
         * Enum HIGH for value: "high"
         */
        public static final SeverityEnum HIGH = new SeverityEnum("high");

        /**
         * Enum CRITICAL for value: "critical"
         */
        public static final SeverityEnum CRITICAL = new SeverityEnum("critical");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("none", NONE);
            map.put("low", LOW);
            map.put("medium", MEDIUM);
            map.put("high", HIGH);
            map.put("critical", CRITICAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityEnum(value));
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnum) {
                return this.value.equals(((SeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SeverityEnum severity;

    public NamespaceMetadata withPublic(PublicEnum _public) {
        this._public = _public;
        return this;
    }

    /**
     * 是否公开，可选true、false
     * @return _public
     */
    public PublicEnum getPublic() {
        return _public;
    }

    public void setPublic(PublicEnum _public) {
        this._public = _public;
    }

    public NamespaceMetadata withAutoScan(AutoScanEnum autoScan) {
        this.autoScan = autoScan;
        return this;
    }

    /**
     * 上传制品时，是否自动触发制品扫描，可选true、false
     * @return autoScan
     */
    public AutoScanEnum getAutoScan() {
        return autoScan;
    }

    public void setAutoScan(AutoScanEnum autoScan) {
        this.autoScan = autoScan;
    }

    public NamespaceMetadata withPreventVul(PreventVulEnum preventVul) {
        this.preventVul = preventVul;
        return this;
    }

    /**
     * 是否开启制品阻断，可选true、false
     * @return preventVul
     */
    public PreventVulEnum getPreventVul() {
        return preventVul;
    }

    public void setPreventVul(PreventVulEnum preventVul) {
        this.preventVul = preventVul;
    }

    public NamespaceMetadata withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 阻断开启的场景下，如果存在漏洞，并且存在的漏洞严重程度高于此处定义的级别，则无法拉取镜像。可选值为\"none\", \"low\", \"medium\", \"high\", \"critical\"。
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NamespaceMetadata that = (NamespaceMetadata) obj;
        return Objects.equals(this._public, that._public) && Objects.equals(this.autoScan, that.autoScan)
            && Objects.equals(this.preventVul, that.preventVul) && Objects.equals(this.severity, that.severity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_public, autoScan, preventVul, severity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NamespaceMetadata {\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    autoScan: ").append(toIndentedString(autoScan)).append("\n");
        sb.append("    preventVul: ").append(toIndentedString(preventVul)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
