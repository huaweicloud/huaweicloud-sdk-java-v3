package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 标签对象
 */
public class CreateV2TagRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private CreateV2TagRequestBodyTag tag;

    public CreateV2TagRequestBody withTag(CreateV2TagRequestBodyTag tag) {
        this.tag = tag;
        return this;
    }

    public CreateV2TagRequestBody withTag(Consumer<CreateV2TagRequestBodyTag> tagSetter) {
        if (this.tag == null) {
            this.tag = new CreateV2TagRequestBodyTag();
            tagSetter.accept(this.tag);
        }

        return this;
    }

    /**
     * Get tag
     * @return tag
     */
    public CreateV2TagRequestBodyTag getTag() {
        return tag;
    }

    public void setTag(CreateV2TagRequestBodyTag tag) {
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
        CreateV2TagRequestBody that = (CreateV2TagRequestBody) obj;
        return Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateV2TagRequestBody {\n");
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
