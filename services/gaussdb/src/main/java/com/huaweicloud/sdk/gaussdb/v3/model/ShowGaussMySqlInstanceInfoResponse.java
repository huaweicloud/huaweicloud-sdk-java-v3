package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlInstanceInfoDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowGaussMySqlInstanceInfoResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance")
    

    private MysqlInstanceInfoDetail instance;

    public ShowGaussMySqlInstanceInfoResponse withInstance(MysqlInstanceInfoDetail instance) {
        this.instance = instance;
        return this;
    }

    public ShowGaussMySqlInstanceInfoResponse withInstance(Consumer<MysqlInstanceInfoDetail> instanceSetter) {
        if(this.instance == null ){
            this.instance = new MysqlInstanceInfoDetail();
            instanceSetter.accept(this.instance);
        }
        
        return this;
    }


    /**
     * Get instance
     * @return instance
     */
    public MysqlInstanceInfoDetail getInstance() {
        return instance;
    }

    public void setInstance(MysqlInstanceInfoDetail instance) {
        this.instance = instance;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGaussMySqlInstanceInfoResponse showGaussMySqlInstanceInfoResponse = (ShowGaussMySqlInstanceInfoResponse) o;
        return Objects.equals(this.instance, showGaussMySqlInstanceInfoResponse.instance);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instance);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGaussMySqlInstanceInfoResponse {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

