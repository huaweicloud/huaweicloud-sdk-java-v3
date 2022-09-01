package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 命令参数body
 */
public class CommandBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_name")

    @JacksonXmlProperty(localName = "command_name")

    private String commandName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_detail")

    @JacksonXmlProperty(localName = "result_detail")

    private Object resultDetail;

    public CommandBody withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    /**
     * 命令名称，分为：START、STOP、DELETE、SYNC、UPLOAD_LOG、RSET_LOG_ACL
     * @return commandName
     */
    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public CommandBody withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 命令执行结果  success代表执行命令成功  fail代表命令执行失败 
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public CommandBody withResultDetail(Object resultDetail) {
        this.resultDetail = resultDetail;
        return this;
    }

    /**
     * JSON格式的命令执行结果，只用于保存数据库，没有其他作用
     * @return resultDetail
     */
    public Object getResultDetail() {
        return resultDetail;
    }

    public void setResultDetail(Object resultDetail) {
        this.resultDetail = resultDetail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommandBody commandBody = (CommandBody) o;
        return Objects.equals(this.commandName, commandBody.commandName)
            && Objects.equals(this.result, commandBody.result)
            && Objects.equals(this.resultDetail, commandBody.resultDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commandName, result, resultDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommandBody {\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    resultDetail: ").append(toIndentedString(resultDetail)).append("\n");
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
