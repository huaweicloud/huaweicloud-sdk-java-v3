package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDcPointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "point_id")

    private String pointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_config")

    private Object collectionConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    private String property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ds_id")

    private String dsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processing_config")

    private ProcessingConfigDTO processingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ShowDcPointResponse withPointId(String pointId) {
        this.pointId = pointId;
        return this;
    }

    /**
     * 点位表id，数据源下唯一
     * @return pointId
     */
    public String getPointId() {
        return pointId;
    }

    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    public ShowDcPointResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 点位名称，允许中、数字、英文大小写、下划线、中划线、#%()*特殊字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDcPointResponse withCollectionConfig(Object collectionConfig) {
        this.collectionConfig = collectionConfig;
        return this;
    }

    /**
     * 点位采集配置
     * @return collectionConfig
     */
    public Object getCollectionConfig() {
        return collectionConfig;
    }

    public void setCollectionConfig(Object collectionConfig) {
        this.collectionConfig = collectionConfig;
    }

    public ShowDcPointResponse withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备id
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ShowDcPointResponse withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * 属性，允许中、数字、英文大小写、下划线、中划线
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public ShowDcPointResponse withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 点位数据类型
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ShowDcPointResponse withDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }

    /**
     * 采集数据源id，节点下唯一
     * @return dsId
     */
    public String getDsId() {
        return dsId;
    }

    public void setDsId(String dsId) {
        this.dsId = dsId;
    }

    public ShowDcPointResponse withProcessingConfig(ProcessingConfigDTO processingConfig) {
        this.processingConfig = processingConfig;
        return this;
    }

    public ShowDcPointResponse withProcessingConfig(Consumer<ProcessingConfigDTO> processingConfigSetter) {
        if (this.processingConfig == null) {
            this.processingConfig = new ProcessingConfigDTO();
            processingConfigSetter.accept(this.processingConfig);
        }

        return this;
    }

    /**
     * Get processingConfig
     * @return processingConfig
     */
    public ProcessingConfigDTO getProcessingConfig() {
        return processingConfig;
    }

    public void setProcessingConfig(ProcessingConfigDTO processingConfig) {
        this.processingConfig = processingConfig;
    }

    public ShowDcPointResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowDcPointResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 最后一次修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDcPointResponse that = (ShowDcPointResponse) obj;
        return Objects.equals(this.pointId, that.pointId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.collectionConfig, that.collectionConfig)
            && Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.property, that.property)
            && Objects.equals(this.dataType, that.dataType) && Objects.equals(this.dsId, that.dsId)
            && Objects.equals(this.processingConfig, that.processingConfig)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointId,
            name,
            collectionConfig,
            deviceId,
            property,
            dataType,
            dsId,
            processingConfig,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDcPointResponse {\n");
        sb.append("    pointId: ").append(toIndentedString(pointId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    collectionConfig: ").append(toIndentedString(collectionConfig)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dsId: ").append(toIndentedString(dsId)).append("\n");
        sb.append("    processingConfig: ").append(toIndentedString(processingConfig)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
