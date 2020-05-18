package com.huaweicloud.sdk.classroom.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * ExerciseCard
 */
public class ExerciseCard  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exercise_id")
    
    private String exerciseId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_sub_type")
    
    private Integer resourceSubType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_score")
    
    private Integer targetScore;

    public ExerciseCard withName(String name) {
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

    public ExerciseCard withExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
        return this;
    }

    


    /**
     * 习题ID
     * @return exerciseId
     */
    public String getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
    }

    public ExerciseCard withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 习题描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExerciseCard withResourceSubType(Integer resourceSubType) {
        this.resourceSubType = resourceSubType;
        return this;
    }

    


    /**
     * 习题子类型 1：函数c 2：函数c++ 3：函数Java 4：函数Python 5：单人项目java 6：单人项目Hadoop 7：通用 8：企业级软件项目 10：web习题 11：AI习题 12：单选题 13：多选题 14：填空题 15：单人项目C 16：单人项目C++
     * @return resourceSubType
     */
    public Integer getResourceSubType() {
        return resourceSubType;
    }

    public void setResourceSubType(Integer resourceSubType) {
        this.resourceSubType = resourceSubType;
    }

    public ExerciseCard withTargetScore(Integer targetScore) {
        this.targetScore = targetScore;
        return this;
    }

    


    /**
     * 习题分值
     * @return targetScore
     */
    public Integer getTargetScore() {
        return targetScore;
    }

    public void setTargetScore(Integer targetScore) {
        this.targetScore = targetScore;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExerciseCard exerciseCard = (ExerciseCard) o;
        return Objects.equals(this.name, exerciseCard.name) &&
            Objects.equals(this.exerciseId, exerciseCard.exerciseId) &&
            Objects.equals(this.description, exerciseCard.description) &&
            Objects.equals(this.resourceSubType, exerciseCard.resourceSubType) &&
            Objects.equals(this.targetScore, exerciseCard.targetScore);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, exerciseId, description, resourceSubType, targetScore);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExerciseCard {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    resourceSubType: ").append(toIndentedString(resourceSubType)).append("\n");
            sb.append("    targetScore: ").append(toIndentedString(targetScore)).append("\n");
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

