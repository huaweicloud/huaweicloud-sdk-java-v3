package com.huaweicloud.sdk.mrs.v1.model;

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

/** CreateClusterReq */
public class CreateClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_version")

    private String clusterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_node_num")

    private Integer masterNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_node_num")

    private Integer coreNodeNum;

    /** 集群的计费模式。 12表示按需计费。接口调用仅支持创建按需计费集群。 */
    public static final class BillingTypeEnum {

        /** Enum NUMBER_12 for value: 12 */
        public static final BillingTypeEnum NUMBER_12 = new BillingTypeEnum(12);

        private static final Map<Integer, BillingTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, BillingTypeEnum> createStaticFields() {
            Map<Integer, BillingTypeEnum> map = new HashMap<>();
            map.put(12, NUMBER_12);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        BillingTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BillingTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            BillingTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BillingTypeEnum(value);
            }
            return result;
        }

        public static BillingTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            BillingTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BillingTypeEnum) {
                return this.value.equals(((BillingTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_type")

    private BillingTypeEnum billingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_center")

    private String dataCenter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private String vpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_node_size")

    private String masterNodeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_node_size")

    private String coreNodeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_list")

    private List<ComponentList> componentList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone_id")

    private String availableZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_name")

    private String subnetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups_id")

    private String securityGroupsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_jobs")

    private List<AddJobs> addJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    private Integer volumeSize;

    /** Master和Core节点的磁盘存储类别，目前支持SATA、SAS、SSD和GPSSD。磁盘参数可以使用volume_type和volume_size表示，也可以使用多磁盘相关的参数表示。volume_type和volume_size这两个参数如果与多磁盘参数同时出现，系统优先读取volume_type和volume_size参数。建议使用多磁盘参数。
     * - SATA：普通IO - SAS：高IO - SSD：超高IO - GPSSD：通用型SSD */
    public static final class VolumeTypeEnum {

        /** Enum SATA for value: "SATA" */
        public static final VolumeTypeEnum SATA = new VolumeTypeEnum("SATA");

        /** Enum SAS for value: "SAS" */
        public static final VolumeTypeEnum SAS = new VolumeTypeEnum("SAS");

        /** Enum SSD for value: "SSD" */
        public static final VolumeTypeEnum SSD = new VolumeTypeEnum("SSD");

        /** Enum GPSSD for value: "GPSSD" */
        public static final VolumeTypeEnum GPSSD = new VolumeTypeEnum("GPSSD");

        private static final Map<String, VolumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumeTypeEnum> createStaticFields() {
            Map<String, VolumeTypeEnum> map = new HashMap<>();
            map.put("SATA", SATA);
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("GPSSD", GPSSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VolumeTypeEnum(String value) {
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
        public static VolumeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VolumeTypeEnum(value);
            }
            return result;
        }

        public static VolumeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VolumeTypeEnum) {
                return this.value.equals(((VolumeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private VolumeTypeEnum volumeType;

    /** 该参数为多磁盘参数，表示Master节点数据磁盘存储类别，目前支持SATA、SAS、SSD和GPSSD。 */
    public static final class MasterDataVolumeTypeEnum {

        /** Enum SATA for value: "SATA" */
        public static final MasterDataVolumeTypeEnum SATA = new MasterDataVolumeTypeEnum("SATA");

        /** Enum SAS for value: "SAS" */
        public static final MasterDataVolumeTypeEnum SAS = new MasterDataVolumeTypeEnum("SAS");

        /** Enum SSD for value: "SSD" */
        public static final MasterDataVolumeTypeEnum SSD = new MasterDataVolumeTypeEnum("SSD");

        /** Enum GPSSD for value: "GPSSD" */
        public static final MasterDataVolumeTypeEnum GPSSD = new MasterDataVolumeTypeEnum("GPSSD");

        private static final Map<String, MasterDataVolumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MasterDataVolumeTypeEnum> createStaticFields() {
            Map<String, MasterDataVolumeTypeEnum> map = new HashMap<>();
            map.put("SATA", SATA);
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("GPSSD", GPSSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MasterDataVolumeTypeEnum(String value) {
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
        public static MasterDataVolumeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MasterDataVolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MasterDataVolumeTypeEnum(value);
            }
            return result;
        }

        public static MasterDataVolumeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MasterDataVolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MasterDataVolumeTypeEnum) {
                return this.value.equals(((MasterDataVolumeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_data_volume_type")

    private MasterDataVolumeTypeEnum masterDataVolumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_data_volume_size")

    private Integer masterDataVolumeSize;

    /** 该参数为多磁盘参数，表示Master节点数据磁盘个数。取值只能是1。 */
    public static final class MasterDataVolumeCountEnum {

        /** Enum NUMBER_1 for value: 1 */
        public static final MasterDataVolumeCountEnum NUMBER_1 = new MasterDataVolumeCountEnum(1);

        private static final Map<Integer, MasterDataVolumeCountEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, MasterDataVolumeCountEnum> createStaticFields() {
            Map<Integer, MasterDataVolumeCountEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        MasterDataVolumeCountEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MasterDataVolumeCountEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            MasterDataVolumeCountEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MasterDataVolumeCountEnum(value);
            }
            return result;
        }

        public static MasterDataVolumeCountEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            MasterDataVolumeCountEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MasterDataVolumeCountEnum) {
                return this.value.equals(((MasterDataVolumeCountEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_data_volume_count")

    private MasterDataVolumeCountEnum masterDataVolumeCount;

    /** 该参数为多磁盘参数，表示Core节点数据磁盘存储类别，目前支持SATA、SAS、SSD和GPSSD。 */
    public static final class CoreDataVolumeTypeEnum {

        /** Enum SATA for value: "SATA" */
        public static final CoreDataVolumeTypeEnum SATA = new CoreDataVolumeTypeEnum("SATA");

        /** Enum SAS for value: "SAS" */
        public static final CoreDataVolumeTypeEnum SAS = new CoreDataVolumeTypeEnum("SAS");

        /** Enum SSD for value: "SSD" */
        public static final CoreDataVolumeTypeEnum SSD = new CoreDataVolumeTypeEnum("SSD");

        /** Enum GPSSD for value: "GPSSD" */
        public static final CoreDataVolumeTypeEnum GPSSD = new CoreDataVolumeTypeEnum("GPSSD");

        private static final Map<String, CoreDataVolumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CoreDataVolumeTypeEnum> createStaticFields() {
            Map<String, CoreDataVolumeTypeEnum> map = new HashMap<>();
            map.put("SATA", SATA);
            map.put("SAS", SAS);
            map.put("SSD", SSD);
            map.put("GPSSD", GPSSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CoreDataVolumeTypeEnum(String value) {
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
        public static CoreDataVolumeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CoreDataVolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CoreDataVolumeTypeEnum(value);
            }
            return result;
        }

        public static CoreDataVolumeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CoreDataVolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CoreDataVolumeTypeEnum) {
                return this.value.equals(((CoreDataVolumeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_data_volume_type")

    private CoreDataVolumeTypeEnum coreDataVolumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_data_volume_size")

    private Integer coreDataVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_data_volume_count")

    private Integer coreDataVolumeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_node_groups")

    private List<TaskNodeGroups> taskNodeGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootstrap_scripts")

    private List<BootstrapScript> bootstrapScripts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_public_cert_name")

    private String nodePublicCertName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_admin_secret")

    private String clusterAdminSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_master_secret")

    private String clusterMasterSecret;

    /** MRS集群运行模式。 - 0：普通集群，表示Kerberos认证关闭，用户可使用集群提供的所有功能。 -
     * 1：安全集群，表示Kerberos认证开启，普通用户无权限使用MRS集群的“文件管理”和“作业管理”功能，并且无法查看Hadoop、Spark的作业记录以及集群资源使用情况。如果需要使用集群更多功能，需要找MRS
     * Manager的管理员分配权限。 说明： 针对MRS 1.8.0以前的版本，仅当“safe_mode”配置为“1”时，请求消息体中包含cluster_admin_secret字段。 针对MRS
     * 1.8.0及以后版本，请求消息体中包含cluster_admin_secret字段，不受参数“safe_mode”配置的影响。 */
    public static final class SafeModeEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final SafeModeEnum NUMBER_0 = new SafeModeEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final SafeModeEnum NUMBER_1 = new SafeModeEnum(1);

        private static final Map<Integer, SafeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, SafeModeEnum> createStaticFields() {
            Map<Integer, SafeModeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        SafeModeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SafeModeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            SafeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SafeModeEnum(value);
            }
            return result;
        }

        public static SafeModeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            SafeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SafeModeEnum) {
                return this.value.equals(((SafeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "safe_mode")

    private SafeModeEnum safeMode;

    /** 集群类型。 默认值为0：分析集群。 说明：暂不支持通过接口方式创建混合集群。 枚举值： - 0：分析集群 - 1：流式集群 */
    public static final class ClusterTypeEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final ClusterTypeEnum NUMBER_0 = new ClusterTypeEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final ClusterTypeEnum NUMBER_1 = new ClusterTypeEnum(1);

        private static final Map<Integer, ClusterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ClusterTypeEnum> createStaticFields() {
            Map<Integer, ClusterTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ClusterTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ClusterTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            ClusterTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ClusterTypeEnum(value);
            }
            return result;
        }

        public static ClusterTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            ClusterTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterTypeEnum) {
                return this.value.equals(((ClusterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private ClusterTypeEnum clusterType;

    /** 集群创建失败时，是否收集失败日志。 默认设置为1，将创建OBS桶仅用于MRS集群创建失败时的日志收集。 枚举值： - 0：不收集 - 1：收集 */
    public static final class LogCollectionEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final LogCollectionEnum NUMBER_0 = new LogCollectionEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final LogCollectionEnum NUMBER_1 = new LogCollectionEnum(1);

        private static final Map<Integer, LogCollectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, LogCollectionEnum> createStaticFields() {
            Map<Integer, LogCollectionEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        LogCollectionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LogCollectionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            LogCollectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LogCollectionEnum(value);
            }
            return result;
        }

        public static LogCollectionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            LogCollectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogCollectionEnum) {
                return this.value.equals(((LogCollectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_collection")

    private LogCollectionEnum logCollection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    /** 集群登录方式。默认设置为1。 - 当“login_mode”配置为“0”时，请求消息体中包含cluster_master_secret字段。 -
     * 当“login_mode”配置为“1”时，请求消息体中包含node_public_cert_name字段。 说明： 该参数仅适用于MRS 1.6.2及以后版本的集群，MRS 1.6.2前的版本不支持。 枚举值： -
     * 0：密码方式 - 1：密钥对方式 */
    public static final class LoginModeEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final LoginModeEnum NUMBER_0 = new LoginModeEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final LoginModeEnum NUMBER_1 = new LoginModeEnum(1);

        private static final Map<Integer, LoginModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, LoginModeEnum> createStaticFields() {
            Map<Integer, LoginModeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        LoginModeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LoginModeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            LoginModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LoginModeEnum(value);
            }
            return result;
        }

        public static LoginModeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            LoginModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LoginModeEnum) {
                return this.value.equals(((LoginModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_mode")

    private LoginModeEnum loginMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_groups")

    private List<NodeGroupV11> nodeGroups = null;

    public CreateClusterReq withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /** 集群版本。 MRS目前支持MRS 1.8.10、MRS 1.9.2、MRS 2.1.0、MRS 3.0.2版本。
     * 
     * @return clusterVersion */
    public String getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public CreateClusterReq withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /** 集群名称，不允许相同。 只能由字母、数字、中划线和下划线组成，并且长度为1～64个字符。
     * 
     * @return clusterName */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateClusterReq withMasterNodeNum(Integer masterNodeNum) {
        this.masterNodeNum = masterNodeNum;
        return this;
    }

    /** Master节点数量。启用集群高可用功能时配置为2，不启用集群高可用功能时配置为1。
     * 
     * @return masterNodeNum */
    public Integer getMasterNodeNum() {
        return masterNodeNum;
    }

    public void setMasterNodeNum(Integer masterNodeNum) {
        this.masterNodeNum = masterNodeNum;
    }

    public CreateClusterReq withCoreNodeNum(Integer coreNodeNum) {
        this.coreNodeNum = coreNodeNum;
        return this;
    }

    /** Core节点数量。 取值范围：[1～500] Core节点默认的最大值为500，如果用户需要的Core节点数大于500，请申请扩大配额。 minimum: 0 maximum: 500
     * 
     * @return coreNodeNum */
    public Integer getCoreNodeNum() {
        return coreNodeNum;
    }

    public void setCoreNodeNum(Integer coreNodeNum) {
        this.coreNodeNum = coreNodeNum;
    }

    public CreateClusterReq withBillingType(BillingTypeEnum billingType) {
        this.billingType = billingType;
        return this;
    }

    /** 集群的计费模式。 12表示按需计费。接口调用仅支持创建按需计费集群。
     * 
     * @return billingType */
    public BillingTypeEnum getBillingType() {
        return billingType;
    }

    public void setBillingType(BillingTypeEnum billingType) {
        this.billingType = billingType;
    }

    public CreateClusterReq withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /** 集群区域信息，请参见[终端节点及区域](mrs_02_0003.xml)。
     * 
     * @return dataCenter */
    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public CreateClusterReq withVpc(String vpc) {
        this.vpc = vpc;
        return this;
    }

    /** 子网所在VPC名称。 通过VPC管理控制台获取名称： 1) 登录管理控制台。 2) 单击“虚拟私有云”，从左侧列表选择虚拟私有云。 在“虚拟私有云”页面的列表中即可获取VPC名称。
     * 
     * @return vpc */
    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public CreateClusterReq withMasterNodeSize(String masterNodeSize) {
        this.masterNodeSize = masterNodeSize;
        return this;
    }

    /** Master节点的实例规格，例如：c3.4xlarge.2.linux.bigdata。MRS当前支持主机规格的配型由CPU+内存+Disk共同决定。实例规格详细说明请参见[MRS所使用的弹性云服务器规格](mrs_01_9006.xml)和[MRS所使用的裸金属服务器规格](mrs_01_9001.xml)。
     * 
     * @return masterNodeSize */
    public String getMasterNodeSize() {
        return masterNodeSize;
    }

    public void setMasterNodeSize(String masterNodeSize) {
        this.masterNodeSize = masterNodeSize;
    }

    public CreateClusterReq withCoreNodeSize(String coreNodeSize) {
        this.coreNodeSize = coreNodeSize;
        return this;
    }

    /** Core节点的实例规格，例如：c3.4xlarge.2.linux.bigdata。实例规格详细说明请参见[MRS所使用的弹性云服务器规格](mrs_01_9006.xml)和[MRS所使用的裸金属服务器规格](mrs_01_9001.xml)。
     * 
     * @return coreNodeSize */
    public String getCoreNodeSize() {
        return coreNodeSize;
    }

    public void setCoreNodeSize(String coreNodeSize) {
        this.coreNodeSize = coreNodeSize;
    }

    public CreateClusterReq withComponentList(List<ComponentList> componentList) {
        this.componentList = componentList;
        return this;
    }

    public CreateClusterReq addComponentListItem(ComponentList componentListItem) {
        if (this.componentList == null) {
            this.componentList = new ArrayList<>();
        }
        this.componentList.add(componentListItem);
        return this;
    }

    public CreateClusterReq withComponentList(Consumer<List<ComponentList>> componentListSetter) {
        if (this.componentList == null) {
            this.componentList = new ArrayList<>();
        }
        componentListSetter.accept(this.componentList);
        return this;
    }

    /** 服务组件安装列表信息。
     * 
     * @return componentList */
    public List<ComponentList> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<ComponentList> componentList) {
        this.componentList = componentList;
    }

    public CreateClusterReq withAvailableZoneId(String availableZoneId) {
        this.availableZoneId = availableZoneId;
        return this;
    }

    /** 可用分区ID。 - 华北-北京一可用区1（cn-north-1a）：ae04cf9d61544df3806a3feeb401b204 -
     * 华北-北京一可用区2（cn-north-1b）：d573142f24894ef3bd3664de068b44b0 -
     * 华东-上海二可用区1（cn-east-2a）：72d50cedc49846b9b42c21495f38d81c - 华东-上海二可用区2（cn-east-2b）：38b0f7a602344246bcb0da47b5d548e7
     * - 华东-上海二可用区3（cn-east-2c）：5547fd6bf8f84bb5a7f9db062ad3d015 -
     * 华南-广州可用区1（cn-south-1a）：34f5ff4865cf4ed6b270f15382ebdec5 - 华南-广州可用区2（cn-south-2b）：043c7e39ecb347a08dc8fcb6c35a274e
     * - 华南-广州可用区3（cn-south-1c）：af1687643e8c4ec1b34b688e4e3b8901 -
     * 华北-北京四可用区1（cn-north-4a）：effdcbc7d4d64a02aa1fa26b42f56533 -
     * 华北-北京四可用区2（cn-north-4b）：a0865121f83b41cbafce65930a22a6e8 -
     * 华北-北京四可用区3（cn-north-4c）：2dcb154ac2724a6d92e9bcc859657c1e
     * 
     * @return availableZoneId */
    public String getAvailableZoneId() {
        return availableZoneId;
    }

    public void setAvailableZoneId(String availableZoneId) {
        this.availableZoneId = availableZoneId;
    }

    public CreateClusterReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 子网所在VPC ID。 通过VPC管理控制台获取ID： 1) 登录管理控制台。 2) 单击“虚拟私有云”，从左侧列表选择虚拟私有云。 在“虚拟私有云”页面的列表中即可获取VPC ID。
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateClusterReq withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /** 子网ID。通过VPC管理控制台获取子网ID： 1) 登录管理控制台。 2) 单击“虚拟私有云”，从左侧列表选择虚拟私有云。 3) 单击对应虚拟私有云所在行的“子网个数”查看子网。 4) 单击对应子网名称，获取“网络ID”。
     * “subnet_id”和“subnet_name”必须至少填写一个，当这两个参数同时配置但是不匹配同一个子网时，集群会创建失败，请仔细填写参数。
     * 
     * @return subnetId */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateClusterReq withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /** 子网名称。 通过VPC管理控制台获取子网名称： 1) 登录管理控制台。 2) 单击“虚拟私有云”，从左侧列表选择虚拟私有云。 3) 单击对应虚拟私有云所在行的“子网个数”查看子网，获取子网名称。
     * “subnet_id”和“subnet_name”必须至少填写一个，当这两个参数同时配置但是不匹配同一个子网时，集群会创建失败，请仔细填写参数。当仅填写“subnet_name”一个参数且VPC下存在同名子网时，创建集群时以VPC平台第一个名称的子网为准。
     * 
     * @return subnetName */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public CreateClusterReq withSecurityGroupsId(String securityGroupsId) {
        this.securityGroupsId = securityGroupsId;
        return this;
    }

    /** 集群安全组的ID。 - 当该ID为空时MRS后台会自己创建安全组，自动创建的安全组名称以mrs_{cluster_name}开头。 -
     * 当该ID不为空时，表示使用固定安全组来创建集群，传入的ID必须是当前租户中包含的安全组ID，且该安全组中包含一条全部协议，全部端口，源地址为指定的管理面节点IP的入方向规则。
     * 
     * @return securityGroupsId */
    public String getSecurityGroupsId() {
        return securityGroupsId;
    }

    public void setSecurityGroupsId(String securityGroupsId) {
        this.securityGroupsId = securityGroupsId;
    }

    public CreateClusterReq withAddJobs(List<AddJobs> addJobs) {
        this.addJobs = addJobs;
        return this;
    }

    public CreateClusterReq addAddJobsItem(AddJobs addJobsItem) {
        if (this.addJobs == null) {
            this.addJobs = new ArrayList<>();
        }
        this.addJobs.add(addJobsItem);
        return this;
    }

    public CreateClusterReq withAddJobs(Consumer<List<AddJobs>> addJobsSetter) {
        if (this.addJobs == null) {
            this.addJobs = new ArrayList<>();
        }
        addJobsSetter.accept(this.addJobs);
        return this;
    }

    /** 创建集群时可同时提交作业，当前版本暂时只支持新增一个作业。
     * 
     * @return addJobs */
    public List<AddJobs> getAddJobs() {
        return addJobs;
    }

    public void setAddJobs(List<AddJobs> addJobs) {
        this.addJobs = addJobs;
    }

    public CreateClusterReq withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /** Master和Core节点数据磁盘存储空间。为增大数据存储容量，创建集群时可同时添加磁盘。可以根据如下应用场景合理选择磁盘存储空间大小： -
     * 数据存储和计算分离，数据存储在OBS系统中，集群费用相对较低，计算性能不高，并且集群随时可以删除，建议数据计算不频繁场景下使用。 -
     * 数据存储和计算不分离，数据存储在HDFS中，集群费用相对较高，计算性能高，集群需要长期存在，建议数据计算频繁场景下使用。 取值范围：100GB～32000GB，传值只需填数字，不需要带单位GB。
     * 不建议使用该参数，详情请参考volume_type参数的说明。 minimum: 100 maximum: 32000
     * 
     * @return volumeSize */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public CreateClusterReq withVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /** Master和Core节点的磁盘存储类别，目前支持SATA、SAS、SSD和GPSSD。磁盘参数可以使用volume_type和volume_size表示，也可以使用多磁盘相关的参数表示。volume_type和volume_size这两个参数如果与多磁盘参数同时出现，系统优先读取volume_type和volume_size参数。建议使用多磁盘参数。
     * - SATA：普通IO - SAS：高IO - SSD：超高IO - GPSSD：通用型SSD
     * 
     * @return volumeType */
    public VolumeTypeEnum getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
    }

    public CreateClusterReq withMasterDataVolumeType(MasterDataVolumeTypeEnum masterDataVolumeType) {
        this.masterDataVolumeType = masterDataVolumeType;
        return this;
    }

    /** 该参数为多磁盘参数，表示Master节点数据磁盘存储类别，目前支持SATA、SAS、SSD和GPSSD。
     * 
     * @return masterDataVolumeType */
    public MasterDataVolumeTypeEnum getMasterDataVolumeType() {
        return masterDataVolumeType;
    }

    public void setMasterDataVolumeType(MasterDataVolumeTypeEnum masterDataVolumeType) {
        this.masterDataVolumeType = masterDataVolumeType;
    }

    public CreateClusterReq withMasterDataVolumeSize(Integer masterDataVolumeSize) {
        this.masterDataVolumeSize = masterDataVolumeSize;
        return this;
    }

    /** 该参数为多磁盘参数，表示Master节点数据磁盘存储空间。为增大数据存储容量，创建集群时可同时添加磁盘。 取值范围：100GB～32000GB，传值只需填数字，不需要带单位GB。 minimum: 100 maximum:
     * 32000
     * 
     * @return masterDataVolumeSize */
    public Integer getMasterDataVolumeSize() {
        return masterDataVolumeSize;
    }

    public void setMasterDataVolumeSize(Integer masterDataVolumeSize) {
        this.masterDataVolumeSize = masterDataVolumeSize;
    }

    public CreateClusterReq withMasterDataVolumeCount(MasterDataVolumeCountEnum masterDataVolumeCount) {
        this.masterDataVolumeCount = masterDataVolumeCount;
        return this;
    }

    /** 该参数为多磁盘参数，表示Master节点数据磁盘个数。取值只能是1。 maximum: 1
     * 
     * @return masterDataVolumeCount */
    public MasterDataVolumeCountEnum getMasterDataVolumeCount() {
        return masterDataVolumeCount;
    }

    public void setMasterDataVolumeCount(MasterDataVolumeCountEnum masterDataVolumeCount) {
        this.masterDataVolumeCount = masterDataVolumeCount;
    }

    public CreateClusterReq withCoreDataVolumeType(CoreDataVolumeTypeEnum coreDataVolumeType) {
        this.coreDataVolumeType = coreDataVolumeType;
        return this;
    }

    /** 该参数为多磁盘参数，表示Core节点数据磁盘存储类别，目前支持SATA、SAS、SSD和GPSSD。
     * 
     * @return coreDataVolumeType */
    public CoreDataVolumeTypeEnum getCoreDataVolumeType() {
        return coreDataVolumeType;
    }

    public void setCoreDataVolumeType(CoreDataVolumeTypeEnum coreDataVolumeType) {
        this.coreDataVolumeType = coreDataVolumeType;
    }

    public CreateClusterReq withCoreDataVolumeSize(Integer coreDataVolumeSize) {
        this.coreDataVolumeSize = coreDataVolumeSize;
        return this;
    }

    /** 该参数为多磁盘参数，表示Core节点数据磁盘存储空间。为增大数据存储容量，创建集群时可同时添加磁盘。 取值范围：100GB～32000GB，传值只需填数字，不需要带单位GB。 minimum: 100 maximum:
     * 32000
     * 
     * @return coreDataVolumeSize */
    public Integer getCoreDataVolumeSize() {
        return coreDataVolumeSize;
    }

    public void setCoreDataVolumeSize(Integer coreDataVolumeSize) {
        this.coreDataVolumeSize = coreDataVolumeSize;
    }

    public CreateClusterReq withCoreDataVolumeCount(Integer coreDataVolumeCount) {
        this.coreDataVolumeCount = coreDataVolumeCount;
        return this;
    }

    /** 该参数为多磁盘参数，表示Core节点数据磁盘个数。 取值范围：1～10 minimum: 1 maximum: 10
     * 
     * @return coreDataVolumeCount */
    public Integer getCoreDataVolumeCount() {
        return coreDataVolumeCount;
    }

    public void setCoreDataVolumeCount(Integer coreDataVolumeCount) {
        this.coreDataVolumeCount = coreDataVolumeCount;
    }

    public CreateClusterReq withTaskNodeGroups(List<TaskNodeGroups> taskNodeGroups) {
        this.taskNodeGroups = taskNodeGroups;
        return this;
    }

    public CreateClusterReq addTaskNodeGroupsItem(TaskNodeGroups taskNodeGroupsItem) {
        if (this.taskNodeGroups == null) {
            this.taskNodeGroups = new ArrayList<>();
        }
        this.taskNodeGroups.add(taskNodeGroupsItem);
        return this;
    }

    public CreateClusterReq withTaskNodeGroups(Consumer<List<TaskNodeGroups>> taskNodeGroupsSetter) {
        if (this.taskNodeGroups == null) {
            this.taskNodeGroups = new ArrayList<>();
        }
        taskNodeGroupsSetter.accept(this.taskNodeGroups);
        return this;
    }

    /** Task节点列表信息。
     * 
     * @return taskNodeGroups */
    public List<TaskNodeGroups> getTaskNodeGroups() {
        return taskNodeGroups;
    }

    public void setTaskNodeGroups(List<TaskNodeGroups> taskNodeGroups) {
        this.taskNodeGroups = taskNodeGroups;
    }

    public CreateClusterReq withBootstrapScripts(List<BootstrapScript> bootstrapScripts) {
        this.bootstrapScripts = bootstrapScripts;
        return this;
    }

    public CreateClusterReq addBootstrapScriptsItem(BootstrapScript bootstrapScriptsItem) {
        if (this.bootstrapScripts == null) {
            this.bootstrapScripts = new ArrayList<>();
        }
        this.bootstrapScripts.add(bootstrapScriptsItem);
        return this;
    }

    public CreateClusterReq withBootstrapScripts(Consumer<List<BootstrapScript>> bootstrapScriptsSetter) {
        if (this.bootstrapScripts == null) {
            this.bootstrapScripts = new ArrayList<>();
        }
        bootstrapScriptsSetter.accept(this.bootstrapScripts);
        return this;
    }

    /** 配置引导操作脚本信息。 MRS 1.7.2及以后版本支持该参数。
     * 
     * @return bootstrapScripts */
    public List<BootstrapScript> getBootstrapScripts() {
        return bootstrapScripts;
    }

    public void setBootstrapScripts(List<BootstrapScript> bootstrapScripts) {
        this.bootstrapScripts = bootstrapScripts;
    }

    public CreateClusterReq withNodePublicCertName(String nodePublicCertName) {
        this.nodePublicCertName = nodePublicCertName;
        return this;
    }

    /** 密钥对名称。用户可以使用密钥对方式登录集群节点。当“login_mode”配置为“1”时，请求消息体中包含node_public_cert_name字段。
     * 
     * @return nodePublicCertName */
    public String getNodePublicCertName() {
        return nodePublicCertName;
    }

    public void setNodePublicCertName(String nodePublicCertName) {
        this.nodePublicCertName = nodePublicCertName;
    }

    public CreateClusterReq withClusterAdminSecret(String clusterAdminSecret) {
        this.clusterAdminSecret = clusterAdminSecret;
        return this;
    }

    /** 配置MRS Manager管理员用户的密码。 - 密码长度应在8～32个字符之间 - 不能与用户名或者倒序用户名相同 - 必须包含如下4种中至少3种字符的组合 - 至少一个小写字母 - 至少一个大写字母 - 至少一个数字 -
     * 至少一个特殊字符：`~!@#$%^&*()-_=+\\|[{}];:'\",<.>/?和空格 说明： - 针对MRS 1.8.0以前的版本，仅当“safe_mode”配置为“1”时需要配置此参数。 - 针对MRS
     * 1.8.0及以后版本，该参数为必选参数，不受参数“safe_mode”配置的影响。
     * 
     * @return clusterAdminSecret */
    public String getClusterAdminSecret() {
        return clusterAdminSecret;
    }

    public void setClusterAdminSecret(String clusterAdminSecret) {
        this.clusterAdminSecret = clusterAdminSecret;
    }

    public CreateClusterReq withClusterMasterSecret(String clusterMasterSecret) {
        this.clusterMasterSecret = clusterMasterSecret;
        return this;
    }

    /** 配置访问集群节点的root密码。当“login_mode”配置为“0”时，请求消息体中包含cluster_master_secret字段。 密码设置约束如下： - 字符串类型，可输入的字符串长度为8-26。 -
     * 至少包含三种字符组合，如大写字母，小写字母，数字，特殊字符（!@$%^-_=+[{}]:,./?），但不能包含空格。 - 不能与用户名或者倒序用户名相同。
     * 
     * @return clusterMasterSecret */
    public String getClusterMasterSecret() {
        return clusterMasterSecret;
    }

    public void setClusterMasterSecret(String clusterMasterSecret) {
        this.clusterMasterSecret = clusterMasterSecret;
    }

    public CreateClusterReq withSafeMode(SafeModeEnum safeMode) {
        this.safeMode = safeMode;
        return this;
    }

    /** MRS集群运行模式。 - 0：普通集群，表示Kerberos认证关闭，用户可使用集群提供的所有功能。 -
     * 1：安全集群，表示Kerberos认证开启，普通用户无权限使用MRS集群的“文件管理”和“作业管理”功能，并且无法查看Hadoop、Spark的作业记录以及集群资源使用情况。如果需要使用集群更多功能，需要找MRS
     * Manager的管理员分配权限。 说明： 针对MRS 1.8.0以前的版本，仅当“safe_mode”配置为“1”时，请求消息体中包含cluster_admin_secret字段。 针对MRS
     * 1.8.0及以后版本，请求消息体中包含cluster_admin_secret字段，不受参数“safe_mode”配置的影响。
     * 
     * @return safeMode */
    public SafeModeEnum getSafeMode() {
        return safeMode;
    }

    public void setSafeMode(SafeModeEnum safeMode) {
        this.safeMode = safeMode;
    }

    public CreateClusterReq withClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /** 集群类型。 默认值为0：分析集群。 说明：暂不支持通过接口方式创建混合集群。 枚举值： - 0：分析集群 - 1：流式集群
     * 
     * @return clusterType */
    public ClusterTypeEnum getClusterType() {
        return clusterType;
    }

    public void setClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
    }

    public CreateClusterReq withLogCollection(LogCollectionEnum logCollection) {
        this.logCollection = logCollection;
        return this;
    }

    /** 集群创建失败时，是否收集失败日志。 默认设置为1，将创建OBS桶仅用于MRS集群创建失败时的日志收集。 枚举值： - 0：不收集 - 1：收集
     * 
     * @return logCollection */
    public LogCollectionEnum getLogCollection() {
        return logCollection;
    }

    public void setLogCollection(LogCollectionEnum logCollection) {
        this.logCollection = logCollection;
    }

    public CreateClusterReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID。 创建集群时，给集群绑定企业项目ID。 默认设置为0，表示为default企业项目。
     * 获取方式请参见《企业管理API参考》的“查询企业项目列表”响应消息表“enterprise_project字段数据结构说明”的“id”。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateClusterReq withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateClusterReq addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateClusterReq withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 集群的标签信息。 同一个集群最多能使用10个tag，tag的名称（key）不能重复 标签的键/值不能包含“=”,“*”,“<”,“>”,“\\”,“,”,“|”,“/”。
     * 
     * @return tags */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CreateClusterReq withLoginMode(LoginModeEnum loginMode) {
        this.loginMode = loginMode;
        return this;
    }

    /** 集群登录方式。默认设置为1。 - 当“login_mode”配置为“0”时，请求消息体中包含cluster_master_secret字段。 -
     * 当“login_mode”配置为“1”时，请求消息体中包含node_public_cert_name字段。 说明： 该参数仅适用于MRS 1.6.2及以后版本的集群，MRS 1.6.2前的版本不支持。 枚举值： -
     * 0：密码方式 - 1：密钥对方式
     * 
     * @return loginMode */
    public LoginModeEnum getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(LoginModeEnum loginMode) {
        this.loginMode = loginMode;
    }

    public CreateClusterReq withNodeGroups(List<NodeGroupV11> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }

    public CreateClusterReq addNodeGroupsItem(NodeGroupV11 nodeGroupsItem) {
        if (this.nodeGroups == null) {
            this.nodeGroups = new ArrayList<>();
        }
        this.nodeGroups.add(nodeGroupsItem);
        return this;
    }

    public CreateClusterReq withNodeGroups(Consumer<List<NodeGroupV11>> nodeGroupsSetter) {
        if (this.nodeGroups == null) {
            this.nodeGroups = new ArrayList<>();
        }
        nodeGroupsSetter.accept(this.nodeGroups);
        return this;
    }

    /** 节点列表信息。 说明：如下参数和该参数任选一组进行配置即可。
     * master_node_num、master_node_size、core_node_num、core_node_size、master_data_volume_type、master_data_volume_size、master_data_volume_count、core_data_volume_type、core_data_volume_size、core_data_volume_count、volume_type、volume_size、task_node_groups。
     * 
     * @return nodeGroups */
    public List<NodeGroupV11> getNodeGroups() {
        return nodeGroups;
    }

    public void setNodeGroups(List<NodeGroupV11> nodeGroups) {
        this.nodeGroups = nodeGroups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterReq createClusterReq = (CreateClusterReq) o;
        return Objects.equals(this.clusterVersion, createClusterReq.clusterVersion)
            && Objects.equals(this.clusterName, createClusterReq.clusterName)
            && Objects.equals(this.masterNodeNum, createClusterReq.masterNodeNum)
            && Objects.equals(this.coreNodeNum, createClusterReq.coreNodeNum)
            && Objects.equals(this.billingType, createClusterReq.billingType)
            && Objects.equals(this.dataCenter, createClusterReq.dataCenter)
            && Objects.equals(this.vpc, createClusterReq.vpc)
            && Objects.equals(this.masterNodeSize, createClusterReq.masterNodeSize)
            && Objects.equals(this.coreNodeSize, createClusterReq.coreNodeSize)
            && Objects.equals(this.componentList, createClusterReq.componentList)
            && Objects.equals(this.availableZoneId, createClusterReq.availableZoneId)
            && Objects.equals(this.vpcId, createClusterReq.vpcId)
            && Objects.equals(this.subnetId, createClusterReq.subnetId)
            && Objects.equals(this.subnetName, createClusterReq.subnetName)
            && Objects.equals(this.securityGroupsId, createClusterReq.securityGroupsId)
            && Objects.equals(this.addJobs, createClusterReq.addJobs)
            && Objects.equals(this.volumeSize, createClusterReq.volumeSize)
            && Objects.equals(this.volumeType, createClusterReq.volumeType)
            && Objects.equals(this.masterDataVolumeType, createClusterReq.masterDataVolumeType)
            && Objects.equals(this.masterDataVolumeSize, createClusterReq.masterDataVolumeSize)
            && Objects.equals(this.masterDataVolumeCount, createClusterReq.masterDataVolumeCount)
            && Objects.equals(this.coreDataVolumeType, createClusterReq.coreDataVolumeType)
            && Objects.equals(this.coreDataVolumeSize, createClusterReq.coreDataVolumeSize)
            && Objects.equals(this.coreDataVolumeCount, createClusterReq.coreDataVolumeCount)
            && Objects.equals(this.taskNodeGroups, createClusterReq.taskNodeGroups)
            && Objects.equals(this.bootstrapScripts, createClusterReq.bootstrapScripts)
            && Objects.equals(this.nodePublicCertName, createClusterReq.nodePublicCertName)
            && Objects.equals(this.clusterAdminSecret, createClusterReq.clusterAdminSecret)
            && Objects.equals(this.clusterMasterSecret, createClusterReq.clusterMasterSecret)
            && Objects.equals(this.safeMode, createClusterReq.safeMode)
            && Objects.equals(this.clusterType, createClusterReq.clusterType)
            && Objects.equals(this.logCollection, createClusterReq.logCollection)
            && Objects.equals(this.enterpriseProjectId, createClusterReq.enterpriseProjectId)
            && Objects.equals(this.tags, createClusterReq.tags)
            && Objects.equals(this.loginMode, createClusterReq.loginMode)
            && Objects.equals(this.nodeGroups, createClusterReq.nodeGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterVersion,
            clusterName,
            masterNodeNum,
            coreNodeNum,
            billingType,
            dataCenter,
            vpc,
            masterNodeSize,
            coreNodeSize,
            componentList,
            availableZoneId,
            vpcId,
            subnetId,
            subnetName,
            securityGroupsId,
            addJobs,
            volumeSize,
            volumeType,
            masterDataVolumeType,
            masterDataVolumeSize,
            masterDataVolumeCount,
            coreDataVolumeType,
            coreDataVolumeSize,
            coreDataVolumeCount,
            taskNodeGroups,
            bootstrapScripts,
            nodePublicCertName,
            clusterAdminSecret,
            clusterMasterSecret,
            safeMode,
            clusterType,
            logCollection,
            enterpriseProjectId,
            tags,
            loginMode,
            nodeGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterReq {\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    masterNodeNum: ").append(toIndentedString(masterNodeNum)).append("\n");
        sb.append("    coreNodeNum: ").append(toIndentedString(coreNodeNum)).append("\n");
        sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
        sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    masterNodeSize: ").append(toIndentedString(masterNodeSize)).append("\n");
        sb.append("    coreNodeSize: ").append(toIndentedString(coreNodeSize)).append("\n");
        sb.append("    componentList: ").append(toIndentedString(componentList)).append("\n");
        sb.append("    availableZoneId: ").append(toIndentedString(availableZoneId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    securityGroupsId: ").append(toIndentedString(securityGroupsId)).append("\n");
        sb.append("    addJobs: ").append(toIndentedString(addJobs)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    masterDataVolumeType: ").append(toIndentedString(masterDataVolumeType)).append("\n");
        sb.append("    masterDataVolumeSize: ").append(toIndentedString(masterDataVolumeSize)).append("\n");
        sb.append("    masterDataVolumeCount: ").append(toIndentedString(masterDataVolumeCount)).append("\n");
        sb.append("    coreDataVolumeType: ").append(toIndentedString(coreDataVolumeType)).append("\n");
        sb.append("    coreDataVolumeSize: ").append(toIndentedString(coreDataVolumeSize)).append("\n");
        sb.append("    coreDataVolumeCount: ").append(toIndentedString(coreDataVolumeCount)).append("\n");
        sb.append("    taskNodeGroups: ").append(toIndentedString(taskNodeGroups)).append("\n");
        sb.append("    bootstrapScripts: ").append(toIndentedString(bootstrapScripts)).append("\n");
        sb.append("    nodePublicCertName: ").append(toIndentedString(nodePublicCertName)).append("\n");
        sb.append("    clusterAdminSecret: ").append(toIndentedString(clusterAdminSecret)).append("\n");
        sb.append("    clusterMasterSecret: ").append(toIndentedString(clusterMasterSecret)).append("\n");
        sb.append("    safeMode: ").append(toIndentedString(safeMode)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    logCollection: ").append(toIndentedString(logCollection)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    loginMode: ").append(toIndentedString(loginMode)).append("\n");
        sb.append("    nodeGroups: ").append(toIndentedString(nodeGroups)).append("\n");
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
