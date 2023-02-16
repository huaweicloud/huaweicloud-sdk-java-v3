package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListToolsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tools")

    private List<Tool> tools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ListToolsResponse withTools(List<Tool> tools) {
        this.tools = tools;
        return this;
    }

    public ListToolsResponse addToolsItem(Tool toolsItem) {
        if (this.tools == null) {
            this.tools = new ArrayList<>();
        }
        this.tools.add(toolsItem);
        return this;
    }

    public ListToolsResponse withTools(Consumer<List<Tool>> toolsSetter) {
        if (this.tools == null) {
            this.tools = new ArrayList<>();
        }
        toolsSetter.accept(this.tools);
        return this;
    }

    /**
     * 推荐工具列表
     * @return tools
     */
    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    public ListToolsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ListToolsResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述
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
        ListToolsResponse listToolsResponse = (ListToolsResponse) o;
        return Objects.equals(this.tools, listToolsResponse.tools)
            && Objects.equals(this.errorCode, listToolsResponse.errorCode)
            && Objects.equals(this.errorMsg, listToolsResponse.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tools, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListToolsResponse {\n");
        sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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
