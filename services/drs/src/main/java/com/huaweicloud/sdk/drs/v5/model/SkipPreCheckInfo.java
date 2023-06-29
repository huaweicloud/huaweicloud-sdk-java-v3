package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 跳过预检查项参数。
 */
public class SkipPreCheckInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skipped_precheck_list")

    private List<String> skippedPrecheckList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_reason")

    private String skipReason;

    public SkipPreCheckInfo withSkippedPrecheckList(List<String> skippedPrecheckList) {
        this.skippedPrecheckList = skippedPrecheckList;
        return this;
    }

    public SkipPreCheckInfo addSkippedPrecheckListItem(String skippedPrecheckListItem) {
        if (this.skippedPrecheckList == null) {
            this.skippedPrecheckList = new ArrayList<>();
        }
        this.skippedPrecheckList.add(skippedPrecheckListItem);
        return this;
    }

    public SkipPreCheckInfo withSkippedPrecheckList(Consumer<List<String>> skippedPrecheckListSetter) {
        if (this.skippedPrecheckList == null) {
            this.skippedPrecheckList = new ArrayList<>();
        }
        skippedPrecheckListSetter.accept(this.skippedPrecheckList);
        return this;
    }

    /**
     * 跳过的预检查项。
     * @return skippedPrecheckList
     */
    public List<String> getSkippedPrecheckList() {
        return skippedPrecheckList;
    }

    public void setSkippedPrecheckList(List<String> skippedPrecheckList) {
        this.skippedPrecheckList = skippedPrecheckList;
    }

    public SkipPreCheckInfo withSkipReason(String skipReason) {
        this.skipReason = skipReason;
        return this;
    }

    /**
     * 跳过预检查原因。
     * @return skipReason
     */
    public String getSkipReason() {
        return skipReason;
    }

    public void setSkipReason(String skipReason) {
        this.skipReason = skipReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SkipPreCheckInfo that = (SkipPreCheckInfo) obj;
        return Objects.equals(this.skippedPrecheckList, that.skippedPrecheckList)
            && Objects.equals(this.skipReason, that.skipReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skippedPrecheckList, skipReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkipPreCheckInfo {\n");
        sb.append("    skippedPrecheckList: ").append(toIndentedString(skippedPrecheckList)).append("\n");
        sb.append("    skipReason: ").append(toIndentedString(skipReason)).append("\n");
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
