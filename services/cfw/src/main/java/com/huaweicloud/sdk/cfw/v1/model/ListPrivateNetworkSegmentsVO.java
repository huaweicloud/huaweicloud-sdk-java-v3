package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 私网网段信息列表 **取值范围**： 不涉及
 */
public class ListPrivateNetworkSegmentsVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_network_list")

    private List<PrivateNetworkSegmentVO> privateNetworkList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_az_list")

    private List<String> supportAzList = null;

    public ListPrivateNetworkSegmentsVO withPrivateNetworkList(List<PrivateNetworkSegmentVO> privateNetworkList) {
        this.privateNetworkList = privateNetworkList;
        return this;
    }

    public ListPrivateNetworkSegmentsVO addPrivateNetworkListItem(PrivateNetworkSegmentVO privateNetworkListItem) {
        if (this.privateNetworkList == null) {
            this.privateNetworkList = new ArrayList<>();
        }
        this.privateNetworkList.add(privateNetworkListItem);
        return this;
    }

    public ListPrivateNetworkSegmentsVO withPrivateNetworkList(
        Consumer<List<PrivateNetworkSegmentVO>> privateNetworkListSetter) {
        if (this.privateNetworkList == null) {
            this.privateNetworkList = new ArrayList<>();
        }
        privateNetworkListSetter.accept(this.privateNetworkList);
        return this;
    }

    /**
     * **参数解释**： 私网网段列表 **取值范围**： 不涉及
     * @return privateNetworkList
     */
    public List<PrivateNetworkSegmentVO> getPrivateNetworkList() {
        return privateNetworkList;
    }

    public void setPrivateNetworkList(List<PrivateNetworkSegmentVO> privateNetworkList) {
        this.privateNetworkList = privateNetworkList;
    }

    public ListPrivateNetworkSegmentsVO withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 总条数 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 300
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListPrivateNetworkSegmentsVO withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * **参数解释**： 私网网段配额 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 256
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public ListPrivateNetworkSegmentsVO withSupportAzList(List<String> supportAzList) {
        this.supportAzList = supportAzList;
        return this;
    }

    public ListPrivateNetworkSegmentsVO addSupportAzListItem(String supportAzListItem) {
        if (this.supportAzList == null) {
            this.supportAzList = new ArrayList<>();
        }
        this.supportAzList.add(supportAzListItem);
        return this;
    }

    public ListPrivateNetworkSegmentsVO withSupportAzList(Consumer<List<String>> supportAzListSetter) {
        if (this.supportAzList == null) {
            this.supportAzList = new ArrayList<>();
        }
        supportAzListSetter.accept(this.supportAzList);
        return this;
    }

    /**
     * **参数解释**： 支持的可用区列表 **取值范围**： 不涉及
     * @return supportAzList
     */
    public List<String> getSupportAzList() {
        return supportAzList;
    }

    public void setSupportAzList(List<String> supportAzList) {
        this.supportAzList = supportAzList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPrivateNetworkSegmentsVO that = (ListPrivateNetworkSegmentsVO) obj;
        return Objects.equals(this.privateNetworkList, that.privateNetworkList)
            && Objects.equals(this.total, that.total) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.supportAzList, that.supportAzList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateNetworkList, total, quota, supportAzList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateNetworkSegmentsVO {\n");
        sb.append("    privateNetworkList: ").append(toIndentedString(privateNetworkList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    supportAzList: ").append(toIndentedString(supportAzList)).append("\n");
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
