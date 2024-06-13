package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改边缘节点请求结构体。
 */
public class UpdateNodeReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_period")

    private Integer storagePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<LogConfigDTO> logConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_config")

    private HaConfigDTO haConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hardware_model")

    private String hardwareModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_library_path")

    private String npuLibraryPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "automatic_upgrade")

    private String automaticUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_data_record")

    private DeviceDataRecord deviceDataRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_report")

    private String metricReport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline_cache_configs")

    private UpdateOfflineCacheConfigsDTO offlineCacheConfigs;

    public UpdateNodeReqDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘节点名称，只允许中、数字、英文大小写、中划线、下划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateNodeReqDTO withStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
        return this;
    }

    /**
     * 节点的存储周期，默认0天，取值范围0~7天，0天则不存储。
     * minimum: 0
     * maximum: 7
     * @return storagePeriod
     */
    public Integer getStoragePeriod() {
        return storagePeriod;
    }

    public void setStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    public UpdateNodeReqDTO withLogConfigs(List<LogConfigDTO> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public UpdateNodeReqDTO addLogConfigsItem(LogConfigDTO logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public UpdateNodeReqDTO withLogConfigs(Consumer<List<LogConfigDTO>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * 边缘节点在IEF日志配置参数
     * @return logConfigs
     */
    public List<LogConfigDTO> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<LogConfigDTO> logConfigs) {
        this.logConfigs = logConfigs;
    }

    public UpdateNodeReqDTO withHaConfig(HaConfigDTO haConfig) {
        this.haConfig = haConfig;
        return this;
    }

    public UpdateNodeReqDTO withHaConfig(Consumer<HaConfigDTO> haConfigSetter) {
        if (this.haConfig == null) {
            this.haConfig = new HaConfigDTO();
            haConfigSetter.accept(this.haConfig);
        }

        return this;
    }

    /**
     * Get haConfig
     * @return haConfig
     */
    public HaConfigDTO getHaConfig() {
        return haConfig;
    }

    public void setHaConfig(HaConfigDTO haConfig) {
        this.haConfig = haConfig;
    }

    public UpdateNodeReqDTO withHardwareModel(String hardwareModel) {
        this.hardwareModel = hardwareModel;
        return this;
    }

    /**
     * 网关型号
     * @return hardwareModel
     */
    public String getHardwareModel() {
        return hardwareModel;
    }

    public void setHardwareModel(String hardwareModel) {
        this.hardwareModel = hardwareModel;
    }

    public UpdateNodeReqDTO withNpuLibraryPath(String npuLibraryPath) {
        this.npuLibraryPath = npuLibraryPath;
        return this;
    }

    /**
     * npu驱动动态库路径
     * @return npuLibraryPath
     */
    public String getNpuLibraryPath() {
        return npuLibraryPath;
    }

    public void setNpuLibraryPath(String npuLibraryPath) {
        this.npuLibraryPath = npuLibraryPath;
    }

    public UpdateNodeReqDTO withAutomaticUpgrade(String automaticUpgrade) {
        this.automaticUpgrade = automaticUpgrade;
        return this;
    }

    /**
     * 自动升级系统应用的节点开关，默认为关闭：OFF，IMMEDIATE表示节点开关打开
     * @return automaticUpgrade
     */
    public String getAutomaticUpgrade() {
        return automaticUpgrade;
    }

    public void setAutomaticUpgrade(String automaticUpgrade) {
        this.automaticUpgrade = automaticUpgrade;
    }

    public UpdateNodeReqDTO withDeviceDataRecord(DeviceDataRecord deviceDataRecord) {
        this.deviceDataRecord = deviceDataRecord;
        return this;
    }

    public UpdateNodeReqDTO withDeviceDataRecord(Consumer<DeviceDataRecord> deviceDataRecordSetter) {
        if (this.deviceDataRecord == null) {
            this.deviceDataRecord = new DeviceDataRecord();
            deviceDataRecordSetter.accept(this.deviceDataRecord);
        }

        return this;
    }

    /**
     * Get deviceDataRecord
     * @return deviceDataRecord
     */
    public DeviceDataRecord getDeviceDataRecord() {
        return deviceDataRecord;
    }

    public void setDeviceDataRecord(DeviceDataRecord deviceDataRecord) {
        this.deviceDataRecord = deviceDataRecord;
    }

    public UpdateNodeReqDTO withMetricReport(String metricReport) {
        this.metricReport = metricReport;
        return this;
    }

    /**
     * omagent监控运维工具是否上报指标
     * @return metricReport
     */
    public String getMetricReport() {
        return metricReport;
    }

    public void setMetricReport(String metricReport) {
        this.metricReport = metricReport;
    }

    public UpdateNodeReqDTO withOfflineCacheConfigs(UpdateOfflineCacheConfigsDTO offlineCacheConfigs) {
        this.offlineCacheConfigs = offlineCacheConfigs;
        return this;
    }

    public UpdateNodeReqDTO withOfflineCacheConfigs(Consumer<UpdateOfflineCacheConfigsDTO> offlineCacheConfigsSetter) {
        if (this.offlineCacheConfigs == null) {
            this.offlineCacheConfigs = new UpdateOfflineCacheConfigsDTO();
            offlineCacheConfigsSetter.accept(this.offlineCacheConfigs);
        }

        return this;
    }

    /**
     * Get offlineCacheConfigs
     * @return offlineCacheConfigs
     */
    public UpdateOfflineCacheConfigsDTO getOfflineCacheConfigs() {
        return offlineCacheConfigs;
    }

    public void setOfflineCacheConfigs(UpdateOfflineCacheConfigsDTO offlineCacheConfigs) {
        this.offlineCacheConfigs = offlineCacheConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNodeReqDTO that = (UpdateNodeReqDTO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.storagePeriod, that.storagePeriod)
            && Objects.equals(this.logConfigs, that.logConfigs) && Objects.equals(this.haConfig, that.haConfig)
            && Objects.equals(this.hardwareModel, that.hardwareModel)
            && Objects.equals(this.npuLibraryPath, that.npuLibraryPath)
            && Objects.equals(this.automaticUpgrade, that.automaticUpgrade)
            && Objects.equals(this.deviceDataRecord, that.deviceDataRecord)
            && Objects.equals(this.metricReport, that.metricReport)
            && Objects.equals(this.offlineCacheConfigs, that.offlineCacheConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            storagePeriod,
            logConfigs,
            haConfig,
            hardwareModel,
            npuLibraryPath,
            automaticUpgrade,
            deviceDataRecord,
            metricReport,
            offlineCacheConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNodeReqDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    storagePeriod: ").append(toIndentedString(storagePeriod)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    haConfig: ").append(toIndentedString(haConfig)).append("\n");
        sb.append("    hardwareModel: ").append(toIndentedString(hardwareModel)).append("\n");
        sb.append("    npuLibraryPath: ").append(toIndentedString(npuLibraryPath)).append("\n");
        sb.append("    automaticUpgrade: ").append(toIndentedString(automaticUpgrade)).append("\n");
        sb.append("    deviceDataRecord: ").append(toIndentedString(deviceDataRecord)).append("\n");
        sb.append("    metricReport: ").append(toIndentedString(metricReport)).append("\n");
        sb.append("    offlineCacheConfigs: ").append(toIndentedString(offlineCacheConfigs)).append("\n");
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
