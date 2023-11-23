package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 执行信息
 */
public class PluginDTOExecutionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_execution_info")

    private Object innerExecutionInfo;

    public PluginDTOExecutionInfo withInnerExecutionInfo(Object innerExecutionInfo) {
        this.innerExecutionInfo = innerExecutionInfo;
        return this;
    }

    /**
     * 执行信息
     * @return innerExecutionInfo
     */
    public Object getInnerExecutionInfo() {
        return innerExecutionInfo;
    }

    public void setInnerExecutionInfo(Object innerExecutionInfo) {
        this.innerExecutionInfo = innerExecutionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginDTOExecutionInfo that = (PluginDTOExecutionInfo) obj;
        return Objects.equals(this.innerExecutionInfo, that.innerExecutionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(innerExecutionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginDTOExecutionInfo {\n");
        sb.append("    innerExecutionInfo: ").append(toIndentedString(innerExecutionInfo)).append("\n");
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
