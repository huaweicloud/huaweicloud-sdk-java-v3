package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddResourceTagsRequestBody
 */
public class AddResourceTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private AddResourceTagsRequestBodyTag tag;

    public AddResourceTagsRequestBody withTag(AddResourceTagsRequestBodyTag tag) {
        this.tag = tag;
        return this;
    }

    public AddResourceTagsRequestBody withTag(Consumer<AddResourceTagsRequestBodyTag> tagSetter) {
        if (this.tag == null) {
            this.tag = new AddResourceTagsRequestBodyTag();
            tagSetter.accept(this.tag);
        }

        return this;
    }

    /**
     * Get tag
     * @return tag
     */
    public AddResourceTagsRequestBodyTag getTag() {
        return tag;
    }

    public void setTag(AddResourceTagsRequestBodyTag tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddResourceTagsRequestBody that = (AddResourceTagsRequestBody) obj;
        return Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddResourceTagsRequestBody {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
