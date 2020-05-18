package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 函数策略配置。
 */
public class StrategyConfig  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="concurrency")
    
    private Integer concurrency;

    public StrategyConfig withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    


    /**
     * 0：函数被禁用;-1：函数被启用。
     * @return concurrency
     */
    public Integer getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StrategyConfig strategyConfig = (StrategyConfig) o;
        return Objects.equals(this.concurrency, strategyConfig.concurrency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(concurrency);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StrategyConfig {\n");
            sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
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

