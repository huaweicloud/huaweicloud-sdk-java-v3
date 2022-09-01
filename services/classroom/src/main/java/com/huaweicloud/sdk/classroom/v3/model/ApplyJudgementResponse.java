package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ApplyJudgementResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "judgement_id")

    @JacksonXmlProperty(localName = "judgement_id")

    private String judgementId;

    public ApplyJudgementResponse withJudgementId(String judgementId) {
        this.judgementId = judgementId;
        return this;
    }

    /**
     * 判题任务ID
     * @return judgementId
     */
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
        ApplyJudgementResponse applyJudgementResponse = (ApplyJudgementResponse) o;
        return Objects.equals(this.judgementId, applyJudgementResponse.judgementId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(judgementId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyJudgementResponse {\n");
        sb.append("    judgementId: ").append(toIndentedString(judgementId)).append("\n");
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
