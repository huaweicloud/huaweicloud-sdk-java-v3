package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListClusterRisksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_type")

    private String riskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_status")

    private String riskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_name")

    private String riskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_category")

    private String riskCategory;

    public ListClusterRisksRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListClusterRisksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
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

    public ListClusterRisksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
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

    public ListClusterRisksRequest withRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }

    /**
     * 风险类型，包含如下   - risk_assessment : 风险评估   - benchmark ：安全合规
     * @return riskType
     */
    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public ListClusterRisksRequest withRiskStatus(String riskStatus) {
        this.riskStatus = riskStatus;
        return this;
    }

    /**
     * 风险状态，包含如下，该字段不传值则查询全部数据：   - risky：有风险
     * @return riskStatus
     */
    public String getRiskStatus() {
        return riskStatus;
    }

    public void setRiskStatus(String riskStatus) {
        this.riskStatus = riskStatus;
    }

    public ListClusterRisksRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListClusterRisksRequest withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ListClusterRisksRequest withRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }

    /**
     * 风险名称
     * @return riskName
     */
    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
    }

    public ListClusterRisksRequest withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险程度，包含如下   - high ：高危   - medium ：中危   - low ：低危   - tips ：提示
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public ListClusterRisksRequest withRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
        return this;
    }

    /**
     * 风险分类，包含如下：   - control_plane：控制平面   - access_control：访问控制   - network：网络   - workload：工作负载   - secrets：密钥管理   - node_escape：节点逃逸
     * @return riskCategory
     */
    public String getRiskCategory() {
        return riskCategory;
    }

    public void setRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterRisksRequest that = (ListClusterRisksRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.riskType, that.riskType) && Objects.equals(this.riskStatus, that.riskStatus)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.riskName, that.riskName) && Objects.equals(this.riskLevel, that.riskLevel)
            && Objects.equals(this.riskCategory, that.riskCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            offset,
            limit,
            riskType,
            riskStatus,
            clusterId,
            clusterName,
            riskName,
            riskLevel,
            riskCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterRisksRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    riskType: ").append(toIndentedString(riskType)).append("\n");
        sb.append("    riskStatus: ").append(toIndentedString(riskStatus)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    riskName: ").append(toIndentedString(riskName)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    riskCategory: ").append(toIndentedString(riskCategory)).append("\n");
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
