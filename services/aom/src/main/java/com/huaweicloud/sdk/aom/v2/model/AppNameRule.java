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
 * 服务命名部分,数组中有多个对象时表示将每个对象抽取到的字符串拼接作为服务的名称。 nameType取值cmdLine时args格式为[\&quot;start\&quot;,\&quot;end\&quot;],表示抽取命令行中start、end之间的字符。 nameType取值cmdLine时args格式为[\&quot;aa\&quot;],表示抽取环境变量名为aa对应的环境变量值。 nameType取值str时,args格式为[\&quot;fix\&quot;],表示服务名称最后拼接固定文字fix。 nameType取值cmdLineHash时,args格式为[\&quot;0001\&quot;],value格式为[\&quot;ser\&quot;],表示当启动命令是0001时,服务名称为ser。
 */
@JacksonXmlRootElement(localName = "AppNameRule")
public class AppNameRule  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nameType")
    
    @JacksonXmlProperty(localName = "nameType")

    private String nameType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="args")
    
    @JacksonXmlProperty(localName = "args")
    private List<String> args = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    @JacksonXmlProperty(localName = "value")
    private List<String> value = null;
    
    public AppNameRule withNameType(String nameType) {
        this.nameType = nameType;
        return this;
    }

    


    /**
     * 取值类型。 从cmdLineHash、cmdLine、env、str里面选取。
     * @return nameType
     */
    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    

    public AppNameRule withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    
    public AppNameRule addArgsItem(String argsItem) {
        if(this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public AppNameRule withArgs(Consumer<List<String>> argsSetter) {
        if(this.args == null) {
            this.args = new ArrayList<>();
        }
        argsSetter.accept(this.args);
        return this;
    }

    /**
     * 输入值。
     * @return args
     */
    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    

    public AppNameRule withValue(List<String> value) {
        this.value = value;
        return this;
    }

    
    public AppNameRule addValueItem(String valueItem) {
        if(this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public AppNameRule withValue(Consumer<List<String>> valueSetter) {
        if(this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 服务名(仅nameType为cmdLineHash时填写)。
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
        AppNameRule appNameRule = (AppNameRule) o;
        return Objects.equals(this.nameType, appNameRule.nameType) &&
            Objects.equals(this.args, appNameRule.args) &&
            Objects.equals(this.value, appNameRule.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameType, args, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppNameRule {\n");
        sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
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

