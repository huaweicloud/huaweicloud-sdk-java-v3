package com.huaweicloud.sdk.codeartsinspector.v3.model;

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
 * HostVulnItem
 */
public class HostVulnItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sa_id")

    private String saId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_id")

    private String vulnId;

    /**
     * 漏洞风险等级:   * high - 高风险   * medium - 中风险   * low - 低风险   * hint - 提示 
     */
    public static final class SeverityEnum {

        /**
         * Enum HIGH for value: "high"
         */
        public static final SeverityEnum HIGH = new SeverityEnum("high");

        /**
         * Enum MEDIUM for value: "medium"
         */
        public static final SeverityEnum MEDIUM = new SeverityEnum("medium");

        /**
         * Enum LOW for value: "low"
         */
        public static final SeverityEnum LOW = new SeverityEnum("low");

        /**
         * Enum HINT for value: "hint"
         */
        public static final SeverityEnum HINT = new SeverityEnum("hint");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("high", HIGH);
            map.put("medium", MEDIUM);
            map.put("low", LOW);
            map.put("hint", HINT);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution")

    private String solution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fix_advisory")

    private String fixAdvisory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fix_cmd")

    private String fixCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_list")

    private List<HostVulnItemCveList> cveList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_link_list")

    private List<String> refLinkList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_list")

    private List<HostVulnItemComponentList> componentList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_detect_result")

    private String vulDetectResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cvss_score")

    private String cvssScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cvss_version")

    private String cvssVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cvss_vector")

    private String cvssVector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ignore")

    private Boolean isIgnore;

    public HostVulnItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 漏洞类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HostVulnItem withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 扫描端口号
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public HostVulnItem withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 漏洞标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HostVulnItem withSaId(String saId) {
        this.saId = saId;
        return this;
    }

    /**
     * 漏洞公告ID
     * @return saId
     */
    public String getSaId() {
        return saId;
    }

    public void setSaId(String saId) {
        this.saId = saId;
    }

    public HostVulnItem withVulnId(String vulnId) {
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

    public HostVulnItem withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 漏洞风险等级:   * high - 高风险   * medium - 中风险   * low - 低风险   * hint - 提示 
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public HostVulnItem withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 漏洞摘要
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public HostVulnItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 漏洞描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HostVulnItem withSolution(String solution) {
        this.solution = solution;
        return this;
    }

    /**
     * 漏洞提示建议
     * @return solution
     */
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public HostVulnItem withFixAdvisory(String fixAdvisory) {
        this.fixAdvisory = fixAdvisory;
        return this;
    }

    /**
     * 漏洞修复建议
     * @return fixAdvisory
     */
    public String getFixAdvisory() {
        return fixAdvisory;
    }

    public void setFixAdvisory(String fixAdvisory) {
        this.fixAdvisory = fixAdvisory;
    }

    public HostVulnItem withFixCmd(String fixCmd) {
        this.fixCmd = fixCmd;
        return this;
    }

    /**
     * 漏洞修复指令
     * @return fixCmd
     */
    public String getFixCmd() {
        return fixCmd;
    }

    public void setFixCmd(String fixCmd) {
        this.fixCmd = fixCmd;
    }

    public HostVulnItem withCveList(List<HostVulnItemCveList> cveList) {
        this.cveList = cveList;
        return this;
    }

    public HostVulnItem addCveListItem(HostVulnItemCveList cveListItem) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        this.cveList.add(cveListItem);
        return this;
    }

    public HostVulnItem withCveList(Consumer<List<HostVulnItemCveList>> cveListSetter) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        cveListSetter.accept(this.cveList);
        return this;
    }

    /**
     * CVE漏洞列表
     * @return cveList
     */
    public List<HostVulnItemCveList> getCveList() {
        return cveList;
    }

    public void setCveList(List<HostVulnItemCveList> cveList) {
        this.cveList = cveList;
    }

    public HostVulnItem withRefLinkList(List<String> refLinkList) {
        this.refLinkList = refLinkList;
        return this;
    }

    public HostVulnItem addRefLinkListItem(String refLinkListItem) {
        if (this.refLinkList == null) {
            this.refLinkList = new ArrayList<>();
        }
        this.refLinkList.add(refLinkListItem);
        return this;
    }

    public HostVulnItem withRefLinkList(Consumer<List<String>> refLinkListSetter) {
        if (this.refLinkList == null) {
            this.refLinkList = new ArrayList<>();
        }
        refLinkListSetter.accept(this.refLinkList);
        return this;
    }

    /**
     * 参考信息链接列表
     * @return refLinkList
     */
    public List<String> getRefLinkList() {
        return refLinkList;
    }

    public void setRefLinkList(List<String> refLinkList) {
        this.refLinkList = refLinkList;
    }

    public HostVulnItem withComponentList(List<HostVulnItemComponentList> componentList) {
        this.componentList = componentList;
        return this;
    }

    public HostVulnItem addComponentListItem(HostVulnItemComponentList componentListItem) {
        if (this.componentList == null) {
            this.componentList = new ArrayList<>();
        }
        this.componentList.add(componentListItem);
        return this;
    }

    public HostVulnItem withComponentList(Consumer<List<HostVulnItemComponentList>> componentListSetter) {
        if (this.componentList == null) {
            this.componentList = new ArrayList<>();
        }
        componentListSetter.accept(this.componentList);
        return this;
    }

    /**
     * 内容列表
     * @return componentList
     */
    public List<HostVulnItemComponentList> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<HostVulnItemComponentList> componentList) {
        this.componentList = componentList;
    }

    public HostVulnItem withVulDetectResult(String vulDetectResult) {
        this.vulDetectResult = vulDetectResult;
        return this;
    }

    /**
     * 检查结果
     * @return vulDetectResult
     */
    public String getVulDetectResult() {
        return vulDetectResult;
    }

    public void setVulDetectResult(String vulDetectResult) {
        this.vulDetectResult = vulDetectResult;
    }

    public HostVulnItem withCvssScore(String cvssScore) {
        this.cvssScore = cvssScore;
        return this;
    }

    /**
     * CVSS分数信息
     * @return cvssScore
     */
    public String getCvssScore() {
        return cvssScore;
    }

    public void setCvssScore(String cvssScore) {
        this.cvssScore = cvssScore;
    }

    public HostVulnItem withCvssVersion(String cvssVersion) {
        this.cvssVersion = cvssVersion;
        return this;
    }

    /**
     * CVSS版本信息
     * @return cvssVersion
     */
    public String getCvssVersion() {
        return cvssVersion;
    }

    public void setCvssVersion(String cvssVersion) {
        this.cvssVersion = cvssVersion;
    }

    public HostVulnItem withCvssVector(String cvssVector) {
        this.cvssVector = cvssVector;
        return this;
    }

    /**
     * CVSS向量信息
     * @return cvssVector
     */
    public String getCvssVector() {
        return cvssVector;
    }

    public void setCvssVector(String cvssVector) {
        this.cvssVector = cvssVector;
    }

    public HostVulnItem withIsIgnore(Boolean isIgnore) {
        this.isIgnore = isIgnore;
        return this;
    }

    /**
     * 是否误报
     * @return isIgnore
     */
    public Boolean getIsIgnore() {
        return isIgnore;
    }

    public void setIsIgnore(Boolean isIgnore) {
        this.isIgnore = isIgnore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostVulnItem that = (HostVulnItem) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.port, that.port)
            && Objects.equals(this.title, that.title) && Objects.equals(this.saId, that.saId)
            && Objects.equals(this.vulnId, that.vulnId) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.topic, that.topic) && Objects.equals(this.description, that.description)
            && Objects.equals(this.solution, that.solution) && Objects.equals(this.fixAdvisory, that.fixAdvisory)
            && Objects.equals(this.fixCmd, that.fixCmd) && Objects.equals(this.cveList, that.cveList)
            && Objects.equals(this.refLinkList, that.refLinkList)
            && Objects.equals(this.componentList, that.componentList)
            && Objects.equals(this.vulDetectResult, that.vulDetectResult)
            && Objects.equals(this.cvssScore, that.cvssScore) && Objects.equals(this.cvssVersion, that.cvssVersion)
            && Objects.equals(this.cvssVector, that.cvssVector) && Objects.equals(this.isIgnore, that.isIgnore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            port,
            title,
            saId,
            vulnId,
            severity,
            topic,
            description,
            solution,
            fixAdvisory,
            fixCmd,
            cveList,
            refLinkList,
            componentList,
            vulDetectResult,
            cvssScore,
            cvssVersion,
            cvssVector,
            isIgnore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostVulnItem {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    saId: ").append(toIndentedString(saId)).append("\n");
        sb.append("    vulnId: ").append(toIndentedString(vulnId)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    fixAdvisory: ").append(toIndentedString(fixAdvisory)).append("\n");
        sb.append("    fixCmd: ").append(toIndentedString(fixCmd)).append("\n");
        sb.append("    cveList: ").append(toIndentedString(cveList)).append("\n");
        sb.append("    refLinkList: ").append(toIndentedString(refLinkList)).append("\n");
        sb.append("    componentList: ").append(toIndentedString(componentList)).append("\n");
        sb.append("    vulDetectResult: ").append(toIndentedString(vulDetectResult)).append("\n");
        sb.append("    cvssScore: ").append(toIndentedString(cvssScore)).append("\n");
        sb.append("    cvssVersion: ").append(toIndentedString(cvssVersion)).append("\n");
        sb.append("    cvssVector: ").append(toIndentedString(cvssVector)).append("\n");
        sb.append("    isIgnore: ").append(toIndentedString(isIgnore)).append("\n");
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
