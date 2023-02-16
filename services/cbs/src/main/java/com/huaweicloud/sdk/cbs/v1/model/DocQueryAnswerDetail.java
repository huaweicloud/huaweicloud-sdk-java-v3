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
public class DocQueryAnswerDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="answer")
    
    
    private String answer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="doc_id")
    
    
    private String docId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_index")
    
    
    private Integer endIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paragraph_score")
    
    
    private Double paragraphScore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paragraph_text")
    
    
    private String paragraphText;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phrase_score")
    
    
    private Double phraseScore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_index")
    
    
    private Integer startIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_score")
    
    
    private Double totalScore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paragraph_number")
    
    
    private Integer paragraphNumber;

    public DocQueryAnswerDetail withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    


    /**
     * 答案。
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    

    public DocQueryAnswerDetail withDocId(String docId) {
        this.docId = docId;
        return this;
    }

    


    /**
     * 文档ID。
     * @return docId
     */
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    

    public DocQueryAnswerDetail withEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
        return this;
    }

    


    /**
     * 答案结束下标。
     * @return endIndex
     */
    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    

    public DocQueryAnswerDetail withParagraphScore(Double paragraphScore) {
        this.paragraphScore = paragraphScore;
        return this;
    }

    


    /**
     * 段落评分。
     * @return paragraphScore
     */
    public Double getParagraphScore() {
        return paragraphScore;
    }

    public void setParagraphScore(Double paragraphScore) {
        this.paragraphScore = paragraphScore;
    }

    

    public DocQueryAnswerDetail withParagraphText(String paragraphText) {
        this.paragraphText = paragraphText;
        return this;
    }

    


    /**
     * 段落文字。
     * @return paragraphText
     */
    public String getParagraphText() {
        return paragraphText;
    }

    public void setParagraphText(String paragraphText) {
        this.paragraphText = paragraphText;
    }

    

    public DocQueryAnswerDetail withPhraseScore(Double phraseScore) {
        this.phraseScore = phraseScore;
        return this;
    }

    


    /**
     * 文档问答阅读理解评分。
     * @return phraseScore
     */
    public Double getPhraseScore() {
        return phraseScore;
    }

    public void setPhraseScore(Double phraseScore) {
        this.phraseScore = phraseScore;
    }

    

    public DocQueryAnswerDetail withStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    


    /**
     * 答案开始下标。
     * @return startIndex
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    

    public DocQueryAnswerDetail withTotalScore(Double totalScore) {
        this.totalScore = totalScore;
        return this;
    }

    


    /**
     * 文档问答总评分。
     * @return totalScore
     */
    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    

    public DocQueryAnswerDetail withParagraphNumber(Integer paragraphNumber) {
        this.paragraphNumber = paragraphNumber;
        return this;
    }

    


    /**
     * 段落在文档中的编号。
     * @return paragraphNumber
     */
    public Integer getParagraphNumber() {
        return paragraphNumber;
    }

    public void setParagraphNumber(Integer paragraphNumber) {
        this.paragraphNumber = paragraphNumber;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DocQueryAnswerDetail docQueryAnswerDetail = (DocQueryAnswerDetail) o;
        return Objects.equals(this.answer, docQueryAnswerDetail.answer) &&
            Objects.equals(this.docId, docQueryAnswerDetail.docId) &&
            Objects.equals(this.endIndex, docQueryAnswerDetail.endIndex) &&
            Objects.equals(this.paragraphScore, docQueryAnswerDetail.paragraphScore) &&
            Objects.equals(this.paragraphText, docQueryAnswerDetail.paragraphText) &&
            Objects.equals(this.phraseScore, docQueryAnswerDetail.phraseScore) &&
            Objects.equals(this.startIndex, docQueryAnswerDetail.startIndex) &&
            Objects.equals(this.totalScore, docQueryAnswerDetail.totalScore) &&
            Objects.equals(this.paragraphNumber, docQueryAnswerDetail.paragraphNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(answer, docId, endIndex, paragraphScore, paragraphText, phraseScore, startIndex, totalScore, paragraphNumber);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocQueryAnswerDetail {\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
        sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
        sb.append("    paragraphScore: ").append(toIndentedString(paragraphScore)).append("\n");
        sb.append("    paragraphText: ").append(toIndentedString(paragraphText)).append("\n");
        sb.append("    phraseScore: ").append(toIndentedString(phraseScore)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
        sb.append("    paragraphNumber: ").append(toIndentedString(paragraphNumber)).append("\n");
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

