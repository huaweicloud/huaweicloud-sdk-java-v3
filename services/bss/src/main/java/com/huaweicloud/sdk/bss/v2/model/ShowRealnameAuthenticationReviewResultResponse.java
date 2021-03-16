package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowRealnameAuthenticationReviewResultResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="review_result")
    
    private Integer reviewResult;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="opinion")
    
    private String opinion;

    public ShowRealnameAuthenticationReviewResultResponse withReviewResult(Integer reviewResult) {
        this.reviewResult = reviewResult;
        return this;
    }

    


    /**
     * 实名认证审核结果，只有状态码为200并且已经提交过实名认证请求才返回： 0：审核中1：不通过2：通过
     * @return reviewResult
     */
    public Integer getReviewResult() {
        return reviewResult;
    }

    public void setReviewResult(Integer reviewResult) {
        this.reviewResult = reviewResult;
    }

    

    public ShowRealnameAuthenticationReviewResultResponse withOpinion(String opinion) {
        this.opinion = opinion;
        return this;
    }

    


    /**
     * 审批意见，只有状态码为200并且审核不通过才返回。
     * @return opinion
     */
    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRealnameAuthenticationReviewResultResponse showRealnameAuthenticationReviewResultResponse = (ShowRealnameAuthenticationReviewResultResponse) o;
        return Objects.equals(this.reviewResult, showRealnameAuthenticationReviewResultResponse.reviewResult) &&
            Objects.equals(this.opinion, showRealnameAuthenticationReviewResultResponse.opinion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(reviewResult, opinion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRealnameAuthenticationReviewResultResponse {\n");
        sb.append("    reviewResult: ").append(toIndentedString(reviewResult)).append("\n");
        sb.append("    opinion: ").append(toIndentedString(opinion)).append("\n");
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

