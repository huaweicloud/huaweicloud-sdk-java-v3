package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DynamicMaskingPolicyUpdate
 */
public class DynamicMaskingPolicyUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private String columnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private String algorithmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_detail")

    private String algorithmDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_detail_dto")

    private AlgorithmDetailDTO algorithmDetailDto;

    public DynamicMaskingPolicyUpdate withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 数据表中的字段名称。
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public DynamicMaskingPolicyUpdate withColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * 数据表中字段的数据类型。
     * @return columnType
     */
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public DynamicMaskingPolicyUpdate withAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 具体动态脱敏规则参数介绍请参见[动态脱敏规则介绍](dataartsstudio_01_1036.html)。 HIVE数据源动态脱敏算法 - MASK 掩盖英文字符和数字 - MASK_SHOW_LAST_4 保留后四位 - MASK_SHOW_FIRST_4 保留前四位 - MASK_HASH 哈希掩盖 - MASK_DATE_SHOW_YEAR 掩盖月份和日期 - MASK_NULL NULL掩盖  DWS数据源动态脱敏算法 - DWS_ALL_MASK 全掩码 - DWS_BACK_KEEP 保留后4位，其余脱敏为* - DWS_FRONT_KEEP 保留前2位，其余脱敏为* - DWS_SELF_CONFIG 需要输入开始位置、结束位置、脱敏字符传入detail结构体中，例如{\"start\": 1, \"end\": 2, \"string_target\": \"*\"}  [DLI数据源动态脱敏算法](tag:nohcs) - [MASK 掩盖英文字符和数字](tag:nohcs) - [MASK_SHOW_LAST_4 保留后四位](tag:nohcs) - [MASK_SHOW_FIRST_4 保留前四位](tag:nohcs) - [MASK_HASH 哈希掩盖](tag:nohcs) - [MASK_DATE_SHOW_YEAR 掩盖月份和日期](tag:nohcs) - [MASK_NULL NULL掩盖](tag:nohcs)
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
    }

    public DynamicMaskingPolicyUpdate withAlgorithmDetail(String algorithmDetail) {
        this.algorithmDetail = algorithmDetail;
        return this;
    }

    /**
     * 动态脱敏策略算法详情。
     * @return algorithmDetail
     */
    public String getAlgorithmDetail() {
        return algorithmDetail;
    }

    public void setAlgorithmDetail(String algorithmDetail) {
        this.algorithmDetail = algorithmDetail;
    }

    public DynamicMaskingPolicyUpdate withAlgorithmDetailDto(AlgorithmDetailDTO algorithmDetailDto) {
        this.algorithmDetailDto = algorithmDetailDto;
        return this;
    }

    public DynamicMaskingPolicyUpdate withAlgorithmDetailDto(Consumer<AlgorithmDetailDTO> algorithmDetailDtoSetter) {
        if (this.algorithmDetailDto == null) {
            this.algorithmDetailDto = new AlgorithmDetailDTO();
            algorithmDetailDtoSetter.accept(this.algorithmDetailDto);
        }

        return this;
    }

    /**
     * Get algorithmDetailDto
     * @return algorithmDetailDto
     */
    public AlgorithmDetailDTO getAlgorithmDetailDto() {
        return algorithmDetailDto;
    }

    public void setAlgorithmDetailDto(AlgorithmDetailDTO algorithmDetailDto) {
        this.algorithmDetailDto = algorithmDetailDto;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DynamicMaskingPolicyUpdate that = (DynamicMaskingPolicyUpdate) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.columnType, that.columnType)
            && Objects.equals(this.algorithmType, that.algorithmType)
            && Objects.equals(this.algorithmDetail, that.algorithmDetail)
            && Objects.equals(this.algorithmDetailDto, that.algorithmDetailDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, columnType, algorithmType, algorithmDetail, algorithmDetailDto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DynamicMaskingPolicyUpdate {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
        sb.append("    algorithmDetail: ").append(toIndentedString(algorithmDetail)).append("\n");
        sb.append("    algorithmDetailDto: ").append(toIndentedString(algorithmDetailDto)).append("\n");
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
