package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MultiTaskInitElement
 */
public class MultiTaskInitElement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_info")

    private MultiTaskInitElementExtInfo extInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_datasource_id")

    private String sourceDatasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_datasource_id")

    private String targetDatasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_group")

    private String sourceGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_group")

    private String targetGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ds_id")

    private String sourceDsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_ds_id")

    private String targetDsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_id")

    private String targetInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_app_id")

    private String sourceAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_app_id")

    private String targetAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_datasource_name")

    private String sourceDatasourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_datasource_name")

    private String targetDatasourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_datasource_type")

    private String sourceDatasourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_datasource_type")

    private String targetDatasourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mappings")

    private List<MultiTaskMappingElement> mappings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mappings_total_count")

    private Long mappingsTotalCount;

    public MultiTaskInitElement withExtInfo(MultiTaskInitElementExtInfo extInfo) {
        this.extInfo = extInfo;
        return this;
    }

    public MultiTaskInitElement withExtInfo(Consumer<MultiTaskInitElementExtInfo> extInfoSetter) {
        if (this.extInfo == null) {
            this.extInfo = new MultiTaskInitElementExtInfo();
            extInfoSetter.accept(this.extInfo);
        }

        return this;
    }

    /**
     * Get extInfo
     * @return extInfo
     */
    public MultiTaskInitElementExtInfo getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(MultiTaskInitElementExtInfo extInfo) {
        this.extInfo = extInfo;
    }

    public MultiTaskInitElement withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public MultiTaskInitElement withSourceDatasourceId(String sourceDatasourceId) {
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

    public MultiTaskInitElement withTargetDatasourceId(String targetDatasourceId) {
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

    public MultiTaskInitElement withSourceGroup(String sourceGroup) {
        this.sourceGroup = sourceGroup;
        return this;
    }

    /**
     * 源端组
     * @return sourceGroup
     */
    public String getSourceGroup() {
        return sourceGroup;
    }

    public void setSourceGroup(String sourceGroup) {
        this.sourceGroup = sourceGroup;
    }

    public MultiTaskInitElement withTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
        return this;
    }

    /**
     * 目标端组
     * @return targetGroup
     */
    public String getTargetGroup() {
        return targetGroup;
    }

    public void setTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
    }

    public MultiTaskInitElement withSourceDsId(String sourceDsId) {
        this.sourceDsId = sourceDsId;
        return this;
    }

    /**
     * 源端数据源ID
     * @return sourceDsId
     */
    public String getSourceDsId() {
        return sourceDsId;
    }

    public void setSourceDsId(String sourceDsId) {
        this.sourceDsId = sourceDsId;
    }

    public MultiTaskInitElement withTargetDsId(String targetDsId) {
        this.targetDsId = targetDsId;
        return this;
    }

    /**
     * 目标端数据源ID
     * @return targetDsId
     */
    public String getTargetDsId() {
        return targetDsId;
    }

    public void setTargetDsId(String targetDsId) {
        this.targetDsId = targetDsId;
    }

    public MultiTaskInitElement withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * 源端实例ID
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    public MultiTaskInitElement withTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    /**
     * 目标端实例ID
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public void setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
    }

    public MultiTaskInitElement withSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
        return this;
    }

    /**
     * 源端数据源所属集成应用ID
     * @return sourceAppId
     */
    public String getSourceAppId() {
        return sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

    public MultiTaskInitElement withTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
        return this;
    }

    /**
     * 目标端数据源所属集成应用ID
     * @return targetAppId
     */
    public String getTargetAppId() {
        return targetAppId;
    }

    public void setTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
    }

    public MultiTaskInitElement withSourceDatasourceName(String sourceDatasourceName) {
        this.sourceDatasourceName = sourceDatasourceName;
        return this;
    }

    /**
     * 源端数据源的名称
     * @return sourceDatasourceName
     */
    public String getSourceDatasourceName() {
        return sourceDatasourceName;
    }

    public void setSourceDatasourceName(String sourceDatasourceName) {
        this.sourceDatasourceName = sourceDatasourceName;
    }

    public MultiTaskInitElement withTargetDatasourceName(String targetDatasourceName) {
        this.targetDatasourceName = targetDatasourceName;
        return this;
    }

    /**
     * 目标端数据源的名称
     * @return targetDatasourceName
     */
    public String getTargetDatasourceName() {
        return targetDatasourceName;
    }

    public void setTargetDatasourceName(String targetDatasourceName) {
        this.targetDatasourceName = targetDatasourceName;
    }

    public MultiTaskInitElement withSourceDatasourceType(String sourceDatasourceType) {
        this.sourceDatasourceType = sourceDatasourceType;
        return this;
    }

    /**
     * 源端数据源的类型
     * @return sourceDatasourceType
     */
    public String getSourceDatasourceType() {
        return sourceDatasourceType;
    }

    public void setSourceDatasourceType(String sourceDatasourceType) {
        this.sourceDatasourceType = sourceDatasourceType;
    }

    public MultiTaskInitElement withTargetDatasourceType(String targetDatasourceType) {
        this.targetDatasourceType = targetDatasourceType;
        return this;
    }

    /**
     * 目标端数据源的类型
     * @return targetDatasourceType
     */
    public String getTargetDatasourceType() {
        return targetDatasourceType;
    }

    public void setTargetDatasourceType(String targetDatasourceType) {
        this.targetDatasourceType = targetDatasourceType;
    }

    public MultiTaskInitElement withMappings(List<MultiTaskMappingElement> mappings) {
        this.mappings = mappings;
        return this;
    }

    public MultiTaskInitElement addMappingsItem(MultiTaskMappingElement mappingsItem) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        this.mappings.add(mappingsItem);
        return this;
    }

    public MultiTaskInitElement withMappings(Consumer<List<MultiTaskMappingElement>> mappingsSetter) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        mappingsSetter.accept(this.mappings);
        return this;
    }

    /**
     * 映射关系列表，只返回前10条
     * @return mappings
     */
    public List<MultiTaskMappingElement> getMappings() {
        return mappings;
    }

    public void setMappings(List<MultiTaskMappingElement> mappings) {
        this.mappings = mappings;
    }

    public MultiTaskInitElement withMappingsTotalCount(Long mappingsTotalCount) {
        this.mappingsTotalCount = mappingsTotalCount;
        return this;
    }

    /**
     * 映射关系总数
     * minimum: 0
     * maximum: 1000000
     * @return mappingsTotalCount
     */
    public Long getMappingsTotalCount() {
        return mappingsTotalCount;
    }

    public void setMappingsTotalCount(Long mappingsTotalCount) {
        this.mappingsTotalCount = mappingsTotalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiTaskInitElement multiTaskInitElement = (MultiTaskInitElement) o;
        return Objects.equals(this.extInfo, multiTaskInitElement.extInfo)
            && Objects.equals(this.taskId, multiTaskInitElement.taskId)
            && Objects.equals(this.sourceDatasourceId, multiTaskInitElement.sourceDatasourceId)
            && Objects.equals(this.targetDatasourceId, multiTaskInitElement.targetDatasourceId)
            && Objects.equals(this.sourceGroup, multiTaskInitElement.sourceGroup)
            && Objects.equals(this.targetGroup, multiTaskInitElement.targetGroup)
            && Objects.equals(this.sourceDsId, multiTaskInitElement.sourceDsId)
            && Objects.equals(this.targetDsId, multiTaskInitElement.targetDsId)
            && Objects.equals(this.sourceInstanceId, multiTaskInitElement.sourceInstanceId)
            && Objects.equals(this.targetInstanceId, multiTaskInitElement.targetInstanceId)
            && Objects.equals(this.sourceAppId, multiTaskInitElement.sourceAppId)
            && Objects.equals(this.targetAppId, multiTaskInitElement.targetAppId)
            && Objects.equals(this.sourceDatasourceName, multiTaskInitElement.sourceDatasourceName)
            && Objects.equals(this.targetDatasourceName, multiTaskInitElement.targetDatasourceName)
            && Objects.equals(this.sourceDatasourceType, multiTaskInitElement.sourceDatasourceType)
            && Objects.equals(this.targetDatasourceType, multiTaskInitElement.targetDatasourceType)
            && Objects.equals(this.mappings, multiTaskInitElement.mappings)
            && Objects.equals(this.mappingsTotalCount, multiTaskInitElement.mappingsTotalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extInfo,
            taskId,
            sourceDatasourceId,
            targetDatasourceId,
            sourceGroup,
            targetGroup,
            sourceDsId,
            targetDsId,
            sourceInstanceId,
            targetInstanceId,
            sourceAppId,
            targetAppId,
            sourceDatasourceName,
            targetDatasourceName,
            sourceDatasourceType,
            targetDatasourceType,
            mappings,
            mappingsTotalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiTaskInitElement {\n");
        sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    sourceDatasourceId: ").append(toIndentedString(sourceDatasourceId)).append("\n");
        sb.append("    targetDatasourceId: ").append(toIndentedString(targetDatasourceId)).append("\n");
        sb.append("    sourceGroup: ").append(toIndentedString(sourceGroup)).append("\n");
        sb.append("    targetGroup: ").append(toIndentedString(targetGroup)).append("\n");
        sb.append("    sourceDsId: ").append(toIndentedString(sourceDsId)).append("\n");
        sb.append("    targetDsId: ").append(toIndentedString(targetDsId)).append("\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    sourceAppId: ").append(toIndentedString(sourceAppId)).append("\n");
        sb.append("    targetAppId: ").append(toIndentedString(targetAppId)).append("\n");
        sb.append("    sourceDatasourceName: ").append(toIndentedString(sourceDatasourceName)).append("\n");
        sb.append("    targetDatasourceName: ").append(toIndentedString(targetDatasourceName)).append("\n");
        sb.append("    sourceDatasourceType: ").append(toIndentedString(sourceDatasourceType)).append("\n");
        sb.append("    targetDatasourceType: ").append(toIndentedString(targetDatasourceType)).append("\n");
        sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
        sb.append("    mappingsTotalCount: ").append(toIndentedString(mappingsTotalCount)).append("\n");
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
