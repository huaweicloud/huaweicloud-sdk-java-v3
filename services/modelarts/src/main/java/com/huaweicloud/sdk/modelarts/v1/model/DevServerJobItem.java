package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DevServerJobItem
 */
public class DevServerJobItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private Map<String, String> spec = null;

    public DevServerJobItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：细粒度任务类型。  **取值范围**：- COMMON   - DEVICE_LOG_COLLECT 等
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DevServerJobItem withSpec(Map<String, String> spec) {
        this.spec = spec;
        return this;
    }

    public DevServerJobItem putSpecItem(String key, String specItem) {
        if (this.spec == null) {
            this.spec = new HashMap<>();
        }
        this.spec.put(key, specItem);
        return this;
    }

    public DevServerJobItem withSpec(Consumer<Map<String, String>> specSetter) {
        if (this.spec == null) {
            this.spec = new HashMap<>();
        }
        specSetter.accept(this.spec);
        return this;
    }

    /**
     * **参数解释**：任务所需参数。
     * @return spec
     */
    public Map<String, String> getSpec() {
        return spec;
    }

    public void setSpec(Map<String, String> spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DevServerJobItem that = (DevServerJobItem) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevServerJobItem {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
