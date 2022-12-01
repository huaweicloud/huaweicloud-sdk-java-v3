package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateNodeReqDetail
 */
public class UpdateNodeReqDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<LogConfig> logConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagObject> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_validity_period")

    private Integer eventValidityPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_gpu")

    private Boolean enableGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_npu")

    private Boolean enableNpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_type")

    private String npuType;

    public UpdateNodeReqDetail withDescription(String description) {
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

    public UpdateNodeReqDetail withLogConfigs(List<LogConfig> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public UpdateNodeReqDetail addLogConfigsItem(LogConfig logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public UpdateNodeReqDetail withLogConfigs(Consumer<List<LogConfig>> logConfigsSetter) {
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

    public UpdateNodeReqDetail withTags(List<TagObject> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateNodeReqDetail addTagsItem(TagObject tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateNodeReqDetail withTags(Consumer<List<TagObject>> tagsSetter) {
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

    public UpdateNodeReqDetail withEventValidityPeriod(Integer eventValidityPeriod) {
        this.eventValidityPeriod = eventValidityPeriod;
        return this;
    }

    /**
     * 事件有效时间(单位：分钟)
     * @return eventValidityPeriod
     */
    public Integer getEventValidityPeriod() {
        return eventValidityPeriod;
    }

    public void setEventValidityPeriod(Integer eventValidityPeriod) {
        this.eventValidityPeriod = eventValidityPeriod;
    }

    public UpdateNodeReqDetail withEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
        return this;
    }

    /**
     * 是否开启gpu
     * @return enableGpu
     */
    public Boolean getEnableGpu() {
        return enableGpu;
    }

    public void setEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
    }

    public UpdateNodeReqDetail withEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
        return this;
    }

    /**
     * 是否开启npu
     * @return enableNpu
     */
    public Boolean getEnableNpu() {
        return enableNpu;
    }

    public void setEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
    }

    public UpdateNodeReqDetail withNpuType(String npuType) {
        this.npuType = npuType;
        return this;
    }

    /**
     * npu类型，如果选择开启npu, 可设置类型Ascend 310/ Ascend 710, 如果选择开启gpu，请设置值为null。
     * @return npuType
     */
    public String getNpuType() {
        return npuType;
    }

    public void setNpuType(String npuType) {
        this.npuType = npuType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNodeReqDetail updateNodeReqDetail = (UpdateNodeReqDetail) o;
        return Objects.equals(this.description, updateNodeReqDetail.description)
            && Objects.equals(this.logConfigs, updateNodeReqDetail.logConfigs)
            && Objects.equals(this.tags, updateNodeReqDetail.tags)
            && Objects.equals(this.eventValidityPeriod, updateNodeReqDetail.eventValidityPeriod)
            && Objects.equals(this.enableGpu, updateNodeReqDetail.enableGpu)
            && Objects.equals(this.enableNpu, updateNodeReqDetail.enableNpu)
            && Objects.equals(this.npuType, updateNodeReqDetail.npuType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, logConfigs, tags, eventValidityPeriod, enableGpu, enableNpu, npuType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNodeReqDetail {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    eventValidityPeriod: ").append(toIndentedString(eventValidityPeriod)).append("\n");
        sb.append("    enableGpu: ").append(toIndentedString(enableGpu)).append("\n");
        sb.append("    enableNpu: ").append(toIndentedString(enableNpu)).append("\n");
        sb.append("    npuType: ").append(toIndentedString(npuType)).append("\n");
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
