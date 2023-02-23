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
public class TableQaAnswers  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="answer")
    

    private String answer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="score")
    

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="table_id")
    

    private String tableId;

    public TableQaAnswers withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    


    /**
     * 表格问答答案。
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    

    public TableQaAnswers withScore(Double score) {
        this.score = score;
        return this;
    }

    


    /**
     * 评分。
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    

    public TableQaAnswers withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    


    /**
     * 表格ID。
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TableQaAnswers tableQaAnswers = (TableQaAnswers) o;
        return Objects.equals(this.answer, tableQaAnswers.answer) &&
            Objects.equals(this.score, tableQaAnswers.score) &&
            Objects.equals(this.tableId, tableQaAnswers.tableId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(answer, score, tableId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableQaAnswers {\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
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

