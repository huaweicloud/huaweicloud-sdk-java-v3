package com.huaweicloud.sdk.eip.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListPublicipsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;
    /**
     * Gets or Sets ipVersion
     */
    public static final class IpVersionEnum {

        
        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final IpVersionEnum NUMBER_4 = new IpVersionEnum(4);
        
        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final IpVersionEnum NUMBER_6 = new IpVersionEnum(6);
        

        private static final Map<Integer, IpVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IpVersionEnum> createStaticFields() {
            Map<Integer, IpVersionEnum> map = new HashMap<>();
            map.put(4, NUMBER_4);
            map.put(6, NUMBER_6);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IpVersionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IpVersionEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            IpVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IpVersionEnum(value);
            }
            return result;
        }

        public static IpVersionEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            IpVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IpVersionEnum) {
                return this.value.equals(((IpVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_version")
    
    private IpVersionEnum ipVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_id")
    
    private List<String> portId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip_address")
    
    private List<String> publicIpAddress = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_ip_address")
    
    private List<String> privateIpAddress = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private List<String> id = null;
    
    public ListPublicipsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public ListPublicipsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListPublicipsRequest withIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    


    /**
     * Get ipVersion
     * @return ipVersion
     */
    public IpVersionEnum getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
    }

    

    public ListPublicipsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ListPublicipsRequest withPortId(List<String> portId) {
        this.portId = portId;
        return this;
    }

    
    public ListPublicipsRequest addPortIdItem(String portIdItem) {
        this.portId.add(portIdItem);
        return this;
    }

    public ListPublicipsRequest withPortId(Consumer<List<String>> portIdSetter) {
        if(this.portId == null ){
            this.portId = new ArrayList<>();
        }
        portIdSetter.accept(this.portId);
        return this;
    }

    /**
     * Get portId
     * @return portId
     */
    public List<String> getPortId() {
        return portId;
    }

    public void setPortId(List<String> portId) {
        this.portId = portId;
    }

    

    public ListPublicipsRequest withPublicIpAddress(List<String> publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    
    public ListPublicipsRequest addPublicIpAddressItem(String publicIpAddressItem) {
        this.publicIpAddress.add(publicIpAddressItem);
        return this;
    }

    public ListPublicipsRequest withPublicIpAddress(Consumer<List<String>> publicIpAddressSetter) {
        if(this.publicIpAddress == null ){
            this.publicIpAddress = new ArrayList<>();
        }
        publicIpAddressSetter.accept(this.publicIpAddress);
        return this;
    }

    /**
     * Get publicIpAddress
     * @return publicIpAddress
     */
    public List<String> getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(List<String> publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    

    public ListPublicipsRequest withPrivateIpAddress(List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    
    public ListPublicipsRequest addPrivateIpAddressItem(String privateIpAddressItem) {
        this.privateIpAddress.add(privateIpAddressItem);
        return this;
    }

    public ListPublicipsRequest withPrivateIpAddress(Consumer<List<String>> privateIpAddressSetter) {
        if(this.privateIpAddress == null ){
            this.privateIpAddress = new ArrayList<>();
        }
        privateIpAddressSetter.accept(this.privateIpAddress);
        return this;
    }

    /**
     * Get privateIpAddress
     * @return privateIpAddress
     */
    public List<String> getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    

    public ListPublicipsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    
    public ListPublicipsRequest addIdItem(String idItem) {
        this.id.add(idItem);
        return this;
    }

    public ListPublicipsRequest withId(Consumer<List<String>> idSetter) {
        if(this.id == null ){
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPublicipsRequest listPublicipsRequest = (ListPublicipsRequest) o;
        return Objects.equals(this.marker, listPublicipsRequest.marker) &&
            Objects.equals(this.limit, listPublicipsRequest.limit) &&
            Objects.equals(this.ipVersion, listPublicipsRequest.ipVersion) &&
            Objects.equals(this.enterpriseProjectId, listPublicipsRequest.enterpriseProjectId) &&
            Objects.equals(this.portId, listPublicipsRequest.portId) &&
            Objects.equals(this.publicIpAddress, listPublicipsRequest.publicIpAddress) &&
            Objects.equals(this.privateIpAddress, listPublicipsRequest.privateIpAddress) &&
            Objects.equals(this.id, listPublicipsRequest.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(marker, limit, ipVersion, enterpriseProjectId, portId, publicIpAddress, privateIpAddress, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicipsRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

