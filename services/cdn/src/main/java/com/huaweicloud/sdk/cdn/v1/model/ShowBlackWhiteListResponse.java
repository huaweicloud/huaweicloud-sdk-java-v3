package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowBlackWhiteListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<String> ipList = null;

    public ShowBlackWhiteListResponse withType(Integer type) {
        this.type = type;
        return this;
    }

    /** IP类型（0：关闭IP黑白名单功能，1：黑名单，2：白名单）
     * 
     * @return type */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ShowBlackWhiteListResponse withIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }

    public ShowBlackWhiteListResponse addIpListItem(String ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public ShowBlackWhiteListResponse withIpList(Consumer<List<String>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /** IP黑白名单列表（支持掩码且有掩码的情况下IP必须是该IP段的第一个IP）
     * 
     * @return ipList */
    public List<String> getIpList() {
        return ipList;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBlackWhiteListResponse showBlackWhiteListResponse = (ShowBlackWhiteListResponse) o;
        return Objects.equals(this.type, showBlackWhiteListResponse.type)
            && Objects.equals(this.ipList, showBlackWhiteListResponse.ipList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, ipList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBlackWhiteListResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
