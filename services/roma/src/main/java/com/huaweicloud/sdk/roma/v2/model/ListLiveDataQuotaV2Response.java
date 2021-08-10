package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ListLiveDataQuotaV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource")

    private String datasource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api")

    private String api;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scripts")

    private String scripts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_used")

    private String datasourceUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_used")

    private String apiUsed;

    public ListLiveDataQuotaV2Response withDatasource(String datasource) {
        this.datasource = datasource;
        return this;
    }

    /** 数据源配额
     * 
     * @return datasource */
    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public ListLiveDataQuotaV2Response withApi(String api) {
        this.api = api;
        return this;
    }

    /** 后端api配额
     * 
     * @return api */
    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public ListLiveDataQuotaV2Response withScripts(String scripts) {
        this.scripts = scripts;
        return this;
    }

    /** 脚本配额
     * 
     * @return scripts */
    public String getScripts() {
        return scripts;
    }

    public void setScripts(String scripts) {
        this.scripts = scripts;
    }

    public ListLiveDataQuotaV2Response withDatasourceUsed(String datasourceUsed) {
        this.datasourceUsed = datasourceUsed;
        return this;
    }

    /** 已使用的数据源数量
     * 
     * @return datasourceUsed */
    public String getDatasourceUsed() {
        return datasourceUsed;
    }

    public void setDatasourceUsed(String datasourceUsed) {
        this.datasourceUsed = datasourceUsed;
    }

    public ListLiveDataQuotaV2Response withApiUsed(String apiUsed) {
        this.apiUsed = apiUsed;
        return this;
    }

    /** 已使用的后端api数量
     * 
     * @return apiUsed */
    public String getApiUsed() {
        return apiUsed;
    }

    public void setApiUsed(String apiUsed) {
        this.apiUsed = apiUsed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLiveDataQuotaV2Response listLiveDataQuotaV2Response = (ListLiveDataQuotaV2Response) o;
        return Objects.equals(this.datasource, listLiveDataQuotaV2Response.datasource)
            && Objects.equals(this.api, listLiveDataQuotaV2Response.api)
            && Objects.equals(this.scripts, listLiveDataQuotaV2Response.scripts)
            && Objects.equals(this.datasourceUsed, listLiveDataQuotaV2Response.datasourceUsed)
            && Objects.equals(this.apiUsed, listLiveDataQuotaV2Response.apiUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasource, api, scripts, datasourceUsed, apiUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLiveDataQuotaV2Response {\n");
        sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
        sb.append("    api: ").append(toIndentedString(api)).append("\n");
        sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
        sb.append("    datasourceUsed: ").append(toIndentedString(datasourceUsed)).append("\n");
        sb.append("    apiUsed: ").append(toIndentedString(apiUsed)).append("\n");
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
