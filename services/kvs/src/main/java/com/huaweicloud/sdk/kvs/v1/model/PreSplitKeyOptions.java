package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PreSplitKeyOptions
 */
public class PreSplitKeyOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "HashSplitNum")
    @BsonProperty(value = "HashSplitNum")

    private Integer hashSplitNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "RangeSplitPoints")
    @BsonProperty(value = "RangeSplitPoints")

    private List<Document> rangeSplitPoints = null;

    public PreSplitKeyOptions withHashSplitNum(Integer hashSplitNum) {
        this.hashSplitNum = hashSplitNum;
        return this;
    }

    /**
     * Get hashSplitNum
     * @return hashSplitNum
     */
    public Integer getHashSplitNum() {
        return hashSplitNum;
    }

    public void setHashSplitNum(Integer hashSplitNum) {
        this.hashSplitNum = hashSplitNum;
    }

    public PreSplitKeyOptions withRangeSplitPoints(List<Document> rangeSplitPoints) {
        this.rangeSplitPoints = rangeSplitPoints;
        return this;
    }

    public PreSplitKeyOptions addRangeSplitPointsItem(Document rangeSplitPointsItem) {
        if (this.rangeSplitPoints == null) {
            this.rangeSplitPoints = new ArrayList<>();
        }
        this.rangeSplitPoints.add(rangeSplitPointsItem);
        return this;
    }

    public PreSplitKeyOptions withRangeSplitPoints(Consumer<List<Document>> rangeSplitPointsSetter) {
        if (this.rangeSplitPoints == null) {
            this.rangeSplitPoints = new ArrayList<>();
        }
        rangeSplitPointsSetter.accept(this.rangeSplitPoints);
        return this;
    }

    /**
     * Get rangeSplitPoints
     * @return rangeSplitPoints
     */
    public List<Document> getRangeSplitPoints() {
        return rangeSplitPoints;
    }

    public void setRangeSplitPoints(List<Document> rangeSplitPoints) {
        this.rangeSplitPoints = rangeSplitPoints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreSplitKeyOptions that = (PreSplitKeyOptions) obj;
        return Objects.equals(this.hashSplitNum, that.hashSplitNum)
            && Objects.equals(this.rangeSplitPoints, that.rangeSplitPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashSplitNum, rangeSplitPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreSplitKeyOptions {\n");
        sb.append("    hashSplitNum: ").append(toIndentedString(hashSplitNum)).append("\n");
        sb.append("    rangeSplitPoints: ").append(toIndentedString(rangeSplitPoints)).append("\n");
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
