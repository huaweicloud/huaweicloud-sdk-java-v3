package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.MappingResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneShowMappingResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mapping")
    
    private MappingResult mapping = null;

    public KeystoneShowMappingResponse withMapping(MappingResult mapping) {
        this.mapping = mapping;
        return this;
    }

    public KeystoneShowMappingResponse withMapping(Consumer<MappingResult> mappingSetter) {
        if(this.mapping == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowMappingResponse keystoneShowMappingResponse = (KeystoneShowMappingResponse) o;
        return Objects.equals(this.mapping, keystoneShowMappingResponse.mapping);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mapping);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowMappingResponse {\n");
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

