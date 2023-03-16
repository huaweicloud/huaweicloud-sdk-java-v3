package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InviteAccount 操作的请求体。
 */
public class InviteAccountReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private TargetDto target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes")

    private String notes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagDto> tags = null;

    public InviteAccountReqBody withTarget(TargetDto target) {
        this.target = target;
        return this;
    }

    public InviteAccountReqBody withTarget(Consumer<TargetDto> targetSetter) {
        if (this.target == null) {
            this.target = new TargetDto();
            targetSetter.accept(this.target);
        }

        return this;
    }

    /**
     * Get target
     * @return target
     */
    public TargetDto getTarget() {
        return target;
    }

    public void setTarget(TargetDto target) {
        this.target = target;
    }

    public InviteAccountReqBody withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * 给收件帐号所有者的邮件中的附加信息。
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public InviteAccountReqBody withTags(List<TagDto> tags) {
        this.tags = tags;
        return this;
    }

    public InviteAccountReqBody addTagsItem(TagDto tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public InviteAccountReqBody withTags(Consumer<List<TagDto>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 要绑定到新创建的帐号的标签列表。
     * @return tags
     */
    public List<TagDto> getTags() {
        return tags;
    }

    public void setTags(List<TagDto> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InviteAccountReqBody inviteAccountReqBody = (InviteAccountReqBody) o;
        return Objects.equals(this.target, inviteAccountReqBody.target)
            && Objects.equals(this.notes, inviteAccountReqBody.notes)
            && Objects.equals(this.tags, inviteAccountReqBody.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target, notes, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteAccountReqBody {\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
