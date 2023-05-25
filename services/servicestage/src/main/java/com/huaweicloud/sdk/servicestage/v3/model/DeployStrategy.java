package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeployStrategy
 */
public class DeployStrategy {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum ONEBATCHRELEASE for value: "OneBatchRelease"
         */
        public static final TypeEnum ONEBATCHRELEASE = new TypeEnum("OneBatchRelease");

        /**
         * Enum ROLLINGRELEASE for value: "RollingRelease"
         */
        public static final TypeEnum ROLLINGRELEASE = new TypeEnum("RollingRelease");

        /**
         * Enum GRAYRELEASE for value: "GrayRelease"
         */
        public static final TypeEnum GRAYRELEASE = new TypeEnum("GrayRelease");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("OneBatchRelease", ONEBATCHRELEASE);
            map.put("RollingRelease", ROLLINGRELEASE);
            map.put("GrayRelease", GRAYRELEASE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rolling_release")

    private DeployStrategyRollingRelease rollingRelease;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_release")

    private DeployStrategyGrayRelease grayRelease;

    public DeployStrategy withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DeployStrategy withRollingRelease(DeployStrategyRollingRelease rollingRelease) {
        this.rollingRelease = rollingRelease;
        return this;
    }

    public DeployStrategy withRollingRelease(Consumer<DeployStrategyRollingRelease> rollingReleaseSetter) {
        if (this.rollingRelease == null) {
            this.rollingRelease = new DeployStrategyRollingRelease();
            rollingReleaseSetter.accept(this.rollingRelease);
        }

        return this;
    }

    /**
     * Get rollingRelease
     * @return rollingRelease
     */
    public DeployStrategyRollingRelease getRollingRelease() {
        return rollingRelease;
    }

    public void setRollingRelease(DeployStrategyRollingRelease rollingRelease) {
        this.rollingRelease = rollingRelease;
    }

    public DeployStrategy withGrayRelease(DeployStrategyGrayRelease grayRelease) {
        this.grayRelease = grayRelease;
        return this;
    }

    public DeployStrategy withGrayRelease(Consumer<DeployStrategyGrayRelease> grayReleaseSetter) {
        if (this.grayRelease == null) {
            this.grayRelease = new DeployStrategyGrayRelease();
            grayReleaseSetter.accept(this.grayRelease);
        }

        return this;
    }

    /**
     * Get grayRelease
     * @return grayRelease
     */
    public DeployStrategyGrayRelease getGrayRelease() {
        return grayRelease;
    }

    public void setGrayRelease(DeployStrategyGrayRelease grayRelease) {
        this.grayRelease = grayRelease;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeployStrategy deployStrategy = (DeployStrategy) o;
        return Objects.equals(this.type, deployStrategy.type)
            && Objects.equals(this.rollingRelease, deployStrategy.rollingRelease)
            && Objects.equals(this.grayRelease, deployStrategy.grayRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, rollingRelease, grayRelease);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployStrategy {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    rollingRelease: ").append(toIndentedString(rollingRelease)).append("\n");
        sb.append("    grayRelease: ").append(toIndentedString(grayRelease)).append("\n");
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
