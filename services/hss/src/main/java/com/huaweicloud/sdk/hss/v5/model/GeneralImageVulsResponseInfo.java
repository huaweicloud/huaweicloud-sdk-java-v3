package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 所有镜像漏洞详情
 */
public class GeneralImageVulsResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_list")

    private List<String> labelList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_num")

    private Integer imageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_list")

    private List<GeneralImageVulsResponseInfoCveList> cveList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cvss_score")

    private Float maxCvssScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution_detail")

    private String solutionDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_num")

    private Integer clusterNum;

    public GeneralImageVulsResponseInfo withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * 漏洞名称
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public GeneralImageVulsResponseInfo withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * 漏洞ID
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public GeneralImageVulsResponseInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 漏洞类型，包含如下：   -linux_vul : linux漏洞   -app_vul : 应用漏洞
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GeneralImageVulsResponseInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型，包含如下：   -local : 本地镜像   -registry : 仓库镜像   -cicd : CI/CD镜像   -cluster : 集群镜像
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public GeneralImageVulsResponseInfo withLabelList(List<String> labelList) {
        this.labelList = labelList;
        return this;
    }

    public GeneralImageVulsResponseInfo addLabelListItem(String labelListItem) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        this.labelList.add(labelListItem);
        return this;
    }

    public GeneralImageVulsResponseInfo withLabelList(Consumer<List<String>> labelListSetter) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        labelListSetter.accept(this.labelList);
        return this;
    }

    /**
     * 漏洞标签列表
     * @return labelList
     */
    public List<String> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<String> labelList) {
        this.labelList = labelList;
    }

    public GeneralImageVulsResponseInfo withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * 漏洞的风险程度，取值如下：  -Critical : 严重  -High : 高危  -Medium : 中危  -Low : 低危
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public GeneralImageVulsResponseInfo withImageNum(Integer imageNum) {
        this.imageNum = imageNum;
        return this;
    }

    /**
     * 受影响镜像总数
     * minimum: 0
     * maximum: 2147483547
     * @return imageNum
     */
    public Integer getImageNum() {
        return imageNum;
    }

    public void setImageNum(Integer imageNum) {
        this.imageNum = imageNum;
    }

    public GeneralImageVulsResponseInfo withCveList(List<GeneralImageVulsResponseInfoCveList> cveList) {
        this.cveList = cveList;
        return this;
    }

    public GeneralImageVulsResponseInfo addCveListItem(GeneralImageVulsResponseInfoCveList cveListItem) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        this.cveList.add(cveListItem);
        return this;
    }

    public GeneralImageVulsResponseInfo withCveList(Consumer<List<GeneralImageVulsResponseInfoCveList>> cveListSetter) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        cveListSetter.accept(this.cveList);
        return this;
    }

    /**
     * CVE列表
     * @return cveList
     */
    public List<GeneralImageVulsResponseInfoCveList> getCveList() {
        return cveList;
    }

    public void setCveList(List<GeneralImageVulsResponseInfoCveList> cveList) {
        this.cveList = cveList;
    }

    public GeneralImageVulsResponseInfo withMaxCvssScore(Float maxCvssScore) {
        this.maxCvssScore = maxCvssScore;
        return this;
    }

    /**
     * 镜像最大CVSS分值
     * minimum: 0
     * maximum: 1E+1
     * @return maxCvssScore
     */
    public Float getMaxCvssScore() {
        return maxCvssScore;
    }

    public void setMaxCvssScore(Float maxCvssScore) {
        this.maxCvssScore = maxCvssScore;
    }

    public GeneralImageVulsResponseInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * 最近扫描时间，时间单位：毫秒（ms）
     * minimum: 0
     * maximum: 4070880000000
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public GeneralImageVulsResponseInfo withDescription(String description) {
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

    public GeneralImageVulsResponseInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 漏洞修复参考链接
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GeneralImageVulsResponseInfo withSolutionDetail(String solutionDetail) {
        this.solutionDetail = solutionDetail;
        return this;
    }

    /**
     * 修复建议
     * @return solutionDetail
     */
    public String getSolutionDetail() {
        return solutionDetail;
    }

    public void setSolutionDetail(String solutionDetail) {
        this.solutionDetail = solutionDetail;
    }

    public GeneralImageVulsResponseInfo withClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
        return this;
    }

    /**
     * 受影响集群总数
     * minimum: 0
     * maximum: 2147483547
     * @return clusterNum
     */
    public Integer getClusterNum() {
        return clusterNum;
    }

    public void setClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeneralImageVulsResponseInfo that = (GeneralImageVulsResponseInfo) obj;
        return Objects.equals(this.vulName, that.vulName) && Objects.equals(this.vulId, that.vulId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.labelList, that.labelList) && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.imageNum, that.imageNum) && Objects.equals(this.cveList, that.cveList)
            && Objects.equals(this.maxCvssScore, that.maxCvssScore) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.description, that.description) && Objects.equals(this.url, that.url)
            && Objects.equals(this.solutionDetail, that.solutionDetail)
            && Objects.equals(this.clusterNum, that.clusterNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulName,
            vulId,
            type,
            imageType,
            labelList,
            severityLevel,
            imageNum,
            cveList,
            maxCvssScore,
            scanTime,
            description,
            url,
            solutionDetail,
            clusterNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralImageVulsResponseInfo {\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    imageNum: ").append(toIndentedString(imageNum)).append("\n");
        sb.append("    cveList: ").append(toIndentedString(cveList)).append("\n");
        sb.append("    maxCvssScore: ").append(toIndentedString(maxCvssScore)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    solutionDetail: ").append(toIndentedString(solutionDetail)).append("\n");
        sb.append("    clusterNum: ").append(toIndentedString(clusterNum)).append("\n");
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
