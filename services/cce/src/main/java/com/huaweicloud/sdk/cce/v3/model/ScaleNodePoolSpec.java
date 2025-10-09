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
     * 节点池期望节点数
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
     * **参数解释**： 要扩缩容的节点池中的伸缩组名称[，通过[获取指定的节点池](cce_02_0355.xml)接口获取伸缩组名称](tag:hws) **约束限制**： 如果要伸缩默认伸缩组填\"default\" **取值范围**： 不涉及 **默认取值**： 不涉及
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
