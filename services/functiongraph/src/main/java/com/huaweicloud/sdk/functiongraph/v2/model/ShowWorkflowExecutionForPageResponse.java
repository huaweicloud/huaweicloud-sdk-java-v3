package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWorkflowExecutionForPageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pager")

    private Pager pager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hisRecords")

    private FlowExecutionBriefV2 hisRecords;

    public ShowWorkflowExecutionForPageResponse withPager(Pager pager) {
        this.pager = pager;
        return this;
    }

    public ShowWorkflowExecutionForPageResponse withPager(Consumer<Pager> pagerSetter) {
        if (this.pager == null) {
            this.pager = new Pager();
            pagerSetter.accept(this.pager);
        }

        return this;
    }

    /**
     * Get pager
     * @return pager
     */
    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }

    public ShowWorkflowExecutionForPageResponse withHisRecords(FlowExecutionBriefV2 hisRecords) {
        this.hisRecords = hisRecords;
        return this;
    }

    public ShowWorkflowExecutionForPageResponse withHisRecords(Consumer<FlowExecutionBriefV2> hisRecordsSetter) {
        if (this.hisRecords == null) {
            this.hisRecords = new FlowExecutionBriefV2();
            hisRecordsSetter.accept(this.hisRecords);
        }

        return this;
    }

    /**
     * Get hisRecords
     * @return hisRecords
     */
    public FlowExecutionBriefV2 getHisRecords() {
        return hisRecords;
    }

    public void setHisRecords(FlowExecutionBriefV2 hisRecords) {
        this.hisRecords = hisRecords;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowWorkflowExecutionForPageResponse showWorkflowExecutionForPageResponse =
            (ShowWorkflowExecutionForPageResponse) o;
        return Objects.equals(this.pager, showWorkflowExecutionForPageResponse.pager)
            && Objects.equals(this.hisRecords, showWorkflowExecutionForPageResponse.hisRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pager, hisRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkflowExecutionForPageResponse {\n");
        sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
        sb.append("    hisRecords: ").append(toIndentedString(hisRecords)).append("\n");
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
