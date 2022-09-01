package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 命令耗时统计
 */
public class CommandTimeTaken {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "calls_sum")

    @JacksonXmlProperty(localName = "calls_sum")

    private Integer callsSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usec_sum")

    @JacksonXmlProperty(localName = "usec_sum")

    private Double usecSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_name")

    @JacksonXmlProperty(localName = "command_name")

    private String commandName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_usec")

    @JacksonXmlProperty(localName = "per_usec")

    private String perUsec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_usec")

    @JacksonXmlProperty(localName = "average_usec")

    private Double averageUsec;

    public CommandTimeTaken withCallsSum(Integer callsSum) {
        this.callsSum = callsSum;
        return this;
    }

    /**
     * 调用次数
     * @return callsSum
     */
    public Integer getCallsSum() {
        return callsSum;
    }

    public void setCallsSum(Integer callsSum) {
        this.callsSum = callsSum;
    }

    public CommandTimeTaken withUsecSum(Double usecSum) {
        this.usecSum = usecSum;
        return this;
    }

    /**
     * 耗时总数
     * @return usecSum
     */
    public Double getUsecSum() {
        return usecSum;
    }

    public void setUsecSum(Double usecSum) {
        this.usecSum = usecSum;
    }

    public CommandTimeTaken withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    /**
     * 命令名称
     * @return commandName
     */
    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public CommandTimeTaken withPerUsec(String perUsec) {
        this.perUsec = perUsec;
        return this;
    }

    /**
     * 耗时占比
     * @return perUsec
     */
    public String getPerUsec() {
        return perUsec;
    }

    public void setPerUsec(String perUsec) {
        this.perUsec = perUsec;
    }

    public CommandTimeTaken withAverageUsec(Double averageUsec) {
        this.averageUsec = averageUsec;
        return this;
    }

    /**
     * 每次调用平均耗时
     * @return averageUsec
     */
    public Double getAverageUsec() {
        return averageUsec;
    }

    public void setAverageUsec(Double averageUsec) {
        this.averageUsec = averageUsec;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommandTimeTaken commandTimeTaken = (CommandTimeTaken) o;
        return Objects.equals(this.callsSum, commandTimeTaken.callsSum)
            && Objects.equals(this.usecSum, commandTimeTaken.usecSum)
            && Objects.equals(this.commandName, commandTimeTaken.commandName)
            && Objects.equals(this.perUsec, commandTimeTaken.perUsec)
            && Objects.equals(this.averageUsec, commandTimeTaken.averageUsec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callsSum, usecSum, commandName, perUsec, averageUsec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommandTimeTaken {\n");
        sb.append("    callsSum: ").append(toIndentedString(callsSum)).append("\n");
        sb.append("    usecSum: ").append(toIndentedString(usecSum)).append("\n");
        sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
        sb.append("    perUsec: ").append(toIndentedString(perUsec)).append("\n");
        sb.append("    averageUsec: ").append(toIndentedString(averageUsec)).append("\n");
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
