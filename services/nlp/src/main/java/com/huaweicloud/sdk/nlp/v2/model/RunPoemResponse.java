package com.huaweicloud.sdk.nlp.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunPoemResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="poem")
    
    
    private List<String> poem = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    
    private String errorMsg;

    public RunPoemResponse withPoem(List<String> poem) {
        this.poem = poem;
        return this;
    }

    
    public RunPoemResponse addPoemItem(String poemItem) {
        if(this.poem == null) {
            this.poem = new ArrayList<>();
        }
        this.poem.add(poemItem);
        return this;
    }

    public RunPoemResponse withPoem(Consumer<List<String>> poemSetter) {
        if(this.poem == null) {
            this.poem = new ArrayList<>();
        }
        poemSetter.accept(this.poem);
        return this;
    }

    /**
     * 根据文本请求体，返回生成的诗歌。调用失败时无此字段。
     * @return poem
     */
    public List<String> getPoem() {
        return poem;
    }

    public void setPoem(List<String> poem) {
        this.poem = poem;
    }

    

    public RunPoemResponse withErrorCode(String errorCode) {
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

    

    public RunPoemResponse withErrorMsg(String errorMsg) {
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
        RunPoemResponse runPoemResponse = (RunPoemResponse) o;
        return Objects.equals(this.poem, runPoemResponse.poem) &&
            Objects.equals(this.errorCode, runPoemResponse.errorCode) &&
            Objects.equals(this.errorMsg, runPoemResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(poem, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunPoemResponse {\n");
        sb.append("    poem: ").append(toIndentedString(poem)).append("\n");
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

