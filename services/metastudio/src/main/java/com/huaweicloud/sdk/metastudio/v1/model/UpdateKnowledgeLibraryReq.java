package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改知识库请求。
 */
public class UpdateKnowledgeLibraryReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topk")

    private Integer topk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    public UpdateKnowledgeLibraryReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 知识库名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateKnowledgeLibraryReq withTopk(Integer topk) {
        this.topk = topk;
        return this;
    }

    /**
     * 知识库召回数
     * minimum: 1
     * maximum: 20
     * @return topk
     */
    public Integer getTopk() {
        return topk;
    }

    public void setTopk(Integer topk) {
        this.topk = topk;
    }

    public UpdateKnowledgeLibraryReq withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * 知识库召回得分
     * minimum: 0
     * maximum: 1
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateKnowledgeLibraryReq that = (UpdateKnowledgeLibraryReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.topk, that.topk)
            && Objects.equals(this.score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, topk, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKnowledgeLibraryReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    topk: ").append(toIndentedString(topk)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
