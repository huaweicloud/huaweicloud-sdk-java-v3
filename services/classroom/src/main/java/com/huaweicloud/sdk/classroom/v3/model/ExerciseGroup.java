package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ExerciseGroup */
public class ExerciseGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exercises")

    private List<ExerciseCard> exercises = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ExerciseGroup withExercises(List<ExerciseCard> exercises) {
        this.exercises = exercises;
        return this;
    }

    public ExerciseGroup addExercisesItem(ExerciseCard exercisesItem) {
        if (this.exercises == null) {
            this.exercises = new ArrayList<>();
        }
        this.exercises.add(exercisesItem);
        return this;
    }

    public ExerciseGroup withExercises(Consumer<List<ExerciseCard>> exercisesSetter) {
        if (this.exercises == null) {
            this.exercises = new ArrayList<>();
        }
        exercisesSetter.accept(this.exercises);
        return this;
    }

    /** 习题列表
     * 
     * @return exercises */
    public List<ExerciseCard> getExercises() {
        return exercises;
    }

    public void setExercises(List<ExerciseCard> exercises) {
        this.exercises = exercises;
    }

    public ExerciseGroup withType(String type) {
        this.type = type;
        return this;
    }

    /** 习题分类
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExerciseGroup exerciseGroup = (ExerciseGroup) o;
        return Objects.equals(this.exercises, exerciseGroup.exercises) && Objects.equals(this.type, exerciseGroup.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exercises, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExerciseGroup {\n");
        sb.append("    exercises: ").append(toIndentedString(exercises)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
