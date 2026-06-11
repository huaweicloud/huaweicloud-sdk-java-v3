package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业规格参数。
 */
public class SpecResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private Resource resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<JobVolumeResp> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_export_path")

    private LogExportPathResp logExportPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_policy")

    private SchedulePolicyResp schedulePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_metrics")

    private List<CustomMetrics> customMetrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_model")

    private OutputModelResp outputModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_model")

    private AssetModelResp assetModel;

    public SpecResponse withResource(Resource resource) {
        this.resource = resource;
        return this;
    }

    public SpecResponse withResource(Consumer<Resource> resourceSetter) {
        if (this.resource == null) {
            this.resource = new Resource();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public SpecResponse withVolumes(List<JobVolumeResp> volumes) {
        this.volumes = volumes;
        return this;
    }

    public SpecResponse addVolumesItem(JobVolumeResp volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public SpecResponse withVolumes(Consumer<List<JobVolumeResp>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * **参数解释**：训练作业挂载卷信息。
     * @return volumes
     */
    public List<JobVolumeResp> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<JobVolumeResp> volumes) {
        this.volumes = volumes;
    }

    public SpecResponse withLogExportPath(LogExportPathResp logExportPath) {
        this.logExportPath = logExportPath;
        return this;
    }

    public SpecResponse withLogExportPath(Consumer<LogExportPathResp> logExportPathSetter) {
        if (this.logExportPath == null) {
            this.logExportPath = new LogExportPathResp();
            logExportPathSetter.accept(this.logExportPath);
        }

        return this;
    }

    /**
     * Get logExportPath
     * @return logExportPath
     */
    public LogExportPathResp getLogExportPath() {
        return logExportPath;
    }

    public void setLogExportPath(LogExportPathResp logExportPath) {
        this.logExportPath = logExportPath;
    }

    public SpecResponse withSchedulePolicy(SchedulePolicyResp schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
        return this;
    }

    public SpecResponse withSchedulePolicy(Consumer<SchedulePolicyResp> schedulePolicySetter) {
        if (this.schedulePolicy == null) {
            this.schedulePolicy = new SchedulePolicyResp();
            schedulePolicySetter.accept(this.schedulePolicy);
        }

        return this;
    }

    /**
     * Get schedulePolicy
     * @return schedulePolicy
     */
    public SchedulePolicyResp getSchedulePolicy() {
        return schedulePolicy;
    }

    public void setSchedulePolicy(SchedulePolicyResp schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
    }

    public SpecResponse withCustomMetrics(List<CustomMetrics> customMetrics) {
        this.customMetrics = customMetrics;
        return this;
    }

    public SpecResponse addCustomMetricsItem(CustomMetrics customMetricsItem) {
        if (this.customMetrics == null) {
            this.customMetrics = new ArrayList<>();
        }
        this.customMetrics.add(customMetricsItem);
        return this;
    }

    public SpecResponse withCustomMetrics(Consumer<List<CustomMetrics>> customMetricsSetter) {
        if (this.customMetrics == null) {
            this.customMetrics = new ArrayList<>();
        }
        customMetricsSetter.accept(this.customMetrics);
        return this;
    }

    /**
     * **参数解释**：指标采集配置。
     * @return customMetrics
     */
    public List<CustomMetrics> getCustomMetrics() {
        return customMetrics;
    }

    public void setCustomMetrics(List<CustomMetrics> customMetrics) {
        this.customMetrics = customMetrics;
    }

    public SpecResponse withOutputModel(OutputModelResp outputModel) {
        this.outputModel = outputModel;
        return this;
    }

    public SpecResponse withOutputModel(Consumer<OutputModelResp> outputModelSetter) {
        if (this.outputModel == null) {
            this.outputModel = new OutputModelResp();
            outputModelSetter.accept(this.outputModel);
        }

        return this;
    }

    /**
     * Get outputModel
     * @return outputModel
     */
    public OutputModelResp getOutputModel() {
        return outputModel;
    }

    public void setOutputModel(OutputModelResp outputModel) {
        this.outputModel = outputModel;
    }

    public SpecResponse withAssetModel(AssetModelResp assetModel) {
        this.assetModel = assetModel;
        return this;
    }

    public SpecResponse withAssetModel(Consumer<AssetModelResp> assetModelSetter) {
        if (this.assetModel == null) {
            this.assetModel = new AssetModelResp();
            assetModelSetter.accept(this.assetModel);
        }

        return this;
    }

    /**
     * Get assetModel
     * @return assetModel
     */
    public AssetModelResp getAssetModel() {
        return assetModel;
    }

    public void setAssetModel(AssetModelResp assetModel) {
        this.assetModel = assetModel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpecResponse that = (SpecResponse) obj;
        return Objects.equals(this.resource, that.resource) && Objects.equals(this.volumes, that.volumes)
            && Objects.equals(this.logExportPath, that.logExportPath)
            && Objects.equals(this.schedulePolicy, that.schedulePolicy)
            && Objects.equals(this.customMetrics, that.customMetrics)
            && Objects.equals(this.outputModel, that.outputModel) && Objects.equals(this.assetModel, that.assetModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, volumes, logExportPath, schedulePolicy, customMetrics, outputModel, assetModel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecResponse {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    logExportPath: ").append(toIndentedString(logExportPath)).append("\n");
        sb.append("    schedulePolicy: ").append(toIndentedString(schedulePolicy)).append("\n");
        sb.append("    customMetrics: ").append(toIndentedString(customMetrics)).append("\n");
        sb.append("    outputModel: ").append(toIndentedString(outputModel)).append("\n");
        sb.append("    assetModel: ").append(toIndentedString(assetModel)).append("\n");
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
