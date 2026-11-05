package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AiguardCustomRegexSetBatchDeleteBody
 */
public class AiguardCustomRegexSetBatchDeleteBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_set_ids")

    private List<String> regexSetIds = null;

    public AiguardCustomRegexSetBatchDeleteBody withRegexSetIds(List<String> regexSetIds) {
        this.regexSetIds = regexSetIds;
        return this;
    }

    public AiguardCustomRegexSetBatchDeleteBody addRegexSetIdsItem(String regexSetIdsItem) {
        if (this.regexSetIds == null) {
            this.regexSetIds = new ArrayList<>();
        }
        this.regexSetIds.add(regexSetIdsItem);
        return this;
    }

    public AiguardCustomRegexSetBatchDeleteBody withRegexSetIds(Consumer<List<String>> regexSetIdsSetter) {
        if (this.regexSetIds == null) {
            this.regexSetIds = new ArrayList<>();
        }
        regexSetIdsSetter.accept(this.regexSetIds);
        return this;
    }

    /**
     * 正则库ID列表
     * @return regexSetIds
     */
    public List<String> getRegexSetIds() {
        return regexSetIds;
    }

    public void setRegexSetIds(List<String> regexSetIds) {
        this.regexSetIds = regexSetIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiguardCustomRegexSetBatchDeleteBody that = (AiguardCustomRegexSetBatchDeleteBody) obj;
        return Objects.equals(this.regexSetIds, that.regexSetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regexSetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiguardCustomRegexSetBatchDeleteBody {\n");
        sb.append("    regexSetIds: ").append(toIndentedString(regexSetIds)).append("\n");
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
