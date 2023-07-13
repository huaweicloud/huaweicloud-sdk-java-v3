package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 数据格式
 */
public class DataSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private BigDecimal min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private BigDecimal max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_length")

    private Integer minLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_length")

    private Integer maxLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    public DataSchema withMin(BigDecimal min) {
        this.min = min;
        return this;
    }

    /**
     * integer或double类型的的最小值，当属性值超过范围时系统不予存储，integer时范围：-9223372036854775808 ~ 9223372036854775807；double时范围：-1.7976931348623157E308 ~ 1.7976931348623157E308
     * @return min
     */
    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public DataSchema withMax(BigDecimal max) {
        this.max = max;
        return this;
    }

    /**
     * integer或double类型的最大值，当属性值超过范围时系统不予存储，integer时范围：-9223372036854775808 ~ 9223372036854775807；double时范围：-1.7976931348623157E308 ~ 1.7976931348623157E308
     * @return max
     */
    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public DataSchema withMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * string类型的最小长度，当属性值超过范围时系统不予存储，范围：0 ~ 4096
     * @return minLength
     */
    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public DataSchema withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * string类型的最大长度，当属性值超过范围时系统不予存储，范围：0 ~ 4096
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public DataSchema withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型，字符串（string）、整数（integer）、浮点数（double）、对象（object），系统支持的对象型存储大小为1MB，超过时不予存储
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataSchema that = (DataSchema) obj;
        return Objects.equals(this.min, that.min) && Objects.equals(this.max, that.max)
            && Objects.equals(this.minLength, that.minLength) && Objects.equals(this.maxLength, that.maxLength)
            && Objects.equals(this.dataType, that.dataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max, minLength, maxLength, dataType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataSchema {\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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
