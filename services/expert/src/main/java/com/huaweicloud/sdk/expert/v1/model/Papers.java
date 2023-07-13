package com.huaweicloud.sdk.expert.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Papers
 */
public class Papers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paper_ids")

    private List<String> paperIds = null;

    public Papers withPaperIds(List<String> paperIds) {
        this.paperIds = paperIds;
        return this;
    }

    public Papers addPaperIdsItem(String paperIdsItem) {
        if (this.paperIds == null) {
            this.paperIds = new ArrayList<>();
        }
        this.paperIds.add(paperIdsItem);
        return this;
    }

    public Papers withPaperIds(Consumer<List<String>> paperIdsSetter) {
        if (this.paperIds == null) {
            this.paperIds = new ArrayList<>();
        }
        paperIdsSetter.accept(this.paperIds);
        return this;
    }

    /**
     * 问卷ID
     * @return paperIds
     */
    public List<String> getPaperIds() {
        return paperIds;
    }

    public void setPaperIds(List<String> paperIds) {
        this.paperIds = paperIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Papers that = (Papers) obj;
        return Objects.equals(this.paperIds, that.paperIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paperIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Papers {\n");
        sb.append("    paperIds: ").append(toIndentedString(paperIds)).append("\n");
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
