package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 习题简单信息返回体，用于列表返回
 */
public class PackageExerciseCard {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "difficult")

    private DifficultInfo difficult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exercise_type")

    private Integer exerciseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exercise_type_name")

    private String exerciseTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_count")

    private Integer orderCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_point")

    private List<KnowledgePointInfo> knowledgePoint = null;

    public PackageExerciseCard withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 习题id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PackageExerciseCard withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 习题名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PackageExerciseCard withDifficult(DifficultInfo difficult) {
        this.difficult = difficult;
        return this;
    }

    public PackageExerciseCard withDifficult(Consumer<DifficultInfo> difficultSetter) {
        if (this.difficult == null) {
            this.difficult = new DifficultInfo();
            difficultSetter.accept(this.difficult);
        }

        return this;
    }

    /**
     * Get difficult
     * @return difficult
     */
    public DifficultInfo getDifficult() {
        return difficult;
    }

    public void setDifficult(DifficultInfo difficult) {
        this.difficult = difficult;
    }

    public PackageExerciseCard withExerciseType(Integer exerciseType) {
        this.exerciseType = exerciseType;
        return this;
    }

    /**
     * 习题类型编号
     * @return exerciseType
     */
    public Integer getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(Integer exerciseType) {
        this.exerciseType = exerciseType;
    }

    public PackageExerciseCard withExerciseTypeName(String exerciseTypeName) {
        this.exerciseTypeName = exerciseTypeName;
        return this;
    }

    /**
     * 习题类型名称
     * @return exerciseTypeName
     */
    public String getExerciseTypeName() {
        return exerciseTypeName;
    }

    public void setExerciseTypeName(String exerciseTypeName) {
        this.exerciseTypeName = exerciseTypeName;
    }

    public PackageExerciseCard withOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
        return this;
    }

    /**
     * 习题库里习题编号
     * @return orderCount
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public PackageExerciseCard withKnowledgePoint(List<KnowledgePointInfo> knowledgePoint) {
        this.knowledgePoint = knowledgePoint;
        return this;
    }

    public PackageExerciseCard addKnowledgePointItem(KnowledgePointInfo knowledgePointItem) {
        if (this.knowledgePoint == null) {
            this.knowledgePoint = new ArrayList<>();
        }
        this.knowledgePoint.add(knowledgePointItem);
        return this;
    }

    public PackageExerciseCard withKnowledgePoint(Consumer<List<KnowledgePointInfo>> knowledgePointSetter) {
        if (this.knowledgePoint == null) {
            this.knowledgePoint = new ArrayList<>();
        }
        knowledgePointSetter.accept(this.knowledgePoint);
        return this;
    }

    /**
     * 相关知识点
     * @return knowledgePoint
     */
    public List<KnowledgePointInfo> getKnowledgePoint() {
        return knowledgePoint;
    }

    public void setKnowledgePoint(List<KnowledgePointInfo> knowledgePoint) {
        this.knowledgePoint = knowledgePoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackageExerciseCard packageExerciseCard = (PackageExerciseCard) o;
        return Objects.equals(this.id, packageExerciseCard.id) && Objects.equals(this.name, packageExerciseCard.name)
            && Objects.equals(this.difficult, packageExerciseCard.difficult)
            && Objects.equals(this.exerciseType, packageExerciseCard.exerciseType)
            && Objects.equals(this.exerciseTypeName, packageExerciseCard.exerciseTypeName)
            && Objects.equals(this.orderCount, packageExerciseCard.orderCount)
            && Objects.equals(this.knowledgePoint, packageExerciseCard.knowledgePoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, difficult, exerciseType, exerciseTypeName, orderCount, knowledgePoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageExerciseCard {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    difficult: ").append(toIndentedString(difficult)).append("\n");
        sb.append("    exerciseType: ").append(toIndentedString(exerciseType)).append("\n");
        sb.append("    exerciseTypeName: ").append(toIndentedString(exerciseTypeName)).append("\n");
        sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
        sb.append("    knowledgePoint: ").append(toIndentedString(knowledgePoint)).append("\n");
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
