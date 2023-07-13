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
 * 扫描任务配置
 */
public class TaskSettingsTaskConfig {

    /**
     * 扫描模式:   * fast - 快速扫描   * normal - 标准扫描   * deep - 深度扫描 
     */
    public static final class ScanModeEnum {

        /**
         * Enum FAST for value: "fast"
         */
        public static final ScanModeEnum FAST = new ScanModeEnum("fast");

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final ScanModeEnum NORMAL = new ScanModeEnum("normal");

        /**
         * Enum DEEP for value: "deep"
         */
        public static final ScanModeEnum DEEP = new ScanModeEnum("deep");

        private static final Map<String, ScanModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScanModeEnum> createStaticFields() {
            Map<String, ScanModeEnum> map = new HashMap<>();
            map.put("fast", FAST);
            map.put("normal", NORMAL);
            map.put("deep", DEEP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScanModeEnum(String value) {
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
        public static ScanModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScanModeEnum(value));
        }

        public static ScanModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScanModeEnum) {
                return this.value.equals(((ScanModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_mode")

    private ScanModeEnum scanMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_scan")

    private Boolean portScan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_scan")

    private Boolean weakPwdScan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_check")

    private Boolean cveCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_check")

    private Boolean textCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picture_check")

    private Boolean pictureCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malicious_code")

    private Boolean maliciousCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malicious_link")

    private Boolean maliciousLink;

    public TaskSettingsTaskConfig withScanMode(ScanModeEnum scanMode) {
        this.scanMode = scanMode;
        return this;
    }

    /**
     * 扫描模式:   * fast - 快速扫描   * normal - 标准扫描   * deep - 深度扫描 
     * @return scanMode
     */
    public ScanModeEnum getScanMode() {
        return scanMode;
    }

    public void setScanMode(ScanModeEnum scanMode) {
        this.scanMode = scanMode;
    }

    public TaskSettingsTaskConfig withPortScan(Boolean portScan) {
        this.portScan = portScan;
        return this;
    }

    /**
     * 是否进行端口扫描
     * @return portScan
     */
    public Boolean getPortScan() {
        return portScan;
    }

    public void setPortScan(Boolean portScan) {
        this.portScan = portScan;
    }

    public TaskSettingsTaskConfig withWeakPwdScan(Boolean weakPwdScan) {
        this.weakPwdScan = weakPwdScan;
        return this;
    }

    /**
     * 是否进行弱密码扫描
     * @return weakPwdScan
     */
    public Boolean getWeakPwdScan() {
        return weakPwdScan;
    }

    public void setWeakPwdScan(Boolean weakPwdScan) {
        this.weakPwdScan = weakPwdScan;
    }

    public TaskSettingsTaskConfig withCveCheck(Boolean cveCheck) {
        this.cveCheck = cveCheck;
        return this;
    }

    /**
     * 是否进行CVE漏洞扫描
     * @return cveCheck
     */
    public Boolean getCveCheck() {
        return cveCheck;
    }

    public void setCveCheck(Boolean cveCheck) {
        this.cveCheck = cveCheck;
    }

    public TaskSettingsTaskConfig withTextCheck(Boolean textCheck) {
        this.textCheck = textCheck;
        return this;
    }

    /**
     * 是否进行网站内容合规文字检测
     * @return textCheck
     */
    public Boolean getTextCheck() {
        return textCheck;
    }

    public void setTextCheck(Boolean textCheck) {
        this.textCheck = textCheck;
    }

    public TaskSettingsTaskConfig withPictureCheck(Boolean pictureCheck) {
        this.pictureCheck = pictureCheck;
        return this;
    }

    /**
     * 是否进行网站内容合规图片检测
     * @return pictureCheck
     */
    public Boolean getPictureCheck() {
        return pictureCheck;
    }

    public void setPictureCheck(Boolean pictureCheck) {
        this.pictureCheck = pictureCheck;
    }

    public TaskSettingsTaskConfig withMaliciousCode(Boolean maliciousCode) {
        this.maliciousCode = maliciousCode;
        return this;
    }

    /**
     * 是否进行网站挂马检测
     * @return maliciousCode
     */
    public Boolean getMaliciousCode() {
        return maliciousCode;
    }

    public void setMaliciousCode(Boolean maliciousCode) {
        this.maliciousCode = maliciousCode;
    }

    public TaskSettingsTaskConfig withMaliciousLink(Boolean maliciousLink) {
        this.maliciousLink = maliciousLink;
        return this;
    }

    /**
     * 是否进行链接健康检测（死链、暗链、恶意外链）
     * @return maliciousLink
     */
    public Boolean getMaliciousLink() {
        return maliciousLink;
    }

    public void setMaliciousLink(Boolean maliciousLink) {
        this.maliciousLink = maliciousLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskSettingsTaskConfig that = (TaskSettingsTaskConfig) obj;
        return Objects.equals(this.scanMode, that.scanMode) && Objects.equals(this.portScan, that.portScan)
            && Objects.equals(this.weakPwdScan, that.weakPwdScan) && Objects.equals(this.cveCheck, that.cveCheck)
            && Objects.equals(this.textCheck, that.textCheck) && Objects.equals(this.pictureCheck, that.pictureCheck)
            && Objects.equals(this.maliciousCode, that.maliciousCode)
            && Objects.equals(this.maliciousLink, that.maliciousLink);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(scanMode, portScan, weakPwdScan, cveCheck, textCheck, pictureCheck, maliciousCode, maliciousLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskSettingsTaskConfig {\n");
        sb.append("    scanMode: ").append(toIndentedString(scanMode)).append("\n");
        sb.append("    portScan: ").append(toIndentedString(portScan)).append("\n");
        sb.append("    weakPwdScan: ").append(toIndentedString(weakPwdScan)).append("\n");
        sb.append("    cveCheck: ").append(toIndentedString(cveCheck)).append("\n");
        sb.append("    textCheck: ").append(toIndentedString(textCheck)).append("\n");
        sb.append("    pictureCheck: ").append(toIndentedString(pictureCheck)).append("\n");
        sb.append("    maliciousCode: ").append(toIndentedString(maliciousCode)).append("\n");
        sb.append("    maliciousLink: ").append(toIndentedString(maliciousLink)).append("\n");
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
