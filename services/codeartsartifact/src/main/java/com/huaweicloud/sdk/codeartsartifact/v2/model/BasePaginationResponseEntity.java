package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BasePaginationResponseEntity
 */
public class BasePaginationResponseEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalRecords")

    private Integer totalRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalPages")

    private Integer totalPages;

    public BasePaginationResponseEntity withTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * **参数解释**： 总记录数。 **取值范围**： 不涉及。 
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public BasePaginationResponseEntity withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * **参数解释**： 总页数。 **取值范围**： 不涉及。 
     * @return totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasePaginationResponseEntity that = (BasePaginationResponseEntity) obj;
        return Objects.equals(this.totalRecords, that.totalRecords) && Objects.equals(this.totalPages, that.totalPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRecords, totalPages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasePaginationResponseEntity {\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
