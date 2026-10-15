package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BigKeyListData
 */
public class BigKeyListData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_list")

    private List<BigKeyInfo> keyList = null;

    public BigKeyListData withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总记录数
     * minimum: 0
     * maximum: 1000
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public BigKeyListData withKeyList(List<BigKeyInfo> keyList) {
        this.keyList = keyList;
        return this;
    }

    public BigKeyListData addKeyListItem(BigKeyInfo keyListItem) {
        if (this.keyList == null) {
            this.keyList = new ArrayList<>();
        }
        this.keyList.add(keyListItem);
        return this;
    }

    public BigKeyListData withKeyList(Consumer<List<BigKeyInfo>> keyListSetter) {
        if (this.keyList == null) {
            this.keyList = new ArrayList<>();
        }
        keyListSetter.accept(this.keyList);
        return this;
    }

    /**
     * 大key列表
     * @return keyList
     */
    public List<BigKeyInfo> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<BigKeyInfo> keyList) {
        this.keyList = keyList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BigKeyListData that = (BigKeyListData) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.keyList, that.keyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, keyList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BigKeyListData {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    keyList: ").append(toIndentedString(keyList)).append("\n");
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
