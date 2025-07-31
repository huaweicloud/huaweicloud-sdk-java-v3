package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群扫描任务特有的任务信息
 */
public class ListTasksResponseInfoClusterScanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type_list")

    private List<String> scanTypeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanning_cluster_num")

    private Integer scanningClusterNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_cluster_num")

    private Integer successClusterNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_cluster_num")

    private Integer failedClusterNum;

    public ListTasksResponseInfoClusterScanInfo withScanTypeList(List<String> scanTypeList) {
        this.scanTypeList = scanTypeList;
        return this;
    }

    public ListTasksResponseInfoClusterScanInfo addScanTypeListItem(String scanTypeListItem) {
        if (this.scanTypeList == null) {
            this.scanTypeList = new ArrayList<>();
        }
        this.scanTypeList.add(scanTypeListItem);
        return this;
    }

    public ListTasksResponseInfoClusterScanInfo withScanTypeList(Consumer<List<String>> scanTypeListSetter) {
        if (this.scanTypeList == null) {
            this.scanTypeList = new ArrayList<>();
        }
        scanTypeListSetter.accept(this.scanTypeList);
        return this;
    }

    /**
     * 本次扫描任务涉及的扫描项类型列表
     * @return scanTypeList
     */
    public List<String> getScanTypeList() {
        return scanTypeList;
    }

    public void setScanTypeList(List<String> scanTypeList) {
        this.scanTypeList = scanTypeList;
    }

    public ListTasksResponseInfoClusterScanInfo withScanningClusterNum(Integer scanningClusterNum) {
        this.scanningClusterNum = scanningClusterNum;
        return this;
    }

    /**
     * 当前任务处于扫描中的集群数量
     * minimum: 0
     * maximum: 2000000
     * @return scanningClusterNum
     */
    public Integer getScanningClusterNum() {
        return scanningClusterNum;
    }

    public void setScanningClusterNum(Integer scanningClusterNum) {
        this.scanningClusterNum = scanningClusterNum;
    }

    public ListTasksResponseInfoClusterScanInfo withSuccessClusterNum(Integer successClusterNum) {
        this.successClusterNum = successClusterNum;
        return this;
    }

    /**
     * 当前任务扫描成功的集群数量
     * minimum: 0
     * maximum: 2000000
     * @return successClusterNum
     */
    public Integer getSuccessClusterNum() {
        return successClusterNum;
    }

    public void setSuccessClusterNum(Integer successClusterNum) {
        this.successClusterNum = successClusterNum;
    }

    public ListTasksResponseInfoClusterScanInfo withFailedClusterNum(Integer failedClusterNum) {
        this.failedClusterNum = failedClusterNum;
        return this;
    }

    /**
     * 当前任务扫描失败的集群数量
     * minimum: 0
     * maximum: 2000000
     * @return failedClusterNum
     */
    public Integer getFailedClusterNum() {
        return failedClusterNum;
    }

    public void setFailedClusterNum(Integer failedClusterNum) {
        this.failedClusterNum = failedClusterNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTasksResponseInfoClusterScanInfo that = (ListTasksResponseInfoClusterScanInfo) obj;
        return Objects.equals(this.scanTypeList, that.scanTypeList)
            && Objects.equals(this.scanningClusterNum, that.scanningClusterNum)
            && Objects.equals(this.successClusterNum, that.successClusterNum)
            && Objects.equals(this.failedClusterNum, that.failedClusterNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanTypeList, scanningClusterNum, successClusterNum, failedClusterNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksResponseInfoClusterScanInfo {\n");
        sb.append("    scanTypeList: ").append(toIndentedString(scanTypeList)).append("\n");
        sb.append("    scanningClusterNum: ").append(toIndentedString(scanningClusterNum)).append("\n");
        sb.append("    successClusterNum: ").append(toIndentedString(successClusterNum)).append("\n");
        sb.append("    failedClusterNum: ").append(toIndentedString(failedClusterNum)).append("\n");
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
