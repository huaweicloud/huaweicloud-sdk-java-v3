package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 基线检查策略目录详细信息
 */
public class ShowBaselineDirectoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private String standard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<ShowBaselineDirectoryInfoDataList> dataList = null;

    public ShowBaselineDirectoryInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 根据select_type不同的值，得到不同的含义 - 当select_type为check_type，该字段代表check_type（基线的名称） - 当select_type为tag，该字段代表tag（基线检查项的类型）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowBaselineDirectoryInfo withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * 标准类型，包含如下:   - cn_standard : 等保合规标准   - hw_standard : 云安全实践标准   - cis_standard : 通用安全标准
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public ShowBaselineDirectoryInfo withDataList(List<ShowBaselineDirectoryInfoDataList> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ShowBaselineDirectoryInfo addDataListItem(ShowBaselineDirectoryInfoDataList dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ShowBaselineDirectoryInfo withDataList(Consumer<List<ShowBaselineDirectoryInfoDataList>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 基线检查策略三级目录信息
     * @return dataList
     */
    public List<ShowBaselineDirectoryInfoDataList> getDataList() {
        return dataList;
    }

    public void setDataList(List<ShowBaselineDirectoryInfoDataList> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBaselineDirectoryInfo that = (ShowBaselineDirectoryInfo) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.standard, that.standard)
            && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, standard, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBaselineDirectoryInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
