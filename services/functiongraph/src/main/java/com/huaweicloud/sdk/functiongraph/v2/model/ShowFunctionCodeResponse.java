package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowFunctionCodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_urn")

    private String funcUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_name")

    private String funcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    /** FunctionGraph函数的执行环境 支持Node.js6.10、Python2.7、Python3.6、Java8、Go1.8、Node.js 8.10、C#.NET Core 2.0、C#.NET Core
     * 2.1、PHP7.3。 Python2.7: Python语言2.7版本。 Python3.6: Pyton语言3.6版本。 Go1.8: Go语言1.8版本。 Go1.x: Go语言1.x版本。 Java8:
     * Java语言8版本。 Node.js6.10: Nodejs语言6.10版本。 Node.js8.10: Nodejs语言8.10版本。 Node.js10.16: Nodejs语言10.16版本。 Node.js12.13:
     * Nodejs语言12.13版本。 C#(.NET Core 2.0): C#语言2.0版本。 C#(.NET Core 2.1): C#语言2.1版本。 C#(.NET Core 3.1): C#语言3.1版本。
     * Custom: 自定义运行时。 PHP7.3: Php语言7.3版本。 */
    public static final class RuntimeEnum {

        /** Enum JAVA_8 for value: "Java 8" */
        public static final RuntimeEnum JAVA_8 = new RuntimeEnum("Java 8");

        /** Enum NODE_JS_6_10 for value: "Node.js 6.10" */
        public static final RuntimeEnum NODE_JS_6_10 = new RuntimeEnum("Node.js 6.10");

        /** Enum NODE_JS_8_10 for value: "Node.js 8.10" */
        public static final RuntimeEnum NODE_JS_8_10 = new RuntimeEnum("Node.js 8.10");

        /** Enum NODE_JS_10_16 for value: "Node.js 10.16" */
        public static final RuntimeEnum NODE_JS_10_16 = new RuntimeEnum("Node.js 10.16");

        /** Enum NODE_JS_12_13 for value: "Node.js 12.13" */
        public static final RuntimeEnum NODE_JS_12_13 = new RuntimeEnum("Node.js 12.13");

        /** Enum PYTHON_2_7 for value: "Python 2.7" */
        public static final RuntimeEnum PYTHON_2_7 = new RuntimeEnum("Python 2.7");

        /** Enum PYTHON_3_6 for value: "Python 3.6" */
        public static final RuntimeEnum PYTHON_3_6 = new RuntimeEnum("Python 3.6");

        /** Enum GO_1_8 for value: "Go 1.8" */
        public static final RuntimeEnum GO_1_8 = new RuntimeEnum("Go 1.8");

        /** Enum GO_1_X for value: "Go 1.x" */
        public static final RuntimeEnum GO_1_X = new RuntimeEnum("Go 1.x");

        /** Enum C_NET_CORE_2_0_ for value: "C#(.NET Core 2.0)" */
        public static final RuntimeEnum C_NET_CORE_2_0_ = new RuntimeEnum("C#(.NET Core 2.0)");

        /** Enum C_NET_CORE_2_1_ for value: "C#(.NET Core 2.1)" */
        public static final RuntimeEnum C_NET_CORE_2_1_ = new RuntimeEnum("C#(.NET Core 2.1)");

        /** Enum C_NET_CORE_3_1_ for value: "C#(.NET Core 3.1)" */
        public static final RuntimeEnum C_NET_CORE_3_1_ = new RuntimeEnum("C#(.NET Core 3.1)");

        /** Enum PHP_7_3 for value: "PHP 7.3" */
        public static final RuntimeEnum PHP_7_3 = new RuntimeEnum("PHP 7.3");

        private static final Map<String, RuntimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuntimeEnum> createStaticFields() {
            Map<String, RuntimeEnum> map = new HashMap<>();
            map.put("Java 8", JAVA_8);
            map.put("Node.js 6.10", NODE_JS_6_10);
            map.put("Node.js 8.10", NODE_JS_8_10);
            map.put("Node.js 10.16", NODE_JS_10_16);
            map.put("Node.js 12.13", NODE_JS_12_13);
            map.put("Python 2.7", PYTHON_2_7);
            map.put("Python 3.6", PYTHON_3_6);
            map.put("Go 1.8", GO_1_8);
            map.put("Go 1.x", GO_1_X);
            map.put("C#(.NET Core 2.0)", C_NET_CORE_2_0_);
            map.put("C#(.NET Core 2.1)", C_NET_CORE_2_1_);
            map.put("C#(.NET Core 3.1)", C_NET_CORE_3_1_);
            map.put("PHP 7.3", PHP_7_3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuntimeEnum(String value) {
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
        public static RuntimeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RuntimeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RuntimeEnum(value);
            }
            return result;
        }

        public static RuntimeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RuntimeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuntimeEnum) {
                return this.value.equals(((RuntimeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private RuntimeEnum runtime;

    /** 函数代码类型，取值有4种。 inline: UI在线编辑代码。 zip: 函数代码为zip包。 obs: 函数代码来源于obs存储。 jar: 函数代码为jar包，主要针对Java函数。 */
    public static final class CodeTypeEnum {

        /** Enum INLINE for value: "inline" */
        public static final CodeTypeEnum INLINE = new CodeTypeEnum("inline");

        /** Enum ZIP for value: "zip" */
        public static final CodeTypeEnum ZIP = new CodeTypeEnum("zip");

        /** Enum OBS for value: "obs" */
        public static final CodeTypeEnum OBS = new CodeTypeEnum("obs");

        /** Enum JAR for value: "jar" */
        public static final CodeTypeEnum JAR = new CodeTypeEnum("jar");

        private static final Map<String, CodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CodeTypeEnum> createStaticFields() {
            Map<String, CodeTypeEnum> map = new HashMap<>();
            map.put("inline", INLINE);
            map.put("zip", ZIP);
            map.put("obs", OBS);
            map.put("jar", JAR);
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
            CodeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CodeTypeEnum(value);
            }
            return result;
        }

        public static CodeTypeEnum valueOf(String value) {
            if (value == null) {
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
    @JsonProperty(value = "code_type")

    private CodeTypeEnum codeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_url")

    private String codeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_filename")

    private String codeFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_size")

    private Long codeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest")

    private String digest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private OffsetDateTime lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_code")

    private FuncCode funcCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_list")

    private List<String> dependList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_config")

    private StrategyConfig strategyConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependencies")

    private List<Dependency> dependencies = null;

    public ShowFunctionCodeResponse withFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
        return this;
    }

    /** 函数的URN（Uniform Resource Name），唯一标识函数。
     * 
     * @return funcUrn */
    public String getFuncUrn() {
        return funcUrn;
    }

    public void setFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
    }

    public ShowFunctionCodeResponse withFuncName(String funcName) {
        this.funcName = funcName;
        return this;
    }

    /** 函数名称。
     * 
     * @return funcName */
    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public ShowFunctionCodeResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 域名id。
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowFunctionCodeResponse withRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
        return this;
    }

    /** FunctionGraph函数的执行环境 支持Node.js6.10、Python2.7、Python3.6、Java8、Go1.8、Node.js 8.10、C#.NET Core 2.0、C#.NET Core
     * 2.1、PHP7.3。 Python2.7: Python语言2.7版本。 Python3.6: Pyton语言3.6版本。 Go1.8: Go语言1.8版本。 Go1.x: Go语言1.x版本。 Java8:
     * Java语言8版本。 Node.js6.10: Nodejs语言6.10版本。 Node.js8.10: Nodejs语言8.10版本。 Node.js10.16: Nodejs语言10.16版本。 Node.js12.13:
     * Nodejs语言12.13版本。 C#(.NET Core 2.0): C#语言2.0版本。 C#(.NET Core 2.1): C#语言2.1版本。 C#(.NET Core 3.1): C#语言3.1版本。
     * Custom: 自定义运行时。 PHP7.3: Php语言7.3版本。
     * 
     * @return runtime */
    public RuntimeEnum getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
    }

    public ShowFunctionCodeResponse withCodeType(CodeTypeEnum codeType) {
        this.codeType = codeType;
        return this;
    }

    /** 函数代码类型，取值有4种。 inline: UI在线编辑代码。 zip: 函数代码为zip包。 obs: 函数代码来源于obs存储。 jar: 函数代码为jar包，主要针对Java函数。
     * 
     * @return codeType */
    public CodeTypeEnum getCodeType() {
        return codeType;
    }

    public void setCodeType(CodeTypeEnum codeType) {
        this.codeType = codeType;
    }

    public ShowFunctionCodeResponse withCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
        return this;
    }

    /** 当CodeType为obs时，该值为函数代码包在OBS上的地址，CodeType为其他值时，该字段为空。
     * 
     * @return codeUrl */
    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public ShowFunctionCodeResponse withCodeFilename(String codeFilename) {
        this.codeFilename = codeFilename;
        return this;
    }

    /** 函数的文件名，当CodeType为jar/zip时必须提供该字段，inline和obs不需要提供。
     * 
     * @return codeFilename */
    public String getCodeFilename() {
        return codeFilename;
    }

    public void setCodeFilename(String codeFilename) {
        this.codeFilename = codeFilename;
    }

    public ShowFunctionCodeResponse withCodeSize(Long codeSize) {
        this.codeSize = codeSize;
        return this;
    }

    /** 函数大小，单位：字节。
     * 
     * @return codeSize */
    public Long getCodeSize() {
        return codeSize;
    }

    public void setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
    }

    public ShowFunctionCodeResponse withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /** 函数代码SHA512 hash值，用于判断函数是否变化。
     * 
     * @return digest */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public ShowFunctionCodeResponse withLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /** 函数最后一次更新时间。
     * 
     * @return lastModified */
    public OffsetDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public ShowFunctionCodeResponse withFuncCode(FuncCode funcCode) {
        this.funcCode = funcCode;
        return this;
    }

    public ShowFunctionCodeResponse withFuncCode(Consumer<FuncCode> funcCodeSetter) {
        if (this.funcCode == null) {
            this.funcCode = new FuncCode();
            funcCodeSetter.accept(this.funcCode);
        }

        return this;
    }

    /** Get funcCode
     * 
     * @return funcCode */
    public FuncCode getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(FuncCode funcCode) {
        this.funcCode = funcCode;
    }

    public ShowFunctionCodeResponse withDependList(List<String> dependList) {
        this.dependList = dependList;
        return this;
    }

    public ShowFunctionCodeResponse addDependListItem(String dependListItem) {
        if (this.dependList == null) {
            this.dependList = new ArrayList<>();
        }
        this.dependList.add(dependListItem);
        return this;
    }

    public ShowFunctionCodeResponse withDependList(Consumer<List<String>> dependListSetter) {
        if (this.dependList == null) {
            this.dependList = new ArrayList<>();
        }
        dependListSetter.accept(this.dependList);
        return this;
    }

    /** 依赖id列表
     * 
     * @return dependList */
    public List<String> getDependList() {
        return dependList;
    }

    public void setDependList(List<String> dependList) {
        this.dependList = dependList;
    }

    public ShowFunctionCodeResponse withStrategyConfig(StrategyConfig strategyConfig) {
        this.strategyConfig = strategyConfig;
        return this;
    }

    public ShowFunctionCodeResponse withStrategyConfig(Consumer<StrategyConfig> strategyConfigSetter) {
        if (this.strategyConfig == null) {
            this.strategyConfig = new StrategyConfig();
            strategyConfigSetter.accept(this.strategyConfig);
        }

        return this;
    }

    /** Get strategyConfig
     * 
     * @return strategyConfig */
    public StrategyConfig getStrategyConfig() {
        return strategyConfig;
    }

    public void setStrategyConfig(StrategyConfig strategyConfig) {
        this.strategyConfig = strategyConfig;
    }

    public ShowFunctionCodeResponse withDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public ShowFunctionCodeResponse addDependenciesItem(Dependency dependenciesItem) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    public ShowFunctionCodeResponse withDependencies(Consumer<List<Dependency>> dependenciesSetter) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        dependenciesSetter.accept(this.dependencies);
        return this;
    }

    /** 函数依赖代码包列表。
     * 
     * @return dependencies */
    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFunctionCodeResponse showFunctionCodeResponse = (ShowFunctionCodeResponse) o;
        return Objects.equals(this.funcUrn, showFunctionCodeResponse.funcUrn)
            && Objects.equals(this.funcName, showFunctionCodeResponse.funcName)
            && Objects.equals(this.domainId, showFunctionCodeResponse.domainId)
            && Objects.equals(this.runtime, showFunctionCodeResponse.runtime)
            && Objects.equals(this.codeType, showFunctionCodeResponse.codeType)
            && Objects.equals(this.codeUrl, showFunctionCodeResponse.codeUrl)
            && Objects.equals(this.codeFilename, showFunctionCodeResponse.codeFilename)
            && Objects.equals(this.codeSize, showFunctionCodeResponse.codeSize)
            && Objects.equals(this.digest, showFunctionCodeResponse.digest)
            && Objects.equals(this.lastModified, showFunctionCodeResponse.lastModified)
            && Objects.equals(this.funcCode, showFunctionCodeResponse.funcCode)
            && Objects.equals(this.dependList, showFunctionCodeResponse.dependList)
            && Objects.equals(this.strategyConfig, showFunctionCodeResponse.strategyConfig)
            && Objects.equals(this.dependencies, showFunctionCodeResponse.dependencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcUrn,
            funcName,
            domainId,
            runtime,
            codeType,
            codeUrl,
            codeFilename,
            codeSize,
            digest,
            lastModified,
            funcCode,
            dependList,
            strategyConfig,
            dependencies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFunctionCodeResponse {\n");
        sb.append("    funcUrn: ").append(toIndentedString(funcUrn)).append("\n");
        sb.append("    funcName: ").append(toIndentedString(funcName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
        sb.append("    codeUrl: ").append(toIndentedString(codeUrl)).append("\n");
        sb.append("    codeFilename: ").append(toIndentedString(codeFilename)).append("\n");
        sb.append("    codeSize: ").append(toIndentedString(codeSize)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    funcCode: ").append(toIndentedString(funcCode)).append("\n");
        sb.append("    dependList: ").append(toIndentedString(dependList)).append("\n");
        sb.append("    strategyConfig: ").append(toIndentedString(strategyConfig)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
