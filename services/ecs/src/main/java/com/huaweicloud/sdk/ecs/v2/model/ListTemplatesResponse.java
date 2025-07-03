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
public class ListTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_templates")

    private List<LaunchTemplate> launchTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ResponsePageInfoV3 pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListTemplatesResponse withLaunchTemplates(List<LaunchTemplate> launchTemplates) {
        this.launchTemplates = launchTemplates;
        return this;
    }

    public ListTemplatesResponse addLaunchTemplatesItem(LaunchTemplate launchTemplatesItem) {
        if (this.launchTemplates == null) {
            this.launchTemplates = new ArrayList<>();
        }
        this.launchTemplates.add(launchTemplatesItem);
        return this;
    }

    public ListTemplatesResponse withLaunchTemplates(Consumer<List<LaunchTemplate>> launchTemplatesSetter) {
        if (this.launchTemplates == null) {
            this.launchTemplates = new ArrayList<>();
        }
        launchTemplatesSetter.accept(this.launchTemplates);
        return this;
    }

    /**
     * 模板列表
     * @return launchTemplates
     */
    public List<LaunchTemplate> getLaunchTemplates() {
        return launchTemplates;
    }

    public void setLaunchTemplates(List<LaunchTemplate> launchTemplates) {
        this.launchTemplates = launchTemplates;
    }

    public ListTemplatesResponse withPageInfo(ResponsePageInfoV3 pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListTemplatesResponse withPageInfo(Consumer<ResponsePageInfoV3> pageInfoSetter) {
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

    public ListTemplatesResponse withXRequestId(String xRequestId) {
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
        ListTemplatesResponse that = (ListTemplatesResponse) obj;
        return Objects.equals(this.launchTemplates, that.launchTemplates)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(launchTemplates, pageInfo, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplatesResponse {\n");
        sb.append("    launchTemplates: ").append(toIndentedString(launchTemplates)).append("\n");
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
