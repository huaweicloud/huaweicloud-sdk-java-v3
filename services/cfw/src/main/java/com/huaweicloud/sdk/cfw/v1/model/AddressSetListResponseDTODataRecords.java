package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 列表信息
 */
public class AddressSetListResponseDTODataRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_id")

    private String setId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_count")

    private Integer refCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private Integer addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_set_type")

    private Integer addressSetType;

    public AddressSetListResponseDTODataRecords withSetId(String setId) {
        this.setId = setId;
        return this;
    }

    /**
     * 地址组id
     * @return setId
     */
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public AddressSetListResponseDTODataRecords withRefCount(Integer refCount) {
        this.refCount = refCount;
        return this;
    }

    /**
     * 引用次数
     * @return refCount
     */
    public Integer getRefCount() {
        return refCount;
    }

    public void setRefCount(Integer refCount) {
        this.refCount = refCount;
    }

    public AddressSetListResponseDTODataRecords withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddressSetListResponseDTODataRecords withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 地址组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressSetListResponseDTODataRecords withAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 地址类型0 ipv4,1 ipv6
     * @return addressType
     */
    public Integer getAddressType() {
        return addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public AddressSetListResponseDTODataRecords withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 互联网边界防护对象id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)，type为0的为互联网边界防护对象id。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public AddressSetListResponseDTODataRecords withAddressSetType(Integer addressSetType) {
        this.addressSetType = addressSetType;
        return this;
    }

    /**
     * 地址组类型，0表示自定义地址组，1表示WAF回源IP地址组，2表示DDoS回源IP地址组，3表示NAT64转换地址组
     * @return addressSetType
     */
    public Integer getAddressSetType() {
        return addressSetType;
    }

    public void setAddressSetType(Integer addressSetType) {
        this.addressSetType = addressSetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddressSetListResponseDTODataRecords that = (AddressSetListResponseDTODataRecords) obj;
        return Objects.equals(this.setId, that.setId) && Objects.equals(this.refCount, that.refCount)
            && Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.addressType, that.addressType) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.addressSetType, that.addressSetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setId, refCount, description, name, addressType, objectId, addressSetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressSetListResponseDTODataRecords {\n");
        sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
        sb.append("    refCount: ").append(toIndentedString(refCount)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    addressSetType: ").append(toIndentedString(addressSetType)).append("\n");
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
