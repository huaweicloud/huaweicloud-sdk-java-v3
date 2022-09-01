package com.huaweicloud.sdk.nlp.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunConstituencyParserResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tree")
    
    @JacksonXmlProperty(localName = "tree")
    
    private String tree;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    @JacksonXmlProperty(localName = "error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    @JacksonXmlProperty(localName = "error_msg")
    
    private String errorMsg;

    public RunConstituencyParserResponse withTree(String tree) {
        this.tree = tree;
        return this;
    }

    


    /**
     * 成分句法分析结果，用嵌套括号的形式表示一棵树。括号内的第一个元素为子树的标签，若是叶子节点则用符号_代替。第二个元素为子树，若是叶子节点则为字符串。
     * @return tree
     */
    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    

    public RunConstituencyParserResponse withErrorCode(String errorCode) {
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

    

    public RunConstituencyParserResponse withErrorMsg(String errorMsg) {
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
        RunConstituencyParserResponse runConstituencyParserResponse = (RunConstituencyParserResponse) o;
        return Objects.equals(this.tree, runConstituencyParserResponse.tree) &&
            Objects.equals(this.errorCode, runConstituencyParserResponse.errorCode) &&
            Objects.equals(this.errorMsg, runConstituencyParserResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tree, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunConstituencyParserResponse {\n");
        sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
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

