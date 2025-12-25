package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SearchCheckitemsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "builtin_checkitem_num")

    private BigDecimal builtinCheckitemNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkitem_num")

    private BigDecimal checkitemNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customized_checkitem_num")

    private BigDecimal customizedCheckitemNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private BigDecimal count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkitems")

    private List<CheckitemModel> checkitems = null;

    public SearchCheckitemsResponse withBuiltinCheckitemNum(BigDecimal builtinCheckitemNum) {
        this.builtinCheckitemNum = builtinCheckitemNum;
        return this;
    }

    /**
     * 内置检查项个数
     * minimum: 0
     * maximum: 1E+4
     * @return builtinCheckitemNum
     */
    public BigDecimal getBuiltinCheckitemNum() {
        return builtinCheckitemNum;
    }

    public void setBuiltinCheckitemNum(BigDecimal builtinCheckitemNum) {
        this.builtinCheckitemNum = builtinCheckitemNum;
    }

    public SearchCheckitemsResponse withCheckitemNum(BigDecimal checkitemNum) {
        this.checkitemNum = checkitemNum;
        return this;
    }

    /**
     * 检查项总数
     * minimum: 0
     * maximum: 1E+4
     * @return checkitemNum
     */
    public BigDecimal getCheckitemNum() {
        return checkitemNum;
    }

    public void setCheckitemNum(BigDecimal checkitemNum) {
        this.checkitemNum = checkitemNum;
    }

    public SearchCheckitemsResponse withCustomizedCheckitemNum(BigDecimal customizedCheckitemNum) {
        this.customizedCheckitemNum = customizedCheckitemNum;
        return this;
    }

    /**
     * 自定义检查项个数
     * minimum: 0
     * maximum: 1E+4
     * @return customizedCheckitemNum
     */
    public BigDecimal getCustomizedCheckitemNum() {
        return customizedCheckitemNum;
    }

    public void setCustomizedCheckitemNum(BigDecimal customizedCheckitemNum) {
        this.customizedCheckitemNum = customizedCheckitemNum;
    }

    public SearchCheckitemsResponse withCount(BigDecimal count) {
        this.count = count;
        return this;
    }

    /**
     * 检查项总数
     * minimum: 0
     * maximum: 1E+4
     * @return count
     */
    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public SearchCheckitemsResponse withCheckitems(List<CheckitemModel> checkitems) {
        this.checkitems = checkitems;
        return this;
    }

    public SearchCheckitemsResponse addCheckitemsItem(CheckitemModel checkitemsItem) {
        if (this.checkitems == null) {
            this.checkitems = new ArrayList<>();
        }
        this.checkitems.add(checkitemsItem);
        return this;
    }

    public SearchCheckitemsResponse withCheckitems(Consumer<List<CheckitemModel>> checkitemsSetter) {
        if (this.checkitems == null) {
            this.checkitems = new ArrayList<>();
        }
        checkitemsSetter.accept(this.checkitems);
        return this;
    }

    /**
     * 检查项详情
     * @return checkitems
     */
    public List<CheckitemModel> getCheckitems() {
        return checkitems;
    }

    public void setCheckitems(List<CheckitemModel> checkitems) {
        this.checkitems = checkitems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchCheckitemsResponse that = (SearchCheckitemsResponse) obj;
        return Objects.equals(this.builtinCheckitemNum, that.builtinCheckitemNum)
            && Objects.equals(this.checkitemNum, that.checkitemNum)
            && Objects.equals(this.customizedCheckitemNum, that.customizedCheckitemNum)
            && Objects.equals(this.count, that.count) && Objects.equals(this.checkitems, that.checkitems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builtinCheckitemNum, checkitemNum, customizedCheckitemNum, count, checkitems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCheckitemsResponse {\n");
        sb.append("    builtinCheckitemNum: ").append(toIndentedString(builtinCheckitemNum)).append("\n");
        sb.append("    checkitemNum: ").append(toIndentedString(checkitemNum)).append("\n");
        sb.append("    customizedCheckitemNum: ").append(toIndentedString(customizedCheckitemNum)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    checkitems: ").append(toIndentedString(checkitems)).append("\n");
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
