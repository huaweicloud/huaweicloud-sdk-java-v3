package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * direct-connect-location专线接入点详情
 */
public class DirectConnectLocationEntry {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_code")

    private String siteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private AddressBody address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locales")

    private LocalesBody locales;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_list")

    private List<ProviderResponseBody> providerList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latitude")

    private String latitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longitude")

    private String longitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_port_speeds")

    private List<String> availablePortSpeeds = null;

    public DirectConnectLocationEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 专线接入站点资源的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DirectConnectLocationEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 专线接入点的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DirectConnectLocationEntry withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Location所属Region
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public DirectConnectLocationEntry withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * 专线接入点对应的站点编码
     * @return siteCode
     */
    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public DirectConnectLocationEntry withAddress(AddressBody address) {
        this.address = address;
        return this;
    }

    public DirectConnectLocationEntry withAddress(Consumer<AddressBody> addressSetter) {
        if (this.address == null) {
            this.address = new AddressBody();
            addressSetter.accept(this.address);
        }

        return this;
    }

    /**
     * Get address
     * @return address
     */
    public AddressBody getAddress() {
        return address;
    }

    public void setAddress(AddressBody address) {
        this.address = address;
    }

    public DirectConnectLocationEntry withLocales(LocalesBody locales) {
        this.locales = locales;
        return this;
    }

    public DirectConnectLocationEntry withLocales(Consumer<LocalesBody> localesSetter) {
        if (this.locales == null) {
            this.locales = new LocalesBody();
            localesSetter.accept(this.locales);
        }

        return this;
    }

    /**
     * Get locales
     * @return locales
     */
    public LocalesBody getLocales() {
        return locales;
    }

    public void setLocales(LocalesBody locales) {
        this.locales = locales;
    }

    public DirectConnectLocationEntry withProviderList(List<ProviderResponseBody> providerList) {
        this.providerList = providerList;
        return this;
    }

    public DirectConnectLocationEntry addProviderListItem(ProviderResponseBody providerListItem) {
        if (this.providerList == null) {
            this.providerList = new ArrayList<>();
        }
        this.providerList.add(providerListItem);
        return this;
    }

    public DirectConnectLocationEntry withProviderList(Consumer<List<ProviderResponseBody>> providerListSetter) {
        if (this.providerList == null) {
            this.providerList = new ArrayList<>();
        }
        providerListSetter.accept(this.providerList);
        return this;
    }

    /**
     * 可支持的运营商列表。
     * @return providerList
     */
    public List<ProviderResponseBody> getProviderList() {
        return providerList;
    }

    public void setProviderList(List<ProviderResponseBody> providerList) {
        this.providerList = providerList;
    }

    public DirectConnectLocationEntry withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 专线接入点所属public_border_group
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public DirectConnectLocationEntry withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 地理位置纬度
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public DirectConnectLocationEntry withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 地理位置经度
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public DirectConnectLocationEntry withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DirectConnectLocationEntry withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public DirectConnectLocationEntry withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedTime
     */
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public DirectConnectLocationEntry withAvailablePortSpeeds(List<String> availablePortSpeeds) {
        this.availablePortSpeeds = availablePortSpeeds;
        return this;
    }

    public DirectConnectLocationEntry addAvailablePortSpeedsItem(String availablePortSpeedsItem) {
        if (this.availablePortSpeeds == null) {
            this.availablePortSpeeds = new ArrayList<>();
        }
        this.availablePortSpeeds.add(availablePortSpeedsItem);
        return this;
    }

    public DirectConnectLocationEntry withAvailablePortSpeeds(Consumer<List<String>> availablePortSpeedsSetter) {
        if (this.availablePortSpeeds == null) {
            this.availablePortSpeeds = new ArrayList<>();
        }
        availablePortSpeedsSetter.accept(this.availablePortSpeeds);
        return this;
    }

    /**
     * 接入点内设备可选的端口类型
     * @return availablePortSpeeds
     */
    public List<String> getAvailablePortSpeeds() {
        return availablePortSpeeds;
    }

    public void setAvailablePortSpeeds(List<String> availablePortSpeeds) {
        this.availablePortSpeeds = availablePortSpeeds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectConnectLocationEntry that = (DirectConnectLocationEntry) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.siteCode, that.siteCode)
            && Objects.equals(this.address, that.address) && Objects.equals(this.locales, that.locales)
            && Objects.equals(this.providerList, that.providerList)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.latitude, that.latitude) && Objects.equals(this.longitude, that.longitude)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.availablePortSpeeds, that.availablePortSpeeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            regionId,
            siteCode,
            address,
            locales,
            providerList,
            publicBorderGroup,
            latitude,
            longitude,
            description,
            createdTime,
            updatedTime,
            availablePortSpeeds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectConnectLocationEntry {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    providerList: ").append(toIndentedString(providerList)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    availablePortSpeeds: ").append(toIndentedString(availablePortSpeeds)).append("\n");
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
