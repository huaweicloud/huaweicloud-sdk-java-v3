package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项关联外部链接查询结果数据集
 */
public class ThirdPartyAssociatedResultData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<ThirdPartyAssociatedDTO> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private PageVO page;

    public ThirdPartyAssociatedResultData withResult(List<ThirdPartyAssociatedDTO> result) {
        this.result = result;
        return this;
    }

    public ThirdPartyAssociatedResultData addResultItem(ThirdPartyAssociatedDTO resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ThirdPartyAssociatedResultData withResult(Consumer<List<ThirdPartyAssociatedDTO>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 工作项关联外部链接查询结果数据集合
     * @return result
     */
    public List<ThirdPartyAssociatedDTO> getResult() {
        return result;
    }

    public void setResult(List<ThirdPartyAssociatedDTO> result) {
        this.result = result;
    }

    public ThirdPartyAssociatedResultData withPage(PageVO page) {
        this.page = page;
        return this;
    }

    public ThirdPartyAssociatedResultData withPage(Consumer<PageVO> pageSetter) {
        if (this.page == null) {
            this.page = new PageVO();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public PageVO getPage() {
        return page;
    }

    public void setPage(PageVO page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThirdPartyAssociatedResultData that = (ThirdPartyAssociatedResultData) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThirdPartyAssociatedResultData {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
