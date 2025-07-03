package com.huaweicloud.sdk.ecs.v2.model;

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
public class ListLaunchTemplateVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_template_versions")

    private List<TemplateVersion> launchTemplateVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ResponsePageInfoV3 pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListLaunchTemplateVersionsResponse withLaunchTemplateVersions(List<TemplateVersion> launchTemplateVersions) {
        this.launchTemplateVersions = launchTemplateVersions;
        return this;
    }

    public ListLaunchTemplateVersionsResponse addLaunchTemplateVersionsItem(
        TemplateVersion launchTemplateVersionsItem) {
        if (this.launchTemplateVersions == null) {
            this.launchTemplateVersions = new ArrayList<>();
        }
        this.launchTemplateVersions.add(launchTemplateVersionsItem);
        return this;
    }

    public ListLaunchTemplateVersionsResponse withLaunchTemplateVersions(
        Consumer<List<TemplateVersion>> launchTemplateVersionsSetter) {
        if (this.launchTemplateVersions == null) {
            this.launchTemplateVersions = new ArrayList<>();
        }
        launchTemplateVersionsSetter.accept(this.launchTemplateVersions);
        return this;
    }

    /**
     * 模板版本列表
     * @return launchTemplateVersions
     */
    public List<TemplateVersion> getLaunchTemplateVersions() {
        return launchTemplateVersions;
    }

    public void setLaunchTemplateVersions(List<TemplateVersion> launchTemplateVersions) {
        this.launchTemplateVersions = launchTemplateVersions;
    }

    public ListLaunchTemplateVersionsResponse withPageInfo(ResponsePageInfoV3 pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListLaunchTemplateVersionsResponse withPageInfo(Consumer<ResponsePageInfoV3> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new ResponsePageInfoV3();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public ResponsePageInfoV3 getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ResponsePageInfoV3 pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListLaunchTemplateVersionsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLaunchTemplateVersionsResponse that = (ListLaunchTemplateVersionsResponse) obj;
        return Objects.equals(this.launchTemplateVersions, that.launchTemplateVersions)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(launchTemplateVersions, pageInfo, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLaunchTemplateVersionsResponse {\n");
        sb.append("    launchTemplateVersions: ").append(toIndentedString(launchTemplateVersions)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
