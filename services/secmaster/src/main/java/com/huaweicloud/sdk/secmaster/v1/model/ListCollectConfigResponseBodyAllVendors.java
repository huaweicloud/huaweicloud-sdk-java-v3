package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListCollectConfigResponseBodyAllVendors
 */
public class ListCollectConfigResponseBodyAllVendors {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_vendor")

    private String cloudVendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csvc_list")

    private List<ListCollectConfigResponseBodyCsvcList> csvcList = null;

    public ListCollectConfigResponseBodyAllVendors withCloudVendor(String cloudVendor) {
        this.cloudVendor = cloudVendor;
        return this;
    }

    /**
     * 云厂商ID
     * @return cloudVendor
     */
    public String getCloudVendor() {
        return cloudVendor;
    }

    public void setCloudVendor(String cloudVendor) {
        this.cloudVendor = cloudVendor;
    }

    public ListCollectConfigResponseBodyAllVendors withCsvcList(List<ListCollectConfigResponseBodyCsvcList> csvcList) {
        this.csvcList = csvcList;
        return this;
    }

    public ListCollectConfigResponseBodyAllVendors addCsvcListItem(ListCollectConfigResponseBodyCsvcList csvcListItem) {
        if (this.csvcList == null) {
            this.csvcList = new ArrayList<>();
        }
        this.csvcList.add(csvcListItem);
        return this;
    }

    public ListCollectConfigResponseBodyAllVendors withCsvcList(
        Consumer<List<ListCollectConfigResponseBodyCsvcList>> csvcListSetter) {
        if (this.csvcList == null) {
            this.csvcList = new ArrayList<>();
        }
        csvcListSetter.accept(this.csvcList);
        return this;
    }

    /**
     * 所有的云产品
     * @return csvcList
     */
    public List<ListCollectConfigResponseBodyCsvcList> getCsvcList() {
        return csvcList;
    }

    public void setCsvcList(List<ListCollectConfigResponseBodyCsvcList> csvcList) {
        this.csvcList = csvcList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectConfigResponseBodyAllVendors that = (ListCollectConfigResponseBodyAllVendors) obj;
        return Objects.equals(this.cloudVendor, that.cloudVendor) && Objects.equals(this.csvcList, that.csvcList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudVendor, csvcList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectConfigResponseBodyAllVendors {\n");
        sb.append("    cloudVendor: ").append(toIndentedString(cloudVendor)).append("\n");
        sb.append("    csvcList: ").append(toIndentedString(csvcList)).append("\n");
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
