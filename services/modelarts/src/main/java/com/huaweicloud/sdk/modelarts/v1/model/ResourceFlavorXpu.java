package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 算力卡信息，包含类型、卡数、单卡显存等
 */
public class ResourceFlavorXpu {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card")

    private String card;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chip")

    private String chip;

    public ResourceFlavorXpu withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：卡类型。 **取值范围**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceFlavorXpu withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：芯片数量。reseverd for backwards compatibility **取值范围**：不涉及。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ResourceFlavorXpu withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：单卡显存大小。 **取值范围**：不涉及。
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public ResourceFlavorXpu withCard(String card) {
        this.card = card;
        return this;
    }

    /**
     * **参数解释**：卡数量。 **取值范围**：不涉及。
     * @return card
     */
    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public ResourceFlavorXpu withChip(String chip) {
        this.chip = chip;
        return this;
    }

    /**
     * **参数解释**：芯片数量。值同size字段一致。 **取值范围**：不涉及。
     * @return chip
     */
    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceFlavorXpu that = (ResourceFlavorXpu) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.size, that.size)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.card, that.card)
            && Objects.equals(this.chip, that.chip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, size, memory, card, chip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceFlavorXpu {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    card: ").append(toIndentedString(card)).append("\n");
        sb.append("    chip: ").append(toIndentedString(chip)).append("\n");
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
