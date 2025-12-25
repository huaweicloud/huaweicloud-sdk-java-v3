package com.huaweicloud.sdk.secmaster.v1.model;

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
public class CreateConfigurationApplicationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_fail_list")

    private List<ComponentConfiguration> applyFailList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_success_list")

    private List<ComponentConfiguration> applySuccessList = null;

    public CreateConfigurationApplicationResponse withApplyFailList(List<ComponentConfiguration> applyFailList) {
        this.applyFailList = applyFailList;
        return this;
    }

    public CreateConfigurationApplicationResponse addApplyFailListItem(ComponentConfiguration applyFailListItem) {
        if (this.applyFailList == null) {
            this.applyFailList = new ArrayList<>();
        }
        this.applyFailList.add(applyFailListItem);
        return this;
    }

    public CreateConfigurationApplicationResponse withApplyFailList(
        Consumer<List<ComponentConfiguration>> applyFailListSetter) {
        if (this.applyFailList == null) {
            this.applyFailList = new ArrayList<>();
        }
        applyFailListSetter.accept(this.applyFailList);
        return this;
    }

    /**
     * 创建失败实例列表
     * @return applyFailList
     */
    public List<ComponentConfiguration> getApplyFailList() {
        return applyFailList;
    }

    public void setApplyFailList(List<ComponentConfiguration> applyFailList) {
        this.applyFailList = applyFailList;
    }

    public CreateConfigurationApplicationResponse withApplySuccessList(List<ComponentConfiguration> applySuccessList) {
        this.applySuccessList = applySuccessList;
        return this;
    }

    public CreateConfigurationApplicationResponse addApplySuccessListItem(ComponentConfiguration applySuccessListItem) {
        if (this.applySuccessList == null) {
            this.applySuccessList = new ArrayList<>();
        }
        this.applySuccessList.add(applySuccessListItem);
        return this;
    }

    public CreateConfigurationApplicationResponse withApplySuccessList(
        Consumer<List<ComponentConfiguration>> applySuccessListSetter) {
        if (this.applySuccessList == null) {
            this.applySuccessList = new ArrayList<>();
        }
        applySuccessListSetter.accept(this.applySuccessList);
        return this;
    }

    /**
     * 创建成功实例列表
     * @return applySuccessList
     */
    public List<ComponentConfiguration> getApplySuccessList() {
        return applySuccessList;
    }

    public void setApplySuccessList(List<ComponentConfiguration> applySuccessList) {
        this.applySuccessList = applySuccessList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateConfigurationApplicationResponse that = (CreateConfigurationApplicationResponse) obj;
        return Objects.equals(this.applyFailList, that.applyFailList)
            && Objects.equals(this.applySuccessList, that.applySuccessList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyFailList, applySuccessList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfigurationApplicationResponse {\n");
        sb.append("    applyFailList: ").append(toIndentedString(applyFailList)).append("\n");
        sb.append("    applySuccessList: ").append(toIndentedString(applySuccessList)).append("\n");
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
