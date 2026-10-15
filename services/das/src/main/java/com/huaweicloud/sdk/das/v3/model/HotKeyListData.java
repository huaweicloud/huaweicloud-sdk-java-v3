package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HotKeyListData
 */
public class HotKeyListData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_list")

    private List<HotKeyInfo> keyList = null;

    public HotKeyListData withTotal(Long total) {
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

    public HotKeyListData withKeyList(List<HotKeyInfo> keyList) {
        this.keyList = keyList;
        return this;
    }

    public HotKeyListData addKeyListItem(HotKeyInfo keyListItem) {
        if (this.keyList == null) {
            this.keyList = new ArrayList<>();
        }
        this.keyList.add(keyListItem);
        return this;
    }

    public HotKeyListData withKeyList(Consumer<List<HotKeyInfo>> keyListSetter) {
        if (this.keyList == null) {
            this.keyList = new ArrayList<>();
        }
        keyListSetter.accept(this.keyList);
        return this;
    }

    /**
     * 热key列表
     * @return keyList
     */
    public List<HotKeyInfo> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<HotKeyInfo> keyList) {
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
        HotKeyListData that = (HotKeyListData) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.keyList, that.keyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, keyList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HotKeyListData {\n");
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
