package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源分组中的资源信息
 */
public class ResourceGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<MetricsDimension> dimensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusSchema status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    public ResourceGroup withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释** 资源类型。即命名空间，如弹性云服务器的资源命名空间为：SYS.ECS；各服务的命名空间可查看：“[服务命名空间](ces_03_0059.xml)”。 **约束限制** 不涉及 **取值范围** 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。 **默认取值** 不涉及 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ResourceGroup withDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public ResourceGroup addDimensionsItem(MetricsDimension dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public ResourceGroup withDimensions(Consumer<List<MetricsDimension>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * **参数解释** 资源的维度信息 **约束限制** 不超过4个维度 
     * @return dimensions
     */
    public List<MetricsDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
    }

    public ResourceGroup withStatus(StatusSchema status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusSchema getStatus() {
        return status;
    }

    public void setStatus(StatusSchema status) {
        this.status = status;
    }

    public ResourceGroup withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型，默认为0。
     * minimum: 0
     * maximum: 1
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceGroup that = (ResourceGroup) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.dimensions, that.dimensions)
            && Objects.equals(this.status, that.status) && Objects.equals(this.eventType, that.eventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, dimensions, status, eventType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceGroup {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
