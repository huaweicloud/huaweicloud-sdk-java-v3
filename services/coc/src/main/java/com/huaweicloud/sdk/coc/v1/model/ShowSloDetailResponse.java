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
public class ShowSloDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_name")

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slo_targets")

    private Double sloTargets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sli_list")

    private List<SliDetail> sliList = null;

    public ShowSloDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * SLO的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowSloDetailResponse withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * 应用名称
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public ShowSloDetailResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用ID
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ShowSloDetailResponse withSloTargets(Double sloTargets) {
        this.sloTargets = sloTargets;
        return this;
    }

    /**
     * SLO的目标值
     * minimum: 0
     * maximum: 1E+2
     * @return sloTargets
     */
    public Double getSloTargets() {
        return sloTargets;
    }

    public void setSloTargets(Double sloTargets) {
        this.sloTargets = sloTargets;
    }

    public ShowSloDetailResponse withSliList(List<SliDetail> sliList) {
        this.sliList = sliList;
        return this;
    }

    public ShowSloDetailResponse addSliListItem(SliDetail sliListItem) {
        if (this.sliList == null) {
            this.sliList = new ArrayList<>();
        }
        this.sliList.add(sliListItem);
        return this;
    }

    public ShowSloDetailResponse withSliList(Consumer<List<SliDetail>> sliListSetter) {
        if (this.sliList == null) {
            this.sliList = new ArrayList<>();
        }
        sliListSetter.accept(this.sliList);
        return this;
    }

    /**
     * SLi列表
     * @return sliList
     */
    public List<SliDetail> getSliList() {
        return sliList;
    }

    public void setSliList(List<SliDetail> sliList) {
        this.sliList = sliList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSloDetailResponse that = (ShowSloDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.applicationName, that.applicationName)
            && Objects.equals(this.applicationId, that.applicationId)
            && Objects.equals(this.sloTargets, that.sloTargets) && Objects.equals(this.sliList, that.sliList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, applicationName, applicationId, sloTargets, sliList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSloDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    sloTargets: ").append(toIndentedString(sloTargets)).append("\n");
        sb.append("    sliList: ").append(toIndentedString(sliList)).append("\n");
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
