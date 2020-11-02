package com.huaweicloud.sdk.elb.v2.model;




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
 * 创建负载均衡器的请求体
 */
public class CreateLoadbalancerReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_subnet_id")
    
    private String vipSubnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vip_address")
    
    private String vipAddress;
    /**
     * 负载均衡器的供应者名称。只支持vlb
     */
    public static final class ProviderEnum {

        
        /**
         * Enum VLB for value: "vlb"
         */
        public static final ProviderEnum VLB = new ProviderEnum("vlb");
        

        private static final Map<String, ProviderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderEnum> createStaticFields() {
            Map<String, ProviderEnum> map = new HashMap<>();
            map.put("vlb", VLB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderEnum(String value) {
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
        public static ProviderEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProviderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProviderEnum(value);
            }
            return result;
        }

        public static ProviderEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProviderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProviderEnum) {
                return this.value.equals(((ProviderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider")
    
    private ProviderEnum provider;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public CreateLoadbalancerReq withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 负载均衡器所在的项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CreateLoadbalancerReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 负载均衡器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateLoadbalancerReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 负载均衡器的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateLoadbalancerReq withVipSubnetId(String vipSubnetId) {
        this.vipSubnetId = vipSubnetId;
        return this;
    }

    


    /**
     * 负载均衡器所在的子网ID
     * @return vipSubnetId
     */
    public String getVipSubnetId() {
        return vipSubnetId;
    }

    public void setVipSubnetId(String vipSubnetId) {
        this.vipSubnetId = vipSubnetId;
    }

    public CreateLoadbalancerReq withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    


    /**
     * 负载均衡器的虚拟IP。
     * @return vipAddress
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public CreateLoadbalancerReq withProvider(ProviderEnum provider) {
        this.provider = provider;
        return this;
    }

    


    /**
     * 负载均衡器的供应者名称。只支持vlb
     * @return provider
     */
    public ProviderEnum getProvider() {
        return provider;
    }

    public void setProvider(ProviderEnum provider) {
        this.provider = provider;
    }

    public CreateLoadbalancerReq withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 负载均衡器的管理状态。只支持设定为true，该字段的值无实际意义。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreateLoadbalancerReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。创建负载均衡器时，给负载均衡器绑定企业项目ID。取值范围：最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。 关于企业项目ID的获取及企业项目特性的详细信息，请参见《企业管理用户指南》。
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
        CreateLoadbalancerReq createLoadbalancerReq = (CreateLoadbalancerReq) o;
        return Objects.equals(this.tenantId, createLoadbalancerReq.tenantId) &&
            Objects.equals(this.name, createLoadbalancerReq.name) &&
            Objects.equals(this.description, createLoadbalancerReq.description) &&
            Objects.equals(this.vipSubnetId, createLoadbalancerReq.vipSubnetId) &&
            Objects.equals(this.vipAddress, createLoadbalancerReq.vipAddress) &&
            Objects.equals(this.provider, createLoadbalancerReq.provider) &&
            Objects.equals(this.adminStateUp, createLoadbalancerReq.adminStateUp) &&
            Objects.equals(this.enterpriseProjectId, createLoadbalancerReq.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tenantId, name, description, vipSubnetId, vipAddress, provider, adminStateUp, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoadbalancerReq {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vipSubnetId: ").append(toIndentedString(vipSubnetId)).append("\n");
        sb.append("    vipAddress: ").append(toIndentedString(vipAddress)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
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

