package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowStatisticResourceResponseBodyDatapoints
 */
public class ShowStatisticResourceResponseBodyDatapoints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Integer data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    public ShowStatisticResourceResponseBodyDatapoints withData(Integer data) {
        this.data = data;
        return this;
    }

    /**
     * 数据
     * @return data
     */
    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public ShowStatisticResourceResponseBodyDatapoints withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowStatisticResourceResponseBodyDatapoints withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /**
     * 接口名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public ShowStatisticResourceResponseBodyDatapoints withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ShowStatisticResourceResponseBodyDatapoints withClusterId(String clusterId) {
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

    public ShowStatisticResourceResponseBodyDatapoints withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 服务类型
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatisticResourceResponseBodyDatapoints that = (ShowStatisticResourceResponseBodyDatapoints) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.count, that.count)
            && Objects.equals(this.apiName, that.apiName) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.serverType, that.serverType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, count, apiName, tenantId, clusterId, serverType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticResourceResponseBodyDatapoints {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
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
