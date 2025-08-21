package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUserRefPermissionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read")

    private UserRefPermissionBasicDto read;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review")

    private UserRefPermissionBasicDto review;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval")

    private UserRefPermissionBasicDto approval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_change")

    private UserRefPermissionBasicDto createChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge")

    private UserRefPermissionBasicDto merge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_delete")

    private UserRefPermissionBasicDto createDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push")

    private UserRefPermissionBasicDto push;

    public ShowUserRefPermissionResponse withRead(UserRefPermissionBasicDto read) {
        this.read = read;
        return this;
    }

    public ShowUserRefPermissionResponse withRead(Consumer<UserRefPermissionBasicDto> readSetter) {
        if (this.read == null) {
            this.read = new UserRefPermissionBasicDto();
            readSetter.accept(this.read);
        }

        return this;
    }

    /**
     * Get read
     * @return read
     */
    public UserRefPermissionBasicDto getRead() {
        return read;
    }

    public void setRead(UserRefPermissionBasicDto read) {
        this.read = read;
    }

    public ShowUserRefPermissionResponse withReview(UserRefPermissionBasicDto review) {
        this.review = review;
        return this;
    }

    public ShowUserRefPermissionResponse withReview(Consumer<UserRefPermissionBasicDto> reviewSetter) {
        if (this.review == null) {
            this.review = new UserRefPermissionBasicDto();
            reviewSetter.accept(this.review);
        }

        return this;
    }

    /**
     * Get review
     * @return review
     */
    public UserRefPermissionBasicDto getReview() {
        return review;
    }

    public void setReview(UserRefPermissionBasicDto review) {
        this.review = review;
    }

    public ShowUserRefPermissionResponse withApproval(UserRefPermissionBasicDto approval) {
        this.approval = approval;
        return this;
    }

    public ShowUserRefPermissionResponse withApproval(Consumer<UserRefPermissionBasicDto> approvalSetter) {
        if (this.approval == null) {
            this.approval = new UserRefPermissionBasicDto();
            approvalSetter.accept(this.approval);
        }

        return this;
    }

    /**
     * Get approval
     * @return approval
     */
    public UserRefPermissionBasicDto getApproval() {
        return approval;
    }

    public void setApproval(UserRefPermissionBasicDto approval) {
        this.approval = approval;
    }

    public ShowUserRefPermissionResponse withCreateChange(UserRefPermissionBasicDto createChange) {
        this.createChange = createChange;
        return this;
    }

    public ShowUserRefPermissionResponse withCreateChange(Consumer<UserRefPermissionBasicDto> createChangeSetter) {
        if (this.createChange == null) {
            this.createChange = new UserRefPermissionBasicDto();
            createChangeSetter.accept(this.createChange);
        }

        return this;
    }

    /**
     * Get createChange
     * @return createChange
     */
    public UserRefPermissionBasicDto getCreateChange() {
        return createChange;
    }

    public void setCreateChange(UserRefPermissionBasicDto createChange) {
        this.createChange = createChange;
    }

    public ShowUserRefPermissionResponse withMerge(UserRefPermissionBasicDto merge) {
        this.merge = merge;
        return this;
    }

    public ShowUserRefPermissionResponse withMerge(Consumer<UserRefPermissionBasicDto> mergeSetter) {
        if (this.merge == null) {
            this.merge = new UserRefPermissionBasicDto();
            mergeSetter.accept(this.merge);
        }

        return this;
    }

    /**
     * Get merge
     * @return merge
     */
    public UserRefPermissionBasicDto getMerge() {
        return merge;
    }

    public void setMerge(UserRefPermissionBasicDto merge) {
        this.merge = merge;
    }

    public ShowUserRefPermissionResponse withCreateDelete(UserRefPermissionBasicDto createDelete) {
        this.createDelete = createDelete;
        return this;
    }

    public ShowUserRefPermissionResponse withCreateDelete(Consumer<UserRefPermissionBasicDto> createDeleteSetter) {
        if (this.createDelete == null) {
            this.createDelete = new UserRefPermissionBasicDto();
            createDeleteSetter.accept(this.createDelete);
        }

        return this;
    }

    /**
     * Get createDelete
     * @return createDelete
     */
    public UserRefPermissionBasicDto getCreateDelete() {
        return createDelete;
    }

    public void setCreateDelete(UserRefPermissionBasicDto createDelete) {
        this.createDelete = createDelete;
    }

    public ShowUserRefPermissionResponse withPush(UserRefPermissionBasicDto push) {
        this.push = push;
        return this;
    }

    public ShowUserRefPermissionResponse withPush(Consumer<UserRefPermissionBasicDto> pushSetter) {
        if (this.push == null) {
            this.push = new UserRefPermissionBasicDto();
            pushSetter.accept(this.push);
        }

        return this;
    }

    /**
     * Get push
     * @return push
     */
    public UserRefPermissionBasicDto getPush() {
        return push;
    }

    public void setPush(UserRefPermissionBasicDto push) {
        this.push = push;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserRefPermissionResponse that = (ShowUserRefPermissionResponse) obj;
        return Objects.equals(this.read, that.read) && Objects.equals(this.review, that.review)
            && Objects.equals(this.approval, that.approval) && Objects.equals(this.createChange, that.createChange)
            && Objects.equals(this.merge, that.merge) && Objects.equals(this.createDelete, that.createDelete)
            && Objects.equals(this.push, that.push);
    }

    @Override
    public int hashCode() {
        return Objects.hash(read, review, approval, createChange, merge, createDelete, push);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserRefPermissionResponse {\n");
        sb.append("    read: ").append(toIndentedString(read)).append("\n");
        sb.append("    review: ").append(toIndentedString(review)).append("\n");
        sb.append("    approval: ").append(toIndentedString(approval)).append("\n");
        sb.append("    createChange: ").append(toIndentedString(createChange)).append("\n");
        sb.append("    merge: ").append(toIndentedString(merge)).append("\n");
        sb.append("    createDelete: ").append(toIndentedString(createDelete)).append("\n");
        sb.append("    push: ").append(toIndentedString(push)).append("\n");
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
