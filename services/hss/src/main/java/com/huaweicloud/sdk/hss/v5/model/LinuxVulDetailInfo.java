package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * LinuxVulDetailInfo
 */
public class LinuxVulDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_id")

    private String cveId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_name")

    private String cveName;

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
    @JsonProperty(value = "cvss_version")

    private String cvssVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_time")

    private Long publicTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cnvd_id")

    private String cnvdId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cnnvd_id")

    private String cnnvdId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts_num")

    private VulnerabilityHostNumberInfo hostsNum;

    public LinuxVulDetailInfo withCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }

    /**
     * **参数解释**: 漏洞编号 **取值范围**: 字符长度0-255 
     * @return cveId
     */
    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    public LinuxVulDetailInfo withCveName(String cveName) {
        this.cveName = cveName;
        return this;
    }

    /**
     * **参数解释**: cve漏洞名称 **取值范围**: 字符长度0-512 
     * @return cveName
     */
    public String getCveName() {
        return cveName;
    }

    public void setCveName(String cveName) {
        this.cveName = cveName;
    }

    public LinuxVulDetailInfo withCvssVector(String cvssVector) {
        this.cvssVector = cvssVector;
        return this;
    }

    /**
     * **参数解释**: 攻击矢量 **取值范围**: 字符长度0-255 
     * @return cvssVector
     */
    public String getCvssVector() {
        return cvssVector;
    }

    public void setCvssVector(String cvssVector) {
        this.cvssVector = cvssVector;
    }

    public LinuxVulDetailInfo withCveSolution(String cveSolution) {
        this.cveSolution = cveSolution;
        return this;
    }

    /**
     * **参数解释**: cve修复建议 **取值范围**: 字符长度0-4096 
     * @return cveSolution
     */
    public String getCveSolution() {
        return cveSolution;
    }

    public void setCveSolution(String cveSolution) {
        this.cveSolution = cveSolution;
    }

    public LinuxVulDetailInfo withCveAffect(String cveAffect) {
        this.cveAffect = cveAffect;
        return this;
    }

    /**
     * **参数解释**: cve漏洞危害 **取值范围**: 字符长度0-128 
     * @return cveAffect
     */
    public String getCveAffect() {
        return cveAffect;
    }

    public void setCveAffect(String cveAffect) {
        this.cveAffect = cveAffect;
    }

    public LinuxVulDetailInfo withCveAffectDescription(String cveAffectDescription) {
        this.cveAffectDescription = cveAffectDescription;
        return this;
    }

    /**
     * **参数解释**: cve漏洞危害的描述信息 **取值范围**: 字符长度0-4096 
     * @return cveAffectDescription
     */
    public String getCveAffectDescription() {
        return cveAffectDescription;
    }

    public void setCveAffectDescription(String cveAffectDescription) {
        this.cveAffectDescription = cveAffectDescription;
    }

    public LinuxVulDetailInfo withCveType(String cveType) {
        this.cveType = cveType;
        return this;
    }

    /**
     * **参数解释**: cve漏洞类型 **取值范围**: 字符长度0-128 
     * @return cveType
     */
    public String getCveType() {
        return cveType;
    }

    public void setCveType(String cveType) {
        this.cveType = cveType;
    }

    public LinuxVulDetailInfo withCveTypeDescription(String cveTypeDescription) {
        this.cveTypeDescription = cveTypeDescription;
        return this;
    }

    /**
     * **参数解释**: cve漏洞类型的描述信息 **取值范围**: 字符长度0-4096 
     * @return cveTypeDescription
     */
    public String getCveTypeDescription() {
        return cveTypeDescription;
    }

    public void setCveTypeDescription(String cveTypeDescription) {
        this.cveTypeDescription = cveTypeDescription;
    }

    public LinuxVulDetailInfo withCveLevel(String cveLevel) {
        this.cveLevel = cveLevel;
        return this;
    }

    /**
     * **参数解释**: cve危险程度 **取值范围**: - Low：低危 - Medium：中危 - High：高危 
     * @return cveLevel
     */
    public String getCveLevel() {
        return cveLevel;
    }

    public void setCveLevel(String cveLevel) {
        this.cveLevel = cveLevel;
    }

    public LinuxVulDetailInfo withCvss(Float cvss) {
        this.cvss = cvss;
        return this;
    }

    /**
     * **参数解释**: 漏洞分值 **取值范围**: 最小值0，最大值10 
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

    public LinuxVulDetailInfo withCvssVersion(String cvssVersion) {
        this.cvssVersion = cvssVersion;
        return this;
    }

    /**
     * **参数解释**: cvss评分版本 **取值范围**: 字符长度0-32 
     * @return cvssVersion
     */
    public String getCvssVersion() {
        return cvssVersion;
    }

    public void setCvssVersion(String cvssVersion) {
        this.cvssVersion = cvssVersion;
    }

    public LinuxVulDetailInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 漏洞描述 **取值范围**: 字符长度0-1024 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LinuxVulDetailInfo withPublicTime(Long publicTime) {
        this.publicTime = publicTime;
        return this;
    }

    /**
     * **参数解释**: 披露时间 **取值范围**: 最小值0，最大值2^63-1 
     * @return publicTime
     */
    public Long getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Long publicTime) {
        this.publicTime = publicTime;
    }

    public LinuxVulDetailInfo withCnvdId(String cnvdId) {
        this.cnvdId = cnvdId;
        return this;
    }

    /**
     * **参数解释**: cnvd编号 **取值范围**: 字符长度0-32 
     * @return cnvdId
     */
    public String getCnvdId() {
        return cnvdId;
    }

    public void setCnvdId(String cnvdId) {
        this.cnvdId = cnvdId;
    }

    public LinuxVulDetailInfo withCnnvdId(String cnnvdId) {
        this.cnnvdId = cnnvdId;
        return this;
    }

    /**
     * **参数解释**: cnnvd编号 **取值范围**: 字符长度0-32 
     * @return cnnvdId
     */
    public String getCnnvdId() {
        return cnnvdId;
    }

    public void setCnnvdId(String cnnvdId) {
        this.cnnvdId = cnnvdId;
    }

    public LinuxVulDetailInfo withHostsNum(VulnerabilityHostNumberInfo hostsNum) {
        this.hostsNum = hostsNum;
        return this;
    }

    public LinuxVulDetailInfo withHostsNum(Consumer<VulnerabilityHostNumberInfo> hostsNumSetter) {
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
        LinuxVulDetailInfo that = (LinuxVulDetailInfo) obj;
        return Objects.equals(this.cveId, that.cveId) && Objects.equals(this.cveName, that.cveName)
            && Objects.equals(this.cvssVector, that.cvssVector) && Objects.equals(this.cveSolution, that.cveSolution)
            && Objects.equals(this.cveAffect, that.cveAffect)
            && Objects.equals(this.cveAffectDescription, that.cveAffectDescription)
            && Objects.equals(this.cveType, that.cveType)
            && Objects.equals(this.cveTypeDescription, that.cveTypeDescription)
            && Objects.equals(this.cveLevel, that.cveLevel) && Objects.equals(this.cvss, that.cvss)
            && Objects.equals(this.cvssVersion, that.cvssVersion) && Objects.equals(this.description, that.description)
            && Objects.equals(this.publicTime, that.publicTime) && Objects.equals(this.cnvdId, that.cnvdId)
            && Objects.equals(this.cnnvdId, that.cnnvdId) && Objects.equals(this.hostsNum, that.hostsNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cveId,
            cveName,
            cvssVector,
            cveSolution,
            cveAffect,
            cveAffectDescription,
            cveType,
            cveTypeDescription,
            cveLevel,
            cvss,
            cvssVersion,
            description,
            publicTime,
            cnvdId,
            cnnvdId,
            hostsNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinuxVulDetailInfo {\n");
        sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
        sb.append("    cveName: ").append(toIndentedString(cveName)).append("\n");
        sb.append("    cvssVector: ").append(toIndentedString(cvssVector)).append("\n");
        sb.append("    cveSolution: ").append(toIndentedString(cveSolution)).append("\n");
        sb.append("    cveAffect: ").append(toIndentedString(cveAffect)).append("\n");
        sb.append("    cveAffectDescription: ").append(toIndentedString(cveAffectDescription)).append("\n");
        sb.append("    cveType: ").append(toIndentedString(cveType)).append("\n");
        sb.append("    cveTypeDescription: ").append(toIndentedString(cveTypeDescription)).append("\n");
        sb.append("    cveLevel: ").append(toIndentedString(cveLevel)).append("\n");
        sb.append("    cvss: ").append(toIndentedString(cvss)).append("\n");
        sb.append("    cvssVersion: ").append(toIndentedString(cvssVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    publicTime: ").append(toIndentedString(publicTime)).append("\n");
        sb.append("    cnvdId: ").append(toIndentedString(cnvdId)).append("\n");
        sb.append("    cnnvdId: ").append(toIndentedString(cnnvdId)).append("\n");
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
