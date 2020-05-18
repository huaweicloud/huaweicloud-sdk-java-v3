package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.fgs.v2.model.Dependency;
import com.huaweicloud.sdk.fgs.v2.model.FuncCode;
import com.huaweicloud.sdk.fgs.v2.model.FuncVpc;
import com.huaweicloud.sdk.fgs.v2.model.MountConfig;
import com.huaweicloud.sdk.fgs.v2.model.StrategyConfig;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 函数属性结构体。
 */
public class ListFunctionResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="func_urn")
    
    private String funcUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="func_name")
    
    private String funcName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_name")
    
    private String projectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="package")
    
    private String _package;
    /**
     * FunctionGraph函数的执行环境 支持Node.js6.10、Python2.7、Python3.6、Java8、Go1.8、Node.js 8.10、C#.NET Core 2.0、C#.NET Core 2.1、PHP7.3。 Python2.7: Python语言2.7版本。 Python3.6: Pyton语言3.6版本。 Go1.8: Go语言1.8版本。 Java8: Java语言8版本。 Node.js6.10: Nodejs语言6.10版本。 Node.js8.10: Nodejs语言8.10版本。 C#(.NET Core 2.0): C#语言2.0版本。 C#(.NET Core 2.1): C#语言2.1版本。 C#(.NET Core 3.1): C#语言3.1版本。 Custom: 自定义运行时。 PHP7.3: Php语言7.3版本。
     */
    public static class RuntimeEnum {

        
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
         * Enum JAVA8 for value: "Java8"
         */
        public static final RuntimeEnum JAVA8 = new RuntimeEnum("Java8");

        
        /**
         * Enum NODE_JS6_10 for value: "Node.js6.10"
         */
        public static final RuntimeEnum NODE_JS6_10 = new RuntimeEnum("Node.js6.10");

        
        /**
         * Enum NODE_JS8_10 for value: "Node.js8.10"
         */
        public static final RuntimeEnum NODE_JS8_10 = new RuntimeEnum("Node.js8.10");

        
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
         * Enum CUSTOM for value: "Custom"
         */
        public static final RuntimeEnum CUSTOM = new RuntimeEnum("Custom");

        
        /**
         * Enum PHP7_3 for value: "PHP7.3"
         */
        public static final RuntimeEnum PHP7_3 = new RuntimeEnum("PHP7.3");

        

        public static Map<String, RuntimeEnum> staticFields =
                new HashMap<String, RuntimeEnum>() {
                    { 
                        put("Python2.7", PYTHON2_7);
                        put("Python3.6", PYTHON3_6);
                        put("Go1.8", GO1_8);
                        put("Java8", JAVA8);
                        put("Node.js6.10", NODE_JS6_10);
                        put("Node.js8.10", NODE_JS8_10);
                        put("C#(.NET Core 2.0)", C_NET_CORE_2_0_);
                        put("C#(.NET Core 2.1)", C_NET_CORE_2_1_);
                        put("C#(.NET Core 3.1)", C_NET_CORE_3_1_);
                        put("Custom", CUSTOM);
                        put("PHP7.3", PHP7_3);
                    }
                };

        private String value;

        RuntimeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RuntimeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            RuntimeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new RuntimeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static RuntimeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RuntimeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RuntimeEnum) {
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
    @JsonProperty(value="runtime")
    
    private RuntimeEnum runtime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    private Integer timeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="handler")
    
    private String handler;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="memory_size")
    
    private Integer memorySize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cpu")
    
    private Integer cpu;
    /**
     * 函数代码类型，取值有4种。 inline: UI在线编辑代码。 zip: 函数代码为zip包。 obs: 函数代码来源于obs存储。 jar: 函数代码为jar包，主要针对Java函数。
     */
    public static class CodeTypeEnum {

        
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

        

        public static Map<String, CodeTypeEnum> staticFields =
                new HashMap<String, CodeTypeEnum>() {
                    { 
                        put("inline", INLINE);
                        put("zip", ZIP);
                        put("obs", OBS);
                        put("jar", JAR);
                    }
                };

        private String value;

        CodeTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CodeTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            CodeTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new CodeTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static CodeTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CodeTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof CodeTypeEnum) {
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
    @JsonProperty(value="code_url")
    
    private String codeUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code_filename")
    
    private String codeFilename;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code_size")
    
    private Long codeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_data")
    
    private String userData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="digest")
    
    private String digest;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_name")
    
    private String imageName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xrole")
    
    private String xrole;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_xrole")
    
    private String appXrole;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_description")
    
    private String versionDescription;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_modified")
    
    private OffsetDateTime lastModified = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_modified_utc")
    
    private Long lastModifiedUtc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="func_code")
    
    private FuncCode funcCode = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="func_vpc")
    
    private FuncVpc funcVpc = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mount_config")
    
    private MountConfig mountConfig = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="concurrency")
    
    private Integer concurrency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="depend_list")
    
    private List<String> dependList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="strategy_config")
    
    private StrategyConfig strategyConfig = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extend_config")
    
    private String extendConfig;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dependencies")
    
    private List<Dependency> dependencies = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="initializer_handler")
    
    private String initializerHandler;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="initializer_timeout")
    
    private Integer initializerTimeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ListFunctionResult withFuncUrn(String funcUrn) {
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

    public ListFunctionResult withFuncName(String funcName) {
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

    public ListFunctionResult withDomainId(String domainId) {
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

    public ListFunctionResult withNamespace(String namespace) {
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

    public ListFunctionResult withProjectName(String projectName) {
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

    public ListFunctionResult withPackage(String _package) {
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

    public ListFunctionResult withRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
        return this;
    }

    


    /**
     * FunctionGraph函数的执行环境 支持Node.js6.10、Python2.7、Python3.6、Java8、Go1.8、Node.js 8.10、C#.NET Core 2.0、C#.NET Core 2.1、PHP7.3。 Python2.7: Python语言2.7版本。 Python3.6: Pyton语言3.6版本。 Go1.8: Go语言1.8版本。 Java8: Java语言8版本。 Node.js6.10: Nodejs语言6.10版本。 Node.js8.10: Nodejs语言8.10版本。 C#(.NET Core 2.0): C#语言2.0版本。 C#(.NET Core 2.1): C#语言2.1版本。 C#(.NET Core 3.1): C#语言3.1版本。 Custom: 自定义运行时。 PHP7.3: Php语言7.3版本。
     * @return runtime
     */
    public RuntimeEnum getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeEnum runtime) {
        this.runtime = runtime;
    }

    public ListFunctionResult withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * 函数执行超时时间，超时函数将被强行停止，范围3～900秒
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ListFunctionResult withHandler(String handler) {
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

    public ListFunctionResult withMemorySize(Integer memorySize) {
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

    public ListFunctionResult withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    


    /**
     * 函数占用的cpu资源。 单位为millicore（1 core=1000 millicores）。 取值与MemorySize成比例，默认是128M内存占0.1个核（100 millicores）。 函数占用的CPU为基础CPU：200 millicores，再加上内存按比例占用的CPU，计算方法：内存/128 *100 + 200。
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ListFunctionResult withCodeType(CodeTypeEnum codeType) {
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

    public ListFunctionResult withCodeUrl(String codeUrl) {
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

    public ListFunctionResult withCodeFilename(String codeFilename) {
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

    public ListFunctionResult withCodeSize(Long codeSize) {
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

    public ListFunctionResult withUserData(String userData) {
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

    public ListFunctionResult withDigest(String digest) {
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

    public ListFunctionResult withVersion(String version) {
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

    public ListFunctionResult withImageName(String imageName) {
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

    public ListFunctionResult withXrole(String xrole) {
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

    public ListFunctionResult withAppXrole(String appXrole) {
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

    public ListFunctionResult withDescription(String description) {
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

    public ListFunctionResult withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    


    /**
     * 函数版本描述。
     * @return versionDescription
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public ListFunctionResult withLastModified(OffsetDateTime lastModified) {
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

    public ListFunctionResult withLastModifiedUtc(Long lastModifiedUtc) {
        this.lastModifiedUtc = lastModifiedUtc;
        return this;
    }

    


    /**
     * 函数最后一次更新utc时间。
     * @return lastModifiedUtc
     */
    public Long getLastModifiedUtc() {
        return lastModifiedUtc;
    }

    public void setLastModifiedUtc(Long lastModifiedUtc) {
        this.lastModifiedUtc = lastModifiedUtc;
    }

    public ListFunctionResult withFuncCode(FuncCode funcCode) {
        this.funcCode = funcCode;
        return this;
    }

    public ListFunctionResult withFuncCode(Consumer<FuncCode> funcCodeSetter) {
        if(this.funcCode == null ){
            this.funcCode = new FuncCode();
        }
        funcCodeSetter.accept(this.funcCode);
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

    public ListFunctionResult withFuncVpc(FuncVpc funcVpc) {
        this.funcVpc = funcVpc;
        return this;
    }

    public ListFunctionResult withFuncVpc(Consumer<FuncVpc> funcVpcSetter) {
        if(this.funcVpc == null ){
            this.funcVpc = new FuncVpc();
        }
        funcVpcSetter.accept(this.funcVpc);
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

    public ListFunctionResult withMountConfig(MountConfig mountConfig) {
        this.mountConfig = mountConfig;
        return this;
    }

    public ListFunctionResult withMountConfig(Consumer<MountConfig> mountConfigSetter) {
        if(this.mountConfig == null ){
            this.mountConfig = new MountConfig();
        }
        mountConfigSetter.accept(this.mountConfig);
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

    public ListFunctionResult withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    


    /**
     * Get concurrency
     * @return concurrency
     */
    public Integer getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public ListFunctionResult withDependList(List<String> dependList) {
        this.dependList = dependList;
        return this;
    }

    
    public ListFunctionResult addDependListItem(String dependListItem) {
        if (this.dependList == null) {
            this.dependList = new ArrayList<>();
        }
        this.dependList.add(dependListItem);
        return this;
    }

    public ListFunctionResult withDependList(Consumer<List<String>> dependListSetter) {
        if(this.dependList == null ){
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

    public ListFunctionResult withStrategyConfig(StrategyConfig strategyConfig) {
        this.strategyConfig = strategyConfig;
        return this;
    }

    public ListFunctionResult withStrategyConfig(Consumer<StrategyConfig> strategyConfigSetter) {
        if(this.strategyConfig == null ){
            this.strategyConfig = new StrategyConfig();
        }
        strategyConfigSetter.accept(this.strategyConfig);
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

    public ListFunctionResult withExtendConfig(String extendConfig) {
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

    public ListFunctionResult withDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    
    public ListFunctionResult addDependenciesItem(Dependency dependenciesItem) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    public ListFunctionResult withDependencies(Consumer<List<Dependency>> dependenciesSetter) {
        if(this.dependencies == null ){
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

    public ListFunctionResult withInitializerHandler(String initializerHandler) {
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

    public ListFunctionResult withInitializerTimeout(Integer initializerTimeout) {
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

    public ListFunctionResult withEnterpriseProjectId(String enterpriseProjectId) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionResult listFunctionResult = (ListFunctionResult) o;
        return Objects.equals(this.funcUrn, listFunctionResult.funcUrn) &&
            Objects.equals(this.funcName, listFunctionResult.funcName) &&
            Objects.equals(this.domainId, listFunctionResult.domainId) &&
            Objects.equals(this.namespace, listFunctionResult.namespace) &&
            Objects.equals(this.projectName, listFunctionResult.projectName) &&
            Objects.equals(this._package, listFunctionResult._package) &&
            Objects.equals(this.runtime, listFunctionResult.runtime) &&
            Objects.equals(this.timeout, listFunctionResult.timeout) &&
            Objects.equals(this.handler, listFunctionResult.handler) &&
            Objects.equals(this.memorySize, listFunctionResult.memorySize) &&
            Objects.equals(this.cpu, listFunctionResult.cpu) &&
            Objects.equals(this.codeType, listFunctionResult.codeType) &&
            Objects.equals(this.codeUrl, listFunctionResult.codeUrl) &&
            Objects.equals(this.codeFilename, listFunctionResult.codeFilename) &&
            Objects.equals(this.codeSize, listFunctionResult.codeSize) &&
            Objects.equals(this.userData, listFunctionResult.userData) &&
            Objects.equals(this.digest, listFunctionResult.digest) &&
            Objects.equals(this.version, listFunctionResult.version) &&
            Objects.equals(this.imageName, listFunctionResult.imageName) &&
            Objects.equals(this.xrole, listFunctionResult.xrole) &&
            Objects.equals(this.appXrole, listFunctionResult.appXrole) &&
            Objects.equals(this.description, listFunctionResult.description) &&
            Objects.equals(this.versionDescription, listFunctionResult.versionDescription) &&
            Objects.equals(this.lastModified, listFunctionResult.lastModified) &&
            Objects.equals(this.lastModifiedUtc, listFunctionResult.lastModifiedUtc) &&
            Objects.equals(this.funcCode, listFunctionResult.funcCode) &&
            Objects.equals(this.funcVpc, listFunctionResult.funcVpc) &&
            Objects.equals(this.mountConfig, listFunctionResult.mountConfig) &&
            Objects.equals(this.concurrency, listFunctionResult.concurrency) &&
            Objects.equals(this.dependList, listFunctionResult.dependList) &&
            Objects.equals(this.strategyConfig, listFunctionResult.strategyConfig) &&
            Objects.equals(this.extendConfig, listFunctionResult.extendConfig) &&
            Objects.equals(this.dependencies, listFunctionResult.dependencies) &&
            Objects.equals(this.initializerHandler, listFunctionResult.initializerHandler) &&
            Objects.equals(this.initializerTimeout, listFunctionResult.initializerTimeout) &&
            Objects.equals(this.enterpriseProjectId, listFunctionResult.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(funcUrn, funcName, domainId, namespace, projectName, _package, runtime, timeout, handler, memorySize, cpu, codeType, codeUrl, codeFilename, codeSize, userData, digest, version, imageName, xrole, appXrole, description, versionDescription, lastModified, lastModifiedUtc, funcCode, funcVpc, mountConfig, concurrency, dependList, strategyConfig, extendConfig, dependencies, initializerHandler, initializerTimeout, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionResult {\n");
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
            sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
            sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
            sb.append("    xrole: ").append(toIndentedString(xrole)).append("\n");
            sb.append("    appXrole: ").append(toIndentedString(appXrole)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
            sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
            sb.append("    lastModifiedUtc: ").append(toIndentedString(lastModifiedUtc)).append("\n");
            sb.append("    funcCode: ").append(toIndentedString(funcCode)).append("\n");
            sb.append("    funcVpc: ").append(toIndentedString(funcVpc)).append("\n");
            sb.append("    mountConfig: ").append(toIndentedString(mountConfig)).append("\n");
            sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
            sb.append("    dependList: ").append(toIndentedString(dependList)).append("\n");
            sb.append("    strategyConfig: ").append(toIndentedString(strategyConfig)).append("\n");
            sb.append("    extendConfig: ").append(toIndentedString(extendConfig)).append("\n");
            sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
            sb.append("    initializerHandler: ").append(toIndentedString(initializerHandler)).append("\n");
            sb.append("    initializerTimeout: ").append(toIndentedString(initializerTimeout)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

