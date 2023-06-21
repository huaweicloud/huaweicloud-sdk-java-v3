package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListExercisesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExercisesListRequestBody body;

    public ListExercisesRequest withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 习题库id
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public ListExercisesRequest withBody(ExercisesListRequestBody body) {
        this.body = body;
        return this;
    }

    public ListExercisesRequest withBody(Consumer<ExercisesListRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExercisesListRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExercisesListRequestBody getBody() {
        return body;
    }

    public void setBody(ExercisesListRequestBody body) {
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
        ListExercisesRequest listExercisesRequest = (ListExercisesRequest) o;
        return Objects.equals(this.packageId, listExercisesRequest.packageId)
            && Objects.equals(this.body, listExercisesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExercisesRequest {\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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
