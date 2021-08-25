package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CandidateIntention  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="candidate_intention")
    
    
    private String candidateIntention;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="candidate_confidence")
    
    
    private Double candidateConfidence;

    public CandidateIntention withCandidateIntention(String candidateIntention) {
        this.candidateIntention = candidateIntention;
        return this;
    }

    


    /**
     * 候选意图。
     * @return candidateIntention
     */
    public String getCandidateIntention() {
        return candidateIntention;
    }

    public void setCandidateIntention(String candidateIntention) {
        this.candidateIntention = candidateIntention;
    }

    

    public CandidateIntention withCandidateConfidence(Double candidateConfidence) {
        this.candidateConfidence = candidateConfidence;
        return this;
    }

    


    /**
     * 候选意图置信度。
     * @return candidateConfidence
     */
    public Double getCandidateConfidence() {
        return candidateConfidence;
    }

    public void setCandidateConfidence(Double candidateConfidence) {
        this.candidateConfidence = candidateConfidence;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CandidateIntention candidateIntention = (CandidateIntention) o;
        return Objects.equals(this.candidateIntention, candidateIntention.candidateIntention) &&
            Objects.equals(this.candidateConfidence, candidateIntention.candidateConfidence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(candidateIntention, candidateConfidence);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CandidateIntention {\n");
        sb.append("    candidateIntention: ").append(toIndentedString(candidateIntention)).append("\n");
        sb.append("    candidateConfidence: ").append(toIndentedString(candidateConfidence)).append("\n");
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

