package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
public class ShowMergeRequestVotesDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scores")

    private Integer scores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_id")

    private Integer mergeRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_creator")

    private String mergeRequestCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "votes")

    private List<MergeRequestVotesDto> votes = null;

    public ShowMergeRequestVotesDetailResponse withScores(Integer scores) {
        this.scores = scores;
        return this;
    }

    /**
     * **参数解释：** 多人合计总分数。
     * minimum: -2147483648
     * maximum: 2147483647
     * @return scores
     */
    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public ShowMergeRequestVotesDetailResponse withMergeRequestId(Integer mergeRequestId) {
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

    public ShowMergeRequestVotesDetailResponse withMergeRequestCreator(String mergeRequestCreator) {
        this.mergeRequestCreator = mergeRequestCreator;
        return this;
    }

    /**
     * **参数解释：** 合并请求作者名。
     * @return mergeRequestCreator
     */
    public String getMergeRequestCreator() {
        return mergeRequestCreator;
    }

    public void setMergeRequestCreator(String mergeRequestCreator) {
        this.mergeRequestCreator = mergeRequestCreator;
    }

    public ShowMergeRequestVotesDetailResponse withVotes(List<MergeRequestVotesDto> votes) {
        this.votes = votes;
        return this;
    }

    public ShowMergeRequestVotesDetailResponse addVotesItem(MergeRequestVotesDto votesItem) {
        if (this.votes == null) {
            this.votes = new ArrayList<>();
        }
        this.votes.add(votesItem);
        return this;
    }

    public ShowMergeRequestVotesDetailResponse withVotes(Consumer<List<MergeRequestVotesDto>> votesSetter) {
        if (this.votes == null) {
            this.votes = new ArrayList<>();
        }
        votesSetter.accept(this.votes);
        return this;
    }

    /**
     * **参数解释：** 个人打分详情。
     * @return votes
     */
    public List<MergeRequestVotesDto> getVotes() {
        return votes;
    }

    public void setVotes(List<MergeRequestVotesDto> votes) {
        this.votes = votes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMergeRequestVotesDetailResponse that = (ShowMergeRequestVotesDetailResponse) obj;
        return Objects.equals(this.scores, that.scores) && Objects.equals(this.mergeRequestId, that.mergeRequestId)
            && Objects.equals(this.mergeRequestCreator, that.mergeRequestCreator)
            && Objects.equals(this.votes, that.votes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scores, mergeRequestId, mergeRequestCreator, votes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMergeRequestVotesDetailResponse {\n");
        sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
        sb.append("    mergeRequestId: ").append(toIndentedString(mergeRequestId)).append("\n");
        sb.append("    mergeRequestCreator: ").append(toIndentedString(mergeRequestCreator)).append("\n");
        sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
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
