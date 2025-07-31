package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 需要删除的CI/CD标识列表
 */
public class DeleteCicdConfigurationsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_id_list")

    private List<String> cicdIdList = null;

    public DeleteCicdConfigurationsRequestBody withCicdIdList(List<String> cicdIdList) {
        this.cicdIdList = cicdIdList;
        return this;
    }

    public DeleteCicdConfigurationsRequestBody addCicdIdListItem(String cicdIdListItem) {
        if (this.cicdIdList == null) {
            this.cicdIdList = new ArrayList<>();
        }
        this.cicdIdList.add(cicdIdListItem);
        return this;
    }

    public DeleteCicdConfigurationsRequestBody withCicdIdList(Consumer<List<String>> cicdIdListSetter) {
        if (this.cicdIdList == null) {
            this.cicdIdList = new ArrayList<>();
        }
        cicdIdListSetter.accept(this.cicdIdList);
        return this;
    }

    /**
     * CI/CD标识列表
     * @return cicdIdList
     */
    public List<String> getCicdIdList() {
        return cicdIdList;
    }

    public void setCicdIdList(List<String> cicdIdList) {
        this.cicdIdList = cicdIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCicdConfigurationsRequestBody that = (DeleteCicdConfigurationsRequestBody) obj;
        return Objects.equals(this.cicdIdList, that.cicdIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cicdIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCicdConfigurationsRequestBody {\n");
        sb.append("    cicdIdList: ").append(toIndentedString(cicdIdList)).append("\n");
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
