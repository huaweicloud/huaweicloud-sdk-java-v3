package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建规则中的监控指标信息
 */
public class MetricInfoForAlarm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    @JacksonXmlProperty(localName = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    @JacksonXmlProperty(localName = "dimensions")

    private List<MetricsDimension> dimensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_group_id")

    @JacksonXmlProperty(localName = "resource_group_id")

    private String resourceGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_group_name")

    @JacksonXmlProperty(localName = "resource_group_name")

    private String resourceGroupName;

    public MetricInfoForAlarm withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 服务指标命名空间，格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_，字符总长度最短为3，最大为32。说明： 当alarm_type为（EVENT.SYS| EVENT.CUSTOM）时允许为空；如：弹性云服务器的命名空间为SYS.ECS，文档数据库的命名空间为SYS.DDS，各服务的命名空间可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public MetricInfoForAlarm withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 资源的监控指标名称，必须以字母开头，只能包含0-9/a-z/A-Z/_，字符长度最短为1，最大为64；如：弹性云服务器中的监控指标cpu_util，表示弹性服务器的CPU使用率；文档数据库中的指标mongo001_command_ps，表示command执行频率；各服务的指标名称可查看：“[服务指标名称](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public MetricInfoForAlarm withDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public MetricInfoForAlarm addDimensionsItem(MetricsDimension dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public MetricInfoForAlarm withDimensions(Consumer<List<MetricsDimension>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 指标维度，目前最大可添加4个维度。
     * @return dimensions
     */
    public List<MetricsDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
    }

    public MetricInfoForAlarm withResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    /**
     * 创建告警规则时选择的资源分组ID，如：rg1603786526428bWbVmk4rP；如果根据资源分组创建告警规则，则resource_group_id不能为空，且alarm_type值为RESOURCE_GROUP
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public MetricInfoForAlarm withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * 创建告警规则时选择的资源分组名称，如：Resource-Group-ECS-01
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return resourceGroupName;
    }

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricInfoForAlarm metricInfoForAlarm = (MetricInfoForAlarm) o;
        return Objects.equals(this.namespace, metricInfoForAlarm.namespace)
            && Objects.equals(this.metricName, metricInfoForAlarm.metricName)
            && Objects.equals(this.dimensions, metricInfoForAlarm.dimensions)
            && Objects.equals(this.resourceGroupId, metricInfoForAlarm.resourceGroupId)
            && Objects.equals(this.resourceGroupName, metricInfoForAlarm.resourceGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, metricName, dimensions, resourceGroupId, resourceGroupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricInfoForAlarm {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    resourceGroupId: ").append(toIndentedString(resourceGroupId)).append("\n");
        sb.append("    resourceGroupName: ").append(toIndentedString(resourceGroupName)).append("\n");
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
