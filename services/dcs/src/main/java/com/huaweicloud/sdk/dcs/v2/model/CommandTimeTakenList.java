package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 命令耗时统计列表
 */
public class CommandTimeTakenList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    @JacksonXmlProperty(localName = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_usec_sum")

    @JacksonXmlProperty(localName = "total_usec_sum")

    private Double totalUsecSum;

    /**
     * 命令耗时统计结果
     */
    public static final class ResultEnum {

        /**
         * Enum SUCCEED for value: "succeed"
         */
        public static final ResultEnum SUCCEED = new ResultEnum("succeed");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final ResultEnum FAILED = new ResultEnum("failed");

        private static final Map<String, ResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultEnum> createStaticFields() {
            Map<String, ResultEnum> map = new HashMap<>();
            map.put("succeed", SUCCEED);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResultEnum(value);
            }
            return result;
        }

        public static ResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultEnum) {
                return this.value.equals(((ResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private ResultEnum result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_list")

    @JacksonXmlProperty(localName = "command_list")

    private List<CommandTimeTaken> commandList = null;

    public CommandTimeTakenList withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 执行命令的总次数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public CommandTimeTakenList withTotalUsecSum(Double totalUsecSum) {
        this.totalUsecSum = totalUsecSum;
        return this;
    }

    /**
     * 执行命令的总耗时
     * @return totalUsecSum
     */
    public Double getTotalUsecSum() {
        return totalUsecSum;
    }

    public void setTotalUsecSum(Double totalUsecSum) {
        this.totalUsecSum = totalUsecSum;
    }

    public CommandTimeTakenList withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    /**
     * 命令耗时统计结果
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    public CommandTimeTakenList withCommandList(List<CommandTimeTaken> commandList) {
        this.commandList = commandList;
        return this;
    }

    public CommandTimeTakenList addCommandListItem(CommandTimeTaken commandListItem) {
        if (this.commandList == null) {
            this.commandList = new ArrayList<>();
        }
        this.commandList.add(commandListItem);
        return this;
    }

    public CommandTimeTakenList withCommandList(Consumer<List<CommandTimeTaken>> commandListSetter) {
        if (this.commandList == null) {
            this.commandList = new ArrayList<>();
        }
        commandListSetter.accept(this.commandList);
        return this;
    }

    /**
     * 命令耗时统计
     * @return commandList
     */
    public List<CommandTimeTaken> getCommandList() {
        return commandList;
    }

    public void setCommandList(List<CommandTimeTaken> commandList) {
        this.commandList = commandList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommandTimeTakenList commandTimeTakenList = (CommandTimeTakenList) o;
        return Objects.equals(this.totalNum, commandTimeTakenList.totalNum)
            && Objects.equals(this.totalUsecSum, commandTimeTakenList.totalUsecSum)
            && Objects.equals(this.result, commandTimeTakenList.result)
            && Objects.equals(this.commandList, commandTimeTakenList.commandList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, totalUsecSum, result, commandList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommandTimeTakenList {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    totalUsecSum: ").append(toIndentedString(totalUsecSum)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    commandList: ").append(toIndentedString(commandList)).append("\n");
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
