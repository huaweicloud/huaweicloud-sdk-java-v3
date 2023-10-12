package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Selector
 */
public class Selector {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fieldSelector")

    private FieldSelector fieldSelector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelSelector")

    private LabelSelector labelSelector;

    public Selector withFieldSelector(FieldSelector fieldSelector) {
        this.fieldSelector = fieldSelector;
        return this;
    }

    public Selector withFieldSelector(Consumer<FieldSelector> fieldSelectorSetter) {
        if (this.fieldSelector == null) {
            this.fieldSelector = new FieldSelector();
            fieldSelectorSetter.accept(this.fieldSelector);
        }

        return this;
    }

    /**
     * Get fieldSelector
     * @return fieldSelector
     */
    public FieldSelector getFieldSelector() {
        return fieldSelector;
    }

    public void setFieldSelector(FieldSelector fieldSelector) {
        this.fieldSelector = fieldSelector;
    }

    public Selector withLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    public Selector withLabelSelector(Consumer<LabelSelector> labelSelectorSetter) {
        if (this.labelSelector == null) {
            this.labelSelector = new LabelSelector();
            labelSelectorSetter.accept(this.labelSelector);
        }

        return this;
    }

    /**
     * Get labelSelector
     * @return labelSelector
     */
    public LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Selector that = (Selector) obj;
        return Objects.equals(this.fieldSelector, that.fieldSelector)
            && Objects.equals(this.labelSelector, that.labelSelector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldSelector, labelSelector);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Selector {\n");
        sb.append("    fieldSelector: ").append(toIndentedString(fieldSelector)).append("\n");
        sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
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
