package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTerminalsBindingDesktopsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_names")

    private List<String> computerNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac")

    private String mac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_list")

    private List<String> macList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_only")

    private Boolean countOnly;

    public ListTerminalsBindingDesktopsRequest withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 桌面名。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public ListTerminalsBindingDesktopsRequest withComputerNames(List<String> computerNames) {
        this.computerNames = computerNames;
        return this;
    }

    public ListTerminalsBindingDesktopsRequest addComputerNamesItem(String computerNamesItem) {
        if (this.computerNames == null) {
            this.computerNames = new ArrayList<>();
        }
        this.computerNames.add(computerNamesItem);
        return this;
    }

    public ListTerminalsBindingDesktopsRequest withComputerNames(Consumer<List<String>> computerNamesSetter) {
        if (this.computerNames == null) {
            this.computerNames = new ArrayList<>();
        }
        computerNamesSetter.accept(this.computerNames);
        return this;
    }

    /**
     * 桌面名列表。
     * @return computerNames
     */
    public List<String> getComputerNames() {
        return computerNames;
    }

    public void setComputerNames(List<String> computerNames) {
        this.computerNames = computerNames;
    }

    public ListTerminalsBindingDesktopsRequest withMac(String mac) {
        this.mac = mac;
        return this;
    }

    /**
     * mac地址。
     * @return mac
     */
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public ListTerminalsBindingDesktopsRequest withMacList(List<String> macList) {
        this.macList = macList;
        return this;
    }

    public ListTerminalsBindingDesktopsRequest addMacListItem(String macListItem) {
        if (this.macList == null) {
            this.macList = new ArrayList<>();
        }
        this.macList.add(macListItem);
        return this;
    }

    public ListTerminalsBindingDesktopsRequest withMacList(Consumer<List<String>> macListSetter) {
        if (this.macList == null) {
            this.macList = new ArrayList<>();
        }
        macListSetter.accept(this.macList);
        return this;
    }

    /**
     * mac地址列表。
     * @return macList
     */
    public List<String> getMacList() {
        return macList;
    }

    public void setMacList(List<String> macList) {
        this.macList = macList;
    }

    public ListTerminalsBindingDesktopsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 起始数。
     * minimum: 0
     * maximum: 8000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTerminalsBindingDesktopsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 数量。
     * minimum: 0
     * maximum: 8000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTerminalsBindingDesktopsRequest withCountOnly(Boolean countOnly) {
        this.countOnly = countOnly;
        return this;
    }

    /**
     * 是否只查询结果总条数。
     * @return countOnly
     */
    public Boolean getCountOnly() {
        return countOnly;
    }

    public void setCountOnly(Boolean countOnly) {
        this.countOnly = countOnly;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTerminalsBindingDesktopsRequest that = (ListTerminalsBindingDesktopsRequest) obj;
        return Objects.equals(this.computerName, that.computerName)
            && Objects.equals(this.computerNames, that.computerNames) && Objects.equals(this.mac, that.mac)
            && Objects.equals(this.macList, that.macList) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.countOnly, that.countOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerName, computerNames, mac, macList, offset, limit, countOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTerminalsBindingDesktopsRequest {\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    computerNames: ").append(toIndentedString(computerNames)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
        sb.append("    macList: ").append(toIndentedString(macList)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    countOnly: ").append(toIndentedString(countOnly)).append("\n");
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
