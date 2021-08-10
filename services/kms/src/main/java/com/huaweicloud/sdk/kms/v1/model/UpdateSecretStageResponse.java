package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdateSecretStageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private Stage stage;

    public UpdateSecretStageResponse withStage(Stage stage) {
        this.stage = stage;
        return this;
    }

    public UpdateSecretStageResponse withStage(Consumer<Stage> stageSetter) {
        if (this.stage == null) {
            this.stage = new Stage();
            stageSetter.accept(this.stage);
        }

        return this;
    }

    /** Get stage
     * 
     * @return stage */
    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSecretStageResponse updateSecretStageResponse = (UpdateSecretStageResponse) o;
        return Objects.equals(this.stage, updateSecretStageResponse.stage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecretStageResponse {\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
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
