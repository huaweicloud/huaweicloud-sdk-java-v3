package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateGroupNoteRequiredAttributesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note_required_attributes")

    private List<RequiredAttributeDto> noteRequiredAttributes = null;

    public UpdateGroupNoteRequiredAttributesResponse withNoteRequiredAttributes(
        List<RequiredAttributeDto> noteRequiredAttributes) {
        this.noteRequiredAttributes = noteRequiredAttributes;
        return this;
    }

    public UpdateGroupNoteRequiredAttributesResponse addNoteRequiredAttributesItem(
        RequiredAttributeDto noteRequiredAttributesItem) {
        if (this.noteRequiredAttributes == null) {
            this.noteRequiredAttributes = new ArrayList<>();
        }
        this.noteRequiredAttributes.add(noteRequiredAttributesItem);
        return this;
    }

    public UpdateGroupNoteRequiredAttributesResponse withNoteRequiredAttributes(
        Consumer<List<RequiredAttributeDto>> noteRequiredAttributesSetter) {
        if (this.noteRequiredAttributes == null) {
            this.noteRequiredAttributes = new ArrayList<>();
        }
        noteRequiredAttributesSetter.accept(this.noteRequiredAttributes);
        return this;
    }

    /**
     * **参数解释：** 检视意见必填项。
     * @return noteRequiredAttributes
     */
    public List<RequiredAttributeDto> getNoteRequiredAttributes() {
        return noteRequiredAttributes;
    }

    public void setNoteRequiredAttributes(List<RequiredAttributeDto> noteRequiredAttributes) {
        this.noteRequiredAttributes = noteRequiredAttributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGroupNoteRequiredAttributesResponse that = (UpdateGroupNoteRequiredAttributesResponse) obj;
        return Objects.equals(this.noteRequiredAttributes, that.noteRequiredAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noteRequiredAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGroupNoteRequiredAttributesResponse {\n");
        sb.append("    noteRequiredAttributes: ").append(toIndentedString(noteRequiredAttributes)).append("\n");
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
