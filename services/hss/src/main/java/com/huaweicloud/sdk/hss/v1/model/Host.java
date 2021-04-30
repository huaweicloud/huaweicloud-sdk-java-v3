package com.huaweicloud.sdk.hss.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

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
 * Host
 */
public class Host  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agent_id")
    
    private String agentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_id")
    
    private String hostId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_name")
    
    private String hostName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_ip")
    
    private String hostIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip")
    
    private String publicIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_name")
    
    private String enterpriseProjectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private Long expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_group_name")
    
    private String policyGroupName;
    /**
     * 云主机状态：正在运行：ACTIVE; 关机：SHUTOFF; 创建中：BUILDING; 故障：ERROR;
     */
    public static final class HostStatusEnum {

        
        /**
         * Enum ACTIVE_HOST_STATUS_ACTIVE for value: "ACTIVE#HOST_STATUS_ACTIVE"
         */
        public static final HostStatusEnum ACTIVE_HOST_STATUS_ACTIVE = new HostStatusEnum("ACTIVE#HOST_STATUS_ACTIVE");
        
        /**
         * Enum SHUTOFF_HOST_STATUS_SHUTOFF for value: "SHUTOFF#HOST_STATUS_SHUTOFF"
         */
        public static final HostStatusEnum SHUTOFF_HOST_STATUS_SHUTOFF = new HostStatusEnum("SHUTOFF#HOST_STATUS_SHUTOFF");
        
        /**
         * Enum BUILDING_HOST_STATUS_BUILDING for value: "BUILDING#HOST_STATUS_BUILDING"
         */
        public static final HostStatusEnum BUILDING_HOST_STATUS_BUILDING = new HostStatusEnum("BUILDING#HOST_STATUS_BUILDING");
        
        /**
         * Enum ERROR_HOST_STATUS_ERROR for value: "ERROR#HOST_STATUS_ERROR"
         */
        public static final HostStatusEnum ERROR_HOST_STATUS_ERROR = new HostStatusEnum("ERROR#HOST_STATUS_ERROR");
        

        private static final Map<String, HostStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostStatusEnum> createStaticFields() {
            Map<String, HostStatusEnum> map = new HashMap<>();
            map.put("ACTIVE#HOST_STATUS_ACTIVE", ACTIVE_HOST_STATUS_ACTIVE);
            map.put("SHUTOFF#HOST_STATUS_SHUTOFF", SHUTOFF_HOST_STATUS_SHUTOFF);
            map.put("BUILDING#HOST_STATUS_BUILDING", BUILDING_HOST_STATUS_BUILDING);
            map.put("ERROR#HOST_STATUS_ERROR", ERROR_HOST_STATUS_ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HostStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HostStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            HostStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HostStatusEnum(value);
            }
            return result;
        }

        public static HostStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            HostStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof HostStatusEnum) {
                return this.value.equals(((HostStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_status")
    
    private HostStatusEnum hostStatus;
    /**
     * 客户端状态, 未注册：not_register; 在线：online; 离线：offline; 所有状态：all;
     */
    public static final class AgentStatusEnum {

        
        /**
         * Enum UNINSTALL_AGENT_STATUS_UNINSTALL for value: "uninstall#AGENT_STATUS_UNINSTALL"
         */
        public static final AgentStatusEnum UNINSTALL_AGENT_STATUS_UNINSTALL = new AgentStatusEnum("uninstall#AGENT_STATUS_UNINSTALL");
        
        /**
         * Enum ONLINE_AGENT_STATUS_ONLINE for value: "online#AGENT_STATUS_ONLINE"
         */
        public static final AgentStatusEnum ONLINE_AGENT_STATUS_ONLINE = new AgentStatusEnum("online#AGENT_STATUS_ONLINE");
        
        /**
         * Enum OFFLINE_AGENT_STATUS_OFFLINE for value: "offline#AGENT_STATUS_OFFLINE"
         */
        public static final AgentStatusEnum OFFLINE_AGENT_STATUS_OFFLINE = new AgentStatusEnum("offline#AGENT_STATUS_OFFLINE");
        

        private static final Map<String, AgentStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgentStatusEnum> createStaticFields() {
            Map<String, AgentStatusEnum> map = new HashMap<>();
            map.put("uninstall#AGENT_STATUS_UNINSTALL", UNINSTALL_AGENT_STATUS_UNINSTALL);
            map.put("online#AGENT_STATUS_ONLINE", ONLINE_AGENT_STATUS_ONLINE);
            map.put("offline#AGENT_STATUS_OFFLINE", OFFLINE_AGENT_STATUS_OFFLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgentStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AgentStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            AgentStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AgentStatusEnum(value);
            }
            return result;
        }

        public static AgentStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            AgentStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AgentStatusEnum) {
                return this.value.equals(((AgentStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agent_status")
    
    private AgentStatusEnum agentStatus;
    /**
     * 云主机开通的版本,hss.version.null：无； hss.version.basic：基础班；hss.version.enterprise：企业版；hss.version.premium：旗舰版；hss.version.wtp：网页防篡改版
     */
    public static final class VersionEnum {

        
        /**
         * Enum HSS_VERSION_NULL_VERSION_NULL for value: "hss.version.null#VERSION_NULL"
         */
        public static final VersionEnum HSS_VERSION_NULL_VERSION_NULL = new VersionEnum("hss.version.null#VERSION_NULL");
        
        /**
         * Enum HSS_VERSION_BASIC_VERSION_BASIC for value: "hss.version.basic#VERSION_BASIC"
         */
        public static final VersionEnum HSS_VERSION_BASIC_VERSION_BASIC = new VersionEnum("hss.version.basic#VERSION_BASIC");
        
        /**
         * Enum HSS_VERSION_ENTERPRISE_VERSION_ENTERPRISE for value: "hss.version.enterprise#VERSION_ENTERPRISE"
         */
        public static final VersionEnum HSS_VERSION_ENTERPRISE_VERSION_ENTERPRISE = new VersionEnum("hss.version.enterprise#VERSION_ENTERPRISE");
        
        /**
         * Enum HSS_VERSION_PREMIUM_VERSION_PREMIUM for value: "hss.version.premium#VERSION_PREMIUM"
         */
        public static final VersionEnum HSS_VERSION_PREMIUM_VERSION_PREMIUM = new VersionEnum("hss.version.premium#VERSION_PREMIUM");
        
        /**
         * Enum HSS_VERSION_WTP_VERSION_WTP for value: "hss.version.wtp#VERSION_WTP"
         */
        public static final VersionEnum HSS_VERSION_WTP_VERSION_WTP = new VersionEnum("hss.version.wtp#VERSION_WTP");
        

        private static final Map<String, VersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VersionEnum> createStaticFields() {
            Map<String, VersionEnum> map = new HashMap<>();
            map.put("hss.version.null#VERSION_NULL", HSS_VERSION_NULL_VERSION_NULL);
            map.put("hss.version.basic#VERSION_BASIC", HSS_VERSION_BASIC_VERSION_BASIC);
            map.put("hss.version.enterprise#VERSION_ENTERPRISE", HSS_VERSION_ENTERPRISE_VERSION_ENTERPRISE);
            map.put("hss.version.premium#VERSION_PREMIUM", HSS_VERSION_PREMIUM_VERSION_PREMIUM);
            map.put("hss.version.wtp#VERSION_WTP", HSS_VERSION_WTP_VERSION_WTP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VersionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VersionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            VersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VersionEnum(value);
            }
            return result;
        }

        public static VersionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof VersionEnum) {
                return this.value.equals(((VersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private VersionEnum version;
    /**
     * 防护状态, opened：开启；opened：关闭
     */
    public static final class ProtectStatusEnum {

        
        /**
         * Enum CLOSED_PROTECT_STATUS_CLOSED for value: "closed#PROTECT_STATUS_CLOSED"
         */
        public static final ProtectStatusEnum CLOSED_PROTECT_STATUS_CLOSED = new ProtectStatusEnum("closed#PROTECT_STATUS_CLOSED");
        
        /**
         * Enum OPENED_PROTECT_STATUS_OPENED for value: "opened#PROTECT_STATUS_OPENED"
         */
        public static final ProtectStatusEnum OPENED_PROTECT_STATUS_OPENED = new ProtectStatusEnum("opened#PROTECT_STATUS_OPENED");
        

        private static final Map<String, ProtectStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectStatusEnum> createStaticFields() {
            Map<String, ProtectStatusEnum> map = new HashMap<>();
            map.put("closed#PROTECT_STATUS_CLOSED", CLOSED_PROTECT_STATUS_CLOSED);
            map.put("opened#PROTECT_STATUS_OPENED", OPENED_PROTECT_STATUS_OPENED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtectStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProtectStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtectStatusEnum(value);
            }
            return result;
        }

        public static ProtectStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProtectStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProtectStatusEnum) {
                return this.value.equals(((ProtectStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protect_status")
    
    private ProtectStatusEnum protectStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_image")
    
    private String osImage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    private String osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_bit")
    
    private String osBit;
    /**
     * 云主机安全检测结果：undetect：未检测；clean：无风险；risk：有风险
     */
    public static final class DetectResultEnum {

        
        /**
         * Enum UNDETECT_DETECT_RESULT_UNDETECT for value: "undetect#DETECT_RESULT_UNDETECT"
         */
        public static final DetectResultEnum UNDETECT_DETECT_RESULT_UNDETECT = new DetectResultEnum("undetect#DETECT_RESULT_UNDETECT");
        
        /**
         * Enum CLEAN_DETECT_RESULT_CLEAN for value: "clean#DETECT_RESULT_CLEAN"
         */
        public static final DetectResultEnum CLEAN_DETECT_RESULT_CLEAN = new DetectResultEnum("clean#DETECT_RESULT_CLEAN");
        
        /**
         * Enum RISK_DETECT_RESULT_RISK for value: "risk#DETECT_RESULT_RISK"
         */
        public static final DetectResultEnum RISK_DETECT_RESULT_RISK = new DetectResultEnum("risk#DETECT_RESULT_RISK");
        

        private static final Map<String, DetectResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DetectResultEnum> createStaticFields() {
            Map<String, DetectResultEnum> map = new HashMap<>();
            map.put("undetect#DETECT_RESULT_UNDETECT", UNDETECT_DETECT_RESULT_UNDETECT);
            map.put("clean#DETECT_RESULT_CLEAN", CLEAN_DETECT_RESULT_CLEAN);
            map.put("risk#DETECT_RESULT_RISK", RISK_DETECT_RESULT_RISK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DetectResultEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DetectResultEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DetectResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DetectResultEnum(value);
            }
            return result;
        }

        public static DetectResultEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DetectResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DetectResultEnum) {
                return this.value.equals(((DetectResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detect_result")
    
    private DetectResultEnum detectResult;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_port_num")
    
    private Integer riskPortNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_vul_num")
    
    private Integer riskVulNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_intrusion_num")
    
    private Integer riskIntrusionNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_baseline_num")
    
    private Integer riskBaselineNum;
    /**
     * 计费模式：packet_cycle：包年包月；on_demand：按需付费
     */
    public static final class ChargingModeEnum {

        
        /**
         * Enum PACKET_CYCLE_CHARGING_MODE_PACKET_CYCLE for value: "packet_cycle#CHARGING_MODE_PACKET_CYCLE"
         */
        public static final ChargingModeEnum PACKET_CYCLE_CHARGING_MODE_PACKET_CYCLE = new ChargingModeEnum("packet_cycle#CHARGING_MODE_PACKET_CYCLE");
        
        /**
         * Enum ON_DEMAND_CHARGING_MODE_ON_DEMAND for value: "on_demand#CHARGING_MODE_ON_DEMAND"
         */
        public static final ChargingModeEnum ON_DEMAND_CHARGING_MODE_ON_DEMAND = new ChargingModeEnum("on_demand#CHARGING_MODE_ON_DEMAND");
        

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("packet_cycle#CHARGING_MODE_PACKET_CYCLE", PACKET_CYCLE_CHARGING_MODE_PACKET_CYCLE);
            map.put("on_demand#CHARGING_MODE_ON_DEMAND", ON_DEMAND_CHARGING_MODE_ON_DEMAND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargingModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargingModeEnum(value);
            }
            return result;
        }

        public static ChargingModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charging_mode")
    
    private ChargingModeEnum chargingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;

    public Host withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    


    /**
     * 云主机id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    

    public Host withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    


    /**
     * 云主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    

    public Host withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    


    /**
     * 云主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    

    public Host withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    


    /**
     * 云主机私有IP
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    

    public Host withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    


    /**
     * 云主机公网IP
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    

    public Host withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    


    /**
     * 所属企业项目名称
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    

    public Host withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    


    /**
     * 服务器组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    

    public Host withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * 服务到期时间
     * minimum: 0
     * maximum: 3857960855552
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    

    public Host withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    


    /**
     * 策略组名称
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return policyGroupName;
    }

    public void setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
    }

    

    public Host withHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    


    /**
     * 云主机状态：正在运行：ACTIVE; 关机：SHUTOFF; 创建中：BUILDING; 故障：ERROR;
     * @return hostStatus
     */
    public HostStatusEnum getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
    }

    

    public Host withAgentStatus(AgentStatusEnum agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    


    /**
     * 客户端状态, 未注册：not_register; 在线：online; 离线：offline; 所有状态：all;
     * @return agentStatus
     */
    public AgentStatusEnum getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(AgentStatusEnum agentStatus) {
        this.agentStatus = agentStatus;
    }

    

    public Host withVersion(VersionEnum version) {
        this.version = version;
        return this;
    }

    


    /**
     * 云主机开通的版本,hss.version.null：无； hss.version.basic：基础班；hss.version.enterprise：企业版；hss.version.premium：旗舰版；hss.version.wtp：网页防篡改版
     * @return version
     */
    public VersionEnum getVersion() {
        return version;
    }

    public void setVersion(VersionEnum version) {
        this.version = version;
    }

    

    public Host withProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    


    /**
     * 防护状态, opened：开启；opened：关闭
     * @return protectStatus
     */
    public ProtectStatusEnum getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
    }

    

    public Host withOsImage(String osImage) {
        this.osImage = osImage;
        return this;
    }

    


    /**
     * 系统镜像
     * @return osImage
     */
    public String getOsImage() {
        return osImage;
    }

    public void setOsImage(String osImage) {
        this.osImage = osImage;
    }

    

    public Host withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    

    public Host withOsBit(String osBit) {
        this.osBit = osBit;
        return this;
    }

    


    /**
     * 操作系统位数
     * @return osBit
     */
    public String getOsBit() {
        return osBit;
    }

    public void setOsBit(String osBit) {
        this.osBit = osBit;
    }

    

    public Host withDetectResult(DetectResultEnum detectResult) {
        this.detectResult = detectResult;
        return this;
    }

    


    /**
     * 云主机安全检测结果：undetect：未检测；clean：无风险；risk：有风险
     * @return detectResult
     */
    public DetectResultEnum getDetectResult() {
        return detectResult;
    }

    public void setDetectResult(DetectResultEnum detectResult) {
        this.detectResult = detectResult;
    }

    

    public Host withRiskPortNum(Integer riskPortNum) {
        this.riskPortNum = riskPortNum;
        return this;
    }

    


    /**
     * 资产风险个数
     * @return riskPortNum
     */
    public Integer getRiskPortNum() {
        return riskPortNum;
    }

    public void setRiskPortNum(Integer riskPortNum) {
        this.riskPortNum = riskPortNum;
    }

    

    public Host withRiskVulNum(Integer riskVulNum) {
        this.riskVulNum = riskVulNum;
        return this;
    }

    


    /**
     * 漏洞风险个数
     * @return riskVulNum
     */
    public Integer getRiskVulNum() {
        return riskVulNum;
    }

    public void setRiskVulNum(Integer riskVulNum) {
        this.riskVulNum = riskVulNum;
    }

    

    public Host withRiskIntrusionNum(Integer riskIntrusionNum) {
        this.riskIntrusionNum = riskIntrusionNum;
        return this;
    }

    


    /**
     * 入侵风险个数
     * @return riskIntrusionNum
     */
    public Integer getRiskIntrusionNum() {
        return riskIntrusionNum;
    }

    public void setRiskIntrusionNum(Integer riskIntrusionNum) {
        this.riskIntrusionNum = riskIntrusionNum;
    }

    

    public Host withRiskBaselineNum(Integer riskBaselineNum) {
        this.riskBaselineNum = riskBaselineNum;
        return this;
    }

    


    /**
     * 基线风险个数
     * @return riskBaselineNum
     */
    public Integer getRiskBaselineNum() {
        return riskBaselineNum;
    }

    public void setRiskBaselineNum(Integer riskBaselineNum) {
        this.riskBaselineNum = riskBaselineNum;
    }

    

    public Host withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 计费模式：packet_cycle：包年包月；on_demand：按需付费
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    

    public Host withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 云服务资源实例ID（UUID）
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Host host = (Host) o;
        return Objects.equals(this.agentId, host.agentId) &&
            Objects.equals(this.hostId, host.hostId) &&
            Objects.equals(this.hostName, host.hostName) &&
            Objects.equals(this.hostIp, host.hostIp) &&
            Objects.equals(this.publicIp, host.publicIp) &&
            Objects.equals(this.enterpriseProjectName, host.enterpriseProjectName) &&
            Objects.equals(this.groupName, host.groupName) &&
            Objects.equals(this.expireTime, host.expireTime) &&
            Objects.equals(this.policyGroupName, host.policyGroupName) &&
            Objects.equals(this.hostStatus, host.hostStatus) &&
            Objects.equals(this.agentStatus, host.agentStatus) &&
            Objects.equals(this.version, host.version) &&
            Objects.equals(this.protectStatus, host.protectStatus) &&
            Objects.equals(this.osImage, host.osImage) &&
            Objects.equals(this.osType, host.osType) &&
            Objects.equals(this.osBit, host.osBit) &&
            Objects.equals(this.detectResult, host.detectResult) &&
            Objects.equals(this.riskPortNum, host.riskPortNum) &&
            Objects.equals(this.riskVulNum, host.riskVulNum) &&
            Objects.equals(this.riskIntrusionNum, host.riskIntrusionNum) &&
            Objects.equals(this.riskBaselineNum, host.riskBaselineNum) &&
            Objects.equals(this.chargingMode, host.chargingMode) &&
            Objects.equals(this.resourceId, host.resourceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(agentId, hostId, hostName, hostIp, publicIp, enterpriseProjectName, groupName, expireTime, policyGroupName, hostStatus, agentStatus, version, protectStatus, osImage, osType, osBit, detectResult, riskPortNum, riskVulNum, riskIntrusionNum, riskBaselineNum, chargingMode, resourceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Host {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    osImage: ").append(toIndentedString(osImage)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
        sb.append("    detectResult: ").append(toIndentedString(detectResult)).append("\n");
        sb.append("    riskPortNum: ").append(toIndentedString(riskPortNum)).append("\n");
        sb.append("    riskVulNum: ").append(toIndentedString(riskVulNum)).append("\n");
        sb.append("    riskIntrusionNum: ").append(toIndentedString(riskIntrusionNum)).append("\n");
        sb.append("    riskBaselineNum: ").append(toIndentedString(riskBaselineNum)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

