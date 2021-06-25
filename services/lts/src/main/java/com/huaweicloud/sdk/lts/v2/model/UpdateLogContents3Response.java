package com.huaweicloud.sdk.lts.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateLogContents3Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="context")
    
    private String context;

    public UpdateLogContents3Response withContext(String context) {
        this.context = context;
        return this;
    }

    


    /**
     * 查询结构化日志结果信息。此处仅为示例，具体参数名称取决于查询的字段。
     * @return context
     */
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLogContents3Response updateLogContents3Response = (UpdateLogContents3Response) o;
        return Objects.equals(this.context, updateLogContents3Response.context);
    }
    @Override
    public int hashCode() {
        return Objects.hash(context);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogContents3Response {\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

