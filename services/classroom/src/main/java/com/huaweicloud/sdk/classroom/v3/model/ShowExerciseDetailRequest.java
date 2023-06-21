package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowExerciseDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exercise_id")

    private String exerciseId;

    public ShowExerciseDetailRequest withExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
        return this;
    }

    /**
     * 需查询的习题id
     * @return exerciseId
     */
    public String getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowExerciseDetailRequest showExerciseDetailRequest = (ShowExerciseDetailRequest) o;
        return Objects.equals(this.exerciseId, showExerciseDetailRequest.exerciseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exerciseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExerciseDetailRequest {\n");
        sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
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
