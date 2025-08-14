package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class ListApplicationInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_instances")

    private List<ApplicationInstanceDto> applicationInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListApplicationInstancesResponse withApplicationInstances(
        List<ApplicationInstanceDto> applicationInstances) {
        this.applicationInstances = applicationInstances;
        return this;
    }

    public ListApplicationInstancesResponse addApplicationInstancesItem(
        ApplicationInstanceDto applicationInstancesItem) {
        if (this.applicationInstances == null) {
            this.applicationInstances = new ArrayList<>();
        }
        this.applicationInstances.add(applicationInstancesItem);
        return this;
    }

    public ListApplicationInstancesResponse withApplicationInstances(
        Consumer<List<ApplicationInstanceDto>> applicationInstancesSetter) {
        if (this.applicationInstances == null) {
            this.applicationInstances = new ArrayList<>();
        }
        applicationInstancesSetter.accept(this.applicationInstances);
        return this;
    }

    /**
     * 应用程序实例列表
     * @return applicationInstances
     */
    public List<ApplicationInstanceDto> getApplicationInstances() {
        return applicationInstances;
    }

    public void setApplicationInstances(List<ApplicationInstanceDto> applicationInstances) {
        this.applicationInstances = applicationInstances;
    }

    public ListApplicationInstancesResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListApplicationInstancesResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApplicationInstancesResponse that = (ListApplicationInstancesResponse) obj;
        return Objects.equals(this.applicationInstances, that.applicationInstances)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationInstances, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationInstancesResponse {\n");
        sb.append("    applicationInstances: ").append(toIndentedString(applicationInstances)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
