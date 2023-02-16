package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.SlotValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CurrentSlot  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slot_id")
    
    
    private String slotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slot_name")
    
    
    private String slotName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slot_values")
    
    
    private List<SlotValue> slotValues = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slot_identification")
    
    
    private String slotIdentification;

    public CurrentSlot withSlotId(String slotId) {
        this.slotId = slotId;
        return this;
    }

    


    /**
     * 槽位ID。
     * @return slotId
     */
    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    

    public CurrentSlot withSlotName(String slotName) {
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

    

    public CurrentSlot withSlotValues(List<SlotValue> slotValues) {
        this.slotValues = slotValues;
        return this;
    }

    
    public CurrentSlot addSlotValuesItem(SlotValue slotValuesItem) {
        if(this.slotValues == null) {
            this.slotValues = new ArrayList<>();
        }
        this.slotValues.add(slotValuesItem);
        return this;
    }

    public CurrentSlot withSlotValues(Consumer<List<SlotValue>> slotValuesSetter) {
        if(this.slotValues == null) {
            this.slotValues = new ArrayList<>();
        }
        slotValuesSetter.accept(this.slotValues);
        return this;
    }

    /**
     * 槽位值。
     * @return slotValues
     */
    public List<SlotValue> getSlotValues() {
        return slotValues;
    }

    public void setSlotValues(List<SlotValue> slotValues) {
        this.slotValues = slotValues;
    }

    

    public CurrentSlot withSlotIdentification(String slotIdentification) {
        this.slotIdentification = slotIdentification;
        return this;
    }

    


    /**
     * 槽位标识。
     * @return slotIdentification
     */
    public String getSlotIdentification() {
        return slotIdentification;
    }

    public void setSlotIdentification(String slotIdentification) {
        this.slotIdentification = slotIdentification;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrentSlot currentSlot = (CurrentSlot) o;
        return Objects.equals(this.slotId, currentSlot.slotId) &&
            Objects.equals(this.slotName, currentSlot.slotName) &&
            Objects.equals(this.slotValues, currentSlot.slotValues) &&
            Objects.equals(this.slotIdentification, currentSlot.slotIdentification);
    }
    @Override
    public int hashCode() {
        return Objects.hash(slotId, slotName, slotValues, slotIdentification);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrentSlot {\n");
        sb.append("    slotId: ").append(toIndentedString(slotId)).append("\n");
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

