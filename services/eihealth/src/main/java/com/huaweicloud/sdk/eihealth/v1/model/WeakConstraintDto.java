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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WeakConstraintDto weakConstraintDto = (WeakConstraintDto) o;
        return Objects.equals(this.name, weakConstraintDto.name) && Objects.equals(this.type, weakConstraintDto.type)
            && Objects.equals(this.bool, weakConstraintDto.bool) && Objects.equals(this.range, weakConstraintDto.range)
            && Objects.equals(this.struct, weakConstraintDto.struct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, bool, range, struct);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WeakConstraintDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    struct: ").append(toIndentedString(struct)).append("\n");
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
