package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class FinancialStatementResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_region_count")

    private Integer wordsRegionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_region_list")

    private List<FinancialStatementWordsRegionList> wordsRegionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excel")

    private String excel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private FinancialStatementResultImageSize imageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rectification_matrix")

    private List<List<Float>> rectificationMatrix = null;

    public FinancialStatementResult withWordsRegionCount(Integer wordsRegionCount) {
        this.wordsRegionCount = wordsRegionCount;
        return this;
    }

    /**
     * 识别出来的表格、文本区域个数。 
     * @return wordsRegionCount
     */
    public Integer getWordsRegionCount() {
        return wordsRegionCount;
    }

    public void setWordsRegionCount(Integer wordsRegionCount) {
        this.wordsRegionCount = wordsRegionCount;
    }

    public FinancialStatementResult withWordsRegionList(List<FinancialStatementWordsRegionList> wordsRegionList) {
        this.wordsRegionList = wordsRegionList;
        return this;
    }

    public FinancialStatementResult addWordsRegionListItem(FinancialStatementWordsRegionList wordsRegionListItem) {
        if (this.wordsRegionList == null) {
            this.wordsRegionList = new ArrayList<>();
        }
        this.wordsRegionList.add(wordsRegionListItem);
        return this;
    }

    public FinancialStatementResult withWordsRegionList(
        Consumer<List<FinancialStatementWordsRegionList>> wordsRegionListSetter) {
        if (this.wordsRegionList == null) {
            this.wordsRegionList = new ArrayList<>();
        }
        wordsRegionListSetter.accept(this.wordsRegionList);
        return this;
    }

    /**
     * 返回的表格、文本区域列表。输出顺序从左到右，从上到下。 
     * @return wordsRegionList
     */
    public List<FinancialStatementWordsRegionList> getWordsRegionList() {
        return wordsRegionList;
    }

    public void setWordsRegionList(List<FinancialStatementWordsRegionList> wordsRegionList) {
        this.wordsRegionList = wordsRegionList;
    }

    public FinancialStatementResult withExcel(String excel) {
        this.excel = excel;
        return this;
    }

    /**
     * 表格图像转换为excel的base64编码，图像中的文字和表格按位置写入excel，可编辑。对返回的excel编码，可用base64.b64decode解码并保存为xlsx文件。 
     * @return excel
     */
    public String getExcel() {
        return excel;
    }

    public void setExcel(String excel) {
        this.excel = excel;
    }

    public FinancialStatementResult withImageSize(FinancialStatementResultImageSize imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    public FinancialStatementResult withImageSize(Consumer<FinancialStatementResultImageSize> imageSizeSetter) {
        if (this.imageSize == null) {
            this.imageSize = new FinancialStatementResultImageSize();
            imageSizeSetter.accept(this.imageSize);
        }

        return this;
    }

    /**
     * Get imageSize
     * @return imageSize
     */
    public FinancialStatementResultImageSize getImageSize() {
        return imageSize;
    }

    public void setImageSize(FinancialStatementResultImageSize imageSize) {
        this.imageSize = imageSize;
    }

    public FinancialStatementResult withRectificationMatrix(List<List<Float>> rectificationMatrix) {
        this.rectificationMatrix = rectificationMatrix;
        return this;
    }

    public FinancialStatementResult addRectificationMatrixItem(List<Float> rectificationMatrixItem) {
        if (this.rectificationMatrix == null) {
            this.rectificationMatrix = new ArrayList<>();
        }
        this.rectificationMatrix.add(rectificationMatrixItem);
        return this;
    }

    public FinancialStatementResult withRectificationMatrix(Consumer<List<List<Float>>> rectificationMatrixSetter) {
        if (this.rectificationMatrix == null) {
            this.rectificationMatrix = new ArrayList<>();
        }
        rectificationMatrixSetter.accept(this.rectificationMatrix);
        return this;
    }

    /**
     * 返回透视变换矩阵 
     * @return rectificationMatrix
     */
    public List<List<Float>> getRectificationMatrix() {
        return rectificationMatrix;
    }

    public void setRectificationMatrix(List<List<Float>> rectificationMatrix) {
        this.rectificationMatrix = rectificationMatrix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FinancialStatementResult that = (FinancialStatementResult) obj;
        return Objects.equals(this.wordsRegionCount, that.wordsRegionCount)
            && Objects.equals(this.wordsRegionList, that.wordsRegionList) && Objects.equals(this.excel, that.excel)
            && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.rectificationMatrix, that.rectificationMatrix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordsRegionCount, wordsRegionList, excel, imageSize, rectificationMatrix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FinancialStatementResult {\n");
        sb.append("    wordsRegionCount: ").append(toIndentedString(wordsRegionCount)).append("\n");
        sb.append("    wordsRegionList: ").append(toIndentedString(wordsRegionList)).append("\n");
        sb.append("    excel: ").append(toIndentedString(excel)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    rectificationMatrix: ").append(toIndentedString(rectificationMatrix)).append("\n");
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
