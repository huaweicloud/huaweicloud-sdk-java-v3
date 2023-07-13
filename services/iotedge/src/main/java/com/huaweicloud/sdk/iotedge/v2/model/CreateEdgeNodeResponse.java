package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateEdgeNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_node_id")

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_id")

    private String spaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installer_version")

    private String installerVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_path")

    private BasePathDTO basePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips")

    private List<String> ips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hardware_model")

    private String hardwareModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_data_format")

    private String deviceDataFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "automatic_upgrade")

    private String automaticUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_data_record")

    private DeviceDataRecord deviceDataRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_report")

    private String metricReport;

    public CreateEdgeNodeResponse withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    /**
     * 边缘节点ID
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    public CreateEdgeNodeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘节点名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateEdgeNodeResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。物理多租下各实例的唯一标识，一般华为云租户无需携带该参数，仅在物理多租场景下从管理面访问API时需要携带该参数。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateEdgeNodeResponse withSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    /**
     * 资源空间id，对应IOTDA云服务接口参数中的app_id。
     * @return spaceId
     */
    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public CreateEdgeNodeResponse withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 边缘节点关联的产品ID，用于唯一标识一个产品模型。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateEdgeNodeResponse withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 边缘节点关联的产品名称。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public CreateEdgeNodeResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 边缘节点状态UNINSTALLED|INSTALLED|OFFLINE|ONLINE|DELETING|FROZEN
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CreateEdgeNodeResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 节点所属资源类型：advanced|standard
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateEdgeNodeResponse withInstallerVersion(String installerVersion) {
        this.installerVersion = installerVersion;
        return this;
    }

    /**
     * 安装文件版本
     * @return installerVersion
     */
    public String getInstallerVersion() {
        return installerVersion;
    }

    public void setInstallerVersion(String installerVersion) {
        this.installerVersion = installerVersion;
    }

    public CreateEdgeNodeResponse withBasePath(BasePathDTO basePath) {
        this.basePath = basePath;
        return this;
    }

    public CreateEdgeNodeResponse withBasePath(Consumer<BasePathDTO> basePathSetter) {
        if (this.basePath == null) {
            this.basePath = new BasePathDTO();
            basePathSetter.accept(this.basePath);
        }

        return this;
    }

    /**
     * Get basePath
     * @return basePath
     */
    public BasePathDTO getBasePath() {
        return basePath;
    }

    public void setBasePath(BasePathDTO basePath) {
        this.basePath = basePath;
    }

    public CreateEdgeNodeResponse withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public CreateEdgeNodeResponse addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public CreateEdgeNodeResponse withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 资源id列表，创建节点时需绑定已购买的资源包，可以叠加节点功能。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public CreateEdgeNodeResponse withIps(List<String> ips) {
        this.ips = ips;
        return this;
    }

    public CreateEdgeNodeResponse addIpsItem(String ipsItem) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    public CreateEdgeNodeResponse withIps(Consumer<List<String>> ipsSetter) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        ipsSetter.accept(this.ips);
        return this;
    }

    /**
     * 边缘节点ip列表
     * @return ips
     */
    public List<String> getIps() {
        return ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    public CreateEdgeNodeResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 边缘节点创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateEdgeNodeResponse withHardwareModel(String hardwareModel) {
        this.hardwareModel = hardwareModel;
        return this;
    }

    /**
     * 注册节点网关配置
     * @return hardwareModel
     */
    public String getHardwareModel() {
        return hardwareModel;
    }

    public void setHardwareModel(String hardwareModel) {
        this.hardwareModel = hardwareModel;
    }

    public CreateEdgeNodeResponse withDeviceDataFormat(String deviceDataFormat) {
        this.deviceDataFormat = deviceDataFormat;
        return this;
    }

    /**
     * 节点使用的数据格式，默认为iotda物模型1.0格式，可以选择属性平铺数据格式flat_json
     * @return deviceDataFormat
     */
    public String getDeviceDataFormat() {
        return deviceDataFormat;
    }

    public void setDeviceDataFormat(String deviceDataFormat) {
        this.deviceDataFormat = deviceDataFormat;
    }

    public CreateEdgeNodeResponse withAutomaticUpgrade(String automaticUpgrade) {
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

    public CreateEdgeNodeResponse withDeviceDataRecord(DeviceDataRecord deviceDataRecord) {
        this.deviceDataRecord = deviceDataRecord;
        return this;
    }

    public CreateEdgeNodeResponse withDeviceDataRecord(Consumer<DeviceDataRecord> deviceDataRecordSetter) {
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

    public CreateEdgeNodeResponse withMetricReport(String metricReport) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEdgeNodeResponse that = (CreateEdgeNodeResponse) obj;
        return Objects.equals(this.edgeNodeId, that.edgeNodeId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.spaceId, that.spaceId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.state, that.state) && Objects.equals(this.type, that.type)
            && Objects.equals(this.installerVersion, that.installerVersion)
            && Objects.equals(this.basePath, that.basePath) && Objects.equals(this.resourceIds, that.resourceIds)
            && Objects.equals(this.ips, that.ips) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.hardwareModel, that.hardwareModel)
            && Objects.equals(this.deviceDataFormat, that.deviceDataFormat)
            && Objects.equals(this.automaticUpgrade, that.automaticUpgrade)
            && Objects.equals(this.deviceDataRecord, that.deviceDataRecord)
            && Objects.equals(this.metricReport, that.metricReport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId,
            name,
            instanceId,
            spaceId,
            productId,
            productName,
            state,
            type,
            installerVersion,
            basePath,
            resourceIds,
            ips,
            createTime,
            hardwareModel,
            deviceDataFormat,
            automaticUpgrade,
            deviceDataRecord,
            metricReport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeNodeResponse {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    installerVersion: ").append(toIndentedString(installerVersion)).append("\n");
        sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    hardwareModel: ").append(toIndentedString(hardwareModel)).append("\n");
        sb.append("    deviceDataFormat: ").append(toIndentedString(deviceDataFormat)).append("\n");
        sb.append("    automaticUpgrade: ").append(toIndentedString(automaticUpgrade)).append("\n");
        sb.append("    deviceDataRecord: ").append(toIndentedString(deviceDataRecord)).append("\n");
        sb.append("    metricReport: ").append(toIndentedString(metricReport)).append("\n");
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
