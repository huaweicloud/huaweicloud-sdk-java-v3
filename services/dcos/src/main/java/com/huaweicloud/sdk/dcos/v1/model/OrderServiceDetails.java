package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工单服务详情
 */
public class OrderServiceDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devices")

    private List<DeviceServiceDetails> devices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets")

    private List<AssetServiceDetails> assets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contacts")

    private List<ContactServiceDetails> contacts = null;

    public OrderServiceDetails withDevices(List<DeviceServiceDetails> devices) {
        this.devices = devices;
        return this;
    }

    public OrderServiceDetails addDevicesItem(DeviceServiceDetails devicesItem) {
        if (this.devices == null) {
            this.devices = new ArrayList<>();
        }
        this.devices.add(devicesItem);
        return this;
    }

    public OrderServiceDetails withDevices(Consumer<List<DeviceServiceDetails>> devicesSetter) {
        if (this.devices == null) {
            this.devices = new ArrayList<>();
        }
        devicesSetter.accept(this.devices);
        return this;
    }

    /**
     * 服务设备对象
     * @return devices
     */
    public List<DeviceServiceDetails> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceServiceDetails> devices) {
        this.devices = devices;
    }

    public OrderServiceDetails withAssets(List<AssetServiceDetails> assets) {
        this.assets = assets;
        return this;
    }

    public OrderServiceDetails addAssetsItem(AssetServiceDetails assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    public OrderServiceDetails withAssets(Consumer<List<AssetServiceDetails>> assetsSetter) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        assetsSetter.accept(this.assets);
        return this;
    }

    /**
     * 资产对象
     * @return assets
     */
    public List<AssetServiceDetails> getAssets() {
        return assets;
    }

    public void setAssets(List<AssetServiceDetails> assets) {
        this.assets = assets;
    }

    public OrderServiceDetails withContacts(List<ContactServiceDetails> contacts) {
        this.contacts = contacts;
        return this;
    }

    public OrderServiceDetails addContactsItem(ContactServiceDetails contactsItem) {
        if (this.contacts == null) {
            this.contacts = new ArrayList<>();
        }
        this.contacts.add(contactsItem);
        return this;
    }

    public OrderServiceDetails withContacts(Consumer<List<ContactServiceDetails>> contactsSetter) {
        if (this.contacts == null) {
            this.contacts = new ArrayList<>();
        }
        contactsSetter.accept(this.contacts);
        return this;
    }

    /**
     * 人员信息
     * @return contacts
     */
    public List<ContactServiceDetails> getContacts() {
        return contacts;
    }

    public void setContacts(List<ContactServiceDetails> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderServiceDetails that = (OrderServiceDetails) obj;
        return Objects.equals(this.devices, that.devices) && Objects.equals(this.assets, that.assets)
            && Objects.equals(this.contacts, that.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devices, assets, contacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderServiceDetails {\n");
        sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
