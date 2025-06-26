package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateWhiteListRequestBody
 */
public class UpdateWhiteListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<IpInfo> ipList = null;

    public UpdateWhiteListRequestBody withIpList(List<IpInfo> ipList) {
        this.ipList = ipList;
        return this;
    }

    public UpdateWhiteListRequestBody addIpListItem(IpInfo ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public UpdateWhiteListRequestBody withIpList(Consumer<List<IpInfo>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * 白名单列表
     * @return ipList
     */
    public List<IpInfo> getIpList() {
        return ipList;
    }

    public void setIpList(List<IpInfo> ipList) {
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
        UpdateWhiteListRequestBody that = (UpdateWhiteListRequestBody) obj;
        return Objects.equals(this.ipList, that.ipList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWhiteListRequestBody {\n");
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
