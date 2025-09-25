package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建集群扫描任务的参数，任务类型为“cluster_scan”时必传
 */
public class CreateTaskRequestBodyClusterScanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type_list")

    private List<String> scanTypeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_type")

    private String rangeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id_list")

    private List<String> clusterIdList = null;

    public CreateTaskRequestBodyClusterScanInfo withScanTypeList(List<String> scanTypeList) {
        this.scanTypeList = scanTypeList;
        return this;
    }

    public CreateTaskRequestBodyClusterScanInfo addScanTypeListItem(String scanTypeListItem) {
        if (this.scanTypeList == null) {
            this.scanTypeList = new ArrayList<>();
        }
        this.scanTypeList.add(scanTypeListItem);
        return this;
    }

    public CreateTaskRequestBodyClusterScanInfo withScanTypeList(Consumer<List<String>> scanTypeListSetter) {
        if (this.scanTypeList == null) {
            this.scanTypeList = new ArrayList<>();
        }
        scanTypeListSetter.accept(this.scanTypeList);
        return this;
    }

    /**
     * **参数解释**: 扫描项类型列表 **约束限制**: 不涉及 **取值范围**: - cluster_vul：集群漏洞 - risk_assessment：风险评估 - benchmark：安全合规  **默认取值**: 不涉及 
     * @return scanTypeList
     */
    public List<String> getScanTypeList() {
        return scanTypeList;
    }

    public void setScanTypeList(List<String> scanTypeList) {
        this.scanTypeList = scanTypeList;
    }

    public CreateTaskRequestBodyClusterScanInfo withRangeType(String rangeType) {
        this.rangeType = rangeType;
        return this;
    }

    /**
     * 扫描范围类型，包含如下   - all_cluster：扫描所有符合扫描条件的集群   - specific_cluster: 扫描指定集群
     * @return rangeType
     */
    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }

    public CreateTaskRequestBodyClusterScanInfo withClusterIdList(List<String> clusterIdList) {
        this.clusterIdList = clusterIdList;
        return this;
    }

    public CreateTaskRequestBodyClusterScanInfo addClusterIdListItem(String clusterIdListItem) {
        if (this.clusterIdList == null) {
            this.clusterIdList = new ArrayList<>();
        }
        this.clusterIdList.add(clusterIdListItem);
        return this;
    }

    public CreateTaskRequestBodyClusterScanInfo withClusterIdList(Consumer<List<String>> clusterIdListSetter) {
        if (this.clusterIdList == null) {
            this.clusterIdList = new ArrayList<>();
        }
        clusterIdListSetter.accept(this.clusterIdList);
        return this;
    }

    /**
     * 需要扫描的集群id列表，扫描范围类型为“specific_cluster”时必传
     * @return clusterIdList
     */
    public List<String> getClusterIdList() {
        return clusterIdList;
    }

    public void setClusterIdList(List<String> clusterIdList) {
        this.clusterIdList = clusterIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTaskRequestBodyClusterScanInfo that = (CreateTaskRequestBodyClusterScanInfo) obj;
        return Objects.equals(this.scanTypeList, that.scanTypeList) && Objects.equals(this.rangeType, that.rangeType)
            && Objects.equals(this.clusterIdList, that.clusterIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanTypeList, rangeType, clusterIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTaskRequestBodyClusterScanInfo {\n");
        sb.append("    scanTypeList: ").append(toIndentedString(scanTypeList)).append("\n");
        sb.append("    rangeType: ").append(toIndentedString(rangeType)).append("\n");
        sb.append("    clusterIdList: ").append(toIndentedString(clusterIdList)).append("\n");
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
