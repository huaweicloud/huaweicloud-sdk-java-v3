package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class GetHaConfigurationResponse extends SdkResponse {

    /**
     * 高可用选项，接受高可用或者拒绝高可用功能。
     */
    public static final class DisasterRecoveryChoiceEnum {

        /**
         * Enum ACCEPT for value: "ACCEPT"
         */
        public static final DisasterRecoveryChoiceEnum ACCEPT = new DisasterRecoveryChoiceEnum("ACCEPT");

        /**
         * Enum REJECT for value: "REJECT"
         */
        public static final DisasterRecoveryChoiceEnum REJECT = new DisasterRecoveryChoiceEnum("REJECT");

        private static final Map<String, DisasterRecoveryChoiceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DisasterRecoveryChoiceEnum> createStaticFields() {
            Map<String, DisasterRecoveryChoiceEnum> map = new HashMap<>();
            map.put("ACCEPT", ACCEPT);
            map.put("REJECT", REJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DisasterRecoveryChoiceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DisasterRecoveryChoiceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new DisasterRecoveryChoiceEnum(value));
        }

        public static DisasterRecoveryChoiceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DisasterRecoveryChoiceEnum) {
                return this.value.equals(((DisasterRecoveryChoiceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_choice")

    private DisasterRecoveryChoiceEnum disasterRecoveryChoice;

    public GetHaConfigurationResponse withDisasterRecoveryChoice(DisasterRecoveryChoiceEnum disasterRecoveryChoice) {
        this.disasterRecoveryChoice = disasterRecoveryChoice;
        return this;
    }

    /**
     * 高可用选项，接受高可用或者拒绝高可用功能。
     * @return disasterRecoveryChoice
     */
    public DisasterRecoveryChoiceEnum getDisasterRecoveryChoice() {
        return disasterRecoveryChoice;
    }

    public void setDisasterRecoveryChoice(DisasterRecoveryChoiceEnum disasterRecoveryChoice) {
        this.disasterRecoveryChoice = disasterRecoveryChoice;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetHaConfigurationResponse that = (GetHaConfigurationResponse) obj;
        return Objects.equals(this.disasterRecoveryChoice, that.disasterRecoveryChoice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryChoice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetHaConfigurationResponse {\n");
        sb.append("    disasterRecoveryChoice: ").append(toIndentedString(disasterRecoveryChoice)).append("\n");
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
