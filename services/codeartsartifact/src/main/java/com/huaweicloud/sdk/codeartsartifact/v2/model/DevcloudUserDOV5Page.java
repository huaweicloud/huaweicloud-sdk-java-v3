package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DevcloudUserDOV5Page
 */
public class DevcloudUserDOV5Page {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_records")

    private Integer totalRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_pages")

    private Integer totalPages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<DevcloudUserDOV5> data = null;

    public DevcloudUserDOV5Page withTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * **参数解释**: 总记录数。 **取值范围**: 不涉及。
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public DevcloudUserDOV5Page withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * **参数解释**: 总页数。 **取值范围**: 不涉及。
     * @return totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public DevcloudUserDOV5Page withData(List<DevcloudUserDOV5> data) {
        this.data = data;
        return this;
    }

    public DevcloudUserDOV5Page addDataItem(DevcloudUserDOV5 dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public DevcloudUserDOV5Page withData(Consumer<List<DevcloudUserDOV5>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释**: 用户列表。 **取值范围**: 不涉及。
     * @return data
     */
    public List<DevcloudUserDOV5> getData() {
        return data;
    }

    public void setData(List<DevcloudUserDOV5> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DevcloudUserDOV5Page that = (DevcloudUserDOV5Page) obj;
        return Objects.equals(this.totalRecords, that.totalRecords) && Objects.equals(this.totalPages, that.totalPages)
            && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRecords, totalPages, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevcloudUserDOV5Page {\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
