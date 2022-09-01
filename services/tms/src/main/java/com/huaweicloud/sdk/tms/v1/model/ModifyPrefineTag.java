package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改预定义标签
 */
public class ModifyPrefineTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_tag")

    @JacksonXmlProperty(localName = "new_tag")

    private PredefineTagRequest newTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_tag")

    @JacksonXmlProperty(localName = "old_tag")

    private PredefineTagRequest oldTag;

    public ModifyPrefineTag withNewTag(PredefineTagRequest newTag) {
        this.newTag = newTag;
        return this;
    }

    public ModifyPrefineTag withNewTag(Consumer<PredefineTagRequest> newTagSetter) {
        if (this.newTag == null) {
            this.newTag = new PredefineTagRequest();
            newTagSetter.accept(this.newTag);
        }

        return this;
    }

    /**
     * Get newTag
     * @return newTag
     */
    public PredefineTagRequest getNewTag() {
        return newTag;
    }

    public void setNewTag(PredefineTagRequest newTag) {
        this.newTag = newTag;
    }

    public ModifyPrefineTag withOldTag(PredefineTagRequest oldTag) {
        this.oldTag = oldTag;
        return this;
    }

    public ModifyPrefineTag withOldTag(Consumer<PredefineTagRequest> oldTagSetter) {
        if (this.oldTag == null) {
            this.oldTag = new PredefineTagRequest();
            oldTagSetter.accept(this.oldTag);
        }

        return this;
    }

    /**
     * Get oldTag
     * @return oldTag
     */
    public PredefineTagRequest getOldTag() {
        return oldTag;
    }

    public void setOldTag(PredefineTagRequest oldTag) {
        this.oldTag = oldTag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyPrefineTag modifyPrefineTag = (ModifyPrefineTag) o;
        return Objects.equals(this.newTag, modifyPrefineTag.newTag)
            && Objects.equals(this.oldTag, modifyPrefineTag.oldTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newTag, oldTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyPrefineTag {\n");
        sb.append("    newTag: ").append(toIndentedString(newTag)).append("\n");
        sb.append("    oldTag: ").append(toIndentedString(oldTag)).append("\n");
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
