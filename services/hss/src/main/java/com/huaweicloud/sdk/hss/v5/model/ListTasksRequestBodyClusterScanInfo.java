package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群扫描任务的参数，任务类型task_type为“cluster_scan”时可传
 */
public class ListTasksRequestBodyClusterScanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type_list")

    private List<String> scanTypeList = null;

    public ListTasksRequestBodyClusterScanInfo withScanTypeList(List<String> scanTypeList) {
        this.scanTypeList = scanTypeList;
        return this;
    }

    public ListTasksRequestBodyClusterScanInfo addScanTypeListItem(String scanTypeListItem) {
        if (this.scanTypeList == null) {
            this.scanTypeList = new ArrayList<>();
        }
        this.scanTypeList.add(scanTypeListItem);
        return this;
    }

    public ListTasksRequestBodyClusterScanInfo withScanTypeList(Consumer<List<String>> scanTypeListSetter) {
        if (this.scanTypeList == null) {
            this.scanTypeList = new ArrayList<>();
        }
        scanTypeListSetter.accept(this.scanTypeList);
        return this;
    }

    /**
     * **参数解释**: 任务扫描项类型列表，若列表不为空则只有扫描了列表中所有扫描项的任务才会被筛选出来；列表为空则不对扫描项类型进行筛选 **约束限制**: 不涉及 **取值范围**: - cluster_vul：集群漏洞 - risk_assessment：风险评估 - benchmark：安全合规  **默认取值**: 不涉及 
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
        ListTasksRequestBodyClusterScanInfo that = (ListTasksRequestBodyClusterScanInfo) obj;
        return Objects.equals(this.scanTypeList, that.scanTypeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanTypeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksRequestBodyClusterScanInfo {\n");
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
