package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 优化器参数
 */
public class Optimizer {

    /**
     * 优化器类型。
     */
    public static final class TypeEnum {

        /**
         * Enum ADAM for value: "adam"
         */
        public static final TypeEnum ADAM = new TypeEnum("adam");

        /**
         * Enum ADAGRAD for value: "adagrad"
         */
        public static final TypeEnum ADAGRAD = new TypeEnum("adagrad");

        /**
         * Enum FTRL for value: "ftrl"
         */
        public static final TypeEnum FTRL = new TypeEnum("ftrl");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("adam", ADAM);
            map.put("adagrad", ADAGRAD);
            map.put("ftrl", FTRL);
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
    @JsonProperty(value = "learning_rate")

    private Double learningRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_accumulator_value")

    private Double initialAccumulatorValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lambda1")

    private Double lambda1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lambda2")

    private Double lambda2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "epsilon")

    private Double epsilon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decay_rate")

    private Double decayRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decay_steps")

    private Double decaySteps;

    public Optimizer withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 优化器类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Optimizer withLearningRate(Double learningRate) {
        this.learningRate = learningRate;
        return this;
    }

    /**
     * 学习率。
     * minimum: 0
     * maximum: 1
     * @return learningRate
     */
    public Double getLearningRate() {
        return learningRate;
    }

    public void setLearningRate(Double learningRate) {
        this.learningRate = learningRate;
    }

    public Optimizer withInitialAccumulatorValue(Double initialAccumulatorValue) {
        this.initialAccumulatorValue = initialAccumulatorValue;
        return this;
    }

    /**
     * 初始梯度累加和。
     * minimum: 0
     * maximum: 1
     * @return initialAccumulatorValue
     */
    public Double getInitialAccumulatorValue() {
        return initialAccumulatorValue;
    }

    public void setInitialAccumulatorValue(Double initialAccumulatorValue) {
        this.initialAccumulatorValue = initialAccumulatorValue;
    }

    public Optimizer withLambda1(Double lambda1) {
        this.lambda1 = lambda1;
        return this;
    }

    /**
     * L1正则项系数。
     * minimum: 0
     * maximum: 1
     * @return lambda1
     */
    public Double getLambda1() {
        return lambda1;
    }

    public void setLambda1(Double lambda1) {
        this.lambda1 = lambda1;
    }

    public Optimizer withLambda2(Double lambda2) {
        this.lambda2 = lambda2;
        return this;
    }

    /**
     * L2正则项系数。
     * minimum: 0
     * maximum: 1
     * @return lambda2
     */
    public Double getLambda2() {
        return lambda2;
    }

    public void setLambda2(Double lambda2) {
        this.lambda2 = lambda2;
    }

    public Optimizer withEpsilon(Double epsilon) {
        this.epsilon = epsilon;
        return this;
    }

    /**
     * 数值稳定常量。
     * minimum: 0
     * maximum: 1
     * @return epsilon
     */
    public Double getEpsilon() {
        return epsilon;
    }

    public void setEpsilon(Double epsilon) {
        this.epsilon = epsilon;
    }

    public Optimizer withDecayRate(Double decayRate) {
        this.decayRate = decayRate;
        return this;
    }

    /**
     * 衰减因子。
     * minimum: 0
     * maximum: 1
     * @return decayRate
     */
    public Double getDecayRate() {
        return decayRate;
    }

    public void setDecayRate(Double decayRate) {
        this.decayRate = decayRate;
    }

    public Optimizer withDecaySteps(Double decaySteps) {
        this.decaySteps = decaySteps;
        return this;
    }

    /**
     * 衰减步长。
     * minimum: 1
     * @return decaySteps
     */
    public Double getDecaySteps() {
        return decaySteps;
    }

    public void setDecaySteps(Double decaySteps) {
        this.decaySteps = decaySteps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Optimizer optimizer = (Optimizer) o;
        return Objects.equals(this.type, optimizer.type) && Objects.equals(this.learningRate, optimizer.learningRate)
            && Objects.equals(this.initialAccumulatorValue, optimizer.initialAccumulatorValue)
            && Objects.equals(this.lambda1, optimizer.lambda1) && Objects.equals(this.lambda2, optimizer.lambda2)
            && Objects.equals(this.epsilon, optimizer.epsilon) && Objects.equals(this.decayRate, optimizer.decayRate)
            && Objects.equals(this.decaySteps, optimizer.decaySteps);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(type, learningRate, initialAccumulatorValue, lambda1, lambda2, epsilon, decayRate, decaySteps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Optimizer {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    learningRate: ").append(toIndentedString(learningRate)).append("\n");
        sb.append("    initialAccumulatorValue: ").append(toIndentedString(initialAccumulatorValue)).append("\n");
        sb.append("    lambda1: ").append(toIndentedString(lambda1)).append("\n");
        sb.append("    lambda2: ").append(toIndentedString(lambda2)).append("\n");
        sb.append("    epsilon: ").append(toIndentedString(epsilon)).append("\n");
        sb.append("    decayRate: ").append(toIndentedString(decayRate)).append("\n");
        sb.append("    decaySteps: ").append(toIndentedString(decaySteps)).append("\n");
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
