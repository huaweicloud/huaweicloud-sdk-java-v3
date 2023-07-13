package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建容灾演练请求体
 */
public class CreateDisasterRecoveryDrillRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_drill")

    private CreateDisasterRecoveryDrillRequestParams disasterRecoveryDrill;

    public CreateDisasterRecoveryDrillRequestBody withDisasterRecoveryDrill(
        CreateDisasterRecoveryDrillRequestParams disasterRecoveryDrill) {
        this.disasterRecoveryDrill = disasterRecoveryDrill;
        return this;
    }

    public CreateDisasterRecoveryDrillRequestBody withDisasterRecoveryDrill(
        Consumer<CreateDisasterRecoveryDrillRequestParams> disasterRecoveryDrillSetter) {
        if (this.disasterRecoveryDrill == null) {
            this.disasterRecoveryDrill = new CreateDisasterRecoveryDrillRequestParams();
            disasterRecoveryDrillSetter.accept(this.disasterRecoveryDrill);
        }

        return this;
    }

    /**
     * Get disasterRecoveryDrill
     * @return disasterRecoveryDrill
     */
    public CreateDisasterRecoveryDrillRequestParams getDisasterRecoveryDrill() {
        return disasterRecoveryDrill;
    }

    public void setDisasterRecoveryDrill(CreateDisasterRecoveryDrillRequestParams disasterRecoveryDrill) {
        this.disasterRecoveryDrill = disasterRecoveryDrill;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDisasterRecoveryDrillRequestBody that = (CreateDisasterRecoveryDrillRequestBody) obj;
        return Objects.equals(this.disasterRecoveryDrill, that.disasterRecoveryDrill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryDrill);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDisasterRecoveryDrillRequestBody {\n");
        sb.append("    disasterRecoveryDrill: ").append(toIndentedString(disasterRecoveryDrill)).append("\n");
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
