package com.huaweicloud.sdk.osm.v2.model;

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
public class ListAccessoryAccessUrlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_urls")

    private List<AccessoryUrl> accessoryUrls = null;

    public ListAccessoryAccessUrlsResponse withAccessoryUrls(List<AccessoryUrl> accessoryUrls) {
        this.accessoryUrls = accessoryUrls;
        return this;
    }

    public ListAccessoryAccessUrlsResponse addAccessoryUrlsItem(AccessoryUrl accessoryUrlsItem) {
        if (this.accessoryUrls == null) {
            this.accessoryUrls = new ArrayList<>();
        }
        this.accessoryUrls.add(accessoryUrlsItem);
        return this;
    }

    public ListAccessoryAccessUrlsResponse withAccessoryUrls(Consumer<List<AccessoryUrl>> accessoryUrlsSetter) {
        if (this.accessoryUrls == null) {
            this.accessoryUrls = new ArrayList<>();
        }
        accessoryUrlsSetter.accept(this.accessoryUrls);
        return this;
    }

    /**
     * 附件链接
     * @return accessoryUrls
     */
    public List<AccessoryUrl> getAccessoryUrls() {
        return accessoryUrls;
    }

    public void setAccessoryUrls(List<AccessoryUrl> accessoryUrls) {
        this.accessoryUrls = accessoryUrls;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAccessoryAccessUrlsResponse listAccessoryAccessUrlsResponse = (ListAccessoryAccessUrlsResponse) o;
        return Objects.equals(this.accessoryUrls, listAccessoryAccessUrlsResponse.accessoryUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessoryUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessoryAccessUrlsResponse {\n");
        sb.append("    accessoryUrls: ").append(toIndentedString(accessoryUrls)).append("\n");
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
