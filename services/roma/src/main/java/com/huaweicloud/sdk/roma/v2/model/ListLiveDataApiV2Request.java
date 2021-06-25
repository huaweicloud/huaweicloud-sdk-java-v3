package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListLiveDataApiV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Long offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path")
    
    private String path;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="precise_search")
    
    private String preciseSearch;

    public ListLiveDataApiV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ListLiveDataApiV2Request withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    

    public ListLiveDataApiV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListLiveDataApiV2Request withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 后端API归属的集成应用编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public ListLiveDataApiV2Request withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 后端API归属的集成应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    

    public ListLiveDataApiV2Request withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 后端API名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListLiveDataApiV2Request withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 后端API状态，支持1，3，4，分别表示待开发，开发中和已部署状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ListLiveDataApiV2Request withPath(String path) {
        this.path = path;
        return this;
    }

    


    /**
     * 后端API请求路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    public ListLiveDataApiV2Request withPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
        return this;
    }

    


    /**
     * 指明需要精准查询的参数，支持name、path、status
     * @return preciseSearch
     */
    public String getPreciseSearch() {
        return preciseSearch;
    }

    public void setPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLiveDataApiV2Request listLiveDataApiV2Request = (ListLiveDataApiV2Request) o;
        return Objects.equals(this.instanceId, listLiveDataApiV2Request.instanceId) &&
            Objects.equals(this.offset, listLiveDataApiV2Request.offset) &&
            Objects.equals(this.limit, listLiveDataApiV2Request.limit) &&
            Objects.equals(this.appId, listLiveDataApiV2Request.appId) &&
            Objects.equals(this.appName, listLiveDataApiV2Request.appName) &&
            Objects.equals(this.name, listLiveDataApiV2Request.name) &&
            Objects.equals(this.status, listLiveDataApiV2Request.status) &&
            Objects.equals(this.path, listLiveDataApiV2Request.path) &&
            Objects.equals(this.preciseSearch, listLiveDataApiV2Request.preciseSearch);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, appId, appName, name, status, path, preciseSearch);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLiveDataApiV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    preciseSearch: ").append(toIndentedString(preciseSearch)).append("\n");
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

