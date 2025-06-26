package com.huaweicloud.sdk.swr.v2.model;

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
public class ShowInstanceArtifactAdditionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_histories")

    private List<BuildHistory> buildHistories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowInstanceArtifactAdditionResponse withBuildHistories(List<BuildHistory> buildHistories) {
        this.buildHistories = buildHistories;
        return this;
    }

    public ShowInstanceArtifactAdditionResponse addBuildHistoriesItem(BuildHistory buildHistoriesItem) {
        if (this.buildHistories == null) {
            this.buildHistories = new ArrayList<>();
        }
        this.buildHistories.add(buildHistoriesItem);
        return this;
    }

    public ShowInstanceArtifactAdditionResponse withBuildHistories(Consumer<List<BuildHistory>> buildHistoriesSetter) {
        if (this.buildHistories == null) {
            this.buildHistories = new ArrayList<>();
        }
        buildHistoriesSetter.accept(this.buildHistories);
        return this;
    }

    /**
     * 构建历史列表
     * @return buildHistories
     */
    public List<BuildHistory> getBuildHistories() {
        return buildHistories;
    }

    public void setBuildHistories(List<BuildHistory> buildHistories) {
        this.buildHistories = buildHistories;
    }

    public ShowInstanceArtifactAdditionResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 构建历史条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceArtifactAdditionResponse that = (ShowInstanceArtifactAdditionResponse) obj;
        return Objects.equals(this.buildHistories, that.buildHistories) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildHistories, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceArtifactAdditionResponse {\n");
        sb.append("    buildHistories: ").append(toIndentedString(buildHistories)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
