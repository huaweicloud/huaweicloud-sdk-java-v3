package com.huaweicloud.sdk.codecraft.v5.model;

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
public class ListCompetitionWorksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "works")

    private List<ListWorksResponseModel> works = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListCompetitionWorksResponse withWorks(List<ListWorksResponseModel> works) {
        this.works = works;
        return this;
    }

    public ListCompetitionWorksResponse addWorksItem(ListWorksResponseModel worksItem) {
        if (this.works == null) {
            this.works = new ArrayList<>();
        }
        this.works.add(worksItem);
        return this;
    }

    public ListCompetitionWorksResponse withWorks(Consumer<List<ListWorksResponseModel>> worksSetter) {
        if (this.works == null) {
            this.works = new ArrayList<>();
        }
        worksSetter.accept(this.works);
        return this;
    }

    /**
     * 作品列表
     * @return works
     */
    public List<ListWorksResponseModel> getWorks() {
        return works;
    }

    public void setWorks(List<ListWorksResponseModel> works) {
        this.works = works;
    }

    public ListCompetitionWorksResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 作品总数
     * minimum: 1
     * maximum: 9999
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
        ListCompetitionWorksResponse that = (ListCompetitionWorksResponse) obj;
        return Objects.equals(this.works, that.works) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(works, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCompetitionWorksResponse {\n");
        sb.append("    works: ").append(toIndentedString(works)).append("\n");
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
