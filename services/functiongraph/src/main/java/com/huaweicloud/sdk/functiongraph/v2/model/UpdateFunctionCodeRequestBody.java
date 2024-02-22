package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateFunctionCodeRequestBody
 */
public class UpdateFunctionCodeRequestBody {

    /**
     * 函数代码类型，取值有5种。 inline: UI在线编辑代码。 zip: 函数代码为zip包。 obs: 函数代码来源于obs存储。 jar: 函数代码为jar包，主要针对Java函数。 Custom-Image-Swr: 函数代码来源与SWR自定义镜像。
     */
    public static final class CodeTypeEnum {

        /**
         * Enum INLINE for value: "inline"
         */
        public static final CodeTypeEnum INLINE = new CodeTypeEnum("inline");

        /**
         * Enum ZIP for value: "zip"
         */
        public static final CodeTypeEnum ZIP = new CodeTypeEnum("zip");

        /**
         * Enum OBS for value: "obs"
         */
        public static final CodeTypeEnum OBS = new CodeTypeEnum("obs");

        /**
         * Enum JAR for value: "jar"
         */
        public static final CodeTypeEnum JAR = new CodeTypeEnum("jar");

        /**
         * Enum CUSTOM_IMAGE_SWR for value: "Custom-Image-Swr"
         */
        public static final CodeTypeEnum CUSTOM_IMAGE_SWR = new CodeTypeEnum("Custom-Image-Swr");

        private static final Map<String, CodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CodeTypeEnum> createStaticFields() {
            Map<String, CodeTypeEnum> map = new HashMap<>();
            map.put("inline", INLINE);
            map.put("zip", ZIP);
            map.put("obs", OBS);
            map.put("jar", JAR);
            map.put("Custom-Image-Swr", CUSTOM_IMAGE_SWR);
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
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CodeTypeEnum(value));
        }

        public static CodeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "code_type")

    private CodeTypeEnum codeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_url")

    private String codeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_filename")

    private String codeFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_code")

    private FuncCode funcCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_list")

    private List<String> dependList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_version_list")

    private List<String> dependVersionList = null;

    public UpdateFunctionCodeRequestBody withCodeType(CodeTypeEnum codeType) {
        this.codeType = codeType;
        return this;
    }

    /**
     * 函数代码类型，取值有5种。 inline: UI在线编辑代码。 zip: 函数代码为zip包。 obs: 函数代码来源于obs存储。 jar: 函数代码为jar包，主要针对Java函数。 Custom-Image-Swr: 函数代码来源与SWR自定义镜像。
     * @return codeType
     */
    public CodeTypeEnum getCodeType() {
        return codeType;
    }

    public void setCodeType(CodeTypeEnum codeType) {
        this.codeType = codeType;
    }

    public UpdateFunctionCodeRequestBody withCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
        return this;
    }

    /**
     * 当CodeType为obs时，该值为函数代码包在OBS上的地址，CodeType为其他值时，该字段为空。
     * @return codeUrl
     */
    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public UpdateFunctionCodeRequestBody withCodeFilename(String codeFilename) {
        this.codeFilename = codeFilename;
        return this;
    }

    /**
     * 函数的文件名，当CodeType为jar/zip时必须提供该字段，inline和obs不需要提供。
     * @return codeFilename
     */
    public String getCodeFilename() {
        return codeFilename;
    }

    public void setCodeFilename(String codeFilename) {
        this.codeFilename = codeFilename;
    }

    public UpdateFunctionCodeRequestBody withFuncCode(FuncCode funcCode) {
        this.funcCode = funcCode;
        return this;
    }

    public UpdateFunctionCodeRequestBody withFuncCode(Consumer<FuncCode> funcCodeSetter) {
        if (this.funcCode == null) {
            this.funcCode = new FuncCode();
            funcCodeSetter.accept(this.funcCode);
        }

        return this;
    }

    /**
     * Get funcCode
     * @return funcCode
     */
    public FuncCode getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(FuncCode funcCode) {
        this.funcCode = funcCode;
    }

    public UpdateFunctionCodeRequestBody withDependList(List<String> dependList) {
        this.dependList = dependList;
        return this;
    }

    public UpdateFunctionCodeRequestBody addDependListItem(String dependListItem) {
        if (this.dependList == null) {
            this.dependList = new ArrayList<>();
        }
        this.dependList.add(dependListItem);
        return this;
    }

    public UpdateFunctionCodeRequestBody withDependList(Consumer<List<String>> dependListSetter) {
        if (this.dependList == null) {
            this.dependList = new ArrayList<>();
        }
        dependListSetter.accept(this.dependList);
        return this;
    }

    /**
     * 依赖id列表
     * @return dependList
     */
    public List<String> getDependList() {
        return dependList;
    }

    public void setDependList(List<String> dependList) {
        this.dependList = dependList;
    }

    public UpdateFunctionCodeRequestBody withDependVersionList(List<String> dependVersionList) {
        this.dependVersionList = dependVersionList;
        return this;
    }

    public UpdateFunctionCodeRequestBody addDependVersionListItem(String dependVersionListItem) {
        if (this.dependVersionList == null) {
            this.dependVersionList = new ArrayList<>();
        }
        this.dependVersionList.add(dependVersionListItem);
        return this;
    }

    public UpdateFunctionCodeRequestBody withDependVersionList(Consumer<List<String>> dependVersionListSetter) {
        if (this.dependVersionList == null) {
            this.dependVersionList = new ArrayList<>();
        }
        dependVersionListSetter.accept(this.dependVersionList);
        return this;
    }

    /**
     * 依赖版本id列表
     * @return dependVersionList
     */
    public List<String> getDependVersionList() {
        return dependVersionList;
    }

    public void setDependVersionList(List<String> dependVersionList) {
        this.dependVersionList = dependVersionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFunctionCodeRequestBody that = (UpdateFunctionCodeRequestBody) obj;
        return Objects.equals(this.codeType, that.codeType) && Objects.equals(this.codeUrl, that.codeUrl)
            && Objects.equals(this.codeFilename, that.codeFilename) && Objects.equals(this.funcCode, that.funcCode)
            && Objects.equals(this.dependList, that.dependList)
            && Objects.equals(this.dependVersionList, that.dependVersionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeType, codeUrl, codeFilename, funcCode, dependList, dependVersionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFunctionCodeRequestBody {\n");
        sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
        sb.append("    codeUrl: ").append(toIndentedString(codeUrl)).append("\n");
        sb.append("    codeFilename: ").append(toIndentedString(codeFilename)).append("\n");
        sb.append("    funcCode: ").append(toIndentedString(funcCode)).append("\n");
        sb.append("    dependList: ").append(toIndentedString(dependList)).append("\n");
        sb.append("    dependVersionList: ").append(toIndentedString(dependVersionList)).append("\n");
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
