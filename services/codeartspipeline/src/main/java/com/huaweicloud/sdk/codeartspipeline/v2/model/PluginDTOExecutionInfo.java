package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 执行信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
 */
public class PluginDTOExecutionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_execution_info")

    private PluginDTOExecutionInfoInnerExecutionInfo innerExecutionInfo;

    public PluginDTOExecutionInfo withInnerExecutionInfo(PluginDTOExecutionInfoInnerExecutionInfo innerExecutionInfo) {
        this.innerExecutionInfo = innerExecutionInfo;
        return this;
    }

    public PluginDTOExecutionInfo withInnerExecutionInfo(
        Consumer<PluginDTOExecutionInfoInnerExecutionInfo> innerExecutionInfoSetter) {
        if (this.innerExecutionInfo == null) {
            this.innerExecutionInfo = new PluginDTOExecutionInfoInnerExecutionInfo();
            innerExecutionInfoSetter.accept(this.innerExecutionInfo);
        }

        return this;
    }

    /**
     * Get innerExecutionInfo
     * @return innerExecutionInfo
     */
    public PluginDTOExecutionInfoInnerExecutionInfo getInnerExecutionInfo() {
        return innerExecutionInfo;
    }

    public void setInnerExecutionInfo(PluginDTOExecutionInfoInnerExecutionInfo innerExecutionInfo) {
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
