package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExecuteExerciseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user-token")

    private String userToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exercise_id")

    private String exerciseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PackageExerciseJudgeRequestBody body;

    public ExecuteExerciseRequest withUserToken(String userToken) {
        this.userToken = userToken;
        return this;
    }

    /**
     * 具体调用者的用户token
     * @return userToken
     */
    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public ExecuteExerciseRequest withExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
        return this;
    }

    /**
     * 需判题的习题id
     * @return exerciseId
     */
    public String getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
    }

    public ExecuteExerciseRequest withBody(PackageExerciseJudgeRequestBody body) {
        this.body = body;
        return this;
    }

    public ExecuteExerciseRequest withBody(Consumer<PackageExerciseJudgeRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new PackageExerciseJudgeRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PackageExerciseJudgeRequestBody getBody() {
        return body;
    }

    public void setBody(PackageExerciseJudgeRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteExerciseRequest executeExerciseRequest = (ExecuteExerciseRequest) o;
        return Objects.equals(this.userToken, executeExerciseRequest.userToken)
            && Objects.equals(this.exerciseId, executeExerciseRequest.exerciseId)
            && Objects.equals(this.body, executeExerciseRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userToken, exerciseId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteExerciseRequest {\n");
        sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
        sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
