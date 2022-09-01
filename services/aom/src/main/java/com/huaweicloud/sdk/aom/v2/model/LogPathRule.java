package com.huaweicloud.sdk.aom.v2.model;





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
 * 日志路径配置规则。 当cmdLineHash为固定字符串时,指定日志路径或者日志文件。否则只采集进程当前打开的以.log和.trace结尾的文件。nameType取值cmdLineHash时,args格式为[\&quot;00001\&quot;],value格式为[\&quot;/xxx/xx.log\&quot;],表示当启动命令是00001时,日志路径为/xxx/xx.log。
 */
public class LogPathRule  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="args")
    
    @JacksonXmlProperty(localName = "args")
    
    private List<String> args = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nameType")
    
    @JacksonXmlProperty(localName = "nameType")
    
    private String nameType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    @JacksonXmlProperty(localName = "value")
    
    private List<String> value = null;
    
    public LogPathRule withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    
    public LogPathRule addArgsItem(String argsItem) {
        if(this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public LogPathRule withArgs(Consumer<List<String>> argsSetter) {
        if(this.args == null) {
            this.args = new ArrayList<>();
        }
        argsSetter.accept(this.args);
        return this;
    }

    /**
     * 命令行。
     * @return args
     */
    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    

    public LogPathRule withNameType(String nameType) {
        this.nameType = nameType;
        return this;
    }

    


    /**
     * 取值类型。 cmdLineHash
     * @return nameType
     */
    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    

    public LogPathRule withValue(List<String> value) {
        this.value = value;
        return this;
    }

    
    public LogPathRule addValueItem(String valueItem) {
        if(this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public LogPathRule withValue(Consumer<List<String>> valueSetter) {
        if(this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 日志路径。
     * @return value
     */
    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogPathRule logPathRule = (LogPathRule) o;
        return Objects.equals(this.args, logPathRule.args) &&
            Objects.equals(this.nameType, logPathRule.nameType) &&
            Objects.equals(this.value, logPathRule.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(args, nameType, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogPathRule {\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

