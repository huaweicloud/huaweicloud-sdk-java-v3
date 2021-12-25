package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 终端设备动态属性 */
public class ValueInTwin {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excepted")

    private ValueInTwinExcepted excepted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional")

    private Boolean optional;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    public ValueInTwin withExcepted(ValueInTwinExcepted excepted) {
        this.excepted = excepted;
        return this;
    }

    public ValueInTwin withExcepted(Consumer<ValueInTwinExcepted> exceptedSetter) {
        if (this.excepted == null) {
            this.excepted = new ValueInTwinExcepted();
            exceptedSetter.accept(this.excepted);
        }

        return this;
    }

    /** Get excepted
     * 
     * @return excepted */
    public ValueInTwinExcepted getExcepted() {
        return excepted;
    }

    public void setExcepted(ValueInTwinExcepted excepted) {
        this.excepted = excepted;
    }

    public ValueInTwin withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /** 动态属性的期望信息
     * 
     * @return optional */
    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    public ValueInTwin withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ValueInTwin withMetadata(Consumer<Metadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /** Get metadata
     * 
     * @return metadata */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
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
        ValueInTwin valueInTwin = (ValueInTwin) o;
        return Objects.equals(this.excepted, valueInTwin.excepted)
            && Objects.equals(this.optional, valueInTwin.optional)
            && Objects.equals(this.metadata, valueInTwin.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excepted, optional, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueInTwin {\n");
        sb.append("    excepted: ").append(toIndentedString(excepted)).append("\n");
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
