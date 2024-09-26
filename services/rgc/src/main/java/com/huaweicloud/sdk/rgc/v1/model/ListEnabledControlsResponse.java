package com.huaweicloud.sdk.rgc.v1.model;

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
public class ListEnabledControlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled_controls")

    private List<EnabledControl> enabledControls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListEnabledControlsResponse withEnabledControls(List<EnabledControl> enabledControls) {
        this.enabledControls = enabledControls;
        return this;
    }

    public ListEnabledControlsResponse addEnabledControlsItem(EnabledControl enabledControlsItem) {
        if (this.enabledControls == null) {
            this.enabledControls = new ArrayList<>();
        }
        this.enabledControls.add(enabledControlsItem);
        return this;
    }

    public ListEnabledControlsResponse withEnabledControls(Consumer<List<EnabledControl>> enabledControlsSetter) {
        if (this.enabledControls == null) {
            this.enabledControls = new ArrayList<>();
        }
        enabledControlsSetter.accept(this.enabledControls);
        return this;
    }

    /**
     * 开启控制策略信息。
     * @return enabledControls
     */
    public List<EnabledControl> getEnabledControls() {
        return enabledControls;
    }

    public void setEnabledControls(List<EnabledControl> enabledControls) {
        this.enabledControls = enabledControls;
    }

    public ListEnabledControlsResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListEnabledControlsResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnabledControlsResponse that = (ListEnabledControlsResponse) obj;
        return Objects.equals(this.enabledControls, that.enabledControls)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabledControls, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnabledControlsResponse {\n");
        sb.append("    enabledControls: ").append(toIndentedString(enabledControls)).append("\n");
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
