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
 * 集群的安全体检结果信息
 */
public class SecurityCheckClusterReports {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    /**
     * **参数解释**： 集群类型 **取值范围**： - CCE：CCE Standard集群 - Turbo：CCE Turbo集群 
     */
    public static final class ClusterCategoryEnum {

        /**
         * Enum CCE for value: "CCE"
         */
        public static final ClusterCategoryEnum CCE = new ClusterCategoryEnum("CCE");

        /**
         * Enum TURBO for value: "Turbo"
         */
        public static final ClusterCategoryEnum TURBO = new ClusterCategoryEnum("Turbo");

        private static final Map<String, ClusterCategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterCategoryEnum> createStaticFields() {
            Map<String, ClusterCategoryEnum> map = new HashMap<>();
            map.put("CCE", CCE);
            map.put("Turbo", TURBO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClusterCategoryEnum(String value) {
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
        public static ClusterCategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClusterCategoryEnum(value));
        }

        public static ClusterCategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterCategoryEnum) {
                return this.value.equals(((ClusterCategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_category")

    private ClusterCategoryEnum clusterCategory;

    /**
     * **参数解释**： 风险级别 **取值范围**： - Security：无风险 - Insecurity：有风险 
     */
    public static final class SeverityEnum {

        /**
         * Enum SECURITY for value: "Security"
         */
        public static final SeverityEnum SECURITY = new SeverityEnum("Security");

        /**
         * Enum INSECURITY for value: "Insecurity"
         */
        public static final SeverityEnum INSECURITY = new SeverityEnum("Insecurity");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("Security", SECURITY);
            map.put("Insecurity", INSECURITY);
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
    @JsonProperty(value = "local_image_vul_num")

    private Integer localImageVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_config_num")

    private Integer riskConfigNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged_container_num")

    private Integer privilegedContainerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    public SecurityCheckClusterReports withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释**： 体检报告ID **取值范围**： 不涉及 
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public SecurityCheckClusterReports withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**： 集群名称 **取值范围**： 不涉及 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public SecurityCheckClusterReports withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID **取值范围**： 不涉及 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public SecurityCheckClusterReports withClusterCategory(ClusterCategoryEnum clusterCategory) {
        this.clusterCategory = clusterCategory;
        return this;
    }

    /**
     * **参数解释**： 集群类型 **取值范围**： - CCE：CCE Standard集群 - Turbo：CCE Turbo集群 
     * @return clusterCategory
     */
    public ClusterCategoryEnum getClusterCategory() {
        return clusterCategory;
    }

    public void setClusterCategory(ClusterCategoryEnum clusterCategory) {
        this.clusterCategory = clusterCategory;
    }

    public SecurityCheckClusterReports withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 风险级别 **取值范围**： - Security：无风险 - Insecurity：有风险 
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public SecurityCheckClusterReports withLocalImageVulNum(Integer localImageVulNum) {
        this.localImageVulNum = localImageVulNum;
        return this;
    }

    /**
     * **参数解释**： 本地镜像漏洞风险数量 **取值范围**： 不涉及 
     * @return localImageVulNum
     */
    public Integer getLocalImageVulNum() {
        return localImageVulNum;
    }

    public void setLocalImageVulNum(Integer localImageVulNum) {
        this.localImageVulNum = localImageVulNum;
    }

    public SecurityCheckClusterReports withRiskConfigNum(Integer riskConfigNum) {
        this.riskConfigNum = riskConfigNum;
        return this;
    }

    /**
     * **参数解释**： 基线风险数量 **取值范围**： 不涉及 
     * @return riskConfigNum
     */
    public Integer getRiskConfigNum() {
        return riskConfigNum;
    }

    public void setRiskConfigNum(Integer riskConfigNum) {
        this.riskConfigNum = riskConfigNum;
    }

    public SecurityCheckClusterReports withPrivilegedContainerNum(Integer privilegedContainerNum) {
        this.privilegedContainerNum = privilegedContainerNum;
        return this;
    }

    /**
     * **参数解释**： 特权容器告警数量 **取值范围**： 不涉及 
     * @return privilegedContainerNum
     */
    public Integer getPrivilegedContainerNum() {
        return privilegedContainerNum;
    }

    public void setPrivilegedContainerNum(Integer privilegedContainerNum) {
        this.privilegedContainerNum = privilegedContainerNum;
    }

    public SecurityCheckClusterReports withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**： 最新检测时间 **取值范围**： 不涉及 
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityCheckClusterReports that = (SecurityCheckClusterReports) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterCategory, that.clusterCategory)
            && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.localImageVulNum, that.localImageVulNum)
            && Objects.equals(this.riskConfigNum, that.riskConfigNum)
            && Objects.equals(this.privilegedContainerNum, that.privilegedContainerNum)
            && Objects.equals(this.scanTime, that.scanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId,
            clusterName,
            clusterId,
            clusterCategory,
            severity,
            localImageVulNum,
            riskConfigNum,
            privilegedContainerNum,
            scanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCheckClusterReports {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterCategory: ").append(toIndentedString(clusterCategory)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    localImageVulNum: ").append(toIndentedString(localImageVulNum)).append("\n");
        sb.append("    riskConfigNum: ").append(toIndentedString(riskConfigNum)).append("\n");
        sb.append("    privilegedContainerNum: ").append(toIndentedString(privilegedContainerNum)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
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
