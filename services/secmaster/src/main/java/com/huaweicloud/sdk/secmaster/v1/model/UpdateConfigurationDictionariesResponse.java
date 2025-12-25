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
public class UpdateConfigurationDictionariesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_list")

    private List<Dictionary> successList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_list")

    private List<Dictionary> failedList = null;

    public UpdateConfigurationDictionariesResponse withSuccessList(List<Dictionary> successList) {
        this.successList = successList;
        return this;
    }

    public UpdateConfigurationDictionariesResponse addSuccessListItem(Dictionary successListItem) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        this.successList.add(successListItem);
        return this;
    }

    public UpdateConfigurationDictionariesResponse withSuccessList(Consumer<List<Dictionary>> successListSetter) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        successListSetter.accept(this.successList);
        return this;
    }

    /**
     * 正常字典列表
     * @return successList
     */
    public List<Dictionary> getSuccessList() {
        return successList;
    }

    public void setSuccessList(List<Dictionary> successList) {
        this.successList = successList;
    }

    public UpdateConfigurationDictionariesResponse withFailedList(List<Dictionary> failedList) {
        this.failedList = failedList;
        return this;
    }

    public UpdateConfigurationDictionariesResponse addFailedListItem(Dictionary failedListItem) {
        if (this.failedList == null) {
            this.failedList = new ArrayList<>();
        }
        this.failedList.add(failedListItem);
        return this;
    }

    public UpdateConfigurationDictionariesResponse withFailedList(Consumer<List<Dictionary>> failedListSetter) {
        if (this.failedList == null) {
            this.failedList = new ArrayList<>();
        }
        failedListSetter.accept(this.failedList);
        return this;
    }

    /**
     * 正常字典列表
     * @return failedList
     */
    public List<Dictionary> getFailedList() {
        return failedList;
    }

    public void setFailedList(List<Dictionary> failedList) {
        this.failedList = failedList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateConfigurationDictionariesResponse that = (UpdateConfigurationDictionariesResponse) obj;
        return Objects.equals(this.successList, that.successList) && Objects.equals(this.failedList, that.failedList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successList, failedList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigurationDictionariesResponse {\n");
        sb.append("    successList: ").append(toIndentedString(successList)).append("\n");
        sb.append("    failedList: ").append(toIndentedString(failedList)).append("\n");
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
