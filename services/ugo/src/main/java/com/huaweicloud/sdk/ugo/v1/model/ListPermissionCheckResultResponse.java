package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListPermissionCheckResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passed_permission_items")

    @JacksonXmlProperty(localName = "passed_permission_items")

    private List<PermissionItem> passedPermissionItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_permission_items")

    @JacksonXmlProperty(localName = "alarm_permission_items")

    private List<PermissionItem> alarmPermissionItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_permission_items")

    @JacksonXmlProperty(localName = "failed_permission_items")

    private List<PermissionItem> failedPermissionItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passed_count")

    @JacksonXmlProperty(localName = "passed_count")

    private Integer passedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_count")

    @JacksonXmlProperty(localName = "alarm_count")

    private Integer alarmCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    @JacksonXmlProperty(localName = "failed_count")

    private Integer failedCount;

    public ListPermissionCheckResultResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 权限检查的总条目个数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListPermissionCheckResultResponse withPassedPermissionItems(List<PermissionItem> passedPermissionItems) {
        this.passedPermissionItems = passedPermissionItems;
        return this;
    }

    public ListPermissionCheckResultResponse addPassedPermissionItemsItem(PermissionItem passedPermissionItemsItem) {
        if (this.passedPermissionItems == null) {
            this.passedPermissionItems = new ArrayList<>();
        }
        this.passedPermissionItems.add(passedPermissionItemsItem);
        return this;
    }

    public ListPermissionCheckResultResponse withPassedPermissionItems(
        Consumer<List<PermissionItem>> passedPermissionItemsSetter) {
        if (this.passedPermissionItems == null) {
            this.passedPermissionItems = new ArrayList<>();
        }
        passedPermissionItemsSetter.accept(this.passedPermissionItems);
        return this;
    }

    /**
     * 权限检查的通过条目。
     * @return passedPermissionItems
     */
    public List<PermissionItem> getPassedPermissionItems() {
        return passedPermissionItems;
    }

    public void setPassedPermissionItems(List<PermissionItem> passedPermissionItems) {
        this.passedPermissionItems = passedPermissionItems;
    }

    public ListPermissionCheckResultResponse withAlarmPermissionItems(List<PermissionItem> alarmPermissionItems) {
        this.alarmPermissionItems = alarmPermissionItems;
        return this;
    }

    public ListPermissionCheckResultResponse addAlarmPermissionItemsItem(PermissionItem alarmPermissionItemsItem) {
        if (this.alarmPermissionItems == null) {
            this.alarmPermissionItems = new ArrayList<>();
        }
        this.alarmPermissionItems.add(alarmPermissionItemsItem);
        return this;
    }

    public ListPermissionCheckResultResponse withAlarmPermissionItems(
        Consumer<List<PermissionItem>> alarmPermissionItemsSetter) {
        if (this.alarmPermissionItems == null) {
            this.alarmPermissionItems = new ArrayList<>();
        }
        alarmPermissionItemsSetter.accept(this.alarmPermissionItems);
        return this;
    }

    /**
     * 权限检查的告警条目。
     * @return alarmPermissionItems
     */
    public List<PermissionItem> getAlarmPermissionItems() {
        return alarmPermissionItems;
    }

    public void setAlarmPermissionItems(List<PermissionItem> alarmPermissionItems) {
        this.alarmPermissionItems = alarmPermissionItems;
    }

    public ListPermissionCheckResultResponse withFailedPermissionItems(List<PermissionItem> failedPermissionItems) {
        this.failedPermissionItems = failedPermissionItems;
        return this;
    }

    public ListPermissionCheckResultResponse addFailedPermissionItemsItem(PermissionItem failedPermissionItemsItem) {
        if (this.failedPermissionItems == null) {
            this.failedPermissionItems = new ArrayList<>();
        }
        this.failedPermissionItems.add(failedPermissionItemsItem);
        return this;
    }

    public ListPermissionCheckResultResponse withFailedPermissionItems(
        Consumer<List<PermissionItem>> failedPermissionItemsSetter) {
        if (this.failedPermissionItems == null) {
            this.failedPermissionItems = new ArrayList<>();
        }
        failedPermissionItemsSetter.accept(this.failedPermissionItems);
        return this;
    }

    /**
     * 权限检查的失败条目。
     * @return failedPermissionItems
     */
    public List<PermissionItem> getFailedPermissionItems() {
        return failedPermissionItems;
    }

    public void setFailedPermissionItems(List<PermissionItem> failedPermissionItems) {
        this.failedPermissionItems = failedPermissionItems;
    }

    public ListPermissionCheckResultResponse withPassedCount(Integer passedCount) {
        this.passedCount = passedCount;
        return this;
    }

    /**
     * 权限检查的通过条目个数。
     * @return passedCount
     */
    public Integer getPassedCount() {
        return passedCount;
    }

    public void setPassedCount(Integer passedCount) {
        this.passedCount = passedCount;
    }

    public ListPermissionCheckResultResponse withAlarmCount(Integer alarmCount) {
        this.alarmCount = alarmCount;
        return this;
    }

    /**
     * 权限检查的告警条目个数。
     * @return alarmCount
     */
    public Integer getAlarmCount() {
        return alarmCount;
    }

    public void setAlarmCount(Integer alarmCount) {
        this.alarmCount = alarmCount;
    }

    public ListPermissionCheckResultResponse withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * 权限检查的失败条目个数。
     * @return failedCount
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPermissionCheckResultResponse listPermissionCheckResultResponse = (ListPermissionCheckResultResponse) o;
        return Objects.equals(this.totalCount, listPermissionCheckResultResponse.totalCount)
            && Objects.equals(this.passedPermissionItems, listPermissionCheckResultResponse.passedPermissionItems)
            && Objects.equals(this.alarmPermissionItems, listPermissionCheckResultResponse.alarmPermissionItems)
            && Objects.equals(this.failedPermissionItems, listPermissionCheckResultResponse.failedPermissionItems)
            && Objects.equals(this.passedCount, listPermissionCheckResultResponse.passedCount)
            && Objects.equals(this.alarmCount, listPermissionCheckResultResponse.alarmCount)
            && Objects.equals(this.failedCount, listPermissionCheckResultResponse.failedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount,
            passedPermissionItems,
            alarmPermissionItems,
            failedPermissionItems,
            passedCount,
            alarmCount,
            failedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPermissionCheckResultResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    passedPermissionItems: ").append(toIndentedString(passedPermissionItems)).append("\n");
        sb.append("    alarmPermissionItems: ").append(toIndentedString(alarmPermissionItems)).append("\n");
        sb.append("    failedPermissionItems: ").append(toIndentedString(failedPermissionItems)).append("\n");
        sb.append("    passedCount: ").append(toIndentedString(passedCount)).append("\n");
        sb.append("    alarmCount: ").append(toIndentedString(alarmCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
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
