package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_data_type")

    private String sourceDataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_name")

    private String cameraName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_state")

    private String taskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_id")

    private String batchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group_id")

    private String videoGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company")

    private String company;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_id")

    private String algId;

    public ListTasksRequest withSourceDataType(String sourceDataType) {
        this.sourceDataType = sourceDataType;
        return this;
    }

    /**
     * 任务类型，用作查询过滤。仅支持async_task与sync_task两种类型。
     * @return sourceDataType
     */
    public String getSourceDataType() {
        return sourceDataType;
    }

    public void setSourceDataType(String sourceDataType) {
        this.sourceDataType = sourceDataType;
    }

    public ListTasksRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 算法中文名,需要满足正则表达式^[a-zA-Z0-9\\u4e00-\\u9fa5-_\\,]{2,64}$
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ListTasksRequest withCameraName(String cameraName) {
        this.cameraName = cameraName;
        return this;
    }

    /**
     * 摄像头名称
     * @return cameraName
     */
    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public ListTasksRequest withTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * 任务状态,状态可选PENDING|RECOVERING|STARTING|UPGRADING|CREATE_FAILED|START_FAILED|RUNNING|STOPPING|STOPPED|ABNORMAL|SUCCEEDED|FAILED|DELETING|FREEZING|FROZEN|SCHEDULING|LACK_OF_RESOURCES
     * @return taskState
     */
    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public ListTasksRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListTasksRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 5
     * maximum: 1000
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListTasksRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 偏移量
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListTasksRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 展示服务任务时的排序规则
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListTasksRequest withBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    /**
     * 批量配置ID，需要满足正则表达式^[a-z0-9-_]{4,36}$
     * @return batchId
     */
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public ListTasksRequest withVideoGroupId(String videoGroupId) {
        this.videoGroupId = videoGroupId;
        return this;
    }

    /**
     * 视频分组ID（多个ID英文逗号分隔拼接）,长度要求[4,2048]
     * @return videoGroupId
     */
    public String getVideoGroupId() {
        return videoGroupId;
    }

    public void setVideoGroupId(String videoGroupId) {
        this.videoGroupId = videoGroupId;
    }

    public ListTasksRequest withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * 厂商（多选时逗号分隔拼接）
     * @return company
     */
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public ListTasksRequest withAlgId(String algId) {
        this.algId = algId;
        return this;
    }

    /**
     * 算法ID，需要满足正则表达式^[0-9a-f]{8}-[0-9a-f]{4}-[4][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$
     * @return algId
     */
    public String getAlgId() {
        return algId;
    }

    public void setAlgId(String algId) {
        this.algId = algId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTasksRequest that = (ListTasksRequest) obj;
        return Objects.equals(this.sourceDataType, that.sourceDataType) && Objects.equals(this.title, that.title)
            && Objects.equals(this.cameraName, that.cameraName) && Objects.equals(this.taskState, that.taskState)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.page, that.page) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.batchId, that.batchId) && Objects.equals(this.videoGroupId, that.videoGroupId)
            && Objects.equals(this.company, that.company) && Objects.equals(this.algId, that.algId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDataType,
            title,
            cameraName,
            taskState,
            taskName,
            pageSize,
            page,
            sortDir,
            batchId,
            videoGroupId,
            company,
            algId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksRequest {\n");
        sb.append("    sourceDataType: ").append(toIndentedString(sourceDataType)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    cameraName: ").append(toIndentedString(cameraName)).append("\n");
        sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
        sb.append("    videoGroupId: ").append(toIndentedString(videoGroupId)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    algId: ").append(toIndentedString(algId)).append("\n");
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
