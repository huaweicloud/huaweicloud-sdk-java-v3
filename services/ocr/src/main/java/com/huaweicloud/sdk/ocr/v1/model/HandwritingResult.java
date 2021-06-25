package com.huaweicloud.sdk.ocr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ocr.v1.model.ExtractedData;
import com.huaweicloud.sdk.ocr.v1.model.HandwritingWordsBlockList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class HandwritingResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="words_block_count")
    
    private Integer wordsBlockCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="words_block_list")
    
    private List<HandwritingWordsBlockList> wordsBlockList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extracted_data")
    
    private ExtractedData extractedData;

    public HandwritingResult withWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
        return this;
    }

    


    /**
     * 代表检测识别出来的文字块数目。 \"segment_digit\" 和\"segment\"默认为1。       
     * @return wordsBlockCount
     */
    public Integer getWordsBlockCount() {
        return wordsBlockCount;
    }

    public void setWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
    }

    

    public HandwritingResult withWordsBlockList(List<HandwritingWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
        return this;
    }

    
    public HandwritingResult addWordsBlockListItem(HandwritingWordsBlockList wordsBlockListItem) {
        if(this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        this.wordsBlockList.add(wordsBlockListItem);
        return this;
    }

    public HandwritingResult withWordsBlockList(Consumer<List<HandwritingWordsBlockList>> wordsBlockListSetter) {
        if(this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        wordsBlockListSetter.accept(this.wordsBlockList);
        return this;
    }

    /**
     * 识别文字块列表，输出顺序从左到右，从上到下。 
     * @return wordsBlockList
     */
    public List<HandwritingWordsBlockList> getWordsBlockList() {
        return wordsBlockList;
    }

    public void setWordsBlockList(List<HandwritingWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
    }

    

    public HandwritingResult withExtractedData(ExtractedData extractedData) {
        this.extractedData = extractedData;
        return this;
    }

    public HandwritingResult withExtractedData(Consumer<ExtractedData> extractedDataSetter) {
        if(this.extractedData == null ){
            this.extractedData = new ExtractedData();
            extractedDataSetter.accept(this.extractedData);
        }
        
        return this;
    }


    /**
     * Get extractedData
     * @return extractedData
     */
    public ExtractedData getExtractedData() {
        return extractedData;
    }

    public void setExtractedData(ExtractedData extractedData) {
        this.extractedData = extractedData;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HandwritingResult handwritingResult = (HandwritingResult) o;
        return Objects.equals(this.wordsBlockCount, handwritingResult.wordsBlockCount) &&
            Objects.equals(this.wordsBlockList, handwritingResult.wordsBlockList) &&
            Objects.equals(this.extractedData, handwritingResult.extractedData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(wordsBlockCount, wordsBlockList, extractedData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HandwritingResult {\n");
        sb.append("    wordsBlockCount: ").append(toIndentedString(wordsBlockCount)).append("\n");
        sb.append("    wordsBlockList: ").append(toIndentedString(wordsBlockList)).append("\n");
        sb.append("    extractedData: ").append(toIndentedString(extractedData)).append("\n");
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

