package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListVaultTopsResponseBodyVaults
 */
public class ListVaultTopsResponseBodyVaults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private String dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public ListVaultTopsResponseBodyVaults withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 存储库ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListVaultTopsResponseBodyVaults withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 指标时间，单位毫秒
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public ListVaultTopsResponseBodyVaults withDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * 指标数据维度
     * @return dimension
     */
    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public ListVaultTopsResponseBodyVaults withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * 指标数据取值
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ListVaultTopsResponseBodyVaults withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 指标数据的单位，例如：个、GB、%
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVaultTopsResponseBodyVaults that = (ListVaultTopsResponseBodyVaults) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.time, that.time)
            && Objects.equals(this.dimension, that.dimension) && Objects.equals(this.value, that.value)
            && Objects.equals(this.unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, time, dimension, value, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVaultTopsResponseBodyVaults {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
