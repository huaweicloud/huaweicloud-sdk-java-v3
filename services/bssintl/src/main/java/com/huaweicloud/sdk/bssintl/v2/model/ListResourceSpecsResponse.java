package com.huaweicloud.sdk.bssintl.v2.model;

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
public class ListResourceSpecsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_basics")

    private List<CloudServiceBasic> cloudServiceBasics = null;

    public ListResourceSpecsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListResourceSpecsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListResourceSpecsResponse withCloudServiceBasics(List<CloudServiceBasic> cloudServiceBasics) {
        this.cloudServiceBasics = cloudServiceBasics;
        return this;
    }

    public ListResourceSpecsResponse addCloudServiceBasicsItem(CloudServiceBasic cloudServiceBasicsItem) {
        if (this.cloudServiceBasics == null) {
            this.cloudServiceBasics = new ArrayList<>();
        }
        this.cloudServiceBasics.add(cloudServiceBasicsItem);
        return this;
    }

    public ListResourceSpecsResponse withCloudServiceBasics(
        Consumer<List<CloudServiceBasic>> cloudServiceBasicsSetter) {
        if (this.cloudServiceBasics == null) {
            this.cloudServiceBasics = new ArrayList<>();
        }
        cloudServiceBasicsSetter.accept(this.cloudServiceBasics);
        return this;
    }

    /**
     * |参数名称：资源规格信息列表| |参数的约束及描述：资源规格信息列表|
     * @return cloudServiceBasics
     */
    public List<CloudServiceBasic> getCloudServiceBasics() {
        return cloudServiceBasics;
    }

    public void setCloudServiceBasics(List<CloudServiceBasic> cloudServiceBasics) {
        this.cloudServiceBasics = cloudServiceBasics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourceSpecsResponse that = (ListResourceSpecsResponse) obj;
        return Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.cloudServiceBasics, that.cloudServiceBasics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, cloudServiceBasics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceSpecsResponse {\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    cloudServiceBasics: ").append(toIndentedString(cloudServiceBasics)).append("\n");
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
