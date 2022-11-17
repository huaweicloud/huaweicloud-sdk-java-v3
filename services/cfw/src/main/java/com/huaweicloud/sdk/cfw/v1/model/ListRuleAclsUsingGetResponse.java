package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRuleAclsUsingGetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private RuleAclListResponseDTOData data;

    public ListRuleAclsUsingGetResponse withData(RuleAclListResponseDTOData data) {
        this.data = data;
        return this;
    }

    public ListRuleAclsUsingGetResponse withData(Consumer<RuleAclListResponseDTOData> dataSetter) {
        if (this.data == null) {
            this.data = new RuleAclListResponseDTOData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public RuleAclListResponseDTOData getData() {
        return data;
    }

    public void setData(RuleAclListResponseDTOData data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRuleAclsUsingGetResponse listRuleAclsUsingGetResponse = (ListRuleAclsUsingGetResponse) o;
        return Objects.equals(this.data, listRuleAclsUsingGetResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRuleAclsUsingGetResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
