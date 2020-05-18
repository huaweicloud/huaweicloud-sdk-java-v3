package com.huaweicloud.sdk.classroom.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.classroom.v3.model.ExerciseGroup;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowJobExercisesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_exercises")
    
    private List<ExerciseGroup> groupExercises = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ShowJobExercisesResponse withGroupExercises(List<ExerciseGroup> groupExercises) {
        this.groupExercises = groupExercises;
        return this;
    }

    
    public ShowJobExercisesResponse addGroupExercisesItem(ExerciseGroup groupExercisesItem) {
        if (this.groupExercises == null) {
            this.groupExercises = new ArrayList<>();
        }
        this.groupExercises.add(groupExercisesItem);
        return this;
    }

    public ShowJobExercisesResponse withGroupExercises(Consumer<List<ExerciseGroup>> groupExercisesSetter) {
        if(this.groupExercises == null ){
            this.groupExercises = new ArrayList<>();
        }
        groupExercisesSetter.accept(this.groupExercises);
        return this;
    }

    /**
     * 作业下习题列表
     * @return groupExercises
     */
    public List<ExerciseGroup> getGroupExercises() {
        return groupExercises;
    }

    public void setGroupExercises(List<ExerciseGroup> groupExercises) {
        this.groupExercises = groupExercises;
    }

    public ShowJobExercisesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 作业下习题总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobExercisesResponse showJobExercisesResponse = (ShowJobExercisesResponse) o;
        return Objects.equals(this.groupExercises, showJobExercisesResponse.groupExercises) &&
            Objects.equals(this.total, showJobExercisesResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupExercises, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobExercisesResponse {\n");
            sb.append("    groupExercises: ").append(toIndentedString(groupExercises)).append("\n");
            sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

