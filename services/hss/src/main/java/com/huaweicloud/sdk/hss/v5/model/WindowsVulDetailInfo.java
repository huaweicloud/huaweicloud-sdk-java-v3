package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WindowsVulDetailInfo
 */
public class WindowsVulDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_id")

    private String cveId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_name")

    private String cveName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cvss_version")

    private String cvssVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cvss_vector")

    private String cvssVector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_solution")

    private String cveSolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_affect")

    private String cveAffect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_affect_description")

    private String cveAffectDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_type")

    private String cveType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_type_description")

    private String cveTypeDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_level")

    private String cveLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cvss")

    private Float cvss;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_time")

    private Long publicTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts_num")

    private VulnerabilityHostNumberInfo hostsNum;

    public WindowsVulDetailInfo withCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }

    /**
     * **参数解释**: CVE ID **取值范围**: 字符范围1-32位 
     * @return cveId
     */
    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    public WindowsVulDetailInfo withCveName(String cveName) {
        this.cveName = cveName;
        return this;
    }

    /**
     * **参数解释**: cve漏洞名称 **取值范围**: 字符范围0-512位 
     * @return cveName
     */
    public String getCveName() {
        return cveName;
    }

    public void setCveName(String cveName) {
        this.cveName = cveName;
    }

    public WindowsVulDetailInfo withCvssVersion(String cvssVersion) {
        this.cvssVersion = cvssVersion;
        return this;
    }

    /**
     * **参数解释**: cvss评分版本 **取值范围**: 字符范围0-32位 
     * @return cvssVersion
     */
    public String getCvssVersion() {
        return cvssVersion;
    }

    public void setCvssVersion(String cvssVersion) {
        this.cvssVersion = cvssVersion;
    }

    public WindowsVulDetailInfo withCvssVector(String cvssVector) {
        this.cvssVector = cvssVector;
        return this;
    }

    /**
     * **参数解释**: 攻击矢量 **取值范围**: 字符范围0-128位 
     * @return cvssVector
     */
    public String getCvssVector() {
        return cvssVector;
    }

    public void setCvssVector(String cvssVector) {
        this.cvssVector = cvssVector;
    }

    public WindowsVulDetailInfo withCveSolution(String cveSolution) {
        this.cveSolution = cveSolution;
        return this;
    }

    /**
     * **参数解释**: cve修复建议 **取值范围**: 字符范围0-128位 
     * @return cveSolution
     */
    public String getCveSolution() {
        return cveSolution;
    }

    public void setCveSolution(String cveSolution) {
        this.cveSolution = cveSolution;
    }

    public WindowsVulDetailInfo withCveAffect(String cveAffect) {
        this.cveAffect = cveAffect;
        return this;
    }

    /**
     * **参数解释**: cve漏洞危害 **取值范围**: 字符范围0-128位 
     * @return cveAffect
     */
    public String getCveAffect() {
        return cveAffect;
    }

    public void setCveAffect(String cveAffect) {
        this.cveAffect = cveAffect;
    }

    public WindowsVulDetailInfo withCveAffectDescription(String cveAffectDescription) {
        this.cveAffectDescription = cveAffectDescription;
        return this;
    }

    /**
     * **参数解释**: cve漏洞危害的描述信息 **取值范围**: 字符范围0-4096位 
     * @return cveAffectDescription
     */
    public String getCveAffectDescription() {
        return cveAffectDescription;
    }

    public void setCveAffectDescription(String cveAffectDescription) {
        this.cveAffectDescription = cveAffectDescription;
    }

    public WindowsVulDetailInfo withCveType(String cveType) {
        this.cveType = cveType;
        return this;
    }

    /**
     * **参数解释**: cve漏洞类型 **取值范围**: 字符范围0-128位 
     * @return cveType
     */
    public String getCveType() {
        return cveType;
    }

    public void setCveType(String cveType) {
        this.cveType = cveType;
    }

    public WindowsVulDetailInfo withCveTypeDescription(String cveTypeDescription) {
        this.cveTypeDescription = cveTypeDescription;
        return this;
    }

    /**
     * **参数解释**: cve漏洞类型的描述信息 **取值范围**: 字符范围0-4096位 
     * @return cveTypeDescription
     */
    public String getCveTypeDescription() {
        return cveTypeDescription;
    }

    public void setCveTypeDescription(String cveTypeDescription) {
        this.cveTypeDescription = cveTypeDescription;
    }

    public WindowsVulDetailInfo withCveLevel(String cveLevel) {
        this.cveLevel = cveLevel;
        return this;
    }

    /**
     * **参数解释**: 危险程度 **取值范围**: - Low：低危险程度 - Medium：中危险程度 - High：高危险程度 
     * @return cveLevel
     */
    public String getCveLevel() {
        return cveLevel;
    }

    public void setCveLevel(String cveLevel) {
        this.cveLevel = cveLevel;
    }

    public WindowsVulDetailInfo withCvss(Float cvss) {
        this.cvss = cvss;
        return this;
    }

    /**
     * **参数解释**: cvss评分 **取值范围**: 最小值0，最大值10 
     * minimum: 0
     * maximum: 1E+1
     * @return cvss
     */
    public Float getCvss() {
        return cvss;
    }

    public void setCvss(Float cvss) {
        this.cvss = cvss;
    }

    public WindowsVulDetailInfo withPublicTime(Long publicTime) {
        this.publicTime = publicTime;
        return this;
    }

    /**
     * **参数解释**: 漏洞披露时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return publicTime
     */
    public Long getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Long publicTime) {
        this.publicTime = publicTime;
    }

    public WindowsVulDetailInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: cve漏洞描述 **取值范围**: 字符范围0-65535位 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WindowsVulDetailInfo withHostsNum(VulnerabilityHostNumberInfo hostsNum) {
        this.hostsNum = hostsNum;
        return this;
    }

    public WindowsVulDetailInfo withHostsNum(Consumer<VulnerabilityHostNumberInfo> hostsNumSetter) {
        if (this.hostsNum == null) {
            this.hostsNum = new VulnerabilityHostNumberInfo();
            hostsNumSetter.accept(this.hostsNum);
        }

        return this;
    }

    /**
     * Get hostsNum
     * @return hostsNum
     */
    public VulnerabilityHostNumberInfo getHostsNum() {
        return hostsNum;
    }

    public void setHostsNum(VulnerabilityHostNumberInfo hostsNum) {
        this.hostsNum = hostsNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WindowsVulDetailInfo that = (WindowsVulDetailInfo) obj;
        return Objects.equals(this.cveId, that.cveId) && Objects.equals(this.cveName, that.cveName)
            && Objects.equals(this.cvssVersion, that.cvssVersion) && Objects.equals(this.cvssVector, that.cvssVector)
            && Objects.equals(this.cveSolution, that.cveSolution) && Objects.equals(this.cveAffect, that.cveAffect)
            && Objects.equals(this.cveAffectDescription, that.cveAffectDescription)
            && Objects.equals(this.cveType, that.cveType)
            && Objects.equals(this.cveTypeDescription, that.cveTypeDescription)
            && Objects.equals(this.cveLevel, that.cveLevel) && Objects.equals(this.cvss, that.cvss)
            && Objects.equals(this.publicTime, that.publicTime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.hostsNum, that.hostsNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cveId,
            cveName,
            cvssVersion,
            cvssVector,
            cveSolution,
            cveAffect,
            cveAffectDescription,
            cveType,
            cveTypeDescription,
            cveLevel,
            cvss,
            publicTime,
            description,
            hostsNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WindowsVulDetailInfo {\n");
        sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
        sb.append("    cveName: ").append(toIndentedString(cveName)).append("\n");
        sb.append("    cvssVersion: ").append(toIndentedString(cvssVersion)).append("\n");
        sb.append("    cvssVector: ").append(toIndentedString(cvssVector)).append("\n");
        sb.append("    cveSolution: ").append(toIndentedString(cveSolution)).append("\n");
        sb.append("    cveAffect: ").append(toIndentedString(cveAffect)).append("\n");
        sb.append("    cveAffectDescription: ").append(toIndentedString(cveAffectDescription)).append("\n");
        sb.append("    cveType: ").append(toIndentedString(cveType)).append("\n");
        sb.append("    cveTypeDescription: ").append(toIndentedString(cveTypeDescription)).append("\n");
        sb.append("    cveLevel: ").append(toIndentedString(cveLevel)).append("\n");
        sb.append("    cvss: ").append(toIndentedString(cvss)).append("\n");
        sb.append("    publicTime: ").append(toIndentedString(publicTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hostsNum: ").append(toIndentedString(hostsNum)).append("\n");
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
