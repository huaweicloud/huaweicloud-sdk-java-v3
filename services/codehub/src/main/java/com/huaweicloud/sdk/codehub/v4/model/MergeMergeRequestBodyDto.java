package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MergeMergeRequestBodyDto
 */
public class MergeMergeRequestBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash_commit_message")

    private String squashCommitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "squash")

    private Boolean squash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_merge")

    private Boolean forceMerge;

    public MergeMergeRequestBodyDto withSquashCommitMessage(String squashCommitMessage) {
        this.squashCommitMessage = squashCommitMessage;
        return this;
    }

    /**
     * 压缩合并信息
     * @return squashCommitMessage
     */
    public String getSquashCommitMessage() {
        return squashCommitMessage;
    }

    public void setSquashCommitMessage(String squashCommitMessage) {
        this.squashCommitMessage = squashCommitMessage;
    }

    public MergeMergeRequestBodyDto withSquash(Boolean squash) {
        this.squash = squash;
        return this;
    }

    /**
     * 压缩合并
     * @return squash
     */
    public Boolean getSquash() {
        return squash;
    }

    public void setSquash(Boolean squash) {
        this.squash = squash;
    }

    public MergeMergeRequestBodyDto withForceMerge(Boolean forceMerge) {
        this.forceMerge = forceMerge;
        return this;
    }

    /**
     * 强制合并
     * @return forceMerge
     */
    public Boolean getForceMerge() {
        return forceMerge;
    }

    public void setForceMerge(Boolean forceMerge) {
        this.forceMerge = forceMerge;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeMergeRequestBodyDto that = (MergeMergeRequestBodyDto) obj;
        return Objects.equals(this.squashCommitMessage, that.squashCommitMessage)
            && Objects.equals(this.squash, that.squash) && Objects.equals(this.forceMerge, that.forceMerge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(squashCommitMessage, squash, forceMerge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeMergeRequestBodyDto {\n");
        sb.append("    squashCommitMessage: ").append(toIndentedString(squashCommitMessage)).append("\n");
        sb.append("    squash: ").append(toIndentedString(squash)).append("\n");
        sb.append("    forceMerge: ").append(toIndentedString(forceMerge)).append("\n");
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
