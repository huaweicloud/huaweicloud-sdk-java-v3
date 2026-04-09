package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.corexml.SdkXmlBody;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TagSet和Tag的元素 
 */
@JacksonXmlRootElement(localName = "Tagging")
public class PutObjectTaggingRequestBody extends SdkXmlBody<PutObjectTaggingRequestBody> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TagSet")

    @JacksonXmlProperty(localName = "TagSet")

    private PutObjectTaggingRequestBodyTagSet tagSet;

    public PutObjectTaggingRequestBody withTagSet(PutObjectTaggingRequestBodyTagSet tagSet) {
        this.tagSet = tagSet;
        return this;
    }

    public PutObjectTaggingRequestBody withTagSet(Consumer<PutObjectTaggingRequestBodyTagSet> tagSetSetter) {
        if (this.tagSet == null) {
            this.tagSet = new PutObjectTaggingRequestBodyTagSet();
            tagSetSetter.accept(this.tagSet);
        }

        return this;
    }

    /**
     * Get tagSet
     * @return tagSet
     */
    public PutObjectTaggingRequestBodyTagSet getTagSet() {
        return tagSet;
    }

    public void setTagSet(PutObjectTaggingRequestBodyTagSet tagSet) {
        this.tagSet = tagSet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutObjectTaggingRequestBody that = (PutObjectTaggingRequestBody) obj;
        return Objects.equals(this.tagSet, that.tagSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutObjectTaggingRequestBody {\n");
        sb.append("    tagSet: ").append(toIndentedString(tagSet)).append("\n");
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
