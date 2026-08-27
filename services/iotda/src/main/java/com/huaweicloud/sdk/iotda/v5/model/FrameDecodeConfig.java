package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 泛协议码流的拆包组包配置
 */
public class FrameDecodeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_decode_type")

    private String frameDecodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_frame_length")

    private Integer maxFrameLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delimiter")

    private String delimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_frame_length")

    private Integer fixedFrameLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_offset")

    private Integer fieldOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_length")

    private Integer fieldLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_bytes")

    private String initialBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjustment_length")

    private Integer adjustmentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_bytes_to_strip")

    private Integer initialBytesToStrip;

    public FrameDecodeConfig withFrameDecodeType(String frameDecodeType) {
        this.frameDecodeType = frameDecodeType;
        return this;
    }

    /**
     * **参数说明**：拆包组包规则。 **取值范围**： - DELIMITER：通过特定分隔符（如逗号、换行符等）来拆分或组合数据包。 - FIXED_LENGTH：按照固定的字节长度，对每一帧数据进行拆分或组合。 - FIELD_LENGTH：每一帧的长度可变，通过数据包中携带的长度字段信息进行拆分或组合。
     * @return frameDecodeType
     */
    public String getFrameDecodeType() {
        return frameDecodeType;
    }

    public void setFrameDecodeType(String frameDecodeType) {
        this.frameDecodeType = frameDecodeType;
    }

    public FrameDecodeConfig withMaxFrameLength(Integer maxFrameLength) {
        this.maxFrameLength = maxFrameLength;
        return this;
    }

    /**
     * **参数说明**：单个帧的最大长度。拆包规则为DELIMITER|FIELD_LENGTH时，该参数必选。
     * minimum: 0
     * maximum: 65535
     * @return maxFrameLength
     */
    public Integer getMaxFrameLength() {
        return maxFrameLength;
    }

    public void setMaxFrameLength(Integer maxFrameLength) {
        this.maxFrameLength = maxFrameLength;
    }

    public FrameDecodeConfig withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * **参数说明**：分隔符，hex string格式。拆包规则为DELIMITER，该参数必选。
     * @return delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public FrameDecodeConfig withFixedFrameLength(Integer fixedFrameLength) {
        this.fixedFrameLength = fixedFrameLength;
        return this;
    }

    /**
     * **参数说明**：单个帧的固定长度。拆包规则为FIXED_LENGTH，该参数必选。
     * minimum: 0
     * maximum: 65535
     * @return fixedFrameLength
     */
    public Integer getFixedFrameLength() {
        return fixedFrameLength;
    }

    public void setFixedFrameLength(Integer fixedFrameLength) {
        this.fixedFrameLength = fixedFrameLength;
    }

    public FrameDecodeConfig withFieldOffset(Integer fieldOffset) {
        this.fieldOffset = fieldOffset;
        return this;
    }

    /**
     * **参数说明**：指定长度字段在数据包中的起始位置（偏移量）。拆包规则为FIELD_LENGTH ，该参数必选。
     * minimum: 0
     * maximum: 65535
     * @return fieldOffset
     */
    public Integer getFieldOffset() {
        return fieldOffset;
    }

    public void setFieldOffset(Integer fieldOffset) {
        this.fieldOffset = fieldOffset;
    }

    public FrameDecodeConfig withFieldLength(Integer fieldLength) {
        this.fieldLength = fieldLength;
        return this;
    }

    /**
     * **参数说明**：指定长度字段占用的字节数。拆包规则为FIELD_LENGTH，该参数必选。
     * minimum: 1
     * maximum: 8
     * @return fieldLength
     */
    public Integer getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(Integer fieldLength) {
        this.fieldLength = fieldLength;
    }

    public FrameDecodeConfig withInitialBytes(String initialBytes) {
        this.initialBytes = initialBytes;
        return this;
    }

    /**
     * **参数说明**：起始字符，hex string格式。拆包规则为FIXED_LENGTH，该参数可选。
     * @return initialBytes
     */
    public String getInitialBytes() {
        return initialBytes;
    }

    public void setInitialBytes(String initialBytes) {
        this.initialBytes = initialBytes;
    }

    public FrameDecodeConfig withAdjustmentLength(Integer adjustmentLength) {
        this.adjustmentLength = adjustmentLength;
        return this;
    }

    /**
     * **参数说明**：调整长度字段的值。拆包规则为FIELD_LENGTH，该参数可选。
     * minimum: -1024
     * maximum: 1024
     * @return adjustmentLength
     */
    public Integer getAdjustmentLength() {
        return adjustmentLength;
    }

    public void setAdjustmentLength(Integer adjustmentLength) {
        this.adjustmentLength = adjustmentLength;
    }

    public FrameDecodeConfig withInitialBytesToStrip(Integer initialBytesToStrip) {
        this.initialBytesToStrip = initialBytesToStrip;
        return this;
    }

    /**
     * **参数说明**：指定解码后从数据包中去掉的字节数。通常用于去掉长度字段，只保留数据内容。拆包规则为FIELD_LENGTH，该参数可选。
     * minimum: 0
     * maximum: 65535
     * @return initialBytesToStrip
     */
    public Integer getInitialBytesToStrip() {
        return initialBytesToStrip;
    }

    public void setInitialBytesToStrip(Integer initialBytesToStrip) {
        this.initialBytesToStrip = initialBytesToStrip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FrameDecodeConfig that = (FrameDecodeConfig) obj;
        return Objects.equals(this.frameDecodeType, that.frameDecodeType)
            && Objects.equals(this.maxFrameLength, that.maxFrameLength)
            && Objects.equals(this.delimiter, that.delimiter)
            && Objects.equals(this.fixedFrameLength, that.fixedFrameLength)
            && Objects.equals(this.fieldOffset, that.fieldOffset) && Objects.equals(this.fieldLength, that.fieldLength)
            && Objects.equals(this.initialBytes, that.initialBytes)
            && Objects.equals(this.adjustmentLength, that.adjustmentLength)
            && Objects.equals(this.initialBytesToStrip, that.initialBytesToStrip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frameDecodeType,
            maxFrameLength,
            delimiter,
            fixedFrameLength,
            fieldOffset,
            fieldLength,
            initialBytes,
            adjustmentLength,
            initialBytesToStrip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrameDecodeConfig {\n");
        sb.append("    frameDecodeType: ").append(toIndentedString(frameDecodeType)).append("\n");
        sb.append("    maxFrameLength: ").append(toIndentedString(maxFrameLength)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    fixedFrameLength: ").append(toIndentedString(fixedFrameLength)).append("\n");
        sb.append("    fieldOffset: ").append(toIndentedString(fieldOffset)).append("\n");
        sb.append("    fieldLength: ").append(toIndentedString(fieldLength)).append("\n");
        sb.append("    initialBytes: ").append(toIndentedString(initialBytes)).append("\n");
        sb.append("    adjustmentLength: ").append(toIndentedString(adjustmentLength)).append("\n");
        sb.append("    initialBytesToStrip: ").append(toIndentedString(initialBytesToStrip)).append("\n");
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
