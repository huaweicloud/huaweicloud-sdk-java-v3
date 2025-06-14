package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAgentDaemonsetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoked_service")

    private String invokedService;

    public DeleteAgentDaemonsetRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Region ID
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DeleteAgentDaemonsetRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 主机所属的企业项目ID。 企业项目ID默认取值为“0”，表示默认企业项目。如果需要查询所有企业项目下的主机，请传参“all_granted_eps”。如果您只有某个企业项目的权限，则需要传递该企业项目ID，查询该企业项目下的主机，否则会因权限不足而报错。 **约束限制**: 开通企业项目功能后才需要配置企业项目。 **取值范围**: 字符长度1-256位 **默认取值**: 0 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public DeleteAgentDaemonsetRequest withClusterId(String clusterId) {
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

    public DeleteAgentDaemonsetRequest withInvokedService(String invokedService) {
        this.invokedService = invokedService;
        return this;
    }

    /**
     * 调用服务,默认hss，cce集成防护调用场景使用，包括:    - hss： hss服务    - cce： cce服务，cce集成防护调用需要传参cce
     * @return invokedService
     */
    public String getInvokedService() {
        return invokedService;
    }

    public void setInvokedService(String invokedService) {
        this.invokedService = invokedService;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAgentDaemonsetRequest that = (DeleteAgentDaemonsetRequest) obj;
        return Objects.equals(this.region, that.region)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.invokedService, that.invokedService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, enterpriseProjectId, clusterId, invokedService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAgentDaemonsetRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    invokedService: ").append(toIndentedString(invokedService)).append("\n");
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
