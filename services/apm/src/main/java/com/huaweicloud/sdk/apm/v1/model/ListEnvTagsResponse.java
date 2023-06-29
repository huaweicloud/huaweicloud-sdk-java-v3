package com.huaweicloud.sdk.apm.v1.model;

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
public class ListEnvTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_tags")

    private List<CmdbTagEntity> envTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListEnvTagsResponse withEnvTags(List<CmdbTagEntity> envTags) {
        this.envTags = envTags;
        return this;
    }

    public ListEnvTagsResponse addEnvTagsItem(CmdbTagEntity envTagsItem) {
        if (this.envTags == null) {
            this.envTags = new ArrayList<>();
        }
        this.envTags.add(envTagsItem);
        return this;
    }

    public ListEnvTagsResponse withEnvTags(Consumer<List<CmdbTagEntity>> envTagsSetter) {
        if (this.envTags == null) {
            this.envTags = new ArrayList<>();
        }
        envTagsSetter.accept(this.envTags);
        return this;
    }

    /**
     * 环境标签数据列表。
     * @return envTags
     */
    public List<CmdbTagEntity> getEnvTags() {
        return envTags;
    }

    public void setEnvTags(List<CmdbTagEntity> envTags) {
        this.envTags = envTags;
    }

    public ListEnvTagsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总条数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnvTagsResponse that = (ListEnvTagsResponse) obj;
        return Objects.equals(this.envTags, that.envTags) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envTags, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnvTagsResponse {\n");
        sb.append("    envTags: ").append(toIndentedString(envTags)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
