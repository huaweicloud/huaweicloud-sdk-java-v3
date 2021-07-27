package com.huaweicloud.sdk.classroom.v3.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 下发判题任务请求参数
 */
public class JudgementTaskRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notify_url")
    
    private String notifyUrl;
    /**
     * 代码来源：inline（源代码）
     */
    public static final class CodeTypeEnum {

        
        /**
         * Enum INLINE for value: "inline"
         */
        public static final CodeTypeEnum INLINE = new CodeTypeEnum("inline");
        

        private static final Map<String, CodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CodeTypeEnum> createStaticFields() {
            Map<String, CodeTypeEnum> map = new HashMap<>();
            map.put("inline", INLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CodeTypeEnum(String value) {
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
        public static CodeTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CodeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CodeTypeEnum(value);
            }
            return result;
        }

        public static CodeTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CodeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CodeTypeEnum) {
                return this.value.equals(((CodeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code_type")
    
    private CodeTypeEnum codeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_code")
    
    private String sourceCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 支持语言类型：java、c、cpp、python
     */
    public static final class RuntimeTypeEnum {

        
        /**
         * Enum JAVA for value: "java"
         */
        public static final RuntimeTypeEnum JAVA = new RuntimeTypeEnum("java");
        
        /**
         * Enum C for value: "c"
         */
        public static final RuntimeTypeEnum C = new RuntimeTypeEnum("c");
        
        /**
         * Enum CPP for value: "cpp"
         */
        public static final RuntimeTypeEnum CPP = new RuntimeTypeEnum("cpp");
        
        /**
         * Enum PYTHON for value: "python"
         */
        public static final RuntimeTypeEnum PYTHON = new RuntimeTypeEnum("python");
        

        private static final Map<String, RuntimeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuntimeTypeEnum> createStaticFields() {
            Map<String, RuntimeTypeEnum> map = new HashMap<>();
            map.put("java", JAVA);
            map.put("c", C);
            map.put("cpp", CPP);
            map.put("python", PYTHON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuntimeTypeEnum(String value) {
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
        public static RuntimeTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RuntimeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RuntimeTypeEnum(value);
            }
            return result;
        }

        public static RuntimeTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RuntimeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuntimeTypeEnum) {
                return this.value.equals(((RuntimeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="runtime_type")
    
    private RuntimeTypeEnum runtimeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    private Integer timeout;
    /**
     * 结果返回类型：sysout（标准输出）、fileout（以文件形式输出）、imgout（以图片形式输出）
     */
    public static final class OutputTypeEnum {

        
        /**
         * Enum SYSOUT for value: "sysout"
         */
        public static final OutputTypeEnum SYSOUT = new OutputTypeEnum("sysout");
        
        /**
         * Enum FILEOUT for value: "fileout"
         */
        public static final OutputTypeEnum FILEOUT = new OutputTypeEnum("fileout");
        
        /**
         * Enum IMGOUT for value: "imgout"
         */
        public static final OutputTypeEnum IMGOUT = new OutputTypeEnum("imgout");
        

        private static final Map<String, OutputTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OutputTypeEnum> createStaticFields() {
            Map<String, OutputTypeEnum> map = new HashMap<>();
            map.put("sysout", SYSOUT);
            map.put("fileout", FILEOUT);
            map.put("imgout", IMGOUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OutputTypeEnum(String value) {
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
        public static OutputTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OutputTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OutputTypeEnum(value);
            }
            return result;
        }

        public static OutputTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OutputTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OutputTypeEnum) {
                return this.value.equals(((OutputTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_type")
    
    private OutputTypeEnum outputType;

    public JudgementTaskRequestBody withNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    


    /**
     * 第三方指定的判题结果回调url，取值来源于伙伴通道“判题管理配置”-“接口管理”中设置的回调地址相同
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    

    public JudgementTaskRequestBody withCodeType(CodeTypeEnum codeType) {
        this.codeType = codeType;
        return this;
    }

    


    /**
     * 代码来源：inline（源代码）
     * @return codeType
     */
    public CodeTypeEnum getCodeType() {
        return codeType;
    }

    public void setCodeType(CodeTypeEnum codeType) {
        this.codeType = codeType;
    }

    

    public JudgementTaskRequestBody withSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }

    


    /**
     * 源代码，需Base64编码
     * @return sourceCode
     */
    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    

    public JudgementTaskRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 任务描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public JudgementTaskRequestBody withRuntimeType(RuntimeTypeEnum runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }

    


    /**
     * 支持语言类型：java、c、cpp、python
     * @return runtimeType
     */
    public RuntimeTypeEnum getRuntimeType() {
        return runtimeType;
    }

    public void setRuntimeType(RuntimeTypeEnum runtimeType) {
        this.runtimeType = runtimeType;
    }

    

    public JudgementTaskRequestBody withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * 代码运行超时时间，单位为秒
     * minimum: 1
     * maximum: 60
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    

    public JudgementTaskRequestBody withOutputType(OutputTypeEnum outputType) {
        this.outputType = outputType;
        return this;
    }

    


    /**
     * 结果返回类型：sysout（标准输出）、fileout（以文件形式输出）、imgout（以图片形式输出）
     * @return outputType
     */
    public OutputTypeEnum getOutputType() {
        return outputType;
    }

    public void setOutputType(OutputTypeEnum outputType) {
        this.outputType = outputType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JudgementTaskRequestBody judgementTaskRequestBody = (JudgementTaskRequestBody) o;
        return Objects.equals(this.notifyUrl, judgementTaskRequestBody.notifyUrl) &&
            Objects.equals(this.codeType, judgementTaskRequestBody.codeType) &&
            Objects.equals(this.sourceCode, judgementTaskRequestBody.sourceCode) &&
            Objects.equals(this.description, judgementTaskRequestBody.description) &&
            Objects.equals(this.runtimeType, judgementTaskRequestBody.runtimeType) &&
            Objects.equals(this.timeout, judgementTaskRequestBody.timeout) &&
            Objects.equals(this.outputType, judgementTaskRequestBody.outputType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(notifyUrl, codeType, sourceCode, description, runtimeType, timeout, outputType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JudgementTaskRequestBody {\n");
        sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
        sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
        sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    runtimeType: ").append(toIndentedString(runtimeType)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
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

