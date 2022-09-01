package com.huaweicloud.sdk.nlp.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunKeywordExtractResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="words")
    
    @JacksonXmlProperty(localName = "words")
    
    private List<String> words = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    @JacksonXmlProperty(localName = "error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    @JacksonXmlProperty(localName = "error_msg")
    
    private String errorMsg;

    public RunKeywordExtractResponse withWords(List<String> words) {
        this.words = words;
        return this;
    }

    
    public RunKeywordExtractResponse addWordsItem(String wordsItem) {
        if(this.words == null) {
            this.words = new ArrayList<>();
        }
        this.words.add(wordsItem);
        return this;
    }

    public RunKeywordExtractResponse withWords(Consumer<List<String>> wordsSetter) {
        if(this.words == null) {
            this.words = new ArrayList<>();
        }
        wordsSetter.accept(this.words);
        return this;
    }

    /**
     * 关键词列表。调用失败时无此字段。
     * @return words
     */
    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    

    public RunKeywordExtractResponse withErrorCode(String errorCode) {
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

    

    public RunKeywordExtractResponse withErrorMsg(String errorMsg) {
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
        RunKeywordExtractResponse runKeywordExtractResponse = (RunKeywordExtractResponse) o;
        return Objects.equals(this.words, runKeywordExtractResponse.words) &&
            Objects.equals(this.errorCode, runKeywordExtractResponse.errorCode) &&
            Objects.equals(this.errorMsg, runKeywordExtractResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(words, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunKeywordExtractResponse {\n");
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

