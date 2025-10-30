package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RetryTaskRequestBodyClusterScanInfoClusterInfoList
 */
public class RetryTaskRequestBodyClusterScanInfoClusterInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type_list")

    private List<String> scanTypeList = null;

    public RetryTaskRequestBodyClusterScanInfoClusterInfoList withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**: 集群id **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public RetryTaskRequestBodyClusterScanInfoClusterInfoList withScanTypeList(List<String> scanTypeList) {
        this.scanTypeList = scanTypeList;
        return this;
    }

    public RetryTaskRequestBodyClusterScanInfoClusterInfoList addScanTypeListItem(String scanTypeListItem) {
        if (this.scanTypeList == null) {
            this.scanTypeList = new ArrayList<>();
        }
        this.scanTypeList.add(scanTypeListItem);
        return this;
    }

    public RetryTaskRequestBodyClusterScanInfoClusterInfoList withScanTypeList(
        Consumer<List<String>> scanTypeListSetter) {
        if (this.scanTypeList == null) {
            this.scanTypeList = new ArrayList<>();
        }
        scanTypeListSetter.accept(this.scanTypeList);
        return this;
    }

    /**
     * **参数解释**： 该集群重新扫描的扫描项列表，若不指定则重新扫描集群下所有扫描失败的扫描项 **约束限制**: 不涉及 **取值范围**: 最小值1，最大值3 
     * @return scanTypeList
     */
    public List<String> getScanTypeList() {
        return scanTypeList;
    }

    public void setScanTypeList(List<String> scanTypeList) {
        this.scanTypeList = scanTypeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryTaskRequestBodyClusterScanInfoClusterInfoList that =
            (RetryTaskRequestBodyClusterScanInfoClusterInfoList) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.scanTypeList, that.scanTypeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, scanTypeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryTaskRequestBodyClusterScanInfoClusterInfoList {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    scanTypeList: ").append(toIndentedString(scanTypeList)).append("\n");
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
