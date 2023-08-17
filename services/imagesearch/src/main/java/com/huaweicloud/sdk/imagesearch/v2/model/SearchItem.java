package com.huaweicloud.sdk.imagesearch.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 搜索结果参数结构体。
 */
public class SearchItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private ItemSource source;

    public SearchItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据唯一ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SearchItem withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * 数据匹配分数。
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public SearchItem withSource(ItemSource source) {
        this.source = source;
        return this;
    }

    public SearchItem withSource(Consumer<ItemSource> sourceSetter) {
        if (this.source == null) {
            this.source = new ItemSource();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public ItemSource getSource() {
        return source;
    }

    public void setSource(ItemSource source) {
        this.source = source;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchItem that = (SearchItem) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.score, that.score)
            && Objects.equals(this.source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, score, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
