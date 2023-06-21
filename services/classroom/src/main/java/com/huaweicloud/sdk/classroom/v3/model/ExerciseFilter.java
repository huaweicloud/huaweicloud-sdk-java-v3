package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取习题库里习题过滤字段
 */
public class ExerciseFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exercise_type")

    private List<Integer> exerciseType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "difficult_ids")

    private List<String> difficultIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_point_ids")

    private List<String> knowledgePointIds = null;

    public ExerciseFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 需查询的习题名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExerciseFilter withExerciseType(List<Integer> exerciseType) {
        this.exerciseType = exerciseType;
        return this;
    }

    public ExerciseFilter addExerciseTypeItem(Integer exerciseTypeItem) {
        if (this.exerciseType == null) {
            this.exerciseType = new ArrayList<>();
        }
        this.exerciseType.add(exerciseTypeItem);
        return this;
    }

    public ExerciseFilter withExerciseType(Consumer<List<Integer>> exerciseTypeSetter) {
        if (this.exerciseType == null) {
            this.exerciseType = new ArrayList<>();
        }
        exerciseTypeSetter.accept(this.exerciseType);
        return this;
    }

    /**
     * 习题类型列表
     * @return exerciseType
     */
    public List<Integer> getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(List<Integer> exerciseType) {
        this.exerciseType = exerciseType;
    }

    public ExerciseFilter withDifficultIds(List<String> difficultIds) {
        this.difficultIds = difficultIds;
        return this;
    }

    public ExerciseFilter addDifficultIdsItem(String difficultIdsItem) {
        if (this.difficultIds == null) {
            this.difficultIds = new ArrayList<>();
        }
        this.difficultIds.add(difficultIdsItem);
        return this;
    }

    public ExerciseFilter withDifficultIds(Consumer<List<String>> difficultIdsSetter) {
        if (this.difficultIds == null) {
            this.difficultIds = new ArrayList<>();
        }
        difficultIdsSetter.accept(this.difficultIds);
        return this;
    }

    /**
     * 难度id列表
     * @return difficultIds
     */
    public List<String> getDifficultIds() {
        return difficultIds;
    }

    public void setDifficultIds(List<String> difficultIds) {
        this.difficultIds = difficultIds;
    }

    public ExerciseFilter withKnowledgePointIds(List<String> knowledgePointIds) {
        this.knowledgePointIds = knowledgePointIds;
        return this;
    }

    public ExerciseFilter addKnowledgePointIdsItem(String knowledgePointIdsItem) {
        if (this.knowledgePointIds == null) {
            this.knowledgePointIds = new ArrayList<>();
        }
        this.knowledgePointIds.add(knowledgePointIdsItem);
        return this;
    }

    public ExerciseFilter withKnowledgePointIds(Consumer<List<String>> knowledgePointIdsSetter) {
        if (this.knowledgePointIds == null) {
            this.knowledgePointIds = new ArrayList<>();
        }
        knowledgePointIdsSetter.accept(this.knowledgePointIds);
        return this;
    }

    /**
     * 知识点id列表
     * @return knowledgePointIds
     */
    public List<String> getKnowledgePointIds() {
        return knowledgePointIds;
    }

    public void setKnowledgePointIds(List<String> knowledgePointIds) {
        this.knowledgePointIds = knowledgePointIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExerciseFilter exerciseFilter = (ExerciseFilter) o;
        return Objects.equals(this.name, exerciseFilter.name)
            && Objects.equals(this.exerciseType, exerciseFilter.exerciseType)
            && Objects.equals(this.difficultIds, exerciseFilter.difficultIds)
            && Objects.equals(this.knowledgePointIds, exerciseFilter.knowledgePointIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, exerciseType, difficultIds, knowledgePointIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExerciseFilter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    exerciseType: ").append(toIndentedString(exerciseType)).append("\n");
        sb.append("    difficultIds: ").append(toIndentedString(difficultIds)).append("\n");
        sb.append("    knowledgePointIds: ").append(toIndentedString(knowledgePointIds)).append("\n");
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
