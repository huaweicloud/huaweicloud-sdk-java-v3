package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：创建Flink Savepoint的请求参数。 **约束限制**：不涉及。 
 */
public class CreateFlinkSavepointRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private FlinkSavepointFormat format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drain_mode_enabled")

    private Boolean drainModeEnabled;

    public CreateFlinkSavepointRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：作业快照的描述信息。 **约束限制**：不涉及。 **取值范围**：0~512个字符。 **默认取值**：不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateFlinkSavepointRequestBody withFormat(FlinkSavepointFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get format
     * @return format
     */
    public FlinkSavepointFormat getFormat() {
        return format;
    }

    public void setFormat(FlinkSavepointFormat format) {
        this.format = format;
    }

    public CreateFlinkSavepointRequestBody withDrainModeEnabled(Boolean drainModeEnabled) {
        this.drainModeEnabled = drainModeEnabled;
        return this;
    }

    /**
     * **参数解释**：是否启用Drain模式。启用后，触发Savepoint前将先发送Watermark到所有算子以触发窗口计算完成，然后再保存状态快照。 **约束限制**：不涉及。 **取值范围**：   - true：启用Drain模式。   - false：不启用Drain模式。 **默认取值**：false。 
     * @return drainModeEnabled
     */
    public Boolean getDrainModeEnabled() {
        return drainModeEnabled;
    }

    public void setDrainModeEnabled(Boolean drainModeEnabled) {
        this.drainModeEnabled = drainModeEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFlinkSavepointRequestBody that = (CreateFlinkSavepointRequestBody) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.format, that.format)
            && Objects.equals(this.drainModeEnabled, that.drainModeEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, format, drainModeEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlinkSavepointRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    drainModeEnabled: ").append(toIndentedString(drainModeEnabled)).append("\n");
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
