package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowJudgementDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "judgement_id")

    private String judgementId;

    public ShowJudgementDetailRequest withJudgementId(String judgementId) {
        this.judgementId = judgementId;
        return this;
    }

    /** 判题任务ID
     * 
     * @return judgementId */
    public String getJudgementId() {
        return judgementId;
    }

    public void setJudgementId(String judgementId) {
        this.judgementId = judgementId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJudgementDetailRequest showJudgementDetailRequest = (ShowJudgementDetailRequest) o;
        return Objects.equals(this.judgementId, showJudgementDetailRequest.judgementId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(judgementId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJudgementDetailRequest {\n");
        sb.append("    judgementId: ").append(toIndentedString(judgementId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
