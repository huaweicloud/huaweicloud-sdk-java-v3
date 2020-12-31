package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 分页请求体
 */
public class PageReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cur_page")
    
    private Integer curPage = 1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="per_page")
    
    private Integer perPage = 5;

    public PageReq withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    


    /**
     * 当前页, 不能超过传入jobID数量除每页任务数量的最大页，填0获取全部item 
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public PageReq withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    


    /**
     * 每页item数量，填0获取全部item
     * minimum: 0
     * maximum: 100
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PageReq pageReq = (PageReq) o;
        return Objects.equals(this.curPage, pageReq.curPage) &&
            Objects.equals(this.perPage, pageReq.perPage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(curPage, perPage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageReq {\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

