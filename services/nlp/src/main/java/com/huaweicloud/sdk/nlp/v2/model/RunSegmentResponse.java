package com.huaweicloud.sdk.nlp.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.Word;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunSegmentResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="words")
    
    private List<Word> words = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    

    private String errorMsg;

    public RunSegmentResponse withWords(List<Word> words) {
        this.words = words;
        return this;
    }

    
    public RunSegmentResponse addWordsItem(Word wordsItem) {
        if(this.words == null) {
            this.words = new ArrayList<>();
        }
        this.words.add(wordsItem);
        return this;
    }

    public RunSegmentResponse withWords(Consumer<List<Word>> wordsSetter) {
        if(this.words == null) {
            this.words = new ArrayList<>();
        }
        wordsSetter.accept(this.words);
        return this;
    }

    /**
     * 分词结果。调用失败时无此字段。
     * @return words
     */
    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    

    public RunSegmentResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 调用失败时的错误码，具体请参见错误码。调用成功时无此字段。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public RunSegmentResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 调用失败时的错误信息。调用成功时无此字段。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunSegmentResponse runSegmentResponse = (RunSegmentResponse) o;
        return Objects.equals(this.words, runSegmentResponse.words) &&
            Objects.equals(this.errorCode, runSegmentResponse.errorCode) &&
            Objects.equals(this.errorMsg, runSegmentResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(words, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSegmentResponse {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

