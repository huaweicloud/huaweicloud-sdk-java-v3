package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 命令执行结果包装
 */
public class CmdResultWrapper {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd_results")

    private List<CmdResult> cmdResults = null;

    public CmdResultWrapper withCmdResults(List<CmdResult> cmdResults) {
        this.cmdResults = cmdResults;
        return this;
    }

    public CmdResultWrapper addCmdResultsItem(CmdResult cmdResultsItem) {
        if (this.cmdResults == null) {
            this.cmdResults = new ArrayList<>();
        }
        this.cmdResults.add(cmdResultsItem);
        return this;
    }

    public CmdResultWrapper withCmdResults(Consumer<List<CmdResult>> cmdResultsSetter) {
        if (this.cmdResults == null) {
            this.cmdResults = new ArrayList<>();
        }
        cmdResultsSetter.accept(this.cmdResults);
        return this;
    }

    /**
     * 命令执行结果
     * @return cmdResults
     */
    public List<CmdResult> getCmdResults() {
        return cmdResults;
    }

    public void setCmdResults(List<CmdResult> cmdResults) {
        this.cmdResults = cmdResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CmdResultWrapper that = (CmdResultWrapper) obj;
        return Objects.equals(this.cmdResults, that.cmdResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cmdResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CmdResultWrapper {\n");
        sb.append("    cmdResults: ").append(toIndentedString(cmdResults)).append("\n");
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
