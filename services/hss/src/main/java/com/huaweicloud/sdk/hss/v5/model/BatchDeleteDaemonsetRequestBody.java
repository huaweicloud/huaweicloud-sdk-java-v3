package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量卸载请求体
 */
public class BatchDeleteDaemonsetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_ids")

    private List<String> clusterIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoked_service")

    private String invokedService;

    public BatchDeleteDaemonsetRequestBody withClusterIds(List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }

    public BatchDeleteDaemonsetRequestBody addClusterIdsItem(String clusterIdsItem) {
        if (this.clusterIds == null) {
            this.clusterIds = new ArrayList<>();
        }
        this.clusterIds.add(clusterIdsItem);
        return this;
    }

    public BatchDeleteDaemonsetRequestBody withClusterIds(Consumer<List<String>> clusterIdsSetter) {
        if (this.clusterIds == null) {
            this.clusterIds = new ArrayList<>();
        }
        clusterIdsSetter.accept(this.clusterIds);
        return this;
    }

    /**
     * 批量卸载列表
     * @return clusterIds
     */
    public List<String> getClusterIds() {
        return clusterIds;
    }

    public void setClusterIds(List<String> clusterIds) {
        this.clusterIds = clusterIds;
    }

    public BatchDeleteDaemonsetRequestBody withInvokedService(String invokedService) {
        this.invokedService = invokedService;
        return this;
    }

    /**
     * 调用服务，标识cce免费体检报告，cce调用传参为cce:    - hss hss服务    - cce cce服务
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
        BatchDeleteDaemonsetRequestBody that = (BatchDeleteDaemonsetRequestBody) obj;
        return Objects.equals(this.clusterIds, that.clusterIds)
            && Objects.equals(this.invokedService, that.invokedService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterIds, invokedService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteDaemonsetRequestBody {\n");
        sb.append("    clusterIds: ").append(toIndentedString(clusterIds)).append("\n");
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
