package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListVulContainersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_scan_time")

    private Long minScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_scan_time")

    private Long maxScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListVulContainersRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListVulContainersRequest withVulId(String vulId) {
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

    public ListVulContainersRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 漏洞类型   - linux_vul : 漏洞类型-linux漏洞   - windows_vul : 漏洞类型-windows漏洞   - web_cms : Web-CMS漏洞   - app_vul : 应用漏洞   - urgent_vul : 应急漏洞
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListVulContainersRequest withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 受影响容器名称
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ListVulContainersRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListVulContainersRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 漏洞状态   - vul_status_unfix : 未处理   - vul_status_ignored : 已忽略   - vul_status_verified : 验证中   - vul_status_fixing : 修复中   - vul_status_fixed : 修复成功   - vul_status_reboot : 修复成功待重启   - vul_status_failed : 修复失败   - vul_status_fix_after_reboot : 请重启主机再次修复
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListVulContainersRequest withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * 处置状态，包含如下:   - unhandled ：未处理   - handled : 已处理
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public ListVulContainersRequest withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * 危险程度 ，Critical，High，Medium，Low
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public ListVulContainersRequest withMinScanTime(Long minScanTime) {
        this.minScanTime = minScanTime;
        return this;
    }

    /**
     * 首次扫描时间最小值
     * minimum: 0
     * maximum: 9223372036854775807
     * @return minScanTime
     */
    public Long getMinScanTime() {
        return minScanTime;
    }

    public void setMinScanTime(Long minScanTime) {
        this.minScanTime = minScanTime;
    }

    public ListVulContainersRequest withMaxScanTime(Long maxScanTime) {
        this.maxScanTime = maxScanTime;
        return this;
    }

    /**
     * 首次扫描时间最大值
     * minimum: 0
     * maximum: 9223372036854775807
     * @return maxScanTime
     */
    public Long getMaxScanTime() {
        return maxScanTime;
    }

    public void setMaxScanTime(Long maxScanTime) {
        this.maxScanTime = maxScanTime;
    }

    public ListVulContainersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页条数
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListVulContainersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVulContainersRequest that = (ListVulContainersRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.vulId, that.vulId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.handleStatus, that.handleStatus)
            && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.minScanTime, that.minScanTime) && Objects.equals(this.maxScanTime, that.maxScanTime)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            vulId,
            type,
            containerName,
            clusterId,
            status,
            handleStatus,
            severityLevel,
            minScanTime,
            maxScanTime,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVulContainersRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    minScanTime: ").append(toIndentedString(minScanTime)).append("\n");
        sb.append("    maxScanTime: ").append(toIndentedString(maxScanTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
