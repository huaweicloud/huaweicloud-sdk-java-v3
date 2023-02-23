package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlEngineVersionInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowGaussMySqlEngineVersionResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastores")
    
    private List<MysqlEngineVersionInfo> datastores = null;
    
    public ShowGaussMySqlEngineVersionResponse withDatastores(List<MysqlEngineVersionInfo> datastores) {
        this.datastores = datastores;
        return this;
    }

    
    public ShowGaussMySqlEngineVersionResponse addDatastoresItem(MysqlEngineVersionInfo datastoresItem) {
        if(this.datastores == null) {
            this.datastores = new ArrayList<>();
        }
        this.datastores.add(datastoresItem);
        return this;
    }

    public ShowGaussMySqlEngineVersionResponse withDatastores(Consumer<List<MysqlEngineVersionInfo>> datastoresSetter) {
        if(this.datastores == null) {
            this.datastores = new ArrayList<>();
        }
        datastoresSetter.accept(this.datastores);
        return this;
    }

    /**
     * 数据库版本信息列表
     * @return datastores
     */
    public List<MysqlEngineVersionInfo> getDatastores() {
        return datastores;
    }

    public void setDatastores(List<MysqlEngineVersionInfo> datastores) {
        this.datastores = datastores;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGaussMySqlEngineVersionResponse showGaussMySqlEngineVersionResponse = (ShowGaussMySqlEngineVersionResponse) o;
        return Objects.equals(this.datastores, showGaussMySqlEngineVersionResponse.datastores);
    }
    @Override
    public int hashCode() {
        return Objects.hash(datastores);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGaussMySqlEngineVersionResponse {\n");
        sb.append("    datastores: ").append(toIndentedString(datastores)).append("\n");
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

