package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListInstanceCompliantRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private String eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_system")

    private String operatingSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliant_status")

    private String compliantStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_scene")

    private String reportScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_info_id")

    private String cceInfoId;

    public ListInstanceCompliantRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListInstanceCompliantRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstanceCompliantRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * ECS实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstanceCompliantRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 内网ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ListInstanceCompliantRequest withEip(String eip) {
        this.eip = eip;
        return this;
    }

    /**
     * 弹性公网ip
     * @return eip
     */
    public String getEip() {
        return eip;
    }

    public void setEip(String eip) {
        this.eip = eip;
    }

    public ListInstanceCompliantRequest withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * 操作系统 - HuaweiCloudEulerOS - CentOS - EulerOS
     * @return operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public ListInstanceCompliantRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListInstanceCompliantRequest withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 分组
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ListInstanceCompliantRequest withCompliantStatus(String compliantStatus) {
        this.compliantStatus = compliantStatus;
        return this;
    }

    /**
     * 合规性状态 - non_compliant：不合规 - compliant：合规
     * @return compliantStatus
     */
    public String getCompliantStatus() {
        return compliantStatus;
    }

    public void setCompliantStatus(String compliantStatus) {
        this.compliantStatus = compliantStatus;
    }

    public ListInstanceCompliantRequest withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 工单id
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ListInstanceCompliantRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * minimum: 1
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListInstanceCompliantRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListInstanceCompliantRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序 - asc：升序 - desc：降序
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListInstanceCompliantRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段 - report_time：报告时间
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListInstanceCompliantRequest withReportScene(String reportScene) {
        this.reportScene = reportScene;
        return this;
    }

    /**
     * 报告场景 - CCE  - ECS
     * @return reportScene
     */
    public String getReportScene() {
        return reportScene;
    }

    public void setReportScene(String reportScene) {
        this.reportScene = reportScene;
    }

    public ListInstanceCompliantRequest withCceInfoId(String cceInfoId) {
        this.cceInfoId = cceInfoId;
        return this;
    }

    /**
     * cce 集群信息id
     * @return cceInfoId
     */
    public String getCceInfoId() {
        return cceInfoId;
    }

    public void setCceInfoId(String cceInfoId) {
        this.cceInfoId = cceInfoId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceCompliantRequest that = (ListInstanceCompliantRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.eip, that.eip)
            && Objects.equals(this.operatingSystem, that.operatingSystem) && Objects.equals(this.region, that.region)
            && Objects.equals(this.group, that.group) && Objects.equals(this.compliantStatus, that.compliantStatus)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.reportScene, that.reportScene)
            && Objects.equals(this.cceInfoId, that.cceInfoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            name,
            instanceId,
            ip,
            eip,
            operatingSystem,
            region,
            group,
            compliantStatus,
            orderId,
            offset,
            limit,
            sortDir,
            sortKey,
            reportScene,
            cceInfoId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceCompliantRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    compliantStatus: ").append(toIndentedString(compliantStatus)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    reportScene: ").append(toIndentedString(reportScene)).append("\n");
        sb.append("    cceInfoId: ").append(toIndentedString(cceInfoId)).append("\n");
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
