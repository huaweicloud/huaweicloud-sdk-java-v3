package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BlackWhiteListBody
 */
public class BlackWhiteListBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<String> ipList = null;

    public BlackWhiteListBody withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * IP黑白名单类型（0：关闭IP黑白名单功能，1：黑名单，2：白名单）。
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BlackWhiteListBody withIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }

    public BlackWhiteListBody addIpListItem(String ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public BlackWhiteListBody withIpList(Consumer<List<String>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * IP黑白名单列表。
     * @return ipList
     */
    public List<String> getIpList() {
        return ipList;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BlackWhiteListBody that = (BlackWhiteListBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.ipList, that.ipList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, ipList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlackWhiteListBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
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
