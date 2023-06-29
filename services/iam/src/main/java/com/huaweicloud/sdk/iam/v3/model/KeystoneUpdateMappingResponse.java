package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class KeystoneUpdateMappingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping")

    private MappingResult mapping;

    public KeystoneUpdateMappingResponse withMapping(MappingResult mapping) {
        this.mapping = mapping;
        return this;
    }

    public KeystoneUpdateMappingResponse withMapping(Consumer<MappingResult> mappingSetter) {
        if (this.mapping == null) {
            this.mapping = new MappingResult();
            mappingSetter.accept(this.mapping);
        }

        return this;
    }

    /**
     * Get mapping
     * @return mapping
     */
    public MappingResult getMapping() {
        return mapping;
    }

    public void setMapping(MappingResult mapping) {
        this.mapping = mapping;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeystoneUpdateMappingResponse that = (KeystoneUpdateMappingResponse) obj;
        return Objects.equals(this.mapping, that.mapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateMappingResponse {\n");
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
