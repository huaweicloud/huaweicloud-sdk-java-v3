package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListAppQuotaBindableAppsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private List<AppQuotaAppInfo> apps = null;

    public ListAppQuotaBindableAppsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 本次返回的列表长度
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListAppQuotaBindableAppsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /** 满足条件的记录数
     * 
     * @return total */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListAppQuotaBindableAppsResponse withApps(List<AppQuotaAppInfo> apps) {
        this.apps = apps;
        return this;
    }

    public ListAppQuotaBindableAppsResponse addAppsItem(AppQuotaAppInfo appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public ListAppQuotaBindableAppsResponse withApps(Consumer<List<AppQuotaAppInfo>> appsSetter) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /** 客户端应用列表
     * 
     * @return apps */
    public List<AppQuotaAppInfo> getApps() {
        return apps;
    }

    public void setApps(List<AppQuotaAppInfo> apps) {
        this.apps = apps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppQuotaBindableAppsResponse listAppQuotaBindableAppsResponse = (ListAppQuotaBindableAppsResponse) o;
        return Objects.equals(this.size, listAppQuotaBindableAppsResponse.size)
            && Objects.equals(this.total, listAppQuotaBindableAppsResponse.total)
            && Objects.equals(this.apps, listAppQuotaBindableAppsResponse.apps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, apps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppQuotaBindableAppsResponse {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
