package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 交付信息
 */
public class DeliveryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_code")

    private String roomCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contacts")

    private List<ContactInformation> contacts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets")

    private List<AssetInfo> assets = null;

    public DeliveryInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型，收货/发货
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DeliveryInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间，UTC格式
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public DeliveryInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，UTC格式
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DeliveryInfo withRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    /**
     * 机房编码
     * @return roomCode
     */
    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public DeliveryInfo withContacts(List<ContactInformation> contacts) {
        this.contacts = contacts;
        return this;
    }

    public DeliveryInfo addContactsItem(ContactInformation contactsItem) {
        if (this.contacts == null) {
            this.contacts = new ArrayList<>();
        }
        this.contacts.add(contactsItem);
        return this;
    }

    public DeliveryInfo withContacts(Consumer<List<ContactInformation>> contactsSetter) {
        if (this.contacts == null) {
            this.contacts = new ArrayList<>();
        }
        contactsSetter.accept(this.contacts);
        return this;
    }

    /**
     * 联系人
     * @return contacts
     */
    public List<ContactInformation> getContacts() {
        return contacts;
    }

    public void setContacts(List<ContactInformation> contacts) {
        this.contacts = contacts;
    }

    public DeliveryInfo withAssets(List<AssetInfo> assets) {
        this.assets = assets;
        return this;
    }

    public DeliveryInfo addAssetsItem(AssetInfo assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    public DeliveryInfo withAssets(Consumer<List<AssetInfo>> assetsSetter) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        assetsSetter.accept(this.assets);
        return this;
    }

    /**
     * 资产清单
     * @return assets
     */
    public List<AssetInfo> getAssets() {
        return assets;
    }

    public void setAssets(List<AssetInfo> assets) {
        this.assets = assets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeliveryInfo that = (DeliveryInfo) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.roomCode, that.roomCode)
            && Objects.equals(this.contacts, that.contacts) && Objects.equals(this.assets, that.assets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, startTime, endTime, roomCode, contacts, assets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    roomCode: ").append(toIndentedString(roomCode)).append("\n");
        sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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
