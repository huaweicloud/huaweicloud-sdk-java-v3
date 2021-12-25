package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 终端设备静态属性信息 */
public class ValueInTwinResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excepted")

    private ValueInTwinResponseExcepted excepted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual")

    private ValueInTwinResponseActual actual;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ValueInTwinResponseMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional")

    private Boolean optional;

    public ValueInTwinResponse withExcepted(ValueInTwinResponseExcepted excepted) {
        this.excepted = excepted;
        return this;
    }

    public ValueInTwinResponse withExcepted(Consumer<ValueInTwinResponseExcepted> exceptedSetter) {
        if (this.excepted == null) {
            this.excepted = new ValueInTwinResponseExcepted();
            exceptedSetter.accept(this.excepted);
        }

        return this;
    }

    /** Get excepted
     * 
     * @return excepted */
    public ValueInTwinResponseExcepted getExcepted() {
        return excepted;
    }

    public void setExcepted(ValueInTwinResponseExcepted excepted) {
        this.excepted = excepted;
    }

    public ValueInTwinResponse withActual(ValueInTwinResponseActual actual) {
        this.actual = actual;
        return this;
    }

    public ValueInTwinResponse withActual(Consumer<ValueInTwinResponseActual> actualSetter) {
        if (this.actual == null) {
            this.actual = new ValueInTwinResponseActual();
            actualSetter.accept(this.actual);
        }

        return this;
    }

    /** Get actual
     * 
     * @return actual */
    public ValueInTwinResponseActual getActual() {
        return actual;
    }

    public void setActual(ValueInTwinResponseActual actual) {
        this.actual = actual;
    }

    public ValueInTwinResponse withMetadata(ValueInTwinResponseMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ValueInTwinResponse withMetadata(Consumer<ValueInTwinResponseMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ValueInTwinResponseMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /** Get metadata
     * 
     * @return metadata */
    public ValueInTwinResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ValueInTwinResponseMetadata metadata) {
        this.metadata = metadata;
    }

    public ValueInTwinResponse withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /** 标识属性是否可选，默认为true，继承模板的属性默认为false
     * 
     * @return optional */
    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueInTwinResponse valueInTwinResponse = (ValueInTwinResponse) o;
        return Objects.equals(this.excepted, valueInTwinResponse.excepted)
            && Objects.equals(this.actual, valueInTwinResponse.actual)
            && Objects.equals(this.metadata, valueInTwinResponse.metadata)
            && Objects.equals(this.optional, valueInTwinResponse.optional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excepted, actual, metadata, optional);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueInTwinResponse {\n");
        sb.append("    excepted: ").append(toIndentedString(excepted)).append("\n");
        sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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
