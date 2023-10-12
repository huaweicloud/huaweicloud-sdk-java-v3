package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 升级任务详情。
 */
public class GetUpgradeDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agencyName")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageInfo")

    private GetTargetImageIdDetail imageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalNodes")

    private String totalNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completedNodes")

    private String completedNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentNodeName")

    private String currentNodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executeTimes")

    private String executeTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrateParam")

    private String migrateParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finalAzInfoMap")

    private String finalAzInfoMap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentNodeDetail")

    private List<CurrentNodeDetail> currentNodeDetail = null;

    public GetUpgradeDetailInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetUpgradeDetailInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 升级开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public GetUpgradeDetailInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 升级结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public GetUpgradeDetailInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。 - RUNNING：升级中。 - SUCCESS：升级成功。 - FAILED：升级失败。 - PARTIAL_FAILED：部分升级失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetUpgradeDetailInfo withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称，委托给CSS，允许CSS调用您的其他云服务。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public GetUpgradeDetailInfo withImageInfo(GetTargetImageIdDetail imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    public GetUpgradeDetailInfo withImageInfo(Consumer<GetTargetImageIdDetail> imageInfoSetter) {
        if (this.imageInfo == null) {
            this.imageInfo = new GetTargetImageIdDetail();
            imageInfoSetter.accept(this.imageInfo);
        }

        return this;
    }

    /**
     * Get imageInfo
     * @return imageInfo
     */
    public GetTargetImageIdDetail getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(GetTargetImageIdDetail imageInfo) {
        this.imageInfo = imageInfo;
    }

    public GetUpgradeDetailInfo withTotalNodes(String totalNodes) {
        this.totalNodes = totalNodes;
        return this;
    }

    /**
     * 所有需要升级的节点名称集合。
     * @return totalNodes
     */
    public String getTotalNodes() {
        return totalNodes;
    }

    public void setTotalNodes(String totalNodes) {
        this.totalNodes = totalNodes;
    }

    public GetUpgradeDetailInfo withCompletedNodes(String completedNodes) {
        this.completedNodes = completedNodes;
        return this;
    }

    /**
     * 所有升级完成的节点名称集合。
     * @return completedNodes
     */
    public String getCompletedNodes() {
        return completedNodes;
    }

    public void setCompletedNodes(String completedNodes) {
        this.completedNodes = completedNodes;
    }

    public GetUpgradeDetailInfo withCurrentNodeName(String currentNodeName) {
        this.currentNodeName = currentNodeName;
        return this;
    }

    /**
     * 当前正在升级的节点名称。
     * @return currentNodeName
     */
    public String getCurrentNodeName() {
        return currentNodeName;
    }

    public void setCurrentNodeName(String currentNodeName) {
        this.currentNodeName = currentNodeName;
    }

    public GetUpgradeDetailInfo withExecuteTimes(String executeTimes) {
        this.executeTimes = executeTimes;
        return this;
    }

    /**
     * 重试次数。
     * @return executeTimes
     */
    public String getExecuteTimes() {
        return executeTimes;
    }

    public void setExecuteTimes(String executeTimes) {
        this.executeTimes = executeTimes;
    }

    public GetUpgradeDetailInfo withMigrateParam(String migrateParam) {
        this.migrateParam = migrateParam;
        return this;
    }

    /**
     * 集群当前升级的行为。当有query参数时显示该返回值。
     * @return migrateParam
     */
    public String getMigrateParam() {
        return migrateParam;
    }

    public void setMigrateParam(String migrateParam) {
        this.migrateParam = migrateParam;
    }

    public GetUpgradeDetailInfo withFinalAzInfoMap(String finalAzInfoMap) {
        this.finalAzInfoMap = finalAzInfoMap;
        return this;
    }

    /**
     * 集群升级预期结果。当有query参数时显示该返回值。
     * @return finalAzInfoMap
     */
    public String getFinalAzInfoMap() {
        return finalAzInfoMap;
    }

    public void setFinalAzInfoMap(String finalAzInfoMap) {
        this.finalAzInfoMap = finalAzInfoMap;
    }

    public GetUpgradeDetailInfo withCurrentNodeDetail(List<CurrentNodeDetail> currentNodeDetail) {
        this.currentNodeDetail = currentNodeDetail;
        return this;
    }

    public GetUpgradeDetailInfo addCurrentNodeDetailItem(CurrentNodeDetail currentNodeDetailItem) {
        if (this.currentNodeDetail == null) {
            this.currentNodeDetail = new ArrayList<>();
        }
        this.currentNodeDetail.add(currentNodeDetailItem);
        return this;
    }

    public GetUpgradeDetailInfo withCurrentNodeDetail(Consumer<List<CurrentNodeDetail>> currentNodeDetailSetter) {
        if (this.currentNodeDetail == null) {
            this.currentNodeDetail = new ArrayList<>();
        }
        currentNodeDetailSetter.accept(this.currentNodeDetail);
        return this;
    }

    /**
     * Get currentNodeDetail
     * @return currentNodeDetail
     */
    public List<CurrentNodeDetail> getCurrentNodeDetail() {
        return currentNodeDetail;
    }

    public void setCurrentNodeDetail(List<CurrentNodeDetail> currentNodeDetail) {
        this.currentNodeDetail = currentNodeDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetUpgradeDetailInfo that = (GetUpgradeDetailInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.imageInfo, that.imageInfo)
            && Objects.equals(this.totalNodes, that.totalNodes)
            && Objects.equals(this.completedNodes, that.completedNodes)
            && Objects.equals(this.currentNodeName, that.currentNodeName)
            && Objects.equals(this.executeTimes, that.executeTimes)
            && Objects.equals(this.migrateParam, that.migrateParam)
            && Objects.equals(this.finalAzInfoMap, that.finalAzInfoMap)
            && Objects.equals(this.currentNodeDetail, that.currentNodeDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            startTime,
            endTime,
            status,
            agencyName,
            imageInfo,
            totalNodes,
            completedNodes,
            currentNodeName,
            executeTimes,
            migrateParam,
            finalAzInfoMap,
            currentNodeDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUpgradeDetailInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
        sb.append("    totalNodes: ").append(toIndentedString(totalNodes)).append("\n");
        sb.append("    completedNodes: ").append(toIndentedString(completedNodes)).append("\n");
        sb.append("    currentNodeName: ").append(toIndentedString(currentNodeName)).append("\n");
        sb.append("    executeTimes: ").append(toIndentedString(executeTimes)).append("\n");
        sb.append("    migrateParam: ").append(toIndentedString(migrateParam)).append("\n");
        sb.append("    finalAzInfoMap: ").append(toIndentedString(finalAzInfoMap)).append("\n");
        sb.append("    currentNodeDetail: ").append(toIndentedString(currentNodeDetail)).append("\n");
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
