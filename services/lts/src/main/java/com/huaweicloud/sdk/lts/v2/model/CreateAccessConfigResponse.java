package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAccessConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_id")

    private String accessConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_name")

    private String accessConfigName;

    /**
     * 日志接入类型。AGENT：ECS接入  K8S_CCE: CCE接入
     */
    public static final class AccessConfigTypeEnum {

        /**
         * Enum AGENT for value: "AGENT"
         */
        public static final AccessConfigTypeEnum AGENT = new AccessConfigTypeEnum("AGENT");

        /**
         * Enum K8S_CCE for value: "K8S_CCE"
         */
        public static final AccessConfigTypeEnum K8S_CCE = new AccessConfigTypeEnum("K8S_CCE");

        private static final Map<String, AccessConfigTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessConfigTypeEnum> createStaticFields() {
            Map<String, AccessConfigTypeEnum> map = new HashMap<>();
            map.put("AGENT", AGENT);
            map.put("K8S_CCE", K8S_CCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessConfigTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AccessConfigTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessConfigTypeEnum(value));
        }

        public static AccessConfigTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessConfigTypeEnum) {
                return this.value.equals(((AccessConfigTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_type")

    private AccessConfigTypeEnum accessConfigType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_detail")

    private AccessConfigDeatilCreate accessConfigDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_info")

    private AccessConfigQueryLogInfo logInfo;

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
    @JsonProperty(value = "encoding_format")

    private String encodingFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incremental_collect")

    private Boolean incrementalCollect;

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
    @JsonProperty(value = "log_split_size")

    private Integer logSplitSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recursive_depth")

    private Integer recursiveDepth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_type_source")

    private String accessConfigTypeSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_id")

    private String environmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private List<String> componentId = null;

    public CreateAccessConfigResponse withAccessConfigId(String accessConfigId) {
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

    public CreateAccessConfigResponse withAccessConfigName(String accessConfigName) {
        this.accessConfigName = accessConfigName;
        return this;
    }

    /**
     * 日志接入名称
     * @return accessConfigName
     */
    public String getAccessConfigName() {
        return accessConfigName;
    }

    public void setAccessConfigName(String accessConfigName) {
        this.accessConfigName = accessConfigName;
    }

    public CreateAccessConfigResponse withAccessConfigType(AccessConfigTypeEnum accessConfigType) {
        this.accessConfigType = accessConfigType;
        return this;
    }

    /**
     * 日志接入类型。AGENT：ECS接入  K8S_CCE: CCE接入
     * @return accessConfigType
     */
    public AccessConfigTypeEnum getAccessConfigType() {
        return accessConfigType;
    }

    public void setAccessConfigType(AccessConfigTypeEnum accessConfigType) {
        this.accessConfigType = accessConfigType;
    }

    public CreateAccessConfigResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 1
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateAccessConfigResponse withAccessConfigDetail(AccessConfigDeatilCreate accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
        return this;
    }

    public CreateAccessConfigResponse withAccessConfigDetail(
        Consumer<AccessConfigDeatilCreate> accessConfigDetailSetter) {
        if (this.accessConfigDetail == null) {
            this.accessConfigDetail = new AccessConfigDeatilCreate();
            accessConfigDetailSetter.accept(this.accessConfigDetail);
        }

        return this;
    }

    /**
     * Get accessConfigDetail
     * @return accessConfigDetail
     */
    public AccessConfigDeatilCreate getAccessConfigDetail() {
        return accessConfigDetail;
    }

    public void setAccessConfigDetail(AccessConfigDeatilCreate accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
    }

    public CreateAccessConfigResponse withLogInfo(AccessConfigQueryLogInfo logInfo) {
        this.logInfo = logInfo;
        return this;
    }

    public CreateAccessConfigResponse withLogInfo(Consumer<AccessConfigQueryLogInfo> logInfoSetter) {
        if (this.logInfo == null) {
            this.logInfo = new AccessConfigQueryLogInfo();
            logInfoSetter.accept(this.logInfo);
        }

        return this;
    }

    /**
     * Get logInfo
     * @return logInfo
     */
    public AccessConfigQueryLogInfo getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(AccessConfigQueryLogInfo logInfo) {
        this.logInfo = logInfo;
    }

    public CreateAccessConfigResponse withHostGroupInfo(AccessConfigHostGroupIdList hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
        return this;
    }

    public CreateAccessConfigResponse withHostGroupInfo(Consumer<AccessConfigHostGroupIdList> hostGroupInfoSetter) {
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

    public CreateAccessConfigResponse withAccessConfigTag(List<AccessConfigTag> accessConfigTag) {
        this.accessConfigTag = accessConfigTag;
        return this;
    }

    public CreateAccessConfigResponse addAccessConfigTagItem(AccessConfigTag accessConfigTagItem) {
        if (this.accessConfigTag == null) {
            this.accessConfigTag = new ArrayList<>();
        }
        this.accessConfigTag.add(accessConfigTagItem);
        return this;
    }

    public CreateAccessConfigResponse withAccessConfigTag(Consumer<List<AccessConfigTag>> accessConfigTagSetter) {
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

    public CreateAccessConfigResponse withLogSplit(Boolean logSplit) {
        this.logSplit = logSplit;
        return this;
    }

    /**
     * 二进制采集
     * @return logSplit
     */
    public Boolean getLogSplit() {
        return logSplit;
    }

    public void setLogSplit(Boolean logSplit) {
        this.logSplit = logSplit;
    }

    public CreateAccessConfigResponse withBinaryCollect(Boolean binaryCollect) {
        this.binaryCollect = binaryCollect;
        return this;
    }

    /**
     * 日志拆分
     * @return binaryCollect
     */
    public Boolean getBinaryCollect() {
        return binaryCollect;
    }

    public void setBinaryCollect(Boolean binaryCollect) {
        this.binaryCollect = binaryCollect;
    }

    public CreateAccessConfigResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * CCE集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateAccessConfigResponse withEncodingFormat(String encodingFormat) {
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

    public CreateAccessConfigResponse withIncrementalCollect(Boolean incrementalCollect) {
        this.incrementalCollect = incrementalCollect;
        return this;
    }

    /**
     * 采集策略：增量/全量
     * @return incrementalCollect
     */
    public Boolean getIncrementalCollect() {
        return incrementalCollect;
    }

    public void setIncrementalCollect(Boolean incrementalCollect) {
        this.incrementalCollect = incrementalCollect;
    }

    public CreateAccessConfigResponse withProcessorType(String processorType) {
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

    public CreateAccessConfigResponse withDemoLog(String demoLog) {
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

    public CreateAccessConfigResponse withDemoFields(List<DemoFieldAccess> demoFields) {
        this.demoFields = demoFields;
        return this;
    }

    public CreateAccessConfigResponse addDemoFieldsItem(DemoFieldAccess demoFieldsItem) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        this.demoFields.add(demoFieldsItem);
        return this;
    }

    public CreateAccessConfigResponse withDemoFields(Consumer<List<DemoFieldAccess>> demoFieldsSetter) {
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

    public CreateAccessConfigResponse withProcessors(List<Processor> processors) {
        this.processors = processors;
        return this;
    }

    public CreateAccessConfigResponse addProcessorsItem(Processor processorsItem) {
        if (this.processors == null) {
            this.processors = new ArrayList<>();
        }
        this.processors.add(processorsItem);
        return this;
    }

    public CreateAccessConfigResponse withProcessors(Consumer<List<Processor>> processorsSetter) {
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

    public CreateAccessConfigResponse withLogSplitSize(Integer logSplitSize) {
        this.logSplitSize = logSplitSize;
        return this;
    }

    /**
     * **参数解释：** 拆分日志大小。 **取值范围：** 不涉及。
     * @return logSplitSize
     */
    public Integer getLogSplitSize() {
        return logSplitSize;
    }

    public void setLogSplitSize(Integer logSplitSize) {
        this.logSplitSize = logSplitSize;
    }

    public CreateAccessConfigResponse withRecursiveDepth(Integer recursiveDepth) {
        this.recursiveDepth = recursiveDepth;
        return this;
    }

    /**
     * **参数解释：** 采集路径递归最大深度。 **取值范围：** 不涉及。
     * @return recursiveDepth
     */
    public Integer getRecursiveDepth() {
        return recursiveDepth;
    }

    public void setRecursiveDepth(Integer recursiveDepth) {
        this.recursiveDepth = recursiveDepth;
    }

    public CreateAccessConfigResponse withAccessConfigTypeSource(String accessConfigTypeSource) {
        this.accessConfigTypeSource = accessConfigTypeSource;
        return this;
    }

    /**
     * **参数解释：** 日志接入自建软件来源。 **取值范围：** - ECS - CCE - BMS - K8S - ServiceStageHost - ServiceStage
     * @return accessConfigTypeSource
     */
    public String getAccessConfigTypeSource() {
        return accessConfigTypeSource;
    }

    public void setAccessConfigTypeSource(String accessConfigTypeSource) {
        this.accessConfigTypeSource = accessConfigTypeSource;
    }

    public CreateAccessConfigResponse withApplicationId(String applicationId) {
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

    public CreateAccessConfigResponse withEnvironmentId(String environmentId) {
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

    public CreateAccessConfigResponse withComponentId(List<String> componentId) {
        this.componentId = componentId;
        return this;
    }

    public CreateAccessConfigResponse addComponentIdItem(String componentIdItem) {
        if (this.componentId == null) {
            this.componentId = new ArrayList<>();
        }
        this.componentId.add(componentIdItem);
        return this;
    }

    public CreateAccessConfigResponse withComponentId(Consumer<List<String>> componentIdSetter) {
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
        CreateAccessConfigResponse that = (CreateAccessConfigResponse) obj;
        return Objects.equals(this.accessConfigId, that.accessConfigId)
            && Objects.equals(this.accessConfigName, that.accessConfigName)
            && Objects.equals(this.accessConfigType, that.accessConfigType)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.accessConfigDetail, that.accessConfigDetail)
            && Objects.equals(this.logInfo, that.logInfo) && Objects.equals(this.hostGroupInfo, that.hostGroupInfo)
            && Objects.equals(this.accessConfigTag, that.accessConfigTag)
            && Objects.equals(this.logSplit, that.logSplit) && Objects.equals(this.binaryCollect, that.binaryCollect)
            && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.encodingFormat, that.encodingFormat)
            && Objects.equals(this.incrementalCollect, that.incrementalCollect)
            && Objects.equals(this.processorType, that.processorType) && Objects.equals(this.demoLog, that.demoLog)
            && Objects.equals(this.demoFields, that.demoFields) && Objects.equals(this.processors, that.processors)
            && Objects.equals(this.logSplitSize, that.logSplitSize)
            && Objects.equals(this.recursiveDepth, that.recursiveDepth)
            && Objects.equals(this.accessConfigTypeSource, that.accessConfigTypeSource)
            && Objects.equals(this.applicationId, that.applicationId)
            && Objects.equals(this.environmentId, that.environmentId)
            && Objects.equals(this.componentId, that.componentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessConfigId,
            accessConfigName,
            accessConfigType,
            createTime,
            accessConfigDetail,
            logInfo,
            hostGroupInfo,
            accessConfigTag,
            logSplit,
            binaryCollect,
            clusterId,
            encodingFormat,
            incrementalCollect,
            processorType,
            demoLog,
            demoFields,
            processors,
            logSplitSize,
            recursiveDepth,
            accessConfigTypeSource,
            applicationId,
            environmentId,
            componentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccessConfigResponse {\n");
        sb.append("    accessConfigId: ").append(toIndentedString(accessConfigId)).append("\n");
        sb.append("    accessConfigName: ").append(toIndentedString(accessConfigName)).append("\n");
        sb.append("    accessConfigType: ").append(toIndentedString(accessConfigType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    accessConfigDetail: ").append(toIndentedString(accessConfigDetail)).append("\n");
        sb.append("    logInfo: ").append(toIndentedString(logInfo)).append("\n");
        sb.append("    hostGroupInfo: ").append(toIndentedString(hostGroupInfo)).append("\n");
        sb.append("    accessConfigTag: ").append(toIndentedString(accessConfigTag)).append("\n");
        sb.append("    logSplit: ").append(toIndentedString(logSplit)).append("\n");
        sb.append("    binaryCollect: ").append(toIndentedString(binaryCollect)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    encodingFormat: ").append(toIndentedString(encodingFormat)).append("\n");
        sb.append("    incrementalCollect: ").append(toIndentedString(incrementalCollect)).append("\n");
        sb.append("    processorType: ").append(toIndentedString(processorType)).append("\n");
        sb.append("    demoLog: ").append(toIndentedString(demoLog)).append("\n");
        sb.append("    demoFields: ").append(toIndentedString(demoFields)).append("\n");
        sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
        sb.append("    logSplitSize: ").append(toIndentedString(logSplitSize)).append("\n");
        sb.append("    recursiveDepth: ").append(toIndentedString(recursiveDepth)).append("\n");
        sb.append("    accessConfigTypeSource: ").append(toIndentedString(accessConfigTypeSource)).append("\n");
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
