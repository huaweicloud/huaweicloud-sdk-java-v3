package com.huaweicloud.sdk.servicestage.v3.model;

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
public class ShowEnvironmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environments")

    private List<EnvironmentListView> environments = null;

    public ShowEnvironmentsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * total number of enviroment
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowEnvironmentsResponse withEnvironments(List<EnvironmentListView> environments) {
        this.environments = environments;
        return this;
    }

    public ShowEnvironmentsResponse addEnvironmentsItem(EnvironmentListView environmentsItem) {
        if (this.environments == null) {
            this.environments = new ArrayList<>();
        }
        this.environments.add(environmentsItem);
        return this;
    }

    public ShowEnvironmentsResponse withEnvironments(Consumer<List<EnvironmentListView>> environmentsSetter) {
        if (this.environments == null) {
            this.environments = new ArrayList<>();
        }
        environmentsSetter.accept(this.environments);
        return this;
    }

    /**
     * Get environments
     * @return environments
     */
    public List<EnvironmentListView> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<EnvironmentListView> environments) {
        this.environments = environments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEnvironmentsResponse showEnvironmentsResponse = (ShowEnvironmentsResponse) o;
        return Objects.equals(this.count, showEnvironmentsResponse.count)
            && Objects.equals(this.environments, showEnvironmentsResponse.environments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, environments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEnvironmentsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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
