package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MultiViewModelMasterIdModifierDTO
 */
public class MultiViewModelMasterIdModifierDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masterId")

    private String masterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private ObjectReferenceParamDTO item;

    public MultiViewModelMasterIdModifierDTO withMasterId(String masterId) {
        this.masterId = masterId;
        return this;
    }

    /**
     * 主对象ID。
     * @return masterId
     */
    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public MultiViewModelMasterIdModifierDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * 处理人。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public MultiViewModelMasterIdModifierDTO withItem(ObjectReferenceParamDTO item) {
        this.item = item;
        return this;
    }

    public MultiViewModelMasterIdModifierDTO withItem(Consumer<ObjectReferenceParamDTO> itemSetter) {
        if (this.item == null) {
            this.item = new ObjectReferenceParamDTO();
            itemSetter.accept(this.item);
        }

        return this;
    }

    /**
     * Get item
     * @return item
     */
    public ObjectReferenceParamDTO getItem() {
        return item;
    }

    public void setItem(ObjectReferenceParamDTO item) {
        this.item = item;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiViewModelMasterIdModifierDTO that = (MultiViewModelMasterIdModifierDTO) obj;
        return Objects.equals(this.masterId, that.masterId) && Objects.equals(this.modifier, that.modifier)
            && Objects.equals(this.item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterId, modifier, item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiViewModelMasterIdModifierDTO {\n");
        sb.append("    masterId: ").append(toIndentedString(masterId)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
