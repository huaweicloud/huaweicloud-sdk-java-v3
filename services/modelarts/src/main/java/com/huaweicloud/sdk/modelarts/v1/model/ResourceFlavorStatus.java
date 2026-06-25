package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源规格状态信息。
 */
public class ResourceFlavorStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private Map<String, String> phase = null;

    public ResourceFlavorStatus withPhase(Map<String, String> phase) {
        this.phase = phase;
        return this;
    }

    public ResourceFlavorStatus putPhaseItem(String key, String phaseItem) {
        if (this.phase == null) {
            this.phase = new HashMap<>();
        }
        this.phase.put(key, phaseItem);
        return this;
    }

    public ResourceFlavorStatus withPhase(Consumer<Map<String, String>> phaseSetter) {
        if (this.phase == null) {
            this.phase = new HashMap<>();
        }
        phaseSetter.accept(this.phase);
        return this;
    }

    /**
     * **参数解释**：资源规格的容量状态，格式为key/value键值对。其中，key为az编码，value为对应az资源的状态，可选值如下： - normal：正常。 - soldout：售罄
     * @return phase
     */
    public Map<String, String> getPhase() {
        return phase;
    }

    public void setPhase(Map<String, String> phase) {
        this.phase = phase;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceFlavorStatus that = (ResourceFlavorStatus) obj;
        return Objects.equals(this.phase, that.phase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceFlavorStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
