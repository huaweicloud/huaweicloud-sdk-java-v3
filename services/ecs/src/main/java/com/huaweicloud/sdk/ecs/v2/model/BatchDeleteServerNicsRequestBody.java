package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.BatchDeleteServerNicOption;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class BatchDeleteServerNicsRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nics")
    
    private List<BatchDeleteServerNicOption> nics = new ArrayList<>();
    
    public BatchDeleteServerNicsRequestBody withNics(List<BatchDeleteServerNicOption> nics) {
        this.nics = nics;
        return this;
    }

    
    public BatchDeleteServerNicsRequestBody addNicsItem(BatchDeleteServerNicOption nicsItem) {
        this.nics.add(nicsItem);
        return this;
    }

    public BatchDeleteServerNicsRequestBody withNics(Consumer<List<BatchDeleteServerNicOption>> nicsSetter) {
        if(this.nics == null ){
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 需要删除的网卡列表信息。  说明： 主网卡是弹性云服务器上配置了路由规则的网卡，不可删除。
     * @return nics
     */
    public List<BatchDeleteServerNicOption> getNics() {
        return nics;
    }

    public void setNics(List<BatchDeleteServerNicOption> nics) {
        this.nics = nics;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteServerNicsRequestBody batchDeleteServerNicsRequestBody = (BatchDeleteServerNicsRequestBody) o;
        return Objects.equals(this.nics, batchDeleteServerNicsRequestBody.nics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteServerNicsRequestBody {\n");
            sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
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

