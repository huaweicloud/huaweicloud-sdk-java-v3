package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建日志接入请求体
 */
public class CreateAccessConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_name")

    private String accessConfigName;

    /**
     * 日志接入类型。AGENT：ECS接入,K8S_CCE:CCE接入
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
    @JsonProperty(value = "access_config_detail")

    private AccessConfigDeatilCreate accessConfigDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_info")

    private AccessConfigBaseLogInfoCreate logInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_info")

    private AccessConfigHostGroupIdListCreate hostGroupInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_tag")

    private List<AccessConfigTag> accessConfigTag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binary_collect")

    private Boolean binaryCollect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_split")

    private Boolean logSplit;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_config_type_source")

    private String accessConfigTypeSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recursive_depth")

    private Integer recursiveDepth;

    public CreateAccessConfigRequestBody withAccessConfigName(String accessConfigName) {
        this.accessConfigName = accessConfigName;
        return this;
    }

    /**
     * 日志接入名称。 满足正则表达式：^(?!\\.)(?!_)(?!.*?\\.$)[\\u4e00-\\u9fa5a-zA-Z0-9-_.]{1,64}$
     * @return accessConfigName
     */
    public String getAccessConfigName() {
        return accessConfigName;
    }

    public void setAccessConfigName(String accessConfigName) {
        this.accessConfigName = accessConfigName;
    }

    public CreateAccessConfigRequestBody withAccessConfigType(AccessConfigTypeEnum accessConfigType) {
        this.accessConfigType = accessConfigType;
        return this;
    }

    /**
     * 日志接入类型。AGENT：ECS接入,K8S_CCE:CCE接入
     * @return accessConfigType
     */
    public AccessConfigTypeEnum getAccessConfigType() {
        return accessConfigType;
    }

    public void setAccessConfigType(AccessConfigTypeEnum accessConfigType) {
        this.accessConfigType = accessConfigType;
    }

    public CreateAccessConfigRequestBody withAccessConfigDetail(AccessConfigDeatilCreate accessConfigDetail) {
        this.accessConfigDetail = accessConfigDetail;
        return this;
    }

    public CreateAccessConfigRequestBody withAccessConfigDetail(
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

    public CreateAccessConfigRequestBody withLogInfo(AccessConfigBaseLogInfoCreate logInfo) {
        this.logInfo = logInfo;
        return this;
    }

    public CreateAccessConfigRequestBody withLogInfo(Consumer<AccessConfigBaseLogInfoCreate> logInfoSetter) {
        if (this.logInfo == null) {
            this.logInfo = new AccessConfigBaseLogInfoCreate();
            logInfoSetter.accept(this.logInfo);
        }

        return this;
    }

    /**
     * Get logInfo
     * @return logInfo
     */
    public AccessConfigBaseLogInfoCreate getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(AccessConfigBaseLogInfoCreate logInfo) {
        this.logInfo = logInfo;
    }

    public CreateAccessConfigRequestBody withHostGroupInfo(AccessConfigHostGroupIdListCreate hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
        return this;
    }

    public CreateAccessConfigRequestBody withHostGroupInfo(
        Consumer<AccessConfigHostGroupIdListCreate> hostGroupInfoSetter) {
        if (this.hostGroupInfo == null) {
            this.hostGroupInfo = new AccessConfigHostGroupIdListCreate();
            hostGroupInfoSetter.accept(this.hostGroupInfo);
        }

        return this;
    }

    /**
     * Get hostGroupInfo
     * @return hostGroupInfo
     */
    public AccessConfigHostGroupIdListCreate getHostGroupInfo() {
        return hostGroupInfo;
    }

    public void setHostGroupInfo(AccessConfigHostGroupIdListCreate hostGroupInfo) {
        this.hostGroupInfo = hostGroupInfo;
    }

    public CreateAccessConfigRequestBody withAccessConfigTag(List<AccessConfigTag> accessConfigTag) {
        this.accessConfigTag = accessConfigTag;
        return this;
    }

    public CreateAccessConfigRequestBody addAccessConfigTagItem(AccessConfigTag accessConfigTagItem) {
        if (this.accessConfigTag == null) {
            this.accessConfigTag = new ArrayList<>();
        }
        this.accessConfigTag.add(accessConfigTagItem);
        return this;
    }

    public CreateAccessConfigRequestBody withAccessConfigTag(Consumer<List<AccessConfigTag>> accessConfigTagSetter) {
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

    public CreateAccessConfigRequestBody withBinaryCollect(Boolean binaryCollect) {
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

    public CreateAccessConfigRequestBody withLogSplit(Boolean logSplit) {
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

    public CreateAccessConfigRequestBody withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * CCE集群ID，当CCE类型时，为必填
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateAccessConfigRequestBody withIncrementalCollect(Boolean incrementalCollect) {
        this.incrementalCollect = incrementalCollect;
        return this;
    }

    /**
     * 是否增量采集 true 为是   false为否（全量采集）
     * @return incrementalCollect
     */
    public Boolean getIncrementalCollect() {
        return incrementalCollect;
    }

    public void setIncrementalCollect(Boolean incrementalCollect) {
        this.incrementalCollect = incrementalCollect;
    }

    public CreateAccessConfigRequestBody withEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
        return this;
    }

    /**
     * 编码格式，支持UTF-8，GDB默认UTF-8
     * @return encodingFormat
     */
    public String getEncodingFormat() {
        return encodingFormat;
    }

    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public CreateAccessConfigRequestBody withProcessorType(String processorType) {
        this.processorType = processorType;
        return this;
    }

    /**
     * IC结构化解析类型包括 ：SINGLE_LINE 单行全文，MULTI_LINE 多行全文，REGEX 单行正则，MULTI_REGEX 多行正则，SPLIT 分隔符，JSON JSON解析，NGINX nginx解析， COMPOSE组合解析
     * @return processorType
     */
    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public CreateAccessConfigRequestBody withDemoLog(String demoLog) {
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

    public CreateAccessConfigRequestBody withDemoFields(List<DemoFieldAccess> demoFields) {
        this.demoFields = demoFields;
        return this;
    }

    public CreateAccessConfigRequestBody addDemoFieldsItem(DemoFieldAccess demoFieldsItem) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        this.demoFields.add(demoFieldsItem);
        return this;
    }

    public CreateAccessConfigRequestBody withDemoFields(Consumer<List<DemoFieldAccess>> demoFieldsSetter) {
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

    public CreateAccessConfigRequestBody withProcessors(List<Processor> processors) {
        this.processors = processors;
        return this;
    }

    public CreateAccessConfigRequestBody addProcessorsItem(Processor processorsItem) {
        if (this.processors == null) {
            this.processors = new ArrayList<>();
        }
        this.processors.add(processorsItem);
        return this;
    }

    public CreateAccessConfigRequestBody withProcessors(Consumer<List<Processor>> processorsSetter) {
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

    public CreateAccessConfigRequestBody withApplicationId(String applicationId) {
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

    public CreateAccessConfigRequestBody withEnvironmentId(String environmentId) {
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

    public CreateAccessConfigRequestBody withComponentId(List<String> componentId) {
        this.componentId = componentId;
        return this;
    }

    public CreateAccessConfigRequestBody addComponentIdItem(String componentIdItem) {
        if (this.componentId == null) {
            this.componentId = new ArrayList<>();
        }
        this.componentId.add(componentIdItem);
        return this;
    }

    public CreateAccessConfigRequestBody withComponentId(Consumer<List<String>> componentIdSetter) {
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

    public CreateAccessConfigRequestBody withAccessConfigTypeSource(String accessConfigTypeSource) {
        this.accessConfigTypeSource = accessConfigTypeSource;
        return this;
    }

    /**
     * 日志接入自建软件来源
     * @return accessConfigTypeSource
     */
    public String getAccessConfigTypeSource() {
        return accessConfigTypeSource;
    }

    public void setAccessConfigTypeSource(String accessConfigTypeSource) {
        this.accessConfigTypeSource = accessConfigTypeSource;
    }

    public CreateAccessConfigRequestBody withRecursiveDepth(Integer recursiveDepth) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAccessConfigRequestBody that = (CreateAccessConfigRequestBody) obj;
        return Objects.equals(this.accessConfigName, that.accessConfigName)
            && Objects.equals(this.accessConfigType, that.accessConfigType)
            && Objects.equals(this.accessConfigDetail, that.accessConfigDetail)
            && Objects.equals(this.logInfo, that.logInfo) && Objects.equals(this.hostGroupInfo, that.hostGroupInfo)
            && Objects.equals(this.accessConfigTag, that.accessConfigTag)
            && Objects.equals(this.binaryCollect, that.binaryCollect) && Objects.equals(this.logSplit, that.logSplit)
            && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.incrementalCollect, that.incrementalCollect)
            && Objects.equals(this.encodingFormat, that.encodingFormat)
            && Objects.equals(this.processorType, that.processorType) && Objects.equals(this.demoLog, that.demoLog)
            && Objects.equals(this.demoFields, that.demoFields) && Objects.equals(this.processors, that.processors)
            && Objects.equals(this.applicationId, that.applicationId)
            && Objects.equals(this.environmentId, that.environmentId)
            && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.accessConfigTypeSource, that.accessConfigTypeSource)
            && Objects.equals(this.recursiveDepth, that.recursiveDepth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessConfigName,
            accessConfigType,
            accessConfigDetail,
            logInfo,
            hostGroupInfo,
            accessConfigTag,
            binaryCollect,
            logSplit,
            clusterId,
            incrementalCollect,
            encodingFormat,
            processorType,
            demoLog,
            demoFields,
            processors,
            applicationId,
            environmentId,
            componentId,
            accessConfigTypeSource,
            recursiveDepth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccessConfigRequestBody {\n");
        sb.append("    accessConfigName: ").append(toIndentedString(accessConfigName)).append("\n");
        sb.append("    accessConfigType: ").append(toIndentedString(accessConfigType)).append("\n");
        sb.append("    accessConfigDetail: ").append(toIndentedString(accessConfigDetail)).append("\n");
        sb.append("    logInfo: ").append(toIndentedString(logInfo)).append("\n");
        sb.append("    hostGroupInfo: ").append(toIndentedString(hostGroupInfo)).append("\n");
        sb.append("    accessConfigTag: ").append(toIndentedString(accessConfigTag)).append("\n");
        sb.append("    binaryCollect: ").append(toIndentedString(binaryCollect)).append("\n");
        sb.append("    logSplit: ").append(toIndentedString(logSplit)).append("\n");
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
        sb.append("    accessConfigTypeSource: ").append(toIndentedString(accessConfigTypeSource)).append("\n");
        sb.append("    recursiveDepth: ").append(toIndentedString(recursiveDepth)).append("\n");
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
