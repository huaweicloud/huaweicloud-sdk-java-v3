package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业规格参数。有此字段时，无需填写tasks字段。
 */
public class Spec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private SpecResource resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<SpecVolumes> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_export_path")

    private LogExportPath logExportPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_stop")

    private AutoStop autoStop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_policy")

    private SchedulePolicy schedulePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_export_config")

    private LogExportConfig logExportConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification")

    private Notification notification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_metrics")

    private List<CustomMetrics> customMetrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_model")

    private OutputModel outputModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_model")

    private AssetModel assetModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    public Spec withResource(SpecResource resource) {
        this.resource = resource;
        return this;
    }

    public Spec withResource(Consumer<SpecResource> resourceSetter) {
        if (this.resource == null) {
            this.resource = new SpecResource();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public SpecResource getResource() {
        return resource;
    }

    public void setResource(SpecResource resource) {
        this.resource = resource;
    }

    public Spec withVolumes(List<SpecVolumes> volumes) {
        this.volumes = volumes;
        return this;
    }

    public Spec addVolumesItem(SpecVolumes volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public Spec withVolumes(Consumer<List<SpecVolumes>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * **参数解释**：训练作业挂载卷信息。 **约束限制**：不涉及。
     * @return volumes
     */
    public List<SpecVolumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<SpecVolumes> volumes) {
        this.volumes = volumes;
    }

    public Spec withLogExportPath(LogExportPath logExportPath) {
        this.logExportPath = logExportPath;
        return this;
    }

    public Spec withLogExportPath(Consumer<LogExportPath> logExportPathSetter) {
        if (this.logExportPath == null) {
            this.logExportPath = new LogExportPath();
            logExportPathSetter.accept(this.logExportPath);
        }

        return this;
    }

    /**
     * Get logExportPath
     * @return logExportPath
     */
    public LogExportPath getLogExportPath() {
        return logExportPath;
    }

    public void setLogExportPath(LogExportPath logExportPath) {
        this.logExportPath = logExportPath;
    }

    public Spec withAutoStop(AutoStop autoStop) {
        this.autoStop = autoStop;
        return this;
    }

    public Spec withAutoStop(Consumer<AutoStop> autoStopSetter) {
        if (this.autoStop == null) {
            this.autoStop = new AutoStop();
            autoStopSetter.accept(this.autoStop);
        }

        return this;
    }

    /**
     * Get autoStop
     * @return autoStop
     */
    public AutoStop getAutoStop() {
        return autoStop;
    }

    public void setAutoStop(AutoStop autoStop) {
        this.autoStop = autoStop;
    }

    public Spec withSchedulePolicy(SchedulePolicy schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
        return this;
    }

    public Spec withSchedulePolicy(Consumer<SchedulePolicy> schedulePolicySetter) {
        if (this.schedulePolicy == null) {
            this.schedulePolicy = new SchedulePolicy();
            schedulePolicySetter.accept(this.schedulePolicy);
        }

        return this;
    }

    /**
     * Get schedulePolicy
     * @return schedulePolicy
     */
    public SchedulePolicy getSchedulePolicy() {
        return schedulePolicy;
    }

    public void setSchedulePolicy(SchedulePolicy schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
    }

    public Spec withLogExportConfig(LogExportConfig logExportConfig) {
        this.logExportConfig = logExportConfig;
        return this;
    }

    public Spec withLogExportConfig(Consumer<LogExportConfig> logExportConfigSetter) {
        if (this.logExportConfig == null) {
            this.logExportConfig = new LogExportConfig();
            logExportConfigSetter.accept(this.logExportConfig);
        }

        return this;
    }

    /**
     * Get logExportConfig
     * @return logExportConfig
     */
    public LogExportConfig getLogExportConfig() {
        return logExportConfig;
    }

    public void setLogExportConfig(LogExportConfig logExportConfig) {
        this.logExportConfig = logExportConfig;
    }

    public Spec withNotification(Notification notification) {
        this.notification = notification;
        return this;
    }

    public Spec withNotification(Consumer<Notification> notificationSetter) {
        if (this.notification == null) {
            this.notification = new Notification();
            notificationSetter.accept(this.notification);
        }

        return this;
    }

    /**
     * Get notification
     * @return notification
     */
    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public Spec withCustomMetrics(List<CustomMetrics> customMetrics) {
        this.customMetrics = customMetrics;
        return this;
    }

    public Spec addCustomMetricsItem(CustomMetrics customMetricsItem) {
        if (this.customMetrics == null) {
            this.customMetrics = new ArrayList<>();
        }
        this.customMetrics.add(customMetricsItem);
        return this;
    }

    public Spec withCustomMetrics(Consumer<List<CustomMetrics>> customMetricsSetter) {
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

    public Spec withOutputModel(OutputModel outputModel) {
        this.outputModel = outputModel;
        return this;
    }

    public Spec withOutputModel(Consumer<OutputModel> outputModelSetter) {
        if (this.outputModel == null) {
            this.outputModel = new OutputModel();
            outputModelSetter.accept(this.outputModel);
        }

        return this;
    }

    /**
     * Get outputModel
     * @return outputModel
     */
    public OutputModel getOutputModel() {
        return outputModel;
    }

    public void setOutputModel(OutputModel outputModel) {
        this.outputModel = outputModel;
    }

    public Spec withAssetModel(AssetModel assetModel) {
        this.assetModel = assetModel;
        return this;
    }

    public Spec withAssetModel(Consumer<AssetModel> assetModelSetter) {
        if (this.assetModel == null) {
            this.assetModel = new AssetModel();
            assetModelSetter.accept(this.assetModel);
        }

        return this;
    }

    /**
     * Get assetModel
     * @return assetModel
     */
    public AssetModel getAssetModel() {
        return assetModel;
    }

    public void setAssetModel(AssetModel assetModel) {
        this.assetModel = assetModel;
    }

    public Spec withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * **参数解释**：精调训练作业资产模型ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Spec that = (Spec) obj;
        return Objects.equals(this.resource, that.resource) && Objects.equals(this.volumes, that.volumes)
            && Objects.equals(this.logExportPath, that.logExportPath) && Objects.equals(this.autoStop, that.autoStop)
            && Objects.equals(this.schedulePolicy, that.schedulePolicy)
            && Objects.equals(this.logExportConfig, that.logExportConfig)
            && Objects.equals(this.notification, that.notification)
            && Objects.equals(this.customMetrics, that.customMetrics)
            && Objects.equals(this.outputModel, that.outputModel) && Objects.equals(this.assetModel, that.assetModel)
            && Objects.equals(this.assetId, that.assetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource,
            volumes,
            logExportPath,
            autoStop,
            schedulePolicy,
            logExportConfig,
            notification,
            customMetrics,
            outputModel,
            assetModel,
            assetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Spec {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    logExportPath: ").append(toIndentedString(logExportPath)).append("\n");
        sb.append("    autoStop: ").append(toIndentedString(autoStop)).append("\n");
        sb.append("    schedulePolicy: ").append(toIndentedString(schedulePolicy)).append("\n");
        sb.append("    logExportConfig: ").append(toIndentedString(logExportConfig)).append("\n");
        sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
        sb.append("    customMetrics: ").append(toIndentedString(customMetrics)).append("\n");
        sb.append("    outputModel: ").append(toIndentedString(outputModel)).append("\n");
        sb.append("    assetModel: ").append(toIndentedString(assetModel)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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
