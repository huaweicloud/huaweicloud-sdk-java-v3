package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分子约束
 */
public class WeakConstraintDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private WeakConstraintType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bool")

    private Boolean bool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range")

    private List<Float> range = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "struct")

    private StructureConstraintParamsDto struct;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quantiles")

    private List<Float> quantiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interaction")

    private InteractionConstraintDto interaction;

    public WeakConstraintDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自定义模型id，仅弱约束为模型时填写
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WeakConstraintDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 属性名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeakConstraintDto withType(WeakConstraintType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public WeakConstraintType getType() {
        return type;
    }

    public void setType(WeakConstraintType type) {
        this.type = type;
    }

    public WeakConstraintDto withBool(Boolean bool) {
        this.bool = bool;
        return this;
    }

    /**
     * 属性约束类型bool的参数
     * @return bool
     */
    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

    public WeakConstraintDto withRange(List<Float> range) {
        this.range = range;
        return this;
    }

    public WeakConstraintDto addRangeItem(Float rangeItem) {
        if (this.range == null) {
            this.range = new ArrayList<>();
        }
        this.range.add(rangeItem);
        return this;
    }

    public WeakConstraintDto withRange(Consumer<List<Float>> rangeSetter) {
        if (this.range == null) {
            this.range = new ArrayList<>();
        }
        rangeSetter.accept(this.range);
        return this;
    }

    /**
     * 属性约束类型range的参数
     * @return range
     */
    public List<Float> getRange() {
        return range;
    }

    public void setRange(List<Float> range) {
        this.range = range;
    }

    public WeakConstraintDto withStruct(StructureConstraintParamsDto struct) {
        this.struct = struct;
        return this;
    }

    public WeakConstraintDto withStruct(Consumer<StructureConstraintParamsDto> structSetter) {
        if (this.struct == null) {
            this.struct = new StructureConstraintParamsDto();
            structSetter.accept(this.struct);
        }

        return this;
    }

    /**
     * Get struct
     * @return struct
     */
    public StructureConstraintParamsDto getStruct() {
        return struct;
    }

    public void setStruct(StructureConstraintParamsDto struct) {
        this.struct = struct;
    }

    public WeakConstraintDto withQuantiles(List<Float> quantiles) {
        this.quantiles = quantiles;
        return this;
    }

    public WeakConstraintDto addQuantilesItem(Float quantilesItem) {
        if (this.quantiles == null) {
            this.quantiles = new ArrayList<>();
        }
        this.quantiles.add(quantilesItem);
        return this;
    }

    public WeakConstraintDto withQuantiles(Consumer<List<Float>> quantilesSetter) {
        if (this.quantiles == null) {
            this.quantiles = new ArrayList<>();
        }
        quantilesSetter.accept(this.quantiles);
        return this;
    }

    /**
     * 属性约束类型minimize和maximize的参数
     * @return quantiles
     */
    public List<Float> getQuantiles() {
        return quantiles;
    }

    public void setQuantiles(List<Float> quantiles) {
        this.quantiles = quantiles;
    }

    public WeakConstraintDto withInteraction(InteractionConstraintDto interaction) {
        this.interaction = interaction;
        return this;
    }

    public WeakConstraintDto withInteraction(Consumer<InteractionConstraintDto> interactionSetter) {
        if (this.interaction == null) {
            this.interaction = new InteractionConstraintDto();
            interactionSetter.accept(this.interaction);
        }

        return this;
    }

    /**
     * Get interaction
     * @return interaction
     */
    public InteractionConstraintDto getInteraction() {
        return interaction;
    }

    public void setInteraction(InteractionConstraintDto interaction) {
        this.interaction = interaction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WeakConstraintDto that = (WeakConstraintDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.bool, that.bool)
            && Objects.equals(this.range, that.range) && Objects.equals(this.struct, that.struct)
            && Objects.equals(this.quantiles, that.quantiles) && Objects.equals(this.interaction, that.interaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, bool, range, struct, quantiles, interaction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WeakConstraintDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    struct: ").append(toIndentedString(struct)).append("\n");
        sb.append("    quantiles: ").append(toIndentedString(quantiles)).append("\n");
        sb.append("    interaction: ").append(toIndentedString(interaction)).append("\n");
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
