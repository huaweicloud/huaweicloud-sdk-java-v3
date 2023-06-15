package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CloseMysqlProxyRequestBody
 */
public class CloseMysqlProxyRequestBody  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy_ids")
    
    private List<String> proxyIds = null;
    
    public CloseMysqlProxyRequestBody withProxyIds(List<String> proxyIds) {
        this.proxyIds = proxyIds;
        return this;
    }

    
    public CloseMysqlProxyRequestBody addProxyIdsItem(String proxyIdsItem) {
        if(this.proxyIds == null) {
            this.proxyIds = new ArrayList<>();
        }
        this.proxyIds.add(proxyIdsItem);
        return this;
    }

    public CloseMysqlProxyRequestBody withProxyIds(Consumer<List<String>> proxyIdsSetter) {
        if(this.proxyIds == null) {
            this.proxyIds = new ArrayList<>();
        }
        proxyIdsSetter.accept(this.proxyIds);
        return this;
    }

    /**
     * 数据库代理ID列表。  如果实例只开启了一个代理，可不传该字段；如果实例开启了多个代理，则必须指定要关闭的代理。
     * @return proxyIds
     */
    public List<String> getProxyIds() {
        return proxyIds;
    }

    public void setProxyIds(List<String> proxyIds) {
        this.proxyIds = proxyIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloseMysqlProxyRequestBody closeMysqlProxyRequestBody = (CloseMysqlProxyRequestBody) o;
        return Objects.equals(this.proxyIds, closeMysqlProxyRequestBody.proxyIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(proxyIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloseMysqlProxyRequestBody {\n");
        sb.append("    proxyIds: ").append(toIndentedString(proxyIds)).append("\n");
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

