package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除应用。
 */
public class BatchDeleteAppsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<String> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_obs_file")

    private Boolean reserveObsFile;

    public BatchDeleteAppsReq withItems(List<String> items) {
        this.items = items;
        return this;
    }

    public BatchDeleteAppsReq addItemsItem(String itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public BatchDeleteAppsReq withItems(Consumer<List<String>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 批量唯一标识请求列表，一次请求数量区间 [1, 50]。
     * @return items
     */
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public BatchDeleteAppsReq withReserveObsFile(Boolean reserveObsFile) {
        this.reserveObsFile = reserveObsFile;
        return this;
    }

    /**
     * 是否保留OBS桶文件，如果不保留删除应用时，会同时删除OBS桶文件(默认false)。 * 'true' - 保留OBS桶文件,不做任何操作。 * 'false' - 不保留OBS桶文件,删除应用时同时删除OBS桶文件。
     * @return reserveObsFile
     */
    public Boolean getReserveObsFile() {
        return reserveObsFile;
    }

    public void setReserveObsFile(Boolean reserveObsFile) {
        this.reserveObsFile = reserveObsFile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteAppsReq that = (BatchDeleteAppsReq) obj;
        return Objects.equals(this.items, that.items) && Objects.equals(this.reserveObsFile, that.reserveObsFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, reserveObsFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAppsReq {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    reserveObsFile: ").append(toIndentedString(reserveObsFile)).append("\n");
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
