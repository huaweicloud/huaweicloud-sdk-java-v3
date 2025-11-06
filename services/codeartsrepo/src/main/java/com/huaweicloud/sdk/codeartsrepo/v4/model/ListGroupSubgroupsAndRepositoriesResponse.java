package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
public class ListGroupSubgroupsAndRepositoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<SubgroupAndProjectBaseDto> body = null;

    public ListGroupSubgroupsAndRepositoriesResponse withBody(List<SubgroupAndProjectBaseDto> body) {
        this.body = body;
        return this;
    }

    public ListGroupSubgroupsAndRepositoriesResponse addBodyItem(SubgroupAndProjectBaseDto bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ListGroupSubgroupsAndRepositoriesResponse withBody(Consumer<List<SubgroupAndProjectBaseDto>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * **参数解释：** 项目下代码组和仓库列表。
     * @return body
     */
    public List<SubgroupAndProjectBaseDto> getBody() {
        return body;
    }

    public void setBody(List<SubgroupAndProjectBaseDto> body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGroupSubgroupsAndRepositoriesResponse that = (ListGroupSubgroupsAndRepositoriesResponse) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupSubgroupsAndRepositoriesResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
