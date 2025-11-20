package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 伸缩节点池请求详细参数
 */
public class ScaleNodePoolSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desiredNodeCount")

    private Integer desiredNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaleGroups")

    private List<String> scaleGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private ScaleNodePoolOptions options;

    public ScaleNodePoolSpec withDesiredNodeCount(Integer desiredNodeCount) {
        this.desiredNodeCount = desiredNodeCount;
        return this;
    }

    /**
     * **参数解释**： 节点池的预期总数量。执行扩容操作时，需将当前节点数与扩容数量相加；执行缩容操作时，需从当前节点数中减去缩容数量。 **约束限制**： 必填参数，如果省略则默认值为0，会导致删除节点池伸缩组下的所有节点 **取值范围**： 0或正整数 **默认取值**： 0
     * @return desiredNodeCount
     */
    public Integer getDesiredNodeCount() {
        return desiredNodeCount;
    }

    public void setDesiredNodeCount(Integer desiredNodeCount) {
        this.desiredNodeCount = desiredNodeCount;
    }

    public ScaleNodePoolSpec withScaleGroups(List<String> scaleGroups) {
        this.scaleGroups = scaleGroups;
        return this;
    }

    public ScaleNodePoolSpec addScaleGroupsItem(String scaleGroupsItem) {
        if (this.scaleGroups == null) {
            this.scaleGroups = new ArrayList<>();
        }
        this.scaleGroups.add(scaleGroupsItem);
        return this;
    }

    public ScaleNodePoolSpec withScaleGroups(Consumer<List<String>> scaleGroupsSetter) {
        if (this.scaleGroups == null) {
            this.scaleGroups = new ArrayList<>();
        }
        scaleGroupsSetter.accept(this.scaleGroups);
        return this;
    }

    /**
     * **参数解释**： 要扩缩容的节点池中的伸缩组名称，通过[获取指定的节点池](cce_02_0355.xml)接口获取伸缩组名称。扩容时可选择多个伸缩组，系统将按照尽量均分或随机策略在所选伸缩组间分配扩容节点数，缩容时则仅能指定单个伸缩组进行操作。 **约束限制**： 如果要伸缩默认伸缩组填\"default\" **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return scaleGroups
     */
    public List<String> getScaleGroups() {
        return scaleGroups;
    }

    public void setScaleGroups(List<String> scaleGroups) {
        this.scaleGroups = scaleGroups;
    }

    public ScaleNodePoolSpec withOptions(ScaleNodePoolOptions options) {
        this.options = options;
        return this;
    }

    public ScaleNodePoolSpec withOptions(Consumer<ScaleNodePoolOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new ScaleNodePoolOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public ScaleNodePoolOptions getOptions() {
        return options;
    }

    public void setOptions(ScaleNodePoolOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScaleNodePoolSpec that = (ScaleNodePoolSpec) obj;
        return Objects.equals(this.desiredNodeCount, that.desiredNodeCount)
            && Objects.equals(this.scaleGroups, that.scaleGroups) && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desiredNodeCount, scaleGroups, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleNodePoolSpec {\n");
        sb.append("    desiredNodeCount: ").append(toIndentedString(desiredNodeCount)).append("\n");
        sb.append("    scaleGroups: ").append(toIndentedString(scaleGroups)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
