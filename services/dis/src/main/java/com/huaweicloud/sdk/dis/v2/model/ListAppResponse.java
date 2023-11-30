package com.huaweicloud.sdk.dis.v2.model;

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
public class ListAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_more_app")

    private Boolean hasMoreApp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private List<DescribeAppResult> apps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_number")

    private Integer totalNumber;

    public ListAppResponse withHasMoreApp(Boolean hasMoreApp) {
        this.hasMoreApp = hasMoreApp;
        return this;
    }

    /**
     * 是否还有更多满足条件的App。  - true：是。 - false：否。
     * @return hasMoreApp
     */
    public Boolean getHasMoreApp() {
        return hasMoreApp;
    }

    public void setHasMoreApp(Boolean hasMoreApp) {
        this.hasMoreApp = hasMoreApp;
    }

    public ListAppResponse withApps(List<DescribeAppResult> apps) {
        this.apps = apps;
        return this;
    }

    public ListAppResponse addAppsItem(DescribeAppResult appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public ListAppResponse withApps(Consumer<List<DescribeAppResult>> appsSetter) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * AppEntry list that meets the current request.
     * @return apps
     */
    public List<DescribeAppResult> getApps() {
        return apps;
    }

    public void setApps(List<DescribeAppResult> apps) {
        this.apps = apps;
    }

    public ListAppResponse withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    /**
     * 满足条件的App总数。
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAppResponse that = (ListAppResponse) obj;
        return Objects.equals(this.hasMoreApp, that.hasMoreApp) && Objects.equals(this.apps, that.apps)
            && Objects.equals(this.totalNumber, that.totalNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasMoreApp, apps, totalNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppResponse {\n");
        sb.append("    hasMoreApp: ").append(toIndentedString(hasMoreApp)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
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
