package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExportContainerListRequestBody
 */
public class ExportContainerListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_container")

    private Boolean clusterContainer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky")

    private Boolean risky;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private ExportContainerListRequestBodyCreateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_limit")

    private String cpuLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_limit")

    private String memoryLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_headers")

    private List<List<String>> exportHeaders = null;

    public ExportContainerListRequestBody withClusterContainer(Boolean clusterContainer) {
        this.clusterContainer = clusterContainer;
        return this;
    }

    /**
     * **参数解释**: 是否是集群内的容器。只导出集群内容器时，设置此参数值为true。只导出非集群容器时，设置此参数为false。 **约束限制**: 不涉及 **取值范围**: true或者false。 **默认取值**: 不涉及 
     * @return clusterContainer
     */
    public Boolean getClusterContainer() {
        return clusterContainer;
    }

    public void setClusterContainer(Boolean clusterContainer) {
        this.clusterContainer = clusterContainer;
    }

    public ExportContainerListRequestBody withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * **参数解释**: 集群类型。 **约束限制**: 不涉及 **取值范围**:   - cce : CCE集群   - ali : 阿里云集群   - tencent : 腾讯云集群   - azure : 微软云集群   - aws : 亚马逊集群   - self_built_hw : 华为云自建集群   - self_built_idc : IDC自建集群    **默认取值**: 不涉及 
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ExportContainerListRequestBody withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**: 所属集群名称。 **约束限制**: 不涉及 **取值范围**: 字符长度1-255。 **默认取值**: 不涉及 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ExportContainerListRequestBody withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**: 容器名称。 **约束限制**: 不涉及 **取值范围**: 字符长度1-255。 **默认取值**: 不涉及 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ExportContainerListRequestBody withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * **参数解释**: 所属Pod名称。 **约束限制**: 不涉及 **取值范围**: 字符长度1-512。 **默认取值**: 不涉及 
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public ExportContainerListRequestBody withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称。 **约束限制**: 不涉及 **取值范围**: 字符长度1-255。 **默认取值**: 不涉及 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ExportContainerListRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 容器状态。 **约束限制**: 不涉及 **取值范围**:   - Running : 运行中   - Waiting : 等待   - Terminated : 终止   - Isolated : 已隔离   - Paused : 已暂停    **默认取值**: 不涉及 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ExportContainerListRequestBody withRisky(Boolean risky) {
        this.risky = risky;
        return this;
    }

    /**
     * **参数解释**: 是否有安全风险。只导出有安全风险容器时，设置此参数值为true。只导出无安全风险容器时，设置此参数为false。 **约束限制**: 不涉及 **取值范围**: true或者false。 **默认取值**: 不涉及 
     * @return risky
     */
    public Boolean getRisky() {
        return risky;
    }

    public void setRisky(Boolean risky) {
        this.risky = risky;
    }

    public ExportContainerListRequestBody withCreateTime(ExportContainerListRequestBodyCreateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    public ExportContainerListRequestBody withCreateTime(
        Consumer<ExportContainerListRequestBodyCreateTime> createTimeSetter) {
        if (this.createTime == null) {
            this.createTime = new ExportContainerListRequestBodyCreateTime();
            createTimeSetter.accept(this.createTime);
        }

        return this;
    }

    /**
     * Get createTime
     * @return createTime
     */
    public ExportContainerListRequestBodyCreateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(ExportContainerListRequestBodyCreateTime createTime) {
        this.createTime = createTime;
    }

    public ExportContainerListRequestBody withCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * **参数解释**: cpu限制。 **约束限制**: 不涉及 **取值范围**: 字符长度0-64。以m为单位，例如100m。 **默认取值**: 不涉及 
     * @return cpuLimit
     */
    public String getCpuLimit() {
        return cpuLimit;
    }

    public void setCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    public ExportContainerListRequestBody withMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }

    /**
     * **参数解释**: 内存限制。 **约束限制**: 不涉及 **取值范围**: 字符长度0-64。以Mi、Gi为单位，例如300Mi。 **默认取值**: 不涉及 
     * @return memoryLimit
     */
    public String getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public ExportContainerListRequestBody withExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
        return this;
    }

    public ExportContainerListRequestBody addExportHeadersItem(List<String> exportHeadersItem) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        this.exportHeaders.add(exportHeadersItem);
        return this;
    }

    public ExportContainerListRequestBody withExportHeaders(Consumer<List<List<String>>> exportHeadersSetter) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        exportHeadersSetter.accept(this.exportHeaders);
        return this;
    }

    /**
     * **参数解释**: 导出容器列表的表头信息。 **约束限制**: 不涉及 **取值范围**: 合法的key值及其对应的表头名称（表头名称可自定义）   - container_id：容器id   - container_name：容器名称   - image_name：镜像名称   - pod_name：所属POD   - cluster_name：所属集群   - cluster_type：集群类型   - status：状态   - risky：是否有安全风险   - low_risk：低危风险   - medium_risk：中危风险   - high_risk：高危风险   - fatal_risk：致命风险   - create_time：创建时间   - restart_count：重启次数   - cpu_limit：CPU限制   - memory_limit：内存限制    **默认取值**: 不涉及 
     * @return exportHeaders
     */
    public List<List<String>> getExportHeaders() {
        return exportHeaders;
    }

    public void setExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportContainerListRequestBody that = (ExportContainerListRequestBody) obj;
        return Objects.equals(this.clusterContainer, that.clusterContainer)
            && Objects.equals(this.clusterType, that.clusterType) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.podName, that.podName)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.risky, that.risky) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.cpuLimit, that.cpuLimit) && Objects.equals(this.memoryLimit, that.memoryLimit)
            && Objects.equals(this.exportHeaders, that.exportHeaders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterContainer,
            clusterType,
            clusterName,
            containerName,
            podName,
            imageName,
            status,
            risky,
            createTime,
            cpuLimit,
            memoryLimit,
            exportHeaders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportContainerListRequestBody {\n");
        sb.append("    clusterContainer: ").append(toIndentedString(clusterContainer)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    risky: ").append(toIndentedString(risky)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    cpuLimit: ").append(toIndentedString(cpuLimit)).append("\n");
        sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
        sb.append("    exportHeaders: ").append(toIndentedString(exportHeaders)).append("\n");
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
