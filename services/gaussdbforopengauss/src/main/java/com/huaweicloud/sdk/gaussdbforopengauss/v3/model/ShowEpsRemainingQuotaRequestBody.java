package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowEpsRemainingQuotaRequestBody
 */
public class ShowEpsRemainingQuotaRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_tags")

    private List<String> epsTags = null;

    public ShowEpsRemainingQuotaRequestBody withEpsTags(List<String> epsTags) {
        this.epsTags = epsTags;
        return this;
    }

    public ShowEpsRemainingQuotaRequestBody addEpsTagsItem(String epsTagsItem) {
        if (this.epsTags == null) {
            this.epsTags = new ArrayList<>();
        }
        this.epsTags.add(epsTagsItem);
        return this;
    }

    public ShowEpsRemainingQuotaRequestBody withEpsTags(Consumer<List<String>> epsTagsSetter) {
        if (this.epsTags == null) {
            this.epsTags = new ArrayList<>();
        }
        epsTagsSetter.accept(this.epsTags);
        return this;
    }

    /**
     * **参数解释**: 企业项目ID列表。 **约束限制**: 不涉及。
     * @return epsTags
     */
    public List<String> getEpsTags() {
        return epsTags;
    }

    public void setEpsTags(List<String> epsTags) {
        this.epsTags = epsTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEpsRemainingQuotaRequestBody that = (ShowEpsRemainingQuotaRequestBody) obj;
        return Objects.equals(this.epsTags, that.epsTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epsTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEpsRemainingQuotaRequestBody {\n");
        sb.append("    epsTags: ").append(toIndentedString(epsTags)).append("\n");
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
