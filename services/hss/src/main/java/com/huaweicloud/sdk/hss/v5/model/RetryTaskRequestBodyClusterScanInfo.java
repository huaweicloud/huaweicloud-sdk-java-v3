package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * task_type值为“cluster_scan”时用于传递重新执行集群扫描任务的相关参数
 */
public class RetryTaskRequestBodyClusterScanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_type")

    private String rangeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_info_list")

    private List<RetryTaskRequestBodyClusterScanInfoClusterInfoList> clusterInfoList = null;

    public RetryTaskRequestBodyClusterScanInfo withRangeType(String rangeType) {
        this.rangeType = rangeType;
        return this;
    }

    /**
     * **参数解释**： 重新扫描的范围 **约束限制**: 必填 **取值范围**: - all_failed_cluster：任务下所有扫描失败的集群。 - specific_cluster：任务下指定扫描失败的集群。  **默认取值**: 不涉及 
     * @return rangeType
     */
    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }

    public RetryTaskRequestBodyClusterScanInfo withClusterInfoList(
        List<RetryTaskRequestBodyClusterScanInfoClusterInfoList> clusterInfoList) {
        this.clusterInfoList = clusterInfoList;
        return this;
    }

    public RetryTaskRequestBodyClusterScanInfo addClusterInfoListItem(
        RetryTaskRequestBodyClusterScanInfoClusterInfoList clusterInfoListItem) {
        if (this.clusterInfoList == null) {
            this.clusterInfoList = new ArrayList<>();
        }
        this.clusterInfoList.add(clusterInfoListItem);
        return this;
    }

    public RetryTaskRequestBodyClusterScanInfo withClusterInfoList(
        Consumer<List<RetryTaskRequestBodyClusterScanInfoClusterInfoList>> clusterInfoListSetter) {
        if (this.clusterInfoList == null) {
            this.clusterInfoList = new ArrayList<>();
        }
        clusterInfoListSetter.accept(this.clusterInfoList);
        return this;
    }

    /**
     * **参数解释**： 扫描范围为specific_cluster时用于指定重新扫描的集群范围 **约束限制**: 不涉及 **取值范围**: 最小值1，最大值200 
     * @return clusterInfoList
     */
    public List<RetryTaskRequestBodyClusterScanInfoClusterInfoList> getClusterInfoList() {
        return clusterInfoList;
    }

    public void setClusterInfoList(List<RetryTaskRequestBodyClusterScanInfoClusterInfoList> clusterInfoList) {
        this.clusterInfoList = clusterInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryTaskRequestBodyClusterScanInfo that = (RetryTaskRequestBodyClusterScanInfo) obj;
        return Objects.equals(this.rangeType, that.rangeType)
            && Objects.equals(this.clusterInfoList, that.clusterInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rangeType, clusterInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryTaskRequestBodyClusterScanInfo {\n");
        sb.append("    rangeType: ").append(toIndentedString(rangeType)).append("\n");
        sb.append("    clusterInfoList: ").append(toIndentedString(clusterInfoList)).append("\n");
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
