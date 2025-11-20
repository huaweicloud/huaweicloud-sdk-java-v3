package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * RelatedDnVO
 */
public class RelatedDnVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume_size")

    private BigDecimal dataVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    public RelatedDnVO withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * DN实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public RelatedDnVO withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * DN实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public RelatedDnVO withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * DN实例状态。
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public RelatedDnVO withDataVolumeSize(BigDecimal dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
        return this;
    }

    /**
     * 磁盘大小。
     * minimum: 1
     * maximum: 9223372036854775807
     * @return dataVolumeSize
     */
    public BigDecimal getDataVolumeSize() {
        return dataVolumeSize;
    }

    public void setDataVolumeSize(BigDecimal dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
    }

    public RelatedDnVO withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public RelatedDnVO withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 引擎名称。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelatedDnVO that = (RelatedDnVO) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.instanceStatus, that.instanceStatus)
            && Objects.equals(this.dataVolumeSize, that.dataVolumeSize) && Objects.equals(this.version, that.version)
            && Objects.equals(this.engineName, that.engineName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, instanceStatus, dataVolumeSize, version, engineName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedDnVO {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    dataVolumeSize: ").append(toIndentedString(dataVolumeSize)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
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
