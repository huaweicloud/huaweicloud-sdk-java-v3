package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class ResourceResult  {

    /**
     * 功能说明：根据type过滤查询指定类型的配额  取值范围：vpc，subnet，securityGroup，securityGroupRule，publicIp，vpn，vpngw，vpcPeer，firewall，shareBandwidth，shareBandwidthIP，loadbalancer，listener，physicalConnect，virtualInterface，vpcContainRoutetable，routetableContainRoutes
     */
    public static class TypeEnum {

        
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

        

        public static Map<String, TypeEnum> staticFields =
                new HashMap<String, TypeEnum>() {
                    { 
                        put("vpc", VPC);
                        put("subnet", SUBNET);
                        put("securityGroup", SECURITYGROUP);
                        put("securityGroupRule", SECURITYGROUPRULE);
                        put("publicIp", PUBLICIP);
                        put("vpn", VPN);
                        put("vpngw", VPNGW);
                        put("vpcPeer", VPCPEER);
                        put("firewall", FIREWALL);
                        put("shareBandwidth", SHAREBANDWIDTH);
                        put("shareBandwidthIP", SHAREBANDWIDTHIP);
                        put("loadbalancer", LOADBALANCER);
                        put("listener", LISTENER);
                        put("physicalConnect", PHYSICALCONNECT);
                        put("virtualInterface", VIRTUALINTERFACE);
                        put("vpcContainRoutetable", VPCCONTAINROUTETABLE);
                        put("routetableContainRoutes", ROUTETABLECONTAINROUTES);
                    }
                };

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used")
    
    private Integer used;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota")
    
    private Integer quota;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min")
    
    private Integer min;

    public ResourceResult withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 功能说明：根据type过滤查询指定类型的配额  取值范围：vpc，subnet，securityGroup，securityGroupRule，publicIp，vpn，vpngw，vpcPeer，firewall，shareBandwidth，shareBandwidthIP，loadbalancer，listener，physicalConnect，virtualInterface，vpcContainRoutetable，routetableContainRoutes
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ResourceResult withUsed(Integer used) {
        this.used = used;
        return this;
    }

    


    /**
     * 功能说明：已创建的资源个数  取值范围：0~quota数
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public ResourceResult withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    


    /**
     * 功能说明：资源的最大配额数  取值范围：各类型资源默认配额数~Integer最大值
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public ResourceResult withMin(Integer min) {
        this.min = min;
        return this;
    }

    


    /**
     * 允许修改的配额最小值
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceResult resourceResult = (ResourceResult) o;
        return Objects.equals(this.type, resourceResult.type) &&
            Objects.equals(this.used, resourceResult.used) &&
            Objects.equals(this.quota, resourceResult.quota) &&
            Objects.equals(this.min, resourceResult.min);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, used, quota, min);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceResult {\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    used: ").append(toIndentedString(used)).append("\n");
            sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
            sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

