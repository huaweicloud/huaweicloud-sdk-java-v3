package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MultiTaskInitBody
 */
public class MultiTaskInitBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_info")

    private MultiTaskInitBodyExtInfo extInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_datasource_id")

    private String sourceDatasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_datasource_id")

    private String targetDatasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_mapping")

    private Boolean autoMapping;

    public MultiTaskInitBody withExtInfo(MultiTaskInitBodyExtInfo extInfo) {
        this.extInfo = extInfo;
        return this;
    }

    public MultiTaskInitBody withExtInfo(Consumer<MultiTaskInitBodyExtInfo> extInfoSetter) {
        if (this.extInfo == null) {
            this.extInfo = new MultiTaskInitBodyExtInfo();
            extInfoSetter.accept(this.extInfo);
        }

        return this;
    }

    /**
     * Get extInfo
     * @return extInfo
     */
    public MultiTaskInitBodyExtInfo getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(MultiTaskInitBodyExtInfo extInfo) {
        this.extInfo = extInfo;
    }

    public MultiTaskInitBody withSourceDatasourceId(String sourceDatasourceId) {
        this.sourceDatasourceId = sourceDatasourceId;
        return this;
    }

    /**
     * 源端数据源ID
     * @return sourceDatasourceId
     */
    public String getSourceDatasourceId() {
        return sourceDatasourceId;
    }

    public void setSourceDatasourceId(String sourceDatasourceId) {
        this.sourceDatasourceId = sourceDatasourceId;
    }

    public MultiTaskInitBody withTargetDatasourceId(String targetDatasourceId) {
        this.targetDatasourceId = targetDatasourceId;
        return this;
    }

    /**
     * 目标端数据源ID
     * @return targetDatasourceId
     */
    public String getTargetDatasourceId() {
        return targetDatasourceId;
    }

    public void setTargetDatasourceId(String targetDatasourceId) {
        this.targetDatasourceId = targetDatasourceId;
    }

    public MultiTaskInitBody withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID，可以为空，为空时自动分配任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public MultiTaskInitBody withAutoMapping(Boolean autoMapping) {
        this.autoMapping = autoMapping;
        return this;
    }

    /**
     * 是否自动建立源端到目标端映射
     * @return autoMapping
     */
    public Boolean getAutoMapping() {
        return autoMapping;
    }

    public void setAutoMapping(Boolean autoMapping) {
        this.autoMapping = autoMapping;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiTaskInitBody multiTaskInitBody = (MultiTaskInitBody) o;
        return Objects.equals(this.extInfo, multiTaskInitBody.extInfo)
            && Objects.equals(this.sourceDatasourceId, multiTaskInitBody.sourceDatasourceId)
            && Objects.equals(this.targetDatasourceId, multiTaskInitBody.targetDatasourceId)
            && Objects.equals(this.taskId, multiTaskInitBody.taskId)
            && Objects.equals(this.autoMapping, multiTaskInitBody.autoMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extInfo, sourceDatasourceId, targetDatasourceId, taskId, autoMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiTaskInitBody {\n");
        sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
        sb.append("    sourceDatasourceId: ").append(toIndentedString(sourceDatasourceId)).append("\n");
        sb.append("    targetDatasourceId: ").append(toIndentedString(targetDatasourceId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    autoMapping: ").append(toIndentedString(autoMapping)).append("\n");
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
