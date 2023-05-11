package com.huaweicloud.sdk.cms.v1.model;

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
public class ListAutoLaunchGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_launch_groups")

    private List<AutoLaunchGroupInfo> autoLaunchGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAutoLaunchGroupsResponse withAutoLaunchGroups(List<AutoLaunchGroupInfo> autoLaunchGroups) {
        this.autoLaunchGroups = autoLaunchGroups;
        return this;
    }

    public ListAutoLaunchGroupsResponse addAutoLaunchGroupsItem(AutoLaunchGroupInfo autoLaunchGroupsItem) {
        if (this.autoLaunchGroups == null) {
            this.autoLaunchGroups = new ArrayList<>();
        }
        this.autoLaunchGroups.add(autoLaunchGroupsItem);
        return this;
    }

    public ListAutoLaunchGroupsResponse withAutoLaunchGroups(
        Consumer<List<AutoLaunchGroupInfo>> autoLaunchGroupsSetter) {
        if (this.autoLaunchGroups == null) {
            this.autoLaunchGroups = new ArrayList<>();
        }
        autoLaunchGroupsSetter.accept(this.autoLaunchGroups);
        return this;
    }

    /**
     * autoLaunchGroup列表
     * @return autoLaunchGroups
     */
    public List<AutoLaunchGroupInfo> getAutoLaunchGroups() {
        return autoLaunchGroups;
    }

    public void setAutoLaunchGroups(List<AutoLaunchGroupInfo> autoLaunchGroups) {
        this.autoLaunchGroups = autoLaunchGroups;
    }

    public ListAutoLaunchGroupsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAutoLaunchGroupsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAutoLaunchGroupsResponse listAutoLaunchGroupsResponse = (ListAutoLaunchGroupsResponse) o;
        return Objects.equals(this.autoLaunchGroups, listAutoLaunchGroupsResponse.autoLaunchGroups)
            && Objects.equals(this.pageInfo, listAutoLaunchGroupsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoLaunchGroups, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutoLaunchGroupsResponse {\n");
        sb.append("    autoLaunchGroups: ").append(toIndentedString(autoLaunchGroups)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
