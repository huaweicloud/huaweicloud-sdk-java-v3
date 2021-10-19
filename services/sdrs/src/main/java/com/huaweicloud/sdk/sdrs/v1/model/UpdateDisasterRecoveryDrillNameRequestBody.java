package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 更新容灾演练名称请求体 */
public class UpdateDisasterRecoveryDrillNameRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_drill")

    private UpdateDisasterRecoveryDrillNameRequestParams disasterRecoveryDrill;

    public UpdateDisasterRecoveryDrillNameRequestBody withDisasterRecoveryDrill(
        UpdateDisasterRecoveryDrillNameRequestParams disasterRecoveryDrill) {
        this.disasterRecoveryDrill = disasterRecoveryDrill;
        return this;
    }

    public UpdateDisasterRecoveryDrillNameRequestBody withDisasterRecoveryDrill(
        Consumer<UpdateDisasterRecoveryDrillNameRequestParams> disasterRecoveryDrillSetter) {
        if (this.disasterRecoveryDrill == null) {
            this.disasterRecoveryDrill = new UpdateDisasterRecoveryDrillNameRequestParams();
            disasterRecoveryDrillSetter.accept(this.disasterRecoveryDrill);
        }

        return this;
    }

    /** Get disasterRecoveryDrill
     * 
     * @return disasterRecoveryDrill */
    public UpdateDisasterRecoveryDrillNameRequestParams getDisasterRecoveryDrill() {
        return disasterRecoveryDrill;
    }

    public void setDisasterRecoveryDrill(UpdateDisasterRecoveryDrillNameRequestParams disasterRecoveryDrill) {
        this.disasterRecoveryDrill = disasterRecoveryDrill;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDisasterRecoveryDrillNameRequestBody updateDisasterRecoveryDrillNameRequestBody =
            (UpdateDisasterRecoveryDrillNameRequestBody) o;
        return Objects.equals(this.disasterRecoveryDrill,
            updateDisasterRecoveryDrillNameRequestBody.disasterRecoveryDrill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryDrill);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDisasterRecoveryDrillNameRequestBody {\n");
        sb.append("    disasterRecoveryDrill: ").append(toIndentedString(disasterRecoveryDrill)).append("\n");
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
