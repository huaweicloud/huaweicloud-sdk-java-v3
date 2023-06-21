package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 习题详细内容及测试用例信息
 */
public class ExerciseDetailData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exercise_code_resource")

    private ExerciseCodeResource exerciseCodeResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exercise_case_resource")

    private List<ExerciseCaseResource> exerciseCaseResource = null;

    public ExerciseDetailData withExerciseCodeResource(ExerciseCodeResource exerciseCodeResource) {
        this.exerciseCodeResource = exerciseCodeResource;
        return this;
    }

    public ExerciseDetailData withExerciseCodeResource(Consumer<ExerciseCodeResource> exerciseCodeResourceSetter) {
        if (this.exerciseCodeResource == null) {
            this.exerciseCodeResource = new ExerciseCodeResource();
            exerciseCodeResourceSetter.accept(this.exerciseCodeResource);
        }

        return this;
    }

    /**
     * Get exerciseCodeResource
     * @return exerciseCodeResource
     */
    public ExerciseCodeResource getExerciseCodeResource() {
        return exerciseCodeResource;
    }

    public void setExerciseCodeResource(ExerciseCodeResource exerciseCodeResource) {
        this.exerciseCodeResource = exerciseCodeResource;
    }

    public ExerciseDetailData withExerciseCaseResource(List<ExerciseCaseResource> exerciseCaseResource) {
        this.exerciseCaseResource = exerciseCaseResource;
        return this;
    }

    public ExerciseDetailData addExerciseCaseResourceItem(ExerciseCaseResource exerciseCaseResourceItem) {
        if (this.exerciseCaseResource == null) {
            this.exerciseCaseResource = new ArrayList<>();
        }
        this.exerciseCaseResource.add(exerciseCaseResourceItem);
        return this;
    }

    public ExerciseDetailData withExerciseCaseResource(
        Consumer<List<ExerciseCaseResource>> exerciseCaseResourceSetter) {
        if (this.exerciseCaseResource == null) {
            this.exerciseCaseResource = new ArrayList<>();
        }
        exerciseCaseResourceSetter.accept(this.exerciseCaseResource);
        return this;
    }

    /**
     * 测试用例信息
     * @return exerciseCaseResource
     */
    public List<ExerciseCaseResource> getExerciseCaseResource() {
        return exerciseCaseResource;
    }

    public void setExerciseCaseResource(List<ExerciseCaseResource> exerciseCaseResource) {
        this.exerciseCaseResource = exerciseCaseResource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExerciseDetailData exerciseDetailData = (ExerciseDetailData) o;
        return Objects.equals(this.exerciseCodeResource, exerciseDetailData.exerciseCodeResource)
            && Objects.equals(this.exerciseCaseResource, exerciseDetailData.exerciseCaseResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exerciseCodeResource, exerciseCaseResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExerciseDetailData {\n");
        sb.append("    exerciseCodeResource: ").append(toIndentedString(exerciseCodeResource)).append("\n");
        sb.append("    exerciseCaseResource: ").append(toIndentedString(exerciseCaseResource)).append("\n");
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
