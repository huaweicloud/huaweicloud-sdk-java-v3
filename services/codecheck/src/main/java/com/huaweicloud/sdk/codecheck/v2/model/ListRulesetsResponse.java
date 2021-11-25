package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListRulesetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private List<RulesetItem> info = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListRulesetsResponse withInfo(List<RulesetItem> info) {
        this.info = info;
        return this;
    }

    public ListRulesetsResponse addInfoItem(RulesetItem infoItem) {
        if (this.info == null) {
            this.info = new ArrayList<>();
        }
        this.info.add(infoItem);
        return this;
    }

    public ListRulesetsResponse withInfo(Consumer<List<RulesetItem>> infoSetter) {
        if (this.info == null) {
            this.info = new ArrayList<>();
        }
        infoSetter.accept(this.info);
        return this;
    }

    /** 规则集列表信息
     * 
     * @return info */
    public List<RulesetItem> getInfo() {
        return info;
    }

    public void setInfo(List<RulesetItem> info) {
        this.info = info;
    }

    public ListRulesetsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 总数
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRulesetsResponse listRulesetsResponse = (ListRulesetsResponse) o;
        return Objects.equals(this.info, listRulesetsResponse.info)
            && Objects.equals(this.total, listRulesetsResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(info, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRulesetsResponse {\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
