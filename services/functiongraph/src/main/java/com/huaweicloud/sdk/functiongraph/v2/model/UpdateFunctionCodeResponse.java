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

/**
 * Response Object
 */
public class UpdateFunctionCodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_urn")

    private String funcUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_name")

    private String funcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    /**
     * FunctionGraph函数的执行环境 Java8: Java语言8版本。 Java11: Java语言11版本。 Java17: Java语言17版本（当前仅支持华北-乌兰察布二零二） Python2.7: Python语言2.7版本。 Python3.6: Pyton语言3.6版本。 Python3.9: Python语言3.9版本。 Python3.10: Python语言3.10版本。 Go1.8: Go语言1.8版本。 Go1.x: Go语言1.x版本。 Node.js6.10: Nodejs语言6.10版本。 Node.js8.10: Nodejs语言8.10版本。 Node.js10.16: Nodejs语言10.16版本。 Node.js12.13: Nodejs语言12.13版本。 Node.js14.18: Nodejs语言14.18版本。 Node.js16.17: Nodejs语言16.17版本。 Node.js18.15: Nodejs语言18.15版本。 C#(.NET Core 2.0): C#语言2.0版本。 C#(.NET Core 2.1): C#语言2.1版本。 C#(.NET Core 3.1): C#语言3.1版本。 C#(.NET Core 6.0): C#语言6.0版本（当前仅支持华北-乌兰察布二零二）。 Custom: 自定义运行时。 PHP7.3: Php语言7.3版本。 Cangjie1.0：仓颉语言1.0版本。 http: HTTP函数。 Custom Image: 自定义镜像函数。
     */
    public static final class RuntimeEnum {

        /**
         * Enum JAVA8 for value: "Java8"
         */
        public static final RuntimeEnum JAVA8 = new RuntimeEnum("Java8");

        /**
         * Enum JAVA11 for value: "Java11"
         */
        public static final RuntimeEnum JAVA11 = new RuntimeEnum("Java11");

        /**
         * Enum JAVA17 for value: "Java17"
         */
        public static final RuntimeEnum JAVA17 = new RuntimeEnum("Java17");

        /**
         * Enum PYTHON2_7 for value: "Python2.7"
         */
        public static final RuntimeEnum PYTHON2_7 = new RuntimeEnum("Python2.7");

        /**
         * Enum PYTHON3_6 for value: "Python3.6"
         */
        public static final RuntimeEnum PYTHON3_6 = new RuntimeEnum("Python3.6");

        /**
         * Enum PYTHON3_9 for value: "Python3.9"
         */
        public static final RuntimeEnum PYTHON3_9 = new RuntimeEnum("Python3.9");

        /**
         * Enum PYTHON3_10 for value: "Python3.10"
         */
        public static final RuntimeEnum PYTHON3_10 = new RuntimeEnum("Python3.10");

        /**
         * Enum GO1_8 for value: "Go1.8"
         */
        public static final RuntimeEnum GO1_8 = new RuntimeEnum("Go1.8");

        /**
         * Enum GO1_X for value: "Go1.x"
         */
        public static final RuntimeEnum GO1_X = new RuntimeEnum("Go1.x");

        /**
         * Enum NODE_JS6_10 for value: "Node.js6.10"
         */
        public static final RuntimeEnum NODE_JS6_10 = new RuntimeEnum("Node.js6.10");

        /**
         * Enum NODE_JS8_10 for value: "Node.js8.10"
         */
        public static final RuntimeEnum NODE_JS8_10 = new RuntimeEnum("Node.js8.10");

        /**
         * Enum NODE_JS10_16 for value: "Node.js10.16"
         */
        public static final RuntimeEnum NODE_JS10_16 = new RuntimeEnum("Node.js10.16");

        /**
         * Enum NODE_JS12_13 for value: "Node.js12.13"
         */
        public static final RuntimeEnum NODE_JS12_13 = new RuntimeEnum("Node.js12.13");

        /**
         * Enum NODE_JS14_18 for value: "Node.js14.18"
         */
        public static final RuntimeEnum NODE_JS14_18 = new RuntimeEnum("Node.js14.18");

        /**
         * Enum NODE_JS16_17 for value: "Node.js16.17"
         */
        public static final RuntimeEnum NODE_JS16_17 = new RuntimeEnum("Node.js16.17");

        /**
         * Enum NODE_JS18_15 for value: "Node.js18.15"
         */
        public static final RuntimeEnum NODE_JS18_15 = new RuntimeEnum("Node.js18.15");

        /**
         * Enum C_NET_CORE_2_0_ for value: "C#(.NET Core 2.0)"
         */
        public static final RuntimeEnum C_NET_CORE_2_0_ = new RuntimeEnum("C#(.NET Core 2.0)");

        /**
         * Enum C_NET_CORE_2_1_ for value: "C#(.NET Core 2.1)"
         */
        public static final RuntimeEnum C_NET_CORE_2_1_ = new RuntimeEnum("C#(.NET Core 2.1)");

        /**
         * Enum C_NET_CORE_3_1_ for value: "C#(.NET Core 3.1)"
         */
        public static final RuntimeEnum C_NET_CORE_3_1_ = new RuntimeEnum("C#(.NET Core 3.1)");

        /**
         * Enum C_NET_CORE_6_0_ for value: "C#(.NET Core 6.0)"
         */
        public static final RuntimeEnum C_NET_CORE_6_0_ = new RuntimeEnum("C#(.NET Core 6.0)");

        /**
         * Enum CUSTOM for value: "Custom"
         */
        public static final RuntimeEnum CUSTOM = new RuntimeEnum("Custom");

        /**
         * Enum PHP7_3 for value: "PHP7.3"
         */
        public static final RuntimeEnum PHP7_3 = new RuntimeEnum("PHP7.3");

        /**
         * Enum CANGJIE1_0 for value: "Cangjie1.0"
         */
        public static final RuntimeEnum CANGJIE1_0 = new RuntimeEnum("Cangjie1.0");

        /**
         * Enum HTTP for value: "http"
         */
        public static final RuntimeEnum HTTP = new RuntimeEnum("http");

        /**
         * Enum CUSTOM_IMAGE for value: "Custom Image"
         */
        public static final RuntimeEnum CUSTOM_IMAGE = new RuntimeEnum("Custom Image");

        private static final Map<String, RuntimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuntimeEnum> createStaticFields() {
            Map<String, RuntimeEnum> map = new HashMap<>();
            map.put("Java8", JAVA8);
            map.put("Java11", JAVA11);
            map.put("Java17", JAVA17);
            map.put("Python2.7", PYTHON2_7);
            map.put("Python3.6", PYTHON3_6);
            map.put("Python3.9", PYTHON3_9);
            map.put("Python3.10", PYTHON3_10);
            map.put("Go1.8", GO1_8);
            map.put("Go1.x", GO1_X);
            map.put("Node.js6.10", NODE_JS6_10);
            map.put("Node.js8.10", NODE_JS8_10);
            map.put("Node.js10.16", NODE_JS10_16);
            map.put("Node.js12.13", NODE_JS12_13);
            map.put("Node.js14.18", NODE_JS14_18);
            map.put("Node.js16.17", NODE_JS16_17);
            map.put("Node.js18.15", NODE_JS18_15);
            map.put("C#(.NET Core 2.0)", C_NET_CORE_2_0_);
            map.put("C#(.NET Core 2.1)", C_NET_CORE_2_1_);
            map.put("C#(.NET Core 3.1)", C_NET_CORE_3_1_);
            map.put("C#(.NET Core 6.0)", C_NET_CORE_6_0_);
            map.put("Custom", CUSTOM);
            map.put("PHP7.3", PHP7_3);
            map.put("Cangjie1.0", CANGJIE1_0);
            map.put("http", HTTP);
            map.put("Custom Image", CUSTOM_IMAGE);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuntimeEnum(value));
        }

        public static RuntimeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "depend_version_list")

    private List<String> dependVersionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_config")

    private StrategyConfig strategyConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependencies")

    private List<Dependency> dependencies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_encrypt_kms_key_id")

    private String codeEncryptKmsKeyId;

    public UpdateFunctionCodeResponse withFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
        return this;
    }

    /**
     * 函数的URN（Uniform Resource Name），唯一标识函数。
     * @return funcUrn
     */
    public String getFuncUrn() {
        return funcUrn;
    }

    public void setFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
    }

    public UpdateFunctionCodeResponse withFuncName(String funcName) {
        this.funcName = funcName;
        return this;
    }

    /**
     * 函数名称。
     * @return funcName
     */
    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public UpdateFunctionCodeResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名id。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UpdateFunctionCodeResponse withRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * FunctionGraph函数的执行环境 Java8: Java语言8版本。 Java11: Java语言11版本。 Java17: Java语言17版本（当前仅支持华北-乌兰察布二零二） Python2.7: Python语言2.7版本。 Python3.6: Pyton语言3.6版本。 Python3.9: Python语言3.9版本。 Python3.10: Python语言3.10版本。 Go1.8: Go语言1.8版本。 Go1.x: Go语言1.x版本。 Node.js6.10: Nodejs语言6.10版本。 Node.js8.10: Nodejs语言8.10版本。 Node.js10.16: Nodejs语言10.16版本。 Node.js12.13: Nodejs语言12.13版本。 Node.js14.18: Nodejs语言14.18版本。 Node.js16.17: Nodejs语言16.17版本。 Node.js18.15: Nodejs语言18.15版本。 C#(.NET Core 2.0): C#语言2.0版本。 C#(.NET Core 2.1): C#语言2.1版本。 C#(.NET Core 3.1): C#语言3.1版本。 C#(.NET Core 6.0): C#语言6.0版本（当前仅支持华北-乌兰察布二零二）。 Custom: 自定义运行时。 PHP7.3: Php语言7.3版本。 Cangjie1.0：仓颉语言1.0版本。 http: HTTP函数。 Custom Image: 自定义镜像函数。
     * @return runtime
     */
    public RuntimeEnum getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
    }

    public UpdateFunctionCodeResponse withCodeType(CodeTypeEnum codeType) {
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

    public UpdateFunctionCodeResponse withCodeUrl(String codeUrl) {
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

    public UpdateFunctionCodeResponse withCodeFilename(String codeFilename) {
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

    public UpdateFunctionCodeResponse withCodeSize(Long codeSize) {
        this.codeSize = codeSize;
        return this;
    }

    /**
     * 函数大小，单位：字节。
     * @return codeSize
     */
    public Long getCodeSize() {
        return codeSize;
    }

    public void setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
    }

    public UpdateFunctionCodeResponse withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * 函数代码SHA512 hash值，用于判断函数是否变化。
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public UpdateFunctionCodeResponse withLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 函数最后一次更新时间。
     * @return lastModified
     */
    public OffsetDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public UpdateFunctionCodeResponse withFuncCode(FuncCode funcCode) {
        this.funcCode = funcCode;
        return this;
    }

    public UpdateFunctionCodeResponse withFuncCode(Consumer<FuncCode> funcCodeSetter) {
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

    public UpdateFunctionCodeResponse withDependList(List<String> dependList) {
        this.dependList = dependList;
        return this;
    }

    public UpdateFunctionCodeResponse addDependListItem(String dependListItem) {
        if (this.dependList == null) {
            this.dependList = new ArrayList<>();
        }
        this.dependList.add(dependListItem);
        return this;
    }

    public UpdateFunctionCodeResponse withDependList(Consumer<List<String>> dependListSetter) {
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

    public UpdateFunctionCodeResponse withDependVersionList(List<String> dependVersionList) {
        this.dependVersionList = dependVersionList;
        return this;
    }

    public UpdateFunctionCodeResponse addDependVersionListItem(String dependVersionListItem) {
        if (this.dependVersionList == null) {
            this.dependVersionList = new ArrayList<>();
        }
        this.dependVersionList.add(dependVersionListItem);
        return this;
    }

    public UpdateFunctionCodeResponse withDependVersionList(Consumer<List<String>> dependVersionListSetter) {
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

    public UpdateFunctionCodeResponse withStrategyConfig(StrategyConfig strategyConfig) {
        this.strategyConfig = strategyConfig;
        return this;
    }

    public UpdateFunctionCodeResponse withStrategyConfig(Consumer<StrategyConfig> strategyConfigSetter) {
        if (this.strategyConfig == null) {
            this.strategyConfig = new StrategyConfig();
            strategyConfigSetter.accept(this.strategyConfig);
        }

        return this;
    }

    /**
     * Get strategyConfig
     * @return strategyConfig
     */
    public StrategyConfig getStrategyConfig() {
        return strategyConfig;
    }

    public void setStrategyConfig(StrategyConfig strategyConfig) {
        this.strategyConfig = strategyConfig;
    }

    public UpdateFunctionCodeResponse withDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public UpdateFunctionCodeResponse addDependenciesItem(Dependency dependenciesItem) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    public UpdateFunctionCodeResponse withDependencies(Consumer<List<Dependency>> dependenciesSetter) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        dependenciesSetter.accept(this.dependencies);
        return this;
    }

    /**
     * 函数依赖代码包列表。
     * @return dependencies
     */
    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    public UpdateFunctionCodeResponse withCodeEncryptKmsKeyId(String codeEncryptKmsKeyId) {
        this.codeEncryptKmsKeyId = codeEncryptKmsKeyId;
        return this;
    }

    /**
     * 用于用户代码加密的kms主秘钥ID。
     * @return codeEncryptKmsKeyId
     */
    public String getCodeEncryptKmsKeyId() {
        return codeEncryptKmsKeyId;
    }

    public void setCodeEncryptKmsKeyId(String codeEncryptKmsKeyId) {
        this.codeEncryptKmsKeyId = codeEncryptKmsKeyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFunctionCodeResponse that = (UpdateFunctionCodeResponse) obj;
        return Objects.equals(this.funcUrn, that.funcUrn) && Objects.equals(this.funcName, that.funcName)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.runtime, that.runtime)
            && Objects.equals(this.codeType, that.codeType) && Objects.equals(this.codeUrl, that.codeUrl)
            && Objects.equals(this.codeFilename, that.codeFilename) && Objects.equals(this.codeSize, that.codeSize)
            && Objects.equals(this.digest, that.digest) && Objects.equals(this.lastModified, that.lastModified)
            && Objects.equals(this.funcCode, that.funcCode) && Objects.equals(this.dependList, that.dependList)
            && Objects.equals(this.dependVersionList, that.dependVersionList)
            && Objects.equals(this.strategyConfig, that.strategyConfig)
            && Objects.equals(this.dependencies, that.dependencies)
            && Objects.equals(this.codeEncryptKmsKeyId, that.codeEncryptKmsKeyId);
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
            dependVersionList,
            strategyConfig,
            dependencies,
            codeEncryptKmsKeyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFunctionCodeResponse {\n");
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
        sb.append("    dependVersionList: ").append(toIndentedString(dependVersionList)).append("\n");
        sb.append("    strategyConfig: ").append(toIndentedString(strategyConfig)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    codeEncryptKmsKeyId: ").append(toIndentedString(codeEncryptKmsKeyId)).append("\n");
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
