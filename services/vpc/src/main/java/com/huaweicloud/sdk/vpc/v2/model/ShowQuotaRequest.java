package com.huaweicloud.sdk.vpc.v2.model;




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
public class ShowQuotaRequest  {

    /**
     * 功能说明：根据type过滤查询指定类型的配额 取值范围：vpc，subnet，securityGroup，securityGroupRule，publicIp，vpn，vpngw，vpcPeer，firewall，shareBandwidth，shareBandwidthIP，loadbalancer，listener，physicalConnect，virtualInterface，vpcContainRoutetable，routetableContainRoutes
     */
    public static final class TypeEnum {

        
        /**
         * Enum VPC for value: "vpc"
         */
        public static final TypeEnum VPC = new TypeEnum("vpc");
        
        /**
         * Enum SUBNET for value: "subnet"
         */
        public static final TypeEnum SUBNET = new TypeEnum("subnet");
        
        /**
         * Enum SECURITYGROUP for value: "securityGroup"
         */
        public static final TypeEnum SECURITYGROUP = new TypeEnum("securityGroup");
        
        /**
         * Enum SECURITYGROUPRULE for value: "securityGroupRule"
         */
        public static final TypeEnum SECURITYGROUPRULE = new TypeEnum("securityGroupRule");
        
        /**
         * Enum PUBLICIP for value: "publicIp"
         */
        public static final TypeEnum PUBLICIP = new TypeEnum("publicIp");
        
        /**
         * Enum VPN for value: "vpn"
         */
        public static final TypeEnum VPN = new TypeEnum("vpn");
        
        /**
         * Enum VPNGW for value: "vpngw"
         */
        public static final TypeEnum VPNGW = new TypeEnum("vpngw");
        
        /**
         * Enum VPCPEER for value: "vpcPeer"
         */
        public static final TypeEnum VPCPEER = new TypeEnum("vpcPeer");
        
        /**
         * Enum FIREWALL for value: "firewall"
         */
        public static final TypeEnum FIREWALL = new TypeEnum("firewall");
        
        /**
         * Enum SHAREBANDWIDTH for value: "shareBandwidth"
         */
        public static final TypeEnum SHAREBANDWIDTH = new TypeEnum("shareBandwidth");
        
        /**
         * Enum SHAREBANDWIDTHIP for value: "shareBandwidthIP"
         */
        public static final TypeEnum SHAREBANDWIDTHIP = new TypeEnum("shareBandwidthIP");
        
        /**
         * Enum LOADBALANCER for value: "loadbalancer"
         */
        public static final TypeEnum LOADBALANCER = new TypeEnum("loadbalancer");
        
        /**
         * Enum LISTENER for value: "listener"
         */
        public static final TypeEnum LISTENER = new TypeEnum("listener");
        
        /**
         * Enum PHYSICALCONNECT for value: "physicalConnect"
         */
        public static final TypeEnum PHYSICALCONNECT = new TypeEnum("physicalConnect");
        
        /**
         * Enum VIRTUALINTERFACE for value: "virtualInterface"
         */
        public static final TypeEnum VIRTUALINTERFACE = new TypeEnum("virtualInterface");
        
        /**
         * Enum VPCCONTAINROUTETABLE for value: "vpcContainRoutetable"
         */
        public static final TypeEnum VPCCONTAINROUTETABLE = new TypeEnum("vpcContainRoutetable");
        
        /**
         * Enum ROUTETABLECONTAINROUTES for value: "routetableContainRoutes"
         */
        public static final TypeEnum ROUTETABLECONTAINROUTES = new TypeEnum("routetableContainRoutes");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("vpc", VPC);
            map.put("subnet", SUBNET);
            map.put("securityGroup", SECURITYGROUP);
            map.put("securityGroupRule", SECURITYGROUPRULE);
            map.put("publicIp", PUBLICIP);
            map.put("vpn", VPN);
            map.put("vpngw", VPNGW);
            map.put("vpcPeer", VPCPEER);
            map.put("firewall", FIREWALL);
            map.put("shareBandwidth", SHAREBANDWIDTH);
            map.put("shareBandwidthIP", SHAREBANDWIDTHIP);
            map.put("loadbalancer", LOADBALANCER);
            map.put("listener", LISTENER);
            map.put("physicalConnect", PHYSICALCONNECT);
            map.put("virtualInterface", VIRTUALINTERFACE);
            map.put("vpcContainRoutetable", VPCCONTAINROUTETABLE);
            map.put("routetableContainRoutes", ROUTETABLECONTAINROUTES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
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
    @JsonProperty(value="type")
    
    private TypeEnum type;

    public ShowQuotaRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 功能说明：根据type过滤查询指定类型的配额 取值范围：vpc，subnet，securityGroup，securityGroupRule，publicIp，vpn，vpngw，vpcPeer，firewall，shareBandwidth，shareBandwidthIP，loadbalancer，listener，physicalConnect，virtualInterface，vpcContainRoutetable，routetableContainRoutes
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQuotaRequest showQuotaRequest = (ShowQuotaRequest) o;
        return Objects.equals(this.type, showQuotaRequest.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotaRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

