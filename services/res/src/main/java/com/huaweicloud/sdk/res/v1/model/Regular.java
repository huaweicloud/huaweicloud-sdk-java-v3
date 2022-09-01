package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 正则化参数
 */
public class Regular {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2_regularization")

    @JacksonXmlProperty(localName = "l2_regularization")

    private Double l2Regularization;

    /**
     * 正则损失计算方式。
     */
    public static final class RegularLossComputeModeEnum {

        /**
         * Enum FULL for value: "full"
         */
        public static final RegularLossComputeModeEnum FULL = new RegularLossComputeModeEnum("full");

        /**
         * Enum BATCH for value: "batch"
         */
        public static final RegularLossComputeModeEnum BATCH = new RegularLossComputeModeEnum("batch");

        private static final Map<String, RegularLossComputeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RegularLossComputeModeEnum> createStaticFields() {
            Map<String, RegularLossComputeModeEnum> map = new HashMap<>();
            map.put("full", FULL);
            map.put("batch", BATCH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RegularLossComputeModeEnum(String value) {
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
        public static RegularLossComputeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RegularLossComputeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RegularLossComputeModeEnum(value);
            }
            return result;
        }

        public static RegularLossComputeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RegularLossComputeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RegularLossComputeModeEnum) {
                return this.value.equals(((RegularLossComputeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regular_loss_compute_mode")

    @JacksonXmlProperty(localName = "regular_loss_compute_mode")

    private RegularLossComputeModeEnum regularLossComputeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "embed_l2_regularization")

    @JacksonXmlProperty(localName = "embed_l2_regularization")

    private Double embedL2Regularization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wide_l2_regularization")

    @JacksonXmlProperty(localName = "wide_l2_regularization")

    private Double wideL2Regularization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "structure_l2_regularization")

    @JacksonXmlProperty(localName = "structure_l2_regularization")

    private Double structureL2Regularization;

    public Regular withL2Regularization(Double l2Regularization) {
        this.l2Regularization = l2Regularization;
        return this;
    }

    /**
     * L2正则项系数。
     * minimum: 0
     * maximum: 1
     * @return l2Regularization
     */
    public Double getL2Regularization() {
        return l2Regularization;
    }

    public void setL2Regularization(Double l2Regularization) {
        this.l2Regularization = l2Regularization;
    }

    public Regular withRegularLossComputeMode(RegularLossComputeModeEnum regularLossComputeMode) {
        this.regularLossComputeMode = regularLossComputeMode;
        return this;
    }

    /**
     * 正则损失计算方式。
     * @return regularLossComputeMode
     */
    public RegularLossComputeModeEnum getRegularLossComputeMode() {
        return regularLossComputeMode;
    }

    public void setRegularLossComputeMode(RegularLossComputeModeEnum regularLossComputeMode) {
        this.regularLossComputeMode = regularLossComputeMode;
    }

    public Regular withEmbedL2Regularization(Double embedL2Regularization) {
        this.embedL2Regularization = embedL2Regularization;
        return this;
    }

    /**
     * 隐向量层L2正则化系数。
     * minimum: 0
     * maximum: 1
     * @return embedL2Regularization
     */
    public Double getEmbedL2Regularization() {
        return embedL2Regularization;
    }

    public void setEmbedL2Regularization(Double embedL2Regularization) {
        this.embedL2Regularization = embedL2Regularization;
    }

    public Regular withWideL2Regularization(Double wideL2Regularization) {
        this.wideL2Regularization = wideL2Regularization;
        return this;
    }

    /**
     * wide部分L2正则化系数。
     * minimum: 0
     * maximum: 1
     * @return wideL2Regularization
     */
    public Double getWideL2Regularization() {
        return wideL2Regularization;
    }

    public void setWideL2Regularization(Double wideL2Regularization) {
        this.wideL2Regularization = wideL2Regularization;
    }

    public Regular withStructureL2Regularization(Double structureL2Regularization) {
        this.structureL2Regularization = structureL2Regularization;
        return this;
    }

    /**
     * 结构化部分L2正则化系数。
     * minimum: 0
     * maximum: 1
     * @return structureL2Regularization
     */
    public Double getStructureL2Regularization() {
        return structureL2Regularization;
    }

    public void setStructureL2Regularization(Double structureL2Regularization) {
        this.structureL2Regularization = structureL2Regularization;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Regular regular = (Regular) o;
        return Objects.equals(this.l2Regularization, regular.l2Regularization)
            && Objects.equals(this.regularLossComputeMode, regular.regularLossComputeMode)
            && Objects.equals(this.embedL2Regularization, regular.embedL2Regularization)
            && Objects.equals(this.wideL2Regularization, regular.wideL2Regularization)
            && Objects.equals(this.structureL2Regularization, regular.structureL2Regularization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l2Regularization,
            regularLossComputeMode,
            embedL2Regularization,
            wideL2Regularization,
            structureL2Regularization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Regular {\n");
        sb.append("    l2Regularization: ").append(toIndentedString(l2Regularization)).append("\n");
        sb.append("    regularLossComputeMode: ").append(toIndentedString(regularLossComputeMode)).append("\n");
        sb.append("    embedL2Regularization: ").append(toIndentedString(embedL2Regularization)).append("\n");
        sb.append("    wideL2Regularization: ").append(toIndentedString(wideL2Regularization)).append("\n");
        sb.append("    structureL2Regularization: ").append(toIndentedString(structureL2Regularization)).append("\n");
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
