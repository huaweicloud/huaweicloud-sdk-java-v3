package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 孪生属性配置，与access_protocol关联。
 */
public class TwinUpdateDetailPropertyVisitors {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_type")

    private ValueInPropertyVisitorsRegisterType registerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    private ValueInPropertyVisitorsAccessMode accessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_index")

    private ValueInPropertyVisitorsRegisterIndex registerIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_num")

    private ValueInPropertyVisitorsRegisterNum registerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_index")

    private ValueInPropertyVisitorsScaleIndex scaleIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_datatype")

    private ValueInPropertyVisitorsOriginalDatatype originalDatatype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_datatype")

    private ValueInPropertyVisitorsExpectedDatatype expectedDatatype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_registerswap")

    private ValueInPropertyVisitorsIsRegisterswap isRegisterswap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_swap")

    private ValueInPropertyVisitorsIsSwap isSwap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_interval")

    private ValueInPropertyVisitorsSampleInterval sampleInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_min")

    private ValueInPropertyVisitorsDataMin dataMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_max")

    private ValueInPropertyVisitorsDataMax dataMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private ValueInPropertyVisitorsNodeId nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "browse_name")

    private ValueInPropertyVisitorsBrowseName browseName;

    public TwinUpdateDetailPropertyVisitors withRegisterType(ValueInPropertyVisitorsRegisterType registerType) {
        this.registerType = registerType;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withRegisterType(
        Consumer<ValueInPropertyVisitorsRegisterType> registerTypeSetter) {
        if (this.registerType == null) {
            this.registerType = new ValueInPropertyVisitorsRegisterType();
            registerTypeSetter.accept(this.registerType);
        }

        return this;
    }

    /**
     * Get registerType
     * @return registerType
     */
    public ValueInPropertyVisitorsRegisterType getRegisterType() {
        return registerType;
    }

    public void setRegisterType(ValueInPropertyVisitorsRegisterType registerType) {
        this.registerType = registerType;
    }

    public TwinUpdateDetailPropertyVisitors withAccessMode(ValueInPropertyVisitorsAccessMode accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withAccessMode(
        Consumer<ValueInPropertyVisitorsAccessMode> accessModeSetter) {
        if (this.accessMode == null) {
            this.accessMode = new ValueInPropertyVisitorsAccessMode();
            accessModeSetter.accept(this.accessMode);
        }

        return this;
    }

    /**
     * Get accessMode
     * @return accessMode
     */
    public ValueInPropertyVisitorsAccessMode getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(ValueInPropertyVisitorsAccessMode accessMode) {
        this.accessMode = accessMode;
    }

    public TwinUpdateDetailPropertyVisitors withRegisterIndex(ValueInPropertyVisitorsRegisterIndex registerIndex) {
        this.registerIndex = registerIndex;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withRegisterIndex(
        Consumer<ValueInPropertyVisitorsRegisterIndex> registerIndexSetter) {
        if (this.registerIndex == null) {
            this.registerIndex = new ValueInPropertyVisitorsRegisterIndex();
            registerIndexSetter.accept(this.registerIndex);
        }

        return this;
    }

    /**
     * Get registerIndex
     * @return registerIndex
     */
    public ValueInPropertyVisitorsRegisterIndex getRegisterIndex() {
        return registerIndex;
    }

    public void setRegisterIndex(ValueInPropertyVisitorsRegisterIndex registerIndex) {
        this.registerIndex = registerIndex;
    }

    public TwinUpdateDetailPropertyVisitors withRegisterNum(ValueInPropertyVisitorsRegisterNum registerNum) {
        this.registerNum = registerNum;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withRegisterNum(
        Consumer<ValueInPropertyVisitorsRegisterNum> registerNumSetter) {
        if (this.registerNum == null) {
            this.registerNum = new ValueInPropertyVisitorsRegisterNum();
            registerNumSetter.accept(this.registerNum);
        }

        return this;
    }

    /**
     * Get registerNum
     * @return registerNum
     */
    public ValueInPropertyVisitorsRegisterNum getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(ValueInPropertyVisitorsRegisterNum registerNum) {
        this.registerNum = registerNum;
    }

    public TwinUpdateDetailPropertyVisitors withScaleIndex(ValueInPropertyVisitorsScaleIndex scaleIndex) {
        this.scaleIndex = scaleIndex;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withScaleIndex(
        Consumer<ValueInPropertyVisitorsScaleIndex> scaleIndexSetter) {
        if (this.scaleIndex == null) {
            this.scaleIndex = new ValueInPropertyVisitorsScaleIndex();
            scaleIndexSetter.accept(this.scaleIndex);
        }

        return this;
    }

    /**
     * Get scaleIndex
     * @return scaleIndex
     */
    public ValueInPropertyVisitorsScaleIndex getScaleIndex() {
        return scaleIndex;
    }

    public void setScaleIndex(ValueInPropertyVisitorsScaleIndex scaleIndex) {
        this.scaleIndex = scaleIndex;
    }

    public TwinUpdateDetailPropertyVisitors withOriginalDatatype(
        ValueInPropertyVisitorsOriginalDatatype originalDatatype) {
        this.originalDatatype = originalDatatype;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withOriginalDatatype(
        Consumer<ValueInPropertyVisitorsOriginalDatatype> originalDatatypeSetter) {
        if (this.originalDatatype == null) {
            this.originalDatatype = new ValueInPropertyVisitorsOriginalDatatype();
            originalDatatypeSetter.accept(this.originalDatatype);
        }

        return this;
    }

    /**
     * Get originalDatatype
     * @return originalDatatype
     */
    public ValueInPropertyVisitorsOriginalDatatype getOriginalDatatype() {
        return originalDatatype;
    }

    public void setOriginalDatatype(ValueInPropertyVisitorsOriginalDatatype originalDatatype) {
        this.originalDatatype = originalDatatype;
    }

    public TwinUpdateDetailPropertyVisitors withExpectedDatatype(
        ValueInPropertyVisitorsExpectedDatatype expectedDatatype) {
        this.expectedDatatype = expectedDatatype;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withExpectedDatatype(
        Consumer<ValueInPropertyVisitorsExpectedDatatype> expectedDatatypeSetter) {
        if (this.expectedDatatype == null) {
            this.expectedDatatype = new ValueInPropertyVisitorsExpectedDatatype();
            expectedDatatypeSetter.accept(this.expectedDatatype);
        }

        return this;
    }

    /**
     * Get expectedDatatype
     * @return expectedDatatype
     */
    public ValueInPropertyVisitorsExpectedDatatype getExpectedDatatype() {
        return expectedDatatype;
    }

    public void setExpectedDatatype(ValueInPropertyVisitorsExpectedDatatype expectedDatatype) {
        this.expectedDatatype = expectedDatatype;
    }

    public TwinUpdateDetailPropertyVisitors withIsRegisterswap(ValueInPropertyVisitorsIsRegisterswap isRegisterswap) {
        this.isRegisterswap = isRegisterswap;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withIsRegisterswap(
        Consumer<ValueInPropertyVisitorsIsRegisterswap> isRegisterswapSetter) {
        if (this.isRegisterswap == null) {
            this.isRegisterswap = new ValueInPropertyVisitorsIsRegisterswap();
            isRegisterswapSetter.accept(this.isRegisterswap);
        }

        return this;
    }

    /**
     * Get isRegisterswap
     * @return isRegisterswap
     */
    public ValueInPropertyVisitorsIsRegisterswap getIsRegisterswap() {
        return isRegisterswap;
    }

    public void setIsRegisterswap(ValueInPropertyVisitorsIsRegisterswap isRegisterswap) {
        this.isRegisterswap = isRegisterswap;
    }

    public TwinUpdateDetailPropertyVisitors withIsSwap(ValueInPropertyVisitorsIsSwap isSwap) {
        this.isSwap = isSwap;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withIsSwap(Consumer<ValueInPropertyVisitorsIsSwap> isSwapSetter) {
        if (this.isSwap == null) {
            this.isSwap = new ValueInPropertyVisitorsIsSwap();
            isSwapSetter.accept(this.isSwap);
        }

        return this;
    }

    /**
     * Get isSwap
     * @return isSwap
     */
    public ValueInPropertyVisitorsIsSwap getIsSwap() {
        return isSwap;
    }

    public void setIsSwap(ValueInPropertyVisitorsIsSwap isSwap) {
        this.isSwap = isSwap;
    }

    public TwinUpdateDetailPropertyVisitors withSampleInterval(ValueInPropertyVisitorsSampleInterval sampleInterval) {
        this.sampleInterval = sampleInterval;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withSampleInterval(
        Consumer<ValueInPropertyVisitorsSampleInterval> sampleIntervalSetter) {
        if (this.sampleInterval == null) {
            this.sampleInterval = new ValueInPropertyVisitorsSampleInterval();
            sampleIntervalSetter.accept(this.sampleInterval);
        }

        return this;
    }

    /**
     * Get sampleInterval
     * @return sampleInterval
     */
    public ValueInPropertyVisitorsSampleInterval getSampleInterval() {
        return sampleInterval;
    }

    public void setSampleInterval(ValueInPropertyVisitorsSampleInterval sampleInterval) {
        this.sampleInterval = sampleInterval;
    }

    public TwinUpdateDetailPropertyVisitors withDataMin(ValueInPropertyVisitorsDataMin dataMin) {
        this.dataMin = dataMin;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withDataMin(Consumer<ValueInPropertyVisitorsDataMin> dataMinSetter) {
        if (this.dataMin == null) {
            this.dataMin = new ValueInPropertyVisitorsDataMin();
            dataMinSetter.accept(this.dataMin);
        }

        return this;
    }

    /**
     * Get dataMin
     * @return dataMin
     */
    public ValueInPropertyVisitorsDataMin getDataMin() {
        return dataMin;
    }

    public void setDataMin(ValueInPropertyVisitorsDataMin dataMin) {
        this.dataMin = dataMin;
    }

    public TwinUpdateDetailPropertyVisitors withDataMax(ValueInPropertyVisitorsDataMax dataMax) {
        this.dataMax = dataMax;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withDataMax(Consumer<ValueInPropertyVisitorsDataMax> dataMaxSetter) {
        if (this.dataMax == null) {
            this.dataMax = new ValueInPropertyVisitorsDataMax();
            dataMaxSetter.accept(this.dataMax);
        }

        return this;
    }

    /**
     * Get dataMax
     * @return dataMax
     */
    public ValueInPropertyVisitorsDataMax getDataMax() {
        return dataMax;
    }

    public void setDataMax(ValueInPropertyVisitorsDataMax dataMax) {
        this.dataMax = dataMax;
    }

    public TwinUpdateDetailPropertyVisitors withNodeId(ValueInPropertyVisitorsNodeId nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withNodeId(Consumer<ValueInPropertyVisitorsNodeId> nodeIdSetter) {
        if (this.nodeId == null) {
            this.nodeId = new ValueInPropertyVisitorsNodeId();
            nodeIdSetter.accept(this.nodeId);
        }

        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    public ValueInPropertyVisitorsNodeId getNodeId() {
        return nodeId;
    }

    public void setNodeId(ValueInPropertyVisitorsNodeId nodeId) {
        this.nodeId = nodeId;
    }

    public TwinUpdateDetailPropertyVisitors withBrowseName(ValueInPropertyVisitorsBrowseName browseName) {
        this.browseName = browseName;
        return this;
    }

    public TwinUpdateDetailPropertyVisitors withBrowseName(
        Consumer<ValueInPropertyVisitorsBrowseName> browseNameSetter) {
        if (this.browseName == null) {
            this.browseName = new ValueInPropertyVisitorsBrowseName();
            browseNameSetter.accept(this.browseName);
        }

        return this;
    }

    /**
     * Get browseName
     * @return browseName
     */
    public ValueInPropertyVisitorsBrowseName getBrowseName() {
        return browseName;
    }

    public void setBrowseName(ValueInPropertyVisitorsBrowseName browseName) {
        this.browseName = browseName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TwinUpdateDetailPropertyVisitors twinUpdateDetailPropertyVisitors = (TwinUpdateDetailPropertyVisitors) o;
        return Objects.equals(this.registerType, twinUpdateDetailPropertyVisitors.registerType)
            && Objects.equals(this.accessMode, twinUpdateDetailPropertyVisitors.accessMode)
            && Objects.equals(this.registerIndex, twinUpdateDetailPropertyVisitors.registerIndex)
            && Objects.equals(this.registerNum, twinUpdateDetailPropertyVisitors.registerNum)
            && Objects.equals(this.scaleIndex, twinUpdateDetailPropertyVisitors.scaleIndex)
            && Objects.equals(this.originalDatatype, twinUpdateDetailPropertyVisitors.originalDatatype)
            && Objects.equals(this.expectedDatatype, twinUpdateDetailPropertyVisitors.expectedDatatype)
            && Objects.equals(this.isRegisterswap, twinUpdateDetailPropertyVisitors.isRegisterswap)
            && Objects.equals(this.isSwap, twinUpdateDetailPropertyVisitors.isSwap)
            && Objects.equals(this.sampleInterval, twinUpdateDetailPropertyVisitors.sampleInterval)
            && Objects.equals(this.dataMin, twinUpdateDetailPropertyVisitors.dataMin)
            && Objects.equals(this.dataMax, twinUpdateDetailPropertyVisitors.dataMax)
            && Objects.equals(this.nodeId, twinUpdateDetailPropertyVisitors.nodeId)
            && Objects.equals(this.browseName, twinUpdateDetailPropertyVisitors.browseName);
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
        sb.append("class TwinUpdateDetailPropertyVisitors {\n");
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
