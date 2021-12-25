package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 是否交换寄存器顺序 */
public class ValueInPropertyVisitorsIsRegisterswap {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional")

    private Boolean optional;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ValueInPropertyVisitorsRegisterTypeMetadata metadata;

    public ValueInPropertyVisitorsIsRegisterswap withValue(String value) {
        this.value = value;
        return this;
    }

    /** value 最大长度512， value允许英文字母、数字、下划线、中划线、点、逗号、@、#、+、\\、/、？、^、=、%、&、:、~
     * 
     * @return value */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ValueInPropertyVisitorsIsRegisterswap withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /** 标识属性是否可选，默认为true
     * 
     * @return optional */
    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public ValueInPropertyVisitorsIsRegisterswap withMetadata(ValueInPropertyVisitorsRegisterTypeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ValueInPropertyVisitorsIsRegisterswap withMetadata(
        Consumer<ValueInPropertyVisitorsRegisterTypeMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ValueInPropertyVisitorsRegisterTypeMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /** Get metadata
     * 
     * @return metadata */
    public ValueInPropertyVisitorsRegisterTypeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ValueInPropertyVisitorsRegisterTypeMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueInPropertyVisitorsIsRegisterswap valueInPropertyVisitorsIsRegisterswap =
            (ValueInPropertyVisitorsIsRegisterswap) o;
        return Objects.equals(this.value, valueInPropertyVisitorsIsRegisterswap.value)
            && Objects.equals(this.optional, valueInPropertyVisitorsIsRegisterswap.optional)
            && Objects.equals(this.metadata, valueInPropertyVisitorsIsRegisterswap.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, optional, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueInPropertyVisitorsIsRegisterswap {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
