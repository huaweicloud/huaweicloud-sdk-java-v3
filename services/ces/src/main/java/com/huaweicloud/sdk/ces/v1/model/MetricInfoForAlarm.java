package com.huaweicloud.sdk.ces.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.MetricInfo;
import com.huaweicloud.sdk.ces.v1.model.MetricsDimension;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建规则中的监控指标信息
 */
public class MetricInfoForAlarm  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensions")
    
    private List<MetricsDimension> dimensions = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_name")
    
    private String metricName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_group_id")
    
    private String resourceGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_group_name")
    
    private String resourceGroupName;

    public MetricInfoForAlarm withDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    
    public MetricInfoForAlarm addDimensionsItem(MetricsDimension dimensionsItem) {
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public MetricInfoForAlarm withDimensions(Consumer<List<MetricsDimension>> dimensionsSetter) {
        if(this.dimensions == null ){
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 指标维度
     * @return dimensions
     */
    public List<MetricsDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
    }

    public MetricInfoForAlarm withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * 指标名称，必须以字母开头，只能包含0-9/a-z/A-Z/_，长度最短为1，最大为64。  具体指标名请参见查询指标列表中查询出的指标名。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public MetricInfoForAlarm withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 指标命名空间，，例如弹性云服务器命名空间。格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_，总长度最短为3，最大为32。说明： 当alarm_type为（EVENT.SYS| EVENT.CUSTOM）时允许为空。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public MetricInfoForAlarm withResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    


    /**
     * 创建告警规则是选择的资源分组ID，如：rg1603786526428bWbVmk4rP
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
     * 创建告警规则是选择的资源分组名称，如：Resource-Group-ECS-01
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
        return Objects.equals(this.dimensions, metricInfoForAlarm.dimensions) &&
            Objects.equals(this.metricName, metricInfoForAlarm.metricName) &&
            Objects.equals(this.namespace, metricInfoForAlarm.namespace) &&
            Objects.equals(this.resourceGroupId, metricInfoForAlarm.resourceGroupId) &&
            Objects.equals(this.resourceGroupName, metricInfoForAlarm.resourceGroupName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dimensions, metricName, namespace, resourceGroupId, resourceGroupName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricInfoForAlarm {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

