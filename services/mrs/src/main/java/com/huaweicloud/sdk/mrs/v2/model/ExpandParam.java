package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 扩容相关参数
 */
public class ExpandParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_group_name")

    private String nodeGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_bootstrap_scripts")

    private Boolean skipBootstrapScripts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_without_start")

    private Boolean scaleWithoutStart;

    public ExpandParam withNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }

    /**
     * 节点组名称
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return nodeGroupName;
    }

    public void setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
    }

    public ExpandParam withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 扩容节点数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ExpandParam withSkipBootstrapScripts(Boolean skipBootstrapScripts) {
        this.skipBootstrapScripts = skipBootstrapScripts;
        return this;
    }

    /**
     * 扩容时是否在新增节点上跳过执行创建集群时指定的引导操作。未填写时，默认不执行引导操作。
     * @return skipBootstrapScripts
     */
    public Boolean getSkipBootstrapScripts() {
        return skipBootstrapScripts;
    }

    public void setSkipBootstrapScripts(Boolean skipBootstrapScripts) {
        this.skipBootstrapScripts = skipBootstrapScripts;
    }

    public ExpandParam withScaleWithoutStart(Boolean scaleWithoutStart) {
        this.scaleWithoutStart = scaleWithoutStart;
        return this;
    }

    /**
     * 扩容后是否选择不启动扩容节点上的组件。未填写时，默认启动组件。  - true：扩容后不启动组件。 - false：扩容后启动组件。
     * @return scaleWithoutStart
     */
    public Boolean getScaleWithoutStart() {
        return scaleWithoutStart;
    }

    public void setScaleWithoutStart(Boolean scaleWithoutStart) {
        this.scaleWithoutStart = scaleWithoutStart;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExpandParam that = (ExpandParam) obj;
        return Objects.equals(this.nodeGroupName, that.nodeGroupName) && Objects.equals(this.count, that.count)
            && Objects.equals(this.skipBootstrapScripts, that.skipBootstrapScripts)
            && Objects.equals(this.scaleWithoutStart, that.scaleWithoutStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeGroupName, count, skipBootstrapScripts, scaleWithoutStart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandParam {\n");
        sb.append("    nodeGroupName: ").append(toIndentedString(nodeGroupName)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    skipBootstrapScripts: ").append(toIndentedString(skipBootstrapScripts)).append("\n");
        sb.append("    scaleWithoutStart: ").append(toIndentedString(scaleWithoutStart)).append("\n");
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
