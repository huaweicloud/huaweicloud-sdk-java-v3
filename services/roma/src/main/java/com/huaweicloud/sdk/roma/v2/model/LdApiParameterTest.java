package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * LdApiParameterTest
 */
public class LdApiParameterTest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="in")
    
    private String in;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default")
    
    private String _default;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="required")
    
    private Boolean required = false;

    public LdApiParameterTest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数名称： - 参数位于Headers、 Parameters时，用户自行定义，支持英文、数字、点、中划线，且需要英文开头，长度限制32字符。 - 参数位于Body时候，参数以application/json、application/xml、application/text为名，但实际是以请求body里的键值对作为参数名和参数值，比如请求消息样例，参数名为application/json，参数值为{\\\"table\\\":\\\"apic01\\\",\\\"id\\\":\\\"1\\\"}，后端取table：apic01，id：1这两个键值对作为入参。 - 注意：定义参数不要重名，否则会覆盖掉，当Headers、 Parameters重复时候，Parameters会被覆盖，当Parameters和Body里的键值对重复时候，Parameters会被覆盖。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LdApiParameterTest withIn(String in) {
        this.in = in;
        return this;
    }

    


    /**
     * 该参数在调用API时候所放的位置： - Headers ：放于请求头 - Parameters ：放于请求参数 - Body：放于请求体 
     * @return in
     */
    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public LdApiParameterTest withDefault(String _default) {
        this._default = _default;
        return this;
    }

    


    /**
     * 参数默认值
     * @return _default
     */
    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public LdApiParameterTest withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    


    /**
     * 参数是否必须。true：必须，false：不必须
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LdApiParameterTest ldApiParameterTest = (LdApiParameterTest) o;
        return Objects.equals(this.name, ldApiParameterTest.name) &&
            Objects.equals(this.in, ldApiParameterTest.in) &&
            Objects.equals(this._default, ldApiParameterTest._default) &&
            Objects.equals(this.required, ldApiParameterTest.required);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, in, _default, required);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdApiParameterTest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    in: ").append(toIndentedString(in)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

