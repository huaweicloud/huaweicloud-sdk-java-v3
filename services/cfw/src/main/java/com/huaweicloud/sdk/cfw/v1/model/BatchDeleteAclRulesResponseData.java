package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteAclRulesResponseData
 */
public class BatchDeleteAclRulesResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "responseDatas")

    private List<BatchDeleteRuleInfo> responseDatas = null;

    public BatchDeleteAclRulesResponseData withResponseDatas(List<BatchDeleteRuleInfo> responseDatas) {
        this.responseDatas = responseDatas;
        return this;
    }

    public BatchDeleteAclRulesResponseData addResponseDatasItem(BatchDeleteRuleInfo responseDatasItem) {
        if (this.responseDatas == null) {
            this.responseDatas = new ArrayList<>();
        }
        this.responseDatas.add(responseDatasItem);
        return this;
    }

    public BatchDeleteAclRulesResponseData withResponseDatas(Consumer<List<BatchDeleteRuleInfo>> responseDatasSetter) {
        if (this.responseDatas == null) {
            this.responseDatas = new ArrayList<>();
        }
        responseDatasSetter.accept(this.responseDatas);
        return this;
    }

    /**
     * **参数解释**： 批量删除规则返回 **取值范围**： 不涉及
     * @return responseDatas
     */
    public List<BatchDeleteRuleInfo> getResponseDatas() {
        return responseDatas;
    }

    public void setResponseDatas(List<BatchDeleteRuleInfo> responseDatas) {
        this.responseDatas = responseDatas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteAclRulesResponseData that = (BatchDeleteAclRulesResponseData) obj;
        return Objects.equals(this.responseDatas, that.responseDatas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseDatas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAclRulesResponseData {\n");
        sb.append("    responseDatas: ").append(toIndentedString(responseDatas)).append("\n");
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
