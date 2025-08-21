package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateMergeRequestVoteResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_id")

    private Integer mergeRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private UserSafeDto author;

    public UpdateMergeRequestVoteResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 打分记录的id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UpdateMergeRequestVoteResponse withMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }

    /**
     * **参数解释：** 合并请求id。
     * minimum: 1
     * maximum: 2147483647
     * @return mergeRequestId
     */
    public Integer getMergeRequestId() {
        return mergeRequestId;
    }

    public void setMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
    }

    public UpdateMergeRequestVoteResponse withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * **参数解释：** 分数。
     * minimum: -2
     * maximum: 2
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public UpdateMergeRequestVoteResponse withAuthor(UserSafeDto author) {
        this.author = author;
        return this;
    }

    public UpdateMergeRequestVoteResponse withAuthor(Consumer<UserSafeDto> authorSetter) {
        if (this.author == null) {
            this.author = new UserSafeDto();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public UserSafeDto getAuthor() {
        return author;
    }

    public void setAuthor(UserSafeDto author) {
        this.author = author;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateMergeRequestVoteResponse that = (UpdateMergeRequestVoteResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.mergeRequestId, that.mergeRequestId)
            && Objects.equals(this.score, that.score) && Objects.equals(this.author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mergeRequestId, score, author);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMergeRequestVoteResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mergeRequestId: ").append(toIndentedString(mergeRequestId)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
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
