package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AdditionalManifests
 */
public class AdditionalManifests {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_name_modifier")

    private String manifestNameModifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected_outputs")

    private List<String> selectedOutputs = null;

    public AdditionalManifests withManifestNameModifier(String manifestNameModifier) {
        this.manifestNameModifier = manifestNameModifier;
        return this;
    }

    /**
     * 定制的索引后缀名 
     * @return manifestNameModifier
     */
    public String getManifestNameModifier() {
        return manifestNameModifier;
    }

    public void setManifestNameModifier(String manifestNameModifier) {
        this.manifestNameModifier = manifestNameModifier;
    }

    public AdditionalManifests withSelectedOutputs(List<String> selectedOutputs) {
        this.selectedOutputs = selectedOutputs;
        return this;
    }

    public AdditionalManifests addSelectedOutputsItem(String selectedOutputsItem) {
        if (this.selectedOutputs == null) {
            this.selectedOutputs = new ArrayList<>();
        }
        this.selectedOutputs.add(selectedOutputsItem);
        return this;
    }

    public AdditionalManifests withSelectedOutputs(Consumer<List<String>> selectedOutputsSetter) {
        if (this.selectedOutputs == null) {
            this.selectedOutputs = new ArrayList<>();
        }
        selectedOutputsSetter.accept(this.selectedOutputs);
        return this;
    }

    /**
     * 选择的流名称
     * @return selectedOutputs
     */
    public List<String> getSelectedOutputs() {
        return selectedOutputs;
    }

    public void setSelectedOutputs(List<String> selectedOutputs) {
        this.selectedOutputs = selectedOutputs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdditionalManifests that = (AdditionalManifests) obj;
        return Objects.equals(this.manifestNameModifier, that.manifestNameModifier)
            && Objects.equals(this.selectedOutputs, that.selectedOutputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manifestNameModifier, selectedOutputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalManifests {\n");
        sb.append("    manifestNameModifier: ").append(toIndentedString(manifestNameModifier)).append("\n");
        sb.append("    selectedOutputs: ").append(toIndentedString(selectedOutputs)).append("\n");
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
