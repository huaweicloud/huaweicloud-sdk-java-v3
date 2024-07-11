package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 扩展伸缩组弹性伸缩配置
 */
public class ScaleGroupAutoscaling {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extensionPriority")

    private Integer extensionPriority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minNodeCount")

    private Integer minNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxNodeCount")

    private Integer maxNodeCount;

    public ScaleGroupAutoscaling withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 伸缩组弹性扩缩容启用开关，默认不开启
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ScaleGroupAutoscaling withExtensionPriority(Integer extensionPriority) {
        this.extensionPriority = extensionPriority;
        return this;
    }

    /**
     * 伸缩组优先级，未设置则默认为0，数值越大优先级越高
     * @return extensionPriority
     */
    public Integer getExtensionPriority() {
        return extensionPriority;
    }

    public void setExtensionPriority(Integer extensionPriority) {
        this.extensionPriority = extensionPriority;
    }

    public ScaleGroupAutoscaling withMinNodeCount(Integer minNodeCount) {
        this.minNodeCount = minNodeCount;
        return this;
    }

    /**
     * 弹性伸缩时，伸缩组最少应保持的节点数量，必须大于0
     * @return minNodeCount
     */
    public Integer getMinNodeCount() {
        return minNodeCount;
    }

    public void setMinNodeCount(Integer minNodeCount) {
        this.minNodeCount = minNodeCount;
    }

    public ScaleGroupAutoscaling withMaxNodeCount(Integer maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
        return this;
    }

    /**
     * 弹性伸缩时，伸缩组最多可保持的节点数量，应大于等于 **minNodeCount**, 不可大于集群规格所允许的节点上限，不可大于节点池节点数量上限
     * @return maxNodeCount
     */
    public Integer getMaxNodeCount() {
        return maxNodeCount;
    }

    public void setMaxNodeCount(Integer maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScaleGroupAutoscaling that = (ScaleGroupAutoscaling) obj;
        return Objects.equals(this.enable, that.enable)
            && Objects.equals(this.extensionPriority, that.extensionPriority)
            && Objects.equals(this.minNodeCount, that.minNodeCount)
            && Objects.equals(this.maxNodeCount, that.maxNodeCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, extensionPriority, minNodeCount, maxNodeCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleGroupAutoscaling {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    extensionPriority: ").append(toIndentedString(extensionPriority)).append("\n");
        sb.append("    minNodeCount: ").append(toIndentedString(minNodeCount)).append("\n");
        sb.append("    maxNodeCount: ").append(toIndentedString(maxNodeCount)).append("\n");
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
