package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.AppConfigInfo;
import com.huaweicloud.sdk.roma.v2.model.BasePage;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAppConfigsV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Long total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configs")
    
    private List<AppConfigInfo> configs = null;
    
    public ListAppConfigsV2Response withSize(Integer size) {
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

    

    public ListAppConfigsV2Response withTotal(Long total) {
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

    

    public ListAppConfigsV2Response withConfigs(List<AppConfigInfo> configs) {
        this.configs = configs;
        return this;
    }

    
    public ListAppConfigsV2Response addConfigsItem(AppConfigInfo configsItem) {
        this.configs.add(configsItem);
        return this;
    }

    public ListAppConfigsV2Response withConfigs(Consumer<List<AppConfigInfo>> configsSetter) {
        if(this.configs == null ){
            this.configs = new ArrayList<>();
        }
        configsSetter.accept(this.configs);
        return this;
    }

    /**
     * 本次查询到的应用配置列表
     * @return configs
     */
    public List<AppConfigInfo> getConfigs() {
        return configs;
    }

    public void setConfigs(List<AppConfigInfo> configs) {
        this.configs = configs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppConfigsV2Response listAppConfigsV2Response = (ListAppConfigsV2Response) o;
        return Objects.equals(this.size, listAppConfigsV2Response.size) &&
            Objects.equals(this.total, listAppConfigsV2Response.total) &&
            Objects.equals(this.configs, listAppConfigsV2Response.configs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, total, configs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppConfigsV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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

