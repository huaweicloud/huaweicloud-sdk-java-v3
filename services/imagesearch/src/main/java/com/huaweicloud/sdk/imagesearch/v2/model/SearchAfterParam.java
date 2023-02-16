package com.huaweicloud.sdk.imagesearch.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 最后一个结果的排序信息，用于全量召回场景。目前KEYWORD/FACE搜索和条件检查支持全量召回。
 */
public class SearchAfterParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="score")
    
    
    private Double score;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;

    public SearchAfterParam withScore(Double score) {
        this.score = score;
        return this;
    }

    


    /**
     * 结果的得分。
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    

    public SearchAfterParam withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 结果的唯一ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchAfterParam searchAfterParam = (SearchAfterParam) o;
        return Objects.equals(this.score, searchAfterParam.score) &&
            Objects.equals(this.id, searchAfterParam.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(score, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchAfterParam {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

