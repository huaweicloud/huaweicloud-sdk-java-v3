package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AlgorithmSpecifyParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latent_vector_length")

    private Integer latentVectorLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private List<Integer> architecture = null;

    /**
     * 激活函数(DEEPFM需要提供此参数,AutoGroup需要提供此参数)。
     */
    public static final class ActiveFunctionEnum {

        /**
         * Enum RELU for value: "relu"
         */
        public static final ActiveFunctionEnum RELU = new ActiveFunctionEnum("relu");

        /**
         * Enum SIGMOID for value: "sigmoid"
         */
        public static final ActiveFunctionEnum SIGMOID = new ActiveFunctionEnum("sigmoid");

        /**
         * Enum TANH for value: "tanh"
         */
        public static final ActiveFunctionEnum TANH = new ActiveFunctionEnum("tanh");

        private static final Map<String, ActiveFunctionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActiveFunctionEnum> createStaticFields() {
            Map<String, ActiveFunctionEnum> map = new HashMap<>();
            map.put("relu", RELU);
            map.put("sigmoid", SIGMOID);
            map.put("tanh", TANH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActiveFunctionEnum(String value) {
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
        public static ActiveFunctionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActiveFunctionEnum(value));
        }

        public static ActiveFunctionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActiveFunctionEnum) {
                return this.value.equals(((ActiveFunctionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_function")

    private ActiveFunctionEnum activeFunction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_keep_probability")

    private Double valueKeepProbability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "embed_size")

    private List<Integer> embedSize = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mlp_architecture")

    private List<Integer> mlpArchitecture = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_order")

    private Integer maxOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash_sizes")

    private List<Integer> hashSizes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash_compensation")

    private List<Double> hashCompensation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_wide_part")

    private Boolean useWidePart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "structure_optimizer")

    private Optimizer structureOptimizer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_multi_hot")

    private Boolean mergeMultiHot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fix_structure")

    private Boolean fixStructure;

    public AlgorithmSpecifyParameters withLatentVectorLength(Integer latentVectorLength) {
        this.latentVectorLength = latentVectorLength;
        return this;
    }

    /**
     * 隐向量长度(DEEPFM需要提供此参数)。
     * minimum: 1
     * maximum: 100
     * @return latentVectorLength
     */
    public Integer getLatentVectorLength() {
        return latentVectorLength;
    }

    public void setLatentVectorLength(Integer latentVectorLength) {
        this.latentVectorLength = latentVectorLength;
    }

    public AlgorithmSpecifyParameters withArchitecture(List<Integer> architecture) {
        this.architecture = architecture;
        return this;
    }

    public AlgorithmSpecifyParameters addArchitectureItem(Integer architectureItem) {
        if (this.architecture == null) {
            this.architecture = new ArrayList<>();
        }
        this.architecture.add(architectureItem);
        return this;
    }

    public AlgorithmSpecifyParameters withArchitecture(Consumer<List<Integer>> architectureSetter) {
        if (this.architecture == null) {
            this.architecture = new ArrayList<>();
        }
        architectureSetter.accept(this.architecture);
        return this;
    }

    /**
     * 神经网络结构(DEEPFM需要提供此参数)。
     * @return architecture
     */
    public List<Integer> getArchitecture() {
        return architecture;
    }

    public void setArchitecture(List<Integer> architecture) {
        this.architecture = architecture;
    }

    public AlgorithmSpecifyParameters withActiveFunction(ActiveFunctionEnum activeFunction) {
        this.activeFunction = activeFunction;
        return this;
    }

    /**
     * 激活函数(DEEPFM需要提供此参数,AutoGroup需要提供此参数)。
     * @return activeFunction
     */
    public ActiveFunctionEnum getActiveFunction() {
        return activeFunction;
    }

    public void setActiveFunction(ActiveFunctionEnum activeFunction) {
        this.activeFunction = activeFunction;
    }

    public AlgorithmSpecifyParameters withValueKeepProbability(Double valueKeepProbability) {
        this.valueKeepProbability = valueKeepProbability;
        return this;
    }

    /**
     * 神经元值保留概率(DEEPFM需要提供此参数,AutoGroup需要提供此参数)。
     * minimum: 0
     * maximum: 1
     * @return valueKeepProbability
     */
    public Double getValueKeepProbability() {
        return valueKeepProbability;
    }

    public void setValueKeepProbability(Double valueKeepProbability) {
        this.valueKeepProbability = valueKeepProbability;
    }

    public AlgorithmSpecifyParameters withEmbedSize(List<Integer> embedSize) {
        this.embedSize = embedSize;
        return this;
    }

    public AlgorithmSpecifyParameters addEmbedSizeItem(Integer embedSizeItem) {
        if (this.embedSize == null) {
            this.embedSize = new ArrayList<>();
        }
        this.embedSize.add(embedSizeItem);
        return this;
    }

    public AlgorithmSpecifyParameters withEmbedSize(Consumer<List<Integer>> embedSizeSetter) {
        if (this.embedSize == null) {
            this.embedSize = new ArrayList<>();
        }
        embedSizeSetter.accept(this.embedSize);
        return this;
    }

    /**
     * 各阶隐向量长度(AutoGroup需要提供此参数)。
     * @return embedSize
     */
    public List<Integer> getEmbedSize() {
        return embedSize;
    }

    public void setEmbedSize(List<Integer> embedSize) {
        this.embedSize = embedSize;
    }

    public AlgorithmSpecifyParameters withMlpArchitecture(List<Integer> mlpArchitecture) {
        this.mlpArchitecture = mlpArchitecture;
        return this;
    }

    public AlgorithmSpecifyParameters addMlpArchitectureItem(Integer mlpArchitectureItem) {
        if (this.mlpArchitecture == null) {
            this.mlpArchitecture = new ArrayList<>();
        }
        this.mlpArchitecture.add(mlpArchitectureItem);
        return this;
    }

    public AlgorithmSpecifyParameters withMlpArchitecture(Consumer<List<Integer>> mlpArchitectureSetter) {
        if (this.mlpArchitecture == null) {
            this.mlpArchitecture = new ArrayList<>();
        }
        mlpArchitectureSetter.accept(this.mlpArchitecture);
        return this;
    }

    /**
     * 神经网络结构(AutoGroup需要提供此参数)。
     * @return mlpArchitecture
     */
    public List<Integer> getMlpArchitecture() {
        return mlpArchitecture;
    }

    public void setMlpArchitecture(List<Integer> mlpArchitecture) {
        this.mlpArchitecture = mlpArchitecture;
    }

    public AlgorithmSpecifyParameters withMaxOrder(Integer maxOrder) {
        this.maxOrder = maxOrder;
        return this;
    }

    /**
     * 最大交互阶数(AutoGroup需要提供此参数)。
     * @return maxOrder
     */
    public Integer getMaxOrder() {
        return maxOrder;
    }

    public void setMaxOrder(Integer maxOrder) {
        this.maxOrder = maxOrder;
    }

    public AlgorithmSpecifyParameters withHashSizes(List<Integer> hashSizes) {
        this.hashSizes = hashSizes;
        return this;
    }

    public AlgorithmSpecifyParameters addHashSizesItem(Integer hashSizesItem) {
        if (this.hashSizes == null) {
            this.hashSizes = new ArrayList<>();
        }
        this.hashSizes.add(hashSizesItem);
        return this;
    }

    public AlgorithmSpecifyParameters withHashSizes(Consumer<List<Integer>> hashSizesSetter) {
        if (this.hashSizes == null) {
            this.hashSizes = new ArrayList<>();
        }
        hashSizesSetter.accept(this.hashSizes);
        return this;
    }

    /**
     * 哈希长度(AutoGroup需要提供此参数)。
     * @return hashSizes
     */
    public List<Integer> getHashSizes() {
        return hashSizes;
    }

    public void setHashSizes(List<Integer> hashSizes) {
        this.hashSizes = hashSizes;
    }

    public AlgorithmSpecifyParameters withHashCompensation(List<Double> hashCompensation) {
        this.hashCompensation = hashCompensation;
        return this;
    }

    public AlgorithmSpecifyParameters addHashCompensationItem(Double hashCompensationItem) {
        if (this.hashCompensation == null) {
            this.hashCompensation = new ArrayList<>();
        }
        this.hashCompensation.add(hashCompensationItem);
        return this;
    }

    public AlgorithmSpecifyParameters withHashCompensation(Consumer<List<Double>> hashCompensationSetter) {
        if (this.hashCompensation == null) {
            this.hashCompensation = new ArrayList<>();
        }
        hashCompensationSetter.accept(this.hashCompensation);
        return this;
    }

    /**
     * 特征交互层惩罚项系数(AutoGroup需要提供此参数)。
     * @return hashCompensation
     */
    public List<Double> getHashCompensation() {
        return hashCompensation;
    }

    public void setHashCompensation(List<Double> hashCompensation) {
        this.hashCompensation = hashCompensation;
    }

    public AlgorithmSpecifyParameters withUseWidePart(Boolean useWidePart) {
        this.useWidePart = useWidePart;
        return this;
    }

    /**
     * 使用线性部分(AutoGroup需要提供此参数)。
     * @return useWidePart
     */
    public Boolean getUseWidePart() {
        return useWidePart;
    }

    public void setUseWidePart(Boolean useWidePart) {
        this.useWidePart = useWidePart;
    }

    public AlgorithmSpecifyParameters withStructureOptimizer(Optimizer structureOptimizer) {
        this.structureOptimizer = structureOptimizer;
        return this;
    }

    public AlgorithmSpecifyParameters withStructureOptimizer(Consumer<Optimizer> structureOptimizerSetter) {
        if (this.structureOptimizer == null) {
            this.structureOptimizer = new Optimizer();
            structureOptimizerSetter.accept(this.structureOptimizer);
        }

        return this;
    }

    /**
     * Get structureOptimizer
     * @return structureOptimizer
     */
    public Optimizer getStructureOptimizer() {
        return structureOptimizer;
    }

    public void setStructureOptimizer(Optimizer structureOptimizer) {
        this.structureOptimizer = structureOptimizer;
    }

    public AlgorithmSpecifyParameters withMergeMultiHot(Boolean mergeMultiHot) {
        this.mergeMultiHot = mergeMultiHot;
        return this;
    }

    /**
     * 融合多值特征(AutoGroup需要提供此参数)。
     * @return mergeMultiHot
     */
    public Boolean getMergeMultiHot() {
        return mergeMultiHot;
    }

    public void setMergeMultiHot(Boolean mergeMultiHot) {
        this.mergeMultiHot = mergeMultiHot;
    }

    public AlgorithmSpecifyParameters withFixStructure(Boolean fixStructure) {
        this.fixStructure = fixStructure;
        return this;
    }

    /**
     * 固定哈希结构(AutoGroup需要提供此参数)。
     * @return fixStructure
     */
    public Boolean getFixStructure() {
        return fixStructure;
    }

    public void setFixStructure(Boolean fixStructure) {
        this.fixStructure = fixStructure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmSpecifyParameters that = (AlgorithmSpecifyParameters) obj;
        return Objects.equals(this.latentVectorLength, that.latentVectorLength)
            && Objects.equals(this.architecture, that.architecture)
            && Objects.equals(this.activeFunction, that.activeFunction)
            && Objects.equals(this.valueKeepProbability, that.valueKeepProbability)
            && Objects.equals(this.embedSize, that.embedSize)
            && Objects.equals(this.mlpArchitecture, that.mlpArchitecture)
            && Objects.equals(this.maxOrder, that.maxOrder) && Objects.equals(this.hashSizes, that.hashSizes)
            && Objects.equals(this.hashCompensation, that.hashCompensation)
            && Objects.equals(this.useWidePart, that.useWidePart)
            && Objects.equals(this.structureOptimizer, that.structureOptimizer)
            && Objects.equals(this.mergeMultiHot, that.mergeMultiHot)
            && Objects.equals(this.fixStructure, that.fixStructure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latentVectorLength,
            architecture,
            activeFunction,
            valueKeepProbability,
            embedSize,
            mlpArchitecture,
            maxOrder,
            hashSizes,
            hashCompensation,
            useWidePart,
            structureOptimizer,
            mergeMultiHot,
            fixStructure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmSpecifyParameters {\n");
        sb.append("    latentVectorLength: ").append(toIndentedString(latentVectorLength)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    activeFunction: ").append(toIndentedString(activeFunction)).append("\n");
        sb.append("    valueKeepProbability: ").append(toIndentedString(valueKeepProbability)).append("\n");
        sb.append("    embedSize: ").append(toIndentedString(embedSize)).append("\n");
        sb.append("    mlpArchitecture: ").append(toIndentedString(mlpArchitecture)).append("\n");
        sb.append("    maxOrder: ").append(toIndentedString(maxOrder)).append("\n");
        sb.append("    hashSizes: ").append(toIndentedString(hashSizes)).append("\n");
        sb.append("    hashCompensation: ").append(toIndentedString(hashCompensation)).append("\n");
        sb.append("    useWidePart: ").append(toIndentedString(useWidePart)).append("\n");
        sb.append("    structureOptimizer: ").append(toIndentedString(structureOptimizer)).append("\n");
        sb.append("    mergeMultiHot: ").append(toIndentedString(mergeMultiHot)).append("\n");
        sb.append("    fixStructure: ").append(toIndentedString(fixStructure)).append("\n");
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
