package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NewExtensionDataSourceBindings
 */
public class NewExtensionDataSourceBindings {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpointId")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_name")

    private String dataSourceName;

    public NewExtensionDataSourceBindings withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * **参数解释**： 目标地址。 **取值范围**： 不涉及。 
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public NewExtensionDataSourceBindings withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**： 扩展点id。 **取值范围**： 不涉及。 
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public NewExtensionDataSourceBindings withDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }

    /**
     * **参数解释**： 数据源绑定名称。 **取值范围**： 不涉及。 
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NewExtensionDataSourceBindings that = (NewExtensionDataSourceBindings) obj;
        return Objects.equals(this.target, that.target) && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.dataSourceName, that.dataSourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target, endpointId, dataSourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewExtensionDataSourceBindings {\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    dataSourceName: ").append(toIndentedString(dataSourceName)).append("\n");
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
