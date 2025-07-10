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
public class ListControlsForAccountResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_summaries")

    private List<TargetControl> controlSummaries = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListControlsForAccountResponse withControlSummaries(List<TargetControl> controlSummaries) {
        this.controlSummaries = controlSummaries;
        return this;
    }

    public ListControlsForAccountResponse addControlSummariesItem(TargetControl controlSummariesItem) {
        if (this.controlSummaries == null) {
            this.controlSummaries = new ArrayList<>();
        }
        this.controlSummaries.add(controlSummariesItem);
        return this;
    }

    public ListControlsForAccountResponse withControlSummaries(Consumer<List<TargetControl>> controlSummariesSetter) {
        if (this.controlSummaries == null) {
            this.controlSummaries = new ArrayList<>();
        }
        controlSummariesSetter.accept(this.controlSummaries);
        return this;
    }

    /**
     * 治理策略概要。
     * @return controlSummaries
     */
    public List<TargetControl> getControlSummaries() {
        return controlSummaries;
    }

    public void setControlSummaries(List<TargetControl> controlSummaries) {
        this.controlSummaries = controlSummaries;
    }

    public ListControlsForAccountResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListControlsForAccountResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
        ListControlsForAccountResponse that = (ListControlsForAccountResponse) obj;
        return Objects.equals(this.controlSummaries, that.controlSummaries)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controlSummaries, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListControlsForAccountResponse {\n");
        sb.append("    controlSummaries: ").append(toIndentedString(controlSummaries)).append("\n");
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
