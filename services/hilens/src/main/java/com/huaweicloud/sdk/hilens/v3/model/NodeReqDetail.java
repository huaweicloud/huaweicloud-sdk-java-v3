package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备详细信息
 */
public class NodeReqDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch")

    private Integer batch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_gpu")

    private Boolean enableGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_npu")

    private Boolean enableNpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_user_id")

    private String iamUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<LogConfig> logConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_type")

    private String npuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagObject> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_validity_period")

    private Integer eventValidityPeriod;

    public NodeReqDetail withBatch(Integer batch) {
        this.batch = batch;
        return this;
    }

    /**
     * 批量注册数量。默认为单设备注册，即batch=1，如果大于1即为批量注册的最大数量。最大上限数量为100000
     * @return batch
     */
    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public NodeReqDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 设备描述，最大长度255，不允许^, ~, ＃, $, %, &, *, <, >, (, ), [, ], {, }, ', \", \\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NodeReqDetail withEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
        return this;
    }

    /**
     * 是否开启GPU，true表示开启，false表示不开启，默认为false
     * @return enableGpu
     */
    public Boolean getEnableGpu() {
        return enableGpu;
    }

    public void setEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
    }

    public NodeReqDetail withEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
        return this;
    }

    /**
     * 是否开启NPU，true表示开启，false表示不开启，默认为false
     * @return enableNpu
     */
    public Boolean getEnableNpu() {
        return enableNpu;
    }

    public void setEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
    }

    public NodeReqDetail withIamUserId(String iamUserId) {
        this.iamUserId = iamUserId;
        return this;
    }

    /**
     * 子账号ID。当主账号注册设备时，可以指定将设备注册到指定的子账号下面。不填默认为该发起注册行为用户的user_id
     * @return iamUserId
     */
    public String getIamUserId() {
        return iamUserId;
    }

    public void setIamUserId(String iamUserId) {
        this.iamUserId = iamUserId;
    }

    public NodeReqDetail withLogConfigs(List<LogConfig> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public NodeReqDetail addLogConfigsItem(LogConfig logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public NodeReqDetail withLogConfigs(Consumer<List<LogConfig>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * 设备日志配置
     * @return logConfigs
     */
    public List<LogConfig> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<LogConfig> logConfigs) {
        this.logConfigs = logConfigs;
    }

    public NodeReqDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设备名称，只允许中文字符、英文字母、数字、下划线、中划线，最大长度64
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodeReqDetail withNpuType(String npuType) {
        this.npuType = npuType;
        return this;
    }

    /**
     * NPU类型，D310/D910。不填表示为D310类型。
     * @return npuType
     */
    public String getNpuType() {
        return npuType;
    }

    public void setNpuType(String npuType) {
        this.npuType = npuType;
    }

    public NodeReqDetail withTags(List<TagObject> tags) {
        this.tags = tags;
        return this;
    }

    public NodeReqDetail addTagsItem(TagObject tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public NodeReqDetail withTags(Consumer<List<TagObject>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 设备标签，标签个数最多为20个
     * @return tags
     */
    public List<TagObject> getTags() {
        return tags;
    }

    public void setTags(List<TagObject> tags) {
        this.tags = tags;
    }

    public NodeReqDetail withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID，不填为为主账号/子账号的默认工作空间
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public NodeReqDetail withEventValidityPeriod(Integer eventValidityPeriod) {
        this.eventValidityPeriod = eventValidityPeriod;
        return this;
    }

    /**
     * 事件有效时间（单位：分钟）
     * @return eventValidityPeriod
     */
    public Integer getEventValidityPeriod() {
        return eventValidityPeriod;
    }

    public void setEventValidityPeriod(Integer eventValidityPeriod) {
        this.eventValidityPeriod = eventValidityPeriod;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeReqDetail nodeReqDetail = (NodeReqDetail) o;
        return Objects.equals(this.batch, nodeReqDetail.batch)
            && Objects.equals(this.description, nodeReqDetail.description)
            && Objects.equals(this.enableGpu, nodeReqDetail.enableGpu)
            && Objects.equals(this.enableNpu, nodeReqDetail.enableNpu)
            && Objects.equals(this.iamUserId, nodeReqDetail.iamUserId)
            && Objects.equals(this.logConfigs, nodeReqDetail.logConfigs)
            && Objects.equals(this.name, nodeReqDetail.name) && Objects.equals(this.npuType, nodeReqDetail.npuType)
            && Objects.equals(this.tags, nodeReqDetail.tags)
            && Objects.equals(this.workspaceId, nodeReqDetail.workspaceId)
            && Objects.equals(this.eventValidityPeriod, nodeReqDetail.eventValidityPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batch,
            description,
            enableGpu,
            enableNpu,
            iamUserId,
            logConfigs,
            name,
            npuType,
            tags,
            workspaceId,
            eventValidityPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeReqDetail {\n");
        sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enableGpu: ").append(toIndentedString(enableGpu)).append("\n");
        sb.append("    enableNpu: ").append(toIndentedString(enableNpu)).append("\n");
        sb.append("    iamUserId: ").append(toIndentedString(iamUserId)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    npuType: ").append(toIndentedString(npuType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    eventValidityPeriod: ").append(toIndentedString(eventValidityPeriod)).append("\n");
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
