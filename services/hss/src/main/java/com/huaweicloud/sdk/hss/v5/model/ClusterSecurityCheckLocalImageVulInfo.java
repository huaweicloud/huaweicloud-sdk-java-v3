package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 本地镜像漏洞信息
 */
public class ClusterSecurityCheckLocalImageVulInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_image_name")

    private String localImageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_image_version")

    private String localImageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_image_size")

    private Long localImageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    /**
     * **参数解释**： 漏洞危险程度 **取值范围**： - High：高危漏洞 - Medium：中危漏洞 - Low：低危漏洞 
     */
    public static final class SeverityLevelEnum {

        /**
         * Enum HIGH for value: "High"
         */
        public static final SeverityLevelEnum HIGH = new SeverityLevelEnum("High");

        /**
         * Enum MEDIUM for value: "Medium"
         */
        public static final SeverityLevelEnum MEDIUM = new SeverityLevelEnum("Medium");

        /**
         * Enum LOW for value: "Low"
         */
        public static final SeverityLevelEnum LOW = new SeverityLevelEnum("Low");

        private static final Map<String, SeverityLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityLevelEnum> createStaticFields() {
            Map<String, SeverityLevelEnum> map = new HashMap<>();
            map.put("High", HIGH);
            map.put("Medium", MEDIUM);
            map.put("Low", LOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityLevelEnum(String value) {
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
        public static SeverityLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityLevelEnum(value));
        }

        public static SeverityLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityLevelEnum) {
                return this.value.equals(((SeverityLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private SeverityLevelEnum severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution")

    private String solution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_description")

    private String vulDescription;

    public ClusterSecurityCheckLocalImageVulInfo withLocalImageName(String localImageName) {
        this.localImageName = localImageName;
        return this;
    }

    /**
     * **参数解释**： 本地镜像名称 **取值范围**： 不涉及 
     * @return localImageName
     */
    public String getLocalImageName() {
        return localImageName;
    }

    public void setLocalImageName(String localImageName) {
        this.localImageName = localImageName;
    }

    public ClusterSecurityCheckLocalImageVulInfo withLocalImageVersion(String localImageVersion) {
        this.localImageVersion = localImageVersion;
        return this;
    }

    /**
     * **参数解释**： 本地镜像版本 **取值范围**： 不涉及 
     * @return localImageVersion
     */
    public String getLocalImageVersion() {
        return localImageVersion;
    }

    public void setLocalImageVersion(String localImageVersion) {
        this.localImageVersion = localImageVersion;
    }

    public ClusterSecurityCheckLocalImageVulInfo withLocalImageSize(Long localImageSize) {
        this.localImageSize = localImageSize;
        return this;
    }

    /**
     * **参数解释**： 本地镜像大小 **取值范围**： 不涉及 
     * @return localImageSize
     */
    public Long getLocalImageSize() {
        return localImageSize;
    }

    public void setLocalImageSize(Long localImageSize) {
        this.localImageSize = localImageSize;
    }

    public ClusterSecurityCheckLocalImageVulInfo withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * **参数解释**： 漏洞名称 **取值范围**： 不涉及 
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public ClusterSecurityCheckLocalImageVulInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释**： 软件名称 **取值范围**： 不涉及 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ClusterSecurityCheckLocalImageVulInfo withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * **参数解释**： 软件版本 **取值范围**： 不涉及 
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public ClusterSecurityCheckLocalImageVulInfo withSeverityLevel(SeverityLevelEnum severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * **参数解释**： 漏洞危险程度 **取值范围**： - High：高危漏洞 - Medium：中危漏洞 - Low：低危漏洞 
     * @return severityLevel
     */
    public SeverityLevelEnum getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(SeverityLevelEnum severityLevel) {
        this.severityLevel = severityLevel;
    }

    public ClusterSecurityCheckLocalImageVulInfo withSolution(String solution) {
        this.solution = solution;
        return this;
    }

    /**
     * **参数解释**： 漏洞解决方案 **取值范围**： 不涉及 
     * @return solution
     */
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public ClusterSecurityCheckLocalImageVulInfo withVulDescription(String vulDescription) {
        this.vulDescription = vulDescription;
        return this;
    }

    /**
     * **参数解释**： 漏洞描述 **取值范围**： 不涉及 
     * @return vulDescription
     */
    public String getVulDescription() {
        return vulDescription;
    }

    public void setVulDescription(String vulDescription) {
        this.vulDescription = vulDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterSecurityCheckLocalImageVulInfo that = (ClusterSecurityCheckLocalImageVulInfo) obj;
        return Objects.equals(this.localImageName, that.localImageName)
            && Objects.equals(this.localImageVersion, that.localImageVersion)
            && Objects.equals(this.localImageSize, that.localImageSize) && Objects.equals(this.vulName, that.vulName)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.appVersion, that.appVersion)
            && Objects.equals(this.severityLevel, that.severityLevel) && Objects.equals(this.solution, that.solution)
            && Objects.equals(this.vulDescription, that.vulDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localImageName,
            localImageVersion,
            localImageSize,
            vulName,
            appName,
            appVersion,
            severityLevel,
            solution,
            vulDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterSecurityCheckLocalImageVulInfo {\n");
        sb.append("    localImageName: ").append(toIndentedString(localImageName)).append("\n");
        sb.append("    localImageVersion: ").append(toIndentedString(localImageVersion)).append("\n");
        sb.append("    localImageSize: ").append(toIndentedString(localImageSize)).append("\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    vulDescription: ").append(toIndentedString(vulDescription)).append("\n");
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
