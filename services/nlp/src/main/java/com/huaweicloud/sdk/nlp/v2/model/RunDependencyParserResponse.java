package com.huaweicloud.sdk.nlp.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.DependencyParserWord;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunDependencyParserResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="words")
    
    private List<DependencyParserWord> words = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    

    private String errorMsg;

    public RunDependencyParserResponse withWords(List<DependencyParserWord> words) {
        this.words = words;
        return this;
    }

    
    public RunDependencyParserResponse addWordsItem(DependencyParserWord wordsItem) {
        if(this.words == null) {
            this.words = new ArrayList<>();
        }
        this.words.add(wordsItem);
        return this;
    }

    public RunDependencyParserResponse withWords(Consumer<List<DependencyParserWord>> wordsSetter) {
        if(this.words == null) {
            this.words = new ArrayList<>();
        }
        wordsSetter.accept(this.words);
        return this;
    }

    /**
     * 依存句法分析结果，词汇集合。调用失败时无此字段。
     * @return words
     */
    public List<DependencyParserWord> getWords() {
        return words;
    }

    public void setWords(List<DependencyParserWord> words) {
        this.words = words;
    }

    

    public RunDependencyParserResponse withErrorCode(String errorCode) {
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

    

    public RunDependencyParserResponse withErrorMsg(String errorMsg) {
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
        RunDependencyParserResponse runDependencyParserResponse = (RunDependencyParserResponse) o;
        return Objects.equals(this.words, runDependencyParserResponse.words) &&
            Objects.equals(this.errorCode, runDependencyParserResponse.errorCode) &&
            Objects.equals(this.errorMsg, runDependencyParserResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(words, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunDependencyParserResponse {\n");
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

