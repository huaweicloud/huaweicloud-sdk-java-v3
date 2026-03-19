package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WebCmsVulDetailInfo
 */
public class WebCmsVulDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_zh")

    private String nameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_time")

    private Long publicTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulLabel_zh")

    private String vulLabelZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulLabel_en")

    private String vulLabelEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_necessity")

    private Integer repairNecessity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_zh")

    private String descriptionZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_en")

    private String descriptionEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution_zh")

    private String solutionZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution_en")

    private String solutionEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_id")

    private String cveId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_score")

    private Float cveScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cnvd_id")

    private String cnvdId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cnnvd_id")

    private String cnnvdId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bugtraq_id")

    private String bugtraqId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suffix_path")

    private String suffixPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "md5")

    private String md5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_zh")

    private String tagsZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_en")

    private String tagsEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_url")

    private String patchUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts_num")

    private VulnerabilityHostNumberInfo hostsNum;

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

    public WebCmsVulDetailInfo withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释**: 漏洞补丁编号 **取值范围**: 字符长度0-256 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public WebCmsVulDetailInfo withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * **参数解释**: 软件名称 **取值范围**: 字符长度0-32 
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public WebCmsVulDetailInfo withNameZh(String nameZh) {
        this.nameZh = nameZh;
        return this;
    }

    /**
     * **参数解释**: 中文名称 **取值范围**: 字符长度0-128 
     * @return nameZh
     */
    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public WebCmsVulDetailInfo withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * **参数解释**: 英文名称 **取值范围**: 字符长度0-128 
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public WebCmsVulDetailInfo withPublicTime(Long publicTime) {
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

    public WebCmsVulDetailInfo withVulLabelZh(String vulLabelZh) {
        this.vulLabelZh = vulLabelZh;
        return this;
    }

    /**
     * **参数解释**: 漏洞标签中文名称 **取值范围**: 字符长度0-64 
     * @return vulLabelZh
     */
    public String getVulLabelZh() {
        return vulLabelZh;
    }

    public void setVulLabelZh(String vulLabelZh) {
        this.vulLabelZh = vulLabelZh;
    }

    public WebCmsVulDetailInfo withVulLabelEn(String vulLabelEn) {
        this.vulLabelEn = vulLabelEn;
        return this;
    }

    /**
     * **参数解释**: 漏洞标签英文名称 **取值范围**: 字符长度0-64 
     * @return vulLabelEn
     */
    public String getVulLabelEn() {
        return vulLabelEn;
    }

    public void setVulLabelEn(String vulLabelEn) {
        this.vulLabelEn = vulLabelEn;
    }

    public WebCmsVulDetailInfo withRepairNecessity(Integer repairNecessity) {
        this.repairNecessity = repairNecessity;
        return this;
    }

    /**
     * **参数解释**: 修复必要性 **取值范围**: - 1：高 - 2：中 - 3：低 
     * @return repairNecessity
     */
    public Integer getRepairNecessity() {
        return repairNecessity;
    }

    public void setRepairNecessity(Integer repairNecessity) {
        this.repairNecessity = repairNecessity;
    }

    public WebCmsVulDetailInfo withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * **参数解释**: 修复必要性 **取值范围**: - Low：低危 - Medium：中危 - High：高危 - Critical：紧急 
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public WebCmsVulDetailInfo withDescriptionZh(String descriptionZh) {
        this.descriptionZh = descriptionZh;
        return this;
    }

    /**
     * **参数解释**: cve漏洞中文描述 **取值范围**: 字符长度0-1024 
     * @return descriptionZh
     */
    public String getDescriptionZh() {
        return descriptionZh;
    }

    public void setDescriptionZh(String descriptionZh) {
        this.descriptionZh = descriptionZh;
    }

    public WebCmsVulDetailInfo withDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
        return this;
    }

    /**
     * **参数解释**: cve漏洞英文描述 **取值范围**: 字符长度0-1024 
     * @return descriptionEn
     */
    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public WebCmsVulDetailInfo withSolutionZh(String solutionZh) {
        this.solutionZh = solutionZh;
        return this;
    }

    /**
     * **参数解释**: cve漏洞中文修复建议 **取值范围**: 字符长度0-1024 
     * @return solutionZh
     */
    public String getSolutionZh() {
        return solutionZh;
    }

    public void setSolutionZh(String solutionZh) {
        this.solutionZh = solutionZh;
    }

    public WebCmsVulDetailInfo withSolutionEn(String solutionEn) {
        this.solutionEn = solutionEn;
        return this;
    }

    /**
     * **参数解释**: cve漏洞英文修复建议 **取值范围**: 字符长度0-1024 
     * @return solutionEn
     */
    public String getSolutionEn() {
        return solutionEn;
    }

    public void setSolutionEn(String solutionEn) {
        this.solutionEn = solutionEn;
    }

    public WebCmsVulDetailInfo withCveId(String cveId) {
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

    public WebCmsVulDetailInfo withCveScore(Float cveScore) {
        this.cveScore = cveScore;
        return this;
    }

    /**
     * **参数解释**: cve分数 **取值范围**: 最小值0，最大值10 
     * minimum: 0
     * maximum: 1E+1
     * @return cveScore
     */
    public Float getCveScore() {
        return cveScore;
    }

    public void setCveScore(Float cveScore) {
        this.cveScore = cveScore;
    }

    public WebCmsVulDetailInfo withCnvdId(String cnvdId) {
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

    public WebCmsVulDetailInfo withCnnvdId(String cnnvdId) {
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

    public WebCmsVulDetailInfo withBugtraqId(String bugtraqId) {
        this.bugtraqId = bugtraqId;
        return this;
    }

    /**
     * **参数解释**: bugtraq编号 **取值范围**: 字符长度0-32 
     * @return bugtraqId
     */
    public String getBugtraqId() {
        return bugtraqId;
    }

    public void setBugtraqId(String bugtraqId) {
        this.bugtraqId = bugtraqId;
    }

    public WebCmsVulDetailInfo withSuffixPath(String suffixPath) {
        this.suffixPath = suffixPath;
        return this;
    }

    /**
     * **参数解释**: 后缀路径 **取值范围**: 字符长度0-128 
     * @return suffixPath
     */
    public String getSuffixPath() {
        return suffixPath;
    }

    public void setSuffixPath(String suffixPath) {
        this.suffixPath = suffixPath;
    }

    public WebCmsVulDetailInfo withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * **参数解释**: md5 **取值范围**: 字符长度0-32 
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public WebCmsVulDetailInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public WebCmsVulDetailInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**: 更新时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public WebCmsVulDetailInfo withTagsZh(String tagsZh) {
        this.tagsZh = tagsZh;
        return this;
    }

    /**
     * **参数解释**: 漏洞标签中文名称 **取值范围**: 字符长度0-64 
     * @return tagsZh
     */
    public String getTagsZh() {
        return tagsZh;
    }

    public void setTagsZh(String tagsZh) {
        this.tagsZh = tagsZh;
    }

    public WebCmsVulDetailInfo withTagsEn(String tagsEn) {
        this.tagsEn = tagsEn;
        return this;
    }

    /**
     * **参数解释**: 漏洞标签英文名称 **取值范围**: 字符长度0-64 
     * @return tagsEn
     */
    public String getTagsEn() {
        return tagsEn;
    }

    public void setTagsEn(String tagsEn) {
        this.tagsEn = tagsEn;
    }

    public WebCmsVulDetailInfo withPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
        return this;
    }

    /**
     * **参数解释**: 补丁地址 **取值范围**: 字符长度0-512 
     * @return patchUrl
     */
    public String getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
    }

    public WebCmsVulDetailInfo withHostsNum(VulnerabilityHostNumberInfo hostsNum) {
        this.hostsNum = hostsNum;
        return this;
    }

    public WebCmsVulDetailInfo withHostsNum(Consumer<VulnerabilityHostNumberInfo> hostsNumSetter) {
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

    public WebCmsVulDetailInfo withCveLevel(String cveLevel) {
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

    public WebCmsVulDetailInfo withCvss(Float cvss) {
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

    public WebCmsVulDetailInfo withCvssVersion(String cvssVersion) {
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

    public WebCmsVulDetailInfo withDescription(String description) {
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

    public WebCmsVulDetailInfo withCveName(String cveName) {
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

    public WebCmsVulDetailInfo withCvssVector(String cvssVector) {
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

    public WebCmsVulDetailInfo withCveSolution(String cveSolution) {
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

    public WebCmsVulDetailInfo withCveAffect(String cveAffect) {
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

    public WebCmsVulDetailInfo withCveAffectDescription(String cveAffectDescription) {
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

    public WebCmsVulDetailInfo withCveType(String cveType) {
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

    public WebCmsVulDetailInfo withCveTypeDescription(String cveTypeDescription) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebCmsVulDetailInfo that = (WebCmsVulDetailInfo) obj;
        return Objects.equals(this.vulId, that.vulId) && Objects.equals(this.app, that.app)
            && Objects.equals(this.nameZh, that.nameZh) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.publicTime, that.publicTime) && Objects.equals(this.vulLabelZh, that.vulLabelZh)
            && Objects.equals(this.vulLabelEn, that.vulLabelEn)
            && Objects.equals(this.repairNecessity, that.repairNecessity)
            && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.descriptionZh, that.descriptionZh)
            && Objects.equals(this.descriptionEn, that.descriptionEn)
            && Objects.equals(this.solutionZh, that.solutionZh) && Objects.equals(this.solutionEn, that.solutionEn)
            && Objects.equals(this.cveId, that.cveId) && Objects.equals(this.cveScore, that.cveScore)
            && Objects.equals(this.cnvdId, that.cnvdId) && Objects.equals(this.cnnvdId, that.cnnvdId)
            && Objects.equals(this.bugtraqId, that.bugtraqId) && Objects.equals(this.suffixPath, that.suffixPath)
            && Objects.equals(this.md5, that.md5) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.tagsZh, that.tagsZh)
            && Objects.equals(this.tagsEn, that.tagsEn) && Objects.equals(this.patchUrl, that.patchUrl)
            && Objects.equals(this.hostsNum, that.hostsNum) && Objects.equals(this.cveLevel, that.cveLevel)
            && Objects.equals(this.cvss, that.cvss) && Objects.equals(this.cvssVersion, that.cvssVersion)
            && Objects.equals(this.description, that.description) && Objects.equals(this.cveName, that.cveName)
            && Objects.equals(this.cvssVector, that.cvssVector) && Objects.equals(this.cveSolution, that.cveSolution)
            && Objects.equals(this.cveAffect, that.cveAffect)
            && Objects.equals(this.cveAffectDescription, that.cveAffectDescription)
            && Objects.equals(this.cveType, that.cveType)
            && Objects.equals(this.cveTypeDescription, that.cveTypeDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulId,
            app,
            nameZh,
            nameEn,
            publicTime,
            vulLabelZh,
            vulLabelEn,
            repairNecessity,
            severityLevel,
            descriptionZh,
            descriptionEn,
            solutionZh,
            solutionEn,
            cveId,
            cveScore,
            cnvdId,
            cnnvdId,
            bugtraqId,
            suffixPath,
            md5,
            createTime,
            updateTime,
            tagsZh,
            tagsEn,
            patchUrl,
            hostsNum,
            cveLevel,
            cvss,
            cvssVersion,
            description,
            cveName,
            cvssVector,
            cveSolution,
            cveAffect,
            cveAffectDescription,
            cveType,
            cveTypeDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebCmsVulDetailInfo {\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    nameZh: ").append(toIndentedString(nameZh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    publicTime: ").append(toIndentedString(publicTime)).append("\n");
        sb.append("    vulLabelZh: ").append(toIndentedString(vulLabelZh)).append("\n");
        sb.append("    vulLabelEn: ").append(toIndentedString(vulLabelEn)).append("\n");
        sb.append("    repairNecessity: ").append(toIndentedString(repairNecessity)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    descriptionZh: ").append(toIndentedString(descriptionZh)).append("\n");
        sb.append("    descriptionEn: ").append(toIndentedString(descriptionEn)).append("\n");
        sb.append("    solutionZh: ").append(toIndentedString(solutionZh)).append("\n");
        sb.append("    solutionEn: ").append(toIndentedString(solutionEn)).append("\n");
        sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
        sb.append("    cveScore: ").append(toIndentedString(cveScore)).append("\n");
        sb.append("    cnvdId: ").append(toIndentedString(cnvdId)).append("\n");
        sb.append("    cnnvdId: ").append(toIndentedString(cnnvdId)).append("\n");
        sb.append("    bugtraqId: ").append(toIndentedString(bugtraqId)).append("\n");
        sb.append("    suffixPath: ").append(toIndentedString(suffixPath)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    tagsZh: ").append(toIndentedString(tagsZh)).append("\n");
        sb.append("    tagsEn: ").append(toIndentedString(tagsEn)).append("\n");
        sb.append("    patchUrl: ").append(toIndentedString(patchUrl)).append("\n");
        sb.append("    hostsNum: ").append(toIndentedString(hostsNum)).append("\n");
        sb.append("    cveLevel: ").append(toIndentedString(cveLevel)).append("\n");
        sb.append("    cvss: ").append(toIndentedString(cvss)).append("\n");
        sb.append("    cvssVersion: ").append(toIndentedString(cvssVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cveName: ").append(toIndentedString(cveName)).append("\n");
        sb.append("    cvssVector: ").append(toIndentedString(cvssVector)).append("\n");
        sb.append("    cveSolution: ").append(toIndentedString(cveSolution)).append("\n");
        sb.append("    cveAffect: ").append(toIndentedString(cveAffect)).append("\n");
        sb.append("    cveAffectDescription: ").append(toIndentedString(cveAffectDescription)).append("\n");
        sb.append("    cveType: ").append(toIndentedString(cveType)).append("\n");
        sb.append("    cveTypeDescription: ").append(toIndentedString(cveTypeDescription)).append("\n");
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
