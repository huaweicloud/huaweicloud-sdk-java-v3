package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 资源池资源项。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class WorkloadResourceItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_value")

    private Integer resourceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_unit")

    private String valueUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_description")

    private String resourceDescription;

    public WorkloadResourceItem withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * **参数解释**： 资源名称。 **约束限制**： 不涉及。 **取值范围**： cpu：占用CPU时间片的百分比。 cpu_limit：使用CPU物理核数的百分比。 memory：指每个数据节点上可用内存资源的百分比。 concurrency：并发数。 shortQueryConcurrencyNum：简单语句并发数。 weight：网络调度时权重值。 **默认取值**： 不涉及。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public WorkloadResourceItem withResourceValue(Integer resourceValue) {
        this.resourceValue = resourceValue;
        return this;
    }

    /**
     * **参数解释**： 资源属性值。 **约束限制**： 不涉及。 **取值范围**： 根据配置不同，取值范围不同 cpu：取值范围为1~99的整数。 cpu_limit：取值范围为0~100的整数，0表示不限制。 memory：取值范围为0~100的整数，0表示不管控。 concurrency：取值范围为-1~2147483647的整数，-1/0表示不限制。 shortQueryConcurrencyNum：取值范围为-1~2147483647的整数，-1/0表示不管控。 weight：取值范围为1~2147483647的整数，默认配置为-1。 **默认取值**： 不涉及。
     * @return resourceValue
     */
    public Integer getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(Integer resourceValue) {
        this.resourceValue = resourceValue;
    }

    public WorkloadResourceItem withValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
        return this;
    }

    /**
     * **参数解释**： 资源属性单位。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return valueUnit
     */
    public String getValueUnit() {
        return valueUnit;
    }

    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
    }

    public WorkloadResourceItem withResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
        return this;
    }

    /**
     * **参数解释**： 资源附加描述。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return resourceDescription
     */
    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadResourceItem that = (WorkloadResourceItem) obj;
        return Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceValue, that.resourceValue) && Objects.equals(this.valueUnit, that.valueUnit)
            && Objects.equals(this.resourceDescription, that.resourceDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceName, resourceValue, valueUnit, resourceDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadResourceItem {\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceValue: ").append(toIndentedString(resourceValue)).append("\n");
        sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
        sb.append("    resourceDescription: ").append(toIndentedString(resourceDescription)).append("\n");
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
