package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListPersonnelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "personnel")

    private List<PersonnelResponse> personnel = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListPersonnelResponse withPersonnel(List<PersonnelResponse> personnel) {
        this.personnel = personnel;
        return this;
    }

    public ListPersonnelResponse addPersonnelItem(PersonnelResponse personnelItem) {
        if (this.personnel == null) {
            this.personnel = new ArrayList<>();
        }
        this.personnel.add(personnelItem);
        return this;
    }

    public ListPersonnelResponse withPersonnel(Consumer<List<PersonnelResponse>> personnelSetter) {
        if (this.personnel == null) {
            this.personnel = new ArrayList<>();
        }
        personnelSetter.accept(this.personnel);
        return this;
    }

    /**
     * 人员信息
     * @return personnel
     */
    public List<PersonnelResponse> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(List<PersonnelResponse> personnel) {
        this.personnel = personnel;
    }

    public ListPersonnelResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPersonnelResponse that = (ListPersonnelResponse) obj;
        return Objects.equals(this.personnel, that.personnel) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personnel, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPersonnelResponse {\n");
        sb.append("    personnel: ").append(toIndentedString(personnel)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
