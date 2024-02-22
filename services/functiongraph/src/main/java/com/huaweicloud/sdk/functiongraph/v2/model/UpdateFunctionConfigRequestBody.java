package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateFunctionConfigRequestBody
 */
public class UpdateFunctionConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_name")

    private String funcName;

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
    @JsonProperty(value = "gpu_memory")

    private Integer gpuMemory;

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
    @JsonProperty(value = "func_vpc")

    private FuncVpc funcVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_config")

    private MountConfig mountConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_config")

    private StrategyConfig strategyConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_image")

    private CustomImage customImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_config")

    private String extendConfig;

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
    @JsonProperty(value = "ephemeral_storage")

    private Integer ephemeralStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

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
    @JsonProperty(value = "enable_auth_in_header")

    private Boolean enableAuthInHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_names")

    private String domainNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_hook_handler")

    private String restoreHookHandler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_hook_timeout")

    private Integer restoreHookTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "heartbeat_handler")

    private String heartbeatHandler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_class_isolation")

    private Boolean enableClassIsolation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_type")

    private String gpuType;

    public UpdateFunctionConfigRequestBody withFuncName(String funcName) {
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

    public UpdateFunctionConfigRequestBody withRuntime(RuntimeEnum runtime) {
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

    public UpdateFunctionConfigRequestBody withTimeout(Integer timeout) {
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

    public UpdateFunctionConfigRequestBody withHandler(String handler) {
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

    public UpdateFunctionConfigRequestBody withMemorySize(Integer memorySize) {
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

    public UpdateFunctionConfigRequestBody withGpuMemory(Integer gpuMemory) {
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

    public UpdateFunctionConfigRequestBody withUserData(String userData) {
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

    public UpdateFunctionConfigRequestBody withEncryptedUserData(String encryptedUserData) {
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

    public UpdateFunctionConfigRequestBody withXrole(String xrole) {
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

    public UpdateFunctionConfigRequestBody withAppXrole(String appXrole) {
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

    public UpdateFunctionConfigRequestBody withDescription(String description) {
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

    public UpdateFunctionConfigRequestBody withFuncVpc(FuncVpc funcVpc) {
        this.funcVpc = funcVpc;
        return this;
    }

    public UpdateFunctionConfigRequestBody withFuncVpc(Consumer<FuncVpc> funcVpcSetter) {
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

    public UpdateFunctionConfigRequestBody withMountConfig(MountConfig mountConfig) {
        this.mountConfig = mountConfig;
        return this;
    }

    public UpdateFunctionConfigRequestBody withMountConfig(Consumer<MountConfig> mountConfigSetter) {
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

    public UpdateFunctionConfigRequestBody withStrategyConfig(StrategyConfig strategyConfig) {
        this.strategyConfig = strategyConfig;
        return this;
    }

    public UpdateFunctionConfigRequestBody withStrategyConfig(Consumer<StrategyConfig> strategyConfigSetter) {
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

    public UpdateFunctionConfigRequestBody withCustomImage(CustomImage customImage) {
        this.customImage = customImage;
        return this;
    }

    public UpdateFunctionConfigRequestBody withCustomImage(Consumer<CustomImage> customImageSetter) {
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

    public UpdateFunctionConfigRequestBody withExtendConfig(String extendConfig) {
        this.extendConfig = extendConfig;
        return this;
    }

    /**
     * 函数扩展配置。
     * @return extendConfig
     */
    public String getExtendConfig() {
        return extendConfig;
    }

    public void setExtendConfig(String extendConfig) {
        this.extendConfig = extendConfig;
    }

    public UpdateFunctionConfigRequestBody withInitializerHandler(String initializerHandler) {
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

    public UpdateFunctionConfigRequestBody withInitializerTimeout(Integer initializerTimeout) {
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

    public UpdateFunctionConfigRequestBody withPreStopHandler(String preStopHandler) {
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

    public UpdateFunctionConfigRequestBody withPreStopTimeout(Integer preStopTimeout) {
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

    public UpdateFunctionConfigRequestBody withEphemeralStorage(Integer ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
        return this;
    }

    /**
     * 临时存储大小。默认情况下会为函数的/tmp目录分配512MB的空间。您可以通过临时存储设置将函数的/tmp目录大小调整为10G。
     * @return ephemeralStorage
     */
    public Integer getEphemeralStorage() {
        return ephemeralStorage;
    }

    public void setEphemeralStorage(Integer ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
    }

    public UpdateFunctionConfigRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
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

    public UpdateFunctionConfigRequestBody withLogConfig(FuncLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }

    public UpdateFunctionConfigRequestBody withLogConfig(Consumer<FuncLogConfig> logConfigSetter) {
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

    public UpdateFunctionConfigRequestBody withNetworkController(NetworkControlConfig networkController) {
        this.networkController = networkController;
        return this;
    }

    public UpdateFunctionConfigRequestBody withNetworkController(
        Consumer<NetworkControlConfig> networkControllerSetter) {
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

    public UpdateFunctionConfigRequestBody withIsStatefulFunction(Boolean isStatefulFunction) {
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

    public UpdateFunctionConfigRequestBody withEnableDynamicMemory(Boolean enableDynamicMemory) {
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

    public UpdateFunctionConfigRequestBody withEnableAuthInHeader(Boolean enableAuthInHeader) {
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

    public UpdateFunctionConfigRequestBody withDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }

    /**
     * 内网域名配置。
     * @return domainNames
     */
    public String getDomainNames() {
        return domainNames;
    }

    public void setDomainNames(String domainNames) {
        this.domainNames = domainNames;
    }

    public UpdateFunctionConfigRequestBody withRestoreHookHandler(String restoreHookHandler) {
        this.restoreHookHandler = restoreHookHandler;
        return this;
    }

    /**
     * 函数快照式冷启动Restore Hook入口，仅支持Java，规则：xx.xx，必须包含“. ”。如：com.xxx.demo.Test.restoreHook
     * @return restoreHookHandler
     */
    public String getRestoreHookHandler() {
        return restoreHookHandler;
    }

    public void setRestoreHookHandler(String restoreHookHandler) {
        this.restoreHookHandler = restoreHookHandler;
    }

    public UpdateFunctionConfigRequestBody withRestoreHookTimeout(Integer restoreHookTimeout) {
        this.restoreHookTimeout = restoreHookTimeout;
        return this;
    }

    /**
     * 快照冷启动Restore Hook的超时时间，超时函数将被强行停止，范围1～300秒。
     * @return restoreHookTimeout
     */
    public Integer getRestoreHookTimeout() {
        return restoreHookTimeout;
    }

    public void setRestoreHookTimeout(Integer restoreHookTimeout) {
        this.restoreHookTimeout = restoreHookTimeout;
    }

    public UpdateFunctionConfigRequestBody withHeartbeatHandler(String heartbeatHandler) {
        this.heartbeatHandler = heartbeatHandler;
        return this;
    }

    /**
     * 心跳函数函数的入口，规则：xx.xx，必须包含“. ”，只支持JAVA运行时配置。 心跳函数入口需要与函数执行入口在同一文件下。在开启心跳函数配置时，此参数必填。
     * @return heartbeatHandler
     */
    public String getHeartbeatHandler() {
        return heartbeatHandler;
    }

    public void setHeartbeatHandler(String heartbeatHandler) {
        this.heartbeatHandler = heartbeatHandler;
    }

    public UpdateFunctionConfigRequestBody withEnableClassIsolation(Boolean enableClassIsolation) {
        this.enableClassIsolation = enableClassIsolation;
        return this;
    }

    /**
     * 类隔离开关，只支持JAVA运行时配置。开启类隔离后可以支持Kafka转储并提升类加载效率，但也可能会导致某些兼容性问题，请谨慎开启。
     * @return enableClassIsolation
     */
    public Boolean getEnableClassIsolation() {
        return enableClassIsolation;
    }

    public void setEnableClassIsolation(Boolean enableClassIsolation) {
        this.enableClassIsolation = enableClassIsolation;
    }

    public UpdateFunctionConfigRequestBody withGpuType(String gpuType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFunctionConfigRequestBody that = (UpdateFunctionConfigRequestBody) obj;
        return Objects.equals(this.funcName, that.funcName) && Objects.equals(this.runtime, that.runtime)
            && Objects.equals(this.timeout, that.timeout) && Objects.equals(this.handler, that.handler)
            && Objects.equals(this.memorySize, that.memorySize) && Objects.equals(this.gpuMemory, that.gpuMemory)
            && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.encryptedUserData, that.encryptedUserData) && Objects.equals(this.xrole, that.xrole)
            && Objects.equals(this.appXrole, that.appXrole) && Objects.equals(this.description, that.description)
            && Objects.equals(this.funcVpc, that.funcVpc) && Objects.equals(this.mountConfig, that.mountConfig)
            && Objects.equals(this.strategyConfig, that.strategyConfig)
            && Objects.equals(this.customImage, that.customImage)
            && Objects.equals(this.extendConfig, that.extendConfig)
            && Objects.equals(this.initializerHandler, that.initializerHandler)
            && Objects.equals(this.initializerTimeout, that.initializerTimeout)
            && Objects.equals(this.preStopHandler, that.preStopHandler)
            && Objects.equals(this.preStopTimeout, that.preStopTimeout)
            && Objects.equals(this.ephemeralStorage, that.ephemeralStorage)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.logConfig, that.logConfig)
            && Objects.equals(this.networkController, that.networkController)
            && Objects.equals(this.isStatefulFunction, that.isStatefulFunction)
            && Objects.equals(this.enableDynamicMemory, that.enableDynamicMemory)
            && Objects.equals(this.enableAuthInHeader, that.enableAuthInHeader)
            && Objects.equals(this.domainNames, that.domainNames)
            && Objects.equals(this.restoreHookHandler, that.restoreHookHandler)
            && Objects.equals(this.restoreHookTimeout, that.restoreHookTimeout)
            && Objects.equals(this.heartbeatHandler, that.heartbeatHandler)
            && Objects.equals(this.enableClassIsolation, that.enableClassIsolation)
            && Objects.equals(this.gpuType, that.gpuType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcName,
            runtime,
            timeout,
            handler,
            memorySize,
            gpuMemory,
            userData,
            encryptedUserData,
            xrole,
            appXrole,
            description,
            funcVpc,
            mountConfig,
            strategyConfig,
            customImage,
            extendConfig,
            initializerHandler,
            initializerTimeout,
            preStopHandler,
            preStopTimeout,
            ephemeralStorage,
            enterpriseProjectId,
            logConfig,
            networkController,
            isStatefulFunction,
            enableDynamicMemory,
            enableAuthInHeader,
            domainNames,
            restoreHookHandler,
            restoreHookTimeout,
            heartbeatHandler,
            enableClassIsolation,
            gpuType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFunctionConfigRequestBody {\n");
        sb.append("    funcName: ").append(toIndentedString(funcName)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
        sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
        sb.append("    gpuMemory: ").append(toIndentedString(gpuMemory)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    encryptedUserData: ").append(toIndentedString(encryptedUserData)).append("\n");
        sb.append("    xrole: ").append(toIndentedString(xrole)).append("\n");
        sb.append("    appXrole: ").append(toIndentedString(appXrole)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    funcVpc: ").append(toIndentedString(funcVpc)).append("\n");
        sb.append("    mountConfig: ").append(toIndentedString(mountConfig)).append("\n");
        sb.append("    strategyConfig: ").append(toIndentedString(strategyConfig)).append("\n");
        sb.append("    customImage: ").append(toIndentedString(customImage)).append("\n");
        sb.append("    extendConfig: ").append(toIndentedString(extendConfig)).append("\n");
        sb.append("    initializerHandler: ").append(toIndentedString(initializerHandler)).append("\n");
        sb.append("    initializerTimeout: ").append(toIndentedString(initializerTimeout)).append("\n");
        sb.append("    preStopHandler: ").append(toIndentedString(preStopHandler)).append("\n");
        sb.append("    preStopTimeout: ").append(toIndentedString(preStopTimeout)).append("\n");
        sb.append("    ephemeralStorage: ").append(toIndentedString(ephemeralStorage)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    logConfig: ").append(toIndentedString(logConfig)).append("\n");
        sb.append("    networkController: ").append(toIndentedString(networkController)).append("\n");
        sb.append("    isStatefulFunction: ").append(toIndentedString(isStatefulFunction)).append("\n");
        sb.append("    enableDynamicMemory: ").append(toIndentedString(enableDynamicMemory)).append("\n");
        sb.append("    enableAuthInHeader: ").append(toIndentedString(enableAuthInHeader)).append("\n");
        sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
        sb.append("    restoreHookHandler: ").append(toIndentedString(restoreHookHandler)).append("\n");
        sb.append("    restoreHookTimeout: ").append(toIndentedString(restoreHookTimeout)).append("\n");
        sb.append("    heartbeatHandler: ").append(toIndentedString(heartbeatHandler)).append("\n");
        sb.append("    enableClassIsolation: ").append(toIndentedString(enableClassIsolation)).append("\n");
        sb.append("    gpuType: ").append(toIndentedString(gpuType)).append("\n");
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
