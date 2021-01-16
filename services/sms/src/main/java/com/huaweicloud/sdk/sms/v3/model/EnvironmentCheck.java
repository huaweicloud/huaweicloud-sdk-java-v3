package com.huaweicloud.sdk.sms.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 源端校验项
 */
public class EnvironmentCheck  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 检查结果
     */
    public static final class ResultEnum {

        
        /**
         * Enum OK_ for value: "OK：检查通过"
         */
        public static final ResultEnum OK_ = new ResultEnum("OK：检查通过");
        
        /**
         * Enum WARN_ for value: "WARN：告警"
         */
        public static final ResultEnum WARN_ = new ResultEnum("WARN：告警");
        
        /**
         * Enum ERROR_ for value: "ERROR：检查不通过"
         */
        public static final ResultEnum ERROR_ = new ResultEnum("ERROR：检查不通过");
        

        private static final Map<String, ResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultEnum> createStaticFields() {
            Map<String, ResultEnum> map = new HashMap<>();
            map.put("OK：检查通过", OK_);
            map.put("WARN：告警", WARN_);
            map.put("ERROR：检查不通过", ERROR_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResultEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResultEnum(value);
            }
            return result;
        }

        public static ResultEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof ResultEnum) {
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
    @JsonProperty(value="result")
    
    private ResultEnum result;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_params")
    
    private String errorParams;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="params")
    
    private List<String> params = null;
    
    public EnvironmentCheck withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 该检查项的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnvironmentCheck withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 检查项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnvironmentCheck withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    


    /**
     * 检查结果
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    public EnvironmentCheck withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 检查不通过的错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public EnvironmentCheck withErrorParams(String errorParams) {
        this.errorParams = errorParams;
        return this;
    }

    


    /**
     * 检查不通过的错误参数
     * @return errorParams
     */
    public String getErrorParams() {
        return errorParams;
    }

    public void setErrorParams(String errorParams) {
        this.errorParams = errorParams;
    }

    public EnvironmentCheck withParams(List<String> params) {
        this.params = params;
        return this;
    }

    
    public EnvironmentCheck addParamsItem(String paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public EnvironmentCheck withParams(Consumer<List<String>> paramsSetter) {
        if(this.params == null ){
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 参数
     * @return params
     */
    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvironmentCheck environmentCheck = (EnvironmentCheck) o;
        return Objects.equals(this.id, environmentCheck.id) &&
            Objects.equals(this.name, environmentCheck.name) &&
            Objects.equals(this.result, environmentCheck.result) &&
            Objects.equals(this.errorCode, environmentCheck.errorCode) &&
            Objects.equals(this.errorParams, environmentCheck.errorParams) &&
            Objects.equals(this.params, environmentCheck.params);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, result, errorCode, errorParams, params);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentCheck {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorParams: ").append(toIndentedString(errorParams)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

