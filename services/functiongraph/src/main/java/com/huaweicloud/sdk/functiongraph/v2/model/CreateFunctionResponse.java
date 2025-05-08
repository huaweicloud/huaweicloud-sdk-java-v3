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
public class CreateFunctionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_id")

    private String funcId;

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
    @JsonProperty(value = "memory_size")

    private Integer memorySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_memory")

    private Integer gpuMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

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
    @JsonProperty(value = "domain_names")

    private String domainNames;

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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private OffsetDateTime lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_vpc")

    private FuncVpc funcVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_config")

    private MountConfig mountConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved_instance_count")

    private Integer reservedInstanceCount;

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
    @JsonProperty(value = "extend_config")

    private String extendConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependencies")

    private List<Dependency> dependencies = null;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_time")

    private Boolean longTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    /**
     * v2表示为正式版本,v1为废弃版本。
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
    @JsonProperty(value = "enable_cloud_debug")

    private String enableCloudDebug;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_dynamic_memory")

    private Boolean enableDynamicMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_stateful_function")

    private Boolean isStatefulFunction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_image")

    private CustomImage customImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_bridge_function")

    private Boolean isBridgeFunction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apig_route_enable")

    private Boolean apigRouteEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "heartbeat_handler")

    private String heartbeatHandler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_class_isolation")

    private Boolean enableClassIsolation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_type")

    private String gpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_ephemeral_storage")

    private Boolean allowEphemeralStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ephemeral_storage")

    private Integer ephemeralStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_controller")

    private NetworkControlConfig networkController;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_return_stream")

    private Boolean isReturnStream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_auth_in_header")

    private Boolean enableAuthInHeader;

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

    public CreateFunctionResponse withFuncId(String funcId) {
        this.funcId = funcId;
        return this;
    }

    /**
     * 函数id，唯一标识函数。
     * @return funcId
     */
    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public CreateFunctionResponse withFuncUrn(String funcUrn) {
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

    public CreateFunctionResponse withFuncName(String funcName) {
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

    public CreateFunctionResponse withDomainId(String domainId) {
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

    public CreateFunctionResponse withNamespace(String namespace) {
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

    public CreateFunctionResponse withProjectName(String projectName) {
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

    public CreateFunctionResponse withPackage(String _package) {
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

    public CreateFunctionResponse withRuntime(RuntimeEnum runtime) {
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

    public CreateFunctionResponse withTimeout(Integer timeout) {
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

    public CreateFunctionResponse withHandler(String handler) {
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

    public CreateFunctionResponse withMemorySize(Integer memorySize) {
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

    public CreateFunctionResponse withGpuMemory(Integer gpuMemory) {
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

    public CreateFunctionResponse withCpu(Integer cpu) {
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

    public CreateFunctionResponse withCodeType(CodeTypeEnum codeType) {
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

    public CreateFunctionResponse withCodeUrl(String codeUrl) {
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

    public CreateFunctionResponse withCodeFilename(String codeFilename) {
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

    public CreateFunctionResponse withCodeSize(Long codeSize) {
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

    public CreateFunctionResponse withDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }

    /**
     * 函数配置的需要支持域名解析的内网域名。
     * @return domainNames
     */
    public String getDomainNames() {
        return domainNames;
    }

    public void setDomainNames(String domainNames) {
        this.domainNames = domainNames;
    }

    public CreateFunctionResponse withUserData(String userData) {
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

    public CreateFunctionResponse withEncryptedUserData(String encryptedUserData) {
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

    public CreateFunctionResponse withDigest(String digest) {
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

    public CreateFunctionResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 函数版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateFunctionResponse withImageName(String imageName) {
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

    public CreateFunctionResponse withXrole(String xrole) {
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

    public CreateFunctionResponse withAppXrole(String appXrole) {
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

    public CreateFunctionResponse withDescription(String description) {
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

    public CreateFunctionResponse withLastModified(OffsetDateTime lastModified) {
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

    public CreateFunctionResponse withFuncVpc(FuncVpc funcVpc) {
        this.funcVpc = funcVpc;
        return this;
    }

    public CreateFunctionResponse withFuncVpc(Consumer<FuncVpc> funcVpcSetter) {
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

    public CreateFunctionResponse withMountConfig(MountConfig mountConfig) {
        this.mountConfig = mountConfig;
        return this;
    }

    public CreateFunctionResponse withMountConfig(Consumer<MountConfig> mountConfigSetter) {
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

    public CreateFunctionResponse withReservedInstanceCount(Integer reservedInstanceCount) {
        this.reservedInstanceCount = reservedInstanceCount;
        return this;
    }

    /**
     * 函数预留实例数量。
     * @return reservedInstanceCount
     */
    public Integer getReservedInstanceCount() {
        return reservedInstanceCount;
    }

    public void setReservedInstanceCount(Integer reservedInstanceCount) {
        this.reservedInstanceCount = reservedInstanceCount;
    }

    public CreateFunctionResponse withDependList(List<String> dependList) {
        this.dependList = dependList;
        return this;
    }

    public CreateFunctionResponse addDependListItem(String dependListItem) {
        if (this.dependList == null) {
            this.dependList = new ArrayList<>();
        }
        this.dependList.add(dependListItem);
        return this;
    }

    public CreateFunctionResponse withDependList(Consumer<List<String>> dependListSetter) {
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

    public CreateFunctionResponse withDependVersionList(List<String> dependVersionList) {
        this.dependVersionList = dependVersionList;
        return this;
    }

    public CreateFunctionResponse addDependVersionListItem(String dependVersionListItem) {
        if (this.dependVersionList == null) {
            this.dependVersionList = new ArrayList<>();
        }
        this.dependVersionList.add(dependVersionListItem);
        return this;
    }

    public CreateFunctionResponse withDependVersionList(Consumer<List<String>> dependVersionListSetter) {
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

    public CreateFunctionResponse withStrategyConfig(StrategyConfig strategyConfig) {
        this.strategyConfig = strategyConfig;
        return this;
    }

    public CreateFunctionResponse withStrategyConfig(Consumer<StrategyConfig> strategyConfigSetter) {
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

    public CreateFunctionResponse withExtendConfig(String extendConfig) {
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

    public CreateFunctionResponse withDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public CreateFunctionResponse addDependenciesItem(Dependency dependenciesItem) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    public CreateFunctionResponse withDependencies(Consumer<List<Dependency>> dependenciesSetter) {
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

    public CreateFunctionResponse withInitializerHandler(String initializerHandler) {
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

    public CreateFunctionResponse withInitializerTimeout(Integer initializerTimeout) {
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

    public CreateFunctionResponse withPreStopHandler(String preStopHandler) {
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

    public CreateFunctionResponse withPreStopTimeout(Integer preStopTimeout) {
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

    public CreateFunctionResponse withEnterpriseProjectId(String enterpriseProjectId) {
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

    public CreateFunctionResponse withLongTime(Boolean longTime) {
        this.longTime = longTime;
        return this;
    }

    /**
     * 是否允许进行长时间超时设置。
     * @return longTime
     */
    public Boolean getLongTime() {
        return longTime;
    }

    public void setLongTime(Boolean longTime) {
        this.longTime = longTime;
    }

    public CreateFunctionResponse withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 自定义日志查询组id
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public CreateFunctionResponse withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 自定义日志查询流id
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public CreateFunctionResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * v2表示为正式版本,v1为废弃版本。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateFunctionResponse withEnableCloudDebug(String enableCloudDebug) {
        this.enableCloudDebug = enableCloudDebug;
        return this;
    }

    /**
     * 适配CloudDebug场景，是否开启云调试（已废弃）
     * @return enableCloudDebug
     */
    public String getEnableCloudDebug() {
        return enableCloudDebug;
    }

    public void setEnableCloudDebug(String enableCloudDebug) {
        this.enableCloudDebug = enableCloudDebug;
    }

    public CreateFunctionResponse withEnableDynamicMemory(Boolean enableDynamicMemory) {
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

    public CreateFunctionResponse withIsStatefulFunction(Boolean isStatefulFunction) {
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

    public CreateFunctionResponse withCustomImage(CustomImage customImage) {
        this.customImage = customImage;
        return this;
    }

    public CreateFunctionResponse withCustomImage(Consumer<CustomImage> customImageSetter) {
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

    public CreateFunctionResponse withIsBridgeFunction(Boolean isBridgeFunction) {
        this.isBridgeFunction = isBridgeFunction;
        return this;
    }

    /**
     * 是否为bridge函数
     * @return isBridgeFunction
     */
    public Boolean getIsBridgeFunction() {
        return isBridgeFunction;
    }

    public void setIsBridgeFunction(Boolean isBridgeFunction) {
        this.isBridgeFunction = isBridgeFunction;
    }

    public CreateFunctionResponse withApigRouteEnable(Boolean apigRouteEnable) {
        this.apigRouteEnable = apigRouteEnable;
        return this;
    }

    /**
     * 是否配置下沉apig路由规则。
     * @return apigRouteEnable
     */
    public Boolean getApigRouteEnable() {
        return apigRouteEnable;
    }

    public void setApigRouteEnable(Boolean apigRouteEnable) {
        this.apigRouteEnable = apigRouteEnable;
    }

    public CreateFunctionResponse withHeartbeatHandler(String heartbeatHandler) {
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

    public CreateFunctionResponse withEnableClassIsolation(Boolean enableClassIsolation) {
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

    public CreateFunctionResponse withGpuType(String gpuType) {
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

    public CreateFunctionResponse withAllowEphemeralStorage(Boolean allowEphemeralStorage) {
        this.allowEphemeralStorage = allowEphemeralStorage;
        return this;
    }

    /**
     * 是否支持配置临时存储。
     * @return allowEphemeralStorage
     */
    public Boolean getAllowEphemeralStorage() {
        return allowEphemeralStorage;
    }

    public void setAllowEphemeralStorage(Boolean allowEphemeralStorage) {
        this.allowEphemeralStorage = allowEphemeralStorage;
    }

    public CreateFunctionResponse withEphemeralStorage(Integer ephemeralStorage) {
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

    public CreateFunctionResponse withNetworkController(NetworkControlConfig networkController) {
        this.networkController = networkController;
        return this;
    }

    public CreateFunctionResponse withNetworkController(Consumer<NetworkControlConfig> networkControllerSetter) {
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

    public CreateFunctionResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CreateFunctionResponse withIsReturnStream(Boolean isReturnStream) {
        this.isReturnStream = isReturnStream;
        return this;
    }

    /**
     * 是否返回流式数据（已废弃）
     * @return isReturnStream
     */
    public Boolean getIsReturnStream() {
        return isReturnStream;
    }

    public void setIsReturnStream(Boolean isReturnStream) {
        this.isReturnStream = isReturnStream;
    }

    public CreateFunctionResponse withEnableAuthInHeader(Boolean enableAuthInHeader) {
        this.enableAuthInHeader = enableAuthInHeader;
        return this;
    }

    /**
     * 是否允许在请求头中添加鉴权信息，只支持自定义镜像函数（创建函数时不支持修改）
     * @return enableAuthInHeader
     */
    public Boolean getEnableAuthInHeader() {
        return enableAuthInHeader;
    }

    public void setEnableAuthInHeader(Boolean enableAuthInHeader) {
        this.enableAuthInHeader = enableAuthInHeader;
    }

    public CreateFunctionResponse withEnableLtsLog(Boolean enableLtsLog) {
        this.enableLtsLog = enableLtsLog;
        return this;
    }

    /**
     * 是否开启日志。
     * @return enableLtsLog
     */
    public Boolean getEnableLtsLog() {
        return enableLtsLog;
    }

    public void setEnableLtsLog(Boolean enableLtsLog) {
        this.enableLtsLog = enableLtsLog;
    }

    public CreateFunctionResponse withLtsCustomTag(Map<String, String> ltsCustomTag) {
        this.ltsCustomTag = ltsCustomTag;
        return this;
    }

    public CreateFunctionResponse putLtsCustomTagItem(String key, String ltsCustomTagItem) {
        if (this.ltsCustomTag == null) {
            this.ltsCustomTag = new HashMap<>();
        }
        this.ltsCustomTag.put(key, ltsCustomTagItem);
        return this;
    }

    public CreateFunctionResponse withLtsCustomTag(Consumer<Map<String, String>> ltsCustomTagSetter) {
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

    public CreateFunctionResponse withUserDataEncryptKmsKeyId(String userDataEncryptKmsKeyId) {
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

    public CreateFunctionResponse withCodeEncryptKmsKeyId(String codeEncryptKmsKeyId) {
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
        CreateFunctionResponse that = (CreateFunctionResponse) obj;
        return Objects.equals(this.funcId, that.funcId) && Objects.equals(this.funcUrn, that.funcUrn)
            && Objects.equals(this.funcName, that.funcName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this._package, that._package) && Objects.equals(this.runtime, that.runtime)
            && Objects.equals(this.timeout, that.timeout) && Objects.equals(this.handler, that.handler)
            && Objects.equals(this.memorySize, that.memorySize) && Objects.equals(this.gpuMemory, that.gpuMemory)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.codeType, that.codeType)
            && Objects.equals(this.codeUrl, that.codeUrl) && Objects.equals(this.codeFilename, that.codeFilename)
            && Objects.equals(this.codeSize, that.codeSize) && Objects.equals(this.domainNames, that.domainNames)
            && Objects.equals(this.userData, that.userData)
            && Objects.equals(this.encryptedUserData, that.encryptedUserData)
            && Objects.equals(this.digest, that.digest) && Objects.equals(this.version, that.version)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.xrole, that.xrole)
            && Objects.equals(this.appXrole, that.appXrole) && Objects.equals(this.description, that.description)
            && Objects.equals(this.lastModified, that.lastModified) && Objects.equals(this.funcVpc, that.funcVpc)
            && Objects.equals(this.mountConfig, that.mountConfig)
            && Objects.equals(this.reservedInstanceCount, that.reservedInstanceCount)
            && Objects.equals(this.dependList, that.dependList)
            && Objects.equals(this.dependVersionList, that.dependVersionList)
            && Objects.equals(this.strategyConfig, that.strategyConfig)
            && Objects.equals(this.extendConfig, that.extendConfig)
            && Objects.equals(this.dependencies, that.dependencies)
            && Objects.equals(this.initializerHandler, that.initializerHandler)
            && Objects.equals(this.initializerTimeout, that.initializerTimeout)
            && Objects.equals(this.preStopHandler, that.preStopHandler)
            && Objects.equals(this.preStopTimeout, that.preStopTimeout)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.longTime, that.longTime) && Objects.equals(this.logGroupId, that.logGroupId)
            && Objects.equals(this.logStreamId, that.logStreamId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.enableCloudDebug, that.enableCloudDebug)
            && Objects.equals(this.enableDynamicMemory, that.enableDynamicMemory)
            && Objects.equals(this.isStatefulFunction, that.isStatefulFunction)
            && Objects.equals(this.customImage, that.customImage)
            && Objects.equals(this.isBridgeFunction, that.isBridgeFunction)
            && Objects.equals(this.apigRouteEnable, that.apigRouteEnable)
            && Objects.equals(this.heartbeatHandler, that.heartbeatHandler)
            && Objects.equals(this.enableClassIsolation, that.enableClassIsolation)
            && Objects.equals(this.gpuType, that.gpuType)
            && Objects.equals(this.allowEphemeralStorage, that.allowEphemeralStorage)
            && Objects.equals(this.ephemeralStorage, that.ephemeralStorage)
            && Objects.equals(this.networkController, that.networkController)
            && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.isReturnStream, that.isReturnStream)
            && Objects.equals(this.enableAuthInHeader, that.enableAuthInHeader)
            && Objects.equals(this.enableLtsLog, that.enableLtsLog)
            && Objects.equals(this.ltsCustomTag, that.ltsCustomTag)
            && Objects.equals(this.userDataEncryptKmsKeyId, that.userDataEncryptKmsKeyId)
            && Objects.equals(this.codeEncryptKmsKeyId, that.codeEncryptKmsKeyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcId,
            funcUrn,
            funcName,
            domainId,
            namespace,
            projectName,
            _package,
            runtime,
            timeout,
            handler,
            memorySize,
            gpuMemory,
            cpu,
            codeType,
            codeUrl,
            codeFilename,
            codeSize,
            domainNames,
            userData,
            encryptedUserData,
            digest,
            version,
            imageName,
            xrole,
            appXrole,
            description,
            lastModified,
            funcVpc,
            mountConfig,
            reservedInstanceCount,
            dependList,
            dependVersionList,
            strategyConfig,
            extendConfig,
            dependencies,
            initializerHandler,
            initializerTimeout,
            preStopHandler,
            preStopTimeout,
            enterpriseProjectId,
            longTime,
            logGroupId,
            logStreamId,
            type,
            enableCloudDebug,
            enableDynamicMemory,
            isStatefulFunction,
            customImage,
            isBridgeFunction,
            apigRouteEnable,
            heartbeatHandler,
            enableClassIsolation,
            gpuType,
            allowEphemeralStorage,
            ephemeralStorage,
            networkController,
            resourceId,
            isReturnStream,
            enableAuthInHeader,
            enableLtsLog,
            ltsCustomTag,
            userDataEncryptKmsKeyId,
            codeEncryptKmsKeyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFunctionResponse {\n");
        sb.append("    funcId: ").append(toIndentedString(funcId)).append("\n");
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
        sb.append("    gpuMemory: ").append(toIndentedString(gpuMemory)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
        sb.append("    codeUrl: ").append(toIndentedString(codeUrl)).append("\n");
        sb.append("    codeFilename: ").append(toIndentedString(codeFilename)).append("\n");
        sb.append("    codeSize: ").append(toIndentedString(codeSize)).append("\n");
        sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    encryptedUserData: ").append(toIndentedString(encryptedUserData)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    xrole: ").append(toIndentedString(xrole)).append("\n");
        sb.append("    appXrole: ").append(toIndentedString(appXrole)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    funcVpc: ").append(toIndentedString(funcVpc)).append("\n");
        sb.append("    mountConfig: ").append(toIndentedString(mountConfig)).append("\n");
        sb.append("    reservedInstanceCount: ").append(toIndentedString(reservedInstanceCount)).append("\n");
        sb.append("    dependList: ").append(toIndentedString(dependList)).append("\n");
        sb.append("    dependVersionList: ").append(toIndentedString(dependVersionList)).append("\n");
        sb.append("    strategyConfig: ").append(toIndentedString(strategyConfig)).append("\n");
        sb.append("    extendConfig: ").append(toIndentedString(extendConfig)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    initializerHandler: ").append(toIndentedString(initializerHandler)).append("\n");
        sb.append("    initializerTimeout: ").append(toIndentedString(initializerTimeout)).append("\n");
        sb.append("    preStopHandler: ").append(toIndentedString(preStopHandler)).append("\n");
        sb.append("    preStopTimeout: ").append(toIndentedString(preStopTimeout)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    longTime: ").append(toIndentedString(longTime)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enableCloudDebug: ").append(toIndentedString(enableCloudDebug)).append("\n");
        sb.append("    enableDynamicMemory: ").append(toIndentedString(enableDynamicMemory)).append("\n");
        sb.append("    isStatefulFunction: ").append(toIndentedString(isStatefulFunction)).append("\n");
        sb.append("    customImage: ").append(toIndentedString(customImage)).append("\n");
        sb.append("    isBridgeFunction: ").append(toIndentedString(isBridgeFunction)).append("\n");
        sb.append("    apigRouteEnable: ").append(toIndentedString(apigRouteEnable)).append("\n");
        sb.append("    heartbeatHandler: ").append(toIndentedString(heartbeatHandler)).append("\n");
        sb.append("    enableClassIsolation: ").append(toIndentedString(enableClassIsolation)).append("\n");
        sb.append("    gpuType: ").append(toIndentedString(gpuType)).append("\n");
        sb.append("    allowEphemeralStorage: ").append(toIndentedString(allowEphemeralStorage)).append("\n");
        sb.append("    ephemeralStorage: ").append(toIndentedString(ephemeralStorage)).append("\n");
        sb.append("    networkController: ").append(toIndentedString(networkController)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    isReturnStream: ").append(toIndentedString(isReturnStream)).append("\n");
        sb.append("    enableAuthInHeader: ").append(toIndentedString(enableAuthInHeader)).append("\n");
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
