package com.huaweicloud.sdk.codecraft.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class CreateCompetitionScoreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "works_id")

    private String worksId;

    public CreateCompetitionScoreResponse withWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }

    /** 作品ID
     * 
     * @return worksId */
    public String getWorksId() {
        return worksId;
    }

    public void setWorksId(String worksId) {
        this.worksId = worksId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCompetitionScoreResponse createCompetitionScoreResponse = (CreateCompetitionScoreResponse) o;
        return Objects.equals(this.worksId, createCompetitionScoreResponse.worksId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worksId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCompetitionScoreResponse {\n");
        sb.append("    worksId: ").append(toIndentedString(worksId)).append("\n");
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
