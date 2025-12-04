package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPublicIpResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_list")

    private List<PublicIpInfo> publicIpList = null;

    public ShowPublicIpResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowPublicIpResponse withPublicIpList(List<PublicIpInfo> publicIpList) {
        this.publicIpList = publicIpList;
        return this;
    }

    public ShowPublicIpResponse addPublicIpListItem(PublicIpInfo publicIpListItem) {
        if (this.publicIpList == null) {
            this.publicIpList = new ArrayList<>();
        }
        this.publicIpList.add(publicIpListItem);
        return this;
    }

    public ShowPublicIpResponse withPublicIpList(Consumer<List<PublicIpInfo>> publicIpListSetter) {
        if (this.publicIpList == null) {
            this.publicIpList = new ArrayList<>();
        }
        publicIpListSetter.accept(this.publicIpList);
        return this;
    }

    /**
     * 弹性公网IP信息。
     * @return publicIpList
     */
    public List<PublicIpInfo> getPublicIpList() {
        return publicIpList;
    }

    public void setPublicIpList(List<PublicIpInfo> publicIpList) {
        this.publicIpList = publicIpList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPublicIpResponse that = (ShowPublicIpResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.publicIpList, that.publicIpList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, publicIpList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPublicIpResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    publicIpList: ").append(toIndentedString(publicIpList)).append("\n");
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
