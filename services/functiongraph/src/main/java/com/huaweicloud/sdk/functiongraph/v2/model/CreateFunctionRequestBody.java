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
 * 函数属性结构体。
 */
public class CreateFunctionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_name")

    private String funcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package")

    private String _package;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handler")

    private String handler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_version_list")

    private List<String> dependVersionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_vpc")

    private FuncVpc funcVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_size")

    private Integer memorySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_memory")

    private Integer gpuMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_type")

    private String gpuType;

    /**
     * 函数代码类型，取值有5种。 inline: UI在线编辑代码。 zip: 函数代码为zip包。 obs: 函数代码来源于obs存储。 jar: 函数代码为jar包，主要针对Java函数。 Custom-Image-Swr: 函数代码来源与SWR自定义镜像。 创建自定义镜像函数此参数非必填，其他类型函数此参数必填。
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
    @JsonProperty(value = "custom_image")

    private CustomImage customImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted_user_data")

    private String encryptedUserData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xrole")

    private String xrole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_xrole")

    private String appXrole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_code")

    private FuncCode funcCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_config")

    private MountConfig mountConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initializer_handler")

    private String initializerHandler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initializer_timeout")

    private Integer initializerTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_stop_handler")

    private String preStopHandler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_stop_timeout")

    private Integer preStopTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 函数版本；部分局点只支持v1函数，缺省值则为v1
     */
    public static final class TypeEnum {

        /**
         * Enum V1 for value: "v1"
         */
        public static final TypeEnum V1 = new TypeEnum("v1");

        /**
         * Enum V2 for value: "v2"
         */
        public static final TypeEnum V2 = new TypeEnum("v2");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("v1", V1);
            map.put("v2", V2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_config")

    private FuncLogConfig logConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_controller")

    private NetworkControlConfig networkController;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_stateful_function")

    private Boolean isStatefulFunction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dynamic_memory")

    private Boolean enableDynamicMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_lts_log")

    private Boolean enableLtsLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_custom_tag")

    private Map<String, String> ltsCustomTag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data_encrypt_kms_key_id")

    private String userDataEncryptKmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_encrypt_kms_key_id")

    private String codeEncryptKmsKeyId;

    public CreateFunctionRequestBody withFuncName(String funcName) {
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

    public CreateFunctionRequestBody withPackage(String _package) {
        this._package = _package;
        return this;
    }

    /**
     * 函数所属的分组Package，用于用户针对函数的自定义分组。
     * @return _package
     */
    public String getPackage() {
        return _package;
    }

    public void setPackage(String _package) {
        this._package = _package;
    }

    public CreateFunctionRequestBody withRuntime(RuntimeEnum runtime) {
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

    public CreateFunctionRequestBody withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 函数执行超时时间，超时函数将被强行停止，范围3～259200秒。
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public CreateFunctionRequestBody withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * 函数执行入口 规则：xx.xx，必须包含“. ”；自定义镜像函数handler为“-” 举例：对于node.js函数：myfunction.handler，则表示函数的文件名为myfunction.js，执行的入口函数名为handler。
     * @return handler
     */
    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public CreateFunctionRequestBody withDependVersionList(List<String> dependVersionList) {
        this.dependVersionList = dependVersionList;
        return this;
    }

    public CreateFunctionRequestBody addDependVersionListItem(String dependVersionListItem) {
        if (this.dependVersionList == null) {
            this.dependVersionList = new ArrayList<>();
        }
        this.dependVersionList.add(dependVersionListItem);
        return this;
    }

    public CreateFunctionRequestBody withDependVersionList(Consumer<List<String>> dependVersionListSetter) {
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

    public CreateFunctionRequestBody withFuncVpc(FuncVpc funcVpc) {
        this.funcVpc = funcVpc;
        return this;
    }

    public CreateFunctionRequestBody withFuncVpc(Consumer<FuncVpc> funcVpcSetter) {
        if (this.funcVpc == null) {
            this.funcVpc = new FuncVpc();
            funcVpcSetter.accept(this.funcVpc);
        }

        return this;
    }

    /**
     * Get funcVpc
     * @return funcVpc
     */
    public FuncVpc getFuncVpc() {
        return funcVpc;
    }

    public void setFuncVpc(FuncVpc funcVpc) {
        this.funcVpc = funcVpc;
    }

    public CreateFunctionRequestBody withMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * 函数消耗的内存。 单位M。 取值范围为：128、256、512、768、1024、1280、1536、1792、2048、2560、3072、3584、4096。 最小值为128，最大值为4096。
     * @return memorySize
     */
    public Integer getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    public CreateFunctionRequestBody withGpuMemory(Integer gpuMemory) {
        this.gpuMemory = gpuMemory;
        return this;
    }

    /**
     * 函数消耗的显存，只支持自定义运行时与自定义镜像函数配置GPU。 单位MB。 取值范围为：1024、2048、3072、4096、5120、6144、7168、8192、9216、10240、11264、12288、13312、14336、15360、16384。 最小值为1024，最大值为16384。
     * @return gpuMemory
     */
    public Integer getGpuMemory() {
        return gpuMemory;
    }

    public void setGpuMemory(Integer gpuMemory) {
        this.gpuMemory = gpuMemory;
    }

    public CreateFunctionRequestBody withGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    /**
     * 显卡类型。
     * @return gpuType
     */
    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public CreateFunctionRequestBody withCodeType(CodeTypeEnum codeType) {
        this.codeType = codeType;
        return this;
    }

    /**
     * 函数代码类型，取值有5种。 inline: UI在线编辑代码。 zip: 函数代码为zip包。 obs: 函数代码来源于obs存储。 jar: 函数代码为jar包，主要针对Java函数。 Custom-Image-Swr: 函数代码来源与SWR自定义镜像。 创建自定义镜像函数此参数非必填，其他类型函数此参数必填。
     * @return codeType
     */
    public CodeTypeEnum getCodeType() {
        return codeType;
    }

    public void setCodeType(CodeTypeEnum codeType) {
        this.codeType = codeType;
    }

    public CreateFunctionRequestBody withCodeUrl(String codeUrl) {
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

    public CreateFunctionRequestBody withCodeFilename(String codeFilename) {
        this.codeFilename = codeFilename;
        return this;
    }

    /**
     * 函数的文件名，当CodeType为jar/zip时必须提供该字段，CodeType为其他值时不需要提供。
     * @return codeFilename
     */
    public String getCodeFilename() {
        return codeFilename;
    }

    public void setCodeFilename(String codeFilename) {
        this.codeFilename = codeFilename;
    }

    public CreateFunctionRequestBody withCustomImage(CustomImage customImage) {
        this.customImage = customImage;
        return this;
    }

    public CreateFunctionRequestBody withCustomImage(Consumer<CustomImage> customImageSetter) {
        if (this.customImage == null) {
            this.customImage = new CustomImage();
            customImageSetter.accept(this.customImage);
        }

        return this;
    }

    /**
     * Get customImage
     * @return customImage
     */
    public CustomImage getCustomImage() {
        return customImage;
    }

    public void setCustomImage(CustomImage customImage) {
        this.customImage = customImage;
    }

    public CreateFunctionRequestBody withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户自定义的name/value信息。 在函数中使用的参数。 举例：如函数要访问某个主机，可以设置自定义参数：Host={host_ip}，最多定义20个，总长度不超过4KB。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public CreateFunctionRequestBody withEncryptedUserData(String encryptedUserData) {
        this.encryptedUserData = encryptedUserData;
        return this;
    }

    /**
     * 用户自定义的name/value信息，用于需要加密的配置。举例：如配置加密密码，可以设置自定义参数：password={1234}，最多定义20个，总长度不超过4KB。
     * @return encryptedUserData
     */
    public String getEncryptedUserData() {
        return encryptedUserData;
    }

    public void setEncryptedUserData(String encryptedUserData) {
        this.encryptedUserData = encryptedUserData;
    }

    public CreateFunctionRequestBody withXrole(String xrole) {
        this.xrole = xrole;
        return this;
    }

    /**
     * 函数配置委托。需要IAM支持，并在IAM界面创建委托，当函数需要访问其他服务时，必须提供该字段。配置后用户可以通过函数执行入口方法中的context参数获取具有委托中权限的token、ak、sk，用于访问其他云服务。如果用户函数不访问任何云服务，则不用提供委托名称。
     * @return xrole
     */
    public String getXrole() {
        return xrole;
    }

    public void setXrole(String xrole) {
        this.xrole = xrole;
    }

    public CreateFunctionRequestBody withAppXrole(String appXrole) {
        this.appXrole = appXrole;
        return this;
    }

    /**
     * 函数执行委托。可为函数执行单独配置执行委托，这将减小不必要的性能损耗；不单独配置执行委托时，函数执行和函数配置将使用同一委托。
     * @return appXrole
     */
    public String getAppXrole() {
        return appXrole;
    }

    public void setAppXrole(String appXrole) {
        this.appXrole = appXrole;
    }

    public CreateFunctionRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 函数描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateFunctionRequestBody withFuncCode(FuncCode funcCode) {
        this.funcCode = funcCode;
        return this;
    }

    public CreateFunctionRequestBody withFuncCode(Consumer<FuncCode> funcCodeSetter) {
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

    public CreateFunctionRequestBody withMountConfig(MountConfig mountConfig) {
        this.mountConfig = mountConfig;
        return this;
    }

    public CreateFunctionRequestBody withMountConfig(Consumer<MountConfig> mountConfigSetter) {
        if (this.mountConfig == null) {
            this.mountConfig = new MountConfig();
            mountConfigSetter.accept(this.mountConfig);
        }

        return this;
    }

    /**
     * Get mountConfig
     * @return mountConfig
     */
    public MountConfig getMountConfig() {
        return mountConfig;
    }

    public void setMountConfig(MountConfig mountConfig) {
        this.mountConfig = mountConfig;
    }

    public CreateFunctionRequestBody withInitializerHandler(String initializerHandler) {
        this.initializerHandler = initializerHandler;
        return this;
    }

    /**
     * 函数初始化入口，规则：xx.xx，必须包含“. ”。当配置初始化函数时，此参数必填。 举例：对于node.js函数：myfunction.initializer，则表示函数的文件名为myfunction.js，初始化的入口函数名为initializer。
     * @return initializerHandler
     */
    public String getInitializerHandler() {
        return initializerHandler;
    }

    public void setInitializerHandler(String initializerHandler) {
        this.initializerHandler = initializerHandler;
    }

    public CreateFunctionRequestBody withInitializerTimeout(Integer initializerTimeout) {
        this.initializerTimeout = initializerTimeout;
        return this;
    }

    /**
     * 初始化超时时间，超时函数将被强行停止，范围1～300秒。当配置初始化函数时，此参数必填。
     * @return initializerTimeout
     */
    public Integer getInitializerTimeout() {
        return initializerTimeout;
    }

    public void setInitializerTimeout(Integer initializerTimeout) {
        this.initializerTimeout = initializerTimeout;
    }

    public CreateFunctionRequestBody withPreStopHandler(String preStopHandler) {
        this.preStopHandler = preStopHandler;
        return this;
    }

    /**
     * 函数预停止函数的入口，规则：xx.xx，必须包含“. ”。 举例：对于node.js函数：myfunction.pre_stop_handler，则表示函数的文件名为myfunction.js，初始化的入口函数名为pre_stop_handler。
     * @return preStopHandler
     */
    public String getPreStopHandler() {
        return preStopHandler;
    }

    public void setPreStopHandler(String preStopHandler) {
        this.preStopHandler = preStopHandler;
    }

    public CreateFunctionRequestBody withPreStopTimeout(Integer preStopTimeout) {
        this.preStopTimeout = preStopTimeout;
        return this;
    }

    /**
     * 初始化超时时间，超时函数将被强行停止，范围1～90秒。
     * @return preStopTimeout
     */
    public Integer getPreStopTimeout() {
        return preStopTimeout;
    }

    public void setPreStopTimeout(Integer preStopTimeout) {
        this.preStopTimeout = preStopTimeout;
    }

    public CreateFunctionRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，在企业用户创建函数时必填。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateFunctionRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 函数版本；部分局点只支持v1函数，缺省值则为v1
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateFunctionRequestBody withLogConfig(FuncLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }

    public CreateFunctionRequestBody withLogConfig(Consumer<FuncLogConfig> logConfigSetter) {
        if (this.logConfig == null) {
            this.logConfig = new FuncLogConfig();
            logConfigSetter.accept(this.logConfig);
        }

        return this;
    }

    /**
     * Get logConfig
     * @return logConfig
     */
    public FuncLogConfig getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(FuncLogConfig logConfig) {
        this.logConfig = logConfig;
    }

    public CreateFunctionRequestBody withNetworkController(NetworkControlConfig networkController) {
        this.networkController = networkController;
        return this;
    }

    public CreateFunctionRequestBody withNetworkController(Consumer<NetworkControlConfig> networkControllerSetter) {
        if (this.networkController == null) {
            this.networkController = new NetworkControlConfig();
            networkControllerSetter.accept(this.networkController);
        }

        return this;
    }

    /**
     * Get networkController
     * @return networkController
     */
    public NetworkControlConfig getNetworkController() {
        return networkController;
    }

    public void setNetworkController(NetworkControlConfig networkController) {
        this.networkController = networkController;
    }

    public CreateFunctionRequestBody withIsStatefulFunction(Boolean isStatefulFunction) {
        this.isStatefulFunction = isStatefulFunction;
        return this;
    }

    /**
     * 是否支持有状态，如果需要支持，需要固定传参为true，v2版本支持
     * @return isStatefulFunction
     */
    public Boolean getIsStatefulFunction() {
        return isStatefulFunction;
    }

    public void setIsStatefulFunction(Boolean isStatefulFunction) {
        this.isStatefulFunction = isStatefulFunction;
    }

    public CreateFunctionRequestBody withEnableDynamicMemory(Boolean enableDynamicMemory) {
        this.enableDynamicMemory = enableDynamicMemory;
        return this;
    }

    /**
     * 是否启动动态内存配置
     * @return enableDynamicMemory
     */
    public Boolean getEnableDynamicMemory() {
        return enableDynamicMemory;
    }

    public void setEnableDynamicMemory(Boolean enableDynamicMemory) {
        this.enableDynamicMemory = enableDynamicMemory;
    }

    public CreateFunctionRequestBody withEnableLtsLog(Boolean enableLtsLog) {
        this.enableLtsLog = enableLtsLog;
        return this;
    }

    /**
     * 是否开启日志，缺省值为false。创建函数时，若此开关为true，且未传入log_config，则由FunctionGraph自动创建日志组日志流。
     * @return enableLtsLog
     */
    public Boolean getEnableLtsLog() {
        return enableLtsLog;
    }

    public void setEnableLtsLog(Boolean enableLtsLog) {
        this.enableLtsLog = enableLtsLog;
    }

    public CreateFunctionRequestBody withLtsCustomTag(Map<String, String> ltsCustomTag) {
        this.ltsCustomTag = ltsCustomTag;
        return this;
    }

    public CreateFunctionRequestBody putLtsCustomTagItem(String key, String ltsCustomTagItem) {
        if (this.ltsCustomTag == null) {
            this.ltsCustomTag = new HashMap<>();
        }
        this.ltsCustomTag.put(key, ltsCustomTagItem);
        return this;
    }

    public CreateFunctionRequestBody withLtsCustomTag(Consumer<Map<String, String>> ltsCustomTagSetter) {
        if (this.ltsCustomTag == null) {
            this.ltsCustomTag = new HashMap<>();
        }
        ltsCustomTagSetter.accept(this.ltsCustomTag);
        return this;
    }

    /**
     * 自定义日志标签。函数执行时，可以按照自定义标签配置上报标签到云日志服务(LTS)，用户可以通过标签对日志进行过滤筛选。
     * @return ltsCustomTag
     */
    public Map<String, String> getLtsCustomTag() {
        return ltsCustomTag;
    }

    public void setLtsCustomTag(Map<String, String> ltsCustomTag) {
        this.ltsCustomTag = ltsCustomTag;
    }

    public CreateFunctionRequestBody withUserDataEncryptKmsKeyId(String userDataEncryptKmsKeyId) {
        this.userDataEncryptKmsKeyId = userDataEncryptKmsKeyId;
        return this;
    }

    /**
     * 用于环境变量加密的kms主秘钥ID。
     * @return userDataEncryptKmsKeyId
     */
    public String getUserDataEncryptKmsKeyId() {
        return userDataEncryptKmsKeyId;
    }

    public void setUserDataEncryptKmsKeyId(String userDataEncryptKmsKeyId) {
        this.userDataEncryptKmsKeyId = userDataEncryptKmsKeyId;
    }

    public CreateFunctionRequestBody withCodeEncryptKmsKeyId(String codeEncryptKmsKeyId) {
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
        CreateFunctionRequestBody that = (CreateFunctionRequestBody) obj;
        return Objects.equals(this.funcName, that.funcName) && Objects.equals(this._package, that._package)
            && Objects.equals(this.runtime, that.runtime) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.handler, that.handler)
            && Objects.equals(this.dependVersionList, that.dependVersionList)
            && Objects.equals(this.funcVpc, that.funcVpc) && Objects.equals(this.memorySize, that.memorySize)
            && Objects.equals(this.gpuMemory, that.gpuMemory) && Objects.equals(this.gpuType, that.gpuType)
            && Objects.equals(this.codeType, that.codeType) && Objects.equals(this.codeUrl, that.codeUrl)
            && Objects.equals(this.codeFilename, that.codeFilename)
            && Objects.equals(this.customImage, that.customImage) && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.encryptedUserData, that.encryptedUserData) && Objects.equals(this.xrole, that.xrole)
            && Objects.equals(this.appXrole, that.appXrole) && Objects.equals(this.description, that.description)
            && Objects.equals(this.funcCode, that.funcCode) && Objects.equals(this.mountConfig, that.mountConfig)
            && Objects.equals(this.initializerHandler, that.initializerHandler)
            && Objects.equals(this.initializerTimeout, that.initializerTimeout)
            && Objects.equals(this.preStopHandler, that.preStopHandler)
            && Objects.equals(this.preStopTimeout, that.preStopTimeout)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.logConfig, that.logConfig)
            && Objects.equals(this.networkController, that.networkController)
            && Objects.equals(this.isStatefulFunction, that.isStatefulFunction)
            && Objects.equals(this.enableDynamicMemory, that.enableDynamicMemory)
            && Objects.equals(this.enableLtsLog, that.enableLtsLog)
            && Objects.equals(this.ltsCustomTag, that.ltsCustomTag)
            && Objects.equals(this.userDataEncryptKmsKeyId, that.userDataEncryptKmsKeyId)
            && Objects.equals(this.codeEncryptKmsKeyId, that.codeEncryptKmsKeyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcName,
            _package,
            runtime,
            timeout,
            handler,
            dependVersionList,
            funcVpc,
            memorySize,
            gpuMemory,
            gpuType,
            codeType,
            codeUrl,
            codeFilename,
            customImage,
            userData,
            encryptedUserData,
            xrole,
            appXrole,
            description,
            funcCode,
            mountConfig,
            initializerHandler,
            initializerTimeout,
            preStopHandler,
            preStopTimeout,
            enterpriseProjectId,
            type,
            logConfig,
            networkController,
            isStatefulFunction,
            enableDynamicMemory,
            enableLtsLog,
            ltsCustomTag,
            userDataEncryptKmsKeyId,
            codeEncryptKmsKeyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFunctionRequestBody {\n");
        sb.append("    funcName: ").append(toIndentedString(funcName)).append("\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
        sb.append("    dependVersionList: ").append(toIndentedString(dependVersionList)).append("\n");
        sb.append("    funcVpc: ").append(toIndentedString(funcVpc)).append("\n");
        sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
        sb.append("    gpuMemory: ").append(toIndentedString(gpuMemory)).append("\n");
        sb.append("    gpuType: ").append(toIndentedString(gpuType)).append("\n");
        sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
        sb.append("    codeUrl: ").append(toIndentedString(codeUrl)).append("\n");
        sb.append("    codeFilename: ").append(toIndentedString(codeFilename)).append("\n");
        sb.append("    customImage: ").append(toIndentedString(customImage)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    encryptedUserData: ").append(toIndentedString(encryptedUserData)).append("\n");
        sb.append("    xrole: ").append(toIndentedString(xrole)).append("\n");
        sb.append("    appXrole: ").append(toIndentedString(appXrole)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    funcCode: ").append(toIndentedString(funcCode)).append("\n");
        sb.append("    mountConfig: ").append(toIndentedString(mountConfig)).append("\n");
        sb.append("    initializerHandler: ").append(toIndentedString(initializerHandler)).append("\n");
        sb.append("    initializerTimeout: ").append(toIndentedString(initializerTimeout)).append("\n");
        sb.append("    preStopHandler: ").append(toIndentedString(preStopHandler)).append("\n");
        sb.append("    preStopTimeout: ").append(toIndentedString(preStopTimeout)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    logConfig: ").append(toIndentedString(logConfig)).append("\n");
        sb.append("    networkController: ").append(toIndentedString(networkController)).append("\n");
        sb.append("    isStatefulFunction: ").append(toIndentedString(isStatefulFunction)).append("\n");
        sb.append("    enableDynamicMemory: ").append(toIndentedString(enableDynamicMemory)).append("\n");
        sb.append("    enableLtsLog: ").append(toIndentedString(enableLtsLog)).append("\n");
        sb.append("    ltsCustomTag: ").append(toIndentedString(ltsCustomTag)).append("\n");
        sb.append("    userDataEncryptKmsKeyId: ").append(toIndentedString(userDataEncryptKmsKeyId)).append("\n");
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
