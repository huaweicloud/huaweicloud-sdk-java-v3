package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowExerciseDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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
    @JsonProperty(value = "test_case_description")

    private String testCaseDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_point")

    private List<KnowledgePointInfo> knowledgePoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "judge_type")

    private Integer judgeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exercise_data")

    private ExerciseDetailData exerciseData;

    public ShowExerciseDetailResponse withId(String id) {
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

    public ShowExerciseDetailResponse withName(String name) {
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

    public ShowExerciseDetailResponse withDescription(String description) {
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

    public ShowExerciseDetailResponse withDifficult(DifficultInfo difficult) {
        this.difficult = difficult;
        return this;
    }

    public ShowExerciseDetailResponse withDifficult(Consumer<DifficultInfo> difficultSetter) {
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

    public ShowExerciseDetailResponse withExerciseType(Integer exerciseType) {
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

    public ShowExerciseDetailResponse withExerciseTypeName(String exerciseTypeName) {
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

    public ShowExerciseDetailResponse withOrderCount(Integer orderCount) {
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

    public ShowExerciseDetailResponse withTestCaseDescription(String testCaseDescription) {
        this.testCaseDescription = testCaseDescription;
        return this;
    }

    /**
     * 测试用例描述
     * @return testCaseDescription
     */
    public String getTestCaseDescription() {
        return testCaseDescription;
    }

    public void setTestCaseDescription(String testCaseDescription) {
        this.testCaseDescription = testCaseDescription;
    }

    public ShowExerciseDetailResponse withKnowledgePoint(List<KnowledgePointInfo> knowledgePoint) {
        this.knowledgePoint = knowledgePoint;
        return this;
    }

    public ShowExerciseDetailResponse addKnowledgePointItem(KnowledgePointInfo knowledgePointItem) {
        if (this.knowledgePoint == null) {
            this.knowledgePoint = new ArrayList<>();
        }
        this.knowledgePoint.add(knowledgePointItem);
        return this;
    }

    public ShowExerciseDetailResponse withKnowledgePoint(Consumer<List<KnowledgePointInfo>> knowledgePointSetter) {
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

    public ShowExerciseDetailResponse withJudgeType(Integer judgeType) {
        this.judgeType = judgeType;
        return this;
    }

    /**
     * 判题类型
     * @return judgeType
     */
    public Integer getJudgeType() {
        return judgeType;
    }

    public void setJudgeType(Integer judgeType) {
        this.judgeType = judgeType;
    }

    public ShowExerciseDetailResponse withExerciseData(ExerciseDetailData exerciseData) {
        this.exerciseData = exerciseData;
        return this;
    }

    public ShowExerciseDetailResponse withExerciseData(Consumer<ExerciseDetailData> exerciseDataSetter) {
        if (this.exerciseData == null) {
            this.exerciseData = new ExerciseDetailData();
            exerciseDataSetter.accept(this.exerciseData);
        }

        return this;
    }

    /**
     * Get exerciseData
     * @return exerciseData
     */
    public ExerciseDetailData getExerciseData() {
        return exerciseData;
    }

    public void setExerciseData(ExerciseDetailData exerciseData) {
        this.exerciseData = exerciseData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowExerciseDetailResponse that = (ShowExerciseDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.difficult, that.difficult)
            && Objects.equals(this.exerciseType, that.exerciseType)
            && Objects.equals(this.exerciseTypeName, that.exerciseTypeName)
            && Objects.equals(this.orderCount, that.orderCount)
            && Objects.equals(this.testCaseDescription, that.testCaseDescription)
            && Objects.equals(this.knowledgePoint, that.knowledgePoint)
            && Objects.equals(this.judgeType, that.judgeType) && Objects.equals(this.exerciseData, that.exerciseData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            difficult,
            exerciseType,
            exerciseTypeName,
            orderCount,
            testCaseDescription,
            knowledgePoint,
            judgeType,
            exerciseData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExerciseDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    difficult: ").append(toIndentedString(difficult)).append("\n");
        sb.append("    exerciseType: ").append(toIndentedString(exerciseType)).append("\n");
        sb.append("    exerciseTypeName: ").append(toIndentedString(exerciseTypeName)).append("\n");
        sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
        sb.append("    testCaseDescription: ").append(toIndentedString(testCaseDescription)).append("\n");
        sb.append("    knowledgePoint: ").append(toIndentedString(knowledgePoint)).append("\n");
        sb.append("    judgeType: ").append(toIndentedString(judgeType)).append("\n");
        sb.append("    exerciseData: ").append(toIndentedString(exerciseData)).append("\n");
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
