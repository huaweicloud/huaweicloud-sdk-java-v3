package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 孪生属性配置，与access_protocol关联。
 */
public class ValueInPropertyVisitors {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_type")

    private ValueInAttributes registerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    private ValueInAttributes accessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_index")

    private ValueInAttributes registerIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_num")

    private ValueInAttributes registerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_index")

    private ValueInAttributes scaleIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_datatype")

    private ValueInAttributes originalDatatype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_datatype")

    private ValueInAttributes expectedDatatype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_registerswap")

    private ValueInAttributes isRegisterswap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_swap")

    private ValueInAttributes isSwap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_interval")

    private ValueInAttributes sampleInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_min")

    private ValueInAttributes dataMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_max")

    private ValueInAttributes dataMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private ValueInAttributes nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "browse_name")

    private ValueInAttributes browseName;

    public ValueInPropertyVisitors withRegisterType(ValueInAttributes registerType) {
        this.registerType = registerType;
        return this;
    }

    public ValueInPropertyVisitors withRegisterType(Consumer<ValueInAttributes> registerTypeSetter) {
        if (this.registerType == null) {
            this.registerType = new ValueInAttributes();
            registerTypeSetter.accept(this.registerType);
        }

        return this;
    }

    /**
     * Get registerType
     * @return registerType
     */
    public ValueInAttributes getRegisterType() {
        return registerType;
    }

    public void setRegisterType(ValueInAttributes registerType) {
        this.registerType = registerType;
    }

    public ValueInPropertyVisitors withAccessMode(ValueInAttributes accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    public ValueInPropertyVisitors withAccessMode(Consumer<ValueInAttributes> accessModeSetter) {
        if (this.accessMode == null) {
            this.accessMode = new ValueInAttributes();
            accessModeSetter.accept(this.accessMode);
        }

        return this;
    }

    /**
     * Get accessMode
     * @return accessMode
     */
    public ValueInAttributes getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(ValueInAttributes accessMode) {
        this.accessMode = accessMode;
    }

    public ValueInPropertyVisitors withRegisterIndex(ValueInAttributes registerIndex) {
        this.registerIndex = registerIndex;
        return this;
    }

    public ValueInPropertyVisitors withRegisterIndex(Consumer<ValueInAttributes> registerIndexSetter) {
        if (this.registerIndex == null) {
            this.registerIndex = new ValueInAttributes();
            registerIndexSetter.accept(this.registerIndex);
        }

        return this;
    }

    /**
     * Get registerIndex
     * @return registerIndex
     */
    public ValueInAttributes getRegisterIndex() {
        return registerIndex;
    }

    public void setRegisterIndex(ValueInAttributes registerIndex) {
        this.registerIndex = registerIndex;
    }

    public ValueInPropertyVisitors withRegisterNum(ValueInAttributes registerNum) {
        this.registerNum = registerNum;
        return this;
    }

    public ValueInPropertyVisitors withRegisterNum(Consumer<ValueInAttributes> registerNumSetter) {
        if (this.registerNum == null) {
            this.registerNum = new ValueInAttributes();
            registerNumSetter.accept(this.registerNum);
        }

        return this;
    }

    /**
     * Get registerNum
     * @return registerNum
     */
    public ValueInAttributes getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(ValueInAttributes registerNum) {
        this.registerNum = registerNum;
    }

    public ValueInPropertyVisitors withScaleIndex(ValueInAttributes scaleIndex) {
        this.scaleIndex = scaleIndex;
        return this;
    }

    public ValueInPropertyVisitors withScaleIndex(Consumer<ValueInAttributes> scaleIndexSetter) {
        if (this.scaleIndex == null) {
            this.scaleIndex = new ValueInAttributes();
            scaleIndexSetter.accept(this.scaleIndex);
        }

        return this;
    }

    /**
     * Get scaleIndex
     * @return scaleIndex
     */
    public ValueInAttributes getScaleIndex() {
        return scaleIndex;
    }

    public void setScaleIndex(ValueInAttributes scaleIndex) {
        this.scaleIndex = scaleIndex;
    }

    public ValueInPropertyVisitors withOriginalDatatype(ValueInAttributes originalDatatype) {
        this.originalDatatype = originalDatatype;
        return this;
    }

    public ValueInPropertyVisitors withOriginalDatatype(Consumer<ValueInAttributes> originalDatatypeSetter) {
        if (this.originalDatatype == null) {
            this.originalDatatype = new ValueInAttributes();
            originalDatatypeSetter.accept(this.originalDatatype);
        }

        return this;
    }

    /**
     * Get originalDatatype
     * @return originalDatatype
     */
    public ValueInAttributes getOriginalDatatype() {
        return originalDatatype;
    }

    public void setOriginalDatatype(ValueInAttributes originalDatatype) {
        this.originalDatatype = originalDatatype;
    }

    public ValueInPropertyVisitors withExpectedDatatype(ValueInAttributes expectedDatatype) {
        this.expectedDatatype = expectedDatatype;
        return this;
    }

    public ValueInPropertyVisitors withExpectedDatatype(Consumer<ValueInAttributes> expectedDatatypeSetter) {
        if (this.expectedDatatype == null) {
            this.expectedDatatype = new ValueInAttributes();
            expectedDatatypeSetter.accept(this.expectedDatatype);
        }

        return this;
    }

    /**
     * Get expectedDatatype
     * @return expectedDatatype
     */
    public ValueInAttributes getExpectedDatatype() {
        return expectedDatatype;
    }

    public void setExpectedDatatype(ValueInAttributes expectedDatatype) {
        this.expectedDatatype = expectedDatatype;
    }

    public ValueInPropertyVisitors withIsRegisterswap(ValueInAttributes isRegisterswap) {
        this.isRegisterswap = isRegisterswap;
        return this;
    }

    public ValueInPropertyVisitors withIsRegisterswap(Consumer<ValueInAttributes> isRegisterswapSetter) {
        if (this.isRegisterswap == null) {
            this.isRegisterswap = new ValueInAttributes();
            isRegisterswapSetter.accept(this.isRegisterswap);
        }

        return this;
    }

    /**
     * Get isRegisterswap
     * @return isRegisterswap
     */
    public ValueInAttributes getIsRegisterswap() {
        return isRegisterswap;
    }

    public void setIsRegisterswap(ValueInAttributes isRegisterswap) {
        this.isRegisterswap = isRegisterswap;
    }

    public ValueInPropertyVisitors withIsSwap(ValueInAttributes isSwap) {
        this.isSwap = isSwap;
        return this;
    }

    public ValueInPropertyVisitors withIsSwap(Consumer<ValueInAttributes> isSwapSetter) {
        if (this.isSwap == null) {
            this.isSwap = new ValueInAttributes();
            isSwapSetter.accept(this.isSwap);
        }

        return this;
    }

    /**
     * Get isSwap
     * @return isSwap
     */
    public ValueInAttributes getIsSwap() {
        return isSwap;
    }

    public void setIsSwap(ValueInAttributes isSwap) {
        this.isSwap = isSwap;
    }

    public ValueInPropertyVisitors withSampleInterval(ValueInAttributes sampleInterval) {
        this.sampleInterval = sampleInterval;
        return this;
    }

    public ValueInPropertyVisitors withSampleInterval(Consumer<ValueInAttributes> sampleIntervalSetter) {
        if (this.sampleInterval == null) {
            this.sampleInterval = new ValueInAttributes();
            sampleIntervalSetter.accept(this.sampleInterval);
        }

        return this;
    }

    /**
     * Get sampleInterval
     * @return sampleInterval
     */
    public ValueInAttributes getSampleInterval() {
        return sampleInterval;
    }

    public void setSampleInterval(ValueInAttributes sampleInterval) {
        this.sampleInterval = sampleInterval;
    }

    public ValueInPropertyVisitors withDataMin(ValueInAttributes dataMin) {
        this.dataMin = dataMin;
        return this;
    }

    public ValueInPropertyVisitors withDataMin(Consumer<ValueInAttributes> dataMinSetter) {
        if (this.dataMin == null) {
            this.dataMin = new ValueInAttributes();
            dataMinSetter.accept(this.dataMin);
        }

        return this;
    }

    /**
     * Get dataMin
     * @return dataMin
     */
    public ValueInAttributes getDataMin() {
        return dataMin;
    }

    public void setDataMin(ValueInAttributes dataMin) {
        this.dataMin = dataMin;
    }

    public ValueInPropertyVisitors withDataMax(ValueInAttributes dataMax) {
        this.dataMax = dataMax;
        return this;
    }

    public ValueInPropertyVisitors withDataMax(Consumer<ValueInAttributes> dataMaxSetter) {
        if (this.dataMax == null) {
            this.dataMax = new ValueInAttributes();
            dataMaxSetter.accept(this.dataMax);
        }

        return this;
    }

    /**
     * Get dataMax
     * @return dataMax
     */
    public ValueInAttributes getDataMax() {
        return dataMax;
    }

    public void setDataMax(ValueInAttributes dataMax) {
        this.dataMax = dataMax;
    }

    public ValueInPropertyVisitors withNodeId(ValueInAttributes nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public ValueInPropertyVisitors withNodeId(Consumer<ValueInAttributes> nodeIdSetter) {
        if (this.nodeId == null) {
            this.nodeId = new ValueInAttributes();
            nodeIdSetter.accept(this.nodeId);
        }

        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    public ValueInAttributes getNodeId() {
        return nodeId;
    }

    public void setNodeId(ValueInAttributes nodeId) {
        this.nodeId = nodeId;
    }

    public ValueInPropertyVisitors withBrowseName(ValueInAttributes browseName) {
        this.browseName = browseName;
        return this;
    }

    public ValueInPropertyVisitors withBrowseName(Consumer<ValueInAttributes> browseNameSetter) {
        if (this.browseName == null) {
            this.browseName = new ValueInAttributes();
            browseNameSetter.accept(this.browseName);
        }

        return this;
    }

    /**
     * Get browseName
     * @return browseName
     */
    public ValueInAttributes getBrowseName() {
        return browseName;
    }

    public void setBrowseName(ValueInAttributes browseName) {
        this.browseName = browseName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValueInPropertyVisitors that = (ValueInPropertyVisitors) obj;
        return Objects.equals(this.registerType, that.registerType) && Objects.equals(this.accessMode, that.accessMode)
            && Objects.equals(this.registerIndex, that.registerIndex)
            && Objects.equals(this.registerNum, that.registerNum) && Objects.equals(this.scaleIndex, that.scaleIndex)
            && Objects.equals(this.originalDatatype, that.originalDatatype)
            && Objects.equals(this.expectedDatatype, that.expectedDatatype)
            && Objects.equals(this.isRegisterswap, that.isRegisterswap) && Objects.equals(this.isSwap, that.isSwap)
            && Objects.equals(this.sampleInterval, that.sampleInterval) && Objects.equals(this.dataMin, that.dataMin)
            && Objects.equals(this.dataMax, that.dataMax) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.browseName, that.browseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registerType,
            accessMode,
            registerIndex,
            registerNum,
            scaleIndex,
            originalDatatype,
            expectedDatatype,
            isRegisterswap,
            isSwap,
            sampleInterval,
            dataMin,
            dataMax,
            nodeId,
            browseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueInPropertyVisitors {\n");
        sb.append("    registerType: ").append(toIndentedString(registerType)).append("\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    registerIndex: ").append(toIndentedString(registerIndex)).append("\n");
        sb.append("    registerNum: ").append(toIndentedString(registerNum)).append("\n");
        sb.append("    scaleIndex: ").append(toIndentedString(scaleIndex)).append("\n");
        sb.append("    originalDatatype: ").append(toIndentedString(originalDatatype)).append("\n");
        sb.append("    expectedDatatype: ").append(toIndentedString(expectedDatatype)).append("\n");
        sb.append("    isRegisterswap: ").append(toIndentedString(isRegisterswap)).append("\n");
        sb.append("    isSwap: ").append(toIndentedString(isSwap)).append("\n");
        sb.append("    sampleInterval: ").append(toIndentedString(sampleInterval)).append("\n");
        sb.append("    dataMin: ").append(toIndentedString(dataMin)).append("\n");
        sb.append("    dataMax: ").append(toIndentedString(dataMax)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    browseName: ").append(toIndentedString(browseName)).append("\n");
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
