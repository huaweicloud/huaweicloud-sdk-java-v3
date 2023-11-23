package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListFunctionVersionResult
 */
public class ListFunctionVersionResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_urn")

    private String funcUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_name")

    private String funcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package")

    private String _package;

    /**
     * FunctionGraph函数的执行环境 Python2.7: Python语言2.7版本。 Python3.6: Pyton语言3.6版本。 Python3.9: Python语言3.9版本。 Go1.8: Go语言1.8版本。 Go1.x: Go语言1.x版本。 Java8: Java语言8版本。 Java11: Java语言11版本。 Node.js6.10: Nodejs语言6.10版本。 Node.js8.10: Nodejs语言8.10版本。 Node.js10.16: Nodejs语言10.16版本。 Node.js12.13: Nodejs语言12.13版本。 Node.js14.18: Nodejs语言14.18版本。 C#(.NET Core 2.0): C#语言2.0版本。 C#(.NET Core 2.1): C#语言2.1版本。 C#(.NET Core 3.1): C#语言3.1版本。 Custom: 自定义运行时。 PHP7.3: Php语言7.3版本。 http: HTTP函数。
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
         * Enum PYTHON2_7 for value: "Python2.7"
         */
        public static final RuntimeEnum PYTHON2_7 = new RuntimeEnum("Python2.7");

        /**
         * Enum PYTHON3_6 for value: "Python3.6"
         */
        public static final RuntimeEnum PYTHON3_6 = new RuntimeEnum("Python3.6");

        /**
         * Enum GO1_8 for value: "Go1.8"
         */
        public static final RuntimeEnum GO1_8 = new RuntimeEnum("Go1.8");

        /**
         * Enum GO1_X for value: "Go1.x"
         */
        public static final RuntimeEnum GO1_X = new RuntimeEnum("Go1.x");

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
         * Enum PHP7_3 for value: "PHP7.3"
         */
        public static final RuntimeEnum PHP7_3 = new RuntimeEnum("PHP7.3");

        /**
         * Enum PYTHON3_9 for value: "Python3.9"
         */
        public static final RuntimeEnum PYTHON3_9 = new RuntimeEnum("Python3.9");

        /**
         * Enum CUSTOM for value: "Custom"
         */
        public static final RuntimeEnum CUSTOM = new RuntimeEnum("Custom");

        /**
         * Enum HTTP for value: "http"
         */
        public static final RuntimeEnum HTTP = new RuntimeEnum("http");

        private static final Map<String, RuntimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuntimeEnum> createStaticFields() {
            Map<String, RuntimeEnum> map = new HashMap<>();
            map.put("Java8", JAVA8);
            map.put("Java11", JAVA11);
            map.put("Node.js6.10", NODE_JS6_10);
            map.put("Node.js8.10", NODE_JS8_10);
            map.put("Node.js10.16", NODE_JS10_16);
            map.put("Node.js12.13", NODE_JS12_13);
            map.put("Node.js14.18", NODE_JS14_18);
            map.put("Python2.7", PYTHON2_7);
            map.put("Python3.6", PYTHON3_6);
            map.put("Go1.8", GO1_8);
            map.put("Go1.x", GO1_X);
            map.put("C#(.NET Core 2.0)", C_NET_CORE_2_0_);
            map.put("C#(.NET Core 2.1)", C_NET_CORE_2_1_);
            map.put("C#(.NET Core 3.1)", C_NET_CORE_3_1_);
            map.put("PHP7.3", PHP7_3);
            map.put("Python3.9", PYTHON3_9);
            map.put("Custom", CUSTOM);
            map.put("http", HTTP);
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
    @JsonProperty(value = "memory_size")

    private Integer memorySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    /**
     * 函数代码类型，取值有4种。 inline: UI在线编辑代码。 zip: 函数代码为zip包。 obs: 函数代码来源于obs存储。 jar: 函数代码为jar包，主要针对Java函数。
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
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted_user_data")

    private String encryptedUserData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest")

    private String digest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xrole")

    private String xrole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_xrole")

    private String appXrole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private OffsetDateTime lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_vpc_id")

    private String funcVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrency")

    private Integer concurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrent_num")

    private Integer concurrentNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_config")

    private StrategyConfig strategyConfig;

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
    @JsonProperty(value = "long_time")

    private Boolean longTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_async_config")

    private FunctionAsyncConfig functionAsyncConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_cloud_debug")

    private String enableCloudDebug;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dynamic_memory")

    private Boolean enableDynamicMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_stateful_function")

    private Boolean isStatefulFunction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_auth_in_header")

    private Boolean enableAuthInHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_image")

    private CustomImage customImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved_instance_idle_mode")

    private Boolean reservedInstanceIdleMode;

    public ListFunctionVersionResult withFuncUrn(String funcUrn) {
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

    public ListFunctionVersionResult withFuncName(String funcName) {
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

    public ListFunctionVersionResult withDomainId(String domainId) {
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

    public ListFunctionVersionResult withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 租户的project id。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListFunctionVersionResult withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 租户的project name。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ListFunctionVersionResult withPackage(String _package) {
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

    public ListFunctionVersionResult withRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * FunctionGraph函数的执行环境 Python2.7: Python语言2.7版本。 Python3.6: Pyton语言3.6版本。 Python3.9: Python语言3.9版本。 Go1.8: Go语言1.8版本。 Go1.x: Go语言1.x版本。 Java8: Java语言8版本。 Java11: Java语言11版本。 Node.js6.10: Nodejs语言6.10版本。 Node.js8.10: Nodejs语言8.10版本。 Node.js10.16: Nodejs语言10.16版本。 Node.js12.13: Nodejs语言12.13版本。 Node.js14.18: Nodejs语言14.18版本。 C#(.NET Core 2.0): C#语言2.0版本。 C#(.NET Core 2.1): C#语言2.1版本。 C#(.NET Core 3.1): C#语言3.1版本。 Custom: 自定义运行时。 PHP7.3: Php语言7.3版本。 http: HTTP函数。
     * @return runtime
     */
    public RuntimeEnum getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
    }

    public ListFunctionVersionResult withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 函数执行超时时间，超时函数将被强行停止，范围3～900秒，可以通过白名单配置延长到12小时，具体可以咨询客服进行配置
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ListFunctionVersionResult withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * 函数执行入口 规则：xx.xx，必须包含“. ” 举例：对于node.js函数：myfunction.handler，则表示函数的文件名为myfunction.js，执行的入口函数名为handler。
     * @return handler
     */
    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public ListFunctionVersionResult withMemorySize(Integer memorySize) {
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

    public ListFunctionVersionResult withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 函数占用的cpu资源。 单位为millicore（1 core=1000 millicores）。 取值与MemorySize成比例，默认是128M内存占0.1个核（100 millicores）。
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ListFunctionVersionResult withCodeType(CodeTypeEnum codeType) {
        this.codeType = codeType;
        return this;
    }

    /**
     * 函数代码类型，取值有4种。 inline: UI在线编辑代码。 zip: 函数代码为zip包。 obs: 函数代码来源于obs存储。 jar: 函数代码为jar包，主要针对Java函数。
     * @return codeType
     */
    public CodeTypeEnum getCodeType() {
        return codeType;
    }

    public void setCodeType(CodeTypeEnum codeType) {
        this.codeType = codeType;
    }

    public ListFunctionVersionResult withCodeUrl(String codeUrl) {
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

    public ListFunctionVersionResult withCodeFilename(String codeFilename) {
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

    public ListFunctionVersionResult withCodeSize(Long codeSize) {
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

    public ListFunctionVersionResult withUserData(String userData) {
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

    public ListFunctionVersionResult withEncryptedUserData(String encryptedUserData) {
        this.encryptedUserData = encryptedUserData;
        return this;
    }

    /**
     * 用户自定义的name/value信息，用于需要加密的配置。
     * @return encryptedUserData
     */
    public String getEncryptedUserData() {
        return encryptedUserData;
    }

    public void setEncryptedUserData(String encryptedUserData) {
        this.encryptedUserData = encryptedUserData;
    }

    public ListFunctionVersionResult withDigest(String digest) {
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

    public ListFunctionVersionResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 函数版本号，由系统自动生成，规则：vYYYYMMDD-HHMMSS（v+年月日-时分秒）。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListFunctionVersionResult withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 函数版本的内部标识。
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ListFunctionVersionResult withXrole(String xrole) {
        this.xrole = xrole;
        return this;
    }

    /**
     * 函数使用的权限委托名称，需要IAM支持，并在IAM界面创建委托，当函数需要访问其他服务时，必须提供该字段。
     * @return xrole
     */
    public String getXrole() {
        return xrole;
    }

    public void setXrole(String xrole) {
        this.xrole = xrole;
    }

    public ListFunctionVersionResult withAppXrole(String appXrole) {
        this.appXrole = appXrole;
        return this;
    }

    /**
     * 函数app使用的权限委托名称，需要IAM支持，并在IAM界面创建委托，当函数需要访问其他服务时，必须提供该字段。
     * @return appXrole
     */
    public String getAppXrole() {
        return appXrole;
    }

    public void setAppXrole(String appXrole) {
        this.appXrole = appXrole;
    }

    public ListFunctionVersionResult withLastModified(OffsetDateTime lastModified) {
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

    public ListFunctionVersionResult withFuncVpcId(String funcVpcId) {
        this.funcVpcId = funcVpcId;
        return this;
    }

    /**
     * 用户的vpcid
     * @return funcVpcId
     */
    public String getFuncVpcId() {
        return funcVpcId;
    }

    public void setFuncVpcId(String funcVpcId) {
        this.funcVpcId = funcVpcId;
    }

    public ListFunctionVersionResult withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    /**
     * 0：函数被禁用;-1：函数被启用。
     * @return concurrency
     */
    public Integer getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public ListFunctionVersionResult withConcurrentNum(Integer concurrentNum) {
        this.concurrentNum = concurrentNum;
        return this;
    }

    /**
     * 并发实例数
     * @return concurrentNum
     */
    public Integer getConcurrentNum() {
        return concurrentNum;
    }

    public void setConcurrentNum(Integer concurrentNum) {
        this.concurrentNum = concurrentNum;
    }

    public ListFunctionVersionResult withStrategyConfig(StrategyConfig strategyConfig) {
        this.strategyConfig = strategyConfig;
        return this;
    }

    public ListFunctionVersionResult withStrategyConfig(Consumer<StrategyConfig> strategyConfigSetter) {
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

    public ListFunctionVersionResult withInitializerHandler(String initializerHandler) {
        this.initializerHandler = initializerHandler;
        return this;
    }

    /**
     * 函数初始化入口，规则：xx.xx，必须包含“. ”。 举例：对于node.js函数：myfunction.initializer，则表示函数的文件名为myfunction.js，初始化的入口函数名为initializer。
     * @return initializerHandler
     */
    public String getInitializerHandler() {
        return initializerHandler;
    }

    public void setInitializerHandler(String initializerHandler) {
        this.initializerHandler = initializerHandler;
    }

    public ListFunctionVersionResult withInitializerTimeout(Integer initializerTimeout) {
        this.initializerTimeout = initializerTimeout;
        return this;
    }

    /**
     * 初始化超时时间，超时函数将被强行停止，范围1～300秒。
     * @return initializerTimeout
     */
    public Integer getInitializerTimeout() {
        return initializerTimeout;
    }

    public void setInitializerTimeout(Integer initializerTimeout) {
        this.initializerTimeout = initializerTimeout;
    }

    public ListFunctionVersionResult withPreStopHandler(String preStopHandler) {
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

    public ListFunctionVersionResult withPreStopTimeout(Integer preStopTimeout) {
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

    public ListFunctionVersionResult withLongTime(Boolean longTime) {
        this.longTime = longTime;
        return this;
    }

    /**
     * 是否是支持长时间运行
     * @return longTime
     */
    public Boolean getLongTime() {
        return longTime;
    }

    public void setLongTime(Boolean longTime) {
        this.longTime = longTime;
    }

    public ListFunctionVersionResult withFunctionAsyncConfig(FunctionAsyncConfig functionAsyncConfig) {
        this.functionAsyncConfig = functionAsyncConfig;
        return this;
    }

    public ListFunctionVersionResult withFunctionAsyncConfig(Consumer<FunctionAsyncConfig> functionAsyncConfigSetter) {
        if (this.functionAsyncConfig == null) {
            this.functionAsyncConfig = new FunctionAsyncConfig();
            functionAsyncConfigSetter.accept(this.functionAsyncConfig);
        }

        return this;
    }

    /**
     * Get functionAsyncConfig
     * @return functionAsyncConfig
     */
    public FunctionAsyncConfig getFunctionAsyncConfig() {
        return functionAsyncConfig;
    }

    public void setFunctionAsyncConfig(FunctionAsyncConfig functionAsyncConfig) {
        this.functionAsyncConfig = functionAsyncConfig;
    }

    public ListFunctionVersionResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 函数版本
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListFunctionVersionResult withEnableCloudDebug(String enableCloudDebug) {
        this.enableCloudDebug = enableCloudDebug;
        return this;
    }

    /**
     * 是否启用cloud debug功能
     * @return enableCloudDebug
     */
    public String getEnableCloudDebug() {
        return enableCloudDebug;
    }

    public void setEnableCloudDebug(String enableCloudDebug) {
        this.enableCloudDebug = enableCloudDebug;
    }

    public ListFunctionVersionResult withEnableDynamicMemory(Boolean enableDynamicMemory) {
        this.enableDynamicMemory = enableDynamicMemory;
        return this;
    }

    /**
     * 是否启用动态内存功能
     * @return enableDynamicMemory
     */
    public Boolean getEnableDynamicMemory() {
        return enableDynamicMemory;
    }

    public void setEnableDynamicMemory(Boolean enableDynamicMemory) {
        this.enableDynamicMemory = enableDynamicMemory;
    }

    public ListFunctionVersionResult withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListFunctionVersionResult withIsStatefulFunction(Boolean isStatefulFunction) {
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

    public ListFunctionVersionResult withEnableAuthInHeader(Boolean enableAuthInHeader) {
        this.enableAuthInHeader = enableAuthInHeader;
        return this;
    }

    /**
     * 是否允许在请求头中添加鉴权信息
     * @return enableAuthInHeader
     */
    public Boolean getEnableAuthInHeader() {
        return enableAuthInHeader;
    }

    public void setEnableAuthInHeader(Boolean enableAuthInHeader) {
        this.enableAuthInHeader = enableAuthInHeader;
    }

    public ListFunctionVersionResult withCustomImage(CustomImage customImage) {
        this.customImage = customImage;
        return this;
    }

    public ListFunctionVersionResult withCustomImage(Consumer<CustomImage> customImageSetter) {
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

    public ListFunctionVersionResult withReservedInstanceIdleMode(Boolean reservedInstanceIdleMode) {
        this.reservedInstanceIdleMode = reservedInstanceIdleMode;
        return this;
    }

    /**
     * 是否开启预留实例闲置模式
     * @return reservedInstanceIdleMode
     */
    public Boolean getReservedInstanceIdleMode() {
        return reservedInstanceIdleMode;
    }

    public void setReservedInstanceIdleMode(Boolean reservedInstanceIdleMode) {
        this.reservedInstanceIdleMode = reservedInstanceIdleMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFunctionVersionResult that = (ListFunctionVersionResult) obj;
        return Objects.equals(this.funcUrn, that.funcUrn) && Objects.equals(this.funcName, that.funcName)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this._package, that._package)
            && Objects.equals(this.runtime, that.runtime) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.handler, that.handler) && Objects.equals(this.memorySize, that.memorySize)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.codeType, that.codeType)
            && Objects.equals(this.codeUrl, that.codeUrl) && Objects.equals(this.codeFilename, that.codeFilename)
            && Objects.equals(this.codeSize, that.codeSize) && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.encryptedUserData, that.encryptedUserData)
            && Objects.equals(this.digest, that.digest) && Objects.equals(this.version, that.version)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.xrole, that.xrole)
            && Objects.equals(this.appXrole, that.appXrole) && Objects.equals(this.lastModified, that.lastModified)
            && Objects.equals(this.funcVpcId, that.funcVpcId) && Objects.equals(this.concurrency, that.concurrency)
            && Objects.equals(this.concurrentNum, that.concurrentNum)
            && Objects.equals(this.strategyConfig, that.strategyConfig)
            && Objects.equals(this.initializerHandler, that.initializerHandler)
            && Objects.equals(this.initializerTimeout, that.initializerTimeout)
            && Objects.equals(this.preStopHandler, that.preStopHandler)
            && Objects.equals(this.preStopTimeout, that.preStopTimeout) && Objects.equals(this.longTime, that.longTime)
            && Objects.equals(this.functionAsyncConfig, that.functionAsyncConfig)
            && Objects.equals(this.type, that.type) && Objects.equals(this.enableCloudDebug, that.enableCloudDebug)
            && Objects.equals(this.enableDynamicMemory, that.enableDynamicMemory)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.isStatefulFunction, that.isStatefulFunction)
            && Objects.equals(this.enableAuthInHeader, that.enableAuthInHeader)
            && Objects.equals(this.customImage, that.customImage)
            && Objects.equals(this.reservedInstanceIdleMode, that.reservedInstanceIdleMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcUrn,
            funcName,
            domainId,
            namespace,
            projectName,
            _package,
            runtime,
            timeout,
            handler,
            memorySize,
            cpu,
            codeType,
            codeUrl,
            codeFilename,
            codeSize,
            userData,
            encryptedUserData,
            digest,
            version,
            imageName,
            xrole,
            appXrole,
            lastModified,
            funcVpcId,
            concurrency,
            concurrentNum,
            strategyConfig,
            initializerHandler,
            initializerTimeout,
            preStopHandler,
            preStopTimeout,
            longTime,
            functionAsyncConfig,
            type,
            enableCloudDebug,
            enableDynamicMemory,
            enterpriseProjectId,
            isStatefulFunction,
            enableAuthInHeader,
            customImage,
            reservedInstanceIdleMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionVersionResult {\n");
        sb.append("    funcUrn: ").append(toIndentedString(funcUrn)).append("\n");
        sb.append("    funcName: ").append(toIndentedString(funcName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
        sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
        sb.append("    codeUrl: ").append(toIndentedString(codeUrl)).append("\n");
        sb.append("    codeFilename: ").append(toIndentedString(codeFilename)).append("\n");
        sb.append("    codeSize: ").append(toIndentedString(codeSize)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    encryptedUserData: ").append(toIndentedString(encryptedUserData)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    xrole: ").append(toIndentedString(xrole)).append("\n");
        sb.append("    appXrole: ").append(toIndentedString(appXrole)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    funcVpcId: ").append(toIndentedString(funcVpcId)).append("\n");
        sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
        sb.append("    concurrentNum: ").append(toIndentedString(concurrentNum)).append("\n");
        sb.append("    strategyConfig: ").append(toIndentedString(strategyConfig)).append("\n");
        sb.append("    initializerHandler: ").append(toIndentedString(initializerHandler)).append("\n");
        sb.append("    initializerTimeout: ").append(toIndentedString(initializerTimeout)).append("\n");
        sb.append("    preStopHandler: ").append(toIndentedString(preStopHandler)).append("\n");
        sb.append("    preStopTimeout: ").append(toIndentedString(preStopTimeout)).append("\n");
        sb.append("    longTime: ").append(toIndentedString(longTime)).append("\n");
        sb.append("    functionAsyncConfig: ").append(toIndentedString(functionAsyncConfig)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enableCloudDebug: ").append(toIndentedString(enableCloudDebug)).append("\n");
        sb.append("    enableDynamicMemory: ").append(toIndentedString(enableDynamicMemory)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    isStatefulFunction: ").append(toIndentedString(isStatefulFunction)).append("\n");
        sb.append("    enableAuthInHeader: ").append(toIndentedString(enableAuthInHeader)).append("\n");
        sb.append("    customImage: ").append(toIndentedString(customImage)).append("\n");
        sb.append("    reservedInstanceIdleMode: ").append(toIndentedString(reservedInstanceIdleMode)).append("\n");
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
