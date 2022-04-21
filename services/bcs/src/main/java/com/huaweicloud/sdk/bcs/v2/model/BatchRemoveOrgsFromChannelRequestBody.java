package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchRemoveOrgsFromChannelRequestBody
 */
public class BatchRemoveOrgsFromChannelRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_names")

    private List<String> orgNames = null;

    public BatchRemoveOrgsFromChannelRequestBody withOrgNames(List<String> orgNames) {
        this.orgNames = orgNames;
        return this;
    }

    public BatchRemoveOrgsFromChannelRequestBody addOrgNamesItem(String orgNamesItem) {
        if (this.orgNames == null) {
            this.orgNames = new ArrayList<>();
        }
        this.orgNames.add(orgNamesItem);
        return this;
    }

    public BatchRemoveOrgsFromChannelRequestBody withOrgNames(Consumer<List<String>> orgNamesSetter) {
        if (this.orgNames == null) {
            this.orgNames = new ArrayList<>();
        }
        orgNamesSetter.accept(this.orgNames);
        return this;
    }

    /**
     * 组织名称列表
     * @return orgNames
     */
    public List<String> getOrgNames() {
        return orgNames;
    }

    public void setOrgNames(List<String> orgNames) {
        this.orgNames = orgNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchRemoveOrgsFromChannelRequestBody batchRemoveOrgsFromChannelRequestBody =
            (BatchRemoveOrgsFromChannelRequestBody) o;
        return Objects.equals(this.orgNames, batchRemoveOrgsFromChannelRequestBody.orgNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRemoveOrgsFromChannelRequestBody {\n");
        sb.append("    orgNames: ").append(toIndentedString(orgNames)).append("\n");
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
