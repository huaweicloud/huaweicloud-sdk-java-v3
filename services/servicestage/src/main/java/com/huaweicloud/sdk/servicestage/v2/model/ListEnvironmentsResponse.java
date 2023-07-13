package com.huaweicloud.sdk.servicestage.v2.model;

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
public class ListEnvironmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environments")

    private List<Environment> environments = null;

    public ListEnvironmentsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 环境总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListEnvironmentsResponse withEnvironments(List<Environment> environments) {
        this.environments = environments;
        return this;
    }

    public ListEnvironmentsResponse addEnvironmentsItem(Environment environmentsItem) {
        if (this.environments == null) {
            this.environments = new ArrayList<>();
        }
        this.environments.add(environmentsItem);
        return this;
    }

    public ListEnvironmentsResponse withEnvironments(Consumer<List<Environment>> environmentsSetter) {
        if (this.environments == null) {
            this.environments = new ArrayList<>();
        }
        environmentsSetter.accept(this.environments);
        return this;
    }

    /**
     * 环境列表。
     * @return environments
     */
    public List<Environment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<Environment> environments) {
        this.environments = environments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnvironmentsResponse that = (ListEnvironmentsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.environments, that.environments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, environments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnvironmentsResponse {\n");
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
