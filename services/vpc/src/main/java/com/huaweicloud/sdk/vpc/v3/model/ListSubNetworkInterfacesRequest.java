package com.huaweicloud.sdk.vpc.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSubNetworkInterfacesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private List<String> id = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="virsubnet_id")
    
    private List<String> virsubnetId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_ip_address")
    
    private List<String> privateIpAddress = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mac_address")
    
    private List<String> macAddress = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private List<String> vpcId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private List<String> description = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_id")
    
    private List<String> parentId = null;
    
    public ListSubNetworkInterfacesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSubNetworkInterfacesRequest withMarker(String marker) {
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

    public ListSubNetworkInterfacesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    
    public ListSubNetworkInterfacesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withId(Consumer<List<String>> idSetter) {
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

    public ListSubNetworkInterfacesRequest withVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    
    public ListSubNetworkInterfacesRequest addVirsubnetIdItem(String virsubnetIdItem) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        this.virsubnetId.add(virsubnetIdItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withVirsubnetId(Consumer<List<String>> virsubnetIdSetter) {
        if(this.virsubnetId == null ){
            this.virsubnetId = new ArrayList<>();
        }
        virsubnetIdSetter.accept(this.virsubnetId);
        return this;
    }

    /**
     * Get virsubnetId
     * @return virsubnetId
     */
    public List<String> getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public ListSubNetworkInterfacesRequest withPrivateIpAddress(List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    
    public ListSubNetworkInterfacesRequest addPrivateIpAddressItem(String privateIpAddressItem) {
        if (this.privateIpAddress == null) {
            this.privateIpAddress = new ArrayList<>();
        }
        this.privateIpAddress.add(privateIpAddressItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withPrivateIpAddress(Consumer<List<String>> privateIpAddressSetter) {
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

    public ListSubNetworkInterfacesRequest withMacAddress(List<String> macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    
    public ListSubNetworkInterfacesRequest addMacAddressItem(String macAddressItem) {
        if (this.macAddress == null) {
            this.macAddress = new ArrayList<>();
        }
        this.macAddress.add(macAddressItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withMacAddress(Consumer<List<String>> macAddressSetter) {
        if(this.macAddress == null ){
            this.macAddress = new ArrayList<>();
        }
        macAddressSetter.accept(this.macAddress);
        return this;
    }

    /**
     * Get macAddress
     * @return macAddress
     */
    public List<String> getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(List<String> macAddress) {
        this.macAddress = macAddress;
    }

    public ListSubNetworkInterfacesRequest withVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    
    public ListSubNetworkInterfacesRequest addVpcIdItem(String vpcIdItem) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        this.vpcId.add(vpcIdItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withVpcId(Consumer<List<String>> vpcIdSetter) {
        if(this.vpcId == null ){
            this.vpcId = new ArrayList<>();
        }
        vpcIdSetter.accept(this.vpcId);
        return this;
    }

    /**
     * Get vpcId
     * @return vpcId
     */
    public List<String> getVpcId() {
        return vpcId;
    }

    public void setVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
    }

    public ListSubNetworkInterfacesRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    
    public ListSubNetworkInterfacesRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if(this.description == null ){
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListSubNetworkInterfacesRequest withParentId(List<String> parentId) {
        this.parentId = parentId;
        return this;
    }

    
    public ListSubNetworkInterfacesRequest addParentIdItem(String parentIdItem) {
        if (this.parentId == null) {
            this.parentId = new ArrayList<>();
        }
        this.parentId.add(parentIdItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withParentId(Consumer<List<String>> parentIdSetter) {
        if(this.parentId == null ){
            this.parentId = new ArrayList<>();
        }
        parentIdSetter.accept(this.parentId);
        return this;
    }

    /**
     * Get parentId
     * @return parentId
     */
    public List<String> getParentId() {
        return parentId;
    }

    public void setParentId(List<String> parentId) {
        this.parentId = parentId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubNetworkInterfacesRequest listSubNetworkInterfacesRequest = (ListSubNetworkInterfacesRequest) o;
        return Objects.equals(this.limit, listSubNetworkInterfacesRequest.limit) &&
            Objects.equals(this.marker, listSubNetworkInterfacesRequest.marker) &&
            Objects.equals(this.id, listSubNetworkInterfacesRequest.id) &&
            Objects.equals(this.virsubnetId, listSubNetworkInterfacesRequest.virsubnetId) &&
            Objects.equals(this.privateIpAddress, listSubNetworkInterfacesRequest.privateIpAddress) &&
            Objects.equals(this.macAddress, listSubNetworkInterfacesRequest.macAddress) &&
            Objects.equals(this.vpcId, listSubNetworkInterfacesRequest.vpcId) &&
            Objects.equals(this.description, listSubNetworkInterfacesRequest.description) &&
            Objects.equals(this.parentId, listSubNetworkInterfacesRequest.parentId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, virsubnetId, privateIpAddress, macAddress, vpcId, description, parentId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubNetworkInterfacesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

