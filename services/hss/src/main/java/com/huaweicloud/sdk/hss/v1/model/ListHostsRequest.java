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
 * Request Object
 */
public class ListHostsRequest  {

    /**
     * Gets or Sets version
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
     * Gets or Sets agentStatus
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
     * Gets or Sets hostStatus
     */
    public static final class HostStatusEnum {

        
        /**
         * Enum ACTIVE_HOST_STATUS_ACTIVE for value: "active#HOST_STATUS_ACTIVE"
         */
        public static final HostStatusEnum ACTIVE_HOST_STATUS_ACTIVE = new HostStatusEnum("active#HOST_STATUS_ACTIVE");
        
        /**
         * Enum SHUTOFF_HOST_STATUS_SHUTOFF for value: "shutoff#HOST_STATUS_SHUTOFF"
         */
        public static final HostStatusEnum SHUTOFF_HOST_STATUS_SHUTOFF = new HostStatusEnum("shutoff#HOST_STATUS_SHUTOFF");
        
        /**
         * Enum BUILDING_HOST_STATUS_BUILDING for value: "building#HOST_STATUS_BUILDING"
         */
        public static final HostStatusEnum BUILDING_HOST_STATUS_BUILDING = new HostStatusEnum("building#HOST_STATUS_BUILDING");
        
        /**
         * Enum ERROR_HOST_STATUS_ERROR for value: "error#HOST_STATUS_ERROR"
         */
        public static final HostStatusEnum ERROR_HOST_STATUS_ERROR = new HostStatusEnum("error#HOST_STATUS_ERROR");
        

        private static final Map<String, HostStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostStatusEnum> createStaticFields() {
            Map<String, HostStatusEnum> map = new HashMap<>();
            map.put("active#HOST_STATUS_ACTIVE", ACTIVE_HOST_STATUS_ACTIVE);
            map.put("shutoff#HOST_STATUS_SHUTOFF", SHUTOFF_HOST_STATUS_SHUTOFF);
            map.put("building#HOST_STATUS_BUILDING", BUILDING_HOST_STATUS_BUILDING);
            map.put("error#HOST_STATUS_ERROR", ERROR_HOST_STATUS_ERROR);
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
     * Gets or Sets protectStatus
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
    /**
     * Gets or Sets detectResult
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
    @JsonProperty(value="host_name")
    
    private String hostName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_ip")
    
    private String hostIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip")
    
    private String publicIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    private String osType;
    /**
     * Gets or Sets chargingMode
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
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;

    public ListHostsRequest withVersion(VersionEnum version) {
        this.version = version;
        return this;
    }

    


    /**
     * Get version
     * @return version
     */
    public VersionEnum getVersion() {
        return version;
    }

    public void setVersion(VersionEnum version) {
        this.version = version;
    }

    

    public ListHostsRequest withAgentStatus(AgentStatusEnum agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    


    /**
     * Get agentStatus
     * @return agentStatus
     */
    public AgentStatusEnum getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(AgentStatusEnum agentStatus) {
        this.agentStatus = agentStatus;
    }

    

    public ListHostsRequest withHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    


    /**
     * Get hostStatus
     * @return hostStatus
     */
    public HostStatusEnum getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
    }

    

    public ListHostsRequest withProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    


    /**
     * Get protectStatus
     * @return protectStatus
     */
    public ProtectStatusEnum getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
    }

    

    public ListHostsRequest withDetectResult(DetectResultEnum detectResult) {
        this.detectResult = detectResult;
        return this;
    }

    


    /**
     * Get detectResult
     * @return detectResult
     */
    public DetectResultEnum getDetectResult() {
        return detectResult;
    }

    public void setDetectResult(DetectResultEnum detectResult) {
        this.detectResult = detectResult;
    }

    

    public ListHostsRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    


    /**
     * Get hostName
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    

    public ListHostsRequest withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    


    /**
     * Get hostIp
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    

    public ListHostsRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    


    /**
     * Get publicIp
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    

    public ListHostsRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * Get osType
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    

    public ListHostsRequest withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * Get chargingMode
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    

    public ListHostsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 10240
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListHostsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 10240
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHostsRequest listHostsRequest = (ListHostsRequest) o;
        return Objects.equals(this.version, listHostsRequest.version) &&
            Objects.equals(this.agentStatus, listHostsRequest.agentStatus) &&
            Objects.equals(this.hostStatus, listHostsRequest.hostStatus) &&
            Objects.equals(this.protectStatus, listHostsRequest.protectStatus) &&
            Objects.equals(this.detectResult, listHostsRequest.detectResult) &&
            Objects.equals(this.hostName, listHostsRequest.hostName) &&
            Objects.equals(this.hostIp, listHostsRequest.hostIp) &&
            Objects.equals(this.publicIp, listHostsRequest.publicIp) &&
            Objects.equals(this.osType, listHostsRequest.osType) &&
            Objects.equals(this.chargingMode, listHostsRequest.chargingMode) &&
            Objects.equals(this.limit, listHostsRequest.limit) &&
            Objects.equals(this.offset, listHostsRequest.offset);
    }
    @Override
    public int hashCode() {
        return Objects.hash(version, agentStatus, hostStatus, protectStatus, detectResult, hostName, hostIp, publicIp, osType, chargingMode, limit, offset);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostsRequest {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    detectResult: ").append(toIndentedString(detectResult)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

