package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class HistorySlot {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slot_name")

    private String slotName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slot_values")

    private List<HistorySlotWord> slotValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slot_identification")

    private String slotIdentification;

    public HistorySlot withSlotName(String slotName) {
        this.slotName = slotName;
        return this;
    }

    /**
     * 槽位名称。
     * @return slotName
     */
    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public HistorySlot withSlotValues(List<HistorySlotWord> slotValues) {
        this.slotValues = slotValues;
        return this;
    }

    public HistorySlot addSlotValuesItem(HistorySlotWord slotValuesItem) {
        if (this.slotValues == null) {
            this.slotValues = new ArrayList<>();
        }
        this.slotValues.add(slotValuesItem);
        return this;
    }

    public HistorySlot withSlotValues(Consumer<List<HistorySlotWord>> slotValuesSetter) {
        if (this.slotValues == null) {
            this.slotValues = new ArrayList<>();
        }
        slotValuesSetter.accept(this.slotValues);
        return this;
    }

    /**
     * 槽信息。
     * @return slotValues
     */
    public List<HistorySlotWord> getSlotValues() {
        return slotValues;
    }

    public void setSlotValues(List<HistorySlotWord> slotValues) {
        this.slotValues = slotValues;
    }

    public HistorySlot withSlotIdentification(String slotIdentification) {
        this.slotIdentification = slotIdentification;
        return this;
    }

    /**
     * 用户设置的槽位标识。
     * @return slotIdentification
     */
    public String getSlotIdentification() {
        return slotIdentification;
    }

    public void setSlotIdentification(String slotIdentification) {
        this.slotIdentification = slotIdentification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HistorySlot that = (HistorySlot) obj;
        return Objects.equals(this.slotName, that.slotName) && Objects.equals(this.slotValues, that.slotValues)
            && Objects.equals(this.slotIdentification, that.slotIdentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slotName, slotValues, slotIdentification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistorySlot {\n");
        sb.append("    slotName: ").append(toIndentedString(slotName)).append("\n");
        sb.append("    slotValues: ").append(toIndentedString(slotValues)).append("\n");
        sb.append("    slotIdentification: ").append(toIndentedString(slotIdentification)).append("\n");
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
