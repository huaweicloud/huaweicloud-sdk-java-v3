package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PageInfo
 */
public class PageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endRow")

    private Long endRow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hasNextPage")

    private Boolean hasNextPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hasPreviousPage")

    private Boolean hasPreviousPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isFirstPage")

    private Boolean isFirstPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isLastPage")

    private Boolean isLastPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<Object> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "navigateFirstPage")

    private Integer navigateFirstPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "navigateLastPage")

    private Integer navigateLastPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "navigatePages")

    private Integer navigatePages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "navigatepageNums")

    private List<Integer> navigatepageNums = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nextPage")

    private Integer nextPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageNum")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageSize")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pages")

    private Integer pages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prePage")

    private Integer prePage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startRow")

    private Long startRow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public PageInfo withEndRow(Long endRow) {
        this.endRow = endRow;
        return this;
    }

    /**
     * Get endRow
     * @return endRow
     */
    public Long getEndRow() {
        return endRow;
    }

    public void setEndRow(Long endRow) {
        this.endRow = endRow;
    }

    public PageInfo withHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
        return this;
    }

    /**
     * Get hasNextPage
     * @return hasNextPage
     */
    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public PageInfo withHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
        return this;
    }

    /**
     * Get hasPreviousPage
     * @return hasPreviousPage
     */
    public Boolean getHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public PageInfo withIsFirstPage(Boolean isFirstPage) {
        this.isFirstPage = isFirstPage;
        return this;
    }

    /**
     * Get isFirstPage
     * @return isFirstPage
     */
    public Boolean getIsFirstPage() {
        return isFirstPage;
    }

    public void setIsFirstPage(Boolean isFirstPage) {
        this.isFirstPage = isFirstPage;
    }

    public PageInfo withIsLastPage(Boolean isLastPage) {
        this.isLastPage = isLastPage;
        return this;
    }

    /**
     * Get isLastPage
     * @return isLastPage
     */
    public Boolean getIsLastPage() {
        return isLastPage;
    }

    public void setIsLastPage(Boolean isLastPage) {
        this.isLastPage = isLastPage;
    }

    public PageInfo withList(List<Object> list) {
        this.list = list;
        return this;
    }

    public PageInfo addListItem(Object listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public PageInfo withList(Consumer<List<Object>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * Get list
     * @return list
     */
    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public PageInfo withNavigateFirstPage(Integer navigateFirstPage) {
        this.navigateFirstPage = navigateFirstPage;
        return this;
    }

    /**
     * Get navigateFirstPage
     * @return navigateFirstPage
     */
    public Integer getNavigateFirstPage() {
        return navigateFirstPage;
    }

    public void setNavigateFirstPage(Integer navigateFirstPage) {
        this.navigateFirstPage = navigateFirstPage;
    }

    public PageInfo withNavigateLastPage(Integer navigateLastPage) {
        this.navigateLastPage = navigateLastPage;
        return this;
    }

    /**
     * Get navigateLastPage
     * @return navigateLastPage
     */
    public Integer getNavigateLastPage() {
        return navigateLastPage;
    }

    public void setNavigateLastPage(Integer navigateLastPage) {
        this.navigateLastPage = navigateLastPage;
    }

    public PageInfo withNavigatePages(Integer navigatePages) {
        this.navigatePages = navigatePages;
        return this;
    }

    /**
     * Get navigatePages
     * @return navigatePages
     */
    public Integer getNavigatePages() {
        return navigatePages;
    }

    public void setNavigatePages(Integer navigatePages) {
        this.navigatePages = navigatePages;
    }

    public PageInfo withNavigatepageNums(List<Integer> navigatepageNums) {
        this.navigatepageNums = navigatepageNums;
        return this;
    }

    public PageInfo addNavigatepageNumsItem(Integer navigatepageNumsItem) {
        if (this.navigatepageNums == null) {
            this.navigatepageNums = new ArrayList<>();
        }
        this.navigatepageNums.add(navigatepageNumsItem);
        return this;
    }

    public PageInfo withNavigatepageNums(Consumer<List<Integer>> navigatepageNumsSetter) {
        if (this.navigatepageNums == null) {
            this.navigatepageNums = new ArrayList<>();
        }
        navigatepageNumsSetter.accept(this.navigatepageNums);
        return this;
    }

    /**
     * Get navigatepageNums
     * @return navigatepageNums
     */
    public List<Integer> getNavigatepageNums() {
        return navigatepageNums;
    }

    public void setNavigatepageNums(List<Integer> navigatepageNums) {
        this.navigatepageNums = navigatepageNums;
    }

    public PageInfo withNextPage(Integer nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    /**
     * Get nextPage
     * @return nextPage
     */
    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public PageInfo withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * Get pageNum
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public PageInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get pageSize
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public PageInfo withPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Get pages
     * @return pages
     */
    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public PageInfo withPrePage(Integer prePage) {
        this.prePage = prePage;
        return this;
    }

    /**
     * Get prePage
     * @return prePage
     */
    public Integer getPrePage() {
        return prePage;
    }

    public void setPrePage(Integer prePage) {
        this.prePage = prePage;
    }

    public PageInfo withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PageInfo withStartRow(Long startRow) {
        this.startRow = startRow;
        return this;
    }

    /**
     * Get startRow
     * @return startRow
     */
    public Long getStartRow() {
        return startRow;
    }

    public void setStartRow(Long startRow) {
        this.startRow = startRow;
    }

    public PageInfo withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
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
        PageInfo that = (PageInfo) obj;
        return Objects.equals(this.endRow, that.endRow) && Objects.equals(this.hasNextPage, that.hasNextPage)
            && Objects.equals(this.hasPreviousPage, that.hasPreviousPage)
            && Objects.equals(this.isFirstPage, that.isFirstPage) && Objects.equals(this.isLastPage, that.isLastPage)
            && Objects.equals(this.list, that.list) && Objects.equals(this.navigateFirstPage, that.navigateFirstPage)
            && Objects.equals(this.navigateLastPage, that.navigateLastPage)
            && Objects.equals(this.navigatePages, that.navigatePages)
            && Objects.equals(this.navigatepageNums, that.navigatepageNums)
            && Objects.equals(this.nextPage, that.nextPage) && Objects.equals(this.pageNum, that.pageNum)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.pages, that.pages)
            && Objects.equals(this.prePage, that.prePage) && Objects.equals(this.size, that.size)
            && Objects.equals(this.startRow, that.startRow) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endRow,
            hasNextPage,
            hasPreviousPage,
            isFirstPage,
            isLastPage,
            list,
            navigateFirstPage,
            navigateLastPage,
            navigatePages,
            navigatepageNums,
            nextPage,
            pageNum,
            pageSize,
            pages,
            prePage,
            size,
            startRow,
            total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageInfo {\n");
        sb.append("    endRow: ").append(toIndentedString(endRow)).append("\n");
        sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
        sb.append("    hasPreviousPage: ").append(toIndentedString(hasPreviousPage)).append("\n");
        sb.append("    isFirstPage: ").append(toIndentedString(isFirstPage)).append("\n");
        sb.append("    isLastPage: ").append(toIndentedString(isLastPage)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    navigateFirstPage: ").append(toIndentedString(navigateFirstPage)).append("\n");
        sb.append("    navigateLastPage: ").append(toIndentedString(navigateLastPage)).append("\n");
        sb.append("    navigatePages: ").append(toIndentedString(navigatePages)).append("\n");
        sb.append("    navigatepageNums: ").append(toIndentedString(navigatepageNums)).append("\n");
        sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    prePage: ").append(toIndentedString(prePage)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    startRow: ").append(toIndentedString(startRow)).append("\n");
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
