package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规则地址dto
 */
public class RuleAddressDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private Integer addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_set_id")

    private String addressSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_set_name")

    private String addressSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_address_name")

    private String domainAddressName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_list_json")

    private String regionListJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_list")

    private List<IpRegionDto> regionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_set_id")

    private String domainSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_set_name")

    private String domainSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private List<String> ipAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_group")

    private List<String> addressGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_group_names")

    private List<AddressGroupVO> addressGroupNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_set_type")

    private Integer addressSetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "predefined_group")

    private List<String> predefinedGroup = null;

    public RuleAddressDto withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 地址类型0手工输入，1关联IP地址组，2域名，3地理位置，4域名组，5多对象，6域名组-网络型，7域名组-应用型。
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public RuleAddressDto withAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 地址类型0 ipv4，1 ipv6，当type为0手动输入类型时不能为空
     * @return addressType
     */
    public Integer getAddressType() {
        return addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public RuleAddressDto withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * IP地址信息，当type为0手动输入类型时不能为空
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RuleAddressDto withAddressSetId(String addressSetId) {
        this.addressSetId = addressSetId;
        return this;
    }

    /**
     * 关联IP地址组ID，当type为1关联IP地址组类型时不能为空，可通过[查询地址组列表接口](ListAddressSets.xml)查询获得，通过返回值中的data.records.set_id（.表示各对象之间层级的区分）获得。
     * @return addressSetId
     */
    public String getAddressSetId() {
        return addressSetId;
    }

    public void setAddressSetId(String addressSetId) {
        this.addressSetId = addressSetId;
    }

    public RuleAddressDto withAddressSetName(String addressSetName) {
        this.addressSetName = addressSetName;
        return this;
    }

    /**
     * 关联IP地址组名称，当type为1关联IP地址组类型时不能为空，可通过[查询地址组列表接口](ListAddressSets.xml)查询获得，通过返回值中的data.records.name（.表示各对象之间层级的区分）获得。
     * @return addressSetName
     */
    public String getAddressSetName() {
        return addressSetName;
    }

    public void setAddressSetName(String addressSetName) {
        this.addressSetName = addressSetName;
    }

    public RuleAddressDto withDomainAddressName(String domainAddressName) {
        this.domainAddressName = domainAddressName;
        return this;
    }

    /**
     * type为2（域名）和7（应用域名组）具体内容根据type中7修改后的类型名称
     * @return domainAddressName
     */
    public String getDomainAddressName() {
        return domainAddressName;
    }

    public void setDomainAddressName(String domainAddressName) {
        this.domainAddressName = domainAddressName;
    }

    public RuleAddressDto withRegionListJson(String regionListJson) {
        this.regionListJson = regionListJson;
        return this;
    }

    /**
     * 规则地域列表json值
     * @return regionListJson
     */
    public String getRegionListJson() {
        return regionListJson;
    }

    public void setRegionListJson(String regionListJson) {
        this.regionListJson = regionListJson;
    }

    public RuleAddressDto withRegionList(List<IpRegionDto> regionList) {
        this.regionList = regionList;
        return this;
    }

    public RuleAddressDto addRegionListItem(IpRegionDto regionListItem) {
        if (this.regionList == null) {
            this.regionList = new ArrayList<>();
        }
        this.regionList.add(regionListItem);
        return this;
    }

    public RuleAddressDto withRegionList(Consumer<List<IpRegionDto>> regionListSetter) {
        if (this.regionList == null) {
            this.regionList = new ArrayList<>();
        }
        regionListSetter.accept(this.regionList);
        return this;
    }

    /**
     * 规则地域列表
     * @return regionList
     */
    public List<IpRegionDto> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<IpRegionDto> regionList) {
        this.regionList = regionList;
    }

    public RuleAddressDto withDomainSetId(String domainSetId) {
        this.domainSetId = domainSetId;
        return this;
    }

    /**
     * 域名组id，type为4（域名组）或7（域名组-应用型）时不能为空。可通过[查询域名组列表接口](ListDomainSets.xml)查询获得，通过返回值中的data.records.set_id（.表示各对象之间层级的区分）获得。
     * @return domainSetId
     */
    public String getDomainSetId() {
        return domainSetId;
    }

    public void setDomainSetId(String domainSetId) {
        this.domainSetId = domainSetId;
    }

    public RuleAddressDto withDomainSetName(String domainSetName) {
        this.domainSetName = domainSetName;
        return this;
    }

    /**
     * 域名组名称，type为4（域名组）或7（域名组-应用型）时不能为空。可通过[查询域名组列表接口](ListDomainSets.xml)查询获得，通过返回值中的data.records.name（.表示各对象之间层级的区分）获得。
     * @return domainSetName
     */
    public String getDomainSetName() {
        return domainSetName;
    }

    public void setDomainSetName(String domainSetName) {
        this.domainSetName = domainSetName;
    }

    public RuleAddressDto withIpAddress(List<String> ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public RuleAddressDto addIpAddressItem(String ipAddressItem) {
        if (this.ipAddress == null) {
            this.ipAddress = new ArrayList<>();
        }
        this.ipAddress.add(ipAddressItem);
        return this;
    }

    public RuleAddressDto withIpAddress(Consumer<List<String>> ipAddressSetter) {
        if (this.ipAddress == null) {
            this.ipAddress = new ArrayList<>();
        }
        ipAddressSetter.accept(this.ipAddress);
        return this;
    }

    /**
     * IP地址列表，当type为5（多对象）时不能为空。
     * @return ipAddress
     */
    public List<String> getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(List<String> ipAddress) {
        this.ipAddress = ipAddress;
    }

    public RuleAddressDto withAddressGroup(List<String> addressGroup) {
        this.addressGroup = addressGroup;
        return this;
    }

    public RuleAddressDto addAddressGroupItem(String addressGroupItem) {
        if (this.addressGroup == null) {
            this.addressGroup = new ArrayList<>();
        }
        this.addressGroup.add(addressGroupItem);
        return this;
    }

    public RuleAddressDto withAddressGroup(Consumer<List<String>> addressGroupSetter) {
        if (this.addressGroup == null) {
            this.addressGroup = new ArrayList<>();
        }
        addressGroupSetter.accept(this.addressGroup);
        return this;
    }

    /**
     * 地址组id列表，当type为5（多对象）时不能为空。地址组id可通过[查询地址组列表接口](ListAddressSets.xml)查询获得，通过返回值中的data.records.set_id（.表示各对象之间层级的区分）获得。查询条件中query_address_set_type需要设置为0自定义地址组。
     * @return addressGroup
     */
    public List<String> getAddressGroup() {
        return addressGroup;
    }

    public void setAddressGroup(List<String> addressGroup) {
        this.addressGroup = addressGroup;
    }

    public RuleAddressDto withAddressGroupNames(List<AddressGroupVO> addressGroupNames) {
        this.addressGroupNames = addressGroupNames;
        return this;
    }

    public RuleAddressDto addAddressGroupNamesItem(AddressGroupVO addressGroupNamesItem) {
        if (this.addressGroupNames == null) {
            this.addressGroupNames = new ArrayList<>();
        }
        this.addressGroupNames.add(addressGroupNamesItem);
        return this;
    }

    public RuleAddressDto withAddressGroupNames(Consumer<List<AddressGroupVO>> addressGroupNamesSetter) {
        if (this.addressGroupNames == null) {
            this.addressGroupNames = new ArrayList<>();
        }
        addressGroupNamesSetter.accept(this.addressGroupNames);
        return this;
    }

    /**
     * 地址组名称列表
     * @return addressGroupNames
     */
    public List<AddressGroupVO> getAddressGroupNames() {
        return addressGroupNames;
    }

    public void setAddressGroupNames(List<AddressGroupVO> addressGroupNames) {
        this.addressGroupNames = addressGroupNames;
    }

    public RuleAddressDto withAddressSetType(Integer addressSetType) {
        this.addressSetType = addressSetType;
        return this;
    }

    /**
     * 地址组类型，当type为1（关联IP地址组）时不能为空。0表示自定义地址组，1表示WAF回源IP地址组，2表示DDoS回源IP地址组，3表示NAT64转换地址组
     * @return addressSetType
     */
    public Integer getAddressSetType() {
        return addressSetType;
    }

    public void setAddressSetType(Integer addressSetType) {
        this.addressSetType = addressSetType;
    }

    public RuleAddressDto withPredefinedGroup(List<String> predefinedGroup) {
        this.predefinedGroup = predefinedGroup;
        return this;
    }

    public RuleAddressDto addPredefinedGroupItem(String predefinedGroupItem) {
        if (this.predefinedGroup == null) {
            this.predefinedGroup = new ArrayList<>();
        }
        this.predefinedGroup.add(predefinedGroupItem);
        return this;
    }

    public RuleAddressDto withPredefinedGroup(Consumer<List<String>> predefinedGroupSetter) {
        if (this.predefinedGroup == null) {
            this.predefinedGroup = new ArrayList<>();
        }
        predefinedGroupSetter.accept(this.predefinedGroup);
        return this;
    }

    /**
     * 预定义地址组id列表，当type为5（多对象）时不能为空。地址组id可通过[查询地址组列表接口](ListAddressSets.xml)查询获得，通过返回值中的data.records.set_id（.表示各对象之间层级的区分）获得。查询条件中query_address_set_type需要设置为1预定义地址组。
     * @return predefinedGroup
     */
    public List<String> getPredefinedGroup() {
        return predefinedGroup;
    }

    public void setPredefinedGroup(List<String> predefinedGroup) {
        this.predefinedGroup = predefinedGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleAddressDto that = (RuleAddressDto) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.addressType, that.addressType)
            && Objects.equals(this.address, that.address) && Objects.equals(this.addressSetId, that.addressSetId)
            && Objects.equals(this.addressSetName, that.addressSetName)
            && Objects.equals(this.domainAddressName, that.domainAddressName)
            && Objects.equals(this.regionListJson, that.regionListJson)
            && Objects.equals(this.regionList, that.regionList) && Objects.equals(this.domainSetId, that.domainSetId)
            && Objects.equals(this.domainSetName, that.domainSetName) && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.addressGroup, that.addressGroup)
            && Objects.equals(this.addressGroupNames, that.addressGroupNames)
            && Objects.equals(this.addressSetType, that.addressSetType)
            && Objects.equals(this.predefinedGroup, that.predefinedGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            addressType,
            address,
            addressSetId,
            addressSetName,
            domainAddressName,
            regionListJson,
            regionList,
            domainSetId,
            domainSetName,
            ipAddress,
            addressGroup,
            addressGroupNames,
            addressSetType,
            predefinedGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleAddressDto {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    addressSetId: ").append(toIndentedString(addressSetId)).append("\n");
        sb.append("    addressSetName: ").append(toIndentedString(addressSetName)).append("\n");
        sb.append("    domainAddressName: ").append(toIndentedString(domainAddressName)).append("\n");
        sb.append("    regionListJson: ").append(toIndentedString(regionListJson)).append("\n");
        sb.append("    regionList: ").append(toIndentedString(regionList)).append("\n");
        sb.append("    domainSetId: ").append(toIndentedString(domainSetId)).append("\n");
        sb.append("    domainSetName: ").append(toIndentedString(domainSetName)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    addressGroup: ").append(toIndentedString(addressGroup)).append("\n");
        sb.append("    addressGroupNames: ").append(toIndentedString(addressGroupNames)).append("\n");
        sb.append("    addressSetType: ").append(toIndentedString(addressSetType)).append("\n");
        sb.append("    predefinedGroup: ").append(toIndentedString(predefinedGroup)).append("\n");
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
