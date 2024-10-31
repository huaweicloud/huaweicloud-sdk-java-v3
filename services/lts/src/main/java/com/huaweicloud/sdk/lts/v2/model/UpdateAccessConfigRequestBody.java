package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改日志接入请求体
 */
public class UpdateAccessConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_id")

    private String accessConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_detail")

    private AccessConfigDeatilUpdate accessConfigDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_info")

    private AccessConfigHostGroupIdList hostGroupInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_tag")

    private List<AccessConfigTag> accessConfigTag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_split")

    private Boolean logSplit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binary_collect")

    private Boolean binaryCollect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incremental_collect")

    private Boolean incrementalCollect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding_format")

    private String encodingFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processor_type")

    private String processorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demo_log")

    private String demoLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demo_fields")

    private List<DemoFieldAccess> demoFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processors")

    private List<Processor> processors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private List<String> componentId = null;

    public UpdateAccessConfigRequestBody withAccessConfigId(String accessConfigId) {
        this.accessConfigId = accessConfigId;
        return this;
    }

    /**
     * 日志接入ID
     * @return accessConfigId
     */
    public String getAccessConfigId() {
        return accessConfigId;
    }

    public void setAccessConfigId(String accessConfigId) {
        this.accessConfigId = accessConfigId;
    }

    public UpdateAccessConfigRequestBody withAccessConfigDetail(AccessConfigDeatilUpdate accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
        return this;
    }

    public UpdateAccessConfigRequestBody withAccessConfigDetail(
        Consumer<AccessConfigDeatilUpdate> accessConfigDetailSetter) {
        if (this.accessConfigDetail == null) {
            this.accessConfigDetail = new AccessConfigDeatilUpdate();
            accessConfigDetailSetter.accept(this.accessConfigDetail);
        }

        return this;
    }

    /**
     * Get accessConfigDetail
     * @return accessConfigDetail
     */
    public AccessConfigDeatilUpdate getAccessConfigDetail() {
        return accessConfigDetail;
    }

    public void setAccessConfigDetail(AccessConfigDeatilUpdate accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
    }

    public UpdateAccessConfigRequestBody withHostGroupInfo(AccessConfigHostGroupIdList hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
        return this;
    }

    public UpdateAccessConfigRequestBody withHostGroupInfo(Consumer<AccessConfigHostGroupIdList> hostGroupInfoSetter) {
        if (this.hostGroupInfo == null) {
            this.hostGroupInfo = new AccessConfigHostGroupIdList();
            hostGroupInfoSetter.accept(this.hostGroupInfo);
        }

        return this;
    }

    /**
     * Get hostGroupInfo
     * @return hostGroupInfo
     */
    public AccessConfigHostGroupIdList getHostGroupInfo() {
        return hostGroupInfo;
    }

    public void setHostGroupInfo(AccessConfigHostGroupIdList hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
    }

    public UpdateAccessConfigRequestBody withAccessConfigTag(List<AccessConfigTag> accessConfigTag) {
        this.accessConfigTag = accessConfigTag;
        return this;
    }

    public UpdateAccessConfigRequestBody addAccessConfigTagItem(AccessConfigTag accessConfigTagItem) {
        if (this.accessConfigTag == null) {
            this.accessConfigTag = new ArrayList<>();
        }
        this.accessConfigTag.add(accessConfigTagItem);
        return this;
    }

    public UpdateAccessConfigRequestBody withAccessConfigTag(Consumer<List<AccessConfigTag>> accessConfigTagSetter) {
        if (this.accessConfigTag == null) {
            this.accessConfigTag = new ArrayList<>();
        }
        accessConfigTagSetter.accept(this.accessConfigTag);
        return this;
    }

    /**
     * 标签信息。KEY不能重复,最多20个标签
     * @return accessConfigTag
     */
    public List<AccessConfigTag> getAccessConfigTag() {
        return accessConfigTag;
    }

    public void setAccessConfigTag(List<AccessConfigTag> accessConfigTag) {
        this.accessConfigTag = accessConfigTag;
    }

    public UpdateAccessConfigRequestBody withLogSplit(Boolean logSplit) {
        this.logSplit = logSplit;
        return this;
    }

    /**
     * 日志拆分
     * @return logSplit
     */
    public Boolean getLogSplit() {
        return logSplit;
    }

    public void setLogSplit(Boolean logSplit) {
        this.logSplit = logSplit;
    }

    public UpdateAccessConfigRequestBody withBinaryCollect(Boolean binaryCollect) {
        this.binaryCollect = binaryCollect;
        return this;
    }

    /**
     * 二进制采集
     * @return binaryCollect
     */
    public Boolean getBinaryCollect() {
        return binaryCollect;
    }

    public void setBinaryCollect(Boolean binaryCollect) {
        this.binaryCollect = binaryCollect;
    }

    public UpdateAccessConfigRequestBody withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * CCE集群ID，CCE类型时，为必填
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateAccessConfigRequestBody withIncrementalCollect(Boolean incrementalCollect) {
        this.incrementalCollect = incrementalCollect;
        return this;
    }

    /**
     * 是否增量采集 true为是 false为否（全量采集）
     * @return incrementalCollect
     */
    public Boolean getIncrementalCollect() {
        return incrementalCollect;
    }

    public void setIncrementalCollect(Boolean incrementalCollect) {
        this.incrementalCollect = incrementalCollect;
    }

    public UpdateAccessConfigRequestBody withEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
        return this;
    }

    /**
     * 编码格式，默认UTF-8
     * @return encodingFormat
     */
    public String getEncodingFormat() {
        return encodingFormat;
    }

    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public UpdateAccessConfigRequestBody withProcessorType(String processorType) {
        this.processorType = processorType;
        return this;
    }

    /**
     * IC结构化解析类型
     * @return processorType
     */
    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public UpdateAccessConfigRequestBody withDemoLog(String demoLog) {
        this.demoLog = demoLog;
        return this;
    }

    /**
     * 示例日志
     * @return demoLog
     */
    public String getDemoLog() {
        return demoLog;
    }

    public void setDemoLog(String demoLog) {
        this.demoLog = demoLog;
    }

    public UpdateAccessConfigRequestBody withDemoFields(List<DemoFieldAccess> demoFields) {
        this.demoFields = demoFields;
        return this;
    }

    public UpdateAccessConfigRequestBody addDemoFieldsItem(DemoFieldAccess demoFieldsItem) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        this.demoFields.add(demoFieldsItem);
        return this;
    }

    public UpdateAccessConfigRequestBody withDemoFields(Consumer<List<DemoFieldAccess>> demoFieldsSetter) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        demoFieldsSetter.accept(this.demoFields);
        return this;
    }

    /**
     * 示例日志解析字段
     * @return demoFields
     */
    public List<DemoFieldAccess> getDemoFields() {
        return demoFields;
    }

    public void setDemoFields(List<DemoFieldAccess> demoFields) {
        this.demoFields = demoFields;
    }

    public UpdateAccessConfigRequestBody withProcessors(List<Processor> processors) {
        this.processors = processors;
        return this;
    }

    public UpdateAccessConfigRequestBody addProcessorsItem(Processor processorsItem) {
        if (this.processors == null) {
            this.processors = new ArrayList<>();
        }
        this.processors.add(processorsItem);
        return this;
    }

    public UpdateAccessConfigRequestBody withProcessors(Consumer<List<Processor>> processorsSetter) {
        if (this.processors == null) {
            this.processors = new ArrayList<>();
        }
        processorsSetter.accept(this.processors);
        return this;
    }

    /**
     * IC结构化解析器
     * @return processors
     */
    public List<Processor> getProcessors() {
        return processors;
    }

    public void setProcessors(List<Processor> processors) {
        this.processors = processors;
    }

    public UpdateAccessConfigRequestBody withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * ServiceStage应用ID
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public UpdateAccessConfigRequestBody withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * ServiceStage环境ID
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    public UpdateAccessConfigRequestBody withComponentId(List<String> componentId) {
        this.componentId = componentId;
        return this;
    }

    public UpdateAccessConfigRequestBody addComponentIdItem(String componentIdItem) {
        if (this.componentId == null) {
            this.componentId = new ArrayList<>();
        }
        this.componentId.add(componentIdItem);
        return this;
    }

    public UpdateAccessConfigRequestBody withComponentId(Consumer<List<String>> componentIdSetter) {
        if (this.componentId == null) {
            this.componentId = new ArrayList<>();
        }
        componentIdSetter.accept(this.componentId);
        return this;
    }

    /**
     * ServiceStage组件ID
     * @return componentId
     */
    public List<String> getComponentId() {
        return componentId;
    }

    public void setComponentId(List<String> componentId) {
        this.componentId = componentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAccessConfigRequestBody that = (UpdateAccessConfigRequestBody) obj;
        return Objects.equals(this.accessConfigId, that.accessConfigId)
            && Objects.equals(this.accessConfigDetail, that.accessConfigDetail)
            && Objects.equals(this.hostGroupInfo, that.hostGroupInfo)
            && Objects.equals(this.accessConfigTag, that.accessConfigTag)
            && Objects.equals(this.logSplit, that.logSplit) && Objects.equals(this.binaryCollect, that.binaryCollect)
            && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.incrementalCollect, that.incrementalCollect)
            && Objects.equals(this.encodingFormat, that.encodingFormat)
            && Objects.equals(this.processorType, that.processorType) && Objects.equals(this.demoLog, that.demoLog)
            && Objects.equals(this.demoFields, that.demoFields) && Objects.equals(this.processors, that.processors)
            && Objects.equals(this.applicationId, that.applicationId)
            && Objects.equals(this.environmentId, that.environmentId)
            && Objects.equals(this.componentId, that.componentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessConfigId,
            accessConfigDetail,
            hostGroupInfo,
            accessConfigTag,
            logSplit,
            binaryCollect,
            clusterId,
            incrementalCollect,
            encodingFormat,
            processorType,
            demoLog,
            demoFields,
            processors,
            applicationId,
            environmentId,
            componentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAccessConfigRequestBody {\n");
        sb.append("    accessConfigId: ").append(toIndentedString(accessConfigId)).append("\n");
        sb.append("    accessConfigDetail: ").append(toIndentedString(accessConfigDetail)).append("\n");
        sb.append("    hostGroupInfo: ").append(toIndentedString(hostGroupInfo)).append("\n");
        sb.append("    accessConfigTag: ").append(toIndentedString(accessConfigTag)).append("\n");
        sb.append("    logSplit: ").append(toIndentedString(logSplit)).append("\n");
        sb.append("    binaryCollect: ").append(toIndentedString(binaryCollect)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    incrementalCollect: ").append(toIndentedString(incrementalCollect)).append("\n");
        sb.append("    encodingFormat: ").append(toIndentedString(encodingFormat)).append("\n");
        sb.append("    processorType: ").append(toIndentedString(processorType)).append("\n");
        sb.append("    demoLog: ").append(toIndentedString(demoLog)).append("\n");
        sb.append("    demoFields: ").append(toIndentedString(demoFields)).append("\n");
        sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
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
