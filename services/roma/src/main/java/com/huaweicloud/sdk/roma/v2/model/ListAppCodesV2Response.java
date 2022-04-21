package com.huaweicloud.sdk.roma.v2.model;

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
public class ListAppCodesV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_codes")

    private List<AppCodeBaseInfo> appCodes = null;

    public ListAppCodesV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListAppCodesV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListAppCodesV2Response withAppCodes(List<AppCodeBaseInfo> appCodes) {
        this.appCodes = appCodes;
        return this;
    }

    public ListAppCodesV2Response addAppCodesItem(AppCodeBaseInfo appCodesItem) {
        if (this.appCodes == null) {
            this.appCodes = new ArrayList<>();
        }
        this.appCodes.add(appCodesItem);
        return this;
    }

    public ListAppCodesV2Response withAppCodes(Consumer<List<AppCodeBaseInfo>> appCodesSetter) {
        if (this.appCodes == null) {
            this.appCodes = new ArrayList<>();
        }
        appCodesSetter.accept(this.appCodes);
        return this;
    }

    /**
     * App Code列表
     * @return appCodes
     */
    public List<AppCodeBaseInfo> getAppCodes() {
        return appCodes;
    }

    public void setAppCodes(List<AppCodeBaseInfo> appCodes) {
        this.appCodes = appCodes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppCodesV2Response listAppCodesV2Response = (ListAppCodesV2Response) o;
        return Objects.equals(this.size, listAppCodesV2Response.size)
            && Objects.equals(this.total, listAppCodesV2Response.total)
            && Objects.equals(this.appCodes, listAppCodesV2Response.appCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, appCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppCodesV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    appCodes: ").append(toIndentedString(appCodes)).append("\n");
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
