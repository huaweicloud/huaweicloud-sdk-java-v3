package com.huaweicloud.sdk.nlp.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.Slot;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class IntentResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    
    private Float confidence;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    
    private String label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slots")
    
    
    private List<Slot> slots = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="text")
    
    
    private String text;

    public IntentResult withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * 标签label的置信度。
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    

    public IntentResult withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * 文本的意图标签。标签共有以下9类，取值如下： weather：天气 time：报时 news：新闻 joke：笑话 translation：翻译 notification：提醒 alarm：闹钟 music：音乐 other：其它
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    

    public IntentResult withSlots(List<Slot> slots) {
        this.slots = slots;
        return this;
    }

    
    public IntentResult addSlotsItem(Slot slotsItem) {
        if(this.slots == null) {
            this.slots = new ArrayList<>();
        }
        this.slots.add(slotsItem);
        return this;
    }

    public IntentResult withSlots(Consumer<List<Slot>> slotsSetter) {
        if(this.slots == null) {
            this.slots = new ArrayList<>();
        }
        slotsSetter.accept(this.slots);
        return this;
    }

    /**
     * slot数据结构
     * @return slots
     */
    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    

    public IntentResult withText(String text) {
        this.text = text;
        return this;
    }

    


    /**
     * 返回待分析文本。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntentResult intentResult = (IntentResult) o;
        return Objects.equals(this.confidence, intentResult.confidence) &&
            Objects.equals(this.label, intentResult.label) &&
            Objects.equals(this.slots, intentResult.slots) &&
            Objects.equals(this.text, intentResult.text);
    }
    @Override
    public int hashCode() {
        return Objects.hash(confidence, label, slots, text);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntentResult {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

