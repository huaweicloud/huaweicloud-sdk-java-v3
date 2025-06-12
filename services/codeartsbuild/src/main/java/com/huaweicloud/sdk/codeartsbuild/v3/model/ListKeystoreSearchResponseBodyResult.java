package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 租户下文件列表
 */
public class ListKeystoreSearchResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_list")

    private List<ListKeystoreSearchResponseBodyResultKeystoreList> keystoreList = null;

    public ListKeystoreSearchResponseBodyResult withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ListKeystoreSearchResponseBodyResult withKeystoreList(
        List<ListKeystoreSearchResponseBodyResultKeystoreList> keystoreList) {
        this.keystoreList = keystoreList;
        return this;
    }

    public ListKeystoreSearchResponseBodyResult addKeystoreListItem(
        ListKeystoreSearchResponseBodyResultKeystoreList keystoreListItem) {
        if (this.keystoreList == null) {
            this.keystoreList = new ArrayList<>();
        }
        this.keystoreList.add(keystoreListItem);
        return this;
    }

    public ListKeystoreSearchResponseBodyResult withKeystoreList(
        Consumer<List<ListKeystoreSearchResponseBodyResultKeystoreList>> keystoreListSetter) {
        if (this.keystoreList == null) {
            this.keystoreList = new ArrayList<>();
        }
        keystoreListSetter.accept(this.keystoreList);
        return this;
    }

    /**
     * 文件列表
     * @return keystoreList
     */
    public List<ListKeystoreSearchResponseBodyResultKeystoreList> getKeystoreList() {
        return keystoreList;
    }

    public void setKeystoreList(List<ListKeystoreSearchResponseBodyResultKeystoreList> keystoreList) {
        this.keystoreList = keystoreList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKeystoreSearchResponseBodyResult that = (ListKeystoreSearchResponseBodyResult) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.keystoreList, that.keystoreList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, keystoreList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeystoreSearchResponseBodyResult {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    keystoreList: ").append(toIndentedString(keystoreList)).append("\n");
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
