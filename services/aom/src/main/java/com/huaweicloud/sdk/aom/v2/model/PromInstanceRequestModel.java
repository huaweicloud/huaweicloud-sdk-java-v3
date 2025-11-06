package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PromInstanceRequestModel
 */
public class PromInstanceRequestModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_name")

    private String promName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_type")

    private String promType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_version")

    private String promVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggr_prometheus_info")

    private List<AggrPrometheusInfo> aggrPrometheusInfo = null;

    public PromInstanceRequestModel withPromName(String promName) {
        this.promName = promName;
        return this;
    }

    /**
     * Prometheus实例名称 名称不能以下划线或中划线开头结尾，只含有中文、英文、数字、下划线、中划线、长度1-100。
     * @return promName
     */
    public String getPromName() {
        return promName;
    }

    public void setPromName(String promName) {
        this.promName = promName;
    }

    public PromInstanceRequestModel withPromType(String promType) {
        this.promType = promType;
        return this;
    }

    /**
     * Prometheus实例类型。 - ECS：Prometheus for ECS - CCE：Prometheus for CCE - REMOTE_WRITE：Prometheus 通用实例 - CLOUD_SERVICE：Prometheus for 云服务 - ACROSS_ACCOUNT：Prometheus for 多账号聚合实例 [（暂不支持ACROSS_ACCOUNT类型）](tag:hws_eu,g42,sbc,OCB,ctc,cmcc,srg,hk_sbc,ctc,DT)
     * @return promType
     */
    public String getPromType() {
        return promType;
    }

    public void setPromType(String promType) {
        this.promType = promType;
    }

    public PromInstanceRequestModel withPromVersion(String promVersion) {
        this.promVersion = promVersion;
        return this;
    }

    /**
     * Prometheus实例版本号。
     * @return promVersion
     */
    public String getPromVersion() {
        return promVersion;
    }

    public void setPromVersion(String promVersion) {
        this.promVersion = promVersion;
    }

    public PromInstanceRequestModel withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * Prometheus实例所属的企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PromInstanceRequestModel withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Prometheus实例所属projectId。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PromInstanceRequestModel withAggrPrometheusInfo(List<AggrPrometheusInfo> aggrPrometheusInfo) {
        this.aggrPrometheusInfo = aggrPrometheusInfo;
        return this;
    }

    public PromInstanceRequestModel addAggrPrometheusInfoItem(AggrPrometheusInfo aggrPrometheusInfoItem) {
        if (this.aggrPrometheusInfo == null) {
            this.aggrPrometheusInfo = new ArrayList<>();
        }
        this.aggrPrometheusInfo.add(aggrPrometheusInfoItem);
        return this;
    }

    public PromInstanceRequestModel withAggrPrometheusInfo(
        Consumer<List<AggrPrometheusInfo>> aggrPrometheusInfoSetter) {
        if (this.aggrPrometheusInfo == null) {
            this.aggrPrometheusInfo = new ArrayList<>();
        }
        aggrPrometheusInfoSetter.accept(this.aggrPrometheusInfo);
        return this;
    }

    /**
     * 被聚合的账号和普罗实例列表。
     * @return aggrPrometheusInfo
     */
    public List<AggrPrometheusInfo> getAggrPrometheusInfo() {
        return aggrPrometheusInfo;
    }

    public void setAggrPrometheusInfo(List<AggrPrometheusInfo> aggrPrometheusInfo) {
        this.aggrPrometheusInfo = aggrPrometheusInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PromInstanceRequestModel that = (PromInstanceRequestModel) obj;
        return Objects.equals(this.promName, that.promName) && Objects.equals(this.promType, that.promType)
            && Objects.equals(this.promVersion, that.promVersion)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.aggrPrometheusInfo, that.aggrPrometheusInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promName, promType, promVersion, enterpriseProjectId, projectId, aggrPrometheusInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromInstanceRequestModel {\n");
        sb.append("    promName: ").append(toIndentedString(promName)).append("\n");
        sb.append("    promType: ").append(toIndentedString(promType)).append("\n");
        sb.append("    promVersion: ").append(toIndentedString(promVersion)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    aggrPrometheusInfo: ").append(toIndentedString(aggrPrometheusInfo)).append("\n");
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
